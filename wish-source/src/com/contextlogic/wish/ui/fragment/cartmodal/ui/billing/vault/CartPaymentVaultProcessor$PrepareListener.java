// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;


// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            CartPaymentVaultProcessor

public static interface 
{

    public abstract void onTabPrepareCancelled(CartPaymentVaultProcessor cartpaymentvaultprocessor);

    public abstract void onTabPrepareFailed(CartPaymentVaultProcessor cartpaymentvaultprocessor, String s);

    public abstract void onTabPrepared(CartPaymentVaultProcessor cartpaymentvaultprocessor);
}
