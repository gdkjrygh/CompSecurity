// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

// Referenced classes of package com.google.android.gms.common.api:
//            zzh, zzg, Api

public class zzf
    implements zzh
{

    private final zzg zzWK;

    public zzf(zzg zzg1)
    {
        zzWK = zzg1;
    }

    public void begin()
    {
        zzWK.zzmL();
    }

    public void connect()
    {
        zzWK.zzmM();
    }

    public String getName()
    {
        return "DISCONNECTED";
    }

    public void onConnected(Bundle bundle)
    {
    }

    public void onConnectionSuspended(int i)
    {
    }

    public zza.zza zza(zza.zza zza1)
    {
        zzWK.zzXo.add(zza1);
        return zza1;
    }

    public void zza(ConnectionResult connectionresult, Api api, int i)
    {
    }

    public void zzaV(int i)
    {
        if (i == -1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            for (Iterator iterator = zzWK.zzXo.iterator(); iterator.hasNext(); ((zzg.zze)iterator.next()).cancel()) { }
            zzWK.zzXo.clear();
            zzWK.zzmK();
            zzWK.zzXv.clear();
        }
    }

    public zza.zza zzb(zza.zza zza1)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
