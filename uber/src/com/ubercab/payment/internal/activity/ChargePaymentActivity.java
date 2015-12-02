// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.activity;

import android.os.Bundle;
import com.ubercab.payment.model.PaymentProfile;
import gjz;
import gtu;

// Referenced classes of package com.ubercab.payment.internal.activity:
//            PaymentActivity

public abstract class ChargePaymentActivity extends PaymentActivity
{

    private PaymentProfile a;
    private String b;

    public ChargePaymentActivity()
    {
    }

    public final PaymentProfile c()
    {
        return a;
    }

    public final String d()
    {
        return b;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        a = (PaymentProfile)gjz.a(gtu.a(bundle));
        b = (String)gjz.a(gtu.f(bundle));
    }
}
