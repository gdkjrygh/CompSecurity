// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzj

private static final class zzayX extends zzayX
{

    private com.google.android.gms.location..zzj.zzb.zzayW zzayV;
    private com.google.android.gms.location..zzayW zzayW;
    private zzj zzayX;

    public void zza(int i, PendingIntent pendingintent)
    {
        if (zzayX == null)
        {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
            return;
        } else
        {
            zzj zzj1 = zzayX;
            zzj zzj2 = zzayX;
            zzj2.getClass();
            zzj1.zza(new <init>(zzj2, 1, zzayW, i, pendingintent));
            zzayX = null;
            zzayV = null;
            zzayW = null;
            return;
        }
    }

    public void zza(int i, String as[])
        throws RemoteException
    {
        if (zzayX == null)
        {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
            return;
        } else
        {
            zzj zzj1 = zzayX;
            zzj zzj2 = zzayX;
            zzj2.getClass();
            zzj1.zza(new <init>(zzj2, zzayV, i, as));
            zzayX = null;
            zzayV = null;
            zzayW = null;
            return;
        }
    }

    public void zzb(int i, String as[])
    {
        if (zzayX == null)
        {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
            return;
        } else
        {
            zzj zzj1 = zzayX;
            zzj zzj2 = zzayX;
            zzj2.getClass();
            zzj1.zza(new <init>(zzj2, 2, zzayW, i, as));
            zzayX�V  ull;
            zzayV = null;
            zzayW = null;
            return;
        }
    }

    public (com.google.android.gms.location. , zzj zzj1)
    {
        zzayV = ;
        zzayW = null;
        zzayX = zzj1;
    }

    public zzayX(com.google.android.gms.location. , zzj zzj1)
    {
        zzayW = ;
        zzayV = null;
        zzayX = zzj1;
    }
}
