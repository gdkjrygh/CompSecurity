// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzi, zzj

static abstract class zzaaw
{

    private final zzj zzaaw;

    public final void zzf(zzi zzi1)
    {
        zzi.zza(zzi1).lock();
        zzj zzj;
        zzj zzj1;
        zzj = zzi.zzb(zzi1);
        zzj1 = zzaaw;
        if (zzj != zzj1)
        {
            zzi.zza(zzi1).unlock();
            return;
        }
        zznn();
        zzi.zza(zzi1).unlock();
        return;
        Exception exception;
        exception;
        zzi.zza(zzi1).unlock();
        throw exception;
    }

    protected abstract void zznn();

    protected (zzj zzj)
    {
        zzaaw = zzj;
    }
}
