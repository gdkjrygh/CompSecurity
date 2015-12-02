// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification.model;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import bjw;
import bmj;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.FareSplitClient;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.TripVehicle;
import com.ubercab.rider.realtime.model.TripVehicleType;
import com.ubercab.rider.realtime.model.VehicleView;
import drf;
import dug;
import gjy;
import gka;
import gke;
import gkf;
import gki;
import gkk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.notification.model:
//            NotificationData, TripDestinationData

public final class TripNotificationData extends NotificationData
{

    private static final String KEY_DESTINATION = "destination";
    private static final String KEY_DRIVER_EXTRA = "driver_extra";
    private static final String KEY_DRIVER_NAME = "driver_name";
    private static final String KEY_DRIVER_PHOTO_URL = "driver_photo_url";
    private static final String KEY_FALLBACK_TEXT = "fallback_text";
    private static final String KEY_FARE_SPLIT_CLIENTS = "fare_split_clients";
    private static final String KEY_IS_MASTER = "is_master";
    private static final String KEY_PICKUP_ADDRESS = "pickup_address";
    private static final String KEY_SURGE_MULTIPLIER = "surge_multiplier";
    private static final String KEY_TRIP_ETA = "trip_eta";
    private static final String KEY_TRIP_ID = "trip_id";
    private static final String KEY_TRIP_STATUS = "trip_status";
    private static final String KEY_VEHICLE_LICENSE = "vehicle_license";
    private static final String KEY_VEHICLE_MAKE = "vehicle_make";
    private static final String KEY_VEHICLE_MODEL = "vehicle_model";
    private static final String KEY_VEHICLE_PHOTO_URL = "vehicle_photo_url";
    private static final String KEY_VEHICLE_VIEW_MONO_IMAGE_URL = "vehicle_view_mono_image_url";
    private static final String KEY_VEHICLE_VIEW_NAME = "vehicle_view_name";
    public static final String STATUS_ACCEPTED = "accepted";
    public static final String STATUS_ARRIVED = "arrived";
    public static final String STATUS_CANCELED = "canceled";
    public static final String STATUS_DISPATCHING = "dispatching";
    public static final String STATUS_ENDED = "ended";
    public static final String STATUS_ON_TRIP = "on_trip";
    public static final String STATUS_REDISPATCHING = "redispatching";
    public static final String TYPE = "trip";
    private TripDestinationData mDestination;
    private String mDriverExtra;
    private String mDriverName;
    private String mDriverPhotoUrl;
    private String mFallbackText;
    private List mFareSplitClients;
    private boolean mIsMaster;
    private String mPickupAddress;
    private float mSurgeMultiplier;
    private int mTripEta;
    private String mTripId;
    private String mTripStatus;
    private String mVehicleLicense;
    private String mVehicleMake;
    private String mVehicleModel;
    private String mVehiclePhotoUrl;
    private String mVehicleViewMonoImageUrl;
    private String mVehicleViewName;

    private TripNotificationData(NotificationData.Source source)
    {
        super("trip", source);
    }

    public static TripNotificationData createFakeData(String s, int i, int j)
    {
        return createFakeData(s, i, j, NotificationData.Source.FAKE);
    }

    public static TripNotificationData createFakeData(String s, int i, int j, NotificationData.Source source)
    {
        return createFakeData(s, i, j, source, TripDestinationData.createFakeTripDestinationData());
    }

