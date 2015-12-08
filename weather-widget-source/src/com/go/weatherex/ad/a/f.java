// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.a;

import android.util.Log;

// Referenced classes of package com.go.weatherex.ad.a:
//            i, a, e, b

class f
    implements i
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public void a(a a1)
    {
        if (a1 != null)
        {
            Log.d("ad_banner", (new StringBuilder()).append("onAdShow - ").append(a1.a()).toString());
        }
    }

    public void b(a a1)
    {
        if (com.go.weatherex.ad.a.e.a(a) != a1)
        {
            if (com.go.weatherex.ad.a.e.a(a) != null)
            {
                com.go.weatherex.ad.a.e.a(a).a(false);
            }
            com.go.weatherex.ad.a.e.a(a, a1);
            com.go.weatherex.ad.a.e.a(a, com.go.weatherex.ad.a.e.b(a), com.go.weatherex.ad.a.e.a(a));
            if (b.a.equals(a1.a()))
            {
                Log.d("ad_banner", "\u5F00\u59CB\u52A0\u8F7Dfacebook\u5E7F\u544A");
                com.go.weatherex.ad.a.e.a(a, b.c).c();
            }
        }
    }

    public void c(a a1)
    {
        if (b.c.equals(a1.a()))
        {
            com.go.weatherex.ad.a.e.a(a, b.b).c();
        }
    }

    public void d(a a1)
    {
        e.a = true;
        Log.d("ad_banner", "\u70B9\u51FB\u5173\u95ED\u6309\u94AE");
        com.go.weatherex.ad.a.e.b(a, a1);
        a.a(false);
    }

    public void e(a a1)
    {
    }
}
