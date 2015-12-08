// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk.location;

import android.content.Context;
import android.util.Log;
import com.kahuna.sdk.KahunaCommon;
import com.kahuna.sdk.KahunaPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.kahuna.sdk.location:
//            KahunaGeofence, KahunaGeofenceRemover, KahunaGeofenceRequester, KahunaLocationUtils

public class KahunaRegionManager
{

    protected static final long DEFAULT_EXPIRE_TIME_MILLI = 0x9a7ec800L;
    public static final String GEOFENCE_ID_PREFFIX = "KahunaEngineRegion_";
    private static final KahunaRegionManager instance = new KahunaRegionManager();
    private Context mContext;
    private KahunaGeofenceRemover mGeofenceRemover;
    private KahunaGeofenceRequester mGeofenceRequester;
    private Map mRegionsBeingMonitored;
    private Object mRegionsBeingMonitoredLock;
    private boolean readyForGeo;

    private KahunaRegionManager()
    {
        readyForGeo = false;
        mRegionsBeingMonitoredLock = new Object();
    }

    public static void addGeofences(KahunaCommon kahunacommon, List list, Context context)
    {
        if (kahunacommon != null && (kahunacommon instanceof KahunaCommon)) goto _L2; else goto _L1
_L1:
        Log.e("Kahuna", "You cannot request to add geofences to the Region Manager externally from the Kahuna SDK. Aborting!");
_L8:
        return;
_L2:
        if (!instance.readyForGeo)
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj2 = instance.mRegionsBeingMonitoredLock;
        obj2;
        JVM INSTR monitorenter ;
        Object obj1 = new ArrayList();
        Object obj = obj1;
        if (instance.mRegionsBeingMonitored == null) goto _L4; else goto _L3
_L3:
        obj = obj1;
        if (instance.mRegionsBeingMonitored.size() <= 0) goto _L4; else goto _L5
_L5:
        Iterator iterator;
        obj1 = new ArrayList(instance.mRegionsBeingMonitored.keySet());
        iterator = list.iterator();
_L6:
        obj = obj1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (KahunaGeofence)iterator.next();
        if (((List) (obj1)).contains(((KahunaGeofence) (obj)).getId()))
        {
            ((List) (obj1)).remove(((KahunaGeofence) (obj)).getId());
        }
        if (true) goto _L6; else goto _L4
        kahunacommon;
        obj2;
        JVM INSTR monitorexit ;
        try
        {
            throw kahunacommon;
        }
        // Misplaced declaration of an exception variable
        catch (KahunaCommon kahunacommon) { }
        if (!KahunaCommon.getDebugModeEnabled()) goto _L8; else goto _L7
_L7:
        Log.d("Kahuna", (new StringBuilder()).append("Caught exception in Region Manager add geofences: ").append(kahunacommon).toString());
        return;
_L4:
        if (((List) (obj)).size() > 0)
        {
            instance.mGeofenceRemover.removeGeofencesById(((List) (obj)));
        }
        obj = new ArrayList();
        obj1 = new HashMap();
        if (list == null) goto _L10; else goto _L9
_L9:
        int i = 0;
_L11:
        if (i >= list.size())
        {
            break; /* Loop/switch isn't completed */
        }
        KahunaGeofence kahunageofence = (KahunaGeofence)list.get(i);
        ((List) (obj)).add(kahunageofence.toGeofence());
        ((Map) (obj1)).put(kahunageofence.getId(), Long.valueOf(System.currentTimeMillis() + kahunageofence.getExpirationMilli()));
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        instance.mGeofenceRequester.addGeofences(((List) (obj)));
        instance.mRegionsBeingMonitored = ((Map) (obj1));
        KahunaPreferences.saveRegionIds(kahunacommon, instance.mRegionsBeingMonitored, context);
        KahunaPreferences.saveGeofencesBeingMonitored(kahunacommon, list, context);
        obj2;
        JVM INSTR monitorexit ;
        return;
        if (!KahunaCommon.getDebugModeEnabled()) goto _L8; else goto _L12
_L12:
        Log.d("Kahuna", "Attempted to register geofences but device is not properly setup.");
        return;
    }

    public static void clearLastEnteredRegionId(KahunaCommon kahunacommon)
    {
        if (kahunacommon == null || !(kahunacommon instanceof KahunaCommon))
        {
            Log.e("Kahuna", "You cannot clear entered region externally from the Kahuna SDK. Aborting!");
        } else
        {
            KahunaPreferences.saveLastEnteredRegionId(kahunacommon, instance.mContext, null);
            if (KahunaCommon.getDebugModeEnabled())
            {
                Log.d("Kahuna", "Cleared last entered regionId");
                return;
            }
        }
    }

