package com.android.prabesh;

import android.app.*;
import android.content.*;
import android.os.*;

public class successActivity extends Activity
 {
	private sharedPreferenceConfig preferenceconfig;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success);
		
		preferenceconfig=new sharedPreferenceConfig(getApplicationContext());
    }
	
	public void logoutUser(){
		preferenceconfig.writeLoginStatus(false);
		startActivity(new Intent(this,MainActivity.class));
		finish();
	}}


