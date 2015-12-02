// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.location.RiderLocation;

public final class dak
{

    private final cev a;
    private final cix b;
    private RiderLocation c;
    private RiderLocation d;

    public dak(cix cix1, cev cev1)
    {
        b = cix1;
        a = cev1;
    }

    public final void a()
    {
        a.a(this);
    }

    public final void a(RiderLocation riderlocation)
    {
        if (riderlocation == null)
        {
            return;
        } else
        {
            d = riderlocation;
            a.c(producePinLocationEvent());
            return;
        }
    }

    public final RiderLocation b()
    {
        return d;
    }

    public final void b(RiderLocation riderlocation)
    {
        b.a(riderlocation.getLocation());
    }

    public final RiderLocation c()
    {
        return c;
    }

    public final void d()
    {
        b.b();
        d = null;
        c = null;
    }

    public final void e()
    {
        d = null;
    }

    public final void onLocationEvent(ciy ciy1)
    {
        ciy1 = ciy1.a();
        if (ciy1 == null)
        {
            return;
        } else
        {
            c = RiderLocation.create(ciy1);
            a.c(produceDeviceLocationEvent());
            return;
        }
    }

    public final dap produceDeviceLocationEvent()
    {
        RiderLocation riderlocation = c;
        if (riderlocation != null)
        {
            return new dap(riderlocation);
        } else
        {
            return null;
        }
    }

    public final daq producePinLocationEvent()
    {
        RiderLocation riderlocation = d;
        if (riderlocation != null)
        {
            return new daq(riderlocation);
        } else
        {
            return null;
        }
    }
}
