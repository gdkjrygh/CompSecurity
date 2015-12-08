// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.view.View;
import com.a.a.an;
import com.a.a.au;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            n

class q
    implements au
{

    final n a;

    q(n n1)
    {
        a = n1;
        super();
    }

    public void a(an an1)
    {
        int i = ((Integer)an1.l()).intValue();
        n.a(a).scrollTo(n.a(a).getScrollX(), i);
    }
}
