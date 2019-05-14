package com.example.jsmolylifting;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WeightCat extends Fragment {
    View MyView;

    DatabaseHelper mDatabaseHelper;
    private Button btnAdd, btnViewData;
    private EditText editText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MyView = inflater.inflate(R.layout.weightpage, container, false);

        editText = MyView.findViewById(R.id.editText);
        btnAdd = MyView.findViewById(R.id.btnAdd);
        btnViewData = MyView.findViewById(R.id.btnView);
        mDatabaseHelper = new DatabaseHelper(getContext());

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String newEntry = editText.getText().toString();
                if (editText.length() != 0){
                    AddData(newEntry);
                    editText.setText("");
                }
            }
        });

        return MyView;
    }

    public void AddData(String newEntry){
        boolean insertData = mDatabaseHelper.addData(newEntry);

        if(insertData){
            toastMessage("Data successfully inserted");
        } else {
            toastMessage("Something went wrong");
        }
    }

    private void toastMessage(String message){
        Toast.makeText(getContext(),message, Toast.LENGTH_SHORT).show();
    }

}
