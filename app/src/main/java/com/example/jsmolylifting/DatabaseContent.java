package com.example.jsmolylifting;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DatabaseContent extends AppCompatActivity {

    private static final String TAG = "DatabaseContent";

    DatabaseHelper mDatabaseHelper;

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_content);
        mListView = findViewById(R.id.listView);
        mDatabaseHelper = new DatabaseHelper(this);

        populateListView();
    }

    private void populateListView() {
        Log.d(TAG, "showing all database content");

        // get teh data and add to the list
        Cursor data = mDatabaseHelper.getData();
        ArrayList<String> listData = new ArrayList<>();
        while(data.moveToNext()){
            //get value from column and add to arraylist
            listData.add(data.getString(1));
        }
        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listData);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = parent.getItemAtPosition(position).toString();
                Log.d(TAG, "Test: name clicked " + name);

                Cursor data = mDatabaseHelper.getItemID(name);
                // this int ensures something is returned when a search is done
                int itemID = -1;
                while(data.moveToNext()){
                    itemID = data.getInt(0);
                }
                if(itemID > -1){
                    Log.d(TAG, "The ID is: " + itemID);
                    Intent in = new Intent(DatabaseContent.this, EditDataA.class);
                    in.putExtra("id",itemID);
                    in.putExtra("name", name);
                    startActivity(in);
                } else {
                    toastMessage("No name for that ID");
                }
            }
        });
    }

    private void toastMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
