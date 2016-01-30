package com.example.mbella.explicitintentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText= (EditText)this.findViewById(R.id.editText);
    }

    public void sendMessage (View view){
        Toast.makeText(this, editText.getText().toString(), Toast.LENGTH_LONG).show();
    }
}
