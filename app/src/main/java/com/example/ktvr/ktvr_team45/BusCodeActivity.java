package com.example.ktvr.ktvr_team45;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BusCodeActivity extends AppCompatActivity {
    public Button btStartShift;
    public EditText etBusCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_code);

        btStartShift = (Button)findViewById(R.id.btStartShift);
        etBusCode = (EditText)findViewById(R.id.etBusCode);
       btStartShift.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(etBusCode.getText().toString().equals("12345")){
                   Intent i = new Intent(BusCodeActivity.this,ShiftInProgressActivity.class);
                   startActivity(i);
               }else{
                   Toast.makeText(getApplicationContext(),"Invalid Bus Code, Please Re-try", Toast.LENGTH_LONG).show();
               }
           }
       });
    }
}
