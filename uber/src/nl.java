// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public abstract class nl extends aiw
    implements nj
{

    private final AdRequestInfoParcel a;
    private final nj b;
    private final Object c = new Object();
    private AdResponseParcel d;

    public nl(AdRequestInfoParcel adrequestinfoparcel, nj nj1)
    {
        a = adrequestinfoparcel;
        b = nj1;
    }

    private void a(long l)
    {
        obj;
        JVM INSTR monitorenter ;
_L2:
        synchronized (c)
        {
            if (d == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            b.a(d);
        }
        return;
        if (b(l)) goto _L2; else goto _L1
_L1:
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        b.a(d);
_L3:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        b.a(new AdResponseParcel(0));
          goto _L3
    }

    private boolean a(ns ns1, AdRequestInfoParcel adrequestinfoparcel)
    {
        ns1.a(adrequestinfoparcel, new nq(this));
        return true;
        ns1;
        of.d("Could not fetch ad response from ad request service.", ns1);
        ot.h().a(ns1, true);
_L2:
        b.a(new AdResponseParcel(0));
        return false;
        ns1;
        of.d("Could not fetch ad response from ad request service due to an Exception.", ns1);
        ot.h().a(ns1, true);
        continue; /* Loop/switch isn't completed */
        ns1;
        of.d("Could not fetch ad response from ad request service due to an Exception.", ns1);
        ot.h().a(ns1, true);
        continue; /* Loop/switch isn't completed */
        ns1;
        of.d("Could not fetch ad response from ad request service due to an Exception.", ns1);
        ot.h().a(ns1, true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean b(long l)
    {
        l = 60000L - (ot.i().b() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            c.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            return false;
        }
        return true;
    }

    public final void a()
    {
        Object obj = d();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new AdResponseParcel(0);
        b.a(((AdResponseParcel) (obj)));
_L4:
        c();
        return;
_L2:
        if (!a(((ns) (obj)), a)) goto _L4; else goto _L3
_L3:
        a(ot.i().b());
          goto _L4
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public final void a(AdResponseParcel adresponseparcel)
    {
        synchronized (c)
        {
            d = adresponseparcel;
            c.notify();
        }
        return;
        adresponseparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adresponseparcel;
    }

    public final void b()
    {
        c();
    }

    public abstract void c();

    public abstract ns d();
}
