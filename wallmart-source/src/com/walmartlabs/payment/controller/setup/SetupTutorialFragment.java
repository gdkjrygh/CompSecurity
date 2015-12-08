// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.view.PageIndicatorView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.payment.controller.setup:
//            SetupCallbacks

public class SetupTutorialFragment extends Fragment
{
    private class SetupPageChangeListener
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        final SetupTutorialFragment this$0;

        public void onPageScrollStateChanged(int i)
        {
        }

        public void onPageScrolled(int i, float f, int j)
        {
        }

        public void onPageSelected(int i)
        {
            mIndicatorView.setActivePage(i);
        }

        private SetupPageChangeListener()
        {
            this$0 = SetupTutorialFragment.this;
            super();
        }

    }

    private static class SetupPagerAdapter extends PagerAdapter
    {

        private final String mCaptions[];
        private final Context mContext;

        public void destroyItem(ViewGroup viewgroup, int i, Object obj)
        {
            viewgroup.removeView((View)obj);
        }

        public int getCount()
        {
            return 4;
        }

        public Object instantiateItem(ViewGroup viewgroup, int i)
        {
            View view;
            ImageView imageview;
            TextView textview;
            int j;
            WLog.d(SetupTutorialFragment.TAG, (new StringBuilder()).append("In instantiateItem for position ").append(i).toString());
            view = ViewUtil.inflate(mContext, com.walmartlabs.android.payment.R.layout.mpay_using_pager);
            imageview = (ImageView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.mpay_using_pager_image);
            textview = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.mpay_using_pager_text);
            j = -1;
            i;
            JVM INSTR tableswitch 0 3: default 96
        //                       0 131
        //                       1 139
        //                       2 147
        //                       3 155;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            imageview.setImageDrawable(mContext.getResources().getDrawable(j));
            textview.setText(mCaptions[i]);
            viewgroup.addView(view);
            return view;
_L2:
            j = com.walmartlabs.android.payment.R.drawable.using_wmpay_01;
            continue; /* Loop/switch isn't completed */
_L3:
            j = com.walmartlabs.android.payment.R.drawable.using_wmpay_02;
            continue; /* Loop/switch isn't completed */
_L4:
            j = com.walmartlabs.android.payment.R.drawable.using_wmpay_03;
            continue; /* Loop/switch isn't completed */
_L5:
            j = com.walmartlabs.android.payment.R.drawable.using_wmpay_04;
            if (true) goto _L1; else goto _L6
_L6:
        }

        public boolean isViewFromObject(View view, Object obj)
        {
            return view == obj;
        }

        public SetupPagerAdapter(Context context)
        {
            mContext = context;
            mCaptions = mContext.getResources().getStringArray(com.walmartlabs.android.payment.R.array.mpay_setup_using_desc);
        }
    }


    private static final String TAG = com/walmartlabs/payment/controller/setup/SetupTutorialFragment.getSimpleName();
    private SetupCallbacks mCallbacks;
    private PageIndicatorView mIndicatorView;

    public SetupTutorialFragment()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.R.layout.mpay_setup_use_tutorial);
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "how to use mobile pay").putString("section", "mobile pay"));
        viewgroup = (ViewPager)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_setup_use_viewpager);
        mIndicatorView = (PageIndicatorView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_setup_use_indicators);
        viewgroup.setAdapter(new SetupPagerAdapter(getActivity()));
        viewgroup.addOnPageChangeListener(new SetupPageChangeListener());
        ((Button)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_setup_btn_start)).setOnClickListener(new android.view.View.OnClickListener() {

            final SetupTutorialFragment this$0;

            public void onClick(View view)
            {
                MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("mobilePayTryNow"));
                mCallbacks.onTryNow();
            }

            
            {
                this$0 = SetupTutorialFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        ActionBar actionbar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(com.walmartlabs.android.payment.R.string.mpay_setup_use_title);
        }
    }

    public void setCallbacks(SetupCallbacks setupcallbacks)
    {
        mCallbacks = setupcallbacks;
    }




}
