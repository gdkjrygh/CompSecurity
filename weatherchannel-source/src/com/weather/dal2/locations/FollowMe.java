// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import com.google.common.base.Preconditions;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.lbs.LbsServiceController;
import com.weather.dal2.system.TwcBus;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.dal2.locations:
//            FixedLocations, LocationChange, SavedLocation, ActiveLocation, 
//            LocationUtils, LocationPrefs, CurrentLocation, LocationBaseServiceChange

public class FollowMe
{

    private static final int FM_ACITVATION_TIMEOUT_MILLIS = 15000;
    private static final String TAG = "FollowMe";
    private static final FollowMe instance = new FollowMe();
    private Timer activationTimer;
    private int activatorWidgetId;
    private SavedLocation followMeLocation;
    private volatile boolean isAwaitingActivation;
    private List zombieWidgetIds;

    private FollowMe()
    {
        activationTimer = new Timer();
        if (!load())
        {
            followMeLocation = null;
            isAwaitingActivation = false;
            activatorWidgetId = -1;
            zombieWidgetIds = null;
        }
    }

    private EnumSet deactivateFollowMe()
    {
        EnumSet enumset = EnumSet.noneOf(com/weather/dal2/locations/LocationChange$Flags);
        if (followMeLocation == null)
        {
            return enumset;
        }
        FixedLocations fixedlocations = FixedLocations.getInstance();
        if (fixedlocations.isEmpty())
        {
            enumset.addAll(fixedlocations.addToList(followMeLocation).getFlags());
        }
        zombieWidgetIds = followMeLocation.getWidgetIds();
        followMeLocation = null;
        if (ActiveLocation.getInstance().normalize())
        {
            enumset.add(LocationChange.Flags.ACTIVE);
        }
        LbsServiceController.getInstance().onDeactivateFollowMe();
        enumset.add(LocationChange.Flags.FOLLOW_ME_DEACTIVATED);
        return enumset;
    }

