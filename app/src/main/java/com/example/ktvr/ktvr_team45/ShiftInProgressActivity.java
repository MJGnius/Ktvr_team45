package com.example.ktvr.ktvr_team45;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ShiftInProgressActivity extends AppCompatActivity {

    public Button btEndShift;
    public EditText etBusCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shift_in_progress);
    }
}
