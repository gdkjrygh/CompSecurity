// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzg

class zzxb
    implements Runnable
{

    private final WeakReference zzxa;
    final zzg zzxb;
    final dR zzxc;

    public void run()
    {
        zzg zzg1 = (zzg)zzxa.get();
        if (!a(zzxc) && zzg1 != null)
        {
            zzg1.zzdI();
            zzxc.dR();
        }
    }

    ( , zzg zzg1)
    {
        zzxc = ;
        zzxb = zzg1;
        super();
        zzxa = new WeakReference(zzxb);
    }
}
