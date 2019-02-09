package com.example.akshay.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spin;
    Button butt;

    String[] cars = {"Select Car's","Aston Martin","Audi","BAIC","Bentley","BMW","BYD","Chery","Chevrolet","Chrysler","Dodge","FAW","Ferrari","Ford","FOTON","GAZ","Greely","Great Wall","Haima","Honda","Hyundai","Isuzu","JAC","Jaguar","Jeep","JMC","Kia","King Long","Lamborghini","Land Rover","Lexus","Lifan","Lotus","Mahindra","Maserati","Mazda","Mercedes-Benz","MG","Mini","Mitsubishi","Morgan","Nissan","Peugeot","porsche","Rolls-Royal","SsangYong","Subaru","Suzuki","TATA","Toyota","Volkswagen","Volvo"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin = findViewById(R.id.spinner_id);
        butt = findViewById(R.id.button_id);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,cars);
        spin.setAdapter(adapter);

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spin.getSelectedItem().toString().equals("Select Car's"))
                    Toast.makeText(MainActivity.this,"Invalid Selection",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this," "+spin.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}
