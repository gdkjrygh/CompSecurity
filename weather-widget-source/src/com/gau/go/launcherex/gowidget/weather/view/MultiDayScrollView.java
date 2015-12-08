// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.gau.go.launcherex.gowidget.weather.scroller.j;

public class MultiDayScrollView extends LinearLayout
{

    private Context a;
    private Scroller b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public MultiDayScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        b = null;
        a = context;
        c();
    }

    private void c()
    {
        b = new Scroller(a, new j());
    }

    public void a()
    {
        b.forceFinished(false);
        d = 0;
        scrollTo(0, 0);
        c = 0;
    }

    public void a(int i)
    {
        d = b(i);
        i = d * e - c;
        b.startScroll(c, 0, i, 0, 600);
        c = c + i;
        invalidate();
    }

    protected int b(int i)
    {
        return Math.max(0, Math.min(i, g - 3));
    }

    public void b()
    {
        a(c(c) + 1);
    }

    protected int c(int i)
    {
        if (e == 0)
        {
            return 0;
        } else
        {
            return (e / 2 + i) / e;
        }
    }

    public void computeScroll()
    {
        if (b.computeScrollOffset())
        {
            scrollTo(b.getCurrX(), 0);
            postInvalidate();
        }
    }

    protected void onLayout(boolean flag, int i, int k, int l, int i1)
    {
        f = i1 - k;
        e = (l - i) / 3;
        l = getChildCount();
        i = 0;
        k = 0;
        for (; i < l; i++)
        {
            View view = getChildAt(i);
            view.measure(-1, -1);
            view.layout(k, 0, e + k, f);
            k += e;
        }

    }

    protected void onMeasure(int i, int k)
    {
        super.onMeasure(i, k);
    }

    protected void onSizeChanged(int i, int k, int l, int i1)
    {
        super.onSizeChanged(i, k, l, i1);
        g = getChildCount();
    }
}
