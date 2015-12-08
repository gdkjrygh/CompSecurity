// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.a;

import android.app.Activity;
import android.view.View;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.gau.go.launcherex.goweather.goplay.a.e;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;

// Referenced classes of package com.go.weatherex.ad.a:
//            a, b, i, k

public class j extends a
{

    private AdView c;

    public j(Activity activity)
    {
        super(activity);
    }

    public b a()
    {
        return b.c;
    }

    public void a(boolean flag)
    {
        if (b != null)
        {
            b.e(this);
        }
        if (c != null)
        {
            c.destroy();
            c = null;
        }
        if (!flag)
        {
            String s = (new e("a000", i(), "1", "", "", "", "")).b();
            com.gau.go.a.e.a(GoWidgetApplication.b()).a(s);
        }
    }

    public View b()
    {
        if (c == null)
        {
            AdSize adsize;
            if (h())
            {
                adsize = AdSize.BANNER_HEIGHT_90;
            } else
            {
                adsize = AdSize.BANNER_HEIGHT_50;
            }
            c = new AdView(a, i(), adsize);
            c.setAdListener(new k(this));
        }
        return c;
    }

    public void c()
    {
        if (c == null)
        {
            b();
        }
        if (c != null)
        {
            c.loadAd();
        }
    }

    public boolean f()
    {
        return android.os.Build.VERSION.SDK_INT >= 9;
    }

    public boolean g()
    {
        return true;
    }

    public String i()
    {
        return a.getString(0x7f08003b);
    }
}
