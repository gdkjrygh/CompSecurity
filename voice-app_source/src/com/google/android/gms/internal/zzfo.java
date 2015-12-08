// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzfm, zzfi

public final class zzfo extends zzfj.zza
{

    private final PlayStorePurchaseListener zzsX;

    public zzfo(PlayStorePurchaseListener playstorepurchaselistener)
    {
        zzsX = playstorepurchaselistener;
    }

    public boolean isValidPurchase(String s)
    {
        return zzsX.isValidPurchase(s);
    }

    public void zza(zzfi zzfi)
    {
        zzsX.onInAppPurchaseFinished(new zzfm(zzfi));
    }
}
