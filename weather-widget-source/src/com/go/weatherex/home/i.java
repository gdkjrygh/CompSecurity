// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.view.View;
import android.view.animation.Animation;
import com.gau.go.launcherex.gowidget.weather.util.b;
import com.go.weatherex.viewex.CityNameSwitcher;

// Referenced classes of package com.go.weatherex.home:
//            c

class i extends b
{

    final c a;

    i(c c1)
    {
        a = c1;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        com.go.weatherex.home.c.b(a).getCurrentView().clearAnimation();
        com.go.weatherex.home.c.b(a).invalidate();
    }
}
