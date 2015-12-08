// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            zzf

public class zzd
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

    private zzf zzaKE;
    private final com.google.android.gms.internal.zzpm.zza zzaKP;
    private boolean zzaKQ;

    public zzd(com.google.android.gms.internal.zzpm.zza zza1)
    {
        zzaKP = zza1;
        zzaKE = null;
        zzaKQ = true;
    }

    public void onConnected(Bundle bundle)
    {
        zzaKE.zzao(false);
        if (zzaKQ && zzaKP != null)
        {
            zzaKP.zzyA();
        }
        zzaKQ = false;
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzaKE.zzao(true);
        if (zzaKQ && zzaKP != null)
        {
            if (connectionresult.hasResolution())
            {
                zzaKP.zzh(connectionresult.getResolution());
            } else
            {
                zzaKP.zzyB();
            }
        }
        zzaKQ = false;
    }

    public void onConnectionSuspended(int i)
    {
        zzaKE.zzao(true);
    }

    public void zza(zzf zzf1)
    {
        zzaKE = zzf1;
    }

    public void zzan(boolean flag)
    {
        zzaKQ = flag;
    }
}
