// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;


// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            Earth

class s
    implements Runnable
{

    final Earth a;

    s(Earth earth)
    {
        a = earth;
        super();
    }

    public void run()
    {
        Earth.a(a);
        a.invalidate();
    }
}
