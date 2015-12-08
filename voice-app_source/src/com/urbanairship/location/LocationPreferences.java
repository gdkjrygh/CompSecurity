// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import com.urbanairship.Preferences;
import com.urbanairship.UAirship;

public class LocationPreferences extends Preferences
{

    private static final String BACKGROUND_LOCATION_ENABLED_KEY = "com.urbanairship.location.BACKGROUND_LOCATION_ENABLED";
    private static final String FOREGROUND_LOCATION_ENABLED_KEY = "com.urbanairship.location.FOREGROUND_LOCATION_ENABLED";
    private static final String KEY_PREFIX = "com.urbanairship.location";
    private static final String LOCATION_ENABLED_KEY = "com.urbanairship.location.LOCATION_ENABLED";

    public LocationPreferences()
    {
        super(UAirship.shared().getApplicationContext());
        migratePreferencesFromFileToDb("com.urbanairship.location");
    }

    public boolean isBackgroundLocationEnabled()
    {
        return getBoolean("com.urbanairship.location.BACKGROUND_LOCATION_ENABLED", false);
    }

    public boolean isForegroundLocationEnabled()
    {
        if (isBackgroundLocationEnabled())
        {
            return true;
        } else
        {
            return getBoolean("com.urbanairship.location.FOREGROUND_LOCATION_ENABLED", true);
        }
    }

    public boolean isLocationEnabled()
    {
        return getBoolean("com.urbanairship.location.LOCATION_ENABLED", false);
    }

    void setBackgroundLocationEnabled(boolean flag)
    {
        put("com.urbanairship.location.BACKGROUND_LOCATION_ENABLED", Boolean.valueOf(flag));
    }

    void setForegroundLocationEnabled(boolean flag)
    {
        put("com.urbanairship.location.FOREGROUND_LOCATION_ENABLED", Boolean.valueOf(flag));
    }

    void setLocationEnabled(boolean flag)
    {
        put("com.urbanairship.location.LOCATION_ENABLED", Boolean.valueOf(flag));
    }
}
