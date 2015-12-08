// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;


// Referenced classes of package com.weather.commons.locations:
//            LocationUtils

public static class lng
{

    final String lat;
    final String lng;

    _cls9(String s, String s1)
    {
        lat = s.substring(0, Math.min(12, s.length()));
        lng = s1.substring(0, Math.min(12, s1.length()));
    }
}
