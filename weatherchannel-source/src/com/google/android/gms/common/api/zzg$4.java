// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, zzh, Api

class zzXG
    implements ApiClient.OnConnectionFailedListener
{

    final zzg zzXE;
    final Api zzXF;
    final int zzXG;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzg.zza(zzXE).zza(connectionresult, zzXF, zzXG);
    }

    Result(zzg zzg1, Api api, int i)
    {
        zzXE = zzg1;
        zzXF = api;
        zzXG = i;
        super();
    }
}
