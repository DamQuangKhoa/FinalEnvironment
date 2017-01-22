package com.example.sky.afinal.view.map_main;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.sky.afinal.R;
import com.example.sky.afinal.control.Function;
import com.example.sky.afinal.view.Login.ForgotPass;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener{
Button btnPost,btnPerson,btnNews,btnInf;
    FloatingActionButton floatingActionButton1;
    Function fc = new Function();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


//        btnPost = (Button) findViewById(R.id.btnPost);
//        btnInf = (Button) findViewById(R.id.btnMenu);
//        btnPerson = (Button) findViewById(R.id.btnPerson);
//        btnNews = (Button) findViewById(R.id.btnNew);
//        btnFloat = (FloatingActionButton) findViewById(R.id.myFAB);
//        btnFloat.setOnClickListener(this);
//        btnPost.setOnClickListener(this);
//        floatingActionButton1 = (FloatingActionButton) findViewById(R.id.fab1);
//        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item2);
//        floatingActionButton3 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item3);

    }

    @Override
    public void onClick(View view) {
        if(view == floatingActionButton1){
            Intent intent = new Intent(this,ForgotPass.class);
//            fc.changeActivity(this,);
        }
        if(view == btnPost){
//           changeActi();
        }
    }

}
