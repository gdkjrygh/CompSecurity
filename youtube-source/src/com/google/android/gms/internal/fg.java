// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            fd

public abstract class fg
{

    final fd a;
    private Object b;
    private boolean c;

    public fg(fd fd1, Object obj)
    {
        a = fd1;
        super();
        b = obj;
        c = false;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = b;
        if (c)
        {
            Log.w("GmsClient", (new StringBuilder("Callback proxy ")).append(this).append(" being reused. This is not safe.").toString());
        }
        this;
        JVM INSTR monitorexit ;
        Object obj1;
        if (obj != null)
        {
            try
            {
                a(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
        this;
        JVM INSTR monitorenter ;
        c = true;
        this;
        JVM INSTR monitorexit ;
        b();
        return;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
    }

    protected abstract void a(Object obj);

    public final void b()
    {
        c();
        synchronized (fd.c(a))
        {
            fd.c(a).remove(this);
        }
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        b = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
