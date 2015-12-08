// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service.a;

import java.util.concurrent.Executor;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service.a:
//            b, a

final class d
    implements Runnable
{

    final a a;
    final Executor b;

    d(a a1, Executor executor)
    {
        a = a1;
        b = executor;
        super();
    }

    public void run()
    {
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(com.gau.go.launcherex.gowidget.weather.service.a.b.a(), a, b);
    }
}
