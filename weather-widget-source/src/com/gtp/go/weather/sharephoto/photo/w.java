// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.content.Intent;
import android.view.View;
import com.gau.go.a.e;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.f.b;
import com.gtp.go.weather.coupon.view.CouponsActivity;
import com.gtp.go.weather.sharephoto.b.g;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            PhotoActivity

class w
    implements android.view.View.OnClickListener
{

    final g a;
    final PhotoActivity b;

    w(PhotoActivity photoactivity, g g1)
    {
        b = photoactivity;
        a = g1;
        super();
    }

    public void onClick(View view)
    {
        if (!r.a(view))
        {
            return;
        }
        if (PhotoActivity.i(b) == 1 && PhotoActivity.j(b) && a.a() == -10000L)
        {
            if (PhotoActivity.k(b))
            {
                com.go.weatherex.f.b.a(b.getApplicationContext());
                view = (new com.gau.go.launcherex.goweather.goplay.a.g("a001", "", "", "", "", "", "")).b();
                e.a(GoWidgetApplication.b()).a(view);
                return;
            } else
            {
                view = new Intent();
                view.setFlags(0x4000000);
                view.setClass(b, com/gtp/go/weather/coupon/view/CouponsActivity);
                b.startActivity(view);
                return;
            }
        } else
        {
            com.gtp.go.weather.sharephoto.photo.PhotoActivity.a(b, a.a(), 1);
            view = new a(117, "click_fs");
            view.a(String.valueOf(a.a()));
            view.e("1");
            q.a(b.getApplicationContext()).a(view);
            return;
        }
    }
}
