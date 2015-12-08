// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Intent;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.internal.zzfa;
import com.google.android.gms.internal.zzgd;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zza, zzh

class zzmE
    implements Runnable
{

    final zza zzmD;
    final Intent zzmE;

    public void run()
    {
        int i = zzh.zzaZ().zzd(zzmE);
        zzh.zzaZ();
        if (i == 0 && zza.zza(zzmD).zzmQ != null && zza.zza(zzmD).zzmQ.zzwz != null && zza.zza(zzmD).zzmQ.zzwz.zzfr() != null)
        {
            zza.zza(zzmD).zzmQ.zzwz.zzfr().close();
        }
        zza.zza(zzmD).zzne = false;
    }

    y.zzc(zza zza1, Intent intent)
    {
        zzmD = zza1;
        zzmE = intent;
        super();
    }
}
