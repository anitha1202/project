package com.example.vijay.face;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText Id;
    private EditText Name;
    private EditText Pass;
    private EditText Email;
    private EditText Number;
    private Button Register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Id=(EditText)findViewById(R.id.editText8);
        Name=(EditText)findViewById(R.id.editText3);
        Pass=(EditText)findViewById(R.id.editText5);
        Email=(EditText)findViewById(R.id.editText7);
        Number=(EditText)findViewById(R.id.editText4);
        Register=(Button)findViewById(R.id.button3);
      //  Register.setOnClickListener(this);



     /*   @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.user, menu);
            return true;
        }

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            if(v == b){
                if( id.getText().toString().trim().length()==0 ||
                        pwd.getText().toString().trim().length()==0 ||
                        mail.getText().toString().trim().length()==0 ||
                        no.getText().toString().trim().length()==0 )
                {
                    Toast.makeText(User.this,"Enter valid data", Toast.LENGTH_LONG).show();
                    return;
                }
                else if(no.getText().toString().trim().length()!=10){
                    Toast.makeText(User.this,"Enter valid MOBILE NUMBER", Toast.LENGTH_LONG).show();

                }
            }

        }
    public void clearText()
    {
        Id.setText("");
        Name.setText("");
        Pass.setText("");
        Number.setText("");
        Email.setText("");


    }

}*/



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
