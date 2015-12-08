// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;

class zzaj
{

    private long zzMC;
    private final zzlb zzpw;

    public zzaj(zzlb zzlb1)
    {
        zzu.zzu(zzlb1);
        zzpw = zzlb1;
    }

    public zzaj(zzlb zzlb1, long l)
    {
        zzu.zzu(zzlb1);
        zzpw = zzlb1;
        zzMC = l;
    }

    public void clear()
    {
        zzMC = 0L;
    }

    public void start()
    {
        zzMC = zzpw.elapsedRealtime();
    }

    public boolean zzv(long l)
    {
        while (zzMC == 0L || zzpw.elapsedRealtime() - zzMC > l) 
        {
            return true;
        }
        return false;
    }
}