    public static TripNotificationData createFakeData(String s, int i, int j, NotificationData.Source source, TripDestinationData tripdestinationdata)
    {
        if (j > i)
        {
            throw new IllegalArgumentException();
        }
        source = new TripNotificationData(source);
        source.mTripId = "fake";
        source.mTripStatus = s;
        source.mTripEta = 14;
        source.mIsMaster = true;
        source.mSurgeMultiplier = 1.5F;
        source.mVehicleViewName = "uberXL";
        source.mVehicleViewMonoImageUrl = "https://d1a3f4spazzrp4.cloudfront.net/car-types/mono/mono-uberx.png";
        source.mVehiclePhotoUrl = "https://uber-mobile.s3.amazonaws.com/android-notification-testing/bounder.jpg";
        source.mVehicleMake = "Fleetwood";
        source.mVehicleModel = "Bounder";
        source.mVehicleLicense = "COOK";
        source.mPickupAddress = "706 Mission St";
        source.mDestination = tripdestinationdata;
        source.mDriverExtra = "BASE - xkyksl";
        source.mDriverName = "Heisenberg";
        source.mDriverPhotoUrl = "https://uber-mobile.s3.amazonaws.com/android-notification-testing/heisenberg.jpg";
        if (i > 0)
        {
            source.mFareSplitClients = new ArrayList();
            int k = 0;
            while (k < i) 
            {
                if (k < j)
                {
                    s = "Accepted";
                } else
                {
                    s = "Pending";
                }
                ((TripNotificationData) (source)).mFareSplitClients.add(FareSplitClient.createFake(k, s));
                k++;
            }
        }
        return source;
    }

    public static TripNotificationData fromUberBundle(bjw bjw1, Bundle bundle)
    {
        TripNotificationData tripnotificationdata = new TripNotificationData(NotificationData.Source.PUSH);
        tripnotificationdata.mTripStatus = bundle.getString("trip_status");
        tripnotificationdata.mTripId = bundle.getString("trip_id");
        tripnotificationdata.mTripEta = (int)Math.ceil(dug.a(bundle.getString("trip_eta")) / 60D);
        tripnotificationdata.mIsMaster = Boolean.parseBoolean(bundle.getString("is_master"));
        tripnotificationdata.mDriverExtra = bundle.getString("driver_extra");
        tripnotificationdata.mDriverName = bundle.getString("driver_name");
        tripnotificationdata.mDriverPhotoUrl = bundle.getString("driver_photo_url");
        tripnotificationdata.mVehicleViewName = bundle.getString("vehicle_view_name");
        tripnotificationdata.mVehicleViewMonoImageUrl = bundle.getString("vehicle_view_mono_image_url");
        tripnotificationdata.mVehicleMake = bundle.getString("vehicle_make");
        tripnotificationdata.mVehicleModel = bundle.getString("vehicle_model");
        tripnotificationdata.mVehicleLicense = bundle.getString("vehicle_license");
        tripnotificationdata.mVehiclePhotoUrl = bundle.getString("vehicle_photo_url");
        tripnotificationdata.mPickupAddress = bundle.getString("pickup_address");
        tripnotificationdata.mSurgeMultiplier = dug.b(bundle.getString("surge_multiplier"));
        tripnotificationdata.mFallbackText = bundle.getString("fallback_text");
        tripnotificationdata.mDestination = (TripDestinationData)bjw1.a(bundle.getString("destination"), com/ubercab/client/feature/notification/model/TripDestinationData);
        bundle = bundle.getString("fare_split_clients");
        if (!TextUtils.isEmpty(bundle))
        {
            tripnotificationdata.mFareSplitClients = (List)bjw1.a(bundle, (new bmj() {

            }).getType());
            return tripnotificationdata;
        } else
        {
            tripnotificationdata.mFareSplitClients = gke.b();
            return tripnotificationdata;
        }
    }

    public static TripNotificationData fromUpdate(City city, String s, FareSplit faresplit, boolean flag, Trip trip)
    {
        TripNotificationData tripnotificationdata = new TripNotificationData(NotificationData.Source.UPDATE);
        if (!flag)
        {
            tripnotificationdata.mTripStatus = "ended";
            return tripnotificationdata;
        }
        TripDriver tripdriver = trip.getDriver();
        tripnotificationdata.mTripStatus = mapClientStatusToTripStatus(s, tripdriver);
        tripnotificationdata.mTripId = trip.getUuid();
        tripnotificationdata.mTripEta = trip.getEta();
        tripnotificationdata.mIsMaster = true;
        if (tripdriver != null)
        {
            tripnotificationdata.mDriverName = tripdriver.getName();
            tripnotificationdata.mDriverPhotoUrl = tripdriver.getPictureUrl();
        }
        s = trip.getVehicle();
        if (s != null)
        {
            tripnotificationdata.mVehicleLicense = s.getLicensePlate();
            s = s.getVehicleType();
            if (s != null)
            {
                tripnotificationdata.mVehicleMake = s.getMake();
                tripnotificationdata.mVehicleModel = s.getModel();
            }
        }
        s = trip.getPickupLocation();
        if (s != null)
        {
            tripnotificationdata.mPickupAddress = s.getFormattedAddress();
        }
        s = trip.getDestination();
        if (s != null)
        {
            tripnotificationdata.mDestination = TripDestinationData.fromCnLocation(s);
        }
        city = drf.a(city, trip);
        if (city != null)
        {
            tripnotificationdata.mVehicleViewName = city.getDescription();
            tripnotificationdata.mVehicleViewMonoImageUrl = drf.a(city).toString();
        }
        if (faresplit != null)
        {
            tripnotificationdata.mFareSplitClients = new ArrayList();
            city = faresplit.getClients().iterator();
            do
            {
                if (!city.hasNext())
                {
                    break;
                }
                s = (com.ubercab.rider.realtime.model.FareSplitClient)city.next();
                if (!s.getIsSelf())
                {
                    tripnotificationdata.mFareSplitClients.add(FareSplitClient.fromFareSplitClient(s));
                }
            } while (true);
        }
        return tripnotificationdata;
    }

    private static String mapClientStatusToTripStatus(String s, TripDriver tripdriver)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   -1978426120: 86
    //                   -1929061692: 101
    //                   -1561136888: 71;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_101;
_L5:
        switch (byte0)
        {
        default:
            return "ended";

        case 0: // '\0'
            return "dispatching";

        case 1: // '\001'
            if (tripdriver != null && "Arrived".equals(tripdriver.getStatus()))
            {
                return "arrived";
            } else
            {
                return "accepted";
            }

        case 2: // '\002'
            return "on_trip";
        }
_L4:
        if (s.equals("Dispatching"))
        {
            byte0 = 0;
        }
          goto _L5
_L2:
        if (s.equals("WaitingForPickup"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("OnTrip"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TripNotificationData)obj;
            if (mIsMaster != ((TripNotificationData) (obj)).mIsMaster)
            {
                return false;
            }
            if (Float.compare(((TripNotificationData) (obj)).mSurgeMultiplier, mSurgeMultiplier) != 0)
            {
                return false;
            }
            if (mTripEta != ((TripNotificationData) (obj)).mTripEta)
            {
                return false;
            }
            if (mDestination == null ? ((TripNotificationData) (obj)).mDestination != null : !mDestination.equals(((TripNotificationData) (obj)).mDestination))
            {
                return false;
            }
            if (mDriverExtra == null ? ((TripNotificationData) (obj)).mDriverExtra != null : !mDriverExtra.equals(((TripNotificationData) (obj)).mDriverExtra))
            {
                return false;
            }
            if (mDriverName == null ? ((TripNotificationData) (obj)).mDriverName != null : !mDriverName.equals(((TripNotificationData) (obj)).mDriverName))
            {
                return false;
            }
            if (mDriverPhotoUrl == null ? ((TripNotificationData) (obj)).mDriverPhotoUrl != null : !mDriverPhotoUrl.equals(((TripNotificationData) (obj)).mDriverPhotoUrl))
            {
                return false;
            }
            if (mFallbackText == null ? ((TripNotificationData) (obj)).mFallbackText != null : !mFallbackText.equals(((TripNotificationData) (obj)).mFallbackText))
            {
                return false;
            }
            if (mFareSplitClients == null ? ((TripNotificationData) (obj)).mFareSplitClients != null : !mFareSplitClients.equals(((TripNotificationData) (obj)).mFareSplitClients))
            {
                return false;
            }
            if (mPickupAddress == null ? ((TripNotificationData) (obj)).mPickupAddress != null : !mPickupAddress.equals(((TripNotificationData) (obj)).mPickupAddress))
            {
                return false;
            }
            if (mTripId == null ? ((TripNotificationData) (obj)).mTripId != null : !mTripId.equals(((TripNotificationData) (obj)).mTripId))
            {
                return false;
            }
            if (mTripStatus == null ? ((TripNotificationData) (obj)).mTripStatus != null : !mTripStatus.equals(((TripNotificationData) (obj)).mTripStatus))
            {
                return false;
            }
            if (mVehicleLicense == null ? ((TripNotificationData) (obj)).mVehicleLicense != null : !mVehicleLicense.equals(((TripNotificationData) (obj)).mVehicleLicense))
            {
                return false;
            }
            if (mVehicleMake == null ? ((TripNotificationData) (obj)).mVehicleMake != null : !mVehicleMake.equals(((TripNotificationData) (obj)).mVehicleMake))
            {
                return false;
            }
            if (mVehicleModel == null ? ((TripNotificationData) (obj)).mVehicleModel != null : !mVehicleModel.equals(((TripNotificationData) (obj)).mVehicleModel))
            {
                return false;
            }
            if (mVehiclePhotoUrl == null ? ((TripNotificationData) (obj)).mVehiclePhotoUrl != null : !mVehiclePhotoUrl.equals(((TripNotificationData) (obj)).mVehiclePhotoUrl))
            {
                return false;
            }
            if (mVehicleViewMonoImageUrl == null ? ((TripNotificationData) (obj)).mVehicleViewMonoImageUrl != null : !mVehicleViewMonoImageUrl.equals(((TripNotificationData) (obj)).mVehicleViewMonoImageUrl))
            {
                return false;
            }
            if (mVehicleViewName == null ? ((TripNotificationData) (obj)).mVehicleViewName != null : !mVehicleViewName.equals(((TripNotificationData) (obj)).mVehicleViewName))
            {
                return false;
            }
        }
        return true;
    }

    public final FareSplitClient findClient(final String id)
    {
        return (FareSplitClient)gki.d(mFareSplitClients, new gka() {

            final TripNotificationData this$0;
            final String val$id;

            public boolean apply(FareSplitClient faresplitclient)
            {
                return faresplitclient.getId().equals(id);
            }

            public volatile boolean apply(Object obj)
            {
                return apply((FareSplitClient)obj);
            }

            
            {
                this$0 = TripNotificationData.this;
                id = s;
                super();
            }
        }).d();
    }

    public final List getAcceptedFareSplitClientsSince(final TripNotificationData lastData)
    {
        if (mFareSplitClients == null || lastData == null || lastData.getFareSplitClients() == null)
        {
            return null;
        } else
        {
            lastData = gkk.a(gki.a(mFareSplitClients, new gka() {

                final TripNotificationData this$0;
                final TripNotificationData val$lastData;

                public boolean apply(FareSplitClient faresplitclient)
                {
                    FareSplitClient faresplitclient1 = lastData.findClient(faresplitclient.getId());
                    return faresplitclient1 != null && faresplitclient.getStatus().equals("Accepted") && !faresplitclient1.getStatus().equals("Accepted");
                }

                public volatile boolean apply(Object obj)
                {
                    return apply((FareSplitClient)obj);
                }

            
            {
                this$0 = TripNotificationData.this;
                lastData = tripnotificationdata1;
                super();
            }
            }));
            return (new gkf()).a(lastData).a();
        }
    }

    public final String getDriverExtra()
    {
        return mDriverExtra;
    }

    public final String getDriverName()
    {
        return mDriverName;
    }

    public final String getDriverPhotoUrl()
    {
        return mDriverPhotoUrl;
    }