    public static Set getCurrentlyMonitoredRegions(KahunaCommon kahunacommon)
    {
        Object obj;
        if (kahunacommon == null || !(kahunacommon instanceof KahunaCommon))
        {
            Log.e("Kahuna", "You cannot request to obtain Kahuna monitoring specs externally from the Kahuna SDK. Aborting!");
            return new HashSet();
        }
        obj = new HashSet();
        kahunacommon = ((KahunaCommon) (instance.mRegionsBeingMonitoredLock));
        kahunacommon;
        JVM INSTR monitorenter ;
        if (instance.mRegionsBeingMonitored != null)
        {
            for (Iterator iterator = instance.mRegionsBeingMonitored.keySet().iterator(); iterator.hasNext(); ((Set) (obj)).add(((String)iterator.next()).replace("KahunaEngineRegion_", ""))) { }
        }
        break MISSING_BLOCK_LABEL_110;
        obj;
        kahunacommon;
        JVM INSTR monitorexit ;
        throw obj;
        kahunacommon;
        JVM INSTR monitorexit ;
        return ((Set) (obj));
    }

    protected static KahunaRegionManager getInstance()
    {
        return instance;
    }

    public static String getLastEnteredRegionId(KahunaCommon kahunacommon)
    {
        if (kahunacommon == null || !(kahunacommon instanceof KahunaCommon))
        {
            Log.e("Kahuna", "You cannot get last entered region externally from the Kahuna SDK. Aborting!");
            return null;
        } else
        {
            return KahunaPreferences.getLastEnteredRegionId(kahunacommon, instance.mContext);
        }
    }

    public static void init(KahunaCommon kahunacommon)
    {
        if (kahunacommon != null && (kahunacommon instanceof KahunaCommon)) goto _L2; else goto _L1
_L1:
        Log.e("Kahuna", "You cannot init the Region Manager externally from the Kahuna SDK. Aborting!");
_L4:
        return;
_L2:
        instance.readyForGeo = servicesConnected(instance.mContext);
        if (!instance.readyForGeo) goto _L4; else goto _L3
_L3:
        instance.mGeofenceRequester = new KahunaGeofenceRequester(instance.mContext);
        instance.mGeofenceRemover = new KahunaGeofenceRemover(instance.mContext);
        Object obj = instance.mRegionsBeingMonitoredLock;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        instance.mRegionsBeingMonitored = KahunaPreferences.getSavedRegionIds(kahunacommon, instance.mContext);
        long l = System.currentTimeMillis();
        obj1 = new HashSet();
        Iterator iterator = instance.mRegionsBeingMonitored.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (l > ((Long)instance.mRegionsBeingMonitored.get(s1)).longValue())
            {
                ((Set) (obj1)).add(s1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_243;
        kahunacommon;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw kahunacommon;
        }
        // Misplaced declaration of an exception variable
        catch (KahunaCommon kahunacommon)
        {
            instance.readyForGeo = false;
        }
        if (!KahunaCommon.getDebugModeEnabled()) goto _L4; else goto _L5
_L5:
        Log.d("Kahuna", (new StringBuilder()).append("Caught error in Region Manager init: ").append(kahunacommon).toString());
        kahunacommon.printStackTrace();
        return;
        String s;
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); instance.mRegionsBeingMonitored.remove(s))
        {
            s = (String)((Iterator) (obj1)).next();
        }

        KahunaPreferences.saveRegionIds(kahunacommon, instance.mRegionsBeingMonitored, instance.mContext);
        obj;
        JVM INSTR monitorexit ;
        Object obj2 = KahunaPreferences.getSavedGeofencesBeingMonitored(kahunacommon, instance.mContext);
        obj = new ArrayList();
        obj2 = ((List) (obj2)).iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            KahunaGeofence kahunageofence = (KahunaGeofence)((Iterator) (obj2)).next();
            if (instance.mRegionsBeingMonitored.containsKey(kahunageofence.getId()))
            {
                ((List) (obj)).add(kahunageofence);
            }
        } while (true);
        if (((List) (obj)).size() <= 0) goto _L4; else goto _L6
