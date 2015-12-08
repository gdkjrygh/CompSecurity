// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.c;

import android.app.Activity;
import android.content.Context;
import com.facebook.ads.InterstitialAd;
import com.gau.go.launcherex.goweather.goplay.a.e;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;

// Referenced classes of package com.go.weatherex.ad.c:
//            c, g

public class f extends c
{

    private InterstitialAd c;

    f(Activity activity)
    {
        super(activity);
    }

    protected String a()
    {
        return a(0x7f08003c);
    }

    protected void a(Context context)
    {
        c = new InterstitialAd(context, a());
        c.setAdListener(new g(this));
    }

    public void b()
    {
        c.loadAd();
    }

    public boolean c()
    {
        return c.isAdLoaded();
    }

    public void d()
    {
        c.show();
        String s = (new e("f000", a(), "4", "", "8", "", "")).b();
        com.gau.go.a.e.a(GoWidgetApplication.b()).a(s);
    }

    public void e()
    {
        c.destroy();
    }
}
