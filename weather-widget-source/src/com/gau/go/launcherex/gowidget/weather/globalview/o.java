// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            n

class o
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final n a;

    o(n n1)
    {
        a = n1;
        super();
    }

    public boolean onPreDraw()
    {
        n.a(a).getViewTreeObserver().removeOnPreDrawListener(this);
        n.b(a);
        return false;
    }
}
