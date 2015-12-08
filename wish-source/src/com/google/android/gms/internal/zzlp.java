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

public final class zzlp
    implements People
{
    private static abstract class zza extends com.google.android.gms.plus.Plus.zza
    {

        public Result createFailedResult(Status status)
        {
            return zzaK(status);
        }

        public com.google.android.gms.plus.People.LoadPeopleResult zzaK(Status status)
        {
            return new com.google.android.gms.plus.People.LoadPeopleResult(this, status) {

                final Status zzKj;
                final zza zzazB;

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
                    return zzKj;
                }

                public void release()
                {
                }

            
            {
                zzazB = zza1;
                zzKj = status;
                super();
            }
            };
        }

        private zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public zzlp()
    {
    }

    public Person getCurrentPerson(GoogleApiClient googleapiclient)
    {
        return Plus.zzf(googleapiclient, true).zzvw();
    }

    public PendingResult loadVisible(GoogleApiClient googleapiclient, int i, String s)
    {
        return googleapiclient.zza(new zza(googleapiclient, i, s) {

            final String zzazq;
            final int zzazx;
            final zzlp zzazy;

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            protected void zza(zze zze1)
            {
                setCancelToken(zze1.zza(this, zzazx, zzazq));
            }

            
            {
                zzazy = zzlp.this;
                zzazx = i;
                zzazq = s;
                super(googleapiclient);
            }
        });
    }
}
