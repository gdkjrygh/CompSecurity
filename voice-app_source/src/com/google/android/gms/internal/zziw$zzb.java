// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zziw, zzix

final class zzNZ extends zzNZ
{

    private final String zzNZ;
    final zziw zzOa;

    protected Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.t t)
        throws RemoteException
    {
        zza((zzix)t);
    }

    protected void zza(zzix zzix1)
        throws RemoteException
    {
        zzix1.zzb(new zziy.zza() {

            final zziw.zzb zzOb;

            public void zzc(Status status)
                throws RemoteException
            {
                zzOb.setResult(status);
            }

            
            {
                zzOb = zziw.zzb.this;
                super();
            }
        }, zzNZ);
    }

    protected Status zzb(Status status)
    {
        return status;
    }

    public piClient(zziw zziw1, GoogleApiClient googleapiclient, String s)
    {
        zzOa = zziw1;
        super(googleapiclient);
        zzNZ = s;
    }
}
