// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service.a;


// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service.a:
//            a, b

class j
    implements Runnable
{

    a a;
    final b b;

    j(b b1, a a1)
    {
        b = b1;
        super();
        a = a1;
    }

    public void run()
    {
        a.a(b);
        a.a();
        a.b();
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(b, a);
        a = null;
    }
}
