// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

// Referenced classes of package com.google.android.gms.common.api:
//            zzj, zzi, Api

public class zzh
    implements zzj
{

    private final zzi zzZq;

    public zzh(zzi zzi1)
    {
        zzZq = zzi1;
    }

    public void begin()
    {
        zzZq.zzny();
        zzZq.zzaah = Collections.emptySet();
    }

    public void connect()
    {
        zzZq.zznz();
    }

    public void disconnect()
    {
        for (Iterator iterator = zzZq.zzZZ.iterator(); iterator.hasNext(); ((zzi.zze)iterator.next()).cancel()) { }
        zzZq.zzZZ.clear();
        zzZq.zzaag.clear();
        zzZq.zznx();
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

    public zzc.zza zza(zzc.zza zza1)
    {
        zzZq.zzZZ.add(zza1);
        return zza1;
    }

    public void zza(ConnectionResult connectionresult, Api api, int i)
    {
    }

    public zzc.zza zzb(zzc.zza zza1)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
