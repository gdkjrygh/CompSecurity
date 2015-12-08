// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzfu, zzfl

public final class zzfr extends zzfm.zza
{

    private final InAppPurchaseListener zztp;

    public zzfr(InAppPurchaseListener inapppurchaselistener)
    {
        zztp = inapppurchaselistener;
    }

    public void zza(zzfl zzfl)
    {
        zztp.onInAppPurchaseRequested(new zzfu(zzfl));
    }
}
