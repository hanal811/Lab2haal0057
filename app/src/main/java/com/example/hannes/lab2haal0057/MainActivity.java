package com.example.hannes.lab2haal0057;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button1);
        final TextView text1 = (TextView) findViewById(R.id.textView1);
        text1.setText("När man klickar på knappen ska denna text synas.");
        text1.setVisibility(View.INVISIBLE);
        b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(text1.getVisibility()==View.INVISIBLE)
                text1.setVisibility(View.VISIBLE);
            else text1.setVisibility(View.INVISIBLE);
        }
        });

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setVisibility(View.INVISIBLE);
                Intent intent= new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);

            }
        });

        TextView text2 = (TextView) findViewById(R.id.textView2);
        text2.setText("Öppna ny Activity med EN bild.");

        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setVisibility(View.INVISIBLE);
                Intent intent= new Intent(MainActivity.this, Activity3.class);
                startActivity(intent);

            }
        });

        TextView text3 = (TextView) findViewById(R.id.textView3);
        text3.setText("Öppna ny Activity med gridview.");
    }
}
