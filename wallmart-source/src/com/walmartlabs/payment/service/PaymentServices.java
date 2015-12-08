// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service;

import com.walmartlabs.payment.service.customer.CustomerService;

public abstract class PaymentServices
{

    private static PaymentServices sInstance;

    public PaymentServices()
    {
    }

    public static PaymentServices get()
    {
        return sInstance;
    }

    public static void set(PaymentServices paymentservices)
    {
        if (sInstance != null)
        {
            sInstance.destroy();
        }
        sInstance = paymentservices;
        sInstance.init();
    }

    public void destroy()
    {
    }

    public abstract CustomerService getCustomerService();

    protected void init()
    {
    }
}
