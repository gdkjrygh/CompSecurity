// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;

class zzai
{

    private long zzIG;
    private final zzht zznR;

    public zzai(zzht zzht1)
    {
        zzv.zzr(zzht1);
        zznR = zzht1;
    }

    public zzai(zzht zzht1, long l)
    {
        zzv.zzr(zzht1);
        zznR = zzht1;
        zzIG = l;
    }

    public void clear()
    {
        zzIG = 0L;
    }

    public void start()
    {
        zzIG = zznR.elapsedRealtime();
    }

    public boolean zzt(long l)
    {
        while (zzIG == 0L || zznR.elapsedRealtime() - zzIG > l) 
        {
            return true;
        }
        return false;
    }
}
