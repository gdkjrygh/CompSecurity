// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.signin.zzd;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, zzi, zzj

private class zzZT extends zzZT
{

    final zzg zzZK;
    private final Map zzZT;

    public void zznn()
    {
        int i = zzg.zzb(zzZK).isGooglePlayServicesAvailable(zzg.zza(zzZK));
        if (i != 0)
        {
            ConnectionResult connectionresult = new ConnectionResult(i, null);
            com.google.android.gms.common.api.zzg.zzd(zzZK).zza(new zzi.zzb(zzZK, connectionresult) {

                final ConnectionResult zzZU;
                final zzg.zze zzZV;

                public void zznn()
                {
                    zzg.zza(zzZV.zzZK, zzZU);
                }

            
            {
                zzZV = zzg.zze.this;
                zzZU = connectionresult;
                super(zzj);
            }
            });
        } else
        {
            if (zzg.zze(zzZK))
            {
                zzg.zzf(zzZK).connect();
            }
            Iterator iterator = zzZT.keySet().iterator();
            while (iterator.hasNext()) 
            {
                sult sult = (zzZT)iterator.next();
                sult.zza((iClient.zza)zzZT.get(sult));
            }
        }
    }

    public <init>(zzg zzg1, Map map)
    {
        zzZK = zzg1;
        super(zzg1, null);
        zzZT = map;
    }
}
