// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import java.util.Map;

// Referenced classes of package com.ubercab.rider.realtime.response:
//            Shape_BootstrapRider, Status

public abstract class BootstrapRider
{

    public BootstrapRider()
    {
    }

    public static BootstrapRider create(Map map, City city, Client client, Status status)
    {
        return (new Shape_BootstrapRider()).setAppConfig(map).setCity(city).setClient(client).setStatus(status);
    }

    public abstract Map getAppConfig();

    public abstract City getCity();

    public abstract Client getClient();

    public abstract Status getStatus();

    abstract BootstrapRider setAppConfig(Map map);

    abstract BootstrapRider setCity(City city);

    abstract BootstrapRider setClient(Client client);

    abstract BootstrapRider setStatus(Status status);
}
