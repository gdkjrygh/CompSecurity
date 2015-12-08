// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class t extends b
{

    final GoogleApiClient zzSA;
    final JSONObject zzSG;
    final int zzSK[];
    final RemoteMediaPlayer zzSz;

    protected void zza(zze zze1)
    {
        zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
        zze1;
        JVM INSTR monitorenter ;
        RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
        RemoteMediaPlayer.zzg(zzSz).zza(zzTa, zzSK, zzSG);
        RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
        zze1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        setResult(zzn(new Status(2100)));
        RemoteMediaPlayer.zzf(zzSz).zzb(null);
          goto _L1
        obj;
        zze1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        RemoteMediaPlayer.zzf(zzSz).zzb(null);
        throw obj;
    }

    protected volatile void zza(com.google.android.gms.common.api.ult ult)
        throws RemoteException
    {
        zza((zze)ult);
    }

    t(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, int ai[], JSONObject jsonobject)
    {
        zzSz = remotemediaplayer;
        zzSA = googleapiclient1;
        zzSK = ai;
        zzSG = jsonobject;
        super(googleapiclient);
    }
}
