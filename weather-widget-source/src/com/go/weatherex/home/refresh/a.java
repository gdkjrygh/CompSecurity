// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.refresh;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AnimationUtils;

public abstract class a
{

    protected View a;
    protected float b;
    protected long c;
    protected long d;
    protected boolean e;
    protected String f;
    private int g;

    public a(View view)
    {
        f = "";
        a = view;
        g = (int)(a.getResources().getDisplayMetrics().density * 70F);
    }

    public void a()
    {
        if (!e)
        {
            b = 0.0F;
            c = AnimationUtils.currentAnimationTimeMillis();
            e = true;
            a.postInvalidate();
        }
    }

    public void a(float f1)
    {
        if (f1 <= 0.4F)
        {
            b = 0.0F;
            ViewCompat.postInvalidateOnAnimation(a);
            return;
        } else
        {
            b = (f1 - 0.4F) / 0.6F;
            c = 0L;
            ViewCompat.postInvalidateOnAnimation(a);
            return;
        }
    }

    abstract void a(Canvas canvas);

    public void a(String s)
    {
        if (e)
        {
            if (!TextUtils.isEmpty(s))
            {
                f = s;
            }
            b = 0.0F;
            d = AnimationUtils.currentAnimationTimeMillis();
            e = false;
            a.postInvalidate();
        }
    }

    public long b()
    {
        return 1000L;
    }

    public void b(String s)
    {
        f = s;
    }

    int c()
    {
        return g;
    }
}
