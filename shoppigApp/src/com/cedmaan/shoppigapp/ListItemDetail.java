package com.cedmaan.shoppigapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListItemDetail extends Activity {
	
	
	  protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.list_item_details);
	        TextView itemname = (TextView) findViewById(R.id.textView2);
	        TextView priceName = (TextView) findViewById(R.id.textView1);
	        ImageView imageView = (ImageView) findViewById(R.id.imageView10);
	        Bundle bundle = getIntent().getExtras();
	    	String name =bundle.getString("name");
	    	String price=bundle.getString("price");
	        itemname.setText(name);
	        priceName.setText(price);
	        setImage(bundle.getString("imageName"),imageView);
	   
	    }
	  public void setImage(String imageName,ImageView imageView){
		    
			if(imageName.equalsIgnoreCase("makarona")){
		    	   imageView.setImageResource(R.drawable.makarona); 
		       }
			else if(imageName.equalsIgnoreCase("milk")){
		    	   imageView.setImageResource(R.drawable.milk); 
		       }
	            
		       else if(imageName.equalsIgnoreCase("chicken")){
		    	   imageView.setImageResource(R.drawable.chicken); 
	 	       }
		       else if(imageName.equalsIgnoreCase("bread")){
		    	   imageView.setImageResource(R.drawable.bread); 
	 	       }
		       else{
		    	   imageView.setImageResource(R.drawable.chicken); 
		       }
	  }
}
