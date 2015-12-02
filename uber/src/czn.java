// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class czn extends czr
{

    private final RiderActivity a;
    private final cev b;
    private boolean c;

    public czn(RiderActivity rideractivity, cev cev1)
    {
        c = false;
        a = rideractivity;
        b = cev1;
    }

    public final void b()
    {
        if (!c)
        {
            b.a(a);
            c = true;
        }
    }

    public final void c()
    {
        if (c)
        {
            b.b(a);
            c = false;
        }
    }
}
