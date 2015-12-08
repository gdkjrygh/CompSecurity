// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.dal2.data.CurrentConditionsRecord;

// Referenced classes of package com.weather.commons.facade:
//            AirportFacade

public static final class index
{

    public final Integer index;

    public ata(CurrentConditionsRecord currentconditionsrecord)
    {
        com.weather.dal2.data.ntConditionsDoc.CurrentConditionsData currentconditionsdata = ess._mth400(currentconditionsrecord);
        currentconditionsrecord = null;
        if (currentconditionsdata != null)
        {
            currentconditionsrecord = currentconditionsdata.getUvIndex();
        }
        index = (Integer)AirportFacade.access$000(currentconditionsrecord, Integer.valueOf(0));
    }
}
