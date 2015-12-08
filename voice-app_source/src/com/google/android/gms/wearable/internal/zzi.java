// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzbk

public final class zzi
    implements ChannelApi
{
    static final class zza extends zzf
    {

        private final String zzaTK;
        private com.google.android.gms.wearable.ChannelApi.ChannelListener zzaTL;

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
            zzbk1.zza(this, zzaTL, zzaTK);
            zzaTL = null;
        }

        public Status zzb(Status status)
        {
            zzaTL = null;
            return status;
        }

        zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
        {
            super(googleapiclient);
            zzaTL = (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzu.zzu(channellistener);
            zzaTK = s;
        }
    }

    static final class zzb
        implements com.google.android.gms.wearable.ChannelApi.OpenChannelResult
    {

        private final Status zzOt;
        private final Channel zzaTM;

        public Channel getChannel()
        {
            return zzaTM;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        zzb(Status status, Channel channel)
        {
            zzOt = (Status)zzu.zzu(status);
            zzaTM = channel;
        }
    }

    static final class zzc extends zzf
    {

        private final String zzaTK;
        private com.google.android.gms.wearable.ChannelApi.ChannelListener zzaTL;

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
            zzbk1.zzb(this, zzaTL, zzaTK);
            zzaTL = null;
        }

        public Status zzb(Status status)
        {
            zzaTL = null;
            return status;
        }

        zzc(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
        {
            super(googleapiclient);
            zzaTL = (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzu.zzu(channellistener);
            zzaTK = s;
        }
    }


    public zzi()
    {
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzu.zzb(googleapiclient, "client is null");
        zzu.zzb(channellistener, "listener is null");
        return googleapiclient.zza(new zza(googleapiclient, channellistener, null));
    }

    public PendingResult openChannel(GoogleApiClient googleapiclient, String s, String s1)
    {
        zzu.zzb(googleapiclient, "client is null");
        zzu.zzb(s, "nodeId is null");
        zzu.zzb(s1, "path is null");
        return googleapiclient.zzb(new zzf(googleapiclient, s, s1) {

            final String zzaTI;
            final zzi zzaTJ;
            final String zzqY;

            public Result createFailedResult(Status status)
            {
                return zzba(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zze(this, zzaTI, zzqY);
            }

            public com.google.android.gms.wearable.ChannelApi.OpenChannelResult zzba(Status status)
            {
                return new zzb(status, null);
            }

            
            {
                zzaTJ = zzi.this;
                zzaTI = s;
                zzqY = s1;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzu.zzb(googleapiclient, "client is null");
        zzu.zzb(channellistener, "listener is null");
        return googleapiclient.zza(new zzc(googleapiclient, channellistener, null));
    }
}
