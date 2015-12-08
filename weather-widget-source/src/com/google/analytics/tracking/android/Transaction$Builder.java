// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.text.TextUtils;

// Referenced classes of package com.google.analytics.tracking.android:
//            Transaction

public static class totalCostInMicros
{

    private String affiliation;
    private String currencyCode;
    private long shippingCostInMicros;
    private final long totalCostInMicros;
    private long totalTaxInMicros;
    private final String transactionId;

    public Transaction build()
    {
        return new Transaction(this, null);
    }

    public totalCostInMicros setAffiliation(String s)
    {
        affiliation = s;
        return this;
    }

    affiliation setCurrencyCode(String s)
    {
        currencyCode = s;
        return this;
    }

    public currencyCode setShippingCostInMicros(long l)
    {
        shippingCostInMicros = l;
        return this;
    }

    public shippingCostInMicros setTotalTaxInMicros(long l)
    {
        totalTaxInMicros = l;
        return this;
    }







    public (String s, long l)
    {
        affiliation = null;
        totalTaxInMicros = 0L;
        shippingCostInMicros = 0L;
        currencyCode = null;
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("transactionId must not be empty or null");
        } else
        {
            transactionId = s;
            totalCostInMicros = l;
            return;
        }
    }
}
