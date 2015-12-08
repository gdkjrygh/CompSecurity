// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class IndicatorView extends FrameLayout
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private LinearLayout f;

    public IndicatorView(Context context)
    {
        this(context, null);
    }

    public IndicatorView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(int i)
    {
        a = i;
    }

    public void b(int i)
    {
        if (b != i)
        {
            b = i;
            f.removeAllViews();
            int j = 0;
            while (j < i) 
            {
                ImageView imageview = new ImageView(getContext());
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2, 1.0F);
                layoutparams.rightMargin = a;
                if (j == c)
                {
                    imageview.setImageResource(e);
                } else
                {
                    imageview.setImageResource(d);
                }
                f.addView(imageview, layoutparams);
                j++;
            }
        }
    }

    public void c(int i)
    {
        if (c != i)
        {
            c = i;
            i = 0;
            while (i < f.getChildCount()) 
            {
                Object obj = f.getChildAt(i);
                if (obj instanceof ImageView)
                {
                    obj = (ImageView)obj;
                    if (i == c)
                    {
                        ((ImageView) (obj)).setImageResource(e);
                    } else
                    {
                        ((ImageView) (obj)).setImageResource(d);
                    }
                }
                i++;
            }
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        d = 0x7f0200a4;
        e = 0x7f0200a5;
        f = (LinearLayout)findViewById(0x7f0903de);
    }
}
