// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.metrics.analytics.model;

import android.content.Context;
import android.text.TextUtils;
import cev;
import chv;
import com.ubercab.analytics.model.Device;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.vehicleview.Shape_VehicleView;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.NearbyVehicle;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import dal;
import daq;
import dar;
import dfp;
import dpg;
import fzf;
import gjx;
import hkr;
import hku;
import ica;
import icl;
import ico;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.ubercab.client.core.metrics.analytics.model:
//            Rider, Product

public final class RiderEventsProperties
    implements chv
{

    private icl mCombinedStreamSubscription;
    private final Context mContext;
    hkr mDataProvider;
    hku mDataStream;
    private final Map mFunnelProperties;
    dpg mRealtimeExperimentManager;
    private final Rider mRider;
    private final dal mSessionPreferences;

    public RiderEventsProperties(Context context, dal dal1)
    {
        this(context, dal1, new Rider(context));
    }

    RiderEventsProperties(Context context, dal dal1, Rider rider)
    {
        mRider = rider;
        mSessionPreferences = dal1;
        mFunnelProperties = createFunnelProperties(context);
        mContext = context;
        if (mSessionPreferences.A())
        {
            mRider.setRiderId(mSessionPreferences.z());
        }
    }

    private static Map createFunnelProperties(Context context)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("device", Device.create(context));
        hashmap.put("version", "3.76.4");
        return hashmap;
    }

    private void extractCurrentProductProperties(boolean flag, DynamicFare dynamicfare, NearbyVehicle nearbyvehicle)
    {
        Product product = mRider.getCurrentProduct();
        if (product == null)
        {
            return;
        }
        if (product.getId() == null)
        {
            mRider.setCurrentProduct(null);
            return;
        }
        if (!flag)
        {
            product.setEta(null);
            product.setSurge(null);
            product.setNcars(null);
            return;
        }
        float f;
        if (dynamicfare != null)
        {
            f = dynamicfare.getMultiplier();
        } else
        {
            f = 1.0F;
        }
        product.setSurge(Double.valueOf(f));
        if (nearbyvehicle == null)
        {
            product.setEta(null);
            product.setNcars(null);
            return;
        }
        product.setEta(Double.valueOf(nearbyvehicle.getMinEta()));
        int i;
        if (nearbyvehicle.getVehiclePaths() != null)
        {
            i = nearbyvehicle.getVehiclePaths().size();
        } else
        {
            i = 0;
        }
        product.setNcars(Long.valueOf(i));
    }

    private void updateProperties(City city, Client client, String s, DynamicFare dynamicfare, NearbyVehicle nearbyvehicle, Trip trip)
    {
        byte byte1;
        boolean flag;
        byte1 = -1;
        flag = true;
        if (client == null || client.getUuid() == null || client.getUuid().isEmpty()) goto _L2; else goto _L1
_L1:
        mRider.setRiderId(client.getUuid());
        s.hashCode();
        JVM INSTR lookupswitch 4: default 92
    //                   -1978426120: 408
    //                   -1929061692: 393
    //                   -1561136888: 363
    //                   2014441667: 378;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        byte byte0 = -1;
_L24:
        byte0;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 423
    //                   1 443
    //                   2 455
    //                   3 475;
           goto _L8 _L9 _L10 _L11 _L12
_L8:
        if (trip != null)
        {
            client = trip.getDriver();
        } else
        {
            client = null;
        }
        if (client == null) goto _L14; else goto _L13
_L13:
        mRider.setDriverId(client.getUuid());
        client = client.getStatus();
        client.hashCode();
        JVM INSTR lookupswitch 3: default 204
    //                   -2081881145: 519
    //                   -1484957102: 557
    //                   930446413: 538;
           goto _L15 _L16 _L17 _L18
_L15:
        byte0 = byte1;
_L28:
        byte0;
        JVM INSTR tableswitch 0 2: default 236
    //                   0 576
    //                   1 588
    //                   2 600;
           goto _L19 _L20 _L21 _L22
_L19:
        if (city != null)
        {
            mRider.setCityName(city.getCityName());
        } else
        {
            mRider.setCityName(null);
        }
        if (TextUtils.isEmpty(mRider.getRiderId()))
        {
            mRider.setRiderId(null);
            if (mSessionPreferences.A())
            {
                mRider.setRiderId(mSessionPreferences.z());
            }
        }
        client = mRider.getCurrentProduct();
        if (client != null)
        {
            client = client.getId();
        } else
        {
            client = null;
        }
        if (city == null || city.findVehicleViewById(client) == null)
        {
            flag = false;
        }
        extractCurrentProductProperties(flag, dynamicfare, nearbyvehicle);
        client = mRider;
        if (trip != null)
        {
            city = trip.getUuid();
        } else
        {
            city = null;
        }
        client.setTripId(city);
        return;
_L6:
        if (!s.equals("Dispatching")) goto _L3; else goto _L23
_L23:
        byte0 = 0;
          goto _L24
_L7:
        if (!s.equals("Looking")) goto _L3; else goto _L25
_L25:
        byte0 = 1;
          goto _L24
_L5:
        if (!s.equals("OnTrip")) goto _L3; else goto _L26
_L26:
        byte0 = 2;
          goto _L24
_L4:
        if (!s.equals("WaitingForPickup")) goto _L3; else goto _L27
_L27:
        byte0 = 3;
          goto _L24
_L9:
        mRider.setPinLocation(null);
        mRider.setRiderStatus("dispatching");
          goto _L8
_L10:
        mRider.setRiderStatus("looking");
          goto _L8
_L11:
        mRider.setPinLocation(null);
        mRider.setRiderStatus("on_trip");
          goto _L8
_L12:
        mRider.setPinLocation(null);
        mRider.setRiderStatus("waiting_for_pickup");
          goto _L8
_L2:
        mRider.setRiderId(null);
        mRider.setRiderStatus(null);
          goto _L8
_L16:
        byte0 = byte1;
        if (client.equals("Accepted"))
        {
            byte0 = 0;
        }
          goto _L28
_L18:
        byte0 = byte1;
        if (client.equals("Arrived"))
        {
            byte0 = 1;
        }
          goto _L28
_L17:
        byte0 = byte1;
        if (client.equals("DrivingClient"))
        {
            byte0 = 2;
        }
          goto _L28
_L20:
        mRider.setDriverStatus("accepted");
          goto _L19
_L21:
        mRider.setDriverStatus("arrived");
          goto _L19
_L22:
        mRider.setDriverStatus("on_trip");
          goto _L19
_L14:
        mRider.setDriverId(null);
        mRider.setDriverStatus(null);
          goto _L19
    }

    public final String getApplicationKey()
    {
        return "rider_app";
    }

    public final Map getFunnelPropertiesMap()
    {
        return mFunnelProperties;
    }

    public final Object getPropertiesObject()
    {
        mRider.getDevice().updateDevice(mContext);
        return mRider;
    }

    final Rider getRider()
    {
        return mRider;
    }

    public final void onPinLocationEvent(daq daq1)
    {
        mRider.setPinLocation(daq1.a().getUberLatLng());
    }

    public final void onPingEvent(dar dar1)
    {
        if (mRealtimeExperimentManager == null)
        {
            mRealtimeExperimentManager = ((RiderApplication)mContext.getApplicationContext()).b().ba();
        }
        if (mRealtimeExperimentManager.n())
        {
            return;
        }
        Object obj = mRider.getCurrentProduct();
        String s;
        Ping ping;
        com.ubercab.client.core.model.City city;
        com.ubercab.client.core.model.Client client;
        if (obj != null)
        {
            s = ((Product) (obj)).getId();
        } else
        {
            s = null;
        }
        ping = dar1.a();
        city = ping.getCity();
        if (city != null)
        {
            obj = city.findVehicleViewById(s);
        } else
        {
            obj = null;
        }
        if (obj instanceof Shape_VehicleView)
        {
            obj = ((Shape_VehicleView)obj).getSurge();
        } else
        {
            obj = null;
        }
        dar1 = dar1.a().getNearbyVehicles();
        if (dar1 != null)
        {
            dar1 = (NearbyVehicle)dar1.get(s);
        } else
        {
            dar1 = null;
        }
        client = ping.getClient();
        if (client != null)
        {
            s = client.getStatus();
        } else
        {
            s = "";
        }
        updateProperties(city, client, s, ((DynamicFare) (obj)), dar1, ping.getTrip());
    }

    public final void onVehicleSelected(fzf fzf1)
    {
        String s = fzf1.a();
        if (mRider.getCurrentProduct() == null)
        {
            fzf1 = null;
        } else
        {
            fzf1 = mRider.getCurrentProduct().getId();
        }
        if (gjx.a(s, fzf1))
        {
            return;
        }
        mRider.setCurrentProductId(s);
        if (mDataProvider == null)
        {
            ((RiderApplication)mContext.getApplicationContext()).b().a(this);
        }
        Object obj = mDataProvider.e();
        City city;
        boolean flag;
        if (obj != null)
        {
            fzf1 = ((Eyeball) (obj)).getNearbyVehicles();
        } else
        {
            fzf1 = null;
        }
        if (fzf1 != null)
        {
            fzf1 = (NearbyVehicle)fzf1.get(s);
        } else
        {
            fzf1 = null;
        }
        if (obj != null)
        {
            obj = ((Eyeball) (obj)).getDynamicFares();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            obj = (DynamicFare)((Map) (obj)).get(s);
        } else
        {
            obj = null;
        }
        city = mDataProvider.b();
        if (city != null && city.findVehicleViewById(s) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        extractCurrentProductProperties(flag, ((DynamicFare) (obj)), fzf1);
    }

    public final void register(cev cev1)
    {
        cev1.a(this);
        if (mDataStream == null)
        {
            cev1 = ((RiderApplication)mContext.getApplicationContext()).b();
            if (cev1 != null)
            {
                mDataStream = cev1.aR();
            }
        }
        if ((mCombinedStreamSubscription == null || mCombinedStreamSubscription.c()) && mDataStream != null)
        {
            mCombinedStreamSubscription = ica.a(mDataStream.b(), mDataStream.c(), mDataStream.e(), mDataStream.g(), mDataStream.h(), new CombinedStreamHolder()).a(ico.a()).c(new CombinedStreamAction());
        }
    }

    public final void unregister(cev cev1)
    {
        cev1.b(this);
        if (mCombinedStreamSubscription != null)
        {
            mCombinedStreamSubscription.b();
        }
    }



    private class CombinedStreamHolder
        implements idm
    {

        gjy mCity;
        gjy mClient;
        gjy mClientStatus;
        gjy mEyeball;
        gjy mTrip;

        public CombinedStreamHolder call(gjy gjy1, gjy gjy2, gjy gjy3, gjy gjy4, gjy gjy5)
        {
            mCity = gjy1;
            mClient = gjy2;
            mClientStatus = gjy3;
            mEyeball = gjy4;
            mTrip = gjy5;
            return this;
        }

        public volatile Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
        {
            return call((gjy)obj, (gjy)obj1, (gjy)obj2, (gjy)obj3, (gjy)obj4);
        }

        private CombinedStreamHolder()
        {
        }

    }


    private class CombinedStreamAction
        implements ide
    {

        final RiderEventsProperties this$0;

        public void call(CombinedStreamHolder combinedstreamholder)
        {
            DynamicFare dynamicfare = null;
            Object obj = mRider.getCurrentProduct();
            Object obj1;
            Object obj2;
            Object obj3;
            if (obj != null)
            {
                obj = ((Product) (obj)).getId();
            } else
            {
                obj = null;
            }
            obj1 = (ClientStatus)combinedstreamholder.mClientStatus.d();
            if (obj1 != null)
            {
                obj1 = ((ClientStatus) (obj1)).getStatus();
            } else
            {
                obj1 = "";
            }
            obj3 = (Eyeball)combinedstreamholder.mEyeball.d();
            if (obj3 != null)
            {
                obj2 = ((Eyeball) (obj3)).getNearbyVehicles();
            } else
            {
                obj2 = null;
            }
            if (obj2 != null)
            {
                obj2 = (NearbyVehicle)((Map) (obj2)).get(obj);
            } else
            {
                obj2 = null;
            }
            if (obj3 != null)
            {
                obj3 = ((Eyeball) (obj3)).getDynamicFares();
            } else
            {
                obj3 = null;
            }
            if (obj3 != null)
            {
                dynamicfare = (DynamicFare)((Map) (obj3)).get(obj);
            }
            updateProperties((City)combinedstreamholder.mCity.d(), (Client)combinedstreamholder.mClient.d(), ((String) (obj1)), dynamicfare, ((NearbyVehicle) (obj2)), (Trip)combinedstreamholder.mTrip.d());
        }

        public volatile void call(Object obj)
        {
            call((CombinedStreamHolder)obj);
        }

        private CombinedStreamAction()
        {
            this$0 = RiderEventsProperties.this;
            super();
        }

    }

}
