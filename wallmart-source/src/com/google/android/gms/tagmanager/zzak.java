// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class zzak
{

    private final Set zzaQc;
    private final String zzaQd;

    public transient zzak(String s, String as[])
    {
        zzaQd = s;
        zzaQc = new HashSet(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = as[i];
            zzaQc.add(s);
        }

    }

    public String zzAc()
    {
        return zzaQd;
    }

    public Set zzAd()
    {
        return zzaQc;
    }

    public abstract com.google.android.gms.internal.zzag.zza zzG(Map map);

    boolean zzf(Set set)
    {
        return set.containsAll(zzaQc);
    }

    public abstract boolean zzzx();
}
