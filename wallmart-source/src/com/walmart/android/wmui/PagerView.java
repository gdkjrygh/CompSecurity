// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.walmart.android.ui.PagerDotView;

public class PagerView extends PagerDotView
{

    public static final String TAG = com/walmart/android/wmui/PagerView.getSimpleName();
    private int mHeight;
    private int mMarkerHeight;
    private int mMarkerTop;
    private int mMarkerWidth;
    private int mNbrOfPages;
    private Drawable mSelectedDrawable;
    private int mSelectedPage;
    private int mWidth;

    public PagerView(Context context)
    {
        super(context);
        init(null);
    }

    public PagerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(attributeset);
    }

    public PagerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(attributeset);
    }

    private void calculatePositions()
    {
        mMarkerWidth = mWidth / mNbrOfPages;
        mMarkerTop = (mHeight - mMarkerHeight) / 2;
    }

    private void init(AttributeSet attributeset)
    {
        attributeset = getContext().obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.PagerDotView);
        mSelectedDrawable = attributeset.getDrawable(0);
        attributeset.recycle();
        mMarkerHeight = mSelectedDrawable.getIntrinsicHeight();
        mNbrOfPages = 0;
        mSelectedPage = 0;
    }

    protected void onDraw(Canvas canvas)
    {
        int i = mSelectedPage * mMarkerWidth;
        mSelectedDrawable.setBounds(i, mMarkerTop, mMarkerWidth + i, mMarkerTop + mMarkerHeight);
        mSelectedDrawable.draw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        mWidth = android.view.View.MeasureSpec.getSize(i);
        mHeight = android.view.View.MeasureSpec.getSize(j);
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
