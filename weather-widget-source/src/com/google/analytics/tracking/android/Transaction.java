// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            Item

public class Transaction
{
    public static class Builder
    {

        private String affiliation;
        private String currencyCode;
        private long shippingCostInMicros;
        private final long totalCostInMicros;
        private long totalTaxInMicros;
        private final String transactionId;

        public Transaction build()
        {
            return new Transaction(this);
        }

        public Builder setAffiliation(String s)
        {
            affiliation = s;
            return this;
        }

        Builder setCurrencyCode(String s)
        {
            currencyCode = s;
            return this;
        }

        public Builder setShippingCostInMicros(long l)
        {
            shippingCostInMicros = l;
            return this;
        }

        public Builder setTotalTaxInMicros(long l)
        {
            totalTaxInMicros = l;
            return this;
        }







        public Builder(String s, long l)
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


    private final String affiliation;
    private final String currencyCode;
    private final Map items;
    private final long shippingCostInMicros;
    private final long totalCostInMicros;
    private final long totalTaxInMicros;
    private final String transactionId;

    private Transaction(Builder builder)
    {
        transactionId = builder.transactionId;
        totalCostInMicros = builder.totalCostInMicros;
        affiliation = builder.affiliation;
        totalTaxInMicros = builder.totalTaxInMicros;
        shippingCostInMicros = builder.shippingCostInMicros;
        currencyCode = builder.currencyCode;
        items = new HashMap();
    }


    public void addItem(Item item)
    {
        items.put(item.getProductSKU(), item);
    }

    public String getAffiliation()
    {
        return affiliation;
    }

    String getCurrencyCode()
    {
        return currencyCode;
    }

    public List getItems()
    {
        return new ArrayList(items.values());
    }

    public long getShippingCostInMicros()
    {
        return shippingCostInMicros;
    }

    public long getTotalCostInMicros()
    {
        return totalCostInMicros;
    }

    public long getTotalTaxInMicros()
    {
        return totalTaxInMicros;
    }

    public String getTransactionId()
    {
        return transactionId;
    }
}