    private void failActivation()
    {
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            LogUtil.method("FollowMe", LoggingMetaTags.TWC_DAL_LOCATIONS, "failActivation", new Object[0]);
            isAwaitingActivation = false;
            activationTimer.cancel();
            LocationChange.broadcast(EnumSet.of(LocationChange.Flags.FOLLOW_ME_ACTIVATION_FAILURE), null);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static FollowMe getInstance()
    {
        return instance;
    }

    private static boolean hasSameLatLng(SavedLocation savedlocation, SavedLocation savedlocation1)
    {
        return savedlocation.getLatLong().equals(savedlocation1.getLatLong());
    }

    private boolean load()
    {
        boolean flag1 = false;
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        String s;
        s = LocationPrefs.getInstance().getString(LocationPrefs.Keys.FOLLOW_ME, "");
        LogUtil.d("FollowMe", LoggingMetaTags.TWC_DAL_LOCATIONS, "json: %s", new Object[] {
            s
        });
        boolean flag = flag1;
        if (s.isEmpty())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        flag = flag1;
        if (s.equals("{}"))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        followMeLocation = SavedLocation.deSerialize((new JSONObject(s)).getJSONObject("followMeLocation").toString());
        isAwaitingActivation = false;
        activatorWidgetId = -1;
        zombieWidgetIds = null;
        flag = true;
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (JSONException jsonexception)
        {
            EventLog.w("FollowMe", jsonexception.toString(), jsonexception);
        }
        return false;
    }

    private boolean updateFollowMe(SavedLocation savedlocation, boolean flag)
    {
label0:
        {
            LogUtil.method("FollowMe", LoggingMetaTags.TWC_DAL_LOCATIONS, "updateFollowMe", new Object[] {
                savedlocation
            });
            synchronized (LocationUtils.LOCATION_LOCK)
            {
                if (followMeLocation != null)
                {
                    break label0;
                }
                LogUtil.d("FollowMe", LoggingMetaTags.TWC_DAL_LOCATIONS, "followMeLocation == null", new Object[0]);
            }
            return false;
        }
        LogUtil.d("FollowMe", LoggingMetaTags.TWC_DAL_LOCATIONS, "after", new Object[0]);
        savedlocation.merge(followMeLocation);
        if (!ActiveLocation.getInstance().isActiveLocation(followMeLocation) || !ActiveLocation.getInstance().setLocation(savedlocation, false)) goto _L2; else goto _L1
_L1:
        EnumSet enumset;
        LogUtil.d("FollowMe", LoggingMetaTags.TWC_DAL_LOCATIONS, "isActiveLocation", new Object[0]);
        enumset = EnumSet.of(LocationChange.Flags.FOLLOW_ME_CHANGE, LocationChange.Flags.ACTIVE);
_L4:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        enumset.add(LocationChange.Flags.FOLLOW_ME_CHANGE_ON_LAST_LOCATION);
        LogUtil.d("FollowMe", LoggingMetaTags.TWC_DAL_LOCATIONS, "rawLocation: %s", new Object[] {
            savedlocation
        });
        followMeLocation = savedlocation;
        LocationChange.broadcast(enumset, savedlocation);
        obj;
        JVM INSTR monitorexit ;
        return true;
_L2:
        LogUtil.d("FollowMe", LoggingMetaTags.TWC_DAL_LOCATIONS, "followMe not active", new Object[0]);
        enumset = EnumSet.of(LocationChange.Flags.FOLLOW_ME_CHANGE);
        if (true) goto _L4; else goto _L3
_L3:
        savedlocation;
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
    }

    public void activateFollowMe(SavedLocation savedlocation)
    {
        LogUtil.method("FollowMe", LoggingMetaTags.TWC_DAL_LOCATIONS, "activateFollowMe", new Object[] {
            savedlocation
        });
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        EnumSet enumset;
        activationTimer.cancel();
        enumset = EnumSet.of(LocationChange.Flags.FOLLOW_ME_ACTIVATED);
        if (followMeLocation == null) goto _L2; else goto _L1
_L1:
        if (!followMeLocation.getWidgetIds().contains(Integer.valueOf(activatorWidgetId)))
        {
            followMeLocation.addWidgetId(Integer.valueOf(activatorWidgetId));
        }
        savedlocation.merge(followMeLocation);
        followMeLocation = savedlocation;
_L3:
        LocationChange.broadcast(enumset, savedlocation);
        isAwaitingActivation = false;
        return;
_L2:
        savedlocation.addWidgetId(Integer.valueOf(activatorWidgetId));
        if (zombieWidgetIds != null)
        {
            List list = savedlocation.getWidgetIds();
            Iterator iterator = zombieWidgetIds.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Integer integer = (Integer)iterator.next();
                if (!list.contains(integer))
                {
                    savedlocation.addWidgetId(integer);
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_191;
        savedlocation;
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
        followMeLocation = savedlocation;
        if (ActiveLocation.getInstance().setLocation(followMeLocation, false))
        {
            enumset.add(LocationChange.Flags.ACTIVE);
        }
        CurrentLocation.getInstance().setLocation(followMeLocation, "FollowMe.activateFollowMe()", CurrentLocationChangeEvent.Cause.FOLLOW_ME);
          goto _L3
    }

    public void activateLbs(int i)
    {
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        if (!isAwaitingActivation || i == -100)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        LogUtil.method("FollowMe", LoggingMetaTags.TWC_DAL_LOCATIONS, "activateLbs", new Object[] {
            Integer.valueOf(i)
        });
        activatorWidgetId = i;
        isAwaitingActivation = true;
        LbsServiceController.getInstance().onRequestFirstFix();
        activationTimer = new Timer();
        activationTimer.schedule(new TimerTask() {

            final FollowMe this$0;

            public void run()
            {
                failActivation();
            }

            
            {
                this$0 = FollowMe.this;
                super();
            }
        }, 15000L);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public SavedLocation getLocation()
    {
        SavedLocation savedlocation;
        SavedLocation savedlocation1;
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        savedlocation1 = null;
        savedlocation = obj1;
        Object obj2 = LocationUtils.LOCATION_LOCK;
        savedlocation = obj1;
        obj2;
        JVM INSTR monitorenter ;
        savedlocation = obj;
        if (followMeLocation == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        savedlocation = obj;
        savedlocation1 = SavedLocation.newInstance(followMeLocation);
        savedlocation = savedlocation1;
        obj2;
        JVM INSTR monitorexit ;
        return savedlocation1;
        Exception exception;
        exception;
        obj2;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (JSONException jsonexception)
        {
            EventLog.w("FollowMe", jsonexception.toString(), jsonexception);
        }
        return savedlocation;
    }

    public void handleNewLbsLocation(SavedLocation savedlocation, boolean flag)
    {
        LogUtil.method("FollowMe", LoggingMetaTags.TWC_DAL_LBS, "handleNewLbsLocation", new Object[] {
            savedlocation
        });
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        LocationBaseServiceChange locationbaseservicechange;
        locationbaseservicechange = null;
        if (savedlocation == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        locationbaseservicechange = new LocationBaseServiceChange(savedlocation);
        locationbaseservicechange.setOriginTag("FollowMe");
        if (!isAwaitingActivation) goto _L2; else goto _L1
_L1:
        if (followMeLocation == null) goto _L4; else goto _L3
_L3:
        List list;
        list = followMeLocation.getWidgetIds();
        LogUtil.d("FollowMe", LoggingMetaTags.TWC_DAL_LBS, "state 3: Awaiting activation while already activated - ids:%s, activatorWidgetId:%d", new Object[] {
            list, Integer.valueOf(activatorWidgetId)
        });
        if (savedlocation != null) goto _L6; else goto _L5
_L5:
        if (list.contains(Integer.valueOf(activatorWidgetId))) goto _L8; else goto _L7
_L7:
        activateFollowMe(followMeLocation);
_L9:
        obj;
        JVM INSTR monitorexit ;
        return;
_L8:
        activationTimer.cancel();
        isAwaitingActivation = false;
          goto _L9
_L12:
        obj;
        JVM INSTR monitorexit ;
        throw savedlocation;
_L6:
label0:
        {
            if (list.contains(Integer.valueOf(activatorWidgetId)))
            {
                break label0;
            }
            activateFollowMe(savedlocation);
            DataAccessLayer.BUS.post(locationbaseservicechange);
            LogUtil.d("FollowMe", LoggingMetaTags.TWC_DAL_LBS, "posted LocationBaseServiceChange", new Object[0]);
            if (!hasSameLatLng(followMeLocation, savedlocation))
            {
                updateFollowMe(savedlocation, flag);
            }
        }
          goto _L9
        activationTimer.cancel();
        isAwaitingActivation = false;
          goto _L9
_L4:
        LogUtil.d("FollowMe", LoggingMetaTags.TWC_DAL_LBS, "state 1: Normal awaiting Activation condition - activatorWidgetId:%d", new Object[] {
            Integer.valueOf(activatorWidgetId)
        });
        if (savedlocation != null)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        failActivation();
          goto _L9
        activateFollowMe(savedlocation);
        DataAccessLayer.BUS.post(locationbaseservicechange);
          goto _L9
_L2:
        if (followMeLocation == null) goto _L9; else goto _L10
_L10:
        LogUtil.d("FollowMe", LoggingMetaTags.TWC_DAL_LBS, "state 2: Normal running condition", new Object[0]);
        if (savedlocation == null) goto _L9; else goto _L11
_L11:
        DataAccessLayer.BUS.post(locationbaseservicechange);
        LogUtil.d("FollowMe", LoggingMetaTags.TWC_DAL_LBS, "posted LocationBaseServiceChange", new Object[0]);
        updateFollowMe(savedlocation, flag);
          goto _L9
        savedlocation;
          goto _L12
        savedlocation;
          goto _L12
    }

    public boolean isAwaitingActivation()
    {
        return isAwaitingActivation;
    }

    public void register()
    {
        DataAccessLayer.BUS.register(this);
    }

    public boolean removeFollowMe()
    {
label0:
        {
            LogUtil.method("FollowMe", LoggingMetaTags.TWC_DAL_LBS, "removeFollowMe", new Object[0]);
            synchronized (LocationUtils.LOCATION_LOCK)
            {
                if (followMeLocation != null)
                {
                    break label0;
                }
            }
            return false;
        }
        LocationChange.broadcast(deactivateFollowMe(), null);
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void removeWidget(Integer integer)
    {
        Object obj = LocationUtils.LOCATION_LOCK;
        obj;
        JVM INSTR monitorenter ;
        if (followMeLocation == null || !followMeLocation.removeWidgetId(integer)) goto _L2; else goto _L1
_L1:
        if (followMeLocation.isWidgetListEmpty() && !FixedLocations.getInstance().viewLocations().isEmpty())
        {
            deactivateFollowMe();
        }
_L4:
        return;
_L2:
        if (zombieWidgetIds != null)
        {
            zombieWidgetIds.remove(integer);
        }
        if (true) goto _L4; else goto _L3
_L3:
        integer;
        obj;
        JVM INSTR monitorexit ;
        throw integer;
    }

    public void setAddress(String s)
    {
        Preconditions.checkNotNull(s);
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            if (followMeLocation != null)
            {
                followMeLocation.setAddress(s);
            }
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void setLightningStrikeNotification(boolean flag)
    {
        setNotification(SavedLocation.AlertType.lightning, flag);
    }

    public void setNotification(SavedLocation.AlertType alerttype, boolean flag)
    {
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            if (followMeLocation != null)
            {
                followMeLocation.addRemoveAlertType(alerttype, flag);
            }
        }
        return;
        alerttype;
        obj;
        JVM INSTR monitorexit ;
        throw alerttype;
    }

    public void setRealtimeRainNotification(boolean flag)
    {
        setNotification(SavedLocation.AlertType.realTimeRain, flag);
    }

    public void setSevereNotification(boolean flag)
    {
        setNotification(SavedLocation.AlertType.severe, flag);
    }

    public void setTemperatureNotification(boolean flag)
    {
        setNotification(SavedLocation.AlertType.temperature, flag);
    }

    public void store()
    {
        JSONObject jsonobject = new JSONObject();
        synchronized (LocationUtils.LOCATION_LOCK)
        {
            if (followMeLocation != null)
            {
                jsonobject.put("followMeLocation", new JSONObject(followMeLocation.serialize()));
            }
            LocationPrefs.getInstance().putString(LocationPrefs.Keys.FOLLOW_ME, jsonobject.toString());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (JSONException jsonexception)
        {
            EventLog.w("FollowMe", jsonexception.toString(), jsonexception);
        }
        return;
    }


}
