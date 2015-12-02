// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.activity;

import android.os.Bundle;
import com.ubercab.payment.model.PaymentError;
import com.ubercab.payment.model.PaymentProfile;
import gjz;
import gtu;

// Referenced classes of package com.ubercab.payment.internal.activity:
//            PaymentActivity

public abstract class HandlePaymentErrorActivity extends PaymentActivity
{

    private PaymentError a;
    private PaymentProfile b;

    public HandlePaymentErrorActivity()
    {
    }

    public final PaymentError c()
    {
        return a;
    }

    public final PaymentProfile d()
    {
        return b;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = (PaymentError)gjz.a(gtu.l(getIntent()));
        b = (PaymentProfile)gjz.a(gtu.a(getIntent()));
    }
}
