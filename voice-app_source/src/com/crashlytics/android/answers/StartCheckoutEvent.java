// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import java.math.BigDecimal;
import java.util.Currency;

// Referenced classes of package com.crashlytics.android.answers:
//            PredefinedEvent, AnswersEventValidator, AnswersAttributes

public class StartCheckoutEvent extends PredefinedEvent
{

    static final String CURRENCY_ATTRIBUTE = "currency";
    static final String ITEM_COUNT_ATTRIBUTE = "itemCount";
    static final BigDecimal MICRO_CONSTANT = BigDecimal.valueOf(0xf4240L);
    static final String TOTAL_PRICE_ATTRIBUTE = "totalPrice";
    static final String TYPE = "startCheckout";

    public StartCheckoutEvent()
    {
    }

    String getPredefinedType()
    {
        return "startCheckout";
    }

    long priceToMicros(BigDecimal bigdecimal)
    {
        return MICRO_CONSTANT.multiply(bigdecimal).longValue();
    }

    public StartCheckoutEvent putCurrency(Currency currency)
    {
        if (!validator.isNull(currency, "currency"))
        {
            predefinedAttributes.put("currency", currency.getCurrencyCode());
        }
        return this;
    }

    public StartCheckoutEvent putItemCount(int i)
    {
        predefinedAttributes.put("itemCount", Integer.valueOf(i));
        return this;
    }

    public StartCheckoutEvent putTotalPrice(BigDecimal bigdecimal)
    {
        if (!validator.isNull(bigdecimal, "totalPrice"))
        {
            predefinedAttributes.put("totalPrice", Long.valueOf(priceToMicros(bigdecimal)));
        }
        return this;
    }

}
