package com.example.android.ui;

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


        Button subscriptions = (Button) findViewById(R.id.manage_subscriptions);


        subscriptions.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent subscriptionsIntent = new Intent(MainActivity.this, manageSubscriptions.class);
                startActivity(subscriptionsIntent);
            }
        });
    }
}
