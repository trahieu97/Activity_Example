package com.example.admin.activity_example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TITLE = "title";
    public static final String DESCRIPTION = "description";
    public static final String BUNDLE = "bundle";
    private Button btnSend;
    private EditText txtTitle;
    private EditText txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSend = (Button) findViewById(R.id.btnSend);
        txtTitle = (EditText) findViewById(R.id.txtTitle);
        txtDescription = (EditText) findViewById(R.id.txtDescription);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityB.class);
                Bundle bundle = new Bundle();
                bundle.putString(TITLE,txtTitle.getText().toString());
                bundle.putString(DESCRIPTION, txtDescription.getText().toString());
                intent.putExtra(BUNDLE, bundle);
                startActivity(intent);
            }
        });
    }
}
