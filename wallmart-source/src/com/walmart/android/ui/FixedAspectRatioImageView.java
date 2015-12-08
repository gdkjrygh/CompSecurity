// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class FixedAspectRatioImageView extends ImageView
{

    private float mDefaultAspectRatio;

    public FixedAspectRatioImageView(Context context)
    {
        super(context);
    }

    public FixedAspectRatioImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(attributeset);
    }

    public FixedAspectRatioImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(attributeset);
    }

    private void init(AttributeSet attributeset)
    {
        attributeset = getContext().obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.FixedAspectRatioImageView);
        mDefaultAspectRatio = attributeset.getFloat(com.walmart.lib.R.styleable.FixedAspectRatioImageView_defaultAspectRatio, 0.0F);
        attributeset.recycle();
    }

    protected void onMeasure(int i, int j)
    {
        Drawable drawable = getDrawable();
        int k = android.view.View.MeasureSpec.getSize(i);
        if (drawable == null || drawable.getIntrinsicWidth() <= 0)
        {
            if (mDefaultAspectRatio == 0.0F)
            {
                i = android.view.View.MeasureSpec.getSize(j);
            } else
            {
                i = (int)((float)k / mDefaultAspectRatio);
            }
        } else
        {
            float f = (float)k / (float)drawable.getIntrinsicWidth();
            i = (int)((float)drawable.getIntrinsicHeight() * f);
        }
        setMeasuredDimension(k, i);
    }
}
