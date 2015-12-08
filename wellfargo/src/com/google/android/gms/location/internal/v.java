// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.copresence.internal.CopresenceApiOptions;
import com.google.android.gms.location.copresence.internal.b;
import com.google.android.gms.location.g;

// Referenced classes of package com.google.android.gms.location.internal:
//            a, r

public class v extends a
{

    private final com.google.android.gms.location.internal.r e;
    private final b f;

    public v(Context context, Looper looper, q q, r r1, String s, h h1)
    {
        this(context, looper, q, r1, s, h1, CopresenceApiOptions.a);
    }

    public v(Context context, Looper looper, q q, r r1, String s, h h1, CopresenceApiOptions copresenceapioptions)
    {
        super(context, looper, q, r1, s, h1);
        e = new com.google.android.gms.location.internal.r(context, d);
        f = b.a(context, h1.a(), h1.g(), d, copresenceapioptions);
    }

    public void a()
    {
        com.google.android.gms.location.internal.r r1 = e;
        r1;
        JVM INSTR monitorenter ;
        boolean flag = b();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        e.b();
        e.c();
_L1:
        super.a();
        r1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
          goto _L1
        obj;
        r1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(LocationRequest locationrequest, g g, Looper looper)
    {
        synchronized (e)
        {
            e.a(locationrequest, g, looper);
        }
        return;
        locationrequest;
        r1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public void a(g g)
    {
        e.a(g);
    }

    public boolean o()
    {
        return true;
    }

    public Location p()
    {
        return e.a();
    }
}
