package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button submitButton;
    private Button launchButton;
    EditText myEdit;
    TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // when click button, call launch()
        // attach OnClickListener to the button

        submitButton = (Button) findViewById(R.id.button1);
        launchButton = (Button) findViewById(R.id.button2);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                myEdit = (EditText)findViewById(R.id.edit_text);
                myText = (TextView)findViewById(R.id.textView1);
                myText.setText("You typed " + myEdit.getText().toString());
            }
        });
        launchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                beginActivity();
            }
        });
    }

    private void beginActivity(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}