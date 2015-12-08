// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.go.gl.widget.GLTextViewWrapper;

public class SizeAdapterTextView extends GLTextViewWrapper
{

    private Context a;
    private int b;

    public SizeAdapterTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = -1;
        a = context;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        float f = a.getResources().getDisplayMetrics().density;
        float f1 = (float)j / f - 5F;
        f = f1;
        if (b > 0)
        {
            f = Math.min(f1, b);
        }
        setTextSize(f);
        super.onSizeChanged(i, j, k, l);
    }

    public void setMaxTextSize(int i)
    {
        b = i;
    }
}
