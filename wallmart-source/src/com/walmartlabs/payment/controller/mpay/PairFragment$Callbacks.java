// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import com.walmartlabs.payment.service.payment.Transaction;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            PairFragment

public static interface 
{

    public abstract void onPairingError();

    public abstract void onTransaction(Transaction transaction);
}
