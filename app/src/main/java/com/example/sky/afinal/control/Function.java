package com.example.sky.afinal.control;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Sky on 17/12/2016.
 */

public class Function extends AppCompatActivity {
    private static final String USERNAME_KEY = "username";
    private static final String PASSWORD_KEY = "password";
    public static void makeToast(Context context,String message){
//        Context context = MyApplication.getContext();
        Toast.makeText(context,context.getClass().getName()+ message,Toast.LENGTH_LONG).show();
    }
    public static void changeActivity(Context context,Class that){
        context.startActivity(new Intent(context, that));
    }
    public static void makeLog(Context context, String message){
        Log.e(context.getClass().getName(),message);
    }

    public static SharedPreferences getSharePreferences() {
        Context context = MyApplication.getContext();
        SharedPreferences sharedpreferences = context.
                getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        return sharedpreferences;
    }

    public static void saveUsername(String username) {
        SharedPreferences sharedPreferences = getSharePreferences();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(USERNAME_KEY, username);
        editor.commit();
    }
    public static String getUsername() {
        SharedPreferences sharedPreferences = getSharePreferences();
        String username = sharedPreferences.getString(USERNAME_KEY, "");
        return username;
    }

    public static void savePassword(String password) {
        SharedPreferences sharedPreferences = getSharePreferences();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PASSWORD_KEY, password);
        editor.commit();
    }

    public static String getPassword() {
        SharedPreferences sharedPreferences = getSharePreferences();
        String password = sharedPreferences.getString(PASSWORD_KEY, "");
        return password;
    }



}
