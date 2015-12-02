// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion;
import com.ubercab.client.feature.pickup.model.RegionGroupData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class evs
{

    private final UberLatLng a;
    private final Map b;
    private final Map c;
    private final double d;
    private final GuidedPickupGeocodeRegion e;

    evs(UberLatLng uberlatlng, double d1, GuidedPickupGeocodeRegion guidedpickupgeocoderegion, Map map, Map map1)
    {
        a = uberlatlng;
        d = d1;
        e = guidedpickupgeocoderegion;
        b = map;
        c = map1;
    }

    private com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.RegionData a(UberLatLng uberlatlng, Collection collection)
    {
        if (collection == null)
        {
            return null;
        }
        for (collection = collection.iterator(); collection.hasNext();)
        {
            Object obj = (String)collection.next();
            obj = (com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.RegionData)c.get(obj);
            if (obj != null && ecx.a(uberlatlng, ((com.ubercab.rider.realtime.model.GeoJsonFeature) (obj))))
            {
                return ((com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.RegionData) (obj));
            }
        }

        return null;
    }

    private RegionGroupData a(com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.RegionData regiondata)
    {
        Object obj = regiondata.getProperties().getChildren();
        if (obj == null || ((List) (obj)).isEmpty())
        {
            return RegionGroupData.create(regiondata, new ArrayList());
        }
        ArrayList arraylist = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (String)((Iterator) (obj)).next();
            obj1 = (com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.RegionData)c.get(obj1);
            if (obj1 != null)
            {
                arraylist.add(RegionGroupData.create(((com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.RegionData) (obj1)), new ArrayList()));
            }
        } while (true);
        return RegionGroupData.create(regiondata, arraylist);
    }

    final UberLatLng a()
    {
        return a;
    }

    final RegionGroupData a(UberLatLng uberlatlng, String s, String s1)
    {
        if (!a(uberlatlng))
        {
            return null;
        }
        if (b.isEmpty())
        {
            return null;
        }
        s = a(uberlatlng, ((Collection) ((Set)b.get(s))));
        if (s == null)
        {
            return null;
        }
        if (s1 == null || s1.equals(s.getSubType()))
        {
            return a(((com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.RegionData) (s)));
        }
        uberlatlng = a(uberlatlng, ((Collection) (s.getProperties().getChildren())));
        if (uberlatlng != null && s1.equals(uberlatlng.getSubType()))
        {
            return a(((com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.RegionData) (uberlatlng)));
        } else
        {
            return null;
        }
    }

    final boolean a(UberLatLng uberlatlng)
    {
        return UberLatLng.a(a, uberlatlng) <= d;
    }

    final double b()
    {
        return d;
    }

    final GuidedPickupGeocodeRegion c()
    {
        return e;
    }
}
