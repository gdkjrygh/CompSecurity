// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;

// Referenced classes of package com.google.android.gms.internal:
//            zzpg, zzpj, zzph, zzpf

static abstract class ionData extends zzpg
{

    protected zzph zzaJC;

    protected Result createFailedResult(Status status)
    {
        return zzaR(status);
    }

    protected com.google.android.gms.safetynet.Api.AttestationResult zzaR(Status status)
    {
        return new <init>(status, null);
    }

    public piClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
        zzaJC = new zzpf() {

            final zzpj.zzb zzaJD;

            public void zza(Status status, AttestationData attestationdata)
            {
                zzaJD.setResult(new zzpj.zza(status, attestationdata));
            }

            
            {
                zzaJD = zzpj.zzb.this;
                super();
            }
        };
    }
}
