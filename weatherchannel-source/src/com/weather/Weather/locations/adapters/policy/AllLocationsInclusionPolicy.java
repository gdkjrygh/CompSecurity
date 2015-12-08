// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations.adapters.policy;

import com.google.common.base.Preconditions;
import com.weather.dal2.locations.SavedLocation;

// Referenced classes of package com.weather.Weather.locations.adapters.policy:
//            LocationInclusionPolicy

public class AllLocationsInclusionPolicy
    implements LocationInclusionPolicy
{

    public AllLocationsInclusionPolicy()
    {
    }

    public boolean includes(SavedLocation savedlocation)
    {
        Preconditions.checkNotNull(savedlocation);
        return true;
    }
}
