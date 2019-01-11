package com.lang.miwok;

public class word
{private String mDefaultTranslation;
private String mMiwokTranslation;

public word(String mDefaultTranslation,String mMiwokTranslation){
	
	this.mDefaultTranslation = mDefaultTranslation;
	this.mMiwokTranslation = mMiwokTranslation;
	
}

	public String getDefaultTranslation(){
		return mDefaultTranslation;
	}
	public String getmiwokTranslation(){
		return mMiwokTranslation;
	}

}
