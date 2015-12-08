// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class zzak
{

    private final Set zzaDu;
    private final String zzaDv;

    public transient zzak(String s, String as[])
    {
        zzaDv = s;
        zzaDu = new HashSet(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = as[i];
            zzaDu.add(s);
        }

    }

    public abstract com.google.android.gms.internal.zzd.zza zzD(Map map);

    boolean zzg(Set set)
    {
        return set.containsAll(zzaDu);
    }

    public String zzwQ()
    {
        return zzaDv;
    }

    public Set zzwR()
    {
        return zzaDu;
    }

    public abstract boolean zzwl();
}
