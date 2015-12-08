// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend.location;

import android.net.TrafficStats;
import android.util.Log;
import com.google.common.base.Preconditions;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.weather.commons.ups.backend.AbnormalHttpResponseException;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.backend.UpsCommonUtil;
import com.weather.commons.ups.backend.UpsConstants;
import com.weather.commons.ups.facade.DsxLocation;
import com.weather.commons.ups.facade.Profile;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.FollowMeSnapshot;
import com.weather.dal2.locations.LocationConnection;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.JsonObjectMapper;
import com.weather.util.net.HttpRequest;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class UpsLocationManager
{

    private static final UpsLocationManager INSTANCE = new UpsLocationManager();
    private static final String TAG = "UpsLocationManager";
    private final AccountManager accountManager = AccountManager.getInstance();
    private final TypeToken locationListType = new TypeToken() {

        final UpsLocationManager this$0;

            
            {
                this$0 = UpsLocationManager.this;
                super();
            }
    };
    private List savedLocationsAtAppStartUp;

    private UpsLocationManager()
    {
    }

    private int calculateNewPosition(int i, int j)
    {
        i--;
        if (j > i)
        {
            return i;
        } else
        {
            return i - j;
        }
    }

    private int getCurrentPostionForLocation(SavedLocation savedlocation)
    {
        List list = FixedLocations.getInstance().viewLocations();
        for (int i = 0; i < list.size(); i++)
        {
            if (savedlocation.getKeyTypeCountry().equals(((SavedLocation)list.get(i)).getKeyTypeCountry()))
            {
                return i;
            }
        }

        return 0;
    }

    public static UpsLocationManager getInstance()
    {
        return INSTANCE;
    }

    private SavedLocation getSavedLocationFromProfileLocField(String s)
    {
        Object obj1 = null;
        Object obj;
        if (UpsCommonUtil.getFieldType(s) == com.weather.commons.ups.backend.UpsCommonUtil.LocFieldType.KEY_TYPE)
        {
            try
            {
                obj = LocationConnection.getInstance().fetch(s, false);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("UpsLocationManager", (new StringBuilder()).append("unable to fetch profileLocation for locId ").append(s).toString());
                return null;
            }
        } else
        {
            obj = obj1;
            if (UpsCommonUtil.getFieldType(s) == com.weather.commons.ups.backend.UpsCommonUtil.LocFieldType.LAT_LONG)
            {
                Double adouble[] = UpsCommonUtil.getLatLong(s);
                obj = obj1;
                if (adouble != null)
                {
                    SavedLocation savedlocation;
                    try
                    {
                        savedlocation = LocationConnection.getInstance().fetch(adouble[0].doubleValue(), adouble[1].doubleValue(), false);
                    }
                    catch (Exception exception)
                    {
                        Log.e("UpsLocationManager", (new StringBuilder()).append("unable to fetch profileLocation for lat long ").append(s).toString());
                        return null;
                    }
                    return savedlocation;
                }
            }
        }
        return ((SavedLocation) (obj));
    }

    private boolean isLocationExistsInTheList(List list, SavedLocation savedlocation)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            SavedLocation savedlocation1 = (SavedLocation)list.next();
            if (savedlocation.getKeyTypeCountry().equals(savedlocation1.getKeyTypeCountry()))
            {
                return true;
            }
        }

        return false;
    }

    private void removeExtraLocations(List list)
    {
        Iterator iterator = FixedLocations.getInstance().viewLocations().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SavedLocation savedlocation = (SavedLocation)iterator.next();
            if (!isLocationExistsInTheList(list, savedlocation))
            {
                FixedLocations.getInstance().removeLocation(savedlocation);
            }
        } while (true);
    }

    public void addLocation(DsxLocation dsxlocation)
        throws com.weather.util.net.HttpRequest.HttpRequestException, JSONException, AbnormalHttpResponseException
    {
        DsxLocation dsxlocation1;
        Preconditions.checkNotNull(dsxlocation);
        dsxlocation1 = null;
        TrafficStats.setThreadStatsTag(61442);
        dsxlocation = HttpRequest.put((new StringBuilder()).append(UpsConstants.SAVED_LOCATION_URL).append(dsxlocation.getId()).toString()).contentType("application/json").header("Cookie", accountManager.getDsxCookie()).trustAllHosts().readTimeout(15000).connectTimeout(15000).send(dsxlocation.toJSON().toString());
        dsxlocation1 = dsxlocation;
        if (!dsxlocation.ok())
        {
            break MISSING_BLOCK_LABEL_148;
        }
        dsxlocation1 = dsxlocation;
        accountManager.setDsxCookie(dsxlocation.header("Set-Cookie"));
        dsxlocation1 = dsxlocation;
        Log.i("UpsLocationManager", (new StringBuilder()).append("Successfully added location. ").append(dsxlocation.code()).toString());
        if (dsxlocation != null)
        {
            try
            {
                dsxlocation.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (DsxLocation dsxlocation) { }
        }
        TrafficStats.clearThreadStatsTag();
        return;
        dsxlocation1 = dsxlocation;
        if (dsxlocation.code() != 401)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        dsxlocation1 = dsxlocation;
        Log.e("UpsLocationManager", "Cookie is bad! Clearing cookie from cache");
        dsxlocation1 = dsxlocation;
        accountManager.clearDsxCookie();
        dsxlocation1 = dsxlocation;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Failed to add location ").append(dsxlocation.code()).toString());
        dsxlocation;
        if (dsxlocation1 != null)
        {
            try
            {
                dsxlocation1.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception) { }
        }
        TrafficStats.clearThreadStatsTag();
        throw dsxlocation;
    }

    public void deleteLocation(DsxLocation dsxlocation)
        throws com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException
    {
        DsxLocation dsxlocation1;
        Preconditions.checkNotNull(dsxlocation);
        dsxlocation1 = null;
        TrafficStats.setThreadStatsTag(61442);
        dsxlocation = HttpRequest.delete((new StringBuilder()).append(UpsConstants.SAVED_LOCATION_URL).append(dsxlocation.getId()).toString()).contentType("application/json").header("Cookie", accountManager.getDsxCookie()).trustAllHosts().readTimeout(15000).connectTimeout(15000);
        dsxlocation1 = dsxlocation;
        if (!dsxlocation.ok())
        {
            break MISSING_BLOCK_LABEL_139;
        }
        dsxlocation1 = dsxlocation;
        accountManager.setDsxCookie(dsxlocation.header("Set-Cookie"));
        dsxlocation1 = dsxlocation;
        Log.i("UpsLocationManager", (new StringBuilder()).append("Successfully deleted locations. ").append(dsxlocation.code()).toString());
        if (dsxlocation != null)
        {
            try
            {
                dsxlocation.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (DsxLocation dsxlocation) { }
        }
        TrafficStats.clearThreadStatsTag();
        return;
        dsxlocation1 = dsxlocation;
        if (dsxlocation.code() != 401)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        dsxlocation1 = dsxlocation;
        Log.e("UpsLocationManager", "Cookie is bad! Clearing cookie from cache");
        dsxlocation1 = dsxlocation;
        accountManager.clearDsxCookie();
        dsxlocation1 = dsxlocation;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Failed to delete location ").append(dsxlocation.code()).toString());
        dsxlocation;
        if (dsxlocation1 != null)
        {
            try
            {
                dsxlocation1.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception) { }
        }
        TrafficStats.clearThreadStatsTag();
        throw dsxlocation;
    }

    public String getLocByLocationId(Profile profile, String s)
    {
        Preconditions.checkNotNull(profile);
        Preconditions.checkNotNull(s);
        Object obj = null;
        Iterator iterator = profile.getLocations().iterator();
        do
        {
            profile = obj;
            if (!iterator.hasNext())
            {
                break;
            }
            profile = (com.weather.commons.ups.facade.Profile.ProfileLocation)iterator.next();
            if (!profile.getId().equals(s))
            {
                continue;
            }
            s = profile.getDoc();
            profile = obj;
            if (s != null)
            {
                profile = s.getLoc();
            }
            break;
        } while (true);
        return profile;
    }

    public DsxLocation getLocationById(String s)
        throws com.weather.util.net.HttpRequest.HttpRequestException, JSONException, AbnormalHttpResponseException
    {
        HttpRequest httprequest;
        Preconditions.checkNotNull(s);
        httprequest = null;
        TrafficStats.setThreadStatsTag(61442);
        HttpRequest httprequest1 = HttpRequest.get((new StringBuilder()).append(UpsConstants.SAVED_LOCATION_URL).append(s).toString()).header("Cookie", accountManager.getDsxCookie()).trustAllHosts().header("Cache-Control", "no-cache").readTimeout(15000).connectTimeout(15000);
        httprequest = httprequest1;
        if (!httprequest1.ok())
        {
            break MISSING_BLOCK_LABEL_162;
        }
        httprequest = httprequest1;
        accountManager.setDsxCookie(httprequest1.header("Set-Cookie"));
        httprequest = httprequest1;
        Log.i("UpsLocationManager", (new StringBuilder()).append("Received saved location. ").append(httprequest1.code()).toString());
        httprequest = httprequest1;
        s = new DsxLocation(new JSONObject(httprequest1.body()));
        if (httprequest1 != null)
        {
            try
            {
                httprequest1.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception) { }
        }
        TrafficStats.clearThreadStatsTag();
        return s;
        httprequest = httprequest1;
        if (httprequest1.code() != 401)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        httprequest = httprequest1;
        Log.e("UpsLocationManager", "Cookie is bad! Clearing cookie from cache");
        httprequest = httprequest1;
        accountManager.clearDsxCookie();
        httprequest = httprequest1;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Failed to find location ").append(s).toString());
        s;
        if (httprequest != null)
        {
            try
            {
                httprequest.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception1) { }
        }
        TrafficStats.clearThreadStatsTag();
        throw s;
    }

    public String getLocationId(Profile profile, SavedLocation savedlocation)
    {
        Preconditions.checkNotNull(profile);
        Preconditions.checkNotNull(savedlocation);
        String s = savedlocation.getLatLong();
        String s1 = savedlocation.getKeyTypeCountry();
        savedlocation = null;
        Iterator iterator = profile.getLocations().iterator();
        do
        {
            profile = savedlocation;
            if (!iterator.hasNext())
            {
                break;
            }
            profile = (com.weather.commons.ups.facade.Profile.ProfileLocation)iterator.next();
            Object obj = profile.getDoc();
            if (obj == null)
            {
                continue;
            }
            obj = ((com.weather.commons.ups.facade.Profile.ProfileLocation.ProfileLocationDoc) (obj)).getLoc();
            if (obj == null || !((String) (obj)).equals(s1) && !((String) (obj)).equals(s))
            {
                continue;
            }
            profile = profile.getId();
            break;
        } while (true);
        return profile;
    }

    public List getSavedLocationsAtAppStartUp()
    {
        return savedLocationsAtAppStartUp;
    }

    public List getUserProfileLocationsFromDsx()
        throws AbnormalHttpResponseException, com.weather.util.net.HttpRequest.HttpRequestException, JSONException
    {
        HttpRequest httprequest;
        httprequest = null;
        TrafficStats.setThreadStatsTag(61442);
        HttpRequest httprequest1 = HttpRequest.get(UpsConstants.SAVED_LOCATION_URL).contentType(UpsConstants.TEXT_PLAIN).header("Cookie", accountManager.getDsxCookie()).trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
        httprequest = httprequest1;
        if (!httprequest1.ok())
        {
            break MISSING_BLOCK_LABEL_145;
        }
        httprequest = httprequest1;
        accountManager.setDsxCookie(httprequest1.header("Set-Cookie"));
        httprequest = httprequest1;
        Log.i("UpsLocationManager", (new StringBuilder()).append("Received saved locations. ").append(httprequest1.code()).toString());
        httprequest = httprequest1;
        Object obj = (List)JsonObjectMapper.fromJson(httprequest1.body(), locationListType.getType());
        Exception exception;
        if (httprequest1 != null)
        {
            try
            {
                httprequest1.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception) { }
        }
        TrafficStats.clearThreadStatsTag();
        return ((List) (obj));
        httprequest = httprequest1;
        if (httprequest1.code() != 204)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        httprequest = httprequest1;
        Log.i("UpsLocationManager", "There are no Dsx Saved Locations");
        httprequest = httprequest1;
        obj = new ArrayList();
        if (httprequest1 != null)
        {
            try
            {
                httprequest1.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception1) { }
        }
        TrafficStats.clearThreadStatsTag();
        return ((List) (obj));
        httprequest = httprequest1;
        if (httprequest1.code() != 401)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        httprequest = httprequest1;
        Log.e("UpsLocationManager", "Cookie is bad! Clearing cookie from cache");
        httprequest = httprequest1;
        accountManager.clearDsxCookie();
        httprequest = httprequest1;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Failed to get Dsx Saved Locations ").append(httprequest1.code()).toString());
        exception;
        if (httprequest != null)
        {
            try
            {
                httprequest.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception2) { }
        }
        TrafficStats.clearThreadStatsTag();
        throw exception;
    }

    public void loadLocationsFromDsx()
        throws com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException, JsonParseException, JSONException
    {
        Profile profile = accountManager.getUserProfile();
        Object obj = profile.getLocations();
        Collections.sort(((List) (obj)), new com.weather.commons.ups.facade.Profile.ProfileLocation());
        int i = 0;
        int i1 = 0;
        int j1 = 0;
        boolean flag = false;
        int k1 = 0;
        int l1 = 0;
        int i2 = 0;
        int j2 = 0;
        int l2 = 0;
        int k2 = 0;
        int i3 = 0;
        int j3 = 0;
        int k3 = 0;
        List list = FixedLocations.getInstance().viewLocations();
        ArrayList arraylist = new ArrayList();
        obj = ((List) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            Object obj1 = ((com.weather.commons.ups.facade.Profile.ProfileLocation)((Iterator) (obj)).next()).getDoc();
            int l3 = k2;
            int i4 = l2;
            int j4 = i2;
            int k4 = k1;
            int l4 = i3;
            int i5 = j2;
            int j5 = j3;
            int k5 = j1;
            int l5 = i1;
            int i6 = i;
            int j6 = l1;
            if (obj1 != null)
            {
                Object obj2 = ((com.weather.commons.ups.facade.Profile.ProfileLocation.ProfileLocationDoc) (obj1)).getLoc();
                String s1 = ((com.weather.commons.ups.facade.Profile.ProfileLocation.ProfileLocationDoc) (obj1)).getAddress();
                obj1 = ((com.weather.commons.ups.facade.Profile.ProfileLocation.ProfileLocationDoc) (obj1)).getTag();
                obj2 = getSavedLocationFromProfileLocField(((String) (obj2)));
                l3 = k2;
                i4 = l2;
                j4 = i2;
                k4 = k1;
                l4 = i3;
                i5 = j2;
                j5 = j3;
                k5 = j1;
                l5 = i1;
                i6 = i;
                j6 = l1;
                if (obj2 != null)
                {
                    int k;
                    if (isLocationExistsInTheList(list, ((SavedLocation) (obj2))))
                    {
                        int j = getCurrentPostionForLocation(((SavedLocation) (obj2)));
                        l3 = FixedLocations.getInstance().size();
                        FixedLocations.getInstance().moveWithinList(j, calculateNewPosition(l3, k3));
                    } else
                    {
                        FixedLocations.getInstance().addLocation(((SavedLocation) (obj2)));
                        k = FixedLocations.getInstance().size();
                        FixedLocations.getInstance().moveWithinList(0, calculateNewPosition(k, k3));
                    }
                    arraylist.add(obj2);
                    if (s1 != null)
                    {
                        FixedLocations.getInstance().setAddress(((SavedLocation) (obj2)), s1);
                    }
                    s1 = profile.getServiceId(((SavedLocation) (obj2)), com.weather.commons.push.PushService.ServiceType.SEVERE);
                    k = i;
                    if (s1 != null)
                    {
                        FixedLocations.getInstance().setNotification(((SavedLocation) (obj2)), com.weather.dal2.locations.SavedLocation.AlertType.severe, true);
                        if (i != 0 || profile.isServiceEnabled(s1))
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                    }
                    s1 = profile.getServiceId(((SavedLocation) (obj2)), com.weather.commons.push.PushService.ServiceType.RAINSNOW);
                    i = i1;
                    if (s1 != null)
                    {
                        FixedLocations.getInstance().setNotification(((SavedLocation) (obj2)), com.weather.dal2.locations.SavedLocation.AlertType.rainSnow, true);
                        if (i1 != 0 || profile.isServiceEnabled(s1))
                        {
                            i = 1;
                        } else
                        {
                            i = 0;
                        }
                    }
                    s1 = profile.getServiceId(((SavedLocation) (obj2)), com.weather.commons.push.PushService.ServiceType.POLLEN);
                    i1 = j1;
                    if (s1 != null)
                    {
                        FixedLocations.getInstance().setNotification(((SavedLocation) (obj2)), com.weather.dal2.locations.SavedLocation.AlertType.pollen, true);
                        if (j1 != 0 || profile.isServiceEnabled(s1))
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                    }
                    s1 = profile.getServiceId(((SavedLocation) (obj2)), com.weather.commons.push.PushService.ServiceType.HEAVY_RAIN);
                    j1 = k1;
                    if (s1 != null)
                    {
                        FixedLocations.getInstance().setNotification(((SavedLocation) (obj2)), com.weather.dal2.locations.SavedLocation.AlertType.heavy_rain, true);
                        if (k1 != 0 || profile.isServiceEnabled(s1))
                        {
                            j1 = 1;
                        } else
                        {
                            j1 = 0;
                        }
                    }
                    s1 = profile.getServiceId(((SavedLocation) (obj2)), com.weather.commons.push.PushService.ServiceType.THUNDERSTORM);
                    k1 = l1;
                    if (s1 != null)
                    {
                        FixedLocations.getInstance().setNotification(((SavedLocation) (obj2)), com.weather.dal2.locations.SavedLocation.AlertType.thunderstorm, true);
                        if (l1 != 0 || profile.isServiceEnabled(s1))
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                    }
                    s1 = profile.getServiceId(((SavedLocation) (obj2)), com.weather.commons.push.PushService.ServiceType.EXTREME_HEAT);
                    l1 = i2;
                    if (s1 != null)
                    {
                        FixedLocations.getInstance().setNotification(((SavedLocation) (obj2)), com.weather.dal2.locations.SavedLocation.AlertType.extreme_heat, true);
                        if (i2 != 0 || profile.isServiceEnabled(s1))
                        {
                            l1 = 1;
                        } else
                        {
                            l1 = 0;
                        }
                    }
                    s1 = profile.getServiceId(((SavedLocation) (obj2)), com.weather.commons.push.PushService.ServiceType.HIGH_WIND);
                    i2 = j2;
                    if (s1 != null)
                    {
                        FixedLocations.getInstance().setNotification(((SavedLocation) (obj2)), com.weather.dal2.locations.SavedLocation.AlertType.high_wind, true);
                        if (j2 != 0 || profile.isServiceEnabled(s1))
                        {
                            i2 = 1;
                        } else
                        {
                            i2 = 0;
                        }
                    }
                    s1 = profile.getServiceId(((SavedLocation) (obj2)), com.weather.commons.push.PushService.ServiceType.DENSE_FOG);
                    j2 = k2;
                    if (s1 != null)
                    {
                        FixedLocations.getInstance().setNotification(((SavedLocation) (obj2)), com.weather.dal2.locations.SavedLocation.AlertType.dense_fog, true);
                        if (k2 != 0 || profile.isServiceEnabled(s1))
                        {
                            j2 = 1;
                        } else
                        {
                            j2 = 0;
                        }
                    }
                    s1 = profile.getServiceId(((SavedLocation) (obj2)), com.weather.commons.push.PushService.ServiceType.EXTREME_COLD);
                    k2 = l2;
                    if (s1 != null)
                    {
                        FixedLocations.getInstance().setNotification(((SavedLocation) (obj2)), com.weather.dal2.locations.SavedLocation.AlertType.extreme_cold, true);
                        if (l2 != 0 || profile.isServiceEnabled(s1))
                        {
                            k2 = 1;
                        } else
                        {
                            k2 = 0;
                        }
                    }
                    s1 = profile.getServiceId(((SavedLocation) (obj2)), com.weather.commons.push.PushService.ServiceType.HEAVY_SNOWFALL);
                    l2 = i3;
                    if (s1 != null)
                    {
                        FixedLocations.getInstance().setNotification(((SavedLocation) (obj2)), com.weather.dal2.locations.SavedLocation.AlertType.heavy_snowfall, true);
                        if (i3 != 0 || profile.isServiceEnabled(s1))
                        {
                            l2 = 1;
                        } else
                        {
                            l2 = 0;
                        }
                    }
                    s1 = profile.getServiceId(((SavedLocation) (obj2)), com.weather.commons.push.PushService.ServiceType.ICE);
                    i3 = j3;
                    if (s1 != null)
                    {
                        FixedLocations.getInstance().setNotification(((SavedLocation) (obj2)), com.weather.dal2.locations.SavedLocation.AlertType.ice, true);
                        if (j3 != 0 || profile.isServiceEnabled(s1))
                        {
                            i3 = 1;
                        } else
                        {
                            i3 = 0;
                        }
                    }
                    FixedLocations.getInstance().clearTags(((SavedLocation) (obj2)));
                    l3 = j2;
                    i4 = k2;
                    j4 = l1;
                    k4 = j1;
                    l4 = l2;
                    i5 = i2;
                    j5 = i3;
                    k5 = i1;
                    l5 = i;
                    i6 = k;
                    j6 = k1;
                    if (obj1 != null)
                    {
                        FixedLocations.getInstance().addTagToLocation(((SavedLocation) (obj2)), ((String) (obj1)));
                        j6 = k1;
                        i6 = k;
                        l5 = i;
                        k5 = i1;
                        j5 = i3;
                        i5 = i2;
                        l4 = l2;
                        k4 = j1;
                        j4 = l1;
                        i4 = k2;
                        l3 = j2;
                    }
                }
            }
            k3++;
            k2 = l3;
            l2 = i4;
            i2 = j4;
            k1 = k4;
            i3 = l4;
            j2 = i5;
            j3 = j5;
            j1 = k5;
            i1 = l5;
            i = i6;
            l1 = j6;
        }
        removeExtraLocations(arraylist);
        int l = i;
        if ((new FollowMeSnapshot()).getLocation() != null)
        {
            String s = profile.getServiceId(null, com.weather.commons.push.PushService.ServiceType.FOLLOWME_SEVERE);
            if (s != null)
            {
                if (i != 0 || profile.isServiceEnabled(s))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                FollowMe.getInstance().setSevereNotification(true);
            } else
            {
                FollowMe.getInstance().setSevereNotification(false);
            }
            if (profile.getServiceId(null, com.weather.commons.push.PushService.ServiceType.REAL_TIME_RAIN) != null)
            {
                TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERTS, true);
                FollowMe.getInstance().setRealtimeRainNotification(true);
            }
            l = i;
            if (profile.getServiceId(null, com.weather.commons.push.PushService.ServiceType.FOLLOWME_LIGHTNING) != null)
            {
                TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.LIGHTNING_ALERTS, true);
                FollowMe.getInstance().setLightningStrikeNotification(true);
                l = i;
            }
        }
        if (l != 0)
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERTS, true);
        }
        if (profile.getServiceId(null, com.weather.commons.push.PushService.ServiceType.BREAKINGNEWS) != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ALERTS, true);
        }
        if (i1 != 0)
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.RAIN_SNOW_ALERTS, true);
        }
        if (j1 != 0)
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.POLLEN_ALERTS, true);
        }
        i = ((flag) ? 1 : 0);
        if (k1 != 0)
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.HEAVY_RAIN, true);
            i = 1;
        }
        if (l1 != 0)
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.THUNDERSTORM, true);
            i = 1;
        }
        if (i2 != 0)
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.EXTREME_HEAT, true);
            i = 1;
        }
        if (j2 != 0)
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.HIGH_WIND, true);
            i = 1;
        }
        if (k2 != 0)
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.DENSE_FOG, true);
            i = 1;
        }
        if (l2 != 0)
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.EXTREME_COLD, true);
            i = 1;
        }
        if (i3 != 0)
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.HEAVY_SNOWFALL, true);
            i = 1;
        }
        if (j3 != 0)
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.ICE, true);
            i = 1;
        }
        if (i != 0)
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS, true);
        }
    }

    public void setSavedLocationsAtAppStartUp(List list)
    {
        savedLocationsAtAppStartUp = list;
    }

    public void updateLocation(DsxLocation dsxlocation)
        throws com.weather.util.net.HttpRequest.HttpRequestException, JSONException, AbnormalHttpResponseException
    {
        DsxLocation dsxlocation1;
        Preconditions.checkNotNull(dsxlocation);
        dsxlocation1 = null;
        TrafficStats.setThreadStatsTag(61442);
        dsxlocation = HttpRequest.put((new StringBuilder()).append(UpsConstants.SAVED_LOCATION_URL).append(dsxlocation.getId()).toString()).contentType("application/json").header("Cookie", accountManager.getDsxCookie()).trustAllHosts().readTimeout(15000).connectTimeout(15000).send(dsxlocation.toJSON().toString());
        dsxlocation1 = dsxlocation;
        if (!dsxlocation.ok())
        {
            break MISSING_BLOCK_LABEL_149;
        }
        dsxlocation1 = dsxlocation;
        accountManager.setDsxCookie(dsxlocation.header("Set-Cookie"));
        dsxlocation1 = dsxlocation;
        Log.i("UpsLocationManager", (new StringBuilder()).append("Successfully changed locations. ").append(dsxlocation.code()).toString());
        if (dsxlocation != null)
        {
            try
            {
                dsxlocation.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (DsxLocation dsxlocation) { }
        }
        TrafficStats.clearThreadStatsTag();
        return;
        dsxlocation1 = dsxlocation;
        if (dsxlocation.code() != 401)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        dsxlocation1 = dsxlocation;
        Log.e("UpsLocationManager", "Cookie is bad! Clearing cookie from cache");
        dsxlocation1 = dsxlocation;
        accountManager.clearDsxCookie();
        dsxlocation1 = dsxlocation;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Failed to change location ").append(dsxlocation.code()).toString());
        dsxlocation;
        if (dsxlocation1 != null)
        {
            try
            {
                dsxlocation1.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception) { }
        }
        TrafficStats.clearThreadStatsTag();
        throw dsxlocation;
    }

}
