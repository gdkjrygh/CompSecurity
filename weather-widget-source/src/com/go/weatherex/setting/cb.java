// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.globalview.w;
import com.go.weatherex.wear.b;

final class cb
    implements w
{

    final com.go.weatherex.framework.fragment.a a;

    cb(com.go.weatherex.framework.fragment.a a1)
    {
        a = a1;
        super();
    }

    public void a(t t, boolean flag, a a1)
    {
        if (flag && a1 != null)
        {
            t = (String)a1.c;
            if (!TextUtils.isEmpty(t))
            {
                b.a(a.getActivity()).a(t);
                a.a(19, t);
            }
        }
    }
}
