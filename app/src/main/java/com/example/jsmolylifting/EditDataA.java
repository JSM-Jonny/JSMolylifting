package com.example.jsmolylifting;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditDataA extends AppCompatActivity {
    private Button btnSave;
    private Button btnDelete;
    private EditText editable_item;

    DatabaseHelper mDatabaseHelper;

    private String selectedName;
    private int selectedID;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editdata);
        btnSave = findViewById(R.id.btnSave);
        btnDelete = findViewById(R.id.btnDelete);
        editable_item = findViewById(R.id.editText);
        mDatabaseHelper = new DatabaseHelper(this);

        // get intent extra from the activity
        Intent in = getIntent();

        selectedID = in.getIntExtra("id", -1);

        selectedName = in.getStringExtra("name");

        editable_item.setText(selectedName);

        btnSave.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String item = editable_item.getText().toString();
                if(item.equals("")){
                    mDatabaseHelper.updateName(item, selectedID, selectedName);
                }else{
                    toastMessage("Please enter a date");
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                
            }
        });
    }

    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}
