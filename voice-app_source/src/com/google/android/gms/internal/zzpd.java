// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Moments;
import com.google.android.gms.plus.internal.zze;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;

public final class zzpd
    implements Moments
{
    private static abstract class zza extends com.google.android.gms.plus.Plus.zza
    {

        public Result createFailedResult(Status status)
        {
            return zzaP(status);
        }

        public com.google.android.gms.plus.Moments.LoadMomentsResult zzaP(Status status)
        {
            return new com.google.android.gms.plus.Moments.LoadMomentsResult(this, status) {

                final Status zzOl;
                final zza zzaHJ;

                public MomentBuffer getMomentBuffer()
                {
                    return null;
                }

                public String getNextPageToken()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

                public String getUpdated()
                {
                    return null;
                }

                public void release()
                {
                }

            
            {
                zzaHJ = zza1;
                zzOl = status;
                super();
            }
            };
        }

        private zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class zzb extends com.google.android.gms.plus.Plus.zza
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        private zzb(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class zzc extends com.google.android.gms.plus.Plus.zza
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        private zzc(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public zzpd()
    {
    }

    public PendingResult load(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zza(googleapiclient) {

            final zzpd zzaHC;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            protected void zza(zze zze1)
            {
                zze1.zzi(this);
            }

            
            {
                zzaHC = zzpd.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult load(GoogleApiClient googleapiclient, int i, String s, Uri uri, String s1, String s2)
    {
        return googleapiclient.zza(new zza(googleapiclient, i, s, uri, s1, s2) {

            final zzpd zzaHC;
            final String zzaHD;
            final Uri zzaHE;
            final String zzaHF;
            final String zzaHG;
            final int zzard;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            protected void zza(zze zze1)
            {
                zze1.zza(this, zzard, zzaHD, zzaHE, zzaHF, zzaHG);
            }

            
            {
                zzaHC = zzpd.this;
                zzard = i;
                zzaHD = s;
                zzaHE = uri;
                zzaHF = s1;
                zzaHG = s2;
                super(googleapiclient);
            }
        });
    }

    public PendingResult remove(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, s) {

            final zzpd zzaHC;
            final String zzaHI;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            protected void zza(zze zze1)
            {
                zze1.zzdX(zzaHI);
                setResult(Status.zzXP);
            }

            
            {
                zzaHC = zzpd.this;
                zzaHI = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult write(GoogleApiClient googleapiclient, Moment moment)
    {
        return googleapiclient.zzb(new zzc(googleapiclient, moment) {

            final zzpd zzaHC;
            final Moment zzaHH;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            protected void zza(zze zze1)
            {
                zze1.zza(this, zzaHH);
            }

            
            {
                zzaHC = zzpd.this;
                zzaHH = moment;
                super(googleapiclient);
            }
        });
    }
}
