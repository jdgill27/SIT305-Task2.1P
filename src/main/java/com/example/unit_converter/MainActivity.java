package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton meterbtn;
    ImageButton weightbtn;
    ImageButton temperaturebtn;
    EditText to_convert_var;
    TextView conversion1;
    TextView conversion2;
    TextView conversion3;
    Spinner spinner_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_list = (Spinner) findViewById(R.id.spinner_list);

        meterbtn = findViewById(R.id.meterbtn);
        weightbtn = findViewById(R.id.weightbtn);
        temperaturebtn = findViewById(R.id.temperaturebtn);

        conversion1 = findViewById(R.id.conversion1);
        conversion2 = findViewById(R.id.conversion2);
        conversion3 = findViewById(R.id.conversion3);

        to_convert_var = findViewById(R.id.to_convert_var);

    }

    public void meterclick(View view) {
        if (spinner_list.getSelectedItem().toString().equals("Meter") )
        {
            float input = Float.parseFloat(to_convert_var.getText().toString());

            conversion1.setText((String.format("%.2f", (100*input)))+ " " + "Centimetre");
            conversion2.setText((String.format("%.2f", (3.28*input)))+ " " + "Foot");
            conversion3.setText((String.format("%.2f", (39.3701*input)))+ " " + "Inch");
        }

        else
        {
            conversion1.setText("-----");
            conversion2.setText("-----");
            conversion3.setText("-----");

            Toast.makeText( MainActivity.this ,  "Please select the correct conversion icon!",Toast.LENGTH_LONG).show();

        }
    }

    public void weightclick(View view) {
        if (spinner_list.getSelectedItem().toString().equals("Kilogram") )
        {
            float input = Float.parseFloat(to_convert_var.getText().toString());

            conversion1.setText((String.format("%.2f", (1000*input)))+ " " + "Gram");
            conversion2.setText((String.format("%.2f", (35.274*input)))+ " " + "Ounce(Oz)");
            conversion3.setText((String.format("%.2f", (2.20462*input)))+ " " + "Pound(lb)");
        }

        else
        {
            conversion1.setText("-----");
            conversion2.setText("-----");
            conversion3.setText("-----");

            Toast.makeText( MainActivity.this ,  "Please select the correct conversion icon!",Toast.LENGTH_LONG).show();

        }
    }

    public void temperatureclick(View view) {
        if (spinner_list.getSelectedItem().toString().equals("Celsius") )
        {
            float input = Float.parseFloat(to_convert_var.getText().toString());

            conversion1.setText((String.format("%.2f", ((input*9/5)+32)))+ " " + "Fahrenheit");
            conversion2.setText((String.format("%.2f", (input + 273.15)))+ " " + "Kelvin");
            conversion3.setText(" ");
        }

        else
        {
            conversion1.setText("-----");
            conversion2.setText("-----");
            conversion3.setText("-----");

            Toast.makeText( MainActivity.this ,  "Please select the correct conversion icon!",Toast.LENGTH_LONG).show();

        }
    }
}