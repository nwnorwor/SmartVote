package com.example.smartvote;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button check = findViewById(R.id.checkButton);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText SSID = findViewById(R.id.SSID);

                String text = null;

                if(SSID.length() == 13){
                    if(SSID.equals("1111111111111") || SSID.equals("2222222222222")){
                        text = "คุณเป็นผู้มีสิทธิเลือกตั้ง";
                    } else {
                        text = "คุณไม่มีสิทธิเลือกตั้ง";
                    }

                } else {
                    String msg =  "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก";
                    Toast t = Toast.makeText(Main2Activity.this , msg,Toast.LENGTH_SHORT);
                    t.show();
                }

                AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                dialog.setMessage(text);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setCancelable(false);
                dialog.show();



            }
        });

    }
}
