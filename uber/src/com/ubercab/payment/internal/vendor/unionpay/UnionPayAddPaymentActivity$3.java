// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.unionpay;

import gpm;
import hsj;

// Referenced classes of package com.ubercab.payment.internal.vendor.unionpay:
//            UnionPayAddPaymentActivity

final class a
    implements gpm
{

    final UnionPayAddPaymentActivity a;

    public final void a(String s)
    {
        UnionPayAddPaymentActivity.d(a);
    }

    public final void a(boolean flag)
    {
        if (!flag)
        {
            UnionPayAddPaymentActivity.c(a).a(UnionPayAddPaymentActivity.b(a));
        }
    }

    public final boolean a(int i)
    {
        return false;
    }

    public final void g_()
    {
        UnionPayAddPaymentActivity.c(a).a(UnionPayAddPaymentActivity.b(a));
    }

    (UnionPayAddPaymentActivity unionpayaddpaymentactivity)
    {
        a = unionpayaddpaymentactivity;
        super();
    }
}
