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
//            zzh

class t> extends zza
{

    final t> zzRA;

    public void zza(Status status, Credential credential)
    {
        zzRA.a(new zzb(status, credential));
    }

    t>(t> t>)
    {
        zzRA = t>;
        super();
    }

    // Unreferenced inner class com/google/android/gms/auth/api/credentials/internal/zzc$1

/* anonymous class */
    class zzc._cls1 extends zzd
    {

        final CredentialRequest zzRy;
        final zzc zzRz;

        protected void zza(Context context, zzh zzh1)
            throws RemoteException
        {
            zzh1.zza(new zzc._cls1._cls1(this), zzRy);
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
                zzRz = zzc1;
                zzRy = credentialrequest;
                super(googleapiclient);
            }
    }

}
