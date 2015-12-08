// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.b.a;

import com.jiubang.commerce.ad.e.af;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.go.weatherex.b.a:
//            a, e

class b
    implements af
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void a(int i)
    {
        Object obj = (ArrayList)com.go.weatherex.b.a.a.a(a).get(Integer.valueOf(1));
        if (obj != null)
        {
            for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((e)((Iterator) (obj)).next()).a(i)) { }
        }
    }

    public void a(com.jiubang.commerce.ad.a.b b1)
    {
        if (b1.b() == 2 || b1.b() == 0)
        {
            Object obj = (ArrayList)com.go.weatherex.b.a.a.a(a).get(Integer.valueOf(1));
            if (obj != null)
            {
                for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((e)((Iterator) (obj)).next()).b(b1.c())) { }
            }
        }
    }

    public void a(Object obj)
    {
    }

    public void a(boolean flag, com.jiubang.commerce.ad.a.b b1)
    {
        if (b1.b() == 2 || b1.b() == 0)
        {
            Object obj = (ArrayList)com.go.weatherex.b.a.a.a(a).get(Integer.valueOf(1));
            if (obj != null)
            {
                for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((e)((Iterator) (obj)).next()).a(b1.c())) { }
            }
        }
    }

    public void b(Object obj)
    {
    }

    public void c(Object obj)
    {
    }
}
