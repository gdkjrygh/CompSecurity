// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.nativead;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;

public class FacebookBgImageView extends ImageView
{

    protected int a;
    protected int b;

    public FacebookBgImageView(Context context)
    {
        super(context);
    }

    public FacebookBgImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FacebookBgImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onFinishInflate()
    {
        a = getResources().getDimensionPixelOffset(0x7f0c0018);
        b = getContext().getResources().getDisplayMetrics().widthPixels - a * 2;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(b, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec((int)((float)b * 0.5F), 0x40000000));
        setMeasuredDimension(b, (int)((float)b * 0.5F));
    }
}
