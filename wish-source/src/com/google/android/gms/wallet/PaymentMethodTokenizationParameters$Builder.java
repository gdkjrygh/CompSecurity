// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.wallet:
//            PaymentMethodTokenizationParameters

public final class <init>
{

    final PaymentMethodTokenizationParameters zzaJs;

    public <init> addParameter(String s, String s1)
    {
        zzv.zzh(s, "Tokenization parameter name must not be empty");
        zzv.zzh(s1, "Tokenization parameter value must not be empty");
        zzaJs.zzavQ.putString(s, s1);
        return this;
    }

    public PaymentMethodTokenizationParameters build()
    {
        return zzaJs;
    }

    public zzaJs setPaymentMethodTokenizationType(int i)
    {
        zzaJs.zzaJp = i;
        return this;
    }

    private (PaymentMethodTokenizationParameters paymentmethodtokenizationparameters)
    {
        zzaJs = paymentmethodtokenizationparameters;
        super();
    }

    zzaJs(PaymentMethodTokenizationParameters paymentmethodtokenizationparameters, zzaJs zzajs)
    {
        this(paymentmethodtokenizationparameters);
    }
}
