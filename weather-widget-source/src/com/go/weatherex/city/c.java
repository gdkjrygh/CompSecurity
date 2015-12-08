// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.city;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.go.weatherex.city:
//            d

public class c
{

    private static c a;
    private String b;
    private ArrayList c;

    private c()
    {
        c = new ArrayList();
    }

    public static c a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/go/weatherex/city/c;
        JVM INSTR monitorenter ;
        a = new c();
        com/go/weatherex/city/c;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/go/weatherex/city/c;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(d d1)
    {
        if (d1 != null)
        {
            c.add(d1);
        }
    }

    public void a(String s)
    {
        b = s;
    }

    public String b()
    {
        return b;
    }

    public void b(d d1)
    {
        if (d1 != null)
        {
            c.remove(d1);
        }
    }

    public void b(String s)
    {
        if (!TextUtils.isEmpty(s) && !s.equals(b))
        {
            String s1 = b;
            b = s;
            for (s = ((ArrayList)c.clone()).iterator(); s.hasNext(); ((d)s.next()).a(s1, b)) { }
        }
    }
}
