// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import com.gau.go.a.e;
import com.gau.go.launcherex.goweather.goplay.a.d;
import com.jiubang.commerce.ad.a.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            GoWidgetActivity

class l extends Thread
{

    final a a;
    final GoWidgetActivity b;

    l(GoWidgetActivity gowidgetactivity, a a1)
    {
        b = gowidgetactivity;
        a = a1;
        super();
    }

    public void run()
    {
        Object obj = new d(b.getApplicationContext(), "428");
        ((d) (obj)).b("ad_br_f000");
        if (a != null)
        {
            ((d) (obj)).d(a.q());
        }
        obj = ((d) (obj)).b();
        e.a(b.getApplicationContext()).a(((String) (obj)));
        super.run();
    }
}
