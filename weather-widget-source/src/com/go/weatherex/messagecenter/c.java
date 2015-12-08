// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.messagecenter;

import android.support.v4.app.FragmentActivity;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

// Referenced classes of package com.go.weatherex.messagecenter:
//            g, b

class c
    implements com.gau.go.launcherex.gowidget.weather.globalview.c
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            (new g(a, a.getActivity().getContentResolver())).startDelete(-1, null, WeatherContentProvider.q, "is_read=?", new String[] {
                "1"
            });
        }
    }
}
