package com.example.ktvr.ktvr_team45;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShiftInProgressActivity extends AppCompatActivity {

    public Button btEndShift;
    public EditText etBusCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shift_in_progress);


        btEndShift = (Button) findViewById(R.id.btEndShift);
        btEndShift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ShiftInProgressActivity.this,DriverProfile.class);
                startActivity(i);
            }
        });
    }
}
