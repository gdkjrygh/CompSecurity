// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.purchase;


// Referenced classes of package com.google.android.gms.ads.purchase:
//            InAppPurchaseResult

public interface PlayStorePurchaseListener
{

    public abstract boolean isValidPurchase(String s);

    public abstract void onInAppPurchaseFinished(InAppPurchaseResult inapppurchaseresult);
}
