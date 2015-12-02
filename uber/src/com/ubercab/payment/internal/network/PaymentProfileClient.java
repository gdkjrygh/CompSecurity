// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.network;

import com.ubercab.payment.internal.network.model.ValidateCodeRequest;
import com.ubercab.payment.model.PaymentProfile;
import grs;
import retrofit.Callback;

public final class PaymentProfileClient
{

    private final PaymentProfileApi a;

    public PaymentProfileClient(grs grs1)
    {
        a = (PaymentProfileApi)grs1.a(com/ubercab/payment/internal/network/PaymentProfileClient$PaymentProfileApi);
    }

    public final void a(PaymentProfile paymentprofile, String s, Callback callback)
    {
        a.validateCode(paymentprofile.getUuid(), ValidateCodeRequest.create(s), callback);
    }

    public final void a(PaymentProfile paymentprofile, Callback callback)
    {
        a(paymentprofile.getUuid(), callback);
    }

    public final void a(String s, Callback callback)
    {
        a.checkBalance(s, callback);
    }

    public final void b(PaymentProfile paymentprofile, Callback callback)
    {
        a.delete(paymentprofile.getUuid(), callback);
    }

    public final void c(PaymentProfile paymentprofile, Callback callback)
    {
        a.sendCode(paymentprofile.getUuid(), callback);
    }

    private class PaymentProfileApi
    {

        public abstract void checkBalance(String s, Callback callback);

        public abstract void delete(String s, Callback callback);

        public abstract void depositRequest(String s, double d, String s1, Callback callback);

        public abstract void sendCode(String s, Callback callback);

        public abstract void validateCode(String s, ValidateCodeRequest validatecoderequest, Callback callback);
    }

}
