// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.a.a.a;
import com.a.a.an;
import com.a.a.au;
import com.a.a.b;
import com.gtp.a.a.b.c;

public class VerticalStretchLayout extends FrameLayout
    implements android.view.ViewTreeObserver.OnPreDrawListener, au, b
{

    private int a;
    private int b;
    private an c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    public VerticalStretchLayout(Context context)
    {
        super(context);
        a = -1;
        b = -2;
        d = true;
        e = false;
        f = false;
        g = false;
        e();
    }

    public VerticalStretchLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = -1;
        b = -2;
        d = true;
        e = false;
        f = false;
        g = false;
        e();
    }

    public VerticalStretchLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = -1;
        b = -2;
        d = true;
        e = false;
        f = false;
        g = false;
        e();
    }

    private void e()
    {
        boolean flag;
        if (getVisibility() != 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void a()
    {
        d = false;
        if (c != null && c.e())
        {
            c.b();
        }
        setVisibility(8);
    }

    public void a(a a1)
    {
        e = true;
        g = false;
        setVisibility(0);
    }

    public void a(an an1)
    {
        int i = ((Integer)an1.l()).intValue();
        an1 = getLayoutParams();
        an1.height = i;
        setLayoutParams(an1);
        scrollTo(0, a - i);
    }

    public void b()
    {
        d = true;
        if (c != null && c.e())
        {
            c.b();
        }
        setVisibility(0);
    }

    public void b(a a1)
    {
    }

    public void c()
    {
        d = false;
        f = true;
        setVisibility(0);
        requestLayout();
    }

    public void c(a a1)
    {
label0:
        {
            e = false;
            if (!g)
            {
                a1 = getLayoutParams();
                a1.height = b;
                setLayoutParams(a1);
                scrollTo(0, 0);
                if (d)
                {
                    break label0;
                }
                setVisibility(8);
            }
            return;
        }
        setVisibility(0);
    }

    public void d()
    {
        d = true;
        f = true;
        setVisibility(0);
        requestLayout();
    }

    public void d(a a1)
    {
        g = true;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
    }

    public boolean onPreDraw()
    {
        boolean flag;
        if (!f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f)
        {
            f = false;
            if (!e)
            {
                b = getLayoutParams().height;
                a = getHeight();
                com.gtp.a.a.b.c.a("VerticalStretchLayout", (new StringBuilder()).append("onPreDraw->mLayoutHeight: ").append(a).toString());
            }
            int i;
            long l;
            if (c != null && c.e())
            {
                c.b();
                i = 1;
            } else
            {
                i = 0;
            }
            if (d)
            {
                if (i != 0)
                {
                    i = getHeight();
                } else
                {
                    i = 1;
                }
                l = (long)((float)(a - i) / 0.5F);
                c = an.b(new int[] {
                    i, a
                });
            } else
            {
                i = getHeight();
                l = (long)((float)i / 0.5F);
                c = an.b(new int[] {
                    i, 1
                });
            }
            com.gtp.a.a.b.c.a("VerticalStretchLayout", (new StringBuilder()).append("onPreDraw->duration: ").append(l).toString());
            l = Math.min(l, 400L);
            c.c(l);
            c.a(this);
            c.a(this);
            c.a();
        }
        return flag;
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
    }
}
