// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzn, zza

class zzpl
    implements Runnable
{

    final WeakReference zzpl;
    final zzn zzpm;

    public void run()
    {
        zzn.zza(zzpm, false);
        zza zza1 = (zza)zzpl.get();
        if (zza1 != null)
        {
            zza1.zzd(zzn.zza(zzpm));
        }
    }

    (zzn zzn1, WeakReference weakreference)
    {
        zzpm = zzn1;
        zzpl = weakreference;
        super();
    }
}
