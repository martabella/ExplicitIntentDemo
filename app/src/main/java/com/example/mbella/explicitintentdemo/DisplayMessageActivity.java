package com.example.mbella.explicitintentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

   private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        textView = (TextView)findViewById(R.id.textView);
        Intent intent = this.getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_DATA);
        textView.setText(message);

    }
}
