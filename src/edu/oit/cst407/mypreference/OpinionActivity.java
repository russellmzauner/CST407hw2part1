package edu.oit.cst407.mypreference;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class OpinionActivity extends Activity{
	
	

	
	@Override
	public void onCreate(Bundle savedInstanceState){
	
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_opinion);
		
		TextView orientationMessage = (TextView)findViewById(R.id.orientation_message);
		
		
	if (this.getResources().getConfiguration().orientation == 1){
			orientationMessage.setText(this.getString(R.string.orientation_portrait));
			}
		else {
			orientationMessage.setText(this.getString(R.string.orientation_landscape));
			}
		
		
		//setContentView(R.layout.activity_opinion);
		
		//TextView orientationMessage = (TextView)findViewById(R.id.orientation_message);
		
		// orientationMessage.setText(this.getString(R.string.orientation_text));
		
	}
	
	
	
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
