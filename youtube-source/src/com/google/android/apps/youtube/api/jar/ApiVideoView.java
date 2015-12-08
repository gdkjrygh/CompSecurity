// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import android.view.ViewGroup;

public abstract class ApiVideoView extends ViewGroup
{

    private int a;
    private int b;

    public ApiVideoView(Context context)
    {
        super(context);
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        k = getDefaultSize(a, i);
        l = getDefaultSize(b, j);
        i = l;
        j = k;
        if (a <= 0) goto _L2; else goto _L1
_L1:
        i = l;
        j = k;
        if (b <= 0) goto _L2; else goto _L3
_L3:
        float f = (float)a / (float)b / ((float)k / (float)l) - 1.0F;
        if (f <= 0.01F) goto _L5; else goto _L4
_L4:
        i = (b * k) / a;
        j = k;
_L2:
        setMeasuredDimension(j, i);
        return;
_L5:
        i = l;
        j = k;
        if (f < -0.01F)
        {
            j = (a * l) / b;
            i = l;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public final void setVideoSize(int i, int j)
    {
        a = i;
        b = j;
        requestLayout();
    }
}
