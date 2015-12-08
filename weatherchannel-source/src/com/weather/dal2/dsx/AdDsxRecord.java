// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import com.weather.dal2.data.AirportDelayRecord;

// Referenced classes of package com.weather.dal2.dsx:
//            DsxRecord, AdDoc

public class AdDsxRecord extends DsxRecord
    implements AirportDelayRecord
{

    private AdDoc doc;

    public AdDsxRecord()
    {
    }

    public com.weather.dal2.data.AirportDelayRecord.AirportDelayDoc getAirportDelayDoc()
    {
        return doc;
    }

    public void normalize()
    {
        if (doc != null && (doc.getAirportDelayData() == null || doc.getAirportDelayHeader() == null))
        {
            status = Integer.valueOf(500);
            doc = null;
        }
    }
}
