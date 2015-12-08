// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.city;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.viewex.FitBottomBackgroundView;

public class a extends FrameLayout
{

    public String a;
    public String b;
    public float c;
    public int d;
    public int e;
    public int f;
    public String g;
    public String h;
    private FitBottomBackgroundView i;
    private View j;
    private ImageView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private Drawable o;
    private e p;

    public a(Context context)
    {
        super(context);
        c = -10000F;
        d = 1;
        e = 1;
        f = -10000;
        p = com.gau.go.launcherex.gowidget.weather.c.c.a(getContext()).f();
        LayoutInflater.from(context).inflate(0x7f03004f, this);
        i = (FitBottomBackgroundView)findViewById(0x7f09022b);
        j = findViewById(0x7f09022f);
        k = (ImageView)findViewById(0x7f090082);
        l = (TextView)findViewById(0x7f09022e);
        m = (TextView)findViewById(0x7f0900b9);
        n = (TextView)findViewById(0x7f09022d);
        context = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Thin.ttf");
        if (context != null)
        {
            m.setTypeface(context);
            n.setTypeface(context);
        }
    }

    private int a(int i1)
    {
label0:
        {
            int j1 = -10000;
            if (c != -10000F)
            {
                if (i1 != 1)
                {
                    break label0;
                }
                j1 = q.a(q.b(c, 1));
            }
            return j1;
        }
        return (int)c;
    }

    private void a(int i1, int ai[])
    {
        switch (i1)
        {
        default:
            return;

        case 1: // '\001'
            ai[0] = 0x7f020095;
            return;

        case 2: // '\002'
            if (c())
            {
                ai[0] = 0x7f020099;
                return;
            } else
            {
                ai[0] = 0x7f02009a;
                return;
            }

        case 3: // '\003'
            if (c())
            {
                ai[0] = 0x7f020092;
                return;
            } else
            {
                ai[0] = 0x7f020093;
                return;
            }

        case 4: // '\004'
            ai[0] = 0x7f020096;
            return;

        case 5: // '\005'
            ai[0] = 0x7f020098;
            return;

        case 6: // '\006'
            ai[0] = 0x7f020094;
            return;

        case 7: // '\007'
            ai[0] = 0x7f020097;
            return;

        case 8: // '\b'
            ai[0] = 0x7f02009b;
            return;
        }
    }

    private void a(Drawable drawable)
    {
        if (drawable != null)
        {
            l.setCompoundDrawablePadding(com.gau.go.a.f.c.a(3F));
        } else
        {
            l.setCompoundDrawablePadding(0);
        }
        l.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
    }

    private void b(WeatherBean weatherbean)
    {
        a = weatherbean.c();
        b = weatherbean.d();
        c = weatherbean.l.a(2);
        d = weatherbean.l.d();
        e = weatherbean.e();
        f = weatherbean.l.n();
        g = weatherbean.l.j();
        h = weatherbean.l.k();
    }

    public void a()
    {
        l.setText(b);
        int ai[];
        int i1;
        if (b())
        {
            if (o == null)
            {
                o = getResources().getDrawable(0x7f0202e4);
            }
            a(o);
        } else
        {
            a(((Drawable) (null)));
        }
        i1 = a(p.a().g);
        if (i1 != -10000)
        {
            m.setText(String.valueOf(i1));
            if (n.getVisibility() != 0)
            {
                n.setVisibility(0);
            }
        } else
        {
            m.setText("N/A");
            n.setVisibility(8);
        }
        i.a(com.gau.go.launcherex.gowidget.scriptengine.parser.e.a(getContext(), d, c(), i.getWidth(), i.getHeight()));
        ai = new int[1];
        a(d, ai);
        k.setImageResource(ai[0]);
    }

    public void a(WeatherBean weatherbean)
    {
        b(weatherbean);
        a();
        invalidate();
    }

    public void a(boolean flag)
    {
        View view = j;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        view.setVisibility(i1);
    }

    public boolean b()
    {
        if (e != -1)
        {
            return e != 1;
        } else
        {
            return false;
        }
    }

    public boolean c()
    {
        c c1 = com.gau.go.launcherex.gowidget.weather.c.c.a(getContext());
        g g1 = c1.g();
        if (c1.e().b() && g1.d())
        {
            android.text.format.Time time = g1.b(f);
            return r.a(g, h, time);
        } else
        {
            return r.a(g, h);
        }
    }
}
