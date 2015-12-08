// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzg, zza

class zznG
    implements Runnable
{

    final WeakReference zznG;
    final zzg zznH;

    public void run()
    {
        zzg.zza(zznH, false);
        zza zza1 = (zza)zznG.get();
        if (zza1 != null)
        {
            zza1.zzb(zzg.zza(zznH));
        }
    }

    (zzg zzg1, WeakReference weakreference)
    {
        zznH = zzg1;
        zznG = weakreference;
        super();
    }
}
