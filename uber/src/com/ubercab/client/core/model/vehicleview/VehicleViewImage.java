// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.vehicleview;

import com.ubercab.rider.realtime.model.Image;

// Referenced classes of package com.ubercab.client.core.model.vehicleview:
//            Shape_VehicleViewImage

public abstract class VehicleViewImage
    implements Image
{

    public VehicleViewImage()
    {
    }

    public static Image create(int i, int j, String s)
    {
        return (new Shape_VehicleViewImage()).setWidth(i).setHeight(j).setUrl(s);
    }

    public abstract int getHeight();

    public abstract String getUrl();

    public abstract int getWidth();

    abstract VehicleViewImage setHeight(int i);

    abstract VehicleViewImage setUrl(String s);

    abstract VehicleViewImage setWidth(int i);
}
