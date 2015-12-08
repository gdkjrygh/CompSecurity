// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

// Referenced classes of package com.walmart.android.wmui:
//            PercentageTextView, PercentageCircleView

public class PercentageView extends FrameLayout
{

    private final PercentageCircleView mCircle;
    private TextView mNumberView;
    private int mPadding;

    public PercentageView(Context context)
    {
        this(context, null);
    }

    public PercentageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PercentageView(Context context, AttributeSet attributeset, int i)
    {
        float f;
        Object obj;
        int j;
        super(context, attributeset, i);
        j = -1;
        f = 0.0F;
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = context.obtainStyledAttributes(attributeset, com.walmart.android.R.styleable.PercentageView, i, 0);
        mPadding = ((TypedArray) (obj)).getDimensionPixelSize(2, 0);
        j = ((TypedArray) (obj)).getInteger(1, -1);
        f = ((TypedArray) (obj)).getFloat(0, 0.0F);
        ((TypedArray) (obj)).recycle();
        mNumberView = new PercentageTextView(context, attributeset, i);
        mNumberView.setPadding(0, 0, 0, 0);
        obj = new android.widget.FrameLayout.LayoutParams(-2, -2);
        obj.gravity = 17;
        mNumberView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        mCircle = new PercentageCircleView(context, attributeset, i);
        mCircle.setPadding(0, 0, 0, 0);
        if (j >= 0)
        {
            setPercentage(j);
        } else
        {
            setFraction(f);
        }
        addView(mNumberView);
        addView(mCircle);
        return;
        context;
        ((TypedArray) (obj)).recycle();
        throw context;
    }

    public int getCirclePadding()
    {
        return mPadding;
    }

    public float getFraction()
    {
        return mCircle.getFraction();
    }

    public int getPercentage()
    {
        return (int)(mCircle.getFraction() * 100F);
    }

    protected void onMeasure(int i, int j)
    {
        mNumberView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int k = Math.max(mNumberView.getMeasuredWidth(), mNumberView.getMeasuredHeight()) / 2;
        mCircle.setMinRadius(mPadding + k);
        super.onMeasure(i, j);
    }

    public void setCirclePadding(int i)
    {
        mPadding = i;
    }

    public void setFraction(float f)
    {
        mNumberView.setText(Integer.toString((int)(100F * f)));
        mCircle.setFraction(f);
    }

    public void setPercentage(int i)
    {
        mNumberView.setText(Integer.toString(i));
        mCircle.setFraction((float)i / 100F);
    }
}
