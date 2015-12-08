// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zze;

public final class zzll
    implements Account
{
    private static abstract class zza extends com.google.android.gms.plus.Plus.zza
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        private zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public zzll()
    {
    }

    public void clearDefaultAccount(GoogleApiClient googleapiclient)
    {
        googleapiclient = Plus.zzf(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.zzvt();
        }
    }

    public String getAccountName(GoogleApiClient googleapiclient)
    {
        return Plus.zzf(googleapiclient, true).getAccountName();
    }

    public PendingResult revokeAccessAndDisconnect(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zza(googleapiclient) {

            final zzll zzazo;

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            protected void zza(zze zze1)
            {
                zze1.zzk(this);
            }

            
            {
                zzazo = zzll.this;
                super(googleapiclient);
            }
        });
    }
}
