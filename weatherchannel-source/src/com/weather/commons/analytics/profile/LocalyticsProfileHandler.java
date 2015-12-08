// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.profile;

import com.google.common.base.Joiner;
import com.localytics.android.Localytics;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.ups.BasicDemographicsStorage;
import com.weather.dal2.ups.Demographics;
import com.weather.dal2.ups.DemographicsStorage;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.commons.analytics.profile:
//            LocalyticsProfileAttribute

public class LocalyticsProfileHandler
{
    static class LocalyticsProfile
    {

        String ageGroup;
        boolean breakingNewsAlertsEnabled;
        int dailyRainAlertCount;
        boolean dailyRainAlertsEnabled;
        String followMeCity;
        String followMeCountryCode;
        boolean followMeEnabled;
        String followMeLocation;
        String followMeState;
        String gender;
        boolean lighteningAlertsEnabled;
        boolean loggedIn;
        boolean mPointsEnabled;
        int pollenAlertCount;
        boolean pollenAlertsEnabled;
        boolean realTimeRainAlertsEnabled;
        List savedLocationCities;
        int severeAlertCount;
        boolean severeAlertsEnabled;

        LocalyticsProfile()
        {
            savedLocationCities = new ArrayList();
            followMeLocation = "";
            followMeCity = "";
            followMeState = "";
            followMeCountryCode = "";
        }
    }


    private static final String TAG = "LocalyticsProfileHandler";
    private static volatile LocalyticsProfileHandler instance;
    private final AccountManager accountManager;
    private final DemographicsStorage demographicsStorage;
    private final LbsUtil lbsUtil;
    private final com.localytics.android.Localytics.ProfileScope localyticsScope;
    private final LocationManager locationManager;
    private final Prefs twcPrefs;

    private LocalyticsProfileHandler()
    {
        this(LocationManager.getLocationManager(), AccountManager.getInstance(), ((DemographicsStorage) (BasicDemographicsStorage.getInstance())), LbsUtil.getInstance(), TwcPrefs.getInstance());
    }

    LocalyticsProfileHandler(LocationManager locationmanager, AccountManager accountmanager, DemographicsStorage demographicsstorage, LbsUtil lbsutil, Prefs prefs)
    {
        localyticsScope = com.localytics.android.Localytics.ProfileScope.APPLICATION;
        locationManager = locationmanager;
        accountManager = accountmanager;
        demographicsStorage = demographicsstorage;
        lbsUtil = lbsutil;
        twcPrefs = prefs;
    }

    public static LocalyticsProfileHandler getInstance()
    {
        if (instance != null) goto _L2; else goto _L1
_L1:
        com/weather/commons/analytics/profile/LocalyticsProfileHandler;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new LocalyticsProfileHandler();
        }
        com/weather/commons/analytics/profile/LocalyticsProfileHandler;
        JVM INSTR monitorexit ;
_L2:
        return instance;
        Exception exception;
        exception;
        com/weather/commons/analytics/profile/LocalyticsProfileHandler;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void setForTesting(LocalyticsProfileHandler localyticsprofilehandler)
    {
        instance = localyticsprofilehandler;
    }

