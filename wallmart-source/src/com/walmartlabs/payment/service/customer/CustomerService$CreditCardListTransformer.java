// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import com.walmartlabs.kangaroo.service.Transformer;
import com.walmartlabs.payment.model.CreditCard;

// Referenced classes of package com.walmartlabs.payment.service.customer:
//            CustomerService, CreditCards

private static class <init>
    implements Transformer
{

    public CreditCard transform(CreditCards creditcards)
    {
        if (creditcards.data != null && creditcards.data.<init> != null && creditcards.data.<init>.length > 0)
        {
            CreditCard creditcard = creditcards.data.<init>[0];
            if (creditcards.hasClientErrorMessage())
            {
                creditcard.error = creditcards.error;
            }
            return creditcard;
        }
        if (creditcards.hasClientErrorMessage())
        {
            CreditCard creditcard1 = new CreditCard();
            creditcard1.error = creditcards.error;
            return creditcard1;
        } else
        {
            return null;
        }
    }

    public volatile Object transform(Object obj)
    {
        return transform((CreditCards)obj);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
