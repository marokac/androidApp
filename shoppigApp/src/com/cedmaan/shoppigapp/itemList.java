package com.cedmaan.shoppigapp;

import android.app.ListActivity;
import android.os.Bundle;

public class itemList extends ListActivity {
	 public void onCreate(Bundle icicle) {
	        super.onCreate(icicle);
	        Item[] a = new Item[] { new Item("makarona","makarona","R25.00"), 
	        		new Item("milk","milk","R30.00"),new Item("chicken","chicken","R40.00"),new Item("bread","bread","R12.00")};
	        MainActivity adapter = new MainActivity(this, a);
	        setListAdapter(adapter);
	    }

}
