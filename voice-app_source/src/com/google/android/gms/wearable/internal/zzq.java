// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzr, zzj

public final class zzq extends zzaq.zza
{

    private zzj zzaTY;
    private zzr zzaUc;
    private final Object zzqt = new Object();

    public zzq()
    {
    }

    public void zza(zzr zzr1)
    {
        zzj zzj1;
        synchronized (zzqt)
        {
            zzaUc = (zzr)zzu.zzu(zzr1);
            zzj1 = zzaTY;
        }
        if (zzj1 != null)
        {
            zzr1.zzb(zzj1);
        }
        return;
        zzr1;
        obj;
        JVM INSTR monitorexit ;
        throw zzr1;
    }

    public void zzw(int i, int j)
    {
        zzr zzr1;
        zzj zzj1;
        synchronized (zzqt)
        {
            zzr1 = zzaUc;
            zzj1 = new zzj(i, j);
            zzaTY = zzj1;
        }
        if (zzr1 != null)
        {
            zzr1.zzb(zzj1);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
