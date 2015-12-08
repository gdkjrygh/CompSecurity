// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.b;


// Referenced classes of package com.go.weatherex.home.b:
//            a, k, f

public class l extends a
{

    private static l k = null;

    private l()
    {
    }

    public static l c()
    {
        com/go/weatherex/home/b/l;
        JVM INSTR monitorenter ;
        l l1;
        if (k == null)
        {
            k = new l();
        }
        l1 = k;
        com/go/weatherex/home/b/l;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(String s, f f)
    {
        super.a(s, s.hashCode(), f, k.b);
    }

}
