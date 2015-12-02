// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.FileOutputStream;
import java.io.OutputStream;

// Referenced classes of package com.whatsapp.util:
//            a7, bn, ao, Log, 
//            b9

public final class j
{

    final ao a;
    private final a7 b;
    private boolean c;

    private j(ao ao1, a7 a7_1)
    {
        a = ao1;
        super();
        b = a7_1;
    }

    j(ao ao1, a7 a7_1, b9 b9)
    {
        this(ao1, a7_1);
    }

    static a7 a(j j1)
    {
        return j1.b;
    }

    static boolean a(j j1, boolean flag)
    {
        j1.c = flag;
        return flag;
    }

    public OutputStream a(int i)
    {
        ao ao1 = a;
        ao1;
        JVM INSTR monitorenter ;
        if (a7.e(b) != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        ao1;
        JVM INSTR monitorexit ;
        throw exception;
        bn bn1 = new bn(this, new FileOutputStream(b.b(i)), null);
        ao1;
        JVM INSTR monitorexit ;
        return bn1;
    }

    public void a()
    {
        boolean flag;
        try
        {
            flag = c;
        }
        catch (IllegalStateException illegalstateexception)
        {
            try
            {
                throw illegalstateexception;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        ao.a(a, this, false);
        a.b(a7.b(b));
        if (!Log.f)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        ao.a(a, this, true);
        return;
    }

    public void b()
    {
        ao.a(a, this, false);
    }
}
