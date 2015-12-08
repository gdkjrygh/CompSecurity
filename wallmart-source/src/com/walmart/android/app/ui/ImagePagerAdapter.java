// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.walmart.android.utils.CrossfadeAnimationHandler;
import com.walmart.android.utils.ViewUtil;

public abstract class ImagePagerAdapter extends PagerAdapter
{
    public static interface OnFirstItemDisplayedListener
    {

        public abstract void onFirstItemDisplayed();
    }

    public static interface OnItemsChangedListener
    {

        public abstract void onItemsChanged();
    }


    protected SparseArray mBitmaps;
    protected Context mContext;
    protected boolean mFirstItemDisplayed;
    protected Handler mHandler;
    protected OnFirstItemDisplayedListener mOnFirstItemDisplayedListener;
    protected OnItemsChangedListener mOnItemsChangedListener;
    protected Bitmap mPlaceHolderBitmap;
    protected int mViewPagerWidth;
    protected SparseArray mViews;

    public ImagePagerAdapter(Context context)
    {
        mViews = new SparseArray();
        mBitmaps = new SparseArray();
        mFirstItemDisplayed = false;
        mPlaceHolderBitmap = Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ALPHA_8);
        mContext = context;
        mHandler = new Handler();
    }

    public void cleanUp()
    {
        for (int i = 0; i < getCount(); i++)
        {
            Bitmap bitmap = (Bitmap)mBitmaps.get(i);
            if (bitmap != null && !bitmap.isRecycled())
            {
                bitmap.recycle();
            }
        }

        mBitmaps.clear();
        if (mPlaceHolderBitmap != null && !mPlaceHolderBitmap.isRecycled())
        {
            mPlaceHolderBitmap.recycle();
            mPlaceHolderBitmap = null;
        }
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
        mViews.delete(i);
    }

    public abstract String getItemId(int i);

    public int getItemPosition(Object obj)
    {
        return mViews.indexOfValue((View)obj) != -1 ? -1 : -2;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        if (mOnItemsChangedListener != null)
        {
            mOnItemsChangedListener.onItemsChanged();
        }
    }

    protected void notifyFirstItemDisplayed()
    {
        if (!mFirstItemDisplayed)
        {
            mFirstItemDisplayed = true;
            if (mOnFirstItemDisplayedListener != null)
            {
                mOnFirstItemDisplayedListener.onFirstItemDisplayed();
                mOnFirstItemDisplayedListener = null;
            }
        }
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public Parcelable saveState()
    {
        return null;
    }

    protected boolean setImage(int i, View view)
    {
        Bitmap bitmap = (Bitmap)mBitmaps.get(i);
        boolean flag = false;
        if (bitmap != null)
        {
            View view1 = view.findViewById(0x7f1001b7);
            view = (ImageView)ViewUtil.findViewById(view, 0x7f10004b);
            view.setImageBitmap(bitmap);
            (new CrossfadeAnimationHandler(view, 0x7f05000f, view1, 0x7f050011, mContext)).start();
            flag = true;
        }
        return flag;
    }

    public void setOnFirstItemDisplayedListener(OnFirstItemDisplayedListener onfirstitemdisplayedlistener)
    {
        mOnFirstItemDisplayedListener = onfirstitemdisplayedlistener;
    }

    public void setOnItemsChangedListener(OnItemsChangedListener onitemschangedlistener)
    {
        mOnItemsChangedListener = onitemschangedlistener;
    }
}
