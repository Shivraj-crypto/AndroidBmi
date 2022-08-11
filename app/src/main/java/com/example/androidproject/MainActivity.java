package com.example.androidproject;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.*;
public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button add;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 =  (EditText) findViewById(R.id.etNum1);
        num2 =  (EditText) findViewById(R.id.etNum2);
        add =  (Button) findViewById(R.id.btn);
        result =  (TextView) findViewById(R.id.tvAnswer);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1 = Integer.parseInt(num1.getText().toString());
                float number2 = Integer.parseInt(num2.getText().toString());
                float sum1 = (float) (number2 * 0.01);
                float sum = number1 / (sum1 * sum1);
                if(sum < 18.5){
                    int a = (int) sum;
                    result.setText("Thinness, BMI : " + String.valueOf(a));
                }else if (sum > 18.5 && sum < 25){
                    int a = (int) sum;
                    result.setText("Normal, BMI : " + String.valueOf(a));
                }else if (sum > 25){
                    int a = (int) sum;
                    result.setText("Overweight, BMI : " + String.valueOf(a));
                }
            }
        });
    }
}