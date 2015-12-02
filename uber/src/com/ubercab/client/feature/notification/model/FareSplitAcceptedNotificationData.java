// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification.model;

import android.os.Bundle;

// Referenced classes of package com.ubercab.client.feature.notification.model:
//            NotificationData

public class FareSplitAcceptedNotificationData extends NotificationData
{

    private static final String KEY_MINION_NAME = "minion_name";
    private static final String KEY_MINION_PHOTO_URL = "minion_photo_url";
    private static final String KEY_TRIP_ID = "trip_id";
    public static final String TYPE = "fare_split_accepted";
    private String mMinionName;
    private String mMinionPhotoUrl;
    private String mTripId;

    protected FareSplitAcceptedNotificationData(NotificationData.Source source)
    {
        super("fare_split_accepted", source);
    }

    public static FareSplitAcceptedNotificationData createFakeData()
    {
        FareSplitAcceptedNotificationData faresplitacceptednotificationdata = new FareSplitAcceptedNotificationData(NotificationData.Source.FAKE);
        faresplitacceptednotificationdata.mTripId = "fake";
        faresplitacceptednotificationdata.mMinionName = "Heisenberg";
        faresplitacceptednotificationdata.mMinionPhotoUrl = "https://uber-mobile.s3.amazonaws.com/android-notification-testing/heisenberg.jpg";
        return faresplitacceptednotificationdata;
    }

    public static FareSplitAcceptedNotificationData fromUberBundle(Bundle bundle)
    {
        FareSplitAcceptedNotificationData faresplitacceptednotificationdata = new FareSplitAcceptedNotificationData(NotificationData.Source.PUSH);
        faresplitacceptednotificationdata.mTripId = bundle.getString("trip_id");
        faresplitacceptednotificationdata.mMinionName = bundle.getString("minion_name");
        faresplitacceptednotificationdata.mMinionPhotoUrl = bundle.getString("minion_photo_url");
        return faresplitacceptednotificationdata;
    }

    public String getMinionName()
    {
        return mMinionName;
    }

    public String getMinionPhotoUrl()
    {
        return mMinionPhotoUrl;
    }

    public String getTag()
    {
        return mTripId;
    }

    public String getTripId()
    {
        return mTripId;
    }
}
