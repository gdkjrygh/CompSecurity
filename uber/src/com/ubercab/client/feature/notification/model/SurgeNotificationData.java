// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification.model;

import android.os.Bundle;
import dug;

// Referenced classes of package com.ubercab.client.feature.notification.model:
//            NotificationData

public final class SurgeNotificationData extends NotificationData
{

    private static final String KEY_FALLBACK_TEXT = "fallback_text";
    private static final String KEY_FARE_ID = "fare_id";
    private static final String KEY_NEW_MULTIPLIER = "new_multiplier";
    private static final String KEY_OLD_MULTIPLIER = "old_multiplier";
    private static final String KEY_VEHICLE_VIEW_NAME = "vehicle_view_name";
    public static final String TYPE = "surge";
    private String mFallbackText;
    private String mFareId;
    private float mNewMultiplier;
    private float mOldMultiplier;
    private String mVehicleViewName;

    public SurgeNotificationData(NotificationData.Source source)
    {
        super("surge", source);
    }

    public static SurgeNotificationData createFakeData()
    {
        SurgeNotificationData surgenotificationdata = new SurgeNotificationData(NotificationData.Source.FAKE);
        surgenotificationdata.mFareId = "1";
        surgenotificationdata.mVehicleViewName = "uberX";
        surgenotificationdata.mOldMultiplier = 2.75F;
        surgenotificationdata.mNewMultiplier = 1.0F;
        surgenotificationdata.mFallbackText = "Rates have dropped at your most recent pickup location. Request a ride as soon as possible to avoid surge pricing.";
        return surgenotificationdata;
    }

    public static SurgeNotificationData fromUberBundle(Bundle bundle)
    {
        SurgeNotificationData surgenotificationdata = new SurgeNotificationData(NotificationData.Source.PUSH);
        surgenotificationdata.mFareId = bundle.getString("fare_id");
        surgenotificationdata.mVehicleViewName = bundle.getString("vehicle_view_name");
        surgenotificationdata.mOldMultiplier = dug.b(bundle.getString("old_multiplier"));
        surgenotificationdata.mNewMultiplier = dug.b(bundle.getString("new_multiplier"));
        surgenotificationdata.mFallbackText = bundle.getString("fallback_text");
        return surgenotificationdata;
    }

    public final String getFallbackText()
    {
        return mFallbackText;
    }

    public final String getFareId()
    {
        return mFareId;
    }

    public final float getNewMultiplier()
    {
        return mNewMultiplier;
    }

    public final float getOldMultiplier()
    {
        return mOldMultiplier;
    }

    public final String getTag()
    {
        return mFareId;
    }

    public final String getVehicleViewName()
    {
        return mVehicleViewName;
    }
}
