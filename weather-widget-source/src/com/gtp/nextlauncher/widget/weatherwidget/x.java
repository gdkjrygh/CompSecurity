// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;


// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            HourlyTypeView

class x
    implements Runnable
{

    final HourlyTypeView a;

    x(HourlyTypeView hourlytypeview)
    {
        a = hourlytypeview;
        super();
    }

    public void run()
    {
        a.onMyLoadFinish();
    }
}
