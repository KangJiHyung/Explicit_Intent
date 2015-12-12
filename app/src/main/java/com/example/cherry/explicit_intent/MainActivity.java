package com.example.cherry.explicit_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) findViewById(R.id.bt_1);

    }

    public void onClick(View v) {
        // create intent instance
        intent = new Intent(this, NextActivity.class);
        intent.putExtra("name", "kookmin");
        startActivity(intent);
    }
}
