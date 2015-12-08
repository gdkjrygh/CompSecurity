// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.g;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.gms.location.internal:
//            u, z, l, LocationRequestInternal, 
//            LocationRequestUpdateData, s

public class r
{

    private final z a;
    private final Context b;
    private ContentProviderClient c;
    private boolean d;
    private Map e;
    private Map f;

    public r(Context context, z z1)
    {
        c = null;
        d = false;
        e = new HashMap();
        f = new HashMap();
        b = context;
        a = z1;
    }

    private u a(g g, Looper looper)
    {
        Map map = e;
        map;
        JVM INSTR monitorenter ;
        u u2 = (u)e.get(g);
        u u1;
        u1 = u2;
        if (u2 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        u1 = new u(g, looper);
        e.put(g, u1);
        map;
        JVM INSTR monitorexit ;
        return u1;
        g;
        map;
        JVM INSTR monitorexit ;
        throw g;
    }

    public Location a()
    {
        a.a();
        Location location;
        try
        {
            location = ((l)a.c()).b(b.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public void a(LocationRequest locationrequest, g g, Looper looper)
    {
        a.a();
        g = a(g, looper);
        ((l)a.c()).a(LocationRequestUpdateData.a(LocationRequestInternal.a(locationrequest), g));
    }

    public void a(g g)
    {
        a.a();
        au.a(g, "Invalid null listener");
        Map map = e;
        map;
        JVM INSTR monitorenter ;
        g = (u)e.remove(g);
        if (c != null && e.isEmpty())
        {
            c.release();
            c = null;
        }
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        g.a();
        ((l)a.c()).a(LocationRequestUpdateData.a(g));
        map;
        JVM INSTR monitorexit ;
        return;
        g;
        map;
        JVM INSTR monitorexit ;
        throw g;
    }

    public void a(boolean flag)
    {
        a.a();
        ((l)a.c()).a(flag);
        d = flag;
    }

    public void b()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = e.values().iterator();
_L2:
        Object obj1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_84;
            }
            obj1 = (u)iterator.next();
        } while (obj1 == null);
        ((l)a.c()).a(LocationRequestUpdateData.a(((com.google.android.gms.location.r) (obj1))));
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
        e.clear();
        exception = f.values().iterator();
_L3:
        do
        {
            if (!exception.hasNext())
            {
                break MISSING_BLOCK_LABEL_155;
            }
            obj1 = (s)exception.next();
        } while (obj1 == null);
        ((l)a.c()).a(LocationRequestUpdateData.a(((com.google.android.gms.location.o) (obj1))));
          goto _L3
        f.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public void c()
    {
        if (!d)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        a(false);
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }
}
