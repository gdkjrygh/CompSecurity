// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import hnb;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_RiderTripExpenseInfo

public abstract class RiderTripExpenseInfo
    implements Parcelable, hnb
{

    public RiderTripExpenseInfo()
    {
    }

    public static RiderTripExpenseInfo create()
    {
        return new Shape_RiderTripExpenseInfo();
    }

    public static RiderTripExpenseInfo create(TripExpenseInfo tripexpenseinfo)
    {
        if (tripexpenseinfo == null)
        {
            return create();
        } else
        {
            RiderTripExpenseInfo ridertripexpenseinfo = create();
            ridertripexpenseinfo.setCode(tripexpenseinfo.getCode());
            ridertripexpenseinfo.setExpenseTrip(tripexpenseinfo.isExpenseTrip());
            ridertripexpenseinfo.setMemo(tripexpenseinfo.getMemo());
            return ridertripexpenseinfo;
        }
    }

    public abstract String getCode();

    public abstract String getMemo();

    public abstract boolean isExpenseTrip();

    public abstract void setCode(String s);

    public abstract void setExpenseTrip(boolean flag);

    public abstract void setMemo(String s);
}
