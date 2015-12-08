// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzj;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            zzh, zzg, Status, Api

public class zzd
    implements zzh
{

    private final zzg zzWK;

    public zzd(zzg zzg1)
    {
        zzWK = zzg1;
    }

    private void zza(zzg.zze zze)
        throws DeadObjectException
    {
        zzWK.zzb(zze);
        Api.Client client = zzWK.zza(zze.zzms());
        if (!client.isConnected() && zzWK.zzXv.containsKey(zze.zzms()))
        {
            zze.zzr(new Status(17));
            return;
        } else
        {
            zze.zzb(client);
            return;
        }
    }

    public void begin()
    {
        while (!zzWK.zzXo.isEmpty()) 
        {
            try
            {
                zza((zzg.zze)zzWK.zzXo.remove());
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

    public String getName()
    {
        return "CONNECTED";
    }

    public void onConnected(Bundle bundle)
    {
    }

    public void onConnectionSuspended(int i)
    {
        switch (i)
        {
        default:
            return;

        case 2: // '\002'
            zzaV(i);
            zzWK.connect();
            return;

        case 1: // '\001'
            zzWK.zzmQ();
            zzaV(i);
            return;
        }
    }

    public zza.zza zza(zza.zza zza1)
    {
        return zzb(zza1);
    }

    public void zza(ConnectionResult connectionresult, Api api, int i)
    {
    }

    public void zzaV(int i)
    {
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            zzWK.zzmK();
            zzWK.zzXv.clear();
        } else
        {
            Iterator iterator = zzWK.zzXA.iterator();
            while (iterator.hasNext()) 
            {
                ((zzg.zze)iterator.next()).forceFailureUnlessReady(new Status(8, "The connection to Google Play services was lost"));
            }
        }
        zzWK.zze(null);
        if (!flag)
        {
            zzWK.zzXn.zzbu(i);
        }
        zzWK.zzXn.zznT();
    }

    public zza.zza zzb(zza.zza zza1)
    {
        try
        {
            zza(zza1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            zzaV(1);
            return zza1;
        }
        return zza1;
    }
}
