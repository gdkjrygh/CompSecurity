// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification.model;

import android.os.Bundle;
import dug;

// Referenced classes of package com.ubercab.client.feature.notification.model:
//            NotificationData

public final class ReceiptNotificationData extends NotificationData
{

    static final String KEY_AMOUNT_CHARGED = "amount_charged";
    static final String KEY_CREDITS_USED = "credits_used";
    static final String KEY_DRIVER_NAME = "driver_name";
    static final String KEY_DRIVER_PHOTO_URL = "driver_photo_url";
    static final String KEY_MAP_IMAGE_URL = "map_image_url";
    static final String KEY_TRIP_ID = "trip_id";
    static final String KEY_VEHICLE_EXTERIOR_COLOR = "vehicle_exterior_color";
    static final String KEY_VEHICLE_LICENSE = "vehicle_license";
    static final String KEY_VEHICLE_MODEL = "vehicle_model";
    static final String KEY_VEHICLE_PHOTO_URL = "vehicle_photo_url";
    static final String KEY_VEHICLE_VIEW_NAME = "vehicle_view_name";
    public static final String TYPE = "receipt";
    private String mAmountCharged;
    private String mCreditsUsed;
    private String mDriverName;
    private String mDriverPhotoUrl;
    private String mMapImageUrl;
    private String mTripId;
    private String mVehicleExteriorColor;
    private String mVehicleLicense;
    private String mVehicleModel;
    private String mVehiclePhotoUrl;
    private String mVehicleViewName;

    private ReceiptNotificationData(NotificationData.Source source)
    {
        super("receipt", source);
    }

    public static ReceiptNotificationData createFakeData()
    {
        ReceiptNotificationData receiptnotificationdata = new ReceiptNotificationData(NotificationData.Source.FAKE);
        receiptnotificationdata.mAmountCharged = "$5.99";
        receiptnotificationdata.mCreditsUsed = "50";
        receiptnotificationdata.mDriverName = "Heisenberg";
        receiptnotificationdata.mDriverPhotoUrl = "https://uber-mobile.s3.amazonaws.com/android-notification-testing/heisenberg.jpg";
        receiptnotificationdata.mMapImageUrl = "https://uber-mobile.s3.amazonaws.com/android-notification-testing/heisenberg.jpg";
        receiptnotificationdata.mTimestamp = Long.valueOf(System.currentTimeMillis());
        receiptnotificationdata.mTripId = "fake";
        receiptnotificationdata.mVehicleExteriorColor = "Black";
        receiptnotificationdata.mVehicleLicense = "COOK";
        receiptnotificationdata.mVehicleModel = "Bounder";
        receiptnotificationdata.mVehiclePhotoUrl = "https://uber-mobile.s3.amazonaws.com/android-notification-testing/bounder.jpg";
        receiptnotificationdata.mVehicleViewName = "Uber Black";
        return receiptnotificationdata;
    }

    public static ReceiptNotificationData createFakeDataWithValues(Bundle bundle)
    {
        ReceiptNotificationData receiptnotificationdata = new ReceiptNotificationData(NotificationData.Source.FAKE);
        receiptnotificationdata.mAmountCharged = bundle.getString("amount_charged");
        receiptnotificationdata.mCreditsUsed = bundle.getString("credits_used");
        receiptnotificationdata.mDriverName = bundle.getString("driver_name");
        receiptnotificationdata.mDriverPhotoUrl = bundle.getString("driver_photo_url");
        receiptnotificationdata.mMapImageUrl = bundle.getString("map_image_url");
        receiptnotificationdata.mTripId = bundle.getString("trip_id");
        receiptnotificationdata.mVehicleExteriorColor = bundle.getString("vehicle_exterior_color");
        receiptnotificationdata.mVehicleLicense = bundle.getString("vehicle_license");
        receiptnotificationdata.mVehicleModel = bundle.getString("vehicle_model");
        receiptnotificationdata.mVehiclePhotoUrl = bundle.getString("vehicle_photo_url");
        receiptnotificationdata.mVehicleViewName = bundle.getString("vehicle_view_name");
        if (bundle.get("timestamp") != null)
        {
            receiptnotificationdata.mTimestamp = Long.valueOf(dug.a(bundle.getString("timestamp"), 0L));
        }
        return receiptnotificationdata;
    }

    static ReceiptNotificationData fromUberBundle(Bundle bundle)
    {
        ReceiptNotificationData receiptnotificationdata = new ReceiptNotificationData(NotificationData.Source.PUSH);
        receiptnotificationdata.mAmountCharged = bundle.getString("amount_charged");
        receiptnotificationdata.mCreditsUsed = bundle.getString("credits_used");
        receiptnotificationdata.mDriverName = bundle.getString("driver_name");
        receiptnotificationdata.mDriverPhotoUrl = bundle.getString("driver_photo_url");
        receiptnotificationdata.mMapImageUrl = bundle.getString("map_image_url");
        receiptnotificationdata.mTripId = bundle.getString("trip_id");
        receiptnotificationdata.mVehicleExteriorColor = bundle.getString("vehicle_exterior_color");
        receiptnotificationdata.mVehicleLicense = bundle.getString("vehicle_license");
        receiptnotificationdata.mVehicleModel = bundle.getString("vehicle_model");
        receiptnotificationdata.mVehiclePhotoUrl = bundle.getString("vehicle_photo_url");
        receiptnotificationdata.mVehicleViewName = bundle.getString("vehicle_view_name");
        return receiptnotificationdata;
    }

    public final String getAmountCharged()
    {
        return mAmountCharged;
    }

    public final String getCreditsUsed()
    {
        return mCreditsUsed;
    }

    public final String getDriverName()
    {
        return mDriverName;
    }

    public final String getDriverPhotoUrl()
    {
        return mDriverPhotoUrl;
    }

    public final String getMapImageUrl()
    {
        return mMapImageUrl;
    }

    public final String getTag()
    {
        return mTripId;
    }

    public final String getTripId()
    {
        return mTripId;
    }

    public final String getVehicleExteriorColor()
    {
        return mVehicleExteriorColor;
    }

    public final String getVehicleLicense()
    {
        return mVehicleLicense;
    }

    public final String getVehicleModel()
    {
        return mVehicleModel;
    }

    public final String getVehiclePhotoUrl()
    {
        return mVehiclePhotoUrl;
    }

    public final String getVehicleViewName()
    {
        return mVehicleViewName;
    }
}
