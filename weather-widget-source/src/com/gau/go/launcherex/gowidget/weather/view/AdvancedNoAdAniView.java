// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import com.gau.go.launcherex.gowidget.weather.util.s;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedAnimationView

public class AdvancedNoAdAniView extends AdvancedAnimationView
    implements android.view.animation.Animation.AnimationListener
{

    private View b;
    private View c;
    private View d;
    private Animation e;
    private Animation f;
    private Animation g;

    public AdvancedNoAdAniView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = s.a(1000L);
        e.setAnimationListener(this);
        f = s.c(1000L);
        g = s.e(1000L);
        g.setFillAfter(true);
    }

    public void a()
    {
        a = false;
        a(b, e);
        a(c, f);
    }

    public void b()
    {
        a = true;
        e.cancel();
        f.cancel();
        g.cancel();
        b.setVisibility(4);
        d.clearAnimation();
        d.setVisibility(4);
        c.setVisibility(4);
    }

    public long c()
    {
        return 3000L;
    }

    public void onAnimationEnd(Animation animation)
    {
        if (!a && animation.equals(e))
        {
            a(d, g);
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
        b = findViewById(0x7f0900bf);
        c = findViewById(0x7f0900ad);
        d = findViewById(0x7f0900c0);
    }
}
