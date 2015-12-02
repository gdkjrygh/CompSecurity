// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.vehicleview;


// Referenced classes of package com.ubercab.client.core.model.vehicleview:
//            Shape_VehicleViewTripOptionChoice

public abstract class VehicleViewTripOptionChoice
{

    public VehicleViewTripOptionChoice()
    {
    }

    public static VehicleViewTripOptionChoice create(String s, Object obj)
    {
        return (new Shape_VehicleViewTripOptionChoice()).setTitle(s).setValue(obj);
    }

    abstract String getTitle();

    abstract Object getValue();

    abstract VehicleViewTripOptionChoice setTitle(String s);

    abstract VehicleViewTripOptionChoice setValue(Object obj);
}
