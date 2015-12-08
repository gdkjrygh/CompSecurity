// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh, zzbn

public final class zzw
    implements DataApi
{
    private static final class zza extends zzh
    {

        private com.google.android.gms.wearable.DataApi.DataListener zzbak;
        private IntentFilter zzbal[];

        protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
            throws RemoteException
        {
            zza((zzbn)zzb1);
        }

        protected void zza(zzbn zzbn1)
            throws RemoteException
        {
            zzbn1.zza(this, zzbak, zzbal);
            zzbak = null;
            zzbal = null;
        }

        public Result zzb(Status status)
        {
            return zzd(status);
        }

        public Status zzd(Status status)
        {
            zzbak = null;
            zzbal = null;
            return status;
        }

        private zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
        {
            super(googleapiclient);
            zzbak = datalistener;
            zzbal = aintentfilter;
        }

    }

    public static class zzb
        implements com.google.android.gms.wearable.DataApi.DataItemResult
    {

        private final Status zzQA;
        private final DataItem zzbam;

        public DataItem getDataItem()
        {
            return zzbam;
        }

        public Status getStatus()
        {
            return zzQA;
        }

        public zzb(Status status, DataItem dataitem)
        {
            zzQA = status;
            zzbam = dataitem;
        }
    }

    public static class zzc
        implements com.google.android.gms.wearable.DataApi.DeleteDataItemsResult
    {

        private final Status zzQA;
        private final int zzban;

        public int getNumDeleted()
        {
            return zzban;
        }

        public Status getStatus()
        {
            return zzQA;
        }

        public zzc(Status status, int i)
        {
            zzQA = status;
            zzban = i;
        }
    }

    public static class zzd
        implements com.google.android.gms.wearable.DataApi.GetFdForAssetResult
    {

        private volatile boolean mClosed;
        private final Status zzQA;
        private volatile InputStream zzaZW;
        private volatile ParcelFileDescriptor zzbao;

        public ParcelFileDescriptor getFd()
        {
            if (mClosed)
            {
                throw new IllegalStateException("Cannot access the file descriptor after release().");
            } else
            {
                return zzbao;
            }
        }

        public InputStream getInputStream()
        {
            if (mClosed)
            {
                throw new IllegalStateException("Cannot access the input stream after release().");
            }
            if (zzbao == null)
            {
                return null;
            }
            if (zzaZW == null)
            {
                zzaZW = new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzbao);
            }
            return zzaZW;
        }

        public Status getStatus()
        {
            return zzQA;
        }

        public void release()
        {
            if (zzbao == null)
            {
                return;
            }
            if (mClosed)
            {
                throw new IllegalStateException("releasing an already released result.");
            }
            if (zzaZW == null)
            {
                break MISSING_BLOCK_LABEL_55;
            }
            zzaZW.close();
_L1:
            mClosed = true;
            zzbao = null;
            zzaZW = null;
            return;
            try
            {
                zzbao.close();
            }
            catch (IOException ioexception)
            {
                return;
            }
              goto _L1
        }

        public zzd(Status status, ParcelFileDescriptor parcelfiledescriptor)
        {
            mClosed = false;
            zzQA = status;
            zzbao = parcelfiledescriptor;
        }
    }


    public zzw()
    {
    }

    private PendingResult zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
    {
        return googleapiclient.zza(new zza(googleapiclient, datalistener, aintentfilter));
    }

    private void zza(Asset asset)
    {
        if (asset == null)
        {
            throw new IllegalArgumentException("asset is null");
        }
        if (asset.getDigest() == null)
        {
            throw new IllegalArgumentException("invalid asset");
        }
        if (asset.getData() != null)
        {
            throw new IllegalArgumentException("invalid asset");
        } else
        {
            return;
        }
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener)
    {
        return zza(googleapiclient, datalistener, null);
    }

    public PendingResult deleteDataItems(GoogleApiClient googleapiclient, Uri uri)
    {
        return deleteDataItems(googleapiclient, uri, 0);
    }

    public PendingResult deleteDataItems(GoogleApiClient googleapiclient, Uri uri, int i)
    {
        return googleapiclient.zza(new zzh(googleapiclient, uri, i) {

            final Uri zzaKy;
            final zzw zzbaf;
            final int zzbag;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zzb(this, zzaKy, zzbag);
            }

            protected Result zzb(Status status)
            {
                return zzbr(status);
            }

            protected com.google.android.gms.wearable.DataApi.DeleteDataItemsResult zzbr(Status status)
            {
                return new zzc(status, 0);
            }

            
            {
                zzbaf = zzw.this;
                zzaKy = uri;
                zzbag = i;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getDataItem(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.zza(new zzh(googleapiclient, uri) {

            final Uri zzaKy;
            final zzw zzbaf;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zza(this, zzaKy);
            }

            protected Result zzb(Status status)
            {
                return zzbp(status);
            }

            protected com.google.android.gms.wearable.DataApi.DataItemResult zzbp(Status status)
            {
                return new zzb(status, null);
            }

            
            {
                zzbaf = zzw.this;
                zzaKy = uri;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzh(googleapiclient) {

            final zzw zzbaf;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zzn(this);
            }

            protected Result zzb(Status status)
            {
                return zzbq(status);
            }

            protected DataItemBuffer zzbq(Status status)
            {
                return new DataItemBuffer(DataHolder.zzbp(status.getStatusCode()));
            }

            
            {
                zzbaf = zzw.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient, Uri uri)
    {
        return getDataItems(googleapiclient, uri, 0);
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient, Uri uri, int i)
    {
        return googleapiclient.zza(new zzh(googleapiclient, uri, i) {

            final Uri zzaKy;
            final zzw zzbaf;
            final int zzbag;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zza(this, zzaKy, zzbag);
            }

            protected Result zzb(Status status)
            {
                return zzbq(status);
            }

            protected DataItemBuffer zzbq(Status status)
            {
                return new DataItemBuffer(DataHolder.zzbp(status.getStatusCode()));
            }

            
            {
                zzbaf = zzw.this;
                zzaKy = uri;
                zzbag = i;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, Asset asset)
    {
        zza(asset);
        return googleapiclient.zza(new zzh(googleapiclient, asset) {

            final zzw zzbaf;
            final Asset zzbah;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zza(this, zzbah);
            }

            protected Result zzb(Status status)
            {
                return zzbs(status);
            }

            protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult zzbs(Status status)
            {
                return new zzd(status, null);
            }

            
            {
                zzbaf = zzw.this;
                zzbah = asset;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, DataItemAsset dataitemasset)
    {
        return googleapiclient.zza(new zzh(googleapiclient, dataitemasset) {

            final zzw zzbaf;
            final DataItemAsset zzbai;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zza(this, zzbai);
            }

            protected Result zzb(Status status)
            {
                return zzbs(status);
            }

            protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult zzbs(Status status)
            {
                return new zzd(status, null);
            }

            
            {
                zzbaf = zzw.this;
                zzbai = dataitemasset;
                super(googleapiclient);
            }
        });
    }

    public PendingResult putDataItem(GoogleApiClient googleapiclient, PutDataRequest putdatarequest)
    {
        return googleapiclient.zza(new zzh(googleapiclient, putdatarequest) {

            final PutDataRequest zzbae;
            final zzw zzbaf;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zza(this, zzbae);
            }

            public Result zzb(Status status)
            {
                return zzbp(status);
            }

            public com.google.android.gms.wearable.DataApi.DataItemResult zzbp(Status status)
            {
                return new zzb(status, null);
            }

            
            {
                zzbaf = zzw.this;
                zzbae = putdatarequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener)
    {
        return googleapiclient.zza(new zzh(googleapiclient, datalistener) {

            final zzw zzbaf;
            final com.google.android.gms.wearable.DataApi.DataListener zzbaj;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zza(this, zzbaj);
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
                zzbaf = zzw.this;
                zzbaj = datalistener;
                super(googleapiclient);
            }
        });
    }
}
