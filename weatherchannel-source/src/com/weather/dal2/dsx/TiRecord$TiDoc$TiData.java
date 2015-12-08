// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;


public static class deData
    implements com.weather.dal2.data.eData
{

    private final Double TItdHght = null;
    private final String TItdTm = null;
    private final String TItdTmISO = null;
    private final String TItdTyp = null;

    public Double getTideHeightInFeet()
    {
        return TItdHght;
    }

    public String getTideLocalApparentTime()
    {
        return TItdTm;
    }

    public String getTideTimeISO()
    {
        return TItdTmISO;
    }

    public String getTideType()
    {
        return TItdTyp;
    }

    public deData()
    {
    }
}
