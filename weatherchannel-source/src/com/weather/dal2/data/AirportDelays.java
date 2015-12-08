// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;

import java.util.List;

// Referenced classes of package com.weather.dal2.data:
//            Record

public interface AirportDelays
    extends Record
{
    public static interface AirportDelayItems
    {

        public abstract List getAirportDelayRecords();

        public abstract List getCurrentConditionsRecords();
    }


    public abstract AirportDelayItems getAirportDelayItems();
}
