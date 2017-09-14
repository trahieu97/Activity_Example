package com.example.admin.activity_example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    private TextView txtTitle, txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        txtDescription = (TextView) findViewById(R.id.txtDescrip);
        txtTitle = (TextView) findViewById(R.id.txtTite);
        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getBundleExtra(MainActivity.BUNDLE);
            if (bundle != null) {
                txtTitle.setText(bundle.getString(MainActivity.TITLE));
                txtDescription.setText(bundle.getString(MainActivity.DESCRIPTION));
            } else {
                txtTitle.setText("No data");
                txtDescription.setText("No data");
            }
        }
        else
        {
            txtTitle.setText("No data");
            txtDescription.setText("No data");
        }
    }
}
