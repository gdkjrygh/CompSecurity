// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.d;

import android.sax.EndTextElementListener;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.d:
//            o, g

class k
    implements EndTextElementListener
{

    final o a;
    final g b;

    k(g g, o o1)
    {
        b = g;
        a = o1;
        super();
    }

    public void end(String s)
    {
        a.c(s);
    }
}
