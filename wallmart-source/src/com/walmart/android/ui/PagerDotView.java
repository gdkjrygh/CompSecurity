// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.walmart.android.utils.ViewUtil;

public class PagerDotView extends View
{

    public static final String TAG = com/walmart/android/ui/PagerDotView.getSimpleName();
    private Drawable mDefaultDrawable;
    private int mDotHeight;
    private int mDotTop;
    private int mDotWidth;
    private int mFirstDotOffset;
    private int mHeight;
    private int mNbrOfPages;
    private Drawable mSelectedDrawable;
    private int mSelectedPage;
    private int mSpacing;
    private int mWidth;

    public PagerDotView(Context context)
    {
        super(context);
        init(null);
    }

    public PagerDotView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(attributeset);
    }

    public PagerDotView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(attributeset);
    }

    private void calculateDimensions(int i, int j)
    {
    }

    private void calculatePositions()
    {
        int i = mNbrOfPages;
        int j = mDotWidth;
        int k = mNbrOfPages;
        int l = mSpacing;
        mFirstDotOffset = (mWidth - (i * j + (k - 1) * l)) / 2;
        mDotTop = (mHeight - mDotHeight) / 2;
    }

    private void init(AttributeSet attributeset)
    {
        attributeset = getContext().obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.PagerDotView);
        mSpacing = attributeset.getDimensionPixelSize(com.walmart.lib.R.styleable.PagerDotView_spacing, ViewUtil.dpToPixels(10, getContext()));
        mDefaultDrawable = attributeset.getDrawable(com.walmart.lib.R.styleable.PagerDotView_defaultDrawable);
        mSelectedDrawable = attributeset.getDrawable(com.walmart.lib.R.styleable.PagerDotView_selectedDrawable);
        attributeset.recycle();
        mDotWidth = mSelectedDrawable.getIntrinsicWidth();
        mDotHeight = mSelectedDrawable.getIntrinsicHeight();
        mNbrOfPages = 0;
        mSelectedPage = 0;
    }

    protected void onDraw(Canvas canvas)
    {
        int j = mFirstDotOffset;
        int i = 0;
        while (i < mNbrOfPages) 
        {
            Drawable drawable;
            if (i == mSelectedPage)
            {
                drawable = mSelectedDrawable;
            } else
            {
                drawable = mDefaultDrawable;
            }
            drawable.setBounds(j, mDotTop, mDotWidth + j, mDotTop + mDotHeight);
            drawable.draw(canvas);
            j += mDotWidth + mSpacing;
            i++;
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        mWidth = android.view.View.MeasureSpec.getSize(i);
        mHeight = android.view.View.MeasureSpec.getSize(j);
        calculateDimensions(mWidth, mHeight);
        setMeasuredDimension(mWidth, mHeight);
        calculatePositions();
    }

    public void setNbrOfPages(int i)
    {
        mNbrOfPages = i;
        calculatePositions();
        invalidate();
    }

    public void setPosition(int i)
    {
        mSelectedPage = i;
        invalidate();
    }

}
