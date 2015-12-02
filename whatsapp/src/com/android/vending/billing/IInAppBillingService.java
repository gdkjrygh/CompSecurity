// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.vending.billing;

import android.os.Bundle;
import android.os.IInterface;

public interface IInAppBillingService
    extends IInterface
{

    public abstract int consumePurchase(int i, String s, String s1);

    public abstract Bundle getBuyIntent(int i, String s, String s1, String s2, String s3);

    public abstract Bundle getPurchases(int i, String s, String s1, String s2);

    public abstract Bundle getSkuDetails(int i, String s, String s1, Bundle bundle);

    public abstract int isBillingSupported(int i, String s, String s1);
}
