// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;


// Referenced classes of package com.weather.dal2.dsx:
//            Breathing

public static class _procTmLocal
{

    private final String _procTmLocal;
    private final String coopId;
    private final String idxId;
    private final Integer idxTyp;
    private final Long procTm;

    public String getId()
    {
        return idxId;
    }

    public Long getProcessTime()
    {
        return procTm;
    }

    public String getProcessTimeLocal()
    {
        return _procTmLocal;
    }

    public String getStationId()
    {
        return coopId;
    }

    public Integer getType()
    {
        return idxTyp;
    }

    public (Integer integer, String s, Long long1, String s1, String s2)
    {
        idxTyp = integer;
        idxId = s;
        procTm = long1;
        coopId = s1;
        _procTmLocal = s2;
    }
}
