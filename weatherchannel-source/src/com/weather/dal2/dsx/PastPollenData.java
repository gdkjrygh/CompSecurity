// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import com.weather.dal2.net.JsonObjectMapper;
import org.json.JSONException;

public class PastPollenData
{

    private final Integer PLgrssPlln;
    private final Integer PLtrPlln;
    private final Integer PLwdPlln;

    public PastPollenData()
    {
        this(null, null, null);
    }

    public PastPollenData(Integer integer, Integer integer1, Integer integer2)
    {
        boolean flag = false;
        super();
        int i;
        if (integer == null)
        {
            i = 0;
        } else
        {
            i = integer.intValue();
        }
        PLtrPlln = Integer.valueOf(i);
        if (integer1 == null)
        {
            i = 0;
        } else
        {
            i = integer1.intValue();
        }
        PLgrssPlln = Integer.valueOf(i);
        if (integer2 == null)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = integer2.intValue();
        }
        PLwdPlln = Integer.valueOf(i);
    }

    public static PastPollenData fromJson(String s)
        throws JSONException
    {
        return (PastPollenData)JsonObjectMapper.fromJson(s, com/weather/dal2/dsx/PastPollenData);
    }

    public int getGrassPollen()
    {
        if (PLgrssPlln.intValue() > 4 || PLgrssPlln.intValue() < 0)
        {
            return -1;
        } else
        {
            return PLgrssPlln.intValue();
        }
    }

    public int getMaxPollenCount()
    {
        return Math.max(Math.max(getTreePollen(), getGrassPollen()), getWeedPollen());
    }

    public int getTreePollen()
    {
        if (PLtrPlln.intValue() > 4 || PLtrPlln.intValue() < 0)
        {
            return -1;
        } else
        {
            return PLtrPlln.intValue();
        }
    }

    public int getWeedPollen()
    {
        if (PLwdPlln.intValue() > 4 || PLwdPlln.intValue() < 0)
        {
            return -1;
        } else
        {
            return PLwdPlln.intValue();
        }
    }
}
