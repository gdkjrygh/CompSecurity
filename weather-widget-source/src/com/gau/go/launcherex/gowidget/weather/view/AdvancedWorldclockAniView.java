// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.gau.go.launcherex.gowidget.weather.util.s;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedAnimationView, aa, LineAnimView

public class AdvancedWorldclockAniView extends AdvancedAnimationView
    implements android.view.animation.Animation.AnimationListener
{

    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View m;
    private View n;
    private LineAnimView o;
    private LineAnimView p;
    private LineAnimView q;
    private aa r;
    private aa s;
    private aa t;
    private Animation u;
    private Animation v;

    public AdvancedWorldclockAniView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        u = new AlphaAnimation(0.0F, 1.0F);
        u.setDuration(800L);
        v = com.gau.go.launcherex.gowidget.weather.util.s.a(500L, -0.5F);
        v.setInterpolator(new AccelerateInterpolator(1.5F));
        v.setAnimationListener(this);
    }

    public void a()
    {
        a = false;
        a(b, u);
        a(c, v);
        a(f, v);
        a(d, v);
        a(e, v);
    }

    public void b()
    {
        a = true;
        r.cancel();
        s.cancel();
        t.cancel();
        u.cancel();
        v.cancel();
        b.setVisibility(4);
        e.setVisibility(4);
        c.setVisibility(4);
        f.setVisibility(4);
        d.setVisibility(4);
        q.setVisibility(4);
        p.setVisibility(4);
        o.setVisibility(4);
        i.setVisibility(4);
        g.setVisibility(4);
        j.setVisibility(4);
        h.setVisibility(4);
        m.setVisibility(4);
        k.setVisibility(4);
        l.setVisibility(4);
        n.setVisibility(4);
    }

    public long c()
    {
        return 3000L;
    }

    public void onAnimationEnd(Animation animation)
    {
        if (!a)
        {
            if (animation.equals(v))
            {
                g.setVisibility(0);
                h.setVisibility(0);
                i.setVisibility(0);
                j.setVisibility(0);
                a(k, com.gau.go.launcherex.gowidget.weather.util.s.a(500L, -0.2F));
                a(p, s);
                a(q, t);
                a(o, r);
            } else
            {
                if (animation.equals(s))
                {
                    a(m, com.gau.go.launcherex.gowidget.weather.util.s.a(500L, -0.5F));
                    return;
                }
                if (animation.equals(t))
                {
                    a(n, com.gau.go.launcherex.gowidget.weather.util.s.a(500L, -0.5F));
                    return;
                }
                if (animation.equals(r))
                {
                    a(l, com.gau.go.launcherex.gowidget.weather.util.s.a(500L, -0.5F));
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
        b = findViewById(0x7f0900d3);
        c = findViewById(0x7f0900d7);
        f = findViewById(0x7f0900dd);
        d = findViewById(0x7f0900d5);
        e = findViewById(0x7f0900da);
        g = findViewById(0x7f0900d6);
        j = findViewById(0x7f0900dc);
        h = findViewById(0x7f0900d4);
        i = findViewById(0x7f0900d9);
        k = findViewById(0x7f0900e0);
        n = findViewById(0x7f0900e2);
        l = findViewById(0x7f0900df);
        m = findViewById(0x7f0900e1);
        q = (LineAnimView)findViewById(0x7f0900de);
        q.a(true);
        LineAnimView lineanimview = q;
        lineanimview.getClass();
        t = new aa(lineanimview);
        t.setDuration(500L);
        t.setAnimationListener(this);
        o = (LineAnimView)findViewById(0x7f0900d8);
        lineanimview = o;
        lineanimview.getClass();
        r = new aa(lineanimview);
        r.setDuration(800L);
        r.setStartOffset(300L);
        r.setAnimationListener(this);
        p = (LineAnimView)findViewById(0x7f0900db);
        lineanimview = p;
        lineanimview.getClass();
        s = new aa(lineanimview);
        s.setDuration(800L);
        s.setStartOffset(100L);
        s.setAnimationListener(this);
    }
}
