// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.rider.realtime.response:
//            Shape_Status

public abstract class Status
{

    public Status()
    {
    }

    public static Status create(Map map, City city, ClientStatus clientstatus, List list, Eyeball eyeball, Trip trip)
    {
        return (new Shape_Status()).setAppConfig(map).setCity(city).setClientStatus(clientstatus).setExperiments(list).setEyeball(eyeball).setTrip(trip);
    }

    public abstract Map getAppConfig();

    public abstract City getCity();

    public abstract ClientStatus getClientStatus();

    public abstract List getExperiments();

    public abstract Eyeball getEyeball();

    public abstract Trip getTrip();

    abstract Status setAppConfig(Map map);

    abstract Status setCity(City city);

    abstract Status setClientStatus(ClientStatus clientstatus);

    abstract Status setExperiments(List list);

    abstract Status setEyeball(Eyeball eyeball);

    abstract Status setTrip(Trip trip);
}
