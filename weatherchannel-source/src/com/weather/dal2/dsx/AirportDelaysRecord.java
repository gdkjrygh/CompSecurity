// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import com.weather.dal2.data.AirportDelays;

// Referenced classes of package com.weather.dal2.dsx:
//            DsxRecord

public class AirportDelaysRecord extends DsxRecord
    implements AirportDelays
{

    private AirportDelayRecordItems doc;

    public AirportDelaysRecord()
    {
    }

    public com.weather.dal2.data.AirportDelays.AirportDelayItems getAirportDelayItems()
    {
        return doc;
    }

    public void normalize()
    {
    /* block-local class not found */
    class AirportDelayRecordItems {}

        if (doc != null && (AirportDelayRecordItems.access._mth000(doc) == null || AirportDelayRecordItems.access._mth100(doc) == null))
        {
            status = Integer.valueOf(500);
            doc = null;
        }
    }
}
