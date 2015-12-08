// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafetyNetApi;

// Referenced classes of package com.google.android.gms.internal:
//            zzpg, zzph, zzpf, zzpk

public class zzpj
    implements SafetyNetApi
{
    static class zza
        implements com.google.android.gms.safetynet.SafetyNetApi.AttestationResult
    {

        private final Status zzOt;
        private final AttestationData zzaJB;

        public String getJwsResult()
        {
            if (zzaJB == null)
            {
                return null;
            } else
            {
                return zzaJB.getJwsResult();
            }
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zza(Status status, AttestationData attestationdata)
        {
            zzOt = status;
            zzaJB = attestationdata;
        }
    }

    static abstract class zzb extends zzpg
    {

        protected zzph zzaJC;

        protected Result createFailedResult(Status status)
        {
            return zzaR(status);
        }

        protected com.google.android.gms.safetynet.SafetyNetApi.AttestationResult zzaR(Status status)
        {
            return new zza(status, null);
        }

        public zzb(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
            zzaJC = new _cls1(this);
        }
    }


    public zzpj()
    {
    }

    public PendingResult attest(GoogleApiClient googleapiclient, byte abyte0[])
    {
        return googleapiclient.zza(new zzb(googleapiclient, abyte0) {

            final zzpj zzaJA;
            final byte zzaJz[];

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzpk)client);
            }

            protected void zza(zzpk zzpk1)
                throws RemoteException
            {
                zzpk1.zza(zzaJC, zzaJz);
            }

            
            {
                zzaJA = zzpj.this;
                zzaJz = abyte0;
                super(googleapiclient);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/internal/zzpj$zzb$1

/* anonymous class */
    class zzb._cls1 extends zzpf
    {

        final zzb zzaJD;

        public void zza(Status status, AttestationData attestationdata)
        {
            zzaJD.setResult(new zza(status, attestationdata));
        }

            
            {
                zzaJD = zzb1;
                super();
            }
    }

}
