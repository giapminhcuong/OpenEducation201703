package com.cuong.android.android_07;

/**
 * Created by Admin on 23/3/2017.
 */

public class PlayStoreItem {
    private int mImageRes;
    private String mTitle;

    public PlayStoreItem(int imageRes, String title) {
        mImageRes = imageRes;
        mTitle = title;
    }

    public int getImageRes() {
        return mImageRes;
    }

    public void setImageRes(int imageRes) {
        mImageRes = imageRes;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
