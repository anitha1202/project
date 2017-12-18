package com.example.vijay.anitha;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private EditText user;
    private  EditText pass;
    private Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        user=(EditText)findViewById(R.id.editText5);
        pass=(EditText)findViewById(R.id.editText6);
        log=(Button)findViewById(R.id.button5);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (user.getText().toString().equals("Anitha")|| pass.getText().toString().equals("Anitha")) {
                    //  boolean isExist=databaseHelper.checkUserExist(user.getText().toString(),pass.getText().toString());
                    //if (isExist){
                    Intent i = new Intent(Main3Activity.this, Main5Activity.class);
                    //i.putExtra("Name",user.getText().toString());
                    startActivity(i);
                }
                else if(user.getText().toString().equals("Admin")|| pass.getText().toString().equals("Admin"))
                {
                    Intent i = new Intent(Main3Activity.this, Main4Activity.class);
                    //i.putExtra("Name",user.getText().toString());
                    startActivity(i);
                }
                else {

                    pass.setText(null);
                    Toast.makeText(Main3Activity.this,"login fails",Toast.LENGTH_LONG).show();;
                }



            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
