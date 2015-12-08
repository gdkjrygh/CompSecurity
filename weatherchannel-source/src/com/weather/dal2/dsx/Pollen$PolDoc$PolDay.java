// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;


// Referenced classes of package com.weather.dal2.dsx:
//            Pollen

public static class oc.PollenDay
    implements com.weather.dal2.data.c.PollenDay
{

    private final String idxAux2 = null;
    private final String idxGMTTm = null;
    private final String idxPhr1 = null;
    private final Integer idxPrt1 = Integer.valueOf(0);
    private final String idxTmISO = null;

    public Integer getPollenIndexCode()
    {
        return idxPrt1;
    }

    public String getPollenIndexPhrase()
    {
        return idxPhr1;
    }

    public String getPollenIndexTimeInGMT()
    {
        return idxGMTTm;
    }

    public String getPollenTreeTimeInISO()
    {
        return idxTmISO;
    }

    public String getPollenTreeType()
    {
        return idxAux2;
    }

    public oc.PollenDay()
    {
    }
}
