// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.city;

import android.view.animation.Animation;
import com.gau.go.launcherex.gowidget.weather.util.b;

// Referenced classes of package com.go.weatherex.city:
//            h, a, EditCityScrollComponent

class g extends b
{

    final a a;
    final boolean b;
    final EditCityScrollComponent c;

    g(EditCityScrollComponent editcityscrollcomponent, a a1, boolean flag)
    {
        c = editcityscrollcomponent;
        a = a1;
        b = flag;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        a.post(new h(this));
    }

    public void onAnimationStart(Animation animation)
    {
        EditCityScrollComponent.a(c, true);
    }
}
