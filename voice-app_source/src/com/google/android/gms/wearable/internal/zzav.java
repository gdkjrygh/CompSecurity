// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzbk

public final class zzav
    implements MessageApi
{
    private static final class zza extends zzf
    {

        private com.google.android.gms.wearable.MessageApi.MessageListener zzaUF;
        private IntentFilter zzaUk[];

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzbk)client);
        }

        protected void zza(zzbk zzbk1)
            throws RemoteException
        {
            zzbk1.zza(this, zzaUF, zzaUk);
            zzaUF = null;
            zzaUk = null;
        }

        public Status zzb(Status status)
        {
            zzaUF = null;
            zzaUk = null;
            return status;
        }

        private zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
        {
            super(googleapiclient);
            zzaUF = messagelistener;
            zzaUk = aintentfilter;
        }

    }

    public static class zzb
        implements com.google.android.gms.wearable.MessageApi.SendMessageResult
    {

        private final Status zzOt;
        private final int zzacR;

        public int getRequestId()
        {
            return zzacR;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zzb(Status status, int i)
        {
            zzOt = status;
            zzacR = i;
        }
    }


    public zzav()
    {
    }

    private PendingResult zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        return googleapiclient.zza(new zza(googleapiclient, messagelistener, aintentfilter));
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
    {
        return zza(googleapiclient, messagelistener, null);
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
    {
        return googleapiclient.zza(new zzf(googleapiclient, messagelistener) {

            final zzav zzaUD;
            final com.google.android.gms.wearable.MessageApi.MessageListener zzaUE;

            public Result createFailedResult(Status status)
            {
                return zzb(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzaUE);
            }

            public Status zzb(Status status)
            {
                return status;
            }

            
            {
                zzaUD = zzav.this;
                zzaUE = messagelistener;
                super(googleapiclient);
            }
        });
    }

    public PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1, byte abyte0[])
    {
        return googleapiclient.zza(new zzf(googleapiclient, s, s1, abyte0) {

            final byte zzOn[];
            final String zzaTI;
            final String zzaUC;
            final zzav zzaUD;

            protected Result createFailedResult(Status status)
            {
                return zzbh(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzaTI, zzaUC, zzOn);
            }

            protected com.google.android.gms.wearable.MessageApi.SendMessageResult zzbh(Status status)
            {
                return new zzb(status, -1);
            }

            
            {
                zzaUD = zzav.this;
                zzaTI = s;
                zzaUC = s1;
                zzOn = abyte0;
                super(googleapiclient);
            }
        });
    }
}
