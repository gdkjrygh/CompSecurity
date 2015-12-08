// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.facade;


public class WxIcon
{

    private static final String CLD = "cld";
    private static final String CLR = "clr";
    private static final String FOG = "fog";
    private static final String ICE = "ice";
    private static final String ICON_STRING_ARRAY[] = {
        "thdr", "rain", "rain", "thdr", "thdr", "rain", "rain", "ice", "ice", "rain", 
        "ice", "rain", "rain", "snow", "snow", "snow", "snow", "thdr", "ice", "fog", 
        "fog", "fog", "fog", "nl", "nl", "nl", "cld", "pcld", "pcld", "pcld", 
        "pcld", "clr", "sun", "clr", "sun", "thdr", "sun", "thdr", "thdr", "rain", 
        "rain", "snow", "snow", "snow", "nl", "rain", "snow", "thdr"
    };
    private static final String NL = "nl";
    private static final String PCLD = "pcld";
    private static final String RAIN = "rain";
    private static final String SNOW = "snow";
    private static final String SUN = "sun";
    private static final String THDR = "thdr";

    private WxIcon()
    {
    }

    public static String getAdText(int i)
    {
        if (i < 0 || i >= ICON_STRING_ARRAY.length)
        {
            return "nl";
        } else
        {
            return ICON_STRING_ARRAY[i];
        }
    }

}
