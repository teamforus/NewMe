package com.example.newme;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class Login extends MainActivity {
    //https://developers.google.com/identity/sign-in/android/sign-in
    /**
     * This class will handle signing into the database.
     */
    String name = "Bobby";
    Login(){
        System.out.println("something");
    }

    public static boolean signInCheck = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Button button = findViewById(R.id.signIn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Login.this.onClick(v);
                //have user enter user data and then query bigChain to check if this person is real...
                //enter username and pin...
                // Code here executes on main thread after user presses button
                //after button is clicked then run some code to see if a person has an account.
            }
        });


    }

    @Override
    protected void onStart() {

        // Check for existing Google Sign In account, if the user is already signed      in
        // the GoogleSignInAccount will be non-null.
        super.onStart();
        signIn();
        if(Login.signInCheck){

        }
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.signIn:
                signIn();
            case R.id.signout:
                signOut();
                break;
        }
    }

    private void signIn(){
        System.out.println("get user sign in information");
        //get user information from user class?
        //Query bigchainDB.
    }

    private boolean signOut(){
        //once signed out, user will have to manually sign in again
        //return true for signout
        Login.signInCheck = true;
        return true;

    }










}
