// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.Channel;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzl, zzf, zzbk

public class ChannelImpl
    implements SafeParcelable, Channel
{
    static final class zza
        implements com.google.android.gms.wearable.Channel.GetInputStreamResult
    {

        private final Status zzOt;
        private final InputStream zzaTV;

        public InputStream getInputStream()
        {
            return zzaTV;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public void release()
        {
            if (zzaTV == null)
            {
                break MISSING_BLOCK_LABEL_14;
            }
            zzaTV.close();
            return;
            IOException ioexception;
            ioexception;
        }

        zza(Status status, InputStream inputstream)
        {
            zzOt = (Status)zzu.zzu(status);
            zzaTV = inputstream;
        }
    }

    static final class zzb
        implements com.google.android.gms.wearable.Channel.GetOutputStreamResult
    {

        private final Status zzOt;
        private final OutputStream zzaTW;

        public OutputStream getOutputStream()
        {
            return zzaTW;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public void release()
        {
            if (zzaTW == null)
            {
                break MISSING_BLOCK_LABEL_14;
            }
            zzaTW.close();
            return;
            IOException ioexception;
            ioexception;
        }

        zzb(Status status, OutputStream outputstream)
        {
            zzOt = (Status)zzu.zzu(status);
            zzaTW = outputstream;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    final int zzCY;
    private final String zzaST;
    private final String zzaTK;
    private final String zzaTQ;

    ChannelImpl(int i, String s, String s1, String s2)
    {
        zzCY = i;
        zzaTK = (String)zzu.zzu(s);
        zzaST = (String)zzu.zzu(s1);
        zzaTQ = (String)zzu.zzu(s2);
    }

    static String zza(ChannelImpl channelimpl)
    {
        return channelimpl.zzaTK;
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzu.zzb(googleapiclient, "client is null");
        zzu.zzb(channellistener, "listener is null");
        return googleapiclient.zza(new zzi.zza(googleapiclient, channellistener, zzaTK));
    }

    public PendingResult close(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzf(googleapiclient) {

            final ChannelImpl zzaTR;

            protected Result createFailedResult(Status status)
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
                zzbk1.zzt(this, ChannelImpl.zza(zzaTR));
            }

            protected Status zzb(Status status)
            {
                return status;
            }

            
            {
                zzaTR = ChannelImpl.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult close(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zzb(new zzf(googleapiclient, i) {

            final ChannelImpl zzaTR;
            final int zzajs;

            protected Result createFailedResult(Status status)
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
                zzbk1.zzh(this, ChannelImpl.zza(zzaTR), zzajs);
            }

            protected Status zzb(Status status)
            {
                return status;
            }

            
            {
                zzaTR = ChannelImpl.this;
                zzajs = i;
                super(googleapiclient);
            }
        });
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ChannelImpl))
            {
                return false;
            }
            obj = (ChannelImpl)obj;
            if (!zzaTK.equals(((ChannelImpl) (obj)).zzaTK) || !zzt.equal(((ChannelImpl) (obj)).zzaST, zzaST) || !zzt.equal(((ChannelImpl) (obj)).zzaTQ, zzaTQ) || ((ChannelImpl) (obj)).zzCY != zzCY)
            {
                return false;
            }
        }
        return true;
    }

    public PendingResult getInputStream(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzf(googleapiclient) {

            final ChannelImpl zzaTR;

            public Result createFailedResult(Status status)
            {
                return zzbb(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzu(this, ChannelImpl.zza(zzaTR));
            }

            public com.google.android.gms.wearable.Channel.GetInputStreamResult zzbb(Status status)
            {
                return new zza(status, null);
            }

            
            {
                zzaTR = ChannelImpl.this;
                super(googleapiclient);
            }
        });
    }

    public String getNodeId()
    {
        return zzaST;
    }

    public PendingResult getOutputStream(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzf(googleapiclient) {

            final ChannelImpl zzaTR;

            public Result createFailedResult(Status status)
            {
                return zzbc(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzv(this, ChannelImpl.zza(zzaTR));
            }

            public com.google.android.gms.wearable.Channel.GetOutputStreamResult zzbc(Status status)
            {
                return new zzb(status, null);
            }

            
            {
                zzaTR = ChannelImpl.this;
                super(googleapiclient);
            }
        });
    }

    public String getPath()
    {
        return zzaTQ;
    }

    public String getToken()
    {
        return zzaTK;
    }

    public int hashCode()
    {
        return zzaTK.hashCode();
    }

    public PendingResult receiveFile(GoogleApiClient googleapiclient, Uri uri, boolean flag)
    {
        zzu.zzb(googleapiclient, "client is null");
        zzu.zzb(uri, "uri is null");
        return googleapiclient.zzb(new zzf(googleapiclient, uri, flag) {

            final Uri zzaGx;
            final ChannelImpl zzaTR;
            final boolean zzaTS;

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
                zzbk1.zza(this, ChannelImpl.zza(zzaTR), zzaGx, zzaTS);
            }

            public Status zzb(Status status)
            {
                return status;
            }

            
            {
                zzaTR = ChannelImpl.this;
                zzaGx = uri;
                zzaTS = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzu.zzb(googleapiclient, "client is null");
        zzu.zzb(channellistener, "listener is null");
        return googleapiclient.zza(new zzi.zzc(googleapiclient, channellistener, zzaTK));
    }

    public PendingResult sendFile(GoogleApiClient googleapiclient, Uri uri)
    {
        return sendFile(googleapiclient, uri, 0L, -1L);
    }

    public PendingResult sendFile(GoogleApiClient googleapiclient, Uri uri, long l, long l1)
    {
        zzu.zzb(googleapiclient, "client is null");
        zzu.zzb(zzaTK, "token is null");
        zzu.zzb(uri, "uri is null");
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "startOffset is negative: %s", new Object[] {
            Long.valueOf(l)
        });
        if (l1 >= 0L || l1 == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "invalid length: %s", new Object[] {
            Long.valueOf(l1)
        });
        return googleapiclient.zzb(new zzf(googleapiclient, uri, l, l1) {

            final Uri zzaGx;
            final ChannelImpl zzaTR;
            final long zzaTT;
            final long zzaTU;

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
                zzbk1.zza(this, ChannelImpl.zza(zzaTR), zzaGx, zzaTT, zzaTU);
            }

            public Status zzb(Status status)
            {
                return status;
            }

            
            {
                zzaTR = ChannelImpl.this;
                zzaGx = uri;
                zzaTT = l;
                zzaTU = l1;
                super(googleapiclient);
            }
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("ChannelImpl{versionCode=").append(zzCY).append(", token='").append(zzaTK).append('\'').append(", nodeId='").append(zzaST).append('\'').append(", path='").append(zzaTQ).append('\'').append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

}
