// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.util.s;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedAnimationView, b, c, DayIcon, 
//            MultiDayScrollView

public class AdvancedDayAniView extends AdvancedAnimationView
    implements android.view.animation.Animation.AnimationListener
{

    private TextView b;
    private MultiDayScrollView c;
    private MultiDayScrollView d;
    private int e[] = {
        1, 2, 3, 1, 2, 3, 1, 2, 3
    };
    private String f[] = {
        "5/20", "5/21", "5/22", "5/23", "5/24", "5/25", "5/26", "5/27", "5/28"
    };
    private LayoutInflater g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private Drawable k;
    private Drawable l;
    private Drawable m;
    private Animation n;
    private Animation o;
    private Animation p;
    private Animation q;
    private Animation r;
    private Animation s;
    private TextView t;
    private TextView u;
    private Runnable v;
    private Runnable w;

    public AdvancedDayAniView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = LayoutInflater.from(context);
        p = com.gau.go.launcherex.gowidget.weather.util.s.f(400L);
        q = com.gau.go.launcherex.gowidget.weather.util.s.d(300L);
        q.setAnimationListener(this);
        r = com.gau.go.launcherex.gowidget.weather.util.s.d(300L);
        r.setAnimationListener(this);
        s = com.gau.go.launcherex.gowidget.weather.util.s.c(200L);
        n = com.gau.go.launcherex.gowidget.weather.util.s.h(400L);
        n.setAnimationListener(this);
        o = com.gau.go.launcherex.gowidget.weather.util.s.h(400L);
        o.setAnimationListener(this);
        a(context);
    }

    private Drawable a(int i1, boolean flag)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            if (flag)
            {
                return h;
            } else
            {
                return k;
            }

        case 2: // '\002'
            if (flag)
            {
                return i;
            } else
            {
                return l;
            }

        case 3: // '\003'
            break;
        }
        if (flag)
        {
            return j;
        } else
        {
            return m;
        }
    }

    static TextView a(AdvancedDayAniView advanceddayaniview)
    {
        return advanceddayaniview.t;
    }

    private void a(Context context)
    {
        context = context.getResources();
        h = context.getDrawable(0x7f020044);
        Rect rect = new Rect(0, 0, h.getIntrinsicWidth(), h.getIntrinsicHeight());
        h.setBounds(rect);
        k = context.getDrawable(0x7f020045);
        i = context.getDrawable(0x7f020023);
        i.setBounds(rect);
        l = context.getDrawable(0x7f020024);
        j = context.getDrawable(0x7f02003c);
        m = context.getDrawable(0x7f02003d);
        j.setBounds(rect);
    }

    static Animation b(AdvancedDayAniView advanceddayaniview)
    {
        return advanceddayaniview.n;
    }

    static TextView c(AdvancedDayAniView advanceddayaniview)
    {
        return advanceddayaniview.u;
    }

    static Animation d(AdvancedDayAniView advanceddayaniview)
    {
        return advanceddayaniview.p;
    }

    private void d()
    {
        v = new b(this);
        w = new c(this);
    }

    static MultiDayScrollView e(AdvancedDayAniView advanceddayaniview)
    {
        return advanceddayaniview.c;
    }

    private void e()
    {
        for (int i1 = 0; i1 < 5; i1++)
        {
            DayIcon dayicon = (DayIcon)g.inflate(0x7f03000f, null);
            dayicon.a(f[i1]);
            dayicon.a(a(e[i1], false));
            c.addView(dayicon);
        }

        for (int j1 = 4; j1 < 9; j1++)
        {
            DayIcon dayicon1 = (DayIcon)g.inflate(0x7f03000f, null);
            dayicon1.a(f[j1]);
            dayicon1.a(a(e[j1], false));
            d.addView(dayicon1);
        }

    }

    static MultiDayScrollView f(AdvancedDayAniView advanceddayaniview)
    {
        return advanceddayaniview.d;
    }

    static TextView g(AdvancedDayAniView advanceddayaniview)
    {
        return advanceddayaniview.b;
    }

    static Animation h(AdvancedDayAniView advanceddayaniview)
    {
        return advanceddayaniview.q;
    }

    static Animation i(AdvancedDayAniView advanceddayaniview)
    {
        return advanceddayaniview.o;
    }

    static Animation j(AdvancedDayAniView advanceddayaniview)
    {
        return advanceddayaniview.r;
    }

    public void a()
    {
        postDelayed(v, 500L);
    }

    public void b()
    {
        a = true;
        removeCallbacks(v);
        removeCallbacks(w);
        n.cancel();
        o.cancel();
        p.cancel();
        q.cancel();
        r.cancel();
        s.cancel();
        t.clearAnimation();
        t.setText(String.valueOf(23));
        u.clearAnimation();
        u.setText(String.valueOf(24));
        u.setVisibility(4);
        b.clearAnimation();
        b.setText("Sunny");
        b.setCompoundDrawables(null, a(1, true), null, null);
        c.a();
        d.a();
    }

    public long c()
    {
        return 3500L;
    }

    public void onAnimationEnd(Animation animation)
    {
        if (animation.equals(n))
        {
            t.setText(String.valueOf(24));
            u.setVisibility(4);
            postDelayed(w, 800L);
        } else
        {
            if (animation.equals(o))
            {
                t.setText(String.valueOf(25));
                u.setVisibility(4);
                return;
            }
            if (animation.equals(q))
            {
                b.setText("Cloudy");
                b.setCompoundDrawables(null, a(2, true), null, null);
                a(b, s);
                return;
            }
            if (animation.equals(r))
            {
                b.setText("Overcast");
                b.setCompoundDrawables(null, a(3, true), null, null);
                a(b, s);
                return;
            }
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = (TextView)findViewById(0x7f0900af);
        t = (TextView)findViewById(0x7f0900b1);
        u = (TextView)findViewById(0x7f0900b2);
        c = (MultiDayScrollView)findViewById(0x7f0900b3);
        d = (MultiDayScrollView)findViewById(0x7f0900b4);
        e();
        d();
    }
}
