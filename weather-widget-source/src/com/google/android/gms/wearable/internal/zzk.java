// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh, zzbn

public final class zzk
    implements ChannelApi
{
    static final class zza extends zzh
    {

        private final String zzaZM;
        private com.google.android.gms.wearable.ChannelApi.ChannelListener zzaZN;

        protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
            throws RemoteException
        {
            zza((zzbn)zzb1);
        }

        protected void zza(zzbn zzbn1)
            throws RemoteException
        {
            zzbn1.zza(this, zzaZN, zzaZM);
            zzaZN = null;
        }

        public Result zzb(Status status)
        {
            return zzd(status);
        }

        public Status zzd(Status status)
        {
            zzaZN = null;
            return status;
        }

        zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
        {
            super(googleapiclient);
            zzaZN = (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzx.zzv(channellistener);
            zzaZM = s;
        }
    }

    static final class zzb
        implements com.google.android.gms.wearable.ChannelApi.OpenChannelResult
    {

        private final Status zzQA;
        private final Channel zzaZO;

        public Channel getChannel()
        {
            return zzaZO;
        }

        public Status getStatus()
        {
            return zzQA;
        }

        zzb(Status status, Channel channel)
        {
            zzQA = (Status)zzx.zzv(status);
            zzaZO = channel;
        }
    }

    static final class zzc extends zzh
    {

        private final String zzaZM;
        private com.google.android.gms.wearable.ChannelApi.ChannelListener zzaZN;

        protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
            throws RemoteException
        {
            zza((zzbn)zzb1);
        }

        protected void zza(zzbn zzbn1)
            throws RemoteException
        {
            zzbn1.zzb(this, zzaZN, zzaZM);
            zzaZN = null;
        }

        public Result zzb(Status status)
        {
            return zzd(status);
        }

        public Status zzd(Status status)
        {
            zzaZN = null;
            return status;
        }

        zzc(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
        {
            super(googleapiclient);
            zzaZN = (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzx.zzv(channellistener);
            zzaZM = s;
        }
    }


    public zzk()
    {
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzx.zzb(googleapiclient, "client is null");
        zzx.zzb(channellistener, "listener is null");
        return googleapiclient.zza(new zza(googleapiclient, channellistener, null));
    }

    public PendingResult openChannel(GoogleApiClient googleapiclient, String s, String s1)
    {
        zzx.zzb(googleapiclient, "client is null");
        zzx.zzb(s, "nodeId is null");
        zzx.zzb(s1, "path is null");
        return googleapiclient.zzb(new zzh(googleapiclient, s, s1) {

            final String zzaZK;
            final zzk zzaZL;
            final String zzrr;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zze(this, zzaZK, zzrr);
            }

            public Result zzb(Status status)
            {
                return zzbm(status);
            }

            public com.google.android.gms.wearable.ChannelApi.OpenChannelResult zzbm(Status status)
            {
                return new zzb(status, null);
            }

            
            {
                zzaZL = zzk.this;
                zzaZK = s;
                zzrr = s1;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzx.zzb(googleapiclient, "client is null");
        zzx.zzb(channellistener, "listener is null");
        return googleapiclient.zza(new zzc(googleapiclient, channellistener, null));
    }
}
