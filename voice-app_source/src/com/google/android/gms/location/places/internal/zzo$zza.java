// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzo

private class <init>
    implements Runnable
{

    final zzo zzaAV;

    public void run()
    {
        synchronized (zzo.zzb(zzaAV))
        {
            Intent intent = new Intent("com.google.android.location.places.METHOD_CALL");
            intent.setPackage("com.google.android.gms");
            intent.putStringArrayListExtra("PLACE_IDS", zzo.zzc(zzaAV));
            intent.putStringArrayListExtra("METHOD_NAMES", zzo.zzd(zzaAV));
            zzo.zze(zzaAV).sendBroadcast(intent);
            zzo.zza(zzaAV, null);
            zzo.zzb(zzaAV, null);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private (zzo zzo1)
    {
        zzaAV = zzo1;
        super();
    }

    zzaAV(zzo zzo1, zzaAV zzaav)
    {
        this(zzo1);
    }
}
