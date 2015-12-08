// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zze;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

public final class zzpe
    implements People
{
    private static abstract class zza extends com.google.android.gms.plus.Plus.zza
    {

        public Result createFailedResult(Status status)
        {
            return zzaQ(status);
        }

        public com.google.android.gms.plus.People.LoadPeopleResult zzaQ(Status status)
        {
            return new com.google.android.gms.plus.People.LoadPeopleResult(this, status) {

                final Status zzOl;
                final zza zzaHO;

                public String getNextPageToken()
                {
                    return null;
                }

                public PersonBuffer getPersonBuffer()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzaHO = zza1;
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


    public zzpe()
    {
    }

    public Person getCurrentPerson(GoogleApiClient googleapiclient)
    {
        return Plus.zzf(googleapiclient, true).zzxu();
    }

    public PendingResult load(GoogleApiClient googleapiclient, Collection collection)
    {
        return googleapiclient.zza(new zza(googleapiclient, collection) {

            final zzpe zzaHL;
            final Collection zzaHM;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            protected void zza(zze zze1)
            {
                zze1.zza(this, zzaHM);
            }

            
            {
                zzaHL = zzpe.this;
                zzaHM = collection;
                super(googleapiclient);
            }
        });
    }

    public transient PendingResult load(GoogleApiClient googleapiclient, String as[])
    {
        return googleapiclient.zza(new zza(googleapiclient, as) {

            final zzpe zzaHL;
            final String zzaHN[];

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            protected void zza(zze zze1)
            {
                zze1.zzd(this, zzaHN);
            }

            
            {
                zzaHL = zzpe.this;
                zzaHN = as;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadConnected(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zza(googleapiclient) {

            final zzpe zzaHL;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            protected void zza(zze zze1)
            {
                zze1.zzj(this);
            }

            
            {
                zzaHL = zzpe.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadVisible(GoogleApiClient googleapiclient, int i, String s)
    {
        return googleapiclient.zza(new zza(googleapiclient, i, s) {

            final String zzaHD;
            final int zzaHK;
            final zzpe zzaHL;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            protected void zza(zze zze1)
            {
                setCancelToken(zze1.zza(this, zzaHK, zzaHD));
            }

            
            {
                zzaHL = zzpe.this;
                zzaHK = i;
                zzaHD = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadVisible(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new zza(googleapiclient, s) {

            final String zzaHD;
            final zzpe zzaHL;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            protected void zza(zze zze1)
            {
                setCancelToken(zze1.zzq(this, zzaHD));
            }

            
            {
                zzaHL = zzpe.this;
                zzaHD = s;
                super(googleapiclient);
            }
        });
    }
}
