// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.globalview.w;

// Referenced classes of package com.go.weatherex.setting:
//            bg, ba, bk

class bd
    implements w
{

    final ba a;

    bd(ba ba1)
    {
        a = ba1;
        super();
    }

    public void a(t t, boolean flag, a a1)
    {
        if (flag && a1 != null)
        {
            t = (bg)a1.c;
            ba.b(a).f = ((bg) (t)).c;
            ba.d(a).setText(((bg) (t)).a);
        }
    }
}
