package com.lang.miwok;

import android.app.*;
import android.os.*;
import java.util.*;
import android.widget.*;
import android.util.*;

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
		ArrayList<word>wordsArrayList=new ArrayList<word>();
		wordsArrayList.add(new word("one","lutti"));
		wordsArrayList.add(new word("two","otiiko"));
		wordsArrayList.add(new word("three","thjki"));
		wordsArrayList.add(new word("four","thhb"));
		wordsArrayList.add(new word("five",""));
		wordsArrayList.add(new word("six",""));
		wordsArrayList.add(new word("seven",""));
		wordsArrayList.add(new word("eight",""));
		wordsArrayList.add(new word("nine",""));
		wordsArrayList.add(new word("ten",""));
		
		wordAdapter adapter=new wordAdapter(this,wordsArrayList);
		ListView listView=(ListView)findViewById(R.id.list);
		listView.setAdapter(adapter);
/*--------------------------------------------------------------------------------------		
		LinearLayout rootView=(LinearLayout)findViewById(R.id.rootView);
		//for loop example
		for(int index=0;index<wordsArrayList.size();index++){
			TextView wordList=new TextView(this);
			wordList.setText(wordsArrayList.get(index));
			rootView.addView(wordList);
		}
/*--------------------------------------------------------------------------------*/		
		//while loop example
		/*int index=0;
		
		while(index<wordsArrayList.size()){
		
		TextView wordList=new TextView(this);
		wordList.setText(wordsArrayList.get(index));
		rootView.addView(wordLis,t);
		index++;
		}*/
		
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
