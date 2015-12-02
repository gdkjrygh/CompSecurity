// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class PaymentCheckBalanceResponse
{

    Double amount;
    String currencyCode;
    String displayAmount;

    public PaymentCheckBalanceResponse()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PaymentCheckBalanceResponse)obj;
            if (amount == null ? ((PaymentCheckBalanceResponse) (obj)).amount != null : !amount.equals(((PaymentCheckBalanceResponse) (obj)).amount))
            {
                return false;
            }
            if (currencyCode == null ? ((PaymentCheckBalanceResponse) (obj)).currencyCode != null : !currencyCode.equals(((PaymentCheckBalanceResponse) (obj)).currencyCode))
            {
                return false;
            }
            if (displayAmount == null ? ((PaymentCheckBalanceResponse) (obj)).displayAmount != null : !displayAmount.equals(((PaymentCheckBalanceResponse) (obj)).displayAmount))
            {
                return false;
            }
        }
        return true;
    }

    public Double getAmount()
    {
        return amount;
    }

    public String getCurrencyCode()
    {
        return currencyCode;
    }

    public String getDisplayAmount()
    {
        return displayAmount;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (amount != null)
        {
            i = amount.hashCode();
        } else
        {
            i = 0;
        }
        if (displayAmount != null)
        {
            j = displayAmount.hashCode();
        } else
        {
            j = 0;
        }
        if (currencyCode != null)
        {
            k = currencyCode.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }
}
