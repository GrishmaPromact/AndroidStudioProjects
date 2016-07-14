package com.example.grishma.temperature_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(EditText)findViewById(R.id.inputValue);
        Button button = (Button)findViewById(R.id.button1);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button1:
                RadioButton celsiusButton=(RadioButton)findViewById(R.id.radio0);
                RadioButton fahrenheitButton=(RadioButton)findViewById(R.id.radio1);
                if(text.getText().length()==0)
                {
                    Toast.makeText(this,"Plz enter a valid number",Toast.LENGTH_LONG).show();
                    return;
                }
                float inputValue=Float.parseFloat(text.getText().toString());
                if(celsiusButton.isChecked())
                {
                    text.setText(String.valueOf(ConverterUtil.convertFahrenheitToCelsius(inputValue)));
                    celsiusButton.setChecked(false);
                    fahrenheitButton.setChecked(true);
                }
                else
                {
                    text.setText(String.valueOf(ConverterUtil.convertCelsiusToFahrenheit(inputValue)));
                    celsiusButton.setChecked(true);
                    fahrenheitButton.setChecked(false);
                }
                break;
        }
    }



   /* public void onClick(View view)
    {

    }*/
}
