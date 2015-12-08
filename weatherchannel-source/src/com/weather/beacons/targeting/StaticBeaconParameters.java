// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.beacons.targeting;

import com.google.common.collect.ImmutableMap;
import com.weather.ads2.util.AdUtils;
import java.util.Map;

// Referenced classes of package com.weather.beacons.targeting:
//            BeaconTargetingParam

public final class StaticBeaconParameters
{

    private StaticBeaconParameters()
    {
    }

    public static Map getStaticParameters()
    {
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put(BeaconTargetingParam.APP_GUID, AdUtils.getSha1AndroidId());
        return builder.build();
    }
}
