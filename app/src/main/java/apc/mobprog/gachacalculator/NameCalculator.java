package apc.mobprog.gachacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class NameCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_calculator);

        final Random myRandom = new Random();

        Button buttonGenerate = (Button) findViewById(R.id.generate1);
        final TextView textView = (TextView) findViewById(R.id.textview1);

        buttonGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf(myRandom.nextInt(100)));
            }
        });

    }
}