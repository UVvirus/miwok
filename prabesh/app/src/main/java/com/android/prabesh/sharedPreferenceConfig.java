package com.android.prabesh;
import android.content.*;

public class sharedPreferenceConfig
{
	public SharedPreferences SharedPreference;
	private Context context;
	
	public sharedPreferenceConfig(Context context){
		this.context=context;
		SharedPreference=context.getSharedPreferences(context.getResources().getString(R.string.loginPreference),Context.MODE_PRIVATE);
	}
	
	public void writeLoginStatus(boolean status){
		SharedPreferences.Editor editor=SharedPreference.edit();
		editor.putBoolean(context.getResources().getString(R.string.loginState),status);
		editor.commit();
	}
	
	public boolean readLoginStatus(){
		
		boolean status=false;
		status=SharedPreference.getBoolean(context.getResources().getString(R.string.login),false);
		return status;
	}
	
}
