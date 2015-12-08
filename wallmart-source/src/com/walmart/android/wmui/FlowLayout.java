// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class FlowLayout extends ViewGroup
{
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        public boolean breakLine;
        public int horizontalSpacing;
        int x;
        int y;

        public LayoutParams(int i, int j)
        {
            super(i, j);
            horizontalSpacing = -1;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            horizontalSpacing = -1;
        }
    }


    private static final boolean DEBUG = false;
    private int mFixedLineHeight;
    private int mHorizontalSpacing;
    private Paint mPaint;
    private int mVerticalSpacing;

    public FlowLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mFixedLineHeight = -1;
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(0xffff0000);
        mPaint.setStrokeWidth(2.0F);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        return super.drawChild(canvas, view, l);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-2, -2);
    }

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new LayoutParams(layoutparams.width, layoutparams.height);
    }

    public boolean hasFixedLineHeight()
    {
        return mFixedLineHeight >= 0;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        j = getChildCount();
        for (i = 0; i < j; i++)
        {
            View view = getChildAt(i);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            view.layout(layoutparams.x, layoutparams.y, layoutparams.x + view.getMeasuredWidth(), layoutparams.y + view.getMeasuredHeight());
        }

    }

    protected void onMeasure(int i, int j)
    {
        int k2 = android.view.View.MeasureSpec.getSize(i);
        int l2 = getPaddingRight();
        int k;
        int l;
        boolean flag;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int i3;
        boolean flag1;
        if (android.view.View.MeasureSpec.getMode(i) != 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        l = 0;
        i2 = getPaddingTop();
        j1 = getPaddingLeft();
        i1 = 0;
        flag1 = false;
        flag = false;
        k = 0;
        i3 = getChildCount();
        l1 = 0;
        while (l1 < i3) 
        {
            View view = getChildAt(l1);
            measureChild(view, i, j);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            k = mHorizontalSpacing;
            if (layoutparams.horizontalSpacing >= 0)
            {
                k = layoutparams.horizontalSpacing;
            }
            int j2;
            if (k1 && (flag1 || view.getMeasuredWidth() + j1 > k2 - l2))
            {
                i2 += mVerticalSpacing + i1;
                i1 = 0;
                l = Math.max(l, j1 - k);
                j1 = getPaddingLeft();
                flag = true;
            } else
            {
                flag = false;
            }
            layoutparams.x = j1;
            if (hasFixedLineHeight())
            {
                j2 = (mFixedLineHeight - view.getMeasuredHeight()) / 2;
            } else
            {
                j2 = 0;
            }
            layoutparams.y = j2 + i2;
            j1 += view.getMeasuredWidth() + k;
            if (hasFixedLineHeight())
            {
                i1 = mFixedLineHeight;
            } else
            {
                i1 = Math.max(i1, view.getMeasuredHeight());
            }
            flag1 = layoutparams.breakLine;
            l1++;
        }
        k1 = l;
        if (!flag)
        {
            k1 = Math.max(l, j1 - k);
        }
        k = getPaddingRight();
        l = getPaddingBottom();
        setMeasuredDimension(resolveSize(k1 + k, i), resolveSize(i2 + (l + i1), j));
    }

    public void setFixedLineHeight(int i)
    {
        mFixedLineHeight = i;
        requestLayout();
    }

    public void setHorizontalSpacing(int i)
    {
        mHorizontalSpacing = i;
        requestLayout();
    }

    public void setVerticalSpacing(int i)
    {
        mVerticalSpacing = i;
        requestLayout();
    }
}
