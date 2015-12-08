// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamic.n;

// Referenced classes of package com.google.android.gms.internal:
//            aq, aj, do, cz, 
//            ac, ai, av, at, 
//            al, dn, ao, ap, 
//            aa

public final class am
    implements aq
{

    private final String a;
    private final at b;
    private final long c;
    private final ai d;
    private final aa e;
    private final ac f;
    private final Context g;
    private final Object h = new Object();
    private final cz i;
    private av j;
    private int k;

    public am(Context context, String s, at at1, aj aj1, ai ai1, aa aa, ac ac1, 
            cz cz1)
    {
        k = -2;
        g = context;
        a = s;
        b = at1;
        long l;
        if (aj1.b != -1L)
        {
            l = aj1.b;
        } else
        {
            l = 10000L;
        }
        c = l;
        d = ai1;
        e = aa;
        f = ac1;
        i = cz1;
    }

    static av a(am am1, av av1)
    {
        am1.j = av1;
        return av1;
    }

    static Object a(am am1)
    {
        return am1.h;
    }

    private void a(long l, long l1, long l2, long l3)
    {
        long l4 = SystemClock.elapsedRealtime();
        l = l1 - (l4 - l);
        l1 = l3 - (l4 - l2);
        if (l <= 0L || l1 <= 0L)
        {
            com.google.android.gms.internal.do.b("Timed out waiting for adapter.");
            k = 3;
            return;
        }
        try
        {
            h.wait(Math.min(l, l1));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            k = -1;
        }
    }

    static void a(am am1, al al1)
    {
        if (am1.i.iO >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (am1.f.eK)
        {
            am1.j.a(n.a(am1.g), am1.e, am1.d.f, al1);
            return;
        }
        try
        {
            am1.j.a(n.a(am1.g), am1.f, am1.e, am1.d.f, al1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (al al1)
        {
            com.google.android.gms.internal.do.a("Could not request ad from mediation adapter.", al1);
        }
        am1.a(5);
        return;
        if (am1.f.eK)
        {
            am1.j.a(n.a(am1.g), am1.e, am1.d.f, am1.d.a, al1);
            return;
        }
        am1.j.a(n.a(am1.g), am1.f, am1.e, am1.d.f, am1.d.a, al1);
        return;
    }

    static int b(am am1)
    {
        return am1.k;
    }

    private av b()
    {
        com.google.android.gms.internal.do.b((new StringBuilder("Instantiating mediation adapter: ")).append(a).toString());
        av av1;
        try
        {
            av1 = b.a(a);
        }
        catch (RemoteException remoteexception)
        {
            String s = (new StringBuilder("Could not instantiate mediation adapter: ")).append(a).toString();
            if (com.google.android.gms.internal.do.a(3))
            {
                Log.d("Ads", s, remoteexception);
            }
            return null;
        }
        return av1;
    }

    static av c(am am1)
    {
        return am1.b();
    }

    static av d(am am1)
    {
        return am1.j;
    }

    public final ap a(long l, long l1)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        long l2 = SystemClock.elapsedRealtime();
        obj1 = new al();
        dn.a.post(new ao(this, ((al) (obj1))));
        long l3 = c;
        while (k == -2) 
        {
            a(l2, l3, l, l1);
        }
        break MISSING_BLOCK_LABEL_76;
        obj1;
        throw obj1;
        obj1 = new ap(d, j, a, ((al) (obj1)), k);
        obj;
        JVM INSTR monitorexit ;
        return ((ap) (obj1));
    }

    public final void a()
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (j != null)
        {
            j.c();
        }
_L1:
        k = -1;
        h.notify();
        return;
        Object obj1;
        obj1;
        com.google.android.gms.internal.do.a("Could not destroy mediation adapter.", ((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
    }

    public final void a(int l)
    {
        synchronized (h)
        {
            k = l;
            h.notify();
        }
    }
}
