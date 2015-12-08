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
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer, MediaStatus, MediaQueueItem

class  extends 
{

    final GoogleApiClient zzSA;
    final JSONObject zzSG;
    final int zzSQ;
    final int zzSR;
    final RemoteMediaPlayer zzSz;

    protected void zza(zze zze1)
    {
        boolean flag = false;
        zze1 = ((zze) (com.google.android.gms.cast.RemoteMediaPlayer.zze(zzSz)));
        zze1;
        JVM INSTR monitorenter ;
        int i = RemoteMediaPlayer.zza(zzSz, zzSQ);
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        setResult(zzn(new Status(0)));
        zze1;
        JVM INSTR monitorexit ;
        return;
        if (zzSR >= 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        setResult(zzn(new Status(2001, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", new Object[] {
            Integer.valueOf(zzSR)
        }))));
        zze1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        zze1;
        JVM INSTR monitorexit ;
        throw obj;
        if (i != zzSR)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        setResult(zzn(new Status(0)));
        zze1;
        JVM INSTR monitorexit ;
        return;
        if (zzSR <= i) goto _L2; else goto _L1
_L1:
        i = zzSR + 1;
_L3:
        MediaQueueItem mediaqueueitem = zzSz.getMediaStatus().getQueueItem(i);
        i = ((flag) ? 1 : 0);
        if (mediaqueueitem == null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        i = mediaqueueitem.getItemId();
        RemoteMediaPlayer.zzf(zzSz).zzb(zzSA);
        zzm zzm1 = RemoteMediaPlayer.zzg(zzSz);
        com.google.android.gms.cast.internal.zzo zzo = zzTa;
        int j = zzSQ;
        JSONObject jsonobject = zzSG;
        zzm1.zza(zzo, new int[] {
            j
        }, i, jsonobject);
        RemoteMediaPlayer.zzf(zzSz).zzb(null);
_L4:
        zze1;
        JVM INSTR monitorexit ;
        return;
_L2:
        i = zzSR;
          goto _L3
        zzm1;
        setResult(zzn(new Status(2100)));
        RemoteMediaPlayer.zzf(zzSz).zzb(null);
          goto _L4
        zzm1;
        RemoteMediaPlayer.zzf(zzSz).zzb(null);
        throw zzm1;
          goto _L3
    }

    protected volatile void zza(com.google.android.gms.common.api.ult ult)
        throws RemoteException
    {
        zza((zze)ult);
    }

    (RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, int i, int j, GoogleApiClient googleapiclient1, JSONObject jsonobject)
    {
        zzSz = remotemediaplayer;
        zzSQ = i;
        zzSR = j;
        zzSA = googleapiclient1;
        zzSG = jsonobject;
        super(googleapiclient);
    }
}
