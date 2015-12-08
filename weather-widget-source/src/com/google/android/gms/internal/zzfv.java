// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzft, zzfp

public final class zzfv extends zzfq.zza
{

    private final PlayStorePurchaseListener zztq;

    public zzfv(PlayStorePurchaseListener playstorepurchaselistener)
    {
        zztq = playstorepurchaselistener;
    }

    public boolean isValidPurchase(String s)
    {
        return zztq.isValidPurchase(s);
    }

    public void zza(zzfp zzfp)
    {
        zztq.onInAppPurchaseFinished(new zzft(zzfp));
    }
}
