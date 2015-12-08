// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.support.v4.app.FragmentActivity;
import com.gau.go.launcherex.gowidget.weather.globalview.c;
import com.gau.go.launcherex.gowidget.weather.model.l;

// Referenced classes of package com.go.weatherex.setting:
//            at

class av
    implements c
{

    final l a;
    final at b;

    av(at at1, l l1)
    {
        b = at1;
        a = l1;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            at.a(b, a.b(), a.d());
            com.gau.go.launcherex.gowidget.weather.b.c.b(b.getActivity().getApplicationContext());
            b.h();
        }
    }
}
