// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import com.weather.ads2.config.AdConfigUnit;
import com.weather.ads2.util.AdUtils;

public class AdCallData
{

    public final AdConfigUnit configUnit;
    public final String random;

    public AdCallData(AdConfigUnit adconfigunit)
    {
        this(AdUtils.getRandomString(), adconfigunit);
    }

    public AdCallData(String s, AdConfigUnit adconfigunit)
    {
        random = s;
        configUnit = adconfigunit;
    }
}
