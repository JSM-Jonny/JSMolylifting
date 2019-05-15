package com.example.jsmolylifting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SnatchworkoutActivity extends AppCompatActivity {
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snatchworkout);
    }


    // a method that uses a gesture to only do something if the user does that specific gesture
    @Override
    public void onBackPressed() {
        // this checks if the user clicks twice within 2 seconds and only allows the user to exit the app if it is
        // within this time period
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        } else {
            // if the back button is not pressed fast enough this message is displayed to let the user know they must
            // press the button again to leave
            Toast.makeText(getBaseContext(), "Please press back again to exit the page.", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }
}
