package com.nidhi.recycleview;

public class ExampleItem {
    private int mImageresource;
    private  String mText;
         public ExampleItem(int imageresource, String text){
             mImageresource=imageresource;
             mText=text;
         }

    public int getmImageresource() {

             return mImageresource;
    }

    public void setmImageresource(int mImageresource) {

             this.mImageresource = mImageresource;
    }

    public String getmText() {

             return mText;
    }

    public void setmText(String mText) {

             this.mText = mText;
    }
}
