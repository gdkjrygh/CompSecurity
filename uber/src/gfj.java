// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.chat.model.Message;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;

public final class gfj
{

    private final City a;
    private final Client b;
    private final ClientStatus c;
    private final Eyeball d;
    private final Message e;
    private final Trip f;
    private final int g;

    public gfj(City city, Client client, ClientStatus clientstatus, Eyeball eyeball, Message message, Trip trip, int i)
    {
        a = city;
        b = client;
        c = clientstatus;
        d = eyeball;
        e = message;
        f = trip;
        g = i;
    }

    final City a()
    {
        return a;
    }

    final Client b()
    {
        return b;
    }

    final ClientStatus c()
    {
        return c;
    }

    final Eyeball d()
    {
        return d;
    }

    final Message e()
    {
        return e;
    }

    final Trip f()
    {
        return f;
    }

    final int g()
    {
        return g;
    }
}
