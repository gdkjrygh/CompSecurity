// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;

public class zzpy
{

    private final String zzaKy;
    private final String zzaMW;
    private final Integer zzaPb;
    private final String zzaPc;
    private final boolean zzaPd;

    public zzpy(String s, Integer integer, String s1, boolean flag)
    {
        this(s, integer, s1, flag, "");
    }

    public zzpy(String s, Integer integer, String s1, boolean flag, String s2)
    {
        zzu.zzu(s);
        zzu.zzu(s2);
        zzaKy = s;
        zzaPb = integer;
        zzaPc = s1;
        zzaPd = flag;
        zzaMW = s2;
    }

    public String getContainerId()
    {
        return zzaKy;
    }

    public String zzAa()
    {
        return zzaPc;
    }

    public String zzAb()
    {
        if (zzaPc != null)
        {
            return (new StringBuilder()).append(zzaPc).append("_").append(zzaKy).toString();
        } else
        {
            return zzaKy;
        }
    }

    public boolean zzAc()
    {
        return zzaPd;
    }

    public String zzAd()
    {
        return zzaMW;
    }

    public Integer zzzZ()
    {
        return zzaPb;
    }
}
