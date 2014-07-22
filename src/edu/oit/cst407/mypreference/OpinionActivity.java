package edu.oit.cst407.mypreference;

import android.app.Activity;

// Didn't need this after all - why does this happen automatically?  
// I thought I would need to check for the state change...

//import android.content.res.Configuration;

import android.os.Bundle;
import android.widget.TextView;

public class OpinionActivity extends Activity{
		
	@Override
	public void onCreate(Bundle savedInstanceState){
			
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_opinion);
		
		TextView orientationMessage = (TextView)findViewById(R.id.orientation_message);
		
		if (this.getResources().getConfiguration().orientation == 1) {
			orientationMessage.setText(this.getString(R.string.orientation_portrait));
			}
		
		else {
			orientationMessage.setText(this.getString(R.string.orientation_landscape));
			}		
		}

	// I thought I would need this code to get it to detect orientation change.  Why not?
	
	/*
	@Override
	public void onConfigurationChanged(Configuration newConfig){		
		
		super.onConfigurationChanged(newConfig);
		
		setContentView(R.layout.activity_opinion);
		
		TextView orientationMessage = (TextView)findViewById(R.id.orientation_message);		
		
		if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
			orientationMessage.setText(this.getString(R.string.orientation_landscape));
			}
		
		else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
			orientationMessage.setText(this.getString(R.string.orientation_portrait));
			}
	} */
}
