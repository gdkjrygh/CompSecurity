// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.lotame;


// Referenced classes of package com.weather.ads2.lotame:
//            LotameResponse

private static final class abbr
{

    private final String abbr;
    private final String id;

    public String toString()
    {
        return (new StringBuilder()).append("Audience{id='").append(id).append('\'').append(", abbr='").append(abbr).append('\'').append('}').toString();
    }


    (String s, String s1)
    {
        id = s;
        abbr = s1;
    }
}
