// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import com.gau.go.a.e;
import com.gau.go.launcherex.goweather.goplay.a.d;
import com.jiubang.commerce.ad.a.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            g, GoWidgetActivity

class h extends Thread
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public void run()
    {
        Object obj = new d(a.b.getApplicationContext(), "428");
        ((d) (obj)).b("ad_a000");
        if (a.a != null)
        {
            ((d) (obj)).d(a.a.q());
        }
        obj = ((d) (obj)).b();
        e.a(a.b.getApplicationContext()).a(((String) (obj)));
        super.run();
    }
}
