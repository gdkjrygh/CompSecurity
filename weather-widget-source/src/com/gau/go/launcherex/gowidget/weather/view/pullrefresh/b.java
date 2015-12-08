// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.pullrefresh;


// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.pullrefresh:
//            LineRefreshView

class b
    implements Runnable
{

    final LineRefreshView a;

    b(LineRefreshView linerefreshview)
    {
        a = linerefreshview;
        super();
    }

    public void run()
    {
        LineRefreshView.a(a);
        a.invalidate();
        LineRefreshView.b(a);
    }
}