    public final String getFallbackText()
    {
        return mFallbackText;
    }

    public final List getFareSplitClients()
    {
        return mFareSplitClients;
    }

    public final int getJoinedFareSplitClientsCount()
    {
        return gki.a(gki.a(mFareSplitClients, new gka() {

            final TripNotificationData this$0;

            public boolean apply(FareSplitClient faresplitclient)
            {
                return faresplitclient.getStatus().equals("Accepted");
            }

            public volatile boolean apply(Object obj)
            {
                return apply((FareSplitClient)obj);
            }

            
            {
                this$0 = TripNotificationData.this;
                super();
            }
        }));
    }

    public final String getPickupAddress()
    {
        return mPickupAddress;
    }

    public final float getSurgeMultiplier()
    {
        return mSurgeMultiplier;
    }

    public final String getTag()
    {
        return mTripId;
    }

    public final int getTripEta()
    {
        return mTripEta;
    }

    public final String getTripId()
    {
        return mTripId;
    }

    public final String getTripStatus()
    {
        return mTripStatus;
    }

    public final String getVehicleDisplayName()
    {
        if (TextUtils.isEmpty(mVehicleMake) || TextUtils.isEmpty(mVehicleModel))
        {
            return mVehicleViewName;
        } else
        {
            return String.format("%s %s", new Object[] {
                mVehicleMake, mVehicleModel
            });
        }
    }

    public final String getVehicleLicense()
    {
        return mVehicleLicense;
    }

    public final String getVehicleMake()
    {
        return mVehicleMake;
    }

    public final String getVehicleModel()
    {
        return mVehicleModel;
    }

    public final String getVehiclePhotoUrl()
    {
        return mVehiclePhotoUrl;
    }

    public final String getVehicleViewMonoImageUrl()
    {
        return mVehicleViewMonoImageUrl;
    }

    public final String getVehicleViewName()
    {
        return mVehicleViewName;
    }

    public final boolean hasDestination()
    {
        return mDestination != null;
    }

    public final boolean hasFareSplit()
    {
        return mFareSplitClients != null && !mFareSplitClients.isEmpty();
    }

