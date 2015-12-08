// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.weatherfx;

import com.google.common.base.Preconditions;

public final class ScatterShot
{

    private final String hzcs;
    private final String nzcs;
    private final String zcs;

    public ScatterShot(String s, String s1, String s2)
    {
        zcs = (String)Preconditions.checkNotNull(s);
        hzcs = (String)Preconditions.checkNotNull(s1);
        nzcs = (String)Preconditions.checkNotNull(s2);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ScatterShot)obj;
            if (!hzcs.equals(((ScatterShot) (obj)).hzcs))
            {
                return false;
            }
            if (!nzcs.equals(((ScatterShot) (obj)).nzcs))
            {
                return false;
            }
            if (!zcs.equals(((ScatterShot) (obj)).zcs))
            {
                return false;
            }
        }
        return true;
    }

    public String getHzcs()
    {
        return hzcs;
    }

    public String getNzcs()
    {
        return nzcs;
    }

    public String getZcs()
    {
        return zcs;
    }

    public int hashCode()
    {
        return (zcs.hashCode() * 31 + hzcs.hashCode()) * 31 + nzcs.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("ScatterShot{zcs='").append(zcs).append('\'').append(", hzcs='").append(hzcs).append('\'').append(", nzcs='").append(nzcs).append('\'').append('}').toString();
    }
}
