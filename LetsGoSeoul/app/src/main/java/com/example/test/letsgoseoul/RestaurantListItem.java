package com.example.test.letsgoseoul;

import android.app.Activity;
import android.graphics.Bitmap;

public class RestaurantListItem extends Activity {

    private Bitmap mIcon;
    private String mData;
    private String mId;
    private String mUrl;
    private boolean mSelectable = true;

    public RestaurantListItem(Bitmap pic, String name,String id,String url){
        mIcon = pic;
        mData = name;
        mId = id;
        mUrl =url;
    }

    public boolean isSelectable() {
        return mSelectable;
    }
    public void setSelectable(boolean selectable) {
        mSelectable = selectable;
    }
    public String getData() {
        return mData;
    }
    public Bitmap getIcon() {
        return mIcon;
    }
    public String getId() {return mId;}
    public String getUrl() {return mUrl;}
    public void setData(String obj) {
        mData = obj;
    }
    public void setIcon(Bitmap icon) {
        mIcon = icon;
    }

}
