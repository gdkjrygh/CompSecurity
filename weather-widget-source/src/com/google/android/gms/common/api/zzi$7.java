// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//            ResultCallback, zzi, Status, zzo, 
//            GoogleApiClient, Result

class zzVc
    implements ResultCallback
{

    final GoogleApiClient zzVc;
    final zzi zzaap;
    final zzo zzaat;
    final boolean zzaau;

    public void onResult(Result result)
    {
        zzr((Status)result);
    }

    public void zzr(Status status)
    {
        if (status.isSuccess() && zzaap.isConnected())
        {
            zzaap.reconnect();
        }
        zzaat.zza(status);
        if (zzaau)
        {
            zzVc.disconnect();
        }
    }

    ApiClient(zzi zzi1, zzo zzo1, boolean flag, GoogleApiClient googleapiclient)
    {
        zzaap = zzi1;
        zzaat = zzo1;
        zzaau = flag;
        zzVc = googleapiclient;
        super();
    }
}
