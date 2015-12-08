// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ui;

import android.content.Context;
import android.content.Intent;
import com.google.common.base.Preconditions;
import com.weather.Weather.locations.LocationManagerActivity;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.lbs.LbsUtil;
import java.util.List;

public class DropDownNavigationListenerClass
    implements android.app.ActionBar.OnNavigationListener
{

    private static final String TAG = "DropDownNavigationListenerClass";
    private final Context context;
    private final String feedId;
    private final LocationManager locationManager;

    public DropDownNavigationListenerClass(Context context1, String s, LocationManager locationmanager)
    {
        context = (Context)Preconditions.checkNotNull(context1);
        feedId = s;
        locationManager = (LocationManager)Preconditions.checkNotNull(locationmanager);
    }

    private void startLocationManager()
    {
        Intent intent = new Intent(context, com/weather/Weather/locations/LocationManagerActivity);
        if (feedId != null)
        {
            intent.putExtra("com.weather.fromFeed", feedId);
        }
        context.startActivity(intent);
    }

    public boolean onNavigationItemSelected(int i, long l)
    {
        Object obj;
        SavedLocation savedlocation;
        int j;
        boolean flag;
        obj = locationManager.getFixedLocations();
        flag = LbsUtil.getInstance().isLbsEnabledForAppAndDevice();
        savedlocation = locationManager.getFollowMeLocation();
        j = ((List) (obj)).size() + 1;
        if (!flag || savedlocation == null) goto _L2; else goto _L1
_L1:
        if (i != 0) goto _L4; else goto _L3
_L3:
        locationManager.setFollowMeAsCurrent("DropDownNavigationListenerClass.onNavigationItemSelected(itemPosition, itemId", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.USER_SELECTED);
_L6:
        return true;
_L4:
        if (i < (j + 1) - 1)
        {
            obj = (SavedLocation)((List) (obj)).get(i - 1);
            locationManager.setCurrentLocation(((SavedLocation) (obj)), "DropDownNavigationListenerClass (lbs on)", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.USER_SELECTED);
            return true;
        } else
        {
            startLocationManager();
            return true;
        }
_L2:
        if (i == j - 1 && j > 1)
        {
            startLocationManager();
            return true;
        }
        if (i < j - 1)
        {
            obj = (SavedLocation)((List) (obj)).get(i);
            locationManager.setCurrentLocation(((SavedLocation) (obj)), "DropDownNavigationListenerClass (lbs off)", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.USER_SELECTED);
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
