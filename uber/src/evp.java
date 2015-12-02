// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion;
import com.ubercab.client.feature.pickup.model.RegionGroupData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class evp
{

    final List a = new CopyOnWriteArrayList();
    final Map b = new ConcurrentHashMap();
    private final List c = new ArrayList();

    public evp()
    {
    }

    private static RegionGroupData a(UberLatLng uberlatlng, evs evs1, String s, String s1)
    {
        return evs1.a(uberlatlng, s, s1);
    }

    static List a(evp evp1)
    {
        return evp1.c;
    }

    final RegionGroupData a(UberLatLng uberlatlng, String s, String s1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            evs evs1 = (evs)iterator.next();
            if (evs1.a(uberlatlng))
            {
                return a(uberlatlng, evs1, s, s1);
            }
        }

        return null;
    }

    final evs a(UberLatLng uberlatlng, double d, GuidedPickupGeocodeRegion guidedpickupgeocoderegion)
    {
        List list = guidedpickupgeocoderegion.getData();
        HashMap hashmap = new HashMap();
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            Object obj = (com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.RegionData)iterator.next();
            com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.RegionDataProperties regiondataproperties = ((com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.RegionData) (obj)).getProperties();
            String s1 = regiondataproperties.getId();
            String s2 = regiondataproperties.getType();
            b.put(s1, obj);
            Set set = (Set)hashmap.get(s2);
            obj = set;
            if (set == null)
            {
                obj = new HashSet();
                hashmap.put(s2, obj);
            }
            ((Set) (obj)).add(s1);
            obj = regiondataproperties.getChildren();
            if (obj != null)
            {
                obj = ((List) (obj)).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    String s = (String)((Iterator) (obj)).next();
                    Object obj1 = (com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.RegionData)b.get(s);
                    if (obj1 != null)
                    {
                        obj1 = ((com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.RegionData) (obj1)).getProperties().getType();
                        if (hashmap.get(obj1) != null)
                        {
                            ((Set)hashmap.get(obj1)).remove(s);
                        }
                    }
                }
            }
        }

        uberlatlng = new evs(uberlatlng, d, guidedpickupgeocoderegion, hashmap, b);
        a.add(uberlatlng);
        return uberlatlng;
    }

    final void a(evr evr)
    {
        c.add(evr);
    }

    final void a(ews ews1)
    {
        (new evq(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ews[] {
            ews1
        });
    }

    final void b(evr evr)
    {
        c.remove(evr);
    }
}
