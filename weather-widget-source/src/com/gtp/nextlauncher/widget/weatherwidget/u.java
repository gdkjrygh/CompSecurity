// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;


// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            t, HourlyTypeView, e

class u
    implements Runnable
{

    final t a;

    u(t t1)
    {
        a = t1;
        super();
    }

    public void run()
    {
        HourlyTypeView.access$200(a.a).d();
    }
}
