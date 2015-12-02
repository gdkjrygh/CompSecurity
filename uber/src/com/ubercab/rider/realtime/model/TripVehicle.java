// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.model:
//            TripVehicleType

public interface TripVehicle
{

    public abstract String getExteriorColor();

    public abstract String getInteriorColor();

    public abstract String getLicensePlate();

    public abstract int getLicensePlateCountryId();

    public abstract String getLicensePlateFormatted();

    public abstract String getLicensePlateState();

    public abstract List getPictureImages();

    public abstract String getUuid();

    public abstract List getVehiclePath();

    public abstract TripVehicleType getVehicleType();

    public abstract String getVehicleViewId();

    public abstract int getYear();
}
