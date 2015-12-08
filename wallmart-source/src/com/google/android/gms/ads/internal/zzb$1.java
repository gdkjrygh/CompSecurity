// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Intent;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.internal.zzhj;
import com.google.android.gms.internal.zzip;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzb, zzp, zzq

class zzoy
    implements Runnable
{

    final Intent zzoy;
    final zzb zzoz;

    public void run()
    {
        int i = zzp.zzbH().zzd(zzoy);
        zzp.zzbH();
        if (i == 0 && zzoz.zzos.zzqg != null && zzoz.zzos.zzqg.zzAR != null && zzoz.zzos.zzqg.zzAR.zzgQ() != null)
        {
            zzoz.zzos.zzqg.zzAR.zzgQ().close();
        }
        zzoz.zzos.zzqA = false;
    }

    y.zzd(zzb zzb1, Intent intent)
    {
        zzoz = zzb1;
        zzoy = intent;
        super();
    }
}
