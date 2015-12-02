// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.City;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.vehicleview.Shape_VehicleView;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.ReverseGeocode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class dpf
    implements Eyeball
{

    private final daj a;

    dpf(daj daj1)
    {
        a = daj1;
    }

    public final Map getDynamicFares()
    {
        if (!dul.h(a.b()) || a.b().getCity().getVehicleViews().isEmpty())
        {
            return Collections.emptyMap();
        }
        Object obj = a.b().getCity().getVehicleViews();
        HashMap hashmap = new HashMap(((Map) (obj)).size() * 2);
        java.util.Map.Entry entry;
        Shape_VehicleView shape_vehicleview;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); hashmap.put(entry.getKey(), shape_vehicleview.getSurge()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            shape_vehicleview = (Shape_VehicleView)entry.getValue();
        }

        return hashmap;
    }

    public final FareSplit getFareSplit()
    {
        Ping ping = a.b();
        if (ping != null)
        {
            return ping.getFareSplit();
        } else
        {
            return null;
        }
    }

    public final Map getNearbyVehicles()
    {
        Ping ping = a.b();
        if (ping != null)
        {
            return ping.getNearbyVehicles();
        } else
        {
            return Collections.emptyMap();
        }
    }

    public final ReverseGeocode getReverseGeocode()
    {
        Ping ping = a.b();
        if (dul.a(ping))
        {
            return ping.getClient().getReverseGeocode();
        } else
        {
            return null;
        }
    }
}
