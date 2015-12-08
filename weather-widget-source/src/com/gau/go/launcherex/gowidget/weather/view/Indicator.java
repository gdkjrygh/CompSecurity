// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Indicator extends LinearLayout
{

    private int a;
    private int b;

    public Indicator(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0x7f0202bc;
        b = 0x7f0202bf;
    }

    public void a(int i)
    {
        int j = getChildCount();
        int k = i - j;
        if (k > 0)
        {
            for (i = 0; i < k; i++)
            {
                ImageView imageview = new ImageView(getContext());
                imageview.setImageResource(b);
                addView(imageview);
            }

        } else
        {
            Math.abs(k);
            for (; i < j; j--)
            {
                removeViewAt(j - 1);
            }

        }
    }

    public void a(int i, int j)
    {
        a = i;
        b = j;
    }

    public void b(int i)
    {
        if (i >= 0 || i < getChildCount())
        {
            int j = 0;
            while (j < getChildCount()) 
            {
                if (j == i)
                {
                    ((ImageView)getChildAt(j)).setImageResource(a);
                } else
                {
                    ((ImageView)getChildAt(j)).setImageResource(b);
                }
                j++;
            }
        }
    }

    public void c(int i)
    {
        int j = i / 2;
        int k = getChildCount();
        i = 0;
        while (i < k) 
        {
            if (i == 0)
            {
                ((ImageView)getChildAt(i)).setPadding(0, 0, j, 0);
            } else
            if (i == k)
            {
                ((ImageView)getChildAt(i)).setPadding(j, 0, 0, 0);
            } else
            {
                ((ImageView)getChildAt(i)).setPadding(j, 0, j, 0);
            }
            i++;
        }
    }
}
