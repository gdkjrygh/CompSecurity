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
import com.google.android.gms.fitness.ConfigApi;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;
import com.google.android.gms.fitness.result.DataTypeResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzly, zzmj, zzng

public class zzna
    implements ConfigApi
{
    private static class zza extends zzmh.zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(DataTypeResult datatyperesult)
        {
            zzOs.zzm(datatyperesult);
        }

        private zza(com.google.android.gms.common.api.zza.zzb zzb)
        {
            zzOs = zzb;
        }

    }


    public zzna()
    {
    }

    public PendingResult createCustomDataType(GoogleApiClient googleapiclient, DataTypeCreateRequest datatypecreaterequest)
    {
        return googleapiclient.zzb(new zzly.zza(googleapiclient, datatypecreaterequest) {

            final DataTypeCreateRequest zzalc;
            final zzna zzald;

            protected Result createFailedResult(Status status)
            {
                return zzC(status);
            }

            protected DataTypeResult zzC(Status status)
            {
                return DataTypeResult.zzM(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzly)client);
            }

            protected void zza(zzly zzly1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s = zzly1.getContext().getPackageName();
                ((zzmj)zzly1.zznM()).zza(new DataTypeCreateRequest(zzalc, zza1, s));
            }

            
            {
                zzald = zzna.this;
                zzalc = datatypecreaterequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult disableFit(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzly.zzc(googleapiclient) {

            final zzna zzald;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzly)client);
            }

            protected void zza(zzly zzly1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzly1.getContext().getPackageName();
                ((zzmj)zzly1.zznM()).zza(new DisableFitRequest(zzng1, s));
            }

            
            {
                zzald = zzna.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult readDataType(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new zzly.zza(googleapiclient, s) {

            final zzna zzald;
            final String zzale;

            protected Result createFailedResult(Status status)
            {
                return zzC(status);
            }

            protected DataTypeResult zzC(Status status)
            {
                return DataTypeResult.zzM(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzly)client);
            }

            protected void zza(zzly zzly1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s1 = zzly1.getContext().getPackageName();
                ((zzmj)zzly1.zznM()).zza(new DataTypeReadRequest(zzale, zza1, s1));
            }

            
            {
                zzald = zzna.this;
                zzale = s;
                super(googleapiclient);
            }
        });
    }
}
