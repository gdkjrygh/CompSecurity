// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.vehicleview;


// Referenced classes of package com.ubercab.client.core.model.vehicleview:
//            VehicleViewTripOptionChoice

public final class Shape_VehicleViewTripOptionChoice extends VehicleViewTripOptionChoice
{

    private String title;
    private Object value;

    Shape_VehicleViewTripOptionChoice()
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
            obj = (VehicleViewTripOptionChoice)obj;
            if (((VehicleViewTripOptionChoice) (obj)).getTitle() == null ? getTitle() != null : !((VehicleViewTripOptionChoice) (obj)).getTitle().equals(getTitle()))
            {
                return false;
            }
            if (((VehicleViewTripOptionChoice) (obj)).getValue() == null ? getValue() != null : !((VehicleViewTripOptionChoice) (obj)).getValue().equals(getValue()))
            {
                return false;
            }
        }
        return true;
    }

    final String getTitle()
    {
        return title;
    }

    final Object getValue()
    {
        return value;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (title == null)
        {
            i = 0;
        } else
        {
            i = title.hashCode();
        }
        if (value != null)
        {
            j = value.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final VehicleViewTripOptionChoice setTitle(String s)
    {
        title = s;
        return this;
    }

    final VehicleViewTripOptionChoice setValue(Object obj)
    {
        value = obj;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("VehicleViewTripOptionChoice{title=")).append(title).append(", value=").append(value).append("}").toString();
    }
}
