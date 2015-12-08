// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.dayforecast;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class j extends Animation
{

    private View a;
    private int b;
    private int c;
    private android.widget.LinearLayout.LayoutParams d;

    public j(View view, int i, int k)
    {
        a = view;
        if (i != 1) goto _L2; else goto _L1
_L1:
        b = k;
        c = 0;
_L4:
        d = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        if (b == 0)
        {
            d.height = b;
            view.setVisibility(0);
            view.requestLayout();
        }
        return;
_L2:
        if (i == 0)
        {
            b = 0;
            c = k;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        super.applyTransformation(f, transformation);
        int i = (int)((float)b + (float)(c - b) * f);
        d.height = i;
        a.requestLayout();
        if (f >= 1.0F)
        {
            if (b > c)
            {
                a.setVisibility(8);
            } else
            if (b < c)
            {
                a.setVisibility(0);
                return;
            }
        }
    }
}
