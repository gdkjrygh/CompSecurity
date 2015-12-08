// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.graphics.Bitmap;
import android.widget.ListView;
import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.gau.go.launcherex.gowidget.weather.service.a.g;
import com.go.weatherex.themestore.h;
import com.jiubang.playsdk.imageload.KPNetworkImageView;
import com.jiubang.playsdk.main.BitmapBean;
import java.util.Map;

// Referenced classes of package com.go.weatherex.setting:
//            y

class z extends g
{

    final y a;

    z(y y1)
    {
        a = y1;
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
                com.go.weatherex.setting.y.a(a).put(obj, a1);
                if (y.b(a).findViewWithTag(obj) instanceof KPNetworkImageView)
                {
                    com.go.weatherex.setting.y.a(a, a1, (KPNetworkImageView)y.c(a).findViewWithTag(obj));
                    return;
                }
            }
        }
    }
}
