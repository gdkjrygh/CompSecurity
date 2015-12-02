// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.text.TextUtils;

public class TripVehicleType
    implements com.ubercab.rider.realtime.model.TripVehicleType
{

    Integer capacity;
    String id;
    String make;
    String model;

    public TripVehicleType()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TripVehicleType)obj;
            if (capacity == null ? ((TripVehicleType) (obj)).capacity != null : !capacity.equals(((TripVehicleType) (obj)).capacity))
            {
                return false;
            }
            if (id == null ? ((TripVehicleType) (obj)).id != null : !id.equals(((TripVehicleType) (obj)).id))
            {
                return false;
            }
            if (make == null ? ((TripVehicleType) (obj)).make != null : !make.equals(((TripVehicleType) (obj)).make))
            {
                return false;
            }
            if (model == null ? ((TripVehicleType) (obj)).model != null : !model.equals(((TripVehicleType) (obj)).model))
            {
                return false;
            }
        }
        return true;
    }

    public int getCapacity()
    {
        if (capacity == null)
        {
            return 0;
        } else
        {
            return capacity.intValue();
        }
    }

    public long getId()
    {
        if (TextUtils.isEmpty(id))
        {
            return 0L;
        } else
        {
            return Long.valueOf(id).longValue();
        }
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (capacity != null)
        {
            i = capacity.hashCode();
        } else
        {
            i = 0;
        }
        if (id != null)
        {
            j = id.hashCode();
        } else
        {
            j = 0;
        }
        if (make != null)
        {
            k = make.hashCode();
        } else
        {
            k = 0;
        }
        if (model != null)
        {
            l = model.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }
}
