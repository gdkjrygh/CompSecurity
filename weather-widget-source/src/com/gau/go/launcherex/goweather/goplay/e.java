// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import com.go.weatherex.common.d;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            ThemeDataHandler

class e
    implements d
{

    final ThemeDataHandler a;

    e(ThemeDataHandler themedatahandler)
    {
        a = themedatahandler;
        super();
    }

    public void a(String s)
    {
        ThemeDataHandler.a(a, s);
    }

    public void b(String s)
    {
        ThemeDataHandler.b(a, s);
    }

    public void c(String s)
    {
    }

    public void d(String s)
    {
        ThemeDataHandler.c(a, s);
    }
}
