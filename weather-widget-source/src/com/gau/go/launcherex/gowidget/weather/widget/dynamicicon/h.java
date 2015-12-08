// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.View;
import com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a.c;
import com.jiubang.core.a.i;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon:
//            f

public class h extends f
{

    private int b;
    private i c;
    private float d;
    private float e;
    private int f;
    private int g;

    public h(Context context)
    {
        super(context);
        b = 495;
        c = null;
        d = 1.0F;
        e = 1.0F;
        float f1 = a.getResources().getDisplayMetrics().density;
        f = (int)(133.3333F * f1);
        g = (int)(f1 * 133.3333F);
    }

    private void a(int j, int k)
    {
        if (j != 0 && k != 0)
        {
            e = com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a.c.b(j, f);
            d = com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a.c.a(k, g);
        }
    }

    private void b()
    {
        b = b - 1;
        if (b < 0)
        {
            b = 0;
        }
    }

    public void a(Canvas canvas, View view)
    {
label0:
        {
            if (c != null)
            {
                if (a())
                {
                    break label0;
                }
                c.a(System.currentTimeMillis());
                canvas.save();
                canvas.scale(e, d);
                c.a(canvas, c.h(), c.i(), 0.0F, view.getWidth(), 255);
                canvas.restore();
                b();
            }
            return;
        }
        canvas.save();
        canvas.scale(e, d);
        c.a(canvas, c.h(), c.i(), 0.0F, view.getWidth(), 255);
        canvas.restore();
    }

    public void a(View view)
    {
        if (c != null)
        {
            c.a(0, 0, view.getWidth(), view.getHeight());
        }
        a(view.getWidth(), view.getHeight());
    }

    public void a(i j)
    {
        c = j;
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            b = 495;
            return;
        } else
        {
            b = 5;
            return;
        }
    }

    public boolean a()
    {
        return b == 0;
    }
}
