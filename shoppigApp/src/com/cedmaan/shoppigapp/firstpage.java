package com.cedmaan.shoppigapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class firstpage extends Activity{
	  protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.firstpage);
	        final Handler handler = new Handler();
	        handler.postDelayed(new Runnable() {
	          public void run() {
	        	Intent myIntent = new Intent(getBaseContext(), login.class);
	   	        startActivity(myIntent);
	          }
	        }, 2000);
	       
	  }
}
