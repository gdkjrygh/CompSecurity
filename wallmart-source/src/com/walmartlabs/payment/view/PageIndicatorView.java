// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.walmart.android.utils.ViewUtil;

public class PageIndicatorView extends LinearLayout
{

    private static final int NUM_INDICATORS = 4;
    private int mActivePage;
    private final Drawable mDrawableActive;
    private final Drawable mDrawableInactive;
    private ImageView mPageIndicators[];

    public PageIndicatorView(Context context)
    {
        this(context, null);
    }

    public PageIndicatorView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PageIndicatorView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mActivePage = 0;
        View.inflate(context, com.walmartlabs.android.payment.R.layout.page_indicator_layout, this);
        mDrawableActive = context.getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.page_active);
        mDrawableInactive = context.getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.page_inactive);
    }

    public int getActivePage()
    {
        return mActivePage;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mPageIndicators = new ImageView[4];
        mPageIndicators[0] = (ImageView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.page_indicator_0);
        mPageIndicators[1] = (ImageView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.page_indicator_1);
        mPageIndicators[2] = (ImageView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.page_indicator_2);
        mPageIndicators[3] = (ImageView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.page_indicator_3);
    }

    public void setActivePage(int i)
    {
        mPageIndicators[mActivePage].setImageDrawable(mDrawableInactive);
        mPageIndicators[i].setImageDrawable(mDrawableActive);
        mActivePage = i;
    }
}
