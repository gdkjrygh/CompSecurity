// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.Context;
import android.widget.RelativeLayout;

public class af extends RelativeLayout
{

    private int a;
    private int b;

    public af(Context context)
    {
        super(context);
        a = 0;
        b = 0;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (b > 0 && getMeasuredWidth() > b)
        {
            setMeasuredDimension(b, getMeasuredHeight());
        } else
        if (getMeasuredWidth() < a)
        {
            setMeasuredDimension(a, getMeasuredHeight());
            return;
        }
    }

    protected void setMaxWidth(int i)
    {
        b = i;
    }

    public void setMinWidth(int i)
    {
        a = i;
    }
}
