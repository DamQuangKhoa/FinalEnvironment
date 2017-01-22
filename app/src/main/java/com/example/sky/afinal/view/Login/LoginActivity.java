package com.example.sky.afinal.view.Login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sky.afinal.R;
import com.example.sky.afinal.control.Function;

public class LoginActivity extends AppCompatActivity {
EditText edtUseName,editPassword;
 TextView txtForgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUseName = (EditText) findViewById(R.id.nameUser_edittText);
        editPassword = (EditText) findViewById(R.id.passUser_edittText);
       txtForgot= (TextView) findViewById(R.id.Forgot_textview);
    }
    public void forgotPass(View view){
//        Function.makeToast(LoginActivity.this,"HELLO ABC");
//        Intent intent = new Intent(LoginActivity.this,ForgotPass.class);
//        startActivity(intent);
        Function.makeLog(LoginActivity.this,"test forgot pass");
        Function.changeActivity(LoginActivity.this,ForgotPass.class);
    }
}
