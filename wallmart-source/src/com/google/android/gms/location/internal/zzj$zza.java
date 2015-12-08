// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.location.LocationStatusCodes;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzj

private static final class zzaCS extends zzaCS
{

    private com.google.android.gms.common.api.zj.zza zzaCS;

    public void zza(int i, PendingIntent pendingintent)
    {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
    }

    public void zza(int i, String as[])
    {
        if (zzaCS == null)
        {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
            return;
        } else
        {
            as = LocationStatusCodes.zzgN(LocationStatusCodes.zzgM(i));
            zzaCS.zzn(as);
            zzaCS = null;
            return;
        }
    }

    public void zzb(int i, String as[])
    {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
    }

    public es(com.google.android.gms.common.api.zj.zza zza1)
    {
        zzaCS = zza1;
    }
}
