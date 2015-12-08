// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.facade;

import com.weather.dal2.data.SkiRecord;

public final class Ski
{

    private static final String DATA = "data";
    public static final Ski EMPTY = new Ski((SkiRecord)null);
    private static final String NO_DATA = "nodata";
    public final String skiData;

    public Ski(SkiRecord skirecord)
    {
        boolean flag;
        if (skirecord == null || skirecord.totalNumberOfResorts() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            skirecord = "nodata";
        } else
        {
            skirecord = "data";
        }
        skiData = skirecord;
    }

    public Ski(String s)
    {
        skiData = s;
    }

}
