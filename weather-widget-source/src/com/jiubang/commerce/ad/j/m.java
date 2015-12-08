// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import android.content.Context;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import com.jiubang.commerce.ad.f;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            n, o

public class m
{

    private static m a;
    private Context b;
    private WindowManager c;
    private android.view.WindowManager.LayoutParams d;
    private o e;
    private boolean f;
    private Handler g;
    private Runnable h;

    private m(Context context)
    {
        g = new Handler();
        h = new n(this);
        if (context != null)
        {
            context = context.getApplicationContext();
        } else
        {
            context = null;
        }
        b = context;
        f = true;
    }

    public static m a(Context context)
    {
        if (a == null)
        {
            a = new m(context);
        }
        return a;
    }

    static o a(m m1)
    {
        return m1.e;
    }

    static Context b(m m1)
    {
        return m1.b;
    }

    private void b(Context context)
    {
        if (e == null)
        {
            e = new o(this, context);
        }
    }

    static android.view.WindowManager.LayoutParams c(m m1)
    {
        return m1.d;
    }

    private void c()
    {
        g.postDelayed(h, 3000L);
        if (f)
        {
            c.addView(e, d);
            f = false;
        }
    }

    private void c(Context context)
    {
        if (c == null)
        {
            c = (WindowManager)context.getSystemService("window");
        }
    }

    static WindowManager d(m m1)
    {
        return m1.c;
    }

    private void d(Context context)
    {
        if (d == null)
        {
            d = new android.view.WindowManager.LayoutParams();
            context = new DisplayMetrics();
            c.getDefaultDisplay().getMetrics(context);
            d.type = 2003;
            d.format = 1;
            d.flags = 0x40008;
            d.gravity = 51;
            d.width = e.b;
            d.height = e.c;
            d.x = com.jiubang.commerce.ad.f.a(b).d("ad_gp_install_btn_margin_left_edge");
            d.y = com.jiubang.commerce.ad.f.a(b).d("ad_gp_install_btn_margin_top_include_btn_height");
        }
    }

    public void a()
    {
        b(b);
        c(b);
        d(b);
        c();
    }

    public void b()
    {
        if (c != null && !f)
        {
            e.d.setAlpha(0);
            e.a.setAlpha(0);
            g.removeCallbacks(h);
            c.removeView(e);
            e = null;
            f = true;
        }
    }
}
