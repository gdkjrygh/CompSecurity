// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;
import java.util.Map;

public final class hks
    implements hkr
{

    private final hji a;

    private hks(hji hji1)
    {
        a = hji1;
    }

    public static hkr a(hji hji1)
    {
        return new hks(hji1);
    }

    public final Map a()
    {
        return ((hkq)a.getData()).getAppConfig();
    }

    public final City b()
    {
        return ((hkq)a.getData()).getCity();
    }

    public final Client c()
    {
        return ((hkq)a.getData()).getClient();
    }

    public final ClientStatus d()
    {
        return ((hkq)a.getData()).getClientStatus();
    }

    public final Eyeball e()
    {
        return ((hkq)a.getData()).getEyeball();
    }

    public final Trip f()
    {
        return ((hkq)a.getData()).getTrip();
    }
}
