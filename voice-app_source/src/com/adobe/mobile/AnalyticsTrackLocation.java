// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.location.Location;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, TargetWorker, Lifecycle, MobileConfig, 
//            AnalyticsTrackInternal

final class AnalyticsTrackLocation
{

    private static final String ACCURACY_KEY = "a.loc.acc";
    private static final String LOCATION_ACTION_NAME = "Location";
    private static final String LOCATION_LAT_PART1_KEY = "a.loc.lat.a";
    private static final String LOCATION_LAT_PART2_KEY = "a.loc.lat.b";
    private static final String LOCATION_LAT_PART3_KEY = "a.loc.lat.c";
    private static final String LOCATION_LON_PART1_KEY = "a.loc.lon.a";
    private static final String LOCATION_LON_PART2_KEY = "a.loc.lon.b";
    private static final String LOCATION_LON_PART3_KEY = "a.loc.lon.c";
    private static final String POI_DIST_KEY = "a.loc.dist";
    private static final String POI_NAME_KEY = "a.loc.poi";
    private static final String WHOLE_ONLY_FLOAT_FORMAT = "%.0f";
    private static final String ZERO_PADDED_11_6_FLOAT_FORMAT = "% 011.6f";

    AnalyticsTrackLocation()
    {
    }

    public static void trackLocation(Location location, Map map)
    {
        HashMap hashmap;
        if (location == null)
        {
            StaticMethods.logWarningFormat("Analytics - trackLocation failed, invalid location specified", new Object[0]);
            return;
        }
        String s = String.format(Locale.US, "% 011.6f", new Object[] {
            Double.valueOf(location.getLatitude())
        });
        String s2 = String.format(Locale.US, "% 011.6f", new Object[] {
            Double.valueOf(location.getLongitude())
        });
        hashmap = new HashMap();
        if (map != null)
        {
            hashmap.putAll(map);
        }
        hashmap.put("a.loc.lat.a", s.substring(0, 6).trim());
        hashmap.put("a.loc.lat.b", s.substring(6, 8));
        hashmap.put("a.loc.lat.c", s.substring(8, 10));
        hashmap.put("a.loc.lon.a", s2.substring(0, 6).trim());
        hashmap.put("a.loc.lon.b", s2.substring(6, 8));
        hashmap.put("a.loc.lon.c", s2.substring(8, 10));
        if (location.hasAccuracy() && location.getAccuracy() > 0.0F)
        {
            hashmap.put("a.loc.acc", String.format(Locale.US, "%.0f", new Object[] {
                Float.valueOf(location.getAccuracy())
            }));
        }
        TargetWorker.removePersistentParameter("a.loc.poi");
        TargetWorker.removePersistentParameter("a.loc.dist");
        Lifecycle.removeContextData("a.loc.poi");
        map = MobileConfig.getInstance().getPointsOfInterest();
        if (map == null) goto _L2; else goto _L1
_L1:
        map = map.iterator();
_L5:
        if (!map.hasNext()) goto _L2; else goto _L3
_L3:
        List list;
        list = (List)map.next();
        if (list == null || list.size() != 4)
        {
            continue; /* Loop/switch isn't completed */
        }
        double d;
        double d1;
        double d2;
        String s1;
        s1 = list.get(0).toString();
        d1 = ((Double)list.get(1)).doubleValue();
        d2 = ((Double)list.get(2)).doubleValue();
        d = ((Double)list.get(3)).doubleValue();
        Location location1 = new Location("poi");
        location1.setLatitude(d1);
        location1.setLongitude(d2);
        d1 = location1.distanceTo(location);
        if (d1 > d || s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        hashmap.put("a.loc.poi", s1);
        TargetWorker.addPersistentParameter("a.loc.poi", s1);
        hashmap.put("a.loc.dist", String.format(Locale.US, "%.0f", new Object[] {
            Double.valueOf(d1)
        }));
        TargetWorker.addPersistentParameter("a.loc.dist", String.valueOf(d1));
        location = new HashMap();
        location.put("a.loc.poi", s1);
        Lifecycle.updateContextData(location);
_L2:
        AnalyticsTrackInternal.trackInternal("Location", hashmap, StaticMethods.getTimeSince1970());
        return;
        ClassCastException classcastexception;
        classcastexception;
        StaticMethods.logWarningFormat("Analytics - Invalid data for point of interest(%s)", new Object[] {
            classcastexception.getLocalizedMessage()
        });
        if (true) goto _L5; else goto _L4
_L4:
    }
}
