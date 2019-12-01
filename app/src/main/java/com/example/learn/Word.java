package com.example.learn;

public class Word {
private  String mMiwokTranslation;
private String mDefaultTranslation;
private int mImageResourceId;
public Word(String defaultTranslation,String miwokTranslation)
{
    mDefaultTranslation=defaultTranslation;
    mMiwokTranslation=miwokTranslation;
}
    public Word(String defaultTranslation,String miwokTranslation,int ImageResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=ImageResourceId;
    }
public  int getImageResourceId()
{
    return  mImageResourceId;
}
public String getMiwokTranslation(){
    return mMiwokTranslation;
}
public String getDefaultTranslation()
{
    return mDefaultTranslation;
}
}
