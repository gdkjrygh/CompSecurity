// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import com.gau.go.a.e;
import com.gau.go.launcherex.goweather.goplay.a.d;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            GoWidgetActivity

class i extends Thread
{

    final GoWidgetActivity a;

    i(GoWidgetActivity gowidgetactivity)
    {
        a = gowidgetactivity;
        super();
    }

    public void run()
    {
        Object obj = new d(a.getApplicationContext(), "428");
        ((d) (obj)).b("ad_load_f000");
        obj = ((d) (obj)).b();
        e.a(a.getApplicationContext()).a(((String) (obj)));
        super.run();
    }
}
