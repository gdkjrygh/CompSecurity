// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.SensorsApi;
import com.google.android.gms.fitness.data.zzj;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzmw, zzmc, zzmn, zzng

public class zzne
    implements SensorsApi
{
    private static interface zza
    {

        public abstract void zzqR();
    }

    private static class zzb extends zzmg.zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(DataSourcesResult datasourcesresult)
        {
            zzOs.zzm(datasourcesresult);
        }

        private zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = zzb1;
        }

    }

    private static class zzc extends zzmu.zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;
        private final zza zzalA;

        public void zzm(Status status)
        {
            if (zzalA != null && status.isSuccess())
            {
                zzalA.zzqR();
            }
            zzOs.zzm(status);
        }

        private zzc(com.google.android.gms.common.api.zza.zzb zzb1, zza zza1)
        {
            zzOs = zzb1;
            zzalA = zza1;
        }

    }


    public zzne()
    {
    }

    private PendingResult zza(GoogleApiClient googleapiclient, zzj zzj, PendingIntent pendingintent, zza zza1)
    {
        return googleapiclient.zzb(new zzmc.zzc(googleapiclient, zza1, zzj, pendingintent) {

            final zzne zzals;
            final zza zzalx;
            final zzj zzaly;
            final PendingIntent zzalz;

            protected Result createFailedResult(Status status)
            {
                return zzb(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmc)client);
            }

            protected void zza(zzmc zzmc1)
                throws RemoteException
            {
                zzc zzc1 = new zzc(this, zzalx);
                String s = zzmc1.getContext().getPackageName();
                ((zzmn)zzmc1.zznM()).zza(new SensorUnregistrationRequest(zzaly, zzalz, zzc1, s));
            }

            protected Status zzb(Status status)
            {
                return status;
            }

            
            {
                zzals = zzne.this;
                zzalx = zza1;
                zzaly = zzj;
                zzalz = pendingintent;
                super(googleapiclient);
            }
        });
    }

    private PendingResult zza(GoogleApiClient googleapiclient, SensorRequest sensorrequest, zzj zzj, PendingIntent pendingintent)
    {
        return googleapiclient.zza(new zzmc.zzc(googleapiclient, sensorrequest, zzj, pendingintent) {

            final zzne zzals;
            final SensorRequest zzalt;
            final zzj zzalu;
            final PendingIntent zzalv;

            protected Result createFailedResult(Status status)
            {
                return zzb(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmc)client);
            }

            protected void zza(zzmc zzmc1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzmc1.getContext().getPackageName();
                ((zzmn)zzmc1.zznM()).zza(new SensorRegistrationRequest(zzalt, zzalu, zzalv, zzng1, s));
            }

            protected Status zzb(Status status)
            {
                return status;
            }

            
            {
                zzals = zzne.this;
                zzalt = sensorrequest;
                zzalu = zzj;
                zzalv = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult add(GoogleApiClient googleapiclient, SensorRequest sensorrequest, PendingIntent pendingintent)
    {
        return zza(googleapiclient, sensorrequest, ((zzj) (null)), pendingintent);
    }

    public PendingResult add(GoogleApiClient googleapiclient, SensorRequest sensorrequest, OnDataPointListener ondatapointlistener)
    {
        return zza(googleapiclient, sensorrequest, com.google.android.gms.fitness.data.zzk.zza.zzqH().zza(ondatapointlistener), ((PendingIntent) (null)));
    }

    public PendingResult findDataSources(GoogleApiClient googleapiclient, DataSourcesRequest datasourcesrequest)
    {
        return googleapiclient.zza(new zzmc.zza(googleapiclient, datasourcesrequest) {

            final DataSourcesRequest zzalr;
            final zzne zzals;

            protected Result createFailedResult(Status status)
            {
                return zzG(status);
            }

            protected DataSourcesResult zzG(Status status)
            {
                return DataSourcesResult.zzL(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmc)client);
            }

            protected void zza(zzmc zzmc1)
                throws RemoteException
            {
                zzb zzb1 = new zzb(this);
                String s = zzmc1.getContext().getPackageName();
                ((zzmn)zzmc1.zznM()).zza(new DataSourcesRequest(zzalr, zzb1, s));
            }

            
            {
                zzals = zzne.this;
                zzalr = datasourcesrequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult remove(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return zza(googleapiclient, ((zzj) (null)), pendingintent, ((zza) (null)));
    }

    public PendingResult remove(GoogleApiClient googleapiclient, OnDataPointListener ondatapointlistener)
    {
        com.google.android.gms.fitness.data.zzk zzk = com.google.android.gms.fitness.data.zzk.zza.zzqH().zzb(ondatapointlistener);
        if (zzk == null)
        {
            return new zzmw(Status.zzXP);
        } else
        {
            return zza(googleapiclient, zzk, ((PendingIntent) (null)), new zza(ondatapointlistener) {

                final zzne zzals;
                final OnDataPointListener zzalw;

                public void zzqR()
                {
                    com.google.android.gms.fitness.data.zzk.zza.zzqH().zzc(zzalw);
                }

            
            {
                zzals = zzne.this;
                zzalw = ondatapointlistener;
                super();
            }
            });
        }
    }
}
