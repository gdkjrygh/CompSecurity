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

    private zzf zzaGD;
    private final com.google.android.gms.internal.zzoz.zza zzaGN;
    private boolean zzaGO;

    public zzd(com.google.android.gms.internal.zzoz.zza zza1)
    {
        zzaGN = zza1;
        zzaGD = null;
        zzaGO = true;
    }

    public void onConnected(Bundle bundle)
    {
        zzaGD.zzak(false);
        if (zzaGO && zzaGN != null)
        {
            zzaGN.zzxl();
        }
        zzaGO = false;
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzaGD.zzak(true);
        if (zzaGO && zzaGN != null)
        {
            if (connectionresult.hasResolution())
            {
                zzaGN.zzf(connectionresult.getResolution());
            } else
            {
                zzaGN.zzxm();
            }
        }
        zzaGO = false;
    }

    public void onConnectionSuspended(int i)
    {
        zzaGD.zzak(true);
    }

    public void zza(zzf zzf1)
    {
        zzaGD = zzf1;
    }

    public void zzaj(boolean flag)
    {
        zzaGO = flag;
    }
}
