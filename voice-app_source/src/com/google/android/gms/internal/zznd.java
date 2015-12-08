// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.RecordingApi;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.request.SubscribeRequest;
import com.google.android.gms.fitness.request.UnsubscribeRequest;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzmb, zzmm, zzng

public class zznd
    implements RecordingApi
{
    private static class zza extends zzmp.zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(ListSubscriptionsResult listsubscriptionsresult)
        {
            zzOs.zzm(listsubscriptionsresult);
        }

        private zza(com.google.android.gms.common.api.zza.zzb zzb)
        {
            zzOs = zzb;
        }

    }


    public zznd()
    {
    }

    private PendingResult zza(GoogleApiClient googleapiclient, Subscription subscription)
    {
        return googleapiclient.zza(new zzmb.zzc(googleapiclient, subscription) {

            final zznd zzalo;
            final Subscription zzalp;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmb)client);
            }

            protected void zza(zzmb zzmb1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzmb1.getContext().getPackageName();
                ((zzmm)zzmb1.zznM()).zza(new SubscribeRequest(zzalp, false, zzng1, s));
            }

            
            {
                zzalo = zznd.this;
                zzalp = subscription;
                super(googleapiclient);
            }
        });
    }

    public PendingResult listSubscriptions(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzmb.zza(googleapiclient) {

            final zznd zzalo;

            protected Result createFailedResult(Status status)
            {
                return zzF(status);
            }

            protected ListSubscriptionsResult zzF(Status status)
            {
                return ListSubscriptionsResult.zzN(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmb)client);
            }

            protected void zza(zzmb zzmb1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s = zzmb1.getContext().getPackageName();
                ((zzmm)zzmb1.zznM()).zza(new ListSubscriptionsRequest(null, zza1, s));
            }

            
            {
                zzalo = zznd.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult listSubscriptions(GoogleApiClient googleapiclient, DataType datatype)
    {
        return googleapiclient.zza(new zzmb.zza(googleapiclient, datatype) {

            final DataType zzalk;
            final zznd zzalo;

            protected Result createFailedResult(Status status)
            {
                return zzF(status);
            }

            protected ListSubscriptionsResult zzF(Status status)
            {
                return ListSubscriptionsResult.zzN(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmb)client);
            }

            protected void zza(zzmb zzmb1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s = zzmb1.getContext().getPackageName();
                ((zzmm)zzmb1.zznM()).zza(new ListSubscriptionsRequest(zzalk, zza1, s));
            }

            
            {
                zzalo = zznd.this;
                zzalk = datatype;
                super(googleapiclient);
            }
        });
    }

    public PendingResult subscribe(GoogleApiClient googleapiclient, DataSource datasource)
    {
        return zza(googleapiclient, (new com.google.android.gms.fitness.data.Subscription.zza()).zzb(datasource).zzqN());
    }

    public PendingResult subscribe(GoogleApiClient googleapiclient, DataType datatype)
    {
        return zza(googleapiclient, (new com.google.android.gms.fitness.data.Subscription.zza()).zzb(datatype).zzqN());
    }

    public PendingResult unsubscribe(GoogleApiClient googleapiclient, DataSource datasource)
    {
        return googleapiclient.zzb(new zzmb.zzc(googleapiclient, datasource) {

            final zznd zzalo;
            final DataSource zzalq;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmb)client);
            }

            protected void zza(zzmb zzmb1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzmb1.getContext().getPackageName();
                ((zzmm)zzmb1.zznM()).zza(new UnsubscribeRequest(null, zzalq, zzng1, s));
            }

            
            {
                zzalo = zznd.this;
                zzalq = datasource;
                super(googleapiclient);
            }
        });
    }

    public PendingResult unsubscribe(GoogleApiClient googleapiclient, DataType datatype)
    {
        return googleapiclient.zzb(new zzmb.zzc(googleapiclient, datatype) {

            final DataType zzalk;
            final zznd zzalo;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmb)client);
            }

            protected void zza(zzmb zzmb1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzmb1.getContext().getPackageName();
                ((zzmm)zzmb1.zznM()).zza(new UnsubscribeRequest(zzalk, null, zzng1, s));
            }

            
            {
                zzalo = zznd.this;
                zzalk = datatype;
                super(googleapiclient);
            }
        });
    }

    public PendingResult unsubscribe(GoogleApiClient googleapiclient, Subscription subscription)
    {
        if (subscription.getDataType() == null)
        {
            return unsubscribe(googleapiclient, subscription.getDataSource());
        } else
        {
            return unsubscribe(googleapiclient, subscription.getDataType());
        }
    }
}
