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
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzn, zzh, zzbn

public class ChannelImpl
    implements SafeParcelable, Channel
{
    static final class zza
        implements com.google.android.gms.wearable.Channel.GetInputStreamResult
    {

        private final Status zzQA;
        private final InputStream zzaZW;

        public InputStream getInputStream()
        {
            return zzaZW;
        }

        public Status getStatus()
        {
            return zzQA;
        }

        public void release()
        {
            if (zzaZW == null)
            {
                break MISSING_BLOCK_LABEL_14;
            }
            zzaZW.close();
            return;
            IOException ioexception;
            ioexception;
        }

        zza(Status status, InputStream inputstream)
        {
            zzQA = (Status)zzx.zzv(status);
            zzaZW = inputstream;
        }
    }

    static final class zzb
        implements com.google.android.gms.wearable.Channel.GetOutputStreamResult
    {

        private final Status zzQA;
        private final OutputStream zzaZX;

        public OutputStream getOutputStream()
        {
            return zzaZX;
        }

        public Status getStatus()
        {
            return zzQA;
        }

        public void release()
        {
            if (zzaZX == null)
            {
                break MISSING_BLOCK_LABEL_14;
            }
            zzaZX.close();
            return;
            IOException ioexception;
            ioexception;
        }

        zzb(Status status, OutputStream outputstream)
        {
            zzQA = (Status)zzx.zzv(status);
            zzaZX = outputstream;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzn();
    private final String mPath;
    final int mVersionCode;
    private final String zzaYR;
    private final String zzaZM;

    ChannelImpl(int i, String s, String s1, String s2)
    {
        mVersionCode = i;
        zzaZM = (String)zzx.zzv(s);
        zzaYR = (String)zzx.zzv(s1);
        mPath = (String)zzx.zzv(s2);
    }

    static String zza(ChannelImpl channelimpl)
    {
        return channelimpl.zzaZM;
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzx.zzb(googleapiclient, "client is null");
        zzx.zzb(channellistener, "listener is null");
        return googleapiclient.zza(new zzk.zza(googleapiclient, channellistener, zzaZM));
    }

    public PendingResult close(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzh(googleapiclient) {

            final ChannelImpl zzaZS;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zzt(this, ChannelImpl.zza(zzaZS));
            }

            protected Result zzb(Status status)
            {
                return zzd(status);
            }

            protected Status zzd(Status status)
            {
                return status;
            }

            
            {
                zzaZS = ChannelImpl.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult close(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zzb(new zzh(googleapiclient, i) {

            final ChannelImpl zzaZS;
            final int zzamY;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zzh(this, ChannelImpl.zza(zzaZS), zzamY);
            }

            protected Result zzb(Status status)
            {
                return zzd(status);
            }

            protected Status zzd(Status status)
            {
                return status;
            }

            
            {
                zzaZS = ChannelImpl.this;
                zzamY = i;
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
            if (!zzaZM.equals(((ChannelImpl) (obj)).zzaZM) || !zzw.equal(((ChannelImpl) (obj)).zzaYR, zzaYR) || !zzw.equal(((ChannelImpl) (obj)).mPath, mPath) || ((ChannelImpl) (obj)).mVersionCode != mVersionCode)
            {
                return false;
            }
        }
        return true;
    }

    public PendingResult getInputStream(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzh(googleapiclient) {

            final ChannelImpl zzaZS;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zzu(this, ChannelImpl.zza(zzaZS));
            }

            public Result zzb(Status status)
            {
                return zzbn(status);
            }

            public com.google.android.gms.wearable.Channel.GetInputStreamResult zzbn(Status status)
            {
                return new zza(status, null);
            }

            
            {
                zzaZS = ChannelImpl.this;
                super(googleapiclient);
            }
        });
    }

    public String getNodeId()
    {
        return zzaYR;
    }

    public PendingResult getOutputStream(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzh(googleapiclient) {

            final ChannelImpl zzaZS;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zzv(this, ChannelImpl.zza(zzaZS));
            }

            public Result zzb(Status status)
            {
                return zzbo(status);
            }

            public com.google.android.gms.wearable.Channel.GetOutputStreamResult zzbo(Status status)
            {
                return new zzb(status, null);
            }

            
            {
                zzaZS = ChannelImpl.this;
                super(googleapiclient);
            }
        });
    }

    public String getPath()
    {
        return mPath;
    }

    public String getToken()
    {
        return zzaZM;
    }

    public int hashCode()
    {
        return zzaZM.hashCode();
    }

    public PendingResult receiveFile(GoogleApiClient googleapiclient, Uri uri, boolean flag)
    {
        zzx.zzb(googleapiclient, "client is null");
        zzx.zzb(uri, "uri is null");
        return googleapiclient.zzb(new zzh(googleapiclient, uri, flag) {

            final Uri zzaKy;
            final ChannelImpl zzaZS;
            final boolean zzaZT;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zza(this, ChannelImpl.zza(zzaZS), zzaKy, zzaZT);
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
                zzaZS = ChannelImpl.this;
                zzaKy = uri;
                zzaZT = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzx.zzb(googleapiclient, "client is null");
        zzx.zzb(channellistener, "listener is null");
        return googleapiclient.zza(new zzk.zzc(googleapiclient, channellistener, zzaZM));
    }

    public PendingResult sendFile(GoogleApiClient googleapiclient, Uri uri)
    {
        return sendFile(googleapiclient, uri, 0L, -1L);
    }

    public PendingResult sendFile(GoogleApiClient googleapiclient, Uri uri, long l, long l1)
    {
        zzx.zzb(googleapiclient, "client is null");
        zzx.zzb(zzaZM, "token is null");
        zzx.zzb(uri, "uri is null");
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "startOffset is negative: %s", new Object[] {
            Long.valueOf(l)
        });
        if (l1 >= 0L || l1 == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "invalid length: %s", new Object[] {
            Long.valueOf(l1)
        });
        return googleapiclient.zzb(new zzh(googleapiclient, uri, l, l1) {

            final Uri zzaKy;
            final ChannelImpl zzaZS;
            final long zzaZU;
            final long zzaZV;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zza(this, ChannelImpl.zza(zzaZS), zzaKy, zzaZU, zzaZV);
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
                zzaZS = ChannelImpl.this;
                zzaKy = uri;
                zzaZU = l;
                zzaZV = l1;
                super(googleapiclient);
            }
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("ChannelImpl{versionCode=").append(mVersionCode).append(", token='").append(zzaZM).append('\'').append(", nodeId='").append(zzaYR).append('\'').append(", path='").append(mPath).append('\'').append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzn.zza(this, parcel, i);
    }

}
