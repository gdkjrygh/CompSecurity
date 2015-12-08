// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlm;

class zzaj
{

    private long zzOC;
    private final zzlm zzpO;

    public zzaj(zzlm zzlm1)
    {
        zzx.zzv(zzlm1);
        zzpO = zzlm1;
    }

    public zzaj(zzlm zzlm1, long l)
    {
        zzx.zzv(zzlm1);
        zzpO = zzlm1;
        zzOC = l;
    }

    public void clear()
    {
        zzOC = 0L;
    }

    public void start()
    {
        zzOC = zzpO.elapsedRealtime();
    }

    public boolean zzv(long l)
    {
        while (zzOC == 0L || zzpO.elapsedRealtime() - zzOC > l) 
        {
            return true;
        }
        return false;
    }
}
