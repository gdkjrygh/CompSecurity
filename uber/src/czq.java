// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class czq extends czr
{

    private final hkr a;
    private final daj b;
    private final dpg c;
    private final RiderActivity d;

    public czq(RiderActivity rideractivity, daj daj1, dpg dpg1, hkr hkr1)
    {
        d = rideractivity;
        b = daj1;
        c = dpg1;
        a = hkr1;
    }

    public final void b()
    {
        if (!c.n()) goto _L2; else goto _L1
_L1:
        if (a.c() == null || a.d() == null || a.a() == null) goto _L4; else goto _L3
_L3:
        return;
_L2:
        if (!b.d())
        {
            continue; /* Loop/switch isn't completed */
        }
        b.a();
        break; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L4
_L4:
        d.v();
        return;
    }
}
