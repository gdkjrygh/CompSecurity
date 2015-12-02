// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import com.ubercab.rider.realtime.model.Metadata;
import com.ubercab.rider.realtime.model.UpfrontFare;
import hll;

abstract class ObjectFareInfo
    implements hll
{

    private static final String FARETYPE_ELEVATED = "elevated";
    private static final String FARETYPE_ELEVATED_SOBRIETY = "elevatedSobriety";

    ObjectFareInfo()
    {
    }

    public String getVehicleViewId()
    {
        UpfrontFare upfrontfare = getUpfrontFare();
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
}
