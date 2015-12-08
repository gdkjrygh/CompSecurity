// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;

public class zzqi
{

    private final String zzaOS;
    private final String zzaRq;
    private final Integer zzaTv;
    private final String zzaTw;
    private final boolean zzaTx;

    public zzqi(String s, Integer integer, String s1, boolean flag)
    {
        this(s, integer, s1, flag, "");
    }

    public zzqi(String s, Integer integer, String s1, boolean flag, String s2)
    {
        zzx.zzv(s);
        zzx.zzv(s2);
        zzaOS = s;
        zzaTv = integer;
        zzaTw = s1;
        zzaTx = flag;
        zzaRq = s2;
    }

    public String getContainerId()
    {
        return zzaOS;
    }

    public Integer zzBp()
    {
        return zzaTv;
    }

    public String zzBq()
    {
        return zzaTw;
    }

    public String zzBr()
    {
        if (zzaTw != null)
        {
            return (new StringBuilder()).append(zzaTw).append("_").append(zzaOS).toString();
        } else
        {
            return zzaOS;
        }
    }

    public boolean zzBs()
    {
        return zzaTx;
    }

    public String zzBt()
    {
        return zzaRq;
    }
}
