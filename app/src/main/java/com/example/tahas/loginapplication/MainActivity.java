package com.example.tahas.loginapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editText2);
        editText1=(EditText)findViewById(R.id.editText);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = editText.getText().toString();
                String password = editText1.getText().toString();

                if (username.equals(password)){

                    Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                    intent.putExtra("editText",username);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(getApplicationContext(),"Enter Correct username and password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
