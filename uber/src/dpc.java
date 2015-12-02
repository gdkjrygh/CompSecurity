// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.TripPendingRating;

final class dpc
    implements ClientStatus
{

    private final daj a;

    dpc(daj daj1)
    {
        a = daj1;
    }

    public final String getLastRequestMsg()
    {
        Ping ping = a.b();
        if (dul.a(ping))
        {
            return ping.getClient().getLastRequestMsg();
        } else
        {
            return null;
        }
    }

    public final String getLastRequestNote()
    {
        Ping ping = a.b();
        if (dul.a(ping))
        {
            return ping.getClient().getLastRequestNote();
        } else
        {
            return null;
        }
    }

    public final String getStatus()
    {
        Ping ping = a.b();
        if (dul.a(ping))
        {
            return ping.getClient().getStatus();
        } else
        {
            return null;
        }
    }

    public final TripPendingRating getTripPendingRating()
    {
        Ping ping = a.b();
        if (dul.a(ping))
        {
            return ping.getClient().getTripPendingRating();
        } else
        {
            return null;
        }
    }
}
