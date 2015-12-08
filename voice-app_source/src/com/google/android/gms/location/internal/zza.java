// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionApi;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzj

public class com.google.android.gms.location.internal.zza
    implements ActivityRecognitionApi
{
    private static abstract class zza extends com.google.android.gms.location.ActivityRecognition.zza
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        public zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public com.google.android.gms.location.internal.zza()
    {
    }

    public PendingResult removeActivityUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zza(googleapiclient, pendingintent) {

            final PendingIntent zzayu;
            final com.google.android.gms.location.internal.zza zzayv;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzayu);
                setResult(Status.zzXP);
            }

            
            {
                zzayv = com.google.android.gms.location.internal.zza.this;
                zzayu = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestActivityUpdates(GoogleApiClient googleapiclient, long l, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zza(googleapiclient, l, pendingintent) {

            final long zzayt;
            final PendingIntent zzayu;
            final com.google.android.gms.location.internal.zza zzayv;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzayt, zzayu);
                setResult(Status.zzXP);
            }

            
            {
                zzayv = com.google.android.gms.location.internal.zza.this;
                zzayt = l;
                zzayu = pendingintent;
                super(googleapiclient);
            }
        });
    }
}
