// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.a;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;

// Referenced classes of package com.gau.go.launcherex.goweather.a:
//            c, d

public class b
{

    private Animation a;
    private Animation b;
    private Animation c;
    private Animation d;

    public b()
    {
        a = new TranslateAnimation(1, -1F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
        a.setInterpolator(new DecelerateInterpolator());
        a.setDuration(150L);
        b = new TranslateAnimation(1, 0.0F, 1, -1F, 1, 0.0F, 1, 0.0F);
        b.setInterpolator(new AccelerateInterpolator());
        b.setDuration(150L);
        c = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
        c.setInterpolator(new DecelerateInterpolator());
        c.setDuration(500L);
        d = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.0F);
        d.setInterpolator(new AccelerateInterpolator());
        d.setDuration(300L);
    }

    public void a(View view, int i)
    {
        view.clearAnimation();
        c c1 = new c(this, view, i);
        if (i == 0)
        {
            a.setAnimationListener(c1);
            view.startAnimation(a);
            return;
        } else
        {
            b.setAnimationListener(c1);
            view.startAnimation(b);
            return;
        }
    }

    public void b(View view, int i)
    {
        view.clearAnimation();
        d d1 = new d(this, view, i);
        if (i == 0)
        {
            c.setAnimationListener(d1);
            view.startAnimation(c);
            return;
        } else
        {
            d.setAnimationListener(d1);
            view.startAnimation(d);
            return;
        }
    }
}