    private void updateProfileAlertSettings(LocalyticsProfile localyticsprofile, SavedLocation savedlocation)
    {
        if (savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.pollen))
        {
            localyticsprofile.pollenAlertCount = localyticsprofile.pollenAlertCount + 1;
            localyticsprofile.pollenAlertsEnabled = true;
        }
        if (savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.severe))
        {
            localyticsprofile.severeAlertCount = localyticsprofile.severeAlertCount + 1;
            localyticsprofile.severeAlertsEnabled = true;
        }
        if (savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.realTimeRain))
        {
            localyticsprofile.realTimeRainAlertsEnabled = true;
        }
        if (savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.breaking))
        {
            localyticsprofile.breakingNewsAlertsEnabled = true;
        }
        if (savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.rainSnow))
        {
            localyticsprofile.dailyRainAlertsEnabled = true;
            localyticsprofile.dailyRainAlertCount = localyticsprofile.dailyRainAlertCount + 1;
        }
        if (savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.lightning))
        {
            localyticsprofile.lighteningAlertsEnabled = true;
        }
    }

    LocalyticsProfile fetchLocalyticsProfile()
    {
        boolean flag1 = true;
        LocalyticsProfile localyticsprofile = new LocalyticsProfile();
        SavedLocation savedlocation;
        for (Iterator iterator = locationManager.getFixedLocations().iterator(); iterator.hasNext(); updateProfileAlertSettings(localyticsprofile, savedlocation))
        {
            savedlocation = (SavedLocation)iterator.next();
            localyticsprofile.savedLocationCities.add(savedlocation.getNickname());
        }

        Object obj = locationManager.getFollowMeLocation();
        localyticsprofile.followMeEnabled = lbsUtil.isLbsEnabledForApp();
        if (lbsUtil.isLbsEnabledForAppAndDevice() && obj != null)
        {
            updateProfileAlertSettings(localyticsprofile, ((SavedLocation) (obj)));
            localyticsprofile.followMeLocation = ((SavedLocation) (obj)).getNickname();
            localyticsprofile.followMeCity = ((SavedLocation) (obj)).getCity();
            localyticsprofile.followMeState = ((SavedLocation) (obj)).getState();
            localyticsprofile.followMeCountryCode = ((SavedLocation) (obj)).getCountryCode();
        }
        obj = demographicsStorage.getDemographics();
        localyticsprofile.ageGroup = ((Demographics) (obj)).getAgeRange();
        obj = Demographics.getGender(((Demographics) (obj)).getGender());
        boolean flag;
        if (obj != null)
        {
            if (obj == com.weather.dal2.ups.Demographics.Gender.GENDER_FEMALE)
            {
                obj = "Female";
            } else
            {
                obj = "Male";
            }
            localyticsprofile.gender = ((String) (obj));
        }
        if (accountManager.getLoginStatus() == com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_NAMED_ACCOUNT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        localyticsprofile.loggedIn = flag;
        if (!twcPrefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT, false))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        localyticsprofile.mPointsEnabled = flag;
        return localyticsprofile;
    }

    public void incrementIntegerProfileAttribute(LocalyticsProfileAttribute localyticsprofileattribute)
    {
        Localytics.incrementProfileAttribute(localyticsprofileattribute.getAttributeName(), 1L, localyticsScope);
    }

    void setLocalyticsProfileAttributes(LocalyticsProfile localyticsprofile)
    {
        Localytics.setProfileAttribute(LocalyticsProfileAttribute.GENDER.getAttributeName(), localyticsprofile.gender, localyticsScope);
        Localytics.setProfileAttribute(LocalyticsProfileAttribute.AGE_GROUP.getAttributeName(), localyticsprofile.ageGroup, localyticsScope);
        Localytics.setProfileAttribute(LocalyticsProfileAttribute.SAVED_LOCATIONS_LIST.getAttributeName(), Joiner.on(",").join(localyticsprofile.savedLocationCities), localyticsScope);
        Localytics.setProfileAttribute(LocalyticsProfileAttribute.SAVED_LOCATIONS_COUNT.getAttributeName(), localyticsprofile.savedLocationCities.size(), localyticsScope);
        Localytics.setProfileAttribute(LocalyticsProfileAttribute.POLLEN_ALERT_COUNT.getAttributeName(), localyticsprofile.pollenAlertCount, localyticsScope);
        Localytics.setProfileAttribute(LocalyticsProfileAttribute.SEVERE_WEATHER_ALERT_COUNT.getAttributeName(), localyticsprofile.severeAlertCount, localyticsScope);
        Localytics.setProfileAttribute(LocalyticsProfileAttribute.DAILY_RAIN_ALERT_COUNT.getAttributeName(), localyticsprofile.dailyRainAlertCount, localyticsScope);
        String s1 = LocalyticsProfileAttribute.LOGGED_IN.getAttributeName();
        String s;
        if (localyticsprofile.loggedIn)
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
        }
        Localytics.setProfileAttribute(s1, s, localyticsScope);
        s1 = LocalyticsProfileAttribute.SEVERE_ALERTS_ENABLED_STATE.getAttributeName();
        if (localyticsprofile.severeAlertsEnabled)
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.ON.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.OFF.getAttributeValue();
        }
        Localytics.setProfileAttribute(s1, s, localyticsScope);
        s1 = LocalyticsProfileAttribute.POLLEN_ALERTS_ENABLED_STATE.getAttributeName();
        if (localyticsprofile.pollenAlertsEnabled)
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.ON.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.OFF.getAttributeValue();
        }
        Localytics.setProfileAttribute(s1, s, localyticsScope);
        s1 = LocalyticsProfileAttribute.DAILY_RAIN_ALERTS_ENABLED_STATE.getAttributeName();
        if (localyticsprofile.dailyRainAlertsEnabled)
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.ON.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.OFF.getAttributeValue();
        }
        Localytics.setProfileAttribute(s1, s, localyticsScope);
        s1 = LocalyticsProfileAttribute.BREAKING_NEWS_ALERTS_ENABLED_STATE.getAttributeName();
        if (localyticsprofile.breakingNewsAlertsEnabled)
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.ON.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.OFF.getAttributeValue();
        }
        Localytics.setProfileAttribute(s1, s, localyticsScope);
        s1 = LocalyticsProfileAttribute.REAL_TIME_RAIN_ALERTS_ENABLED_STATE.getAttributeName();
        if (localyticsprofile.realTimeRainAlertsEnabled)
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.ON.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.OFF.getAttributeValue();
        }
        Localytics.setProfileAttribute(s1, s, localyticsScope);
        s1 = LocalyticsProfileAttribute.LIGHTENING_STRIKE_ALERTS_ENABLED_STATE.getAttributeName();
        if (localyticsprofile.lighteningAlertsEnabled)
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.ON.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.OFF.getAttributeValue();
        }
        Localytics.setProfileAttribute(s1, s, localyticsScope);
        Localytics.setProfileAttribute(LocalyticsProfileAttribute.FOLLOW_ME_LOCATION.getAttributeName(), localyticsprofile.followMeLocation, localyticsScope);
        Localytics.setProfileAttribute(LocalyticsProfileAttribute.FOLLOW_ME_CITY.getAttributeName(), localyticsprofile.followMeCity, localyticsScope);
        Localytics.setProfileAttribute(LocalyticsProfileAttribute.FOLLOW_ME_STATE.getAttributeName(), localyticsprofile.followMeState, localyticsScope);
        Localytics.setProfileAttribute(LocalyticsProfileAttribute.FOLLOW_ME_COUNTRY_CODE.getAttributeName(), localyticsprofile.followMeCountryCode, localyticsScope);
        s1 = LocalyticsProfileAttribute.FOLLOW_ME_ENABLED_STATE.getAttributeName();
        if (localyticsprofile.followMeEnabled)
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.ON.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.OFF.getAttributeValue();
        }
        Localytics.setProfileAttribute(s1, s, localyticsScope);
        s = LocalyticsProfileAttribute.M_POINTS_ENABLED_STATE.getAttributeName();
        if (localyticsprofile.mPointsEnabled)
        {
            localyticsprofile = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.ON.getAttributeValue();
        } else
        {
            localyticsprofile = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.OFF.getAttributeValue();
        }
        Localytics.setProfileAttribute(s, localyticsprofile, localyticsScope);
    }

    public void updateSessionSynchedProfileAttributes()
    {
        setLocalyticsProfileAttributes(fetchLocalyticsProfile());
    }
}
