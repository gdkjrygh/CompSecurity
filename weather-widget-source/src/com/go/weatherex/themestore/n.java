// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.graphics.Bitmap;
import android.widget.ListView;
import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.gau.go.launcherex.gowidget.weather.service.a.g;
import com.jiubang.playsdk.imageload.KPNetworkImageView;
import com.jiubang.playsdk.main.BitmapBean;
import java.util.Map;

// Referenced classes of package com.go.weatherex.themestore:
//            h, m

class n extends g
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public void b(a a1)
    {
        if (com/go/weatherex/themestore/h.isInstance(a1))
        {
            Object obj = (h)a1;
            a1 = ((h) (obj)).c();
            if (a1 != null && a1.a() != null && !a1.a().isRecycled())
            {
                obj = ((h) (obj)).d();
                com.go.weatherex.themestore.m.a(a).put(obj, a1);
                if (a.a.findViewWithTag(obj) instanceof KPNetworkImageView)
                {
                    com.go.weatherex.themestore.m.a(a, a1, (KPNetworkImageView)a.a.findViewWithTag(obj));
                    return;
                }
            }
        }
    }
}
