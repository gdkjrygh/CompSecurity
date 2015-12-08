// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;

import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package a.a.a.a:
//            b

public class a
{

    final b a;
    final a.a.a.a b;
    final Object c;
    final int d;
    volatile long e;
    volatile long f;
    volatile Throwable g;
    volatile Object h;
    volatile int i;
    private final SQLiteDatabase j;
    private volatile boolean k;

    public boolean a()
    {
        return (d & 1) != 0;
    }

    boolean a(a a1)
    {
        return a1 != null && a() && a1.a() && b() == a1.b();
    }

    SQLiteDatabase b()
    {
        if (j != null)
        {
            return j;
        } else
        {
            return b.getDatabase();
        }
    }

    public boolean c()
    {
        return g != null;
    }

    void d()
    {
        this;
        JVM INSTR monitorenter ;
        k = true;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void e()
    {
        e = 0L;
        f = 0L;
        k = false;
        g = null;
        h = null;
        i = 0;
    }
}
