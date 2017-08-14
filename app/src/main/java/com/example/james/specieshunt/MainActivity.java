package com.example.james.specieshunt;
import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonFW = (Button) findViewById(R.id.buttonFW);
        Button buttonSW = (Button) findViewById(R.id.buttonSW);
        TextView scoreFW = (TextView) findViewById(R.id.scoreFW);
        TextView scoreSW = (TextView) findViewById(R.id.scoreSW);

        buttonFW.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        buttonSW.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
