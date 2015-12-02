// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class PaymentDepositRequestResponse
{

    String data;
    String url;

    public PaymentDepositRequestResponse()
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
            obj = (PaymentDepositRequestResponse)obj;
            if (data == null ? ((PaymentDepositRequestResponse) (obj)).data != null : !data.equals(((PaymentDepositRequestResponse) (obj)).data))
            {
                return false;
            }
            if (url == null ? ((PaymentDepositRequestResponse) (obj)).url != null : !url.equals(((PaymentDepositRequestResponse) (obj)).url))
            {
                return false;
            }
        }
        return true;
    }

    public String getData()
    {
        return data;
    }

    public String getUrl()
    {
        return url;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (data != null)
        {
            i = data.hashCode();
        } else
        {
            i = 0;
        }
        if (url != null)
        {
            j = url.hashCode();
        }
        return i * 31 + j;
    }
}
