package com.example.learn;

public class Word {
private  String mMiwokTranslation;
private String mDefaultTranslation;
public Word(String defaultTranslation,String miwokTranslation)
{
    mDefaultTranslation=defaultTranslation;
    mMiwokTranslation=miwokTranslation;
}
public String getMiwokTranslation(){
    return mMiwokTranslation;
}
public String getDefaultTranslation()
{
    return mDefaultTranslation;
}
}
