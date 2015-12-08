// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, zzh, Api

class zzQL
    implements ApiClient.OnConnectionFailedListener
{

    final zzg zzQJ;
    final Api zzQK;
    final int zzQL;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzg.zza(zzQJ).zza(connectionresult, zzQK, zzQL);
    }

    Result(zzg zzg1, Api api, int i)
    {
        zzQJ = zzg1;
        zzQK = api;
        zzQL = i;
        super();
    }
}
