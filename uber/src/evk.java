// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.rider.realtime.model.DynamicPickupsResponse;
import com.ubercab.rider.realtime.model.GeoJsonFeature;
import com.ubercab.rider.realtime.model.GeoJsonPoint;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class evk
{

    private final List a = new CopyOnWriteArrayList();
    private final cev b;

    public evk(cev cev1)
    {
        b = cev1;
    }

    private static UberLatLng a(GeoJsonFeature geojsonfeature)
    {
        gjz.a(geojsonfeature);
        List list = ((GeoJsonPoint)geojsonfeature.getGeometry()).getCoordinates();
        if (geojsonfeature.getChirality() == 1)
        {
            return new UberLatLng(((Double)list.get(0)).doubleValue(), ((Double)list.get(1)).doubleValue());
        } else
        {
            return new UberLatLng(((Double)list.get(1)).doubleValue(), ((Double)list.get(0)).doubleValue());
        }
    }

    public final Set a(UberLatLng uberlatlng, double d)
    {
        LinkedHashSet linkedhashset;
        gjz.a(uberlatlng);
        linkedhashset = null;
        Iterator iterator = a.iterator();
        do
        {
label0:
            {
                Object obj;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    obj = ((evl)iterator.next()).b.getPickupLocations();
                } while (obj == null);
                Iterator iterator1 = ((com.ubercab.rider.realtime.model.DynamicPickupsResponse.FeatureCollection) (obj)).getFeatures().iterator();
                obj = linkedhashset;
                do
                {
                    linkedhashset = ((LinkedHashSet) (obj));
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    com.ubercab.rider.realtime.model.DynamicPickupsResponse.PickupLocation pickuplocation = (com.ubercab.rider.realtime.model.DynamicPickupsResponse.PickupLocation)iterator1.next();
                    if (UberLatLng.a(a(((GeoJsonFeature) (pickuplocation))), uberlatlng) <= d)
                    {
                        linkedhashset = ((LinkedHashSet) (obj));
                        if (obj == null)
                        {
                            linkedhashset = new LinkedHashSet();
                        }
                        linkedhashset.add(pickuplocation);
                        obj = linkedhashset;
                    }
                } while (true);
            }
        } while (true);
        return linkedhashset;
    }

    public final void a(UberLatLng uberlatlng, int i, DynamicPickupsResponse dynamicpickupsresponse)
    {
        a.add(new evl(uberlatlng, i, dynamicpickupsresponse));
        b.c(new evm(a));
    }

    public final boolean a(UberLatLng uberlatlng, int i)
    {
        gjz.a(uberlatlng);
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            evl evl1 = (evl)iterator.next();
            if (UberLatLng.a(evl1.a, uberlatlng) < (double)(evl1.c - i))
            {
                return true;
            }
        }

        return false;
    }
}
