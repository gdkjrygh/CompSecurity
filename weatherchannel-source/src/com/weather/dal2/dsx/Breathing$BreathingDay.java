// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;


// Referenced classes of package com.weather.dal2.dsx:
//            Breathing

public static class idxTmISO
{

    private final String idxGMTTm;
    private final String idxPhr1;
    private final Integer idxPrt1;
    private final String idxTmISO;

    public String getBreathingISOTime()
    {
        return idxTmISO;
    }

    public Integer getBreathingIndexCode()
    {
        return idxPrt1;
    }

    public String getBreathingIndexPhrase()
    {
        return idxPhr1;
    }

    public String getBreathingIndexTimeInGMT()
    {
        return idxGMTTm;
    }

    public (String s, Integer integer, String s1, String s2)
    {
        idxGMTTm = s;
        idxPrt1 = integer;
        idxPhr1 = s1;
        idxTmISO = s2;
    }
}
