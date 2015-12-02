// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.metrics.analytics.model;

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.NearbyVehicle;
import com.ubercab.rider.realtime.model.Trip;
import gjy;
import ide;
import java.util.Map;

// Referenced classes of package com.ubercab.client.core.metrics.analytics.model:
//            RiderEventsProperties, Rider, Product

class <init>
    implements ide
{

    final RiderEventsProperties this$0;

    public void call(<init> <init>1)
    {
        DynamicFare dynamicfare = null;
        Object obj = RiderEventsProperties.access$200(RiderEventsProperties.this).getCurrentProduct();
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
        obj1 = (ClientStatus)<init>1.mClientStatus.d();
        if (obj1 != null)
        {
            obj1 = ((ClientStatus) (obj1)).getStatus();
        } else
        {
            obj1 = "";
        }
        obj3 = (Eyeball)<init>1.mEyeball.d();
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
        RiderEventsProperties.access$300(RiderEventsProperties.this, (City)<init>1.mCity.d(), (Client)<init>1.mClient.d(), ((String) (obj1)), dynamicfare, ((NearbyVehicle) (obj2)), (Trip)<init>1.mTrip.d());
    }

    public volatile void call(Object obj)
    {
        call((call)obj);
    }

    private ()
    {
        this$0 = RiderEventsProperties.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
