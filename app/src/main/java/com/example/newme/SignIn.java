package com.example.newme;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.EditText;

import java.util.Iterator;

public class SignIn extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        EditText pin = (EditText)findViewById(R.id.sign_in);
        Intent intent = new Intent(SignIn.this,ProfilePage.class);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        //TODO
        if(pin.toString().equals(sharedPref("Pin"))){

        }

        for (Iterator<User> it = User.userSet.iterator(); it.hasNext(); ) {
            User u = it.next();
            if(u.getPin().equals(pin.toString())){
                Log.d("pin",u.getPin());
                SignIn.this.startActivity(intent);
            }else{
                break;
            }
        }


    }
}
