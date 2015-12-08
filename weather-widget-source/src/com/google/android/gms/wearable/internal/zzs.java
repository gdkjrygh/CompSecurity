// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzt, zzl

public final class zzs extends zzat.zza
{

    private zzl zzaZZ;
    private zzt zzbad;
    private final Object zzpc = new Object();

    public zzs()
    {
    }

    public void zza(zzt zzt1)
    {
        zzl zzl1;
        synchronized (zzpc)
        {
            zzbad = (zzt)com.google.android.gms.common.internal.zzx.zzv(zzt1);
            zzl1 = zzaZZ;
        }
        if (zzl1 != null)
        {
            zzt1.zzb(zzl1);
        }
        return;
        zzt1;
        obj;
        JVM INSTR monitorexit ;
        throw zzt1;
    }

    public void zzx(int i, int j)
    {
        zzt zzt1;
        zzl zzl1;
        synchronized (zzpc)
        {
            zzt1 = zzbad;
            zzl1 = new zzl(i, j);
            zzaZZ = zzl1;
        }
        if (zzt1 != null)
        {
            zzt1.zzb(zzl1);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
