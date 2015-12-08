// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.b;

import android.util.Log;
import com.jiubang.commerce.ad.a.a;
import com.jiubang.commerce.ad.e.af;
import java.util.List;

// Referenced classes of package com.go.weatherex.ad.b:
//            a, d

class b
    implements af
{

    final long a;
    final com.go.weatherex.ad.b.a b;

    b(com.go.weatherex.ad.b.a a1, long l)
    {
        b = a1;
        a = l;
        super();
    }

    public void a(int i)
    {
        long l = System.currentTimeMillis();
        long l1 = a;
        Log.d("zyz", (new StringBuilder()).append("onAdFail,spend").append(l - l1).toString());
        Log.d("zyz", (new StringBuilder()).append("onAdFail,statusCode:").append(i).toString());
        if (com.go.weatherex.ad.b.a.a(b) != null)
        {
            com.go.weatherex.ad.b.a.a(b).a(i);
        }
    }

    public void a(com.jiubang.commerce.ad.a.b b1)
    {
    }

    public void a(Object obj)
    {
    }

    public void a(boolean flag, com.jiubang.commerce.ad.a.b b1)
    {
        Object obj;
        obj = null;
        long l = System.currentTimeMillis();
        long l1 = a;
        Log.d("zyz", (new StringBuilder()).append("onAdInfoFinish,spend").append(l - l1).toString());
        if (b1.b() == 1) goto _L2; else goto _L1
_L1:
        a a1 = obj;
        if (b1.b() != 0) goto _L3; else goto _L2
_L2:
        if (b1.c() != null) goto _L5; else goto _L4
_L4:
        return;
_L5:
        a1 = obj;
        if (b1.c().size() > 0)
        {
            a1 = (a)b1.c().get(0);
        }
_L3:
        if (com.go.weatherex.ad.b.a.a(b) != null)
        {
            com.go.weatherex.ad.b.a.a(b).a(a1);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void b(Object obj)
    {
    }

    public void c(Object obj)
    {
    }
}
