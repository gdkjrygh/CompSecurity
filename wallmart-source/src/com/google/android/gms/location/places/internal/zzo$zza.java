// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzo

private class <init>
    implements Runnable
{

    final zzo zzaES;

    public void run()
    {
        synchronized (zzo.zzb(zzaES))
        {
            Intent intent = new Intent("com.google.android.location.places.METHOD_CALL");
            intent.setPackage("com.google.android.gms");
            intent.putStringArrayListExtra("PLACE_IDS", zzo.zzc(zzaES));
            intent.putStringArrayListExtra("METHOD_NAMES", zzo.zzd(zzaES));
            intent.putExtra("PACKAGE_NAME", zzo.zze(zzaES).getPackageName());
            intent.putExtra("CLIENT_VERSION", GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            zzo.zze(zzaES).sendBroadcast(intent);
            zzo.zza(zzaES, null);
            zzo.zzb(zzaES, null);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private (zzo zzo1)
    {
        zzaES = zzo1;
        super();
    }

    zzaES(zzo zzo1, zzaES zzaes)
    {
        this(zzo1);
    }
}
