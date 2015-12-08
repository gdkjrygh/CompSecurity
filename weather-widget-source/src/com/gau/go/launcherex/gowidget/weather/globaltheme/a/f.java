// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.a;

import android.content.Context;
import com.android.a.aa;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.go.weatherex.themestore.ac;
import com.gtp.a.a.b.c;
import com.jiubang.playsdk.a.k;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.a:
//            g

final class f
    implements k
{

    final Context a;

    f(Context context)
    {
        a = context;
        super();
    }

    public void a(aa aa1)
    {
        c.a("WidgetStarManager", (new StringBuilder()).append("queryForHasNewState->onErrorResponse->thread id: ").append(Thread.currentThread().getId()).toString());
        c.a("WidgetStarManager", (new StringBuilder()).append("queryForHasNewState->onErrorResponse: ").append(aa1.getMessage()).toString());
    }

    public void a(Boolean boolean1)
    {
        c.a("WidgetStarManager", (new StringBuilder()).append("queryForHasNewState->onDataListner->thread id: ").append(Thread.currentThread().getId()).toString());
        c.a("WidgetStarManager", (new StringBuilder()).append("queryForHasNewState->onDataListner: ").append(boolean1).toString());
        if (boolean1.booleanValue())
        {
            q.a(a).a(new a(93, "news001"));
        }
        ac.a(new g(this, boolean1));
        ac.c();
    }

    public volatile void a(Object obj)
    {
        a((Boolean)obj);
    }
}
