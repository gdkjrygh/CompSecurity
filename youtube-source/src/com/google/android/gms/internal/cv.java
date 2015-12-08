// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            cw, cx, do, y, 
//            db

public final class cv
{

    public final y a = new cw(this);
    public final y b = new cx(this);
    private final Object c = new Object();
    private db d;
    private String e;
    private int f;
    private String g;

    public cv(String s)
    {
        f = -2;
        e = s;
    }

    static int a(cv cv1, int i)
    {
        cv1.f = 1;
        return 1;
    }

    static Object a(cv cv1)
    {
        return cv1.c;
    }

    static String a(cv cv1, String s)
    {
        cv1.g = s;
        return s;
    }

    static String b(cv cv1)
    {
        return cv1.e;
    }

    public final int a()
    {
        int i;
        synchronized (c)
        {
            i = f;
        }
        return i;
    }

    public final void a(db db)
    {
        synchronized (c)
        {
            d = db;
        }
    }

    public final String b()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
_L1:
        int i;
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i = f;
        if (i != -2)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        c.wait();
          goto _L1
        Object obj1;
        obj1;
        com.google.android.gms.internal.do.d("Ad request service was interrupted.");
        obj;
        JVM INSTR monitorexit ;
        return null;
        String s = g;
        obj;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }
}
