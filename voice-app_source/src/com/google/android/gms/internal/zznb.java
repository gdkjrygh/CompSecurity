// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.HistoryApi;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzlz, zzng, zzmk

public class zznb
    implements HistoryApi
{
    private static class zza extends zzmf.zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;
        private int zzalm;
        private DataReadResult zzaln;

        public void zza(DataReadResult datareadresult)
        {
            this;
            JVM INSTR monitorenter ;
            Log.v("Fitness", "Received batch result");
            if (zzaln != null)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            zzaln = datareadresult;
_L2:
            zzalm = zzalm + 1;
            if (zzalm == zzaln.zzrt())
            {
                zzOs.zzm(zzaln);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            zzaln.zzb(datareadresult);
            if (true) goto _L2; else goto _L1
_L1:
            datareadresult;
            this;
            JVM INSTR monitorexit ;
            throw datareadresult;
        }

        private zza(com.google.android.gms.common.api.zza.zzb zzb)
        {
            zzalm = 0;
            zzaln = null;
            zzOs = zzb;
        }

    }


    public zznb()
    {
    }

    private PendingResult zza(GoogleApiClient googleapiclient, DataSet dataset, boolean flag)
    {
        zzu.zzb(dataset, "Must set the data set");
        boolean flag1;
        if (!dataset.getDataPoints().isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        zzu.zza(flag1, "Cannot use an empty data set");
        zzu.zzb(dataset.getDataSource().zzqB(), "Must set the app package name for the data source");
        return googleapiclient.zza(new zzlz.zzc(googleapiclient, dataset, flag) {

            final DataSet zzalf;
            final boolean zzalg;
            final zznb zzalh;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzlz)client);
            }

            protected void zza(zzlz zzlz1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzlz1.getContext().getPackageName();
                ((zzmk)zzlz1.zznM()).zza(new DataInsertRequest(zzalf, zzng1, s, zzalg));
            }

            
            {
                zzalh = zznb.this;
                zzalf = dataset;
                zzalg = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult deleteData(GoogleApiClient googleapiclient, DataDeleteRequest datadeleterequest)
    {
        return googleapiclient.zza(new zzlz.zzc(googleapiclient, datadeleterequest) {

            final zznb zzalh;
            final DataDeleteRequest zzali;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzlz)client);
            }

            protected void zza(zzlz zzlz1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzlz1.getContext().getPackageName();
                ((zzmk)zzlz1.zznM()).zza(new DataDeleteRequest(zzali, zzng1, s));
            }

            
            {
                zzalh = zznb.this;
                zzali = datadeleterequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult insertData(GoogleApiClient googleapiclient, DataSet dataset)
    {
        return zza(googleapiclient, dataset, false);
    }

    public PendingResult readDailyTotal(GoogleApiClient googleapiclient, DataType datatype)
    {
        return googleapiclient.zza(new zzlz.zza(googleapiclient, datatype) {

            final zznb zzalh;
            final DataType zzalk;

            protected Result createFailedResult(Status status)
            {
                return zzE(status);
            }

            protected DailyTotalResult zzE(Status status)
            {
                return DailyTotalResult.zzK(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzlz)client);
            }

            protected void zza(zzlz zzlz1)
                throws RemoteException
            {
                Object obj = new zzme.zza(this) {

                    final _cls4 zzall;

                    public void zza(DailyTotalResult dailytotalresult)
                        throws RemoteException
                    {
                        zzall.setResult(dailytotalresult);
                    }

            
            {
                zzall = _pcls4;
                super();
            }
                };
                String s = zzlz1.getContext().getPackageName();
                obj = new DailyTotalRequest(((zzme) (obj)), zzalk, s);
                ((zzmk)zzlz1.zznM()).zza(((DailyTotalRequest) (obj)));
            }

            
            {
                zzalh = zznb.this;
                zzalk = datatype;
                super(googleapiclient);
            }
        });
    }

    public PendingResult readData(GoogleApiClient googleapiclient, DataReadRequest datareadrequest)
    {
        return googleapiclient.zza(new zzlz.zza(googleapiclient, datareadrequest) {

            final zznb zzalh;
            final DataReadRequest zzalj;

            protected Result createFailedResult(Status status)
            {
                return zzD(status);
            }

            protected DataReadResult zzD(Status status)
            {
                return DataReadResult.zza(status, zzalj);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzlz)client);
            }

            protected void zza(zzlz zzlz1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s = zzlz1.getContext().getPackageName();
                ((zzmk)zzlz1.zznM()).zza(new DataReadRequest(zzalj, zza1, s));
            }

            
            {
                zzalh = zznb.this;
                zzalj = datareadrequest;
                super(googleapiclient);
            }
        });
    }
}
