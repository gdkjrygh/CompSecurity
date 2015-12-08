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
//            zzh, zzbn

public final class zzay
    implements MessageApi
{
    private static final class zza extends zzh
    {

        private com.google.android.gms.wearable.MessageApi.MessageListener zzbaI;
        private IntentFilter zzbal[];

        protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
            throws RemoteException
        {
            zza((zzbn)zzb1);
        }

        protected void zza(zzbn zzbn1)
            throws RemoteException
        {
            zzbn1.zza(this, zzbaI, zzbal);
            zzbaI = null;
            zzbal = null;
        }

        public Result zzb(Status status)
        {
            return zzd(status);
        }

        public Status zzd(Status status)
        {
            zzbaI = null;
            zzbal = null;
            return status;
        }

        private zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
        {
            super(googleapiclient);
            zzbaI = messagelistener;
            zzbal = aintentfilter;
        }

    }

    public static class zzb
        implements com.google.android.gms.wearable.MessageApi.SendMessageResult
    {

        private final Status zzQA;
        private final int zzagq;

        public int getRequestId()
        {
            return zzagq;
        }

        public Status getStatus()
        {
            return zzQA;
        }

        public zzb(Status status, int i)
        {
            zzQA = status;
            zzagq = i;
        }
    }


    public zzay()
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
        return googleapiclient.zza(new zzh(googleapiclient, messagelistener) {

            final zzay zzbaG;
            final com.google.android.gms.wearable.MessageApi.MessageListener zzbaH;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zza(this, zzbaH);
            }

            public Result zzb(Status status)
            {
                return zzd(status);
            }

            public Status zzd(Status status)
            {
                return status;
            }

            
            {
                zzbaG = zzay.this;
                zzbaH = messagelistener;
                super(googleapiclient);
            }
        });
    }

    public PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1, byte abyte0[])
    {
        return googleapiclient.zza(new zzh(googleapiclient, s, s1, abyte0) {

            final byte zzQu[];
            final String zzaZK;
            final String zzbaF;
            final zzay zzbaG;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zza(this, zzaZK, zzbaF, zzQu);
            }

            protected Result zzb(Status status)
            {
                return zzbt(status);
            }

            protected com.google.android.gms.wearable.MessageApi.SendMessageResult zzbt(Status status)
            {
                return new zzb(status, -1);
            }

            
            {
                zzbaG = zzay.this;
                zzaZK = s;
                zzbaF = s1;
                zzQu = abyte0;
                super(googleapiclient);
            }
        });
    }
}
