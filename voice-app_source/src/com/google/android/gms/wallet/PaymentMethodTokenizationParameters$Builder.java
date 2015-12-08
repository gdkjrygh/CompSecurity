// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.wallet:
//            PaymentMethodTokenizationParameters

public final class <init>
{

    final PaymentMethodTokenizationParameters zzaRA;

    public <init> addParameter(String s, String s1)
    {
        zzu.zzh(s, "Tokenization parameter name must not be empty");
        zzu.zzh(s1, "Tokenization parameter value must not be empty");
        zzaRA.zzaDN.putString(s, s1);
        return this;
    }

    public PaymentMethodTokenizationParameters build()
    {
        return zzaRA;
    }

    public zzaRA setPaymentMethodTokenizationType(int i)
    {
        zzaRA.zzaRz = i;
        return this;
    }

    private (PaymentMethodTokenizationParameters paymentmethodtokenizationparameters)
    {
        zzaRA = paymentmethodtokenizationparameters;
        super();
    }

    zzaRA(PaymentMethodTokenizationParameters paymentmethodtokenizationparameters, zzaRA zzara)
    {
        this(paymentmethodtokenizationparameters);
    }
}
