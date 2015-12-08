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
//            zzf, zzbk

public final class zzu
    implements DataApi
{
    private static final class zza extends zzf
    {

        private com.google.android.gms.wearable.DataApi.DataListener zzaUj;
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
            zzbk1.zza(this, zzaUj, zzaUk);
            zzaUj = null;
            zzaUk = null;
        }

        public Status zzb(Status status)
        {
            zzaUj = null;
            zzaUk = null;
            return status;
        }

        private zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
        {
            super(googleapiclient);
            zzaUj = datalistener;
            zzaUk = aintentfilter;
        }

    }

    public static class zzb
        implements com.google.android.gms.wearable.DataApi.DataItemResult
    {

        private final Status zzOt;
        private final DataItem zzaUl;

        public DataItem getDataItem()
        {
            return zzaUl;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zzb(Status status, DataItem dataitem)
        {
            zzOt = status;
            zzaUl = dataitem;
        }
    }

    public static class zzc
        implements com.google.android.gms.wearable.DataApi.DeleteDataItemsResult
    {

        private final Status zzOt;
        private final int zzaUm;

        public int getNumDeleted()
        {
            return zzaUm;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zzc(Status status, int i)
        {
            zzOt = status;
            zzaUm = i;
        }
    }

    public static class zzd
        implements com.google.android.gms.wearable.DataApi.GetFdForAssetResult
    {

        private volatile boolean mClosed;
        private final Status zzOt;
        private volatile InputStream zzaTV;
        private volatile ParcelFileDescriptor zzaUn;

        public ParcelFileDescriptor getFd()
        {
            if (mClosed)
            {
                throw new IllegalStateException("Cannot access the file descriptor after release().");
            } else
            {
                return zzaUn;
            }
        }

        public InputStream getInputStream()
        {
            if (mClosed)
            {
                throw new IllegalStateException("Cannot access the input stream after release().");
            }
            if (zzaUn == null)
            {
                return null;
            }
            if (zzaTV == null)
            {
                zzaTV = new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzaUn);
            }
            return zzaTV;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public void release()
        {
            if (zzaUn == null)
            {
                return;
            }
            if (mClosed)
            {
                throw new IllegalStateException("releasing an already released result.");
            }
            if (zzaTV == null)
            {
                break MISSING_BLOCK_LABEL_55;
            }
            zzaTV.close();
_L1:
            mClosed = true;
            zzaUn = null;
            zzaTV = null;
            return;
            try
            {
                zzaUn.close();
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
            zzOt = status;
            zzaUn = parcelfiledescriptor;
        }
    }


    public zzu()
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
        return googleapiclient.zza(new zzf(googleapiclient, uri, i) {

            final Uri zzaGx;
            final zzu zzaUe;
            final int zzaUf;

            protected Result createFailedResult(Status status)
            {
                return zzbf(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzb(this, zzaGx, zzaUf);
            }

            protected com.google.android.gms.wearable.DataApi.DeleteDataItemsResult zzbf(Status status)
            {
                return new zzc(status, 0);
            }

            
            {
                zzaUe = zzu.this;
                zzaGx = uri;
                zzaUf = i;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getDataItem(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.zza(new zzf(googleapiclient, uri) {

            final Uri zzaGx;
            final zzu zzaUe;

            protected Result createFailedResult(Status status)
            {
                return zzbd(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzaGx);
            }

            protected com.google.android.gms.wearable.DataApi.DataItemResult zzbd(Status status)
            {
                return new zzb(status, null);
            }

            
            {
                zzaUe = zzu.this;
                zzaGx = uri;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzf(googleapiclient) {

            final zzu zzaUe;

            protected Result createFailedResult(Status status)
            {
                return zzbe(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzl(this);
            }

            protected DataItemBuffer zzbe(Status status)
            {
                return new DataItemBuffer(DataHolder.zzbi(status.getStatusCode()));
            }

            
            {
                zzaUe = zzu.this;
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
        return googleapiclient.zza(new zzf(googleapiclient, uri, i) {

            final Uri zzaGx;
            final zzu zzaUe;
            final int zzaUf;

            protected Result createFailedResult(Status status)
            {
                return zzbe(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzaGx, zzaUf);
            }

            protected DataItemBuffer zzbe(Status status)
            {
                return new DataItemBuffer(DataHolder.zzbi(status.getStatusCode()));
            }

            
            {
                zzaUe = zzu.this;
                zzaGx = uri;
                zzaUf = i;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, Asset asset)
    {
        zza(asset);
        return googleapiclient.zza(new zzf(googleapiclient, asset) {

            final zzu zzaUe;
            final Asset zzaUg;

            protected Result createFailedResult(Status status)
            {
                return zzbg(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzaUg);
            }

            protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult zzbg(Status status)
            {
                return new zzd(status, null);
            }

            
            {
                zzaUe = zzu.this;
                zzaUg = asset;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, DataItemAsset dataitemasset)
    {
        return googleapiclient.zza(new zzf(googleapiclient, dataitemasset) {

            final zzu zzaUe;
            final DataItemAsset zzaUh;

            protected Result createFailedResult(Status status)
            {
                return zzbg(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzaUh);
            }

            protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult zzbg(Status status)
            {
                return new zzd(status, null);
            }

            
            {
                zzaUe = zzu.this;
                zzaUh = dataitemasset;
                super(googleapiclient);
            }
        });
    }

    public PendingResult putDataItem(GoogleApiClient googleapiclient, PutDataRequest putdatarequest)
    {
        return googleapiclient.zza(new zzf(googleapiclient, putdatarequest) {

            final PutDataRequest zzaUd;
            final zzu zzaUe;

            public Result createFailedResult(Status status)
            {
                return zzbd(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzaUd);
            }

            public com.google.android.gms.wearable.DataApi.DataItemResult zzbd(Status status)
            {
                return new zzb(status, null);
            }

            
            {
                zzaUe = zzu.this;
                zzaUd = putdatarequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener)
    {
        return googleapiclient.zza(new zzf(googleapiclient, datalistener) {

            final zzu zzaUe;
            final com.google.android.gms.wearable.DataApi.DataListener zzaUi;

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
                zzbk1.zza(this, zzaUi);
            }

            public Status zzb(Status status)
            {
                return status;
            }

            
            {
                zzaUe = zzu.this;
                zzaUi = datalistener;
                super(googleapiclient);
            }
        });
    }
}
