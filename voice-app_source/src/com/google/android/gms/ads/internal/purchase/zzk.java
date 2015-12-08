// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzhl;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzi, zzl

public class zzk
{

    private final String zzsU;

    public zzk(String s)
    {
        zzsU = s;
    }

    public boolean zza(String s, int i, Intent intent)
    {
        if (s != null && intent != null)
        {
            String s1 = zzo.zzbF().zze(intent);
            intent = zzo.zzbF().zzf(intent);
            if (s1 != null && intent != null)
            {
                if (!s.equals(zzo.zzbF().zzai(s1)))
                {
                    zzb.zzaC("Developer payload not match.");
                    return false;
                }
                if (zzsU != null && !zzl.zzc(zzsU, s1, intent))
                {
                    zzb.zzaC("Fail to verify signature.");
                    return false;
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String zzfi()
    {
        return zzo.zzbv().zzgn();
    }
}
