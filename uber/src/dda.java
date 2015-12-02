// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import java.util.HashMap;
import java.util.Map;

public final class dda
    implements cij
{

    private final hkr a;

    public dda(hkr hkr1)
    {
        a = hkr1;
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("app_name", "rider_app");
        Object obj = a.c();
        if (obj != null)
        {
            hashmap.put("rider_id", ((Client) (obj)).getUuid());
        }
        obj = a.f();
        if (obj != null)
        {
            hashmap.put("trip_id", ((Trip) (obj)).getUuid());
            hashmap.put("driver_id", ((Trip) (obj)).getDriver().getUuid());
        }
        return hashmap;
    }
}
