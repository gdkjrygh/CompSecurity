// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.metrics.analytics.model;

import android.content.Context;
import com.ubercab.analytics.model.Device;
import com.ubercab.android.location.UberLatLng;

// Referenced classes of package com.ubercab.client.core.metrics.analytics.model:
//            Product, Location

class Rider
{

    String city_name;
    Product current_product;
    Device device;
    String driver_id;
    String driver_status;
    Location pin_location;
    String rider_id;
    String rider_status;
    String trip_id;
    String version;

    Rider(Context context)
    {
        device = Device.create(context);
        version = "3.76.4";
    }

    String getCityName()
    {
        return city_name;
    }

    Product getCurrentProduct()
    {
        return current_product;
    }

    Device getDevice()
    {
        return device;
    }

    String getDriverId()
    {
        return driver_id;
    }

    String getDriverStatus()
    {
        return driver_status;
    }

    String getRiderId()
    {
        return rider_id;
    }

    String getRiderStatus()
    {
        return rider_status;
    }

    void setCityName(String s)
    {
        city_name = s;
    }

    void setCurrentProduct(Product product)
    {
        current_product = product;
    }

    void setCurrentProductId(String s)
    {
        if (s == null)
        {
            current_product = null;
        } else
        if (current_product == null || !s.equals(current_product.getId()))
        {
            current_product = new Product();
            current_product.setId(s);
            return;
        }
    }

    void setDevice(Device device1)
    {
        device = device1;
    }

    void setDriverId(String s)
    {
        driver_id = s;
    }

    void setDriverStatus(String s)
    {
        driver_status = s;
    }

    void setPinLocation(UberLatLng uberlatlng)
    {
        if (uberlatlng == null)
        {
            pin_location = null;
            return;
        } else
        {
            pin_location = new Location(Double.valueOf(uberlatlng.a()), Double.valueOf(uberlatlng.b()));
            return;
        }
    }

    void setRiderId(String s)
    {
        rider_id = s;
    }

    void setRiderStatus(String s)
    {
        rider_status = s;
    }

    void setTripId(String s)
    {
        trip_id = s;
    }

    void setVersion(String s)
    {
        version = s;
    }
}
