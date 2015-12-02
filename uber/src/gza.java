// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.view.View;
import com.ubercab.payment.internal.vendor.unionpay.UnionPayAddPaymentActivity;
import java.lang.ref.WeakReference;

public final class gza extends hpb
{

    private WeakReference a;
    private gud b;
    private View c;

    public gza(UnionPayAddPaymentActivity unionpayaddpaymentactivity, gud gud1, View view)
    {
        a = new WeakReference(unionpayaddpaymentactivity);
        b = gud1;
        c = view;
    }

    public final void afterTextChanged(Editable editable)
    {
        editable = (UnionPayAddPaymentActivity)a.get();
        if (editable != null && !editable.isFinishing())
        {
            UnionPayAddPaymentActivity.d(editable);
            if (b.b(c))
            {
                gtv.a(c);
            }
        }
    }
}
