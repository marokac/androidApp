package com.cedmaan.shoppigapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ArrayAdapter<Item> {
	
	 private final Context context;
	    private final Item[] values;
	public MainActivity(Context context, Item[] values) {
        super(context, R.layout.activity_main, values);
        this.context = context;
        this.values = values;
    }
	 @Override
	    public View getView(final int position, View convertView, ViewGroup parent) {
	        LayoutInflater inflater = (LayoutInflater) context
	                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	        View rowView = inflater.inflate(R.layout.activity_main, parent, false);
	        TextView textView = (TextView) rowView.findViewById(R.id.label);
	        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
	        textView.setText(values[position].getName());
	        if(values[position].getImagename()=="makarona"){
		    	   imageView.setImageResource(R.drawable.makarona); 
		       }
		       else if(values[position].getImagename()=="milk"){
		    	   imageView.setImageResource(R.drawable.milk); 
		       }
	            
		       else if(values[position].getImagename()=="chicken"){
		    	   imageView.setImageResource(R.drawable.chicken); 
	 	       }
		       else if(values[position].getImagename()=="bread"){
		    	   imageView.setImageResource(R.drawable.bread); 
	 	       }
		      
	            else{
	            	imageView.setImageResource(R.drawable.chicken);
	            }
	        
	        rowView.setOnClickListener(new OnClickListener() {    
	            public void onClick(View v) {  
	            	Intent myIntent = new Intent(context, ListItemDetail.class);
	     	        myIntent.putExtra("name", values[position].getName());
	     	        myIntent.putExtra("price",values[position].getPrice());
	     	        myIntent.putExtra("imageName",values[position].getImagename());
	     	        context.startActivity(myIntent);
	            }  
	        });
	        return rowView;
	    }
    
}
