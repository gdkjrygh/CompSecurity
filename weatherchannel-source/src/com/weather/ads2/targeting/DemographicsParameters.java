// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.weather.dal2.system.TwcBus;
import com.weather.dal2.ups.Demographics;
import java.util.Map;

// Referenced classes of package com.weather.ads2.targeting:
//            AdTargetingParam, AdTargetingChange

public final class DemographicsParameters
{

    private final TwcBus bus;

    DemographicsParameters(TwcBus twcbus)
    {
        bus = twcbus;
    }

    private static String convertNull(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "nl";
        }
        return s1;
    }

    public static String extractAge(Demographics demographics)
    {
        return convertNull(demographics.getAge());
    }

    public static String extractAgeRange(Demographics demographics)
    {
        return convertNull(demographics.getAgeRange());
    }

    public static String extractGender(Demographics demographics)
    {
        return convertNull(demographics.getGender());
    }

    public static Map extractTargetingData(Demographics demographics)
    {
        return ImmutableMap.of(AdTargetingParam.AGE, getOrdinalOrNL(Demographics.getAgeRange(demographics.getAgeRange())), AdTargetingParam.GENDER, getOrdinalOrNL(Demographics.getGender(demographics.getGender())));
    }

    private static String getOrdinalOrNL(Enum enum)
    {
        if (enum == null)
        {
            return "nl";
        } else
        {
            return Integer.toString(enum.ordinal());
        }
    }

    public static boolean isUserLogout(Demographics demographics)
    {
        String s = demographics.getAge();
        demographics = demographics.getAgeRange();
        return Strings.isNullOrEmpty(s) && Strings.isNullOrEmpty(demographics);
    }

    public void onDemographicsUpdate(Demographics demographics)
    {
        bus.post(new AdTargetingChange(extractTargetingData(demographics)));
    }

    public void start()
    {
        bus.register(this);
    }
}
