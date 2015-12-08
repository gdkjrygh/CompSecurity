// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzkm, zzkk, zzkp, zzkr

public final class zzkn
    implements zzkm
{
    private static class zza extends zzkk
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzbB(int i)
            throws RemoteException
        {
            zzOs.zzm(new Status(i));
        }

        public zza(com.google.android.gms.common.api.zza.zzb zzb)
        {
            zzOs = zzb;
        }
    }


    public zzkn()
    {
    }

    public PendingResult zzc(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzko.zza(googleapiclient) {

            final zzkn zzabk;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzkp)client);
            }

            protected void zza(zzkp zzkp1)
                throws RemoteException
            {
                ((zzkr)zzkp1.zznM()).zza(new zza(this));
            }

            
            {
                zzabk = zzkn.this;
                super(googleapiclient);
            }
        });
    }
}
