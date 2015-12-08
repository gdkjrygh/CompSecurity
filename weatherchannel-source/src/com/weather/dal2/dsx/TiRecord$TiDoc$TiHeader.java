// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;


public static class Header
    implements com.weather.dal2.data.eader
{

    private final String TIstnId = null;
    private final String _procTmLocal = null;
    private final String procTm = null;
    private final String procTmISO = null;

    public String getProcessTime()
    {
        return procTm;
    }

    public String getProcessTimeISO()
    {
        return procTmISO;
    }

    public String getProcessTimeLocal()
    {
        return _procTmLocal;
    }

    public String getTideStationId()
    {
        return TIstnId;
    }

    public Header()
    {
    }
}
