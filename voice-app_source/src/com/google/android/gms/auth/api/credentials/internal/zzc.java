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
//            zza, zzd, ICredentialsService, zzb, 
//            SaveRequest, DeleteRequest

public final class zzc
    implements CredentialsApi
{
    private static class zza extends com.google.android.gms.auth.api.credentials.internal.zza
    {

        private com.google.android.gms.common.api.zza.zzb zzPg;

        public void onStatusResult(Status status)
        {
            zzPg.zzm(status);
        }

        zza(com.google.android.gms.common.api.zza.zzb zzb)
        {
            zzPg = zzb;
        }
    }


    public zzc()
    {
    }

    public PendingResult delete(GoogleApiClient googleapiclient, Credential credential)
    {
        return googleapiclient.zzb(new zzd(googleapiclient, credential) {

            final zzc zzPd;
            final Credential zzPf;

            protected Result createFailedResult(Status status)
            {
                return zzb(status);
            }

            protected void zza(Context context, ICredentialsService icredentialsservice)
                throws RemoteException
            {
                icredentialsservice.performCredentialsDeleteOperation(new zza(this), new DeleteRequest(zzPf));
            }

            protected Status zzb(Status status)
            {
                return status;
            }

            
            {
                zzPd = zzc.this;
                zzPf = credential;
                super(googleapiclient);
            }
        });
    }

    public PendingResult disableAutoSignIn(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzd(googleapiclient) {

            final zzc zzPd;

            protected Result createFailedResult(Status status)
            {
                return zzb(status);
            }

            protected void zza(Context context, ICredentialsService icredentialsservice)
                throws RemoteException
            {
                icredentialsservice.performDisableAutoSignInOperation(new zza(this));
            }

            protected Status zzb(Status status)
            {
                return status;
            }

            
            {
                zzPd = zzc.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult request(GoogleApiClient googleapiclient, CredentialRequest credentialrequest)
    {
        return googleapiclient.zza(new zzd(googleapiclient, credentialrequest) {

            final CredentialRequest zzPc;
            final zzc zzPd;

            protected Result createFailedResult(Status status)
            {
                return zzk(status);
            }

            protected void zza(Context context, ICredentialsService icredentialsservice)
                throws RemoteException
            {
                icredentialsservice.performCredentialsRequestOperation(new com.google.android.gms.auth.api.credentials.internal.zza(this) {

                    final _cls1 zzPe;

                    public void onCredentialResult(Status status, Credential credential)
                    {
                        zzPe.setResult(new zzb(status, credential));
                    }

            
            {
                zzPe = _pcls1;
                super();
            }
                }, zzPc);
            }

            protected CredentialRequestResult zzk(Status status)
            {
                return zzb.zzj(status);
            }

            
            {
                zzPd = zzc.this;
                zzPc = credentialrequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult save(GoogleApiClient googleapiclient, Credential credential)
    {
        return googleapiclient.zzb(new zzd(googleapiclient, credential) {

            final zzc zzPd;
            final Credential zzPf;

            protected Result createFailedResult(Status status)
            {
                return zzb(status);
            }

            protected void zza(Context context, ICredentialsService icredentialsservice)
                throws RemoteException
            {
                icredentialsservice.performCredentialsSaveOperation(new zza(this), new SaveRequest(zzPf));
            }

            protected Status zzb(Status status)
            {
                return status;
            }

            
            {
                zzPd = zzc.this;
                zzPf = credential;
                super(googleapiclient);
            }
        });
    }
}
