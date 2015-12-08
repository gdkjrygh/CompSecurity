// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;

import android.content.Context;
import android.util.Log;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.service.AbstractNotificationService;
import com.weather.dal2.locations.ActiveLocation;
import com.weather.dal2.locations.CurrentLocation;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FixedLocationsSnapshot;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.FollowMeSnapshot;
import com.weather.dal2.locations.LocationChange;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.WidgetLocationsSnapshot;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.ui.UIUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LocationManager
{
    static final class LocationPrefs
    {

        private static final Prefs prefs = new Prefs("LOCATION_PREFS");

        static void checkKeyTypeCountry(String s)
        {
            Preconditions.checkArgument(isValidKeyTypeCountry(s), "%s is not a valid keyTypeCountry", new Object[] {
                s
            });
        }

        static PersistedLocation getCurrentLocation()
        {
            String s = prefs.getString(Keys.CURRENT_LOCATION, "");
            boolean flag = prefs.getBoolean(Keys.FOLLOW_ME, false);
            if (isValidKeyTypeCountry(s))
            {
                return new PersistedLocation(s, flag);
            } else
            {
                return null;
            }
        }

        static boolean isValidKeyTypeCountry(CharSequence charsequence)
        {
            while (charsequence == null || Splitter.on(':').trimResults().omitEmptyStrings().splitToList(charsequence).size() != 3) 
            {
                return false;
            }
            return true;
        }

        static void setPersistedLocation(PersistedLocation persistedlocation)
        {
            LogUtil.d("LocationManager", LoggingMetaTags.TWC_UI, "setPersistedLocation location=%s", new Object[] {
                persistedlocation
            });
            Preconditions.checkNotNull(persistedlocation);
            prefs.getEditor().putString(Keys.CURRENT_LOCATION.toString(), persistedlocation.keyTypeCountry).putBoolean(Keys.FOLLOW_ME.toString(), persistedlocation.isFollowMe).apply();
        }

        static void setPersistedLocation(SavedLocation savedlocation, boolean flag)
        {
            if (savedlocation == null)
            {
                prefs.clear();
                return;
            } else
            {
                setPersistedLocation(new PersistedLocation(savedlocation.getKeyTypeCountry(), flag));
                return;
            }
        }


        private LocationPrefs()
        {
        }
    }

    static final class LocationPrefs.Keys extends Enum
    {

        private static final LocationPrefs.Keys $VALUES[];
        public static final LocationPrefs.Keys CURRENT_LOCATION;
        public static final LocationPrefs.Keys FOLLOW_ME;

        public static LocationPrefs.Keys valueOf(String s)
        {
            return (LocationPrefs.Keys)Enum.valueOf(com/weather/commons/locations/LocationManager$LocationPrefs$Keys, s);
        }

        public static LocationPrefs.Keys[] values()
        {
            return (LocationPrefs.Keys[])$VALUES.clone();
        }

        static 
        {
            CURRENT_LOCATION = new LocationPrefs.Keys("CURRENT_LOCATION", 0);
            FOLLOW_ME = new LocationPrefs.Keys("FOLLOW_ME", 1);
            $VALUES = (new LocationPrefs.Keys[] {
                CURRENT_LOCATION, FOLLOW_ME
            });
        }

        private LocationPrefs.Keys(String s, int i)
        {
            super(s, i);
        }
    }

    static final class LocationPrefs.PersistedLocation
    {

        final boolean isFollowMe;
        final String keyTypeCountry;

        public String toString()
        {
            return (new StringBuilder()).append("PersistedLocation{keyTypeCountry='").append(keyTypeCountry).append('\'').append(", isFollowMe=").append(isFollowMe).append('}').toString();
        }

        LocationPrefs.PersistedLocation(String s, boolean flag)
        {
            LocationPrefs.checkKeyTypeCountry(s);
            keyTypeCountry = s;
            isFollowMe = flag;
        }
    }


    private static final String TAG = "LocationManager";
    public static final LocationManager locationManager = new LocationManager();
    private boolean useFollowMeAsCurrent;

    public LocationManager()
    {
    }

    public static LocationManager getLocationManager()
    {
        return locationManager;
    }

    private static boolean isMatchingLocation(String s, String s1, SavedLocation savedlocation)
    {
        if (!"C".equals(s)) goto _L2; else goto _L1
_L1:
        s = savedlocation.getCountyId();
        if (s == null || !s.equals(s1)) goto _L4; else goto _L3
_L3:
        return true;
_L2:
        if (!"Z".equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        s = savedlocation.getZoneId();
        if (s != null && s.equals(s1)) goto _L3; else goto _L4
_L4:
        return false;
    }

    public boolean addFixedLocation(SavedLocation savedlocation)
    {
        boolean flag = false;
        if (!getFixedLocations().contains(savedlocation))
        {
            FixedLocations.getInstance().addLocation(savedlocation);
            flag = true;
        }
        setCurrentLocation(savedlocation, "LocationManager.addFixedLocation", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_ADDED);
        return flag;
    }

    public void enableLbs()
    {
        if (getFollowMeLocation() == null && LbsUtil.getInstance().isLbsEnabledForApp())
        {
            FollowMe.getInstance().activateLbs(-1);
        }
    }

    public SavedLocation findLocation(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        SavedLocation savedlocation;
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(s1);
        savedlocation = getFollowMeLocation();
        if (savedlocation == null) goto _L2; else goto _L1
_L1:
        boolean flag = isMatchingLocation(s, s1, savedlocation);
        if (!flag) goto _L2; else goto _L3
_L3:
        s = savedlocation;
_L6:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        Iterator iterator = getFixedLocations().iterator();
_L4:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_90;
        }
        savedlocation = (SavedLocation)iterator.next();
        flag = isMatchingLocation(s, s1, savedlocation);
        if (flag)
        {
            s = savedlocation;
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
        s = null;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
    }

    public List getAllLocations()
    {
        ArrayList arraylist = Lists.newArrayList();
        arraylist.add(getFollowMeLocation());
        arraylist.addAll(getFixedLocations());
        arraylist.addAll(getWidgetLocations());
        return arraylist;
    }

    public SavedLocation getCurrentLocation()
    {
        this;
        JVM INSTR monitorenter ;
        if (!useFollowMeAsCurrent) goto _L2; else goto _L1
_L1:
        SavedLocation savedlocation = getFollowMeLocation();
        if (savedlocation == null) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return savedlocation;
_L2:
        savedlocation = CurrentLocation.getInstance().getLocation();
        if (true) goto _L3; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public SavedLocation getFirstFixedLocationWithTag(String s)
    {
        for (Iterator iterator = getFixedLocations().iterator(); iterator.hasNext();)
        {
            SavedLocation savedlocation = (SavedLocation)iterator.next();
            if (savedlocation.getTags().contains(s))
            {
                return savedlocation;
            }
        }

        return null;
    }

    public List getFixedLocations()
    {
        return (new FixedLocationsSnapshot()).viewLocations();
    }

    public List getFollowMeAndFixedLocations()
    {
        ArrayList arraylist = Lists.newArrayList();
        SavedLocation savedlocation = getFollowMeLocation();
        if (savedlocation != null)
        {
            arraylist.add(savedlocation);
        }
        arraylist.addAll(getFixedLocations());
        return arraylist;
    }

    public SavedLocation getFollowMeLocation()
    {
        return (new FollowMeSnapshot()).getLocation();
    }

    public int getNavigationIndex()
    {
        int i = 1;
        this;
        JVM INSTR monitorenter ;
        if (!useFollowMeAsCurrent) goto _L2; else goto _L1
_L1:
        LogUtil.v("LocationManager", LoggingMetaTags.TWC_UI, "getNavigationIndex: useFollowMeAsCurrent, return=0", new Object[0]);
        i = 0;
_L3:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        boolean flag = LbsUtil.getInstance().isLbsEnabledForAppAndDevice();
        List list;
        Exception exception;
        SavedLocation savedlocation;
        if (!flag)
        {
            i = 0;
        }
        savedlocation = getCurrentLocation();
        list = getFixedLocations();
_L4:
        for (Iterator iterator = list.iterator(); iterator.hasNext() && !((SavedLocation)iterator.next()).equals(savedlocation);)
        {
            break MISSING_BLOCK_LABEL_221;
        }

        savedlocation = getFollowMeLocation();
        if (!flag || savedlocation == null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        if (i <= list.size())
        {
            break MISSING_BLOCK_LABEL_143;
        }
        setFollowMeAsCurrent("LocationManager.getNavigationIndex()", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.APP_RESTORE);
        LogUtil.v("LocationManager", LoggingMetaTags.TWC_UI, "getNavigationIndex: followMe, return=0", new Object[0]);
        i = 0;
          goto _L3
        if (!flag || savedlocation != null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        LogUtil.v("LocationManager", LoggingMetaTags.TWC_UI, "getNavigationIndex: followMe is null, return=%s", new Object[] {
            Integer.valueOf(i - 1)
        });
        i--;
          goto _L3
        LogUtil.v("LocationManager", LoggingMetaTags.TWC_UI, "getNavigationIndex: return=%s", new Object[] {
            Integer.valueOf(i)
        });
          goto _L3
        exception;
        throw exception;
        i++;
          goto _L4
    }

    public List getWidgetLocations()
    {
        return (new WidgetLocationsSnapshot()).viewLocations();
    }

    public boolean hasLocation()
    {
        return getFollowMeLocation() != null || !FixedLocations.getInstance().isEmpty();
    }

    public boolean isFollowMeAsCurrent()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = useFollowMeAsCurrent;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void moveFixedLocations(int i, int j)
    {
        FixedLocations.getInstance().moveWithinList(i, j);
    }

    public void onLocationChange(LocationChange locationchange)
    {
        this;
        JVM INSTR monitorenter ;
        if (!useFollowMeAsCurrent) goto _L2; else goto _L1
_L1:
        EnumSet enumset = locationchange.getFlags();
        if (!enumset.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_DEACTIVATED)) goto _L4; else goto _L3
_L3:
        setCurrentLocation();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (enumset.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_CHANGE) && locationchange.getLocation() != null)
        {
            setFollowMeAsCurrent("LocationManager.onLocationChange", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.FOLLOW_ME);
        }
        if (true) goto _L2; else goto _L5
_L5:
        locationchange;
        throw locationchange;
    }

    public void removeLocations(Context context, Iterable iterable)
    {
        Object obj;
label0:
        {
            boolean flag = false;
            obj = getCurrentLocation();
            iterable = iterable.iterator();
            do
            {
                if (!iterable.hasNext())
                {
                    break;
                }
                SavedLocation savedlocation = (SavedLocation)iterable.next();
                if (savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.temperature))
                {
                    AbstractNotificationService.cancelNotification(context);
                }
                FixedLocations.getInstance().removeLocation(savedlocation);
                if (savedlocation.equals(obj))
                {
                    flag = true;
                }
            } while (true);
            if (flag)
            {
                context = new FixedLocationsSnapshot();
                iterable = context.getFirstLocationWithTag("home");
                obj = context.viewLocations();
                if (!LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
                {
                    break label0;
                }
                setFollowMeAsCurrent("LocationManager.removeLocations", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_DELETED);
            }
            return;
        }
        if (iterable != null)
        {
            setCurrentLocation(iterable, "LocationManager.removeLocations(home)", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_DELETED);
            return;
        }
        if (!context.viewLocations().isEmpty())
        {
            setCurrentLocation((SavedLocation)((List) (obj)).get(0), "LocationManager.removeLocations(fixed)", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_DELETED);
            return;
        } else
        {
            setCurrentLocation(null, "LocationManager.removeLocations(null)", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_DELETED);
            return;
        }
    }

    public void setCurrentLocation()
    {
label0:
        {
            LogUtil.d("LocationManager", LoggingMetaTags.TWC_UI, "setCurrentLocation()", new Object[0]);
            LocationPrefs.PersistedLocation persistedlocation = LocationPrefs.getCurrentLocation();
            if (persistedlocation == null || persistedlocation.isFollowMe)
            {
                break label0;
            }
            Iterator iterator = getFixedLocations().iterator();
            SavedLocation savedlocation;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                savedlocation = (SavedLocation)iterator.next();
            } while (!savedlocation.getKeyTypeCountry().equals(persistedlocation.keyTypeCountry));
            LogUtil.d("LocationManager", LoggingMetaTags.TWC_UI, "setCurrentLocation: set persisted as current", new Object[0]);
            setCurrentLocation(savedlocation, "LocationManager.setCurrentLocation(persisted)", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.APP_RESTORE);
            return;
        }
        Object obj = null;
        if (!LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
        {
            FollowMe.getInstance().removeFollowMe();
        } else
        {
            obj = getFollowMeLocation();
        }
        if (obj != null)
        {
            LogUtil.d("LocationManager", LoggingMetaTags.TWC_UI, "setCurrentLocation: set follow me as current", new Object[0]);
            setFollowMeAsCurrent("LocationManager.setCurrentLocation()", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.APP_RESTORE);
            return;
        }
        obj = getFirstFixedLocationWithTag("home");
        if (obj != null)
        {
            LogUtil.d("LocationManager", LoggingMetaTags.TWC_UI, "setCurrentLocation: set home as current", new Object[0]);
            setCurrentLocation(((SavedLocation) (obj)), "LocationManager.setCurrentLocation(home)", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.APP_RESTORE);
            return;
        }
        obj = getFixedLocations().iterator();
        if (((Iterator) (obj)).hasNext())
        {
            obj = (SavedLocation)((Iterator) (obj)).next();
            LogUtil.d("LocationManager", LoggingMetaTags.TWC_UI, "setCurrentLocation: set first of getFixedLocations() as current", new Object[0]);
            setCurrentLocation(((SavedLocation) (obj)), "LocationManager.setCurrentLocation(firstFixed)", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.APP_RESTORE);
            return;
        } else
        {
            LogUtil.d("LocationManager", LoggingMetaTags.TWC_UI, "setCurrentLocation: set null as current", new Object[0]);
            setCurrentLocation(null, "LocationManager.setCurrentLocation(null)", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.APP_RESTORE);
            return;
        }
    }

    public void setCurrentLocation(SavedLocation savedlocation, String s, com.weather.dal2.locations.CurrentLocationChangeEvent.Cause cause)
    {
        this;
        JVM INSTR monitorenter ;
        SavedLocation savedlocation1;
        boolean flag;
        flag = useFollowMeAsCurrent;
        useFollowMeAsCurrent = false;
        LogUtil.d("LocationManager", LoggingMetaTags.TWC_UI, "setCurrentLocation: newLocation=%s, caller=%s", new Object[] {
            savedlocation, s
        });
        savedlocation1 = getCurrentLocation();
        if (savedlocation1 == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (savedlocation1.equals(savedlocation))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        LocationPrefs.PersistedLocation persistedlocation = LocationPrefs.getCurrentLocation();
        if (persistedlocation == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        LogUtil.d("LocationManager", LoggingMetaTags.TWC_UI, "setCurrentLocation location-change will fire, previousLocation=%s, persistedLoc=%s, newLocation=%s", new Object[] {
            savedlocation1, persistedlocation, savedlocation
        });
        if (!UIUtil.isTablet(AbstractTwcApplication.getRootContext()))
        {
            Analytics.trackState(AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.beacon_location_change), null);
        }
        ActiveLocation.getInstance().setLocation(savedlocation);
        CurrentLocation.getInstance().setLocation(savedlocation, (new StringBuilder()).append(s).append(" => LocationManager.setCurrentLocation(newLocation)").toString(), cause);
        LocationPrefs.setPersistedLocation(savedlocation, false);
        this;
        JVM INSTR monitorexit ;
        return;
        savedlocation;
        throw savedlocation;
    }

    public void setCurrentLocation(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        SavedLocation savedlocation = getFollowMeLocation();
        if (savedlocation == null) goto _L2; else goto _L1
_L1:
        if (!savedlocation.getKeyTypeCountry().equals(s)) goto _L2; else goto _L3
_L3:
        setFollowMeAsCurrent("LocationManager.setCurrentLocation(locationCode", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = getFixedLocations().iterator();
        SavedLocation savedlocation1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_114;
            }
            savedlocation1 = (SavedLocation)iterator.next();
        } while (!savedlocation1.getKeyTypeCountry().equals(s));
        setCurrentLocation(savedlocation1, (new StringBuilder()).append(s1).append(" => LocationManager.setCurrentLocation(locationCode)").toString(), com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU);
          goto _L4
        s;
        throw s;
        getLocationManager().setCurrentLocation();
          goto _L4
    }

    public void setFollowMeAsCurrent(String s, com.weather.dal2.locations.CurrentLocationChangeEvent.Cause cause)
    {
        this;
        JVM INSTR monitorenter ;
        SavedLocation savedlocation;
        SavedLocation savedlocation1;
        LogUtil.d("LocationManager", LoggingMetaTags.TWC_UI, "setFollowMeAsCurrent(%s): useFollowMeAsCurrent=%s", new Object[] {
            s, Boolean.valueOf(useFollowMeAsCurrent)
        });
        savedlocation = getFollowMeLocation();
        savedlocation1 = getCurrentLocation();
        if (useFollowMeAsCurrent || savedlocation1 == null || savedlocation == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        LocationPrefs.PersistedLocation persistedlocation = LocationPrefs.getCurrentLocation();
        if (persistedlocation == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        LogUtil.d("LocationManager", LoggingMetaTags.TWC_UI, "setFollowMeAsCurrent(%s): location-change will fire, currentLocation=%s, persistedLoc=%s, followMeLocation=%s", new Object[] {
            s, savedlocation1, persistedlocation, savedlocation
        });
        if (!UIUtil.isTablet(AbstractTwcApplication.getRootContext()))
        {
            Analytics.trackState(AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.beacon_location_change), null);
        }
        useFollowMeAsCurrent = true;
        if (savedlocation != null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        Log.e("LocationManager", (new StringBuilder()).append("setFollowMeAsCurrent(").append(s).append("): called but followMeLocation=null").toString());
        ActiveLocation.getInstance().setLocation(savedlocation);
        CurrentLocation.getInstance().setLocation(savedlocation, (new StringBuilder()).append("LocationManager.setFollowMeAsCurrent(").append(s).append(')').toString(), cause);
        LocationPrefs.setPersistedLocation(savedlocation, true);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void setLocation(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        SavedLocation savedlocation;
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(s1);
        savedlocation = getFollowMeLocation();
        if (savedlocation == null) goto _L2; else goto _L1
_L1:
        if (!isMatchingLocation(s, s1, savedlocation)) goto _L2; else goto _L3
_L3:
        setFollowMeAsCurrent("LocationManager.setLocation(locType, location)", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU);
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = getFixedLocations().iterator();
        SavedLocation savedlocation1;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            savedlocation1 = (SavedLocation)iterator.next();
        } while (!isMatchingLocation(s, s1, savedlocation1));
        setCurrentLocation(savedlocation1, "LocationManager.setCurrentLocation(locType, location)", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU);
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }

    public void setToWidgetLocation(String s)
    {
        this;
        JVM INSTR monitorenter ;
        SavedLocation savedlocation;
        Preconditions.checkNotNull(s);
        savedlocation = getFollowMeLocation();
        if (savedlocation == null) goto _L2; else goto _L1
_L1:
        if (!savedlocation.getKeyTypeCountry().equals(s)) goto _L2; else goto _L3
_L3:
        setFollowMeAsCurrent("setToWidgetLocation", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU);
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj = new ArrayList();
        List list = getFixedLocations();
        ((Collection) (obj)).addAll(list);
        ((Collection) (obj)).addAll(getWidgetLocations());
        obj = ((Collection) (obj)).iterator();
        SavedLocation savedlocation1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            savedlocation1 = (SavedLocation)((Iterator) (obj)).next();
        } while (!savedlocation1.getKeyTypeCountry().equals(s));
        if (!list.contains(savedlocation1))
        {
            FixedLocations.getInstance().addLocation(savedlocation1);
        }
        setCurrentLocation(savedlocation1, "LocationManager.setToWidgetLocation()", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU);
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }

}
