// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;
import java.util.List;
import java.util.Map;

public abstract class hkt
    implements hji
{

    private final hkv stream;

    public hkt(hkv hkv1)
    {
        stream = hkv1;
    }

    public void stream(City city)
    {
        stream.a(city);
    }

    public void stream(Client client)
    {
        stream.a(client);
    }

    public void stream(ClientStatus clientstatus)
    {
        stream.a(clientstatus);
    }

    public void stream(Eyeball eyeball)
    {
        stream.a(eyeball);
    }

    public void stream(Trip trip)
    {
        stream.a(trip);
    }

    public void stream(List list)
    {
        stream.a(list);
    }

    public void stream(Map map)
    {
        stream.a(map);
    }

    public final void streamTransaction()
    {
        stream.j();
    }
}
