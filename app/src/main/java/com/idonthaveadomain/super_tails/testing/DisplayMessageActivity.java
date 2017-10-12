package com.idonthaveadomain.super_tails.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Calendar.EXTRA_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.yourTextView);
        textView.setText(getString(R.string.your_text) + " " + message);
    }
}
