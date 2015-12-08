// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.a.a.a;
import com.a.a.b;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            n

class r
    implements b
{

    final n a;

    r(n n1)
    {
        a = n1;
        super();
    }

    public void a(a a1)
    {
    }

    public void b(a a1)
    {
    }

    public void c(a a1)
    {
        if (!n.c(a))
        {
            ((ViewGroup)n.d(a).getWindow().getDecorView()).removeView(n.e(a));
            com.gau.go.launcherex.gowidget.weather.globalview.n.a(a).scrollTo(com.gau.go.launcherex.gowidget.weather.globalview.n.a(a).getScrollX(), 0);
        }
    }

    public void d(a a1)
    {
    }
}
