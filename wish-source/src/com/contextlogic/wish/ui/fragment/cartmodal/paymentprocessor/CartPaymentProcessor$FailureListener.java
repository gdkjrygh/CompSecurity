// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            CartPaymentProcessor

public static interface 
{

    public abstract void onCancel(CartPaymentProcessor cartpaymentprocessor);

    public abstract void onFailure(CartPaymentProcessor cartpaymentprocessor, Bundle bundle);
}