_L6:
        addGeofences(kahunacommon, ((List) (obj)), instance.mContext);
        return;
    }

    public static boolean isDeviceReadyForRegionMonitoring()
    {
        return instance.readyForGeo;
    }

    public static void processServerRegions(KahunaCommon kahunacommon, JSONObject jsonobject, Context context)
    {
        if (kahunacommon != null && (kahunacommon instanceof KahunaCommon)) goto _L2; else goto _L1
_L1:
        Log.e("Kahuna", "You cannot request to process regions externally from the Kahuna SDK. Aborting!");
_L8:
        return;
_L2:
        if (!instance.readyForGeo)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonobject = jsonobject.optJSONArray("circle");
        if (jsonobject == null)
        {
            continue;
        }
        ArrayList arraylist;
        int j;
        j = jsonobject.length();
        arraylist = new ArrayList();
        int i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject1 = jsonobject.getJSONObject(i);
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        double d;
        double d1;
        String s;
        int k;
        long l2;
        s = jsonobject1.getString("id");
        d = jsonobject1.getDouble("lat");
        d1 = jsonobject1.getDouble("long");
        k = jsonobject1.getInt("radius");
        l2 = jsonobject1.optLong("expiry");
        long l;
        long l1;
        l1 = 0L;
        l = l1;
        if (l2 <= 0L)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        l2 -= System.currentTimeMillis() / 1000L;
        l = l1;
        if (l2 > 0L)
        {
            l = l2 * 1000L;
        }
        arraylist.add(new KahunaGeofence(s, d, d1, k, l, 3));
_L6:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        break;
        exception;
        if (!KahunaCommon.getDebugModeEnabled()) goto _L6; else goto _L5
_L5:
        Log.d("Kahuna", "Encountered error processing geofence regions from Kahuna servers.");
        exception.printStackTrace();
          goto _L6
        do
        {
            try
            {
                clearLastEnteredRegionId(kahunacommon);
                addGeofences(kahunacommon, arraylist, context);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (KahunaCommon kahunacommon) { }
            if (KahunaCommon.getDebugModeEnabled())
            {
                Log.d("Kahuna", (new StringBuilder()).append("Caught exception in Region Manager process server regions: ").append(kahunacommon).toString());
                return;
            }
        } while (false);
        if (true) goto _L8; else goto _L7
_L7:
        if (!KahunaCommon.getDebugModeEnabled()) goto _L8; else goto _L9
_L9:
        Log.d("Kahuna", "Server responded with available geofence regions but device is not setup properly.");
        return;
    }

    public static void removeAllMonitoredRegions(KahunaCommon kahunacommon)
    {
        if (kahunacommon == null || !(kahunacommon instanceof KahunaCommon))
        {
            Log.e("Kahuna", "You cannot request to remove Kahuna monitoring specs externally from the Kahuna SDK. Aborting!");
            return;
        }
        clearLastEnteredRegionId(kahunacommon);
        synchronized (instance.mRegionsBeingMonitoredLock)
        {
            if (instance.mRegionsBeingMonitored != null && instance.mRegionsBeingMonitored.size() > 0)
            {
                ArrayList arraylist = new ArrayList(instance.mRegionsBeingMonitored.keySet());
                instance.mGeofenceRemover.removeGeofencesById(arraylist);
                instance.mRegionsBeingMonitored = new HashMap();
                KahunaPreferences.saveRegionIds(kahunacommon, instance.mRegionsBeingMonitored, instance.mContext);
            }
        }
        return;
        kahunacommon;
        obj;
        JVM INSTR monitorexit ;
        throw kahunacommon;
    }

    private static boolean servicesConnected(Context context)
    {
        boolean flag;
        boolean flag1;
        try
        {
            flag1 = KahunaLocationUtils.hasPlayServices(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (KahunaCommon.getDebugModeEnabled())
            {
                Log.w("Kahuna", "Caught error when checking for play services. If you are NOT using Geofencing please ignore this error: ");
                Log.w("Kahuna", context);
            }
            return false;
        }
        flag = flag1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        flag = KahunaLocationUtils.checkManifestPermission(context, "android.permission.ACCESS_FINE_LOCATION");
        return flag;
    }

    public static void setContext(Context context)
    {
        instance.mContext = context;
    }

    public static void setLastEnteredRegionId(KahunaCommon kahunacommon, String s)
    {
        if (kahunacommon == null || !(kahunacommon instanceof KahunaCommon))
        {
            Log.e("Kahuna", "You cannot set last entered region externally from the Kahuna SDK. Aborting!");
        } else
        {
            KahunaPreferences.saveLastEnteredRegionId(kahunacommon, instance.mContext, s);
            if (KahunaCommon.getDebugModeEnabled())
            {
                Log.d("Kahuna", (new StringBuilder()).append("Saving last entered regionId: ").append(s).toString());
                return;
            }
        }
    }

}
