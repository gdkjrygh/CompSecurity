// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class LandingPageAdapter extends BaseAdapter
{

    private View mImageView;
    private LayoutInflater mLayoutInflater;
    private boolean mShowImage;
    private String mTitles[];

    public LandingPageAdapter(Context context)
    {
        mLayoutInflater = LayoutInflater.from(context);
        mImageView = mLayoutInflater.inflate(0x7f04013d, null);
        mTitles = context.getResources().getStringArray(0x7f0e000b);
        mShowImage = true;
    }

    public int getCount()
    {
        if (mShowImage)
        {
            return mTitles.length + 1;
        } else
        {
            return mTitles.length;
        }
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        if (!mShowImage)
        {
            i++;
        }
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (mShowImage && i == 0)
        {
            return mImageView;
        }
        int j;
        if (mShowImage)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (view == null || view == mImageView)
        {
            view = mLayoutInflater.inflate(0x7f04013c, null);
        }
        ((TextView)view.findViewById(0x7f100460)).setText(mTitles[i - j]);
        return view;
    }

    public void setImageEnabled(boolean flag)
    {
        mShowImage = flag;
        notifyDataSetChanged();
    }
}
