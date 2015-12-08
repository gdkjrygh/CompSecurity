// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.payment.controller.setup:
//            SetupTutorialFragment

private static class mContext extends PagerAdapter
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
        WLog.d(SetupTutorialFragment.access$200(), (new StringBuilder()).append("In instantiateItem for position ").append(i).toString());
        view = ViewUtil.inflate(mContext, com.walmartlabs.android.payment.rAdapter.mContext);
        imageview = (ImageView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.rAdapter.mContext);
        textview = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.rAdapter.mContext);
        j = -1;
        i;
        JVM INSTR tableswitch 0 3: default 96
    //                   0 131
    //                   1 139
    //                   2 147
    //                   3 155;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        imageview.setImageDrawable(mContext.getResources().getDrawable(j));
        textview.setText(mCaptions[i]);
        viewgroup.addView(view);
        return view;
_L2:
        j = com.walmartlabs.android.payment.rAdapter.mCaptions;
        continue; /* Loop/switch isn't completed */
_L3:
        j = com.walmartlabs.android.payment.rAdapter.mCaptions;
        continue; /* Loop/switch isn't completed */
_L4:
        j = com.walmartlabs.android.payment.rAdapter.mCaptions;
        continue; /* Loop/switch isn't completed */
_L5:
        j = com.walmartlabs.android.payment.rAdapter.mCaptions;
        if (true) goto _L1; else goto _L6
_L6:
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public (Context context)
    {
        mContext = context;
        mCaptions = mContext.getResources().getStringArray(com.walmartlabs.android.payment.rAdapter.mContext);
    }
}
