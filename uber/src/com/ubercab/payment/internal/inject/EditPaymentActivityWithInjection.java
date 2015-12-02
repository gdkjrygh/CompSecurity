// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.inject;

import android.os.Bundle;
import com.ubercab.payment.internal.activity.EditPaymentActivity;

public abstract class EditPaymentActivityWithInjection extends EditPaymentActivity
{

    private Object a;

    public EditPaymentActivityWithInjection()
    {
    }

    public abstract void a(Object obj);

    public abstract Object e();

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (a == null)
        {
            a = e();
        }
        a(a);
    }
}
