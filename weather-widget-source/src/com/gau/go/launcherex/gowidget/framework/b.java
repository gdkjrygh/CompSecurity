// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import com.go.weatherex.ad.b.d;
import com.jiubang.commerce.ad.a.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            GoWidgetActivity, c

class b
    implements d
{

    final long a;
    final GoWidgetActivity b;

    b(GoWidgetActivity gowidgetactivity, long l)
    {
        b = gowidgetactivity;
        a = l;
        super();
    }

    public void a(int i)
    {
    }

    public void a(a a1)
    {
        if (a1 != null)
        {
            a(b.getApplicationContext(), a1.i(), new c(this, a1));
        }
    }
}
