package com.example.sky.afinal.view.Login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sky.afinal.R;
import com.example.sky.afinal.control.Function;
import com.example.sky.afinal.view.news.InformationActivity;

public class LoginActivity extends AppCompatActivity {
EditText edtUseName,editPassword;
 TextView txtForgot;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUseName = (EditText) findViewById(R.id.nameUser_edittText);
        editPassword = (EditText) findViewById(R.id.passUser_edittText);
       txtForgot= (TextView) findViewById(R.id.Forgot_textview);
        btnLogin = (Button) findViewById(R.id.button_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Function.makeLog(LoginActivity.this,"test Login");
                Function.changeActivity(LoginActivity.this,InformationActivity.class);
            }
        });
    }
    public void forgotPass(View view){
//        Function.makeToast(LoginActivity.this,"HELLO ABC");
//        Intent intent = new Intent(LoginActivity.this,ForgotPass.class);
//        startActivity(intent);
        Log.e("ÁDASDAS","TEST ABABABABAA");
        Function.makeLog(LoginActivity.this,"test forgot pass");
        Function.changeActivity(LoginActivity.this,ForgotPass.class);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
