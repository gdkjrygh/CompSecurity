// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            TargetWorker, Lifecycle, AnalyticsTrackInternal

final class AnalyticsTrackBeacon
{

    private static final String BEACON_ACTION_NAME = "Beacon";
    private static final String BEACON_MAJOR_KEY = "a.beacon.major";
    private static final String BEACON_MINOR_KEY = "a.beacon.minor";
    private static final String BEACON_PROX_KEY = "a.beacon.prox";
    private static final String BEACON_UUID_KEY = "a.beacon.uuid";

    AnalyticsTrackBeacon()
    {
    }

    protected static void clearBeacon()
    {
        TargetWorker.removePersistentParameter("a.beacon.uuid");
        TargetWorker.removePersistentParameter("a.beacon.major");
        TargetWorker.removePersistentParameter("a.beacon.minor");
        TargetWorker.removePersistentParameter("a.beacon.prox");
        Lifecycle.removeContextData("a.beacon.uuid");
        Lifecycle.removeContextData("a.beacon.major");
        Lifecycle.removeContextData("a.beacon.minor");
        Lifecycle.removeContextData("a.beacon.prox");
    }

    protected static void trackBeacon(String s, String s1, String s2, Analytics.BEACON_PROXIMITY beacon_proximity, Map map)
    {
        HashMap hashmap = new HashMap();
        clearBeacon();
        if (s != null)
        {
            hashmap.put("a.beacon.uuid", s);
            TargetWorker.addPersistentParameter("a.beacon.uuid", s);
        }
        if (s1 != null)
        {
            hashmap.put("a.beacon.major", s1);
            TargetWorker.addPersistentParameter("a.beacon.major", s1);
        }
        if (s2 != null)
        {
            hashmap.put("a.beacon.minor", s2);
            TargetWorker.addPersistentParameter("a.beacon.minor", s2);
        }
        if (beacon_proximity != null)
        {
            hashmap.put("a.beacon.prox", beacon_proximity.toString());
            TargetWorker.addPersistentParameter("a.beacon.prox", beacon_proximity.toString());
        }
        Lifecycle.updateContextData(hashmap);
        if (map != null)
        {
            hashmap.putAll(map);
        }
        AnalyticsTrackInternal.trackInternal("Beacon", hashmap);
    }
}
