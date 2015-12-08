// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;

import android.graphics.PointF;
import com.arubanetworks.meridian.editor.EditorKey;
import com.arubanetworks.meridian.editor.Placemark;
import com.arubanetworks.meridian.internal.report.ReportBus;
import com.arubanetworks.meridian.internal.util.Polygon;
import com.arubanetworks.meridian.log.MeridianLogger;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.arubanetworks.meridian.location:
//            LocationProvider, LocationSmoother, BeaconScanner, MeridianLocation, 
//            Beacon, ClientLocationData

class BeaconLocationProvider extends LocationProvider
    implements BeaconScanner.BeaconScannerListener
{

    private static final MeridianLogger a;
    private final BeaconScanner b = new BeaconScanner(this);
    private final LocationSmoother c = new LocationSmoother(5000L);

    public BeaconLocationProvider(ClientLocationData clientlocationdata, LocationProvider.a a1)
    {
        super(clientlocationdata, a1);
        b.start();
    }

    private MeridianLocation a(List list)
    {
        float f1 = 0.0F;
        if (list.size() == 0)
        {
            return null;
        }
    /* block-local class not found */
    class LoudestMapBeaconList {}

        list = new LoudestMapBeaconList(list, null);
        if (list.size() > 3)
        {
            list = list.subList(0, 3);
        }
        Object obj = new MeridianLocation();
        ((MeridianLocation) (obj)).setMap(((Beacon)list.get(0)).getMapKey());
        Object obj1 = list.iterator();
        float f;
        for (f = 0.0F; ((Iterator) (obj1)).hasNext(); f = 1.0F / ((Beacon)((Iterator) (obj1)).next()).arubaBeaconDistance() + f) { }
        list = list.iterator();
        float f2 = 0.0F;
        while (list.hasNext()) 
        {
            obj1 = (Beacon)list.next();
            Placemark placemark = (Placemark)clientLocationData.getBeaconPlacemarks().get(((Beacon) (obj1)).getMajorMinorString());
            f2 += placemark.getX() * (1.0F / ((Beacon) (obj1)).arubaBeaconDistance() / f);
            float f3 = placemark.getY();
            f1 += (1.0F / ((Beacon) (obj1)).arubaBeaconDistance() / f) * f3;
        }
        ((MeridianLocation) (obj)).setPoint(new PointF(f2, f1));
        list = c.a(((MeridianLocation) (obj)));
        if (list == null || list.getPoint() == null)
        {
            return null;
        }
        obj = list.getPoint();
        a.d("Generated Smoothed Location! [%s](%f, %f)", new Object[] {
            list.getMap().getId(), Float.valueOf(((PointF) (obj)).x), Float.valueOf(((PointF) (obj)).y)
        });
        for (obj1 = clientLocationData.getOutdoorAreas().iterator(); ((Iterator) (obj1)).hasNext();)
        {
            Object obj2 = (Placemark)((Iterator) (obj1)).next();
            if (((Placemark) (obj2)).getKey().getParent().equals(list.getMap()))
            {
                obj2 = ((Placemark) (obj2)).getArea();
                if (obj2 != null && ((Polygon) (obj2)).contains(((PointF) (obj)).x, ((PointF) (obj)).y))
                {
                    a.d("Location rejected due to it being inside an exclusion zone!");
                    return null;
                }
            }
        }

        obj1 = clientLocationData.getExclusionAreas().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            Object obj3 = (Placemark)((Iterator) (obj1)).next();
            if (((Placemark) (obj3)).getKey().getParent().equals(list.getMap()))
            {
                obj3 = ((Placemark) (obj3)).getArea();
                if (obj3 != null && ((Polygon) (obj3)).contains(((PointF) (obj)).x, ((PointF) (obj)).y))
                {
                    a.d("Location inside exclusion area - push away!");
                    list.setPoint(((Polygon) (obj3)).findClosestPointFromPoint(((PointF) (obj))));
                }
            }
        } while (true);
        return list;
    }

    protected float getPriority()
    {
        return 1.0F;
    }

    public LocationProvider.ProviderType getType()
    {
        return LocationProvider.ProviderType.BEACON_PROVIDER;
    }

    public void onBeaconScan(List list)
    {
        Object obj;
        ArrayList arraylist;
label0:
        {
            if (list.size() > 0)
            {
                ReportBus.getInstance().post(new com.arubanetworks.meridian.internal.report.ReportBus.RawBeaconsResult(list));
                arraylist = new ArrayList();
                obj = list.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    Beacon beacon = (Beacon)((Iterator) (obj)).next();
                    if (beacon.getProximityUuid().equalsIgnoreCase(clientLocationData.getLocationBeaconUUID()) && clientLocationData.getBeaconPlacemarks().containsKey(beacon.getMajorMinorString()))
                    {
                        beacon.setMapKey(((Placemark)clientLocationData.getBeaconPlacemarks().get(beacon.getMajorMinorString())).getKey().getParent());
                        arraylist.add(beacon);
                    }
                } while (true);
                if (arraylist.size() > 0)
                {
                    obj = (Beacon)arraylist.get(0);
                } else
                {
                    obj = null;
                }
                if (obj == null || ((Beacon) (obj)).getRssi() >= -100)
                {
                    break label0;
                }
                a.d("No beacons have rssi > -100; not using beacons.");
            }
            return;
        }
        ReportBus.getInstance().post(new com.arubanetworks.meridian.internal.report.ReportBus.VisibleBeaconsResult(((Beacon) (obj)), list));
        updateWithLocation(a(arraylist));
    }

    public void shutdown()
    {
        b.stop();
    }

    public String toString()
    {
        return "BeaconLocationProvider";
    }

    static 
    {
        a = MeridianLogger.forTag("BeaconLocationProvider").andFeature(com.arubanetworks.meridian.log.MeridianLogger.Feature.LOCATION);
    }
}
