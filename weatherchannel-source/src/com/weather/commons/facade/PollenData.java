// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;


// Referenced classes of package com.weather.commons.facade:
//            PollenType

public class PollenData
{

    com.weather.dal2.data.PollenRecord.PollenDoc.PollenDay pollenDay;
    PollenType type;

    public PollenData(PollenType pollentype, com.weather.dal2.data.PollenRecord.PollenDoc.PollenDay pollenday)
    {
        type = pollentype;
        pollenDay = pollenday;
    }

    public com.weather.dal2.data.PollenRecord.PollenDoc.PollenDay getPollenDay()
    {
        return pollenDay;
    }

    public PollenType getType()
    {
        return type;
    }
}
