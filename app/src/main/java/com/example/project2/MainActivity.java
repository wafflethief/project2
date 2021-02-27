package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button launchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // when click button, call launch()
        // attach OnClickListener to the button
        launchButton = (Button) findViewById(R.id.button1);
        launchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                beginActivity();
            }
        });
    }

    private void beginActivity(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}