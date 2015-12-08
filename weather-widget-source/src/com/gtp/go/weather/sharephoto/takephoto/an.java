// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gtp.a.a.b.c;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            ac, ai, aj, ak, 
//            al, am, ao

public abstract class an
{

    protected Context a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected float f;
    protected int g;
    protected int h;
    private View i;
    private int j;
    private PointF k;
    private boolean l;

    public an(Context context, int i1)
    {
        b = -2;
        c = -2;
        d = 720;
        e = 1280;
        f = 1.0F;
        l = false;
        a = context.getApplicationContext();
        j = i1;
        k = new PointF();
    }

    public static an a(Context context, int i1)
    {
        switch (i1)
        {
        default:
            throw new IllegalArgumentException("I think you need to develop a new style watermark...");

        case 0: // '\0'
            return new ac(context);

        case 1: // '\001'
            return new ai(context);

        case 2: // '\002'
            return new aj(context);

        case 3: // '\003'
            return new ak(context);

        case 4: // '\004'
            return new al(context);

        case 5: // '\005'
            return new am(context);
        }
    }

    protected View a(int i1)
    {
        return i.findViewById(i1);
    }

    public abstract ao a();

    public void a(float f1)
    {
        k.set(f1, k.y);
    }

    protected void a(int i1, int j1)
    {
        com.gtp.a.a.b.c.a("WatermarkView", (new StringBuilder()).append("referWidth: ").append(i1).append(", referHeight: ").append(j1).toString());
        b = i1;
        c = j1;
        h = i.getHeight();
        g = i.getWidth();
        c();
        if (!l)
        {
            b();
        }
    }

    protected void a(View view)
    {
        i = view;
        i.setTag(this);
    }

    public void a(WeatherBean weatherbean, u u)
    {
    }

    public void a(boolean flag)
    {
        l = flag;
    }

    protected String b(int i1)
    {
        return a.getString(i1);
    }

    protected abstract void b();

    public void b(float f1)
    {
        k.set(k.x, f1);
    }

    protected final int c(int i1)
    {
        return (b * i1) / d;
    }

    protected void c()
    {
        float f1 = ((float)c * 1.0F) / (float)h;
        float f2 = ((float)b * 1.0F) / (float)g;
        f = Math.min(f1, f2);
        com.gtp.a.a.b.c.a("WatermarkView", (new StringBuilder()).append("scaleH: ").append(f1).append(", scaleW: ").append(f2).toString());
    }

    protected final int d(int i1)
    {
        return (c * i1) / e;
    }

    public View d()
    {
        return i;
    }

    public int e()
    {
        return j;
    }

    public float f()
    {
        return k.x;
    }

    public float g()
    {
        return k.y;
    }

    public Context h()
    {
        return a;
    }

    public int i()
    {
        return (int)((float)g * f);
    }

    public int j()
    {
        return (int)((float)h * f);
    }
}
