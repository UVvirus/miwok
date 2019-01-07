package com.lang.miwok;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		//To start numberActivity
		TextView  numbers=(TextView)findViewById(R.id.numbers);
		numbers.setOnClickListener (new View.OnClickListener(){
				@Override
				public void onClick(View v){
					Intent intent=new Intent(MainActivity.this,numbersActivity.class);
					startActivity(intent);
				}});
				
				//To start colorActivity
				TextView colors=(TextView)findViewById(R.id.colors);
				colors.setOnClickListener(new View.OnClickListener(){
					@Override
					public void onClick(View v){
						Intent intent=new Intent(MainActivity.this,colorsActivity.class);
						startActivity(intent);
					}});
					
					//To start phrasesActivity
					TextView phrase=(TextView)findViewById(R.id.phrases);
					phrase.setOnClickListener(new View.OnClickListener(){
						@Override
						public void onClick(View v){
							Intent intent=new Intent(MainActivity.this,phrasesActivity.class);
							startActivity(intent);
							}});
							
					//To start familyMemberActivity
					TextView family=(TextView)findViewById(R.id.family);
					family.setOnClickListener(new View.OnClickListener(){
						@Override
						public void onClick(View v){
							Intent intent=new Intent(MainActivity.this,familyMembersActivity.class);
							startActivity(intent);
							}});
						}}
					
						
					
				
    
	
	
	
	
	
	
	

