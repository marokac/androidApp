package com.cedmaan.shoppigapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class login extends Activity{
	  protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.login);
	        final EditText usename = (EditText) findViewById(R.id.editText1);
	        final EditText pass = (EditText) findViewById(R.id.editText2);
	        Button button=(Button)findViewById(R.id.button1);
	        
	        button.setOnClickListener(
	                new View.OnClickListener()
	                {
	                    public void onClick(View view)
	                    {
	                    	if("admin".equalsIgnoreCase(usename.getText().toString().trim())){
	                    		 if("12345".equalsIgnoreCase(pass.getText().toString().trim()))	{
	                    			 Toast.makeText(getApplicationContext(), "Login success", Toast.LENGTH_SHORT).show();
	                    			 Intent myIntent = new Intent(getBaseContext(), itemList.class);
	                 	   	         startActivity(myIntent); 
	                    		 }
	                    		 else{
	                    			 dilogmodel("Password incorrect");
	                    		 }
	                    	}else{
	                    		 dilogmodel("Incorrect username");
	                    	}
	                    	
	                    }
	                });
	        
	        
	  }
	  public void dilogmodel(String massage){
			 AlertDialog alertDialog = new AlertDialog.Builder(login.this).create();
			 alertDialog.setTitle("Eroor");
			 alertDialog.setMessage(massage);
			 alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
			     public void onClick(DialogInterface dialog, int which) {
			    	 dialog.dismiss();
			        
			     }
			 });

			 alertDialog.show(); 
	  }
	 
}
