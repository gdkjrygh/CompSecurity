// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

public class FixedAspectRatioImageView extends ImageView
{

    private static final int DEFAULT_ASPECT_HEIGHT = 9;
    private static final int DEFAULT_ASPECT_WIDTH = 16;
    private int aspectHeight;
    private int aspectWidth;

    public FixedAspectRatioImageView(Context context)
    {
        super(context);
        aspectWidth = 16;
        aspectHeight = 9;
    }

    public FixedAspectRatioImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        aspectWidth = 16;
        aspectHeight = 9;
        readAspectAttributes(context, attributeset);
    }

    public FixedAspectRatioImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        aspectWidth = 16;
        aspectHeight = 9;
        readAspectAttributes(context, attributeset);
    }

    private void readAspectAttributes(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, com.weather.commons.R.styleable.FixedAspectRatioImageView);
        aspectWidth = context.getInt(com.weather.commons.R.styleable.FixedAspectRatioImageView_farivAspectWidth, aspectWidth);
        aspectHeight = context.getInt(com.weather.commons.R.styleable.FixedAspectRatioImageView_farivAspectHeight, aspectHeight);
        context.recycle();
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getSize(j);
        i = k;
        j = l;
        if (k != 0)
        {
            j = (aspectHeight * k) / aspectWidth;
        } else
        {
            i = (aspectWidth * l) / aspectHeight;
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000));
    }
}
