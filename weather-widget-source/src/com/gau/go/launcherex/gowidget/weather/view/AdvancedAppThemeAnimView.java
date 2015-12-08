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
//            AdvancedAnimationView, a

public class AdvancedAppThemeAnimView extends AdvancedAnimationView
    implements android.view.animation.Animation.AnimationListener
{

    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private Animation g;
    private Animation h;
    private Animation i;
    private Animation j;
    private Animation k;
    private Runnable l;

    public AdvancedAppThemeAnimView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        l = new a(this);
        g = s.a(800L);
        g.setAnimationListener(this);
        h = s.c(800L);
        i = s.a(false, 400L);
        i.setAnimationListener(this);
        j = s.a(false, 400L);
        j.setAnimationListener(this);
        k = s.b(true, 400L);
    }

    static View a(AdvancedAppThemeAnimView advancedappthemeanimview)
    {
        return advancedappthemeanimview.d;
    }

    static Animation b(AdvancedAppThemeAnimView advancedappthemeanimview)
    {
        return advancedappthemeanimview.k;
    }

    static View c(AdvancedAppThemeAnimView advancedappthemeanimview)
    {
        return advancedappthemeanimview.e;
    }

    static Animation d(AdvancedAppThemeAnimView advancedappthemeanimview)
    {
        return advancedappthemeanimview.j;
    }

    public void a()
    {
        a = false;
        a(b, g);
        a(f, h);
    }

    public void b()
    {
        a = true;
        removeCallbacks(l);
        g.cancel();
        h.cancel();
        i.cancel();
        j.cancel();
        k.cancel();
        b.clearAnimation();
        b.setVisibility(4);
        f.clearAnimation();
        f.setVisibility(4);
        c.clearAnimation();
        c.setVisibility(0);
        d.clearAnimation();
        d.setVisibility(4);
        e.clearAnimation();
        e.setVisibility(4);
    }

    public long c()
    {
        return 3300L;
    }

    public void onAnimationEnd(Animation animation)
    {
        if (!a)
        {
            if (animation.equals(g))
            {
                a(c, k);
                a(d, i);
            } else
            {
                if (animation.equals(i))
                {
                    c.setVisibility(4);
                    postDelayed(l, 500L);
                    return;
                }
                if (animation.equals(j))
                {
                    d.setVisibility(4);
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
        b = findViewById(0x7f0900a9);
        c = findViewById(0x7f0900aa);
        d = findViewById(0x7f0900ab);
        e = findViewById(0x7f0900ac);
        f = findViewById(0x7f0900ad);
    }
}
