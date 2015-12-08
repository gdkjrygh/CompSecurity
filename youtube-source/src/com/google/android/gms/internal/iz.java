// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            fd, gi, ix, iu, 
//            fa, iv, ju, ir, 
//            is, fy, jq, fj

public final class iz extends fd
{

    private final String e;
    private final ix f;
    private final iu g = new iu();
    private final Object h = new Object();
    private boolean i;

    public iz(Context context, ix ix1)
    {
        super(context, ix1, ix1, new String[0]);
        e = context.getPackageName();
        f = (ix)gi.a(ix1);
        f.a(this);
        i = true;
    }

    private void b(ju ju1, jq jq)
    {
        g.a(ju1, jq);
    }

    private void m()
    {
        Object obj;
        ArrayList arraylist;
        iv iv1;
        Iterator iterator;
        boolean flag;
        if (!i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fa.a(flag);
        if (g.c()) goto _L2; else goto _L1
_L1:
        arraylist = new ArrayList();
        iterator = g.a().iterator();
        obj = null;
_L3:
        try
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_155;
                }
                iv1 = (iv)iterator.next();
                if (!iv1.a.equals(obj))
                {
                    break MISSING_BLOCK_LABEL_107;
                }
                arraylist.add(iv1.b);
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("PlayLoggerImpl", "Couldn't send cached log events to AndroidLog service.  Retaining in memory cache.");
        }
_L2:
        return;
        if (!arraylist.isEmpty())
        {
            ((ir)j()).a(e, ((ju) (obj)), arraylist);
            arraylist.clear();
        }
        obj = iv1.a;
        arraylist.add(iv1.b);
          goto _L3
        if (!arraylist.isEmpty())
        {
            ((ir)j()).a(e, ((ju) (obj)), arraylist);
        }
        g.b();
        return;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return is.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.playlog.service.START";
    }

    protected final void a(fy fy1, fj fj)
    {
        Bundle bundle = new Bundle();
        fy1.f(fj, 0x40be38, h().getPackageName(), bundle);
    }

    public final void a(ju ju1, jq jq)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (!i) goto _L2; else goto _L1
_L1:
        b(ju1, jq);
_L3:
        return;
_L2:
        m();
        ((ir)j()).a(e, ju1, jq);
          goto _L3
        Object obj1;
        obj1;
        Log.e("PlayLoggerImpl", "Couldn't send log event.  Will try caching.");
        b(ju1, jq);
          goto _L3
        ju1;
        throw ju1;
        obj1;
        Log.e("PlayLoggerImpl", "Service was disconnected.  Will try caching.");
        b(ju1, jq);
          goto _L3
    }

    final void a(boolean flag)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        flag1 = i;
        i = flag;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (!i)
        {
            m();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final String b()
    {
        return "com.google.android.gms.playlog.internal.IPlayLogService";
    }

    public final void c()
    {
        synchronized (h)
        {
            f.a(true);
            d();
        }
    }

    public final void l()
    {
        synchronized (h)
        {
            f.a(false);
            g();
        }
    }
}
