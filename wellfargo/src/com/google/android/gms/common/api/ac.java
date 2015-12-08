// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ah;
import com.google.android.gms.common.internal.au;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.api:
//            w, ad, y, z, 
//            x, Status, aa

public abstract class ac
    implements w
{

    protected final ad a;
    private final Object b = new Object();
    private final CountDownLatch c = new CountDownLatch(1);
    private final ArrayList d = new ArrayList();
    private aa e;
    private volatile z f;
    private volatile boolean g;
    private boolean h;
    private boolean i;
    private ah j;

    protected ac(Looper looper)
    {
        a = new ad(looper);
    }

    static void b(z z1)
    {
        if (!(z1 instanceof y))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((y)z1).a();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("AbstractPendingResult", (new StringBuilder()).append("Unable to release ").append(z1).toString(), runtimeexception);
        return;
    }

    private void c(z z1)
    {
        f = z1;
        j = null;
        c.countDown();
        z1 = f.a();
        if (e != null)
        {
            a.a();
            if (!h)
            {
                a.a(e, f());
            }
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((x)iterator.next()).a(z1)) { }
        d.clear();
    }

    private z f()
    {
        boolean flag = true;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        z z1;
        if (g)
        {
            flag = false;
        }
        au.a(flag, "Result has already been consumed.");
        au.a(a(), "Result is not ready.");
        z1 = f;
        f = null;
        e = null;
        g = true;
        c();
        return z1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Status status)
    {
        synchronized (b)
        {
            if (!a())
            {
                a(b(status));
                i = true;
            }
        }
        return;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
    }

    public final void a(z z1)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (b)
            {
                if (!i && !h)
                {
                    break label0;
                }
                b(z1);
            }
            return;
        }
        boolean flag;
        if (!a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.a(flag, "Results have already been set");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        au.a(flag, "Result has already been consumed");
        c(z1);
        obj;
        JVM INSTR monitorexit ;
        return;
        z1;
        obj;
        JVM INSTR monitorexit ;
        throw z1;
    }

    public final boolean a()
    {
        return c.getCount() == 0L;
    }

    protected abstract z b(Status status);

    public void b()
    {
label0:
        {
            synchronized (b)
            {
                if (!h && !g)
                {
                    break label0;
                }
            }
            return;
        }
        ah ah1 = j;
        if (ah1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        try
        {
            j.a();
        }
        catch (RemoteException remoteexception) { }
        b(f);
        e = null;
        h = true;
        c(b(Status.e));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void c()
    {
    }
}
