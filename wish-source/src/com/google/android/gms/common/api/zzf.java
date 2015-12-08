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

    private final zzg zzPQ;

    public zzf(zzg zzg1)
    {
        zzPQ = zzg1;
    }

    public void begin()
    {
        zzPQ.zzkX();
    }

    public void connect()
    {
        zzPQ.zzkY();
    }

    public String getName()
    {
        return "DISCONNECTED";
    }

    public void onConnected(Bundle bundle)
    {
    }

    public zza.zza zza(zza.zza zza1)
    {
        zzPQ.zzQt.add(zza1);
        return zza1;
    }

    public void zza(ConnectionResult connectionresult, Api api, int i)
    {
    }

    public void zzas(int i)
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
            for (Iterator iterator = zzPQ.zzQt.iterator(); iterator.hasNext(); ((zzg.zze)iterator.next()).cancel()) { }
            zzPQ.zzQt.clear();
            zzPQ.zzkW();
            zzPQ.zzQA.clear();
        }
    }

    public zza.zza zzb(zza.zza zza1)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
