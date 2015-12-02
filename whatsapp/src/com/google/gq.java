// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;

// Referenced classes of package com.google:
//            cR, fn, a3, z

class gq
{

    private final z a;
    private a3 b;
    private final cR c;
    private volatile boolean d;
    private volatile cR e;

    public gq(cR cr, z z, a3 a3_1)
    {
        d = false;
        c = cr;
        a = z;
        b = a3_1;
    }

    private void a()
    {
        cR cr;
        try
        {
            cr = e;
        }
        catch (IOException ioexception)
        {
            throw ioexception;
        }
        if (cr != null)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        try
        {
            if (b != null)
            {
                e = (cR)c.b().b(b, a);
            }
        }
        catch (IOException ioexception1) { }
        this;
        JVM INSTR monitorexit ;
    }

    public cR a(cR cr)
    {
        cR cr1 = e;
        e = cr;
        b = null;
        d = true;
        return cr1;
    }

    public int b()
    {
        if (d)
        {
            return e.b();
        } else
        {
            return b.c();
        }
    }

    public cR c()
    {
        a();
        return e;
    }

    public a3 d()
    {
        if (!d)
        {
            return b;
        }
        this;
        JVM INSTR monitorenter ;
        a3 a3_1;
        if (d)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        a3_1 = b;
        this;
        JVM INSTR monitorexit ;
        return a3_1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        b = e.a();
        d = false;
        exception = b;
        this;
        JVM INSTR monitorexit ;
        return exception;
    }

    public boolean equals(Object obj)
    {
        a();
        return e.equals(obj);
    }

    public int hashCode()
    {
        a();
        return e.hashCode();
    }

    public String toString()
    {
        a();
        return e.toString();
    }
}
