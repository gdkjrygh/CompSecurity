// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.youtube.r;

public class FixedAspectRatioFrameLayout extends FrameLayout
{

    private float a;

    public FixedAspectRatioFrameLayout(Context context)
    {
        super(context);
        a = 1.0F;
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = context.obtainStyledAttributes(attributeset, r.n).getFraction(0, 1, 1, 1.0F);
    }

    protected void onMeasure(int i, int j)
    {
        if (android.view.View.MeasureSpec.getMode(i) == 0x40000000)
        {
            super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec((int)((float)android.view.View.MeasureSpec.getSize(i) / a), 0x40000000));
            return;
        }
        if (android.view.View.MeasureSpec.getMode(j) == 0x40000000)
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec((int)((float)android.view.View.MeasureSpec.getSize(j) * a), 0x40000000), j);
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }

    public void setAspectRatio(float f)
    {
        a = f;
    }
}
