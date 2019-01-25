package com.android.prabesh;

import android.app.*;
import android.content.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	private sharedPreferenceConfig preferenceconfig;
	private EditText userName,userPassword;

	private Context Context;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		preferenceconfig=new sharedPreferenceConfig(getApplicationContext());
		EditText userName=(EditText)findViewById(R.id.editText1);
		EditText userPassword=(EditText)findViewById(R.id.editText2);
		
		if(preferenceconfig.readLoginStatus()){
			startActivity(new Intent(this,successActivity.class));
			finish();
		}
		
    }
	
	public void loginUser(){
		String username=userName.getText().toString();
		String userpassword=userPassword.getText().toString();
		
		if(username.equals(getResources().getString(R.string.user_name)))
			userpassword.equals(getResources().getString(R.string.user_password));{
				startActivity(new Intent(this,successActivity.class));
				preferenceconfig.writeLoginStatus(true);
				finish(); }else{
				Toast.makeText(Context,"login failed",Toast.LENGTH_SHORT).show();
				userName.setText("");
				userPassword.setText("");
			
				
				}
	}
}
