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
//            AdvancedAnimationView, g, h

public class AdvancedWidgetAnimView extends AdvancedAnimationView
    implements android.view.animation.Animation.AnimationListener
{

    private View b;
    private View c;
    private View d;
    private Animation e;
    private Animation f;
    private Animation g;
    private Runnable h;
    private Runnable i;

    public AdvancedWidgetAnimView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = new g(this);
        i = new h(this);
        g = s.g(500L);
        e = s.i(500L);
        e.setAnimationListener(this);
        f = s.i(500L);
        f.setAnimationListener(this);
    }

    static View a(AdvancedWidgetAnimView advancedwidgetanimview)
    {
        return advancedwidgetanimview.b;
    }

    static Animation b(AdvancedWidgetAnimView advancedwidgetanimview)
    {
        return advancedwidgetanimview.e;
    }

    static View c(AdvancedWidgetAnimView advancedwidgetanimview)
    {
        return advancedwidgetanimview.c;
    }

    static Animation d(AdvancedWidgetAnimView advancedwidgetanimview)
    {
        return advancedwidgetanimview.g;
    }

    static Animation e(AdvancedWidgetAnimView advancedwidgetanimview)
    {
        return advancedwidgetanimview.f;
    }

    static View f(AdvancedWidgetAnimView advancedwidgetanimview)
    {
        return advancedwidgetanimview.d;
    }

    public void a()
    {
        a = false;
        postDelayed(h, 500L);
    }

    public void b()
    {
        a = true;
        removeCallbacks(h);
        removeCallbacks(i);
        e.cancel();
        f.cancel();
        g.cancel();
        b.setVisibility(0);
        c.setVisibility(4);
        d.setVisibility(4);
    }

    public long c()
    {
        return 3500L;
    }

    public void onAnimationEnd(Animation animation)
    {
        if (!a)
        {
            if (animation.equals(e))
            {
                b.setVisibility(4);
                postDelayed(i, 800L);
            } else
            if (animation.equals(f))
            {
                c.setVisibility(4);
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
        b = findViewById(0x7f0900aa);
        c = findViewById(0x7f0900ab);
        d = findViewById(0x7f0900ac);
    }
}
