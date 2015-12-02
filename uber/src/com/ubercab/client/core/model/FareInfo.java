// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import com.ubercab.rider.realtime.model.FareDetail;
import com.ubercab.rider.realtime.model.Metadata;
import com.ubercab.rider.realtime.model.UpfrontFare;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_FareInfo, UpfrontFare, UpfrontFareMetadata, UpfrontFareDetail

public abstract class FareInfo
    implements Parcelable, com.ubercab.rider.realtime.model.FareInfo
{

    private static final String FARETYPE_ELEVATED = "elevated";
    private static final String FARETYPE_ELEVATED_SOBRIETY = "elevatedSobriety";

    public FareInfo()
    {
    }

    public static FareInfo create()
    {
        return new Shape_FareInfo();
    }

    public abstract UpfrontFareDetail getFareDetail();

    public volatile FareDetail getFareDetail()
    {
        return getFareDetail();
    }

    public abstract UpfrontFareMetadata getMetadata();

    public volatile Metadata getMetadata()
    {
        return getMetadata();
    }

    public abstract com.ubercab.client.core.model.UpfrontFare getUpfrontFare();

    public volatile UpfrontFare getUpfrontFare()
    {
        return getUpfrontFare();
    }

    public String getVehicleViewId()
    {
        com.ubercab.client.core.model.UpfrontFare upfrontfare = getUpfrontFare();
        if (upfrontfare == null)
        {
            return null;
        } else
        {
            return String.valueOf(upfrontfare.getVehicleViewId());
        }
    }

    public boolean isFareElevated()
    {
        String s = getMetadata().getFareType();
        return "elevated".equals(s) || "elevatedSobriety".equals(s);
    }

    public abstract FareInfo setFareDetail(UpfrontFareDetail upfrontfaredetail);

    public abstract FareInfo setMetadata(UpfrontFareMetadata upfrontfaremetadata);

    public abstract FareInfo setUpfrontFare(com.ubercab.client.core.model.UpfrontFare upfrontfare);
}
