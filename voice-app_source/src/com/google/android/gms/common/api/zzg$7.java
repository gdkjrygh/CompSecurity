// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//            ResultCallback, zzg, Status, zzl, 
//            GoogleApiClient, Result

class zzSA
    implements ResultCallback
{

    final GoogleApiClient zzSA;
    final zzg zzXE;
    final zzl zzXI;
    final boolean zzXJ;

    public void onResult(Result result)
    {
        zzm((Status)result);
    }

    public void zzm(Status status)
    {
        if (status.isSuccess() && zzXE.isConnected())
        {
            zzXE.reconnect();
        }
        zzXI.setResult(status);
        if (zzXJ)
        {
            zzSA.disconnect();
        }
    }

    ApiClient(zzg zzg1, zzl zzl1, boolean flag, GoogleApiClient googleapiclient)
    {
        zzXE = zzg1;
        zzXI = zzl1;
        zzXJ = flag;
        zzSA = googleapiclient;
        super();
    }
}
