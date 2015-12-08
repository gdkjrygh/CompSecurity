// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.auth.api.credentials.internal:
//            zza, zzb, zzd, zzc, 
//            ICredentialsService

class t> extends zza
{

    final t> zzPe;

    public void onCredentialResult(Status status, Credential credential)
    {
        zzPe.tResult(new zzb(status, credential));
    }

    t>(t> t>)
    {
        zzPe = t>;
        super();
    }

    // Unreferenced inner class com/google/android/gms/auth/api/credentials/internal/zzc$1

/* anonymous class */
    class zzc._cls1 extends zzd
    {

        final CredentialRequest zzPc;
        final zzc zzPd;

        protected Result createFailedResult(Status status)
        {
            return zzk(status);
        }

        protected void zza(Context context, ICredentialsService icredentialsservice)
            throws RemoteException
        {
            icredentialsservice.performCredentialsRequestOperation(new zzc._cls1._cls1(this), zzPc);
        }

        protected CredentialRequestResult zzk(Status status)
        {
            return zzb.zzj(status);
        }

            
            {
                zzPd = zzc1;
                zzPc = credentialrequest;
                super(googleapiclient);
            }
    }

}
