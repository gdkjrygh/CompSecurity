// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.walmart.android.fragments:
//            OnboardingFragment

private class <init> extends PagerAdapter
{

    private static final int NUM_ITEMS = 3;
    private final int mBackgrounds[];
    private final Context mContext;
    private final String mDetails[];
    private final int mImages[];
    private final LayoutInflater mInflater;
    private final String mTitles[];
    private final View mViews[];
    final OnboardingFragment this$0;

    private void populateView(View view, int i)
    {
        ((RelativeLayout)view.findViewById(0x7f1002d0)).setBackgroundResource(mBackgrounds[i]);
        ((ImageView)view.findViewById(0x7f1002d4)).setImageResource(mImages[i]);
        ((TextView)view.findViewById(0x7f1002d2)).setText(mTitles[i]);
        ((TextView)view.findViewById(0x7f1002d3)).setText(mDetails[i]);
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
        mViews[i] = null;
    }

    public int getCount()
    {
        return 3;
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        if (mViews[i] == null)
        {
            mViews[i] = mInflater.inflate(0x7f0400d3, viewgroup, false);
            populateView(mViews[i], i);
            viewgroup.addView(mViews[i]);
        }
        return mViews[i];
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    private (Context context, LayoutInflater layoutinflater)
    {
        this$0 = OnboardingFragment.this;
        super();
        mViews = new View[3];
        mContext = context;
        mInflater = layoutinflater;
        context = mContext.getResources();
        mImages = OnboardingFragment.access$400(OnboardingFragment.this, context, 0x7f0e0003);
        mBackgrounds = OnboardingFragment.access$400(OnboardingFragment.this, context, 0x7f0e0001);
        mTitles = context.getStringArray(0x7f0e0005);
        mDetails = context.getStringArray(0x7f0e0004);
    }

    mDetails(Context context, LayoutInflater layoutinflater, mDetails mdetails)
    {
        this(context, layoutinflater);
    }
}
