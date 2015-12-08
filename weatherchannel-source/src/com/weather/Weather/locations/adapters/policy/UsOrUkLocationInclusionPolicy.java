// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations.adapters.policy;

import com.google.common.base.Preconditions;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.CountryCodeUtil;

// Referenced classes of package com.weather.Weather.locations.adapters.policy:
//            LocationInclusionPolicy

public class UsOrUkLocationInclusionPolicy
    implements LocationInclusionPolicy
{

    public UsOrUkLocationInclusionPolicy()
    {
    }

    public boolean includes(SavedLocation savedlocation)
    {
        Preconditions.checkNotNull(savedlocation);
        return CountryCodeUtil.isUs(savedlocation.getCountryCode()) || CountryCodeUtil.isUk(savedlocation.getCountryCode());
    }
}
