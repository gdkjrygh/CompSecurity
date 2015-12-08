// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class zzak
{

    private final Set zzaLI;
    private final String zzaLJ;

    public transient zzak(String s, String as[])
    {
        zzaLJ = s;
        zzaLI = new HashSet(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = as[i];
            zzaLI.add(s);
        }

    }

    public abstract com.google.android.gms.internal.zzag.zza zzE(Map map);

    boolean zzg(Set set)
    {
        return set.containsAll(zzaLI);
    }

    public String zzyM()
    {
        return zzaLJ;
    }

    public Set zzyN()
    {
        return zzaLI;
    }

    public abstract boolean zzyh();
}
