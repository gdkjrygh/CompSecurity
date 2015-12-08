// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;

// Referenced classes of package com.google.android.gms.internal:
//            zzpf, zzpj

class  extends zzpf
{

    final nData zzaJD;

    public void zza(Status status, AttestationData attestationdata)
    {
        zzaJD.tResult(new nit>(status, attestationdata));
    }

    nData(nData ndata)
    {
        zzaJD = ndata;
        super();
    }
}
