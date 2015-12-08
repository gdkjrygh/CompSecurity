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

    private com.google.android.gms.common.api.zj.zzb.zzgQ zzaCS;

    private void zzgQ(int i)
    {
        if (zzaCS == null)
        {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
            return;
        } else
        {
            com.google.android.gms.common.api.Status status = LocationStatusCodes.zzgN(LocationStatusCodes.zzgM(i));
            zzaCS.zzn(status);
            zzaCS = null;
            return;
        }
    }

    public void zza(int i, PendingIntent pendingintent)
    {
        zzgQ(i);
    }

    public void zza(int i, String as[])
    {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
    }

    public void zzb(int i, String as[])
    {
        zzgQ(i);
    }

    public es(com.google.android.gms.common.api.zj.zzb zzb1)
    {
        zzaCS = zzb1;
    }
}
