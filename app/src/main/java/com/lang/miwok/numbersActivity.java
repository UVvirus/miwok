package com.lang.miwok;

import android.app.*;
import android.os.*;
import java.util.*;
import android.widget.*;

public class numbersActivity extends Activity
{@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number);
   
		//create an array of words(For reference)
		/*String[] words=new String[10];
		  words[0]="one";
		  words[1]="two";
		  words[2]="three";
		  words[3]="four";
		  words[4]="five";
		  words[5]="six";
		  words[6]="seven";
		  words[7]="eight";
		  words[8]="nine";
		  words[9]="ten";*/
		  
/*................................................................*/
	
		  
		//create a arraylist
		ArrayList<String>wordsArrayList=new ArrayList<String>();
		wordsArrayList.add("one");
		wordsArrayList.add("two");
		wordsArrayList.add("three");
		wordsArrayList.add("four");
		wordsArrayList.add("five");
		wordsArrayList.add("six");
		wordsArrayList.add("seven");
		wordsArrayList.add("eight");
		wordsArrayList.add("nine");
		wordsArrayList.add("ten");
		
		LinearLayout rootView=(LinearLayout)findViewById(R.id.rootView);
		int index=0;
		
		while(index<wordsArrayList.size()){
		
		TextView wordList=new TextView(this);
		wordList.setText(wordsArrayList.get(index));
		rootView.addView(wordList);
		index++;
		}
		
/*........................................................................*/	
		//For reference
	/*	TextView wordList1=new TextView(this);
		wordList1.setText(wordsArrayList.get(1));
		rootView.addView(wordList1);
		
		TextView wordList2=new TextView(this);
		wordList2.setText(wordsArrayList.get(2));
		rootView.addView(wordList2);
		
		TextView wordList3=new TextView(this);
		wordList3.setText(wordsArrayList.get(3));
		rootView.addView(wordList3);
		
		TextView wordList4=new TextView(this);
		wordList4.setText(wordsArrayList.get(4));
		rootView.addView(wordList4);*/
		}
}
