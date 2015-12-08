// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.paypal;


// Referenced classes of package com.contextlogic.wish.paypal:
//            PayPalManager

public static interface 
{

    public abstract void onFuturePaymentCancelled();

    public abstract void onFuturePaymentError();

    public abstract void onFuturePaymentSucceeded(String s);

    public abstract void onHideLoadingSpinner();

    public abstract void onShowLoadingSpinner();
}
