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

class  extends 
{

    final GoogleApiClient zzSA;
    final JSONObject zzSG;
    final int zzSQ;
    final RemoteMediaPlayer zzSz;

    protected void zza(zze zze1)
    {
label0:
        {
            synchronized (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz))
            {
                if (RemoteMediaPlayer.zza(zzSz, zzSQ) != -1)
                {
                    break label0;
                }
                setResult(zzn(new Status(0)));
            }
            return;
        }
        RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
        zzm zzm1 = RemoteMediaPlayer.zzg(zzSz);
        com.google.android.gms.cast.internal.zzo zzo = zzTa;
        int i = zzSQ;
        JSONObject jsonobject = zzSG;
        zzm1.zza(zzo, new int[] {
            i
        }, jsonobject);
        RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L1:
        zze1;
        JVM INSTR monitorexit ;
        return;
        exception;
        zze1;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj;
        obj;
        setResult(zzn(new Status(2100)));
        RemoteMediaPlayer.zzf(zzSz).zzb(null);
          goto _L1
        obj;
        RemoteMediaPlayer.zzf(zzSz).zzb(null);
        throw obj;
    }

    protected volatile void zza(com.google.android.gms.common.api.ult ult)
        throws RemoteException
    {
        zza((zze)ult);
    }

    (RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, int i, GoogleApiClient googleapiclient1, JSONObject jsonobject)
    {
        zzSz = remotemediaplayer;
        zzSQ = i;
        zzSA = googleapiclient1;
        zzSG = jsonobject;
        super(googleapiclient);
    }
}
