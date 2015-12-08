// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api:
//            zzi, Status, zzo

class zzaat
    implements ApiClient.OnConnectionFailedListener
{

    final zzi zzaap;
    final zzo zzaat;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzaat.zza(new Status(8));
    }

    Result(zzi zzi1, zzo zzo1)
    {
        zzaap = zzi1;
        zzaat = zzo1;
        super();
    }
}
