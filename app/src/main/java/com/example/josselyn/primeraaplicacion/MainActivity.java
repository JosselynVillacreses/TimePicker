package com.example.josselyn.primeraaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
    private TimePicker timePicker1;
    private TextView hora;
    private String format = "";
    private RadioGroup rg_hours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker1 = (TimePicker) findViewById(R.id.timePicker1);

        timePicker1.setIs24HourView(true);

        hora = (TextView)findViewById(R.id.hora);



    }

    public void save_hour(View view){

        int hour = timePicker1.getHour();
        int min = timePicker1.getMinute();


        if (hour == 0 && min == 0) {
            hora.setText(hour+"0:0"+min);

        } else if (hour <= 9){
            hora.setText("0"+hour+":"+min);
        } else if (min <= 9){
            hora.setText(hour+":0"+min);
        }else {
            hora.setText(hour+":"+min);
        }
        System.out.println(Integer.toString(min));



    }



}




