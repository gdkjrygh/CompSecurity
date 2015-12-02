// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification.model;

import android.os.Bundle;

// Referenced classes of package com.ubercab.client.feature.notification.model:
//            NotificationData

public final class FareSplitInviteNotificationData extends NotificationData
{

    private static final String KEY_MASTER_NAME = "master_name";
    private static final String KEY_MASTER_PHOTO_URL = "master_photo_url";
    private static final String KEY_TRIP_ID = "trip_id";
    public static final String TYPE = "fare_split_invite";
    private String mMasterName;
    private String mMasterPhotoUrl;
    private String mTripId;

    private FareSplitInviteNotificationData(NotificationData.Source source)
    {
        super("fare_split_invite", source);
    }

    public static NotificationData createFakeData()
    {
        FareSplitInviteNotificationData faresplitinvitenotificationdata = new FareSplitInviteNotificationData(NotificationData.Source.FAKE);
        faresplitinvitenotificationdata.mTripId = "fake";
        faresplitinvitenotificationdata.mMasterName = "Heisenberg";
        faresplitinvitenotificationdata.mMasterPhotoUrl = "https://uber-mobile.s3.amazonaws.com/android-notification-testing/heisenberg.jpg";
        return faresplitinvitenotificationdata;
    }

    public static FareSplitInviteNotificationData fromUberBundle(Bundle bundle)
    {
        FareSplitInviteNotificationData faresplitinvitenotificationdata = new FareSplitInviteNotificationData(NotificationData.Source.PUSH);
        faresplitinvitenotificationdata.mTripId = bundle.getString("trip_id");
        faresplitinvitenotificationdata.mMasterName = bundle.getString("master_name");
        faresplitinvitenotificationdata.mMasterPhotoUrl = bundle.getString("master_photo_url");
        return faresplitinvitenotificationdata;
    }

    public final String getMasterName()
    {
        return mMasterName;
    }

    public final String getMasterPhotoUrl()
    {
        return mMasterPhotoUrl;
    }

    public final String getTag()
    {
        if (getSource() == NotificationData.Source.FAKE)
        {
            return "fake";
        } else
        {
            return null;
        }
    }

    public final String getTripId()
    {
        return mTripId;
    }
}
