// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_TripFareChange

public abstract class TripFareChange
    implements com.ubercab.rider.realtime.model.TripFareChange
{

    public static final String CHANGE_TYPE_SEAT_ADDED = "seatAdded";
    public static final String CHANGE_TYPE_SEAT_REMOVED = "seatRemoved";

    public TripFareChange()
    {
    }

    public static TripFareChange create()
    {
        return new Shape_TripFareChange();
    }

    public abstract String getChangeType();

    public abstract String getChangeTypeText();

    public abstract String getDetailedMessage();

    public abstract String getOldFare();

    public abstract String getTitle();

    public abstract String getUpdatedFare();

    abstract void setChangeType(String s);

    abstract void setChangeTypeText(String s);

    abstract void setDetailedMessage(String s);

    abstract void setOldFare(String s);

    abstract void setTitle(String s);

    abstract void setUpdatedFare(String s);
}
