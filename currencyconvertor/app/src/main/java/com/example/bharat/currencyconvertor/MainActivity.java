package com.example.bharat.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertor(View view) {

        EditText baht1 = (EditText) findViewById(R.id.amount);

        if (baht1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        } else {


            double baht2 = Double.parseDouble(baht1.getText().toString());
            double rupees = baht2 * 2.15;
            Toast.makeText(this, (int) baht2 + " Baht" + " = Rs. " + rupees, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
