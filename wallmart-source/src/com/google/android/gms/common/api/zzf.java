// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzk;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            zzj, zzi, Status, Api

public class zzf
    implements zzj
{

    private final zzi zzZq;

    public zzf(zzi zzi1)
    {
        zzZq = zzi1;
    }

    private void zza(zzi.zze zze)
        throws DeadObjectException
    {
        zzZq.zzb(zze);
        Api.zzb zzb1 = zzZq.zza(zze.zznd());
        if (!zzb1.isConnected() && zzZq.zzaag.containsKey(zze.zznd()))
        {
            zze.zzx(new Status(17));
            return;
        } else
        {
            zze.zzb(zzb1);
            return;
        }
    }

    public void begin()
    {
        while (!zzZq.zzZZ.isEmpty()) 
        {
            try
            {
                zza((zzi.zze)zzZq.zzZZ.remove());
            }
            catch (DeadObjectException deadobjectexception)
            {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", deadobjectexception);
            }
        }
    }

    public void connect()
    {
    }

    public void disconnect()
    {
        zzZq.zzaag.clear();
        zzZq.zznx();
        zzZq.zzg(null);
        zzZq.zzZY.zzoI();
    }

    public String getName()
    {
        return "CONNECTED";
    }

    public void onConnected(Bundle bundle)
    {
    }

    public void onConnectionSuspended(int i)
    {
        if (i == 1)
        {
            zzZq.zznD();
        }
        for (Iterator iterator = zzZq.zzaal.iterator(); iterator.hasNext(); ((zzi.zze)iterator.next()).zzw(new Status(8, "The connection to Google Play services was lost"))) { }
        zzZq.zzg(null);
        zzZq.zzZY.zzbB(i);
        zzZq.zzZY.zzoI();
        if (i == 2)
        {
            zzZq.connect();
        }
    }

    public zzc.zza zza(zzc.zza zza1)
    {
        return zzb(zza1);
    }

    public void zza(ConnectionResult connectionresult, Api api, int i)
    {
    }

    public zzc.zza zzb(zzc.zza zza1)
    {
        try
        {
            zza(zza1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            zzZq.zza(new zzi.zzb(this) {

                final zzf zzZr;

                public void zznn()
                {
                    zzZr.onConnectionSuspended(1);
                }

            
            {
                zzZr = zzf.this;
                super(zzj1);
            }
            });
            return zza1;
        }
        return zza1;
    }
}
