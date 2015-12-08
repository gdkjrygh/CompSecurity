// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.pm.ResolveInfo;
import com.gau.go.launcherex.gowidget.weather.globalview.c;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AppListActivity

class k
    implements c
{

    final int a;
    final AppListActivity b;

    k(AppListActivity applistactivity, int i)
    {
        b = applistactivity;
        a = i;
        super();
    }

    public void a(boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        ResolveInfo resolveinfo = (ResolveInfo)AppListActivity.b(b).get(a);
        AppListActivity.f(b);
        JVM INSTR tableswitch 1 2: default 52
    //                   1 53
    //                   2 62;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        AppListActivity.a(b, resolveinfo);
        return;
_L4:
        AppListActivity.b(b, resolveinfo);
        return;
    }
}
