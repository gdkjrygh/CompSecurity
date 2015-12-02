// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.ubercab.payment.internal.vendor.unionpay.UnionPayAddPaymentActivity;

public final class gzb
    implements android.view.View.OnFocusChangeListener
{

    final UnionPayAddPaymentActivity a;
    private View b;

    public gzb(UnionPayAddPaymentActivity unionpayaddpaymentactivity, View view)
    {
        a = unionpayaddpaymentactivity;
        super();
        b = view;
    }

    public final void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            UnionPayAddPaymentActivity.c(a).a(b);
        }
    }
}
