// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import com.walmartlabs.kangaroo.service.Transformer;
import com.walmartlabs.payment.model.GiftCard;

// Referenced classes of package com.walmartlabs.payment.service.customer:
//            CustomerService, GiftCardResponse

private static class <init>
    implements Transformer
{

    public GiftCard transform(GiftCardResponse giftcardresponse)
    {
        if (giftcardresponse.data != null && giftcardresponse.data.<init> != null && giftcardresponse.data.<init>.length > 0)
        {
            GiftCard giftcard = giftcardresponse.data.<init>[0];
            if (giftcardresponse.hasClientErrorMessage())
            {
                giftcard.error = giftcardresponse.error;
            }
            return giftcard;
        }
        if (giftcardresponse.hasClientErrorMessage())
        {
            GiftCard giftcard1 = new GiftCard();
            giftcard1.error = giftcardresponse.error;
            return giftcard1;
        } else
        {
            return null;
        }
    }

    public volatile Object transform(Object obj)
    {
        return transform((GiftCardResponse)obj);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
