// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.walmart.android.app.main.HomeActivity;
import com.walmart.android.utils.ViewUtil;

public class OnboardingFragment extends Fragment
{
    private class OnboardingClickListener
        implements android.view.View.OnClickListener
    {

        final OnboardingFragment this$0;

        public void onClick(View view)
        {
            view = new Intent(getActivity(), com/walmart/android/app/main/HomeActivity);
            startActivity(view);
            getActivity().finish();
            getActivity().overridePendingTransition(0x7f05000e, 0x7f050010);
        }

        private OnboardingClickListener()
        {
            this$0 = OnboardingFragment.this;
            super();
        }

    }

    private class TabsAdapter extends PagerAdapter
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

        private TabsAdapter(Context context, LayoutInflater layoutinflater)
        {
            this$0 = OnboardingFragment.this;
            super();
            mViews = new View[3];
            mContext = context;
            mInflater = layoutinflater;
            context = mContext.getResources();
            mImages = readResourceArray(context, 0x7f0e0003);
            mBackgrounds = readResourceArray(context, 0x7f0e0001);
            mTitles = context.getStringArray(0x7f0e0005);
            mDetails = context.getStringArray(0x7f0e0004);
        }

    }


    private int mDotsImages[];
    private OnboardingClickListener mOnboardingClickListener;
    private TabsAdapter mTabsAdapter;

    public OnboardingFragment()
    {
    }

    private int[] readResourceArray(Resources resources, int i)
    {
        resources = resources.obtainTypedArray(i);
        int ai[] = new int[resources.length()];
        for (i = 0; i < ai.length; i++)
        {
            ai[i] = resources.getResourceId(i, 0);
        }

        resources.recycle();
        return ai;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (mTabsAdapter != null)
        {
            mTabsAdapter.notifyDataSetChanged();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, final Bundle viewPager)
    {
        viewgroup = layoutinflater.inflate(0x7f0400d4, viewgroup, false);
        mDotsImages = readResourceArray(getResources(), 0x7f0e0002);
        mOnboardingClickListener = new OnboardingClickListener();
        viewPager = (ViewPager)ViewUtil.findViewById(viewgroup, 0x7f1002d6);
        final ImageView nextButton = (ImageView)ViewUtil.findViewById(viewgroup, 0x7f1002da);
        final ImageView dotsImage = (ImageView)ViewUtil.findViewById(viewgroup, 0x7f1002d8);
        final TextView skipText = (TextView)ViewUtil.findViewById(viewgroup, 0x7f1002d7);
        final TextView doneText = (TextView)ViewUtil.findViewById(viewgroup, 0x7f1002db);
        doneText.setOnClickListener(mOnboardingClickListener);
        skipText.setOnClickListener(mOnboardingClickListener);
        nextButton.setOnClickListener(new android.view.View.OnClickListener() {

            final OnboardingFragment this$0;
            final ViewPager val$viewPager;

            public void onClick(View view)
            {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
            }

            
            {
                this$0 = OnboardingFragment.this;
                viewPager = viewpager;
                super();
            }
        });
        viewPager.addOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final OnboardingFragment this$0;
            final TextView val$doneText;
            final ImageView val$dotsImage;
            final ImageView val$nextButton;
            final TextView val$skipText;

            public void onPageScrollStateChanged(int i)
            {
            }

            public void onPageScrolled(int i, float f, int j)
            {
            }

            public void onPageSelected(int i)
            {
                dotsImage.setImageResource(mDotsImages[i]);
                if (i == mTabsAdapter.getCount() - 1)
                {
                    skipText.setVisibility(4);
                    nextButton.setVisibility(4);
                    doneText.setVisibility(0);
                    return;
                } else
                {
                    skipText.setVisibility(0);
                    doneText.setVisibility(4);
                    nextButton.setVisibility(0);
                    return;
                }
            }

            
            {
                this$0 = OnboardingFragment.this;
                dotsImage = imageview;
                skipText = textview;
                nextButton = imageview1;
                doneText = textview1;
                super();
            }
        });
        mTabsAdapter = new TabsAdapter(getActivity(), layoutinflater);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(mTabsAdapter);
        return viewgroup;
    }



}
