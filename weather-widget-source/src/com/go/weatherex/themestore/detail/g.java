// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.content.Context;
import com.android.a.aa;
import com.jiubang.playsdk.a.a.c;
import com.jiubang.playsdk.a.k;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.detail.ThemeLocalDetailView;
import com.jiubang.playsdk.e.a;

// Referenced classes of package com.go.weatherex.themestore.detail:
//            f

class g
    implements k
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public void a(aa aa)
    {
        com.go.weatherex.themestore.detail.f.a(a).b();
        aa = y.a().c(a.a);
        com.go.weatherex.themestore.detail.f.a(a, aa);
    }

    public void a(c c1)
    {
        com.go.weatherex.themestore.detail.f.a(a).b();
        if (c1 == null || c1.a == null)
        {
            c1 = y.a().c(a.a);
            com.go.weatherex.themestore.detail.f.a(a, c1);
            return;
        }
        int i = y.a().b().m();
        int j = y.a().b().l();
        String s = com.jiubang.playsdk.e.a.a(a.a, a.a.getPackageName());
        com.jiubang.playsdk.e.a.a(a.a, j, i, s, 0);
        if (c1.b == 0)
        {
            f.b(a, c1.a);
            return;
        } else
        {
            com.go.weatherex.themestore.detail.f.a(a, c1.a);
            return;
        }
    }

    public volatile void a(Object obj)
    {
        a((c)obj);
    }
}
