// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzkx, zzkv, zzla, zzlc

public final class zzky
    implements zzkx
{
    private static class zza extends zzkv
    {

        private final com.google.android.gms.common.api.zzc.zzb zzQz;

        public void zzbI(int i)
            throws RemoteException
        {
            zzQz.zzn(new Status(i));
        }

        public zza(com.google.android.gms.common.api.zzc.zzb zzb)
        {
            zzQz = zzb;
        }
    }


    public zzky()
    {
    }

    public PendingResult zzc(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzkz.zza(googleapiclient) {

            final zzky zzaeu;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzla)zzb);
            }

            protected void zza(zzla zzla1)
                throws RemoteException
            {
                ((zzlc)zzla1.zzoA()).zza(new zza(this));
            }

            
            {
                zzaeu = zzky.this;
                super(googleapiclient);
            }
        });
    }
}
