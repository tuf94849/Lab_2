package com.example.signupform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btnSubmit);
        //btn.setOnClickListener(btnListener);

        final TextView txtName = findViewById(R.id.txtName);
        final TextView txtEmail = findViewById(R.id.txtEmail);
        final TextView txtPassword = findViewById(R.id.txtPassword);
        final TextView txtPasswordConfirm = findViewById((R.id.txtPasswordConfirm));

        final String name = txtName.toString();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!txtName.getText().toString().matches("") && !txtEmail.getText().toString().matches("")
                        && !txtPassword.getText().toString().matches("") && !txtPasswordConfirm.getText().toString().matches("")){


                    if(txtPassword.getText().toString().matches(txtPasswordConfirm.getText().toString())){
                        Toast.makeText(getApplicationContext(),"Welcome " + txtName.getText().toString() + ", to the Sign Up Form app.",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Your passwords do not match",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"You must fill out all fields before creating the account",Toast.LENGTH_SHORT).show();
                }


            }
        });



    }

}
