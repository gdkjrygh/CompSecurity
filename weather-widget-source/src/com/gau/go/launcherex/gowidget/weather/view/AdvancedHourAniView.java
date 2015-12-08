// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.util.s;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedAnimationView, d, q, Clock

public class AdvancedHourAniView extends AdvancedAnimationView
    implements android.view.animation.Animation.AnimationListener
{

    private Clock b;
    private TextView c;
    private TextView d;
    private Animation e;
    private Animation f;
    private Animation g;
    private Animation h;
    private q i;
    private q j;
    private Runnable k;

    public AdvancedHourAniView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        k = new d(this);
        e = s.d(500L);
        e.setAnimationListener(this);
        f = s.d(500L);
        f.setAnimationListener(this);
        g = s.c(300L);
        g.setAnimationListener(this);
        h = s.c(300L);
        h.setAnimationListener(this);
    }

    static q a(AdvancedHourAniView advancedhouraniview)
    {
        return advancedhouraniview.i;
    }

    static Clock b(AdvancedHourAniView advancedhouraniview)
    {
        return advancedhouraniview.b;
    }

    public void a()
    {
        a = false;
        postDelayed(k, 300L);
    }

    public void b()
    {
        a = true;
        e.cancel();
        f.cancel();
        g.cancel();
        h.cancel();
        i.cancel();
        j.cancel();
        removeCallbacks(k);
        c.setText("45");
        c.clearAnimation();
        b.a();
    }

    public long c()
    {
        return 4500L;
    }

    public void onAnimationEnd(Animation animation)
    {
        if (!a)
        {
            if (animation.equals(i))
            {
                a(c, e);
            } else
            {
                if (animation.equals(e))
                {
                    c.setText("50");
                    a(c, g);
                    return;
                }
                if (animation.equals(g))
                {
                    a(b, j);
                    return;
                }
                if (animation.equals(j))
                {
                    a(c, f);
                    return;
                }
                if (animation.equals(f))
                {
                    c.setText("53");
                    a(c, h);
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
        b = (Clock)findViewById(0x7f0900b7);
        Clock clock = b;
        clock.getClass();
        i = new q(clock, 10);
        i.setDuration(800L);
        i.setAnimationListener(this);
        clock = b;
        clock.getClass();
        j = new q(clock, 11);
        j.setDuration(800L);
        j.setAnimationListener(this);
        c = (TextView)findViewById(0x7f0900b9);
        c.setText("45");
        d = (TextView)findViewById(0x7f0900ba);
        b.a(d);
    }
}
