// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme;

import android.content.Context;
import android.os.Build;
import com.gau.go.launcherex.gowidget.statistics.w;

public abstract class b
{

    public static String a(Context context)
    {
        boolean flag = true;
        StringBuffer stringbuffer = new StringBuffer(64);
        stringbuffer.append("2#");
        stringbuffer.append("android#");
        stringbuffer.append((new StringBuilder()).append(Build.MODEL).append("#").toString());
        stringbuffer.append((new StringBuilder()).append(w.d(context)).append("#").toString());
        stringbuffer.append((new StringBuilder()).append(w.f(context)).append("#").toString());
        stringbuffer.append((new StringBuilder()).append(w.q(context)).append("#").toString());
        stringbuffer.append((new StringBuilder()).append(w.c(context)).append("#").toString());
        stringbuffer.append((new StringBuilder()).append(android.os.Build.VERSION.SDK_INT).append("#").toString());
        stringbuffer.append((new StringBuilder()).append(w.r(context)).append("#").toString());
        int i;
        if (w.s(context))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        stringbuffer.append((new StringBuilder()).append(i).append("#").toString());
        if (w.a())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        stringbuffer.append((new StringBuilder()).append(i).append("#").toString());
        stringbuffer.append((new StringBuilder()).append(w.k(context)).append("#").toString());
        stringbuffer.append((new StringBuilder()).append(w.n(context)).append("#").toString());
        stringbuffer.append((new StringBuilder()).append(w.u(context)).append("#").toString());
        stringbuffer.append((new StringBuilder()).append(w.b()).append("#").toString());
        stringbuffer.append(w.e(context));
        return stringbuffer.toString();
    }
}
