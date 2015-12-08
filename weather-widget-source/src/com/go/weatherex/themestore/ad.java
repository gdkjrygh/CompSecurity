// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.os.Handler;
import com.android.a.aa;
import com.jiubang.playsdk.a.k;
import com.jiubang.playsdk.a.v;

// Referenced classes of package com.go.weatherex.themestore:
//            ac

class ad
    implements k
{

    final ac a;

    ad(ac ac1)
    {
        a = ac1;
        super();
    }

    public void a(aa aa)
    {
        ac.a(a);
    }

    public void a(v v1)
    {
        ac.a(a);
        ac.a(a, v1);
        if (ac.b(a))
        {
            ac.d(a).removeCallbacks(ac.c(a));
            ac.a(a, true);
        }
        if (!ac.e(a))
        {
            ac.b(a, ac.f(a));
        }
    }

    public volatile void a(Object obj)
    {
        a((v)obj);
    }
}
