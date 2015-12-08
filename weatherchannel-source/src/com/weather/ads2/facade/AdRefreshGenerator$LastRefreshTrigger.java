// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.facade;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.weather.dal2.dsx.RecordSets;
import com.weather.dal2.locations.SavedLocation;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.ads2.facade:
//            AdRefreshGenerator

public static final class weatherData
{

    private final SavedLocation location;
    private final long timeSent = System.currentTimeMillis();
    private final RecordSets weatherData;

    public boolean allowUpdate(SavedLocation savedlocation, RecordSets recordsets)
    {
        return !location.equals(savedlocation) || !Objects.equal(weatherData, recordsets) || System.currentTimeMillis() - timeSent >= TimeUnit.SECONDS.toMillis(2L);
    }

    public (SavedLocation savedlocation, RecordSets recordsets)
    {
        location = (SavedLocation)Preconditions.checkNotNull(savedlocation);
        weatherData = recordsets;
    }
}