    public final int hashCode()
    {
        int i4 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        if (mDestination != null)
        {
            i = mDestination.hashCode();
        } else
        {
            i = 0;
        }
        if (mDriverExtra != null)
        {
            j = mDriverExtra.hashCode();
        } else
        {
            j = 0;
        }
        if (mDriverName != null)
        {
            k = mDriverName.hashCode();
        } else
        {
            k = 0;
        }
        if (mDriverPhotoUrl != null)
        {
            l = mDriverPhotoUrl.hashCode();
        } else
        {
            l = 0;
        }
        if (mFallbackText != null)
        {
            i1 = mFallbackText.hashCode();
        } else
        {
            i1 = 0;
        }
        if (mFareSplitClients != null)
        {
            j1 = mFareSplitClients.hashCode();
        } else
        {
            j1 = 0;
        }
        if (mPickupAddress != null)
        {
            k1 = mPickupAddress.hashCode();
        } else
        {
            k1 = 0;
        }
        if (mSurgeMultiplier != 0.0F)
        {
            l1 = Float.floatToIntBits(mSurgeMultiplier);
        } else
        {
            l1 = 0;
        }
        if (mTripId != null)
        {
            i2 = mTripId.hashCode();
        } else
        {
            i2 = 0;
        }
        if (mTripStatus != null)
        {
            j2 = mTripStatus.hashCode();
        } else
        {
            j2 = 0;
        }
        if (mVehicleLicense != null)
        {
            k2 = mVehicleLicense.hashCode();
        } else
        {
            k2 = 0;
        }
        if (mVehicleMake != null)
        {
            l2 = mVehicleMake.hashCode();
        } else
        {
            l2 = 0;
        }
        if (mVehicleModel != null)
        {
            i3 = mVehicleModel.hashCode();
        } else
        {
            i3 = 0;
        }
        if (mVehiclePhotoUrl != null)
        {
            j3 = mVehiclePhotoUrl.hashCode();
        } else
        {
            j3 = 0;
        }
        if (mVehicleViewMonoImageUrl != null)
        {
            k3 = mVehicleViewMonoImageUrl.hashCode();
        } else
        {
            k3 = 0;
        }
        if (mVehicleViewName != null)
        {
            l3 = mVehicleViewName.hashCode();
        } else
        {
            l3 = 0;
        }
        if (mIsMaster)
        {
            i4 = 1;
        }
        return ((l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i4) * 31 + mTripEta;
    }

    public final boolean isMaster()
    {
        return mIsMaster;
    }

    public final void setDriverExtra(String s)
    {
        mDriverExtra = s;
    }

    public final void setSurgeMultiplier(float f)
    {
        mSurgeMultiplier = f;
    }

    private class FareSplitClient
        implements Serializable
    {

        private static final List FAKE_NAMES = gke.a("Skyler", "Jesse", "Hank", "Marie", "Saul");
        public static final String STATUS_ACCEPTED = "Accepted";
        public static final String STATUS_CANCELED = "Canceled";
        public static final String STATUS_DECLINED = "Declined";
        public static final String STATUS_INVALID_NUMBER = "InvalidNumber";
        public static final String STATUS_NO_ACCOUNT = "NoAccount";
        public static final String STATUS_PENDING = "Pending";
        private String mId;
        private String mName;
        private String mStatus;

        public static FareSplitClient createFake(int i, String s)
        {
            FareSplitClient faresplitclient = new FareSplitClient();
            faresplitclient.mId = String.valueOf(i);
            faresplitclient.mName = (String)FAKE_NAMES.get(i);
            faresplitclient.mStatus = s;
            return faresplitclient;
        }

        public static FareSplitClient fromFareSplitClient(com.ubercab.rider.realtime.model.FareSplitClient faresplitclient)
        {
            FareSplitClient faresplitclient1 = new FareSplitClient();
            faresplitclient1.mId = faresplitclient.getMobileDigits();
            faresplitclient1.mName = faresplitclient.getDisplayName();
            faresplitclient1.mStatus = faresplitclient.getStatus();
            return faresplitclient1;
        }

        public final String getDisplayStatus(Context context)
        {
            String s;
            byte byte0;
            s = mStatus;
            byte0 = -1;
            s.hashCode();
            JVM INSTR lookupswitch 5: default 60
        //                       -2081881145: 101
        //                       -522759168: 143
        //                       -58529607: 129
        //                       632840270: 115
        //                       1418225932: 157;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            break; /* Loop/switch isn't completed */
_L6:
            break MISSING_BLOCK_LABEL_157;
_L7:
            switch (byte0)
            {
            default:
                return mStatus;

            case 0: // '\0'
                return context.getString(0x7f070236);

            case 1: // '\001'
                return context.getString(0x7f07023b);

            case 2: // '\002'
                return context.getString(0x7f070237);

            case 3: // '\003'
                return context.getString(0x7f070288);

            case 4: // '\004'
                return context.getString(0x7f070241);
            }
_L2:
            if (s.equals("Accepted"))
            {
                byte0 = 0;
            }
              goto _L7
_L5:
            if (s.equals("Declined"))
            {
                byte0 = 1;
            }
              goto _L7
_L4:
            if (s.equals("Canceled"))
            {
                byte0 = 2;
            }
              goto _L7
_L3:
            if (s.equals("InvalidNumber"))
            {
                byte0 = 3;
            }
              goto _L7
            if (s.equals("NoAccount"))
            {
                byte0 = 4;
            }
              goto _L7
        }

        public final String getId()
        {
            return mId;
        }

        public final String getName()
        {
            return mName;
        }

        public final String getStatus()
        {
            return mStatus;
        }


        private FareSplitClient()
        {
        }
    }

}
