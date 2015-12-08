// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.auth.api.credentials.internal:
//            zza, zzd, zzh, zzb, 
//            SaveRequest, DeleteRequest

public final class zzc
    implements CredentialsApi
{
    private static class zza extends com.google.android.gms.auth.api.credentials.internal.zza
    {

        private com.google.android.gms.common.api.zzb zzRC;

        public void zzl(Status status)
        {
            zzRC.zzn(status);
        }

        zza(com.google.android.gms.common.api.zzb zzb)
        {
            zzRC = zzb;
        }
    }


    public zzc()
    {
    }

    public PendingResult delete(GoogleApiClient googleapiclient, Credential credential)
    {
        return googleapiclient.zzb(new zzd(googleapiclient, credential) {

            final Credential zzRB;
            final zzc zzRz;

            protected void zza(Context context, zzh zzh1)
                throws RemoteException
            {
                zzh1.zza(new zza(this), new DeleteRequest(zzRB));
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
                zzRz = zzc.this;
                zzRB = credential;
                super(googleapiclient);
            }
        });
    }

    public PendingResult disableAutoSignIn(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzd(googleapiclient) {

            final zzc zzRz;

            protected void zza(Context context, zzh zzh1)
                throws RemoteException
            {
                zzh1.zza(new zza(this));
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
                zzRz = zzc.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult request(GoogleApiClient googleapiclient, CredentialRequest credentialrequest)
    {
        return googleapiclient.zza(new zzd(googleapiclient, credentialrequest) {

            final CredentialRequest zzRy;
            final zzc zzRz;

            protected void zza(Context context, zzh zzh1)
                throws RemoteException
            {
                zzh1.zza(new com.google.android.gms.auth.api.credentials.internal.zza(this) {

                    final _cls1 zzRA;

                    public void zza(Status status, Credential credential)
                    {
                        zzRA.zza(new zzb(status, credential));
                    }

            
            {
                zzRA = _pcls1;
                super();
            }
                }, zzRy);
            }

            protected Result zzb(Status status)
            {
                return zzn(status);
            }

            protected CredentialRequestResult zzn(Status status)
            {
                return com.google.android.gms.auth.api.credentials.internal.zzb.zzm(status);
            }

            
            {
                zzRz = zzc.this;
                zzRy = credentialrequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult save(GoogleApiClient googleapiclient, Credential credential)
    {
        return googleapiclient.zzb(new zzd(googleapiclient, credential) {

            final Credential zzRB;
            final zzc zzRz;

            protected void zza(Context context, zzh zzh1)
                throws RemoteException
            {
                zzh1.zza(new zza(this), new SaveRequest(zzRB));
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
                zzRz = zzc.this;
                zzRB = credential;
                super(googleapiclient);
            }
        });
    }
}
