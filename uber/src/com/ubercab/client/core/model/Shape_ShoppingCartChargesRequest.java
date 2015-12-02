// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            ShoppingCartChargesRequest

public final class Shape_ShoppingCartChargesRequest extends ShoppingCartChargesRequest
{

    private String device;
    private List items;
    private Double latitude;
    private Double longitude;
    private String paymentProfileUuid;
    private String vehicleViewId;

    Shape_ShoppingCartChargesRequest()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ShoppingCartChargesRequest)obj;
            if (((ShoppingCartChargesRequest) (obj)).getItems() == null ? getItems() != null : !((ShoppingCartChargesRequest) (obj)).getItems().equals(getItems()))
            {
                return false;
            }
            if (((ShoppingCartChargesRequest) (obj)).getVehicleViewId() == null ? getVehicleViewId() != null : !((ShoppingCartChargesRequest) (obj)).getVehicleViewId().equals(getVehicleViewId()))
            {
                return false;
            }
            if (((ShoppingCartChargesRequest) (obj)).getPaymentProfileUuid() == null ? getPaymentProfileUuid() != null : !((ShoppingCartChargesRequest) (obj)).getPaymentProfileUuid().equals(getPaymentProfileUuid()))
            {
                return false;
            }
            if (((ShoppingCartChargesRequest) (obj)).getLatitude() == null ? getLatitude() != null : !((ShoppingCartChargesRequest) (obj)).getLatitude().equals(getLatitude()))
            {
                return false;
            }
            if (((ShoppingCartChargesRequest) (obj)).getLongitude() == null ? getLongitude() != null : !((ShoppingCartChargesRequest) (obj)).getLongitude().equals(getLongitude()))
            {
                return false;
            }
            if (((ShoppingCartChargesRequest) (obj)).getDevice() == null ? getDevice() != null : !((ShoppingCartChargesRequest) (obj)).getDevice().equals(getDevice()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getDevice()
    {
        return device;
    }

    public final List getItems()
    {
        return items;
    }

    public final Double getLatitude()
    {
        return latitude;
    }

    public final Double getLongitude()
    {
        return longitude;
    }

    public final String getPaymentProfileUuid()
    {
        return paymentProfileUuid;
    }

    public final String getVehicleViewId()
    {
        return vehicleViewId;
    }

    public final int hashCode()
    {
        int j1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (items == null)
        {
            i = 0;
        } else
        {
            i = items.hashCode();
        }
        if (vehicleViewId == null)
        {
            j = 0;
        } else
        {
            j = vehicleViewId.hashCode();
        }
        if (paymentProfileUuid == null)
        {
            k = 0;
        } else
        {
            k = paymentProfileUuid.hashCode();
        }
        if (latitude == null)
        {
            l = 0;
        } else
        {
            l = latitude.hashCode();
        }
        if (longitude == null)
        {
            i1 = 0;
        } else
        {
            i1 = longitude.hashCode();
        }
        if (device != null)
        {
            j1 = device.hashCode();
        }
        return (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j1;
    }

    final ShoppingCartChargesRequest setDevice(String s)
    {
        device = s;
        return this;
    }

    final ShoppingCartChargesRequest setItems(List list)
    {
        items = list;
        return this;
    }

    final ShoppingCartChargesRequest setLatitude(Double double1)
    {
        latitude = double1;
        return this;
    }

    final ShoppingCartChargesRequest setLongitude(Double double1)
    {
        longitude = double1;
        return this;
    }

    final ShoppingCartChargesRequest setPaymentProfileUuid(String s)
    {
        paymentProfileUuid = s;
        return this;
    }

    final ShoppingCartChargesRequest setVehicleViewId(String s)
    {
        vehicleViewId = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("ShoppingCartChargesRequest{items=")).append(items).append(", vehicleViewId=").append(vehicleViewId).append(", paymentProfileUuid=").append(paymentProfileUuid).append(", latitude=").append(latitude).append(", longitude=").append(longitude).append(", device=").append(device).append("}").toString();
    }
}
