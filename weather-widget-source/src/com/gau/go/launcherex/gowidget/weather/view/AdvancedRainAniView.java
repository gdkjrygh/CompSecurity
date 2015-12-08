// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.util.s;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedAnimationView, aw, e, Water, 
//            WaterDropView, CurveAnimView, au, r

public class AdvancedRainAniView extends AdvancedAnimationView
    implements android.view.animation.Animation.AnimationListener, aw
{

    private View b;
    private Water c;
    private WaterDropView d;
    private View e;
    private View f;
    private TextView g;
    private CurveAnimView h;
    private Animation i;
    private Animation j;
    private Animation k;
    private Animation l;
    private Animation m;
    private Animation n;
    private Runnable o;

    public AdvancedRainAniView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        o = new e(this);
        i = s.a(1000L);
        i.setAnimationListener(this);
        j = s.c(1000L);
        k = s.c(500L);
        k.setAnimationListener(this);
        l = s.c(500L);
    }

    static View a(AdvancedRainAniView advancedrainaniview)
    {
        return advancedrainaniview.b;
    }

    private void a(View view, Animation animation, long l1)
    {
        if (view.getVisibility() != 0)
        {
            view.setVisibility(0);
        }
        animation.setStartOffset(l1);
        view.startAnimation(animation);
    }

    static Animation b(AdvancedRainAniView advancedrainaniview)
    {
        return advancedrainaniview.i;
    }

    static View c(AdvancedRainAniView advancedrainaniview)
    {
        return advancedrainaniview.e;
    }

    static Animation d(AdvancedRainAniView advancedrainaniview)
    {
        return advancedrainaniview.j;
    }

    public void a()
    {
        a = false;
        postDelayed(o, 300L);
    }

    public void b()
    {
        a = true;
        i.cancel();
        j.cancel();
        k.cancel();
        l.cancel();
        m.cancel();
        n.cancel();
        removeCallbacks(o);
        b.setVisibility(4);
        c.a();
        c.setVisibility(4);
        d.c();
        d.a = d.getHeight();
        e.setVisibility(4);
        f.clearAnimation();
        f.setVisibility(4);
        h.a();
        h.setVisibility(4);
    }

    public long c()
    {
        return 6000L;
    }

    public void d()
    {
        a(h, n);
    }

    public void onAnimationEnd(Animation animation)
    {
        if (!a)
        {
            if (animation.equals(i))
            {
                d.b();
                a(f, l, 1000L);
                a(c, k, 1000L);
            } else
            {
                if (animation.equals(k))
                {
                    a(c, m);
                    return;
                }
                if (animation.equals(m))
                {
                    return;
                }
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
        b = findViewById(0x7f0900ce);
        c = (Water)findViewById(0x7f0900cd);
        g = (TextView)findViewById(0x7f0900cf);
        Object obj = c;
        obj.getClass();
        m = new au(((Water) (obj)));
        m.setAnimationListener(this);
        m.setDuration(1500L);
        c.a(g);
        d = (WaterDropView)findViewById(0x7f0900cc);
        d.a(this);
        c.a = d;
        e = findViewById(0x7f0900ad);
        f = findViewById(0x7f0900b8);
        h = (CurveAnimView)findViewById(0x7f0900ca);
        obj = h;
        obj.getClass();
        n = new r(((CurveAnimView) (obj)));
        n.setDuration(2000L);
        n.setAnimationListener(this);
    }
}
