// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import java.math.BigDecimal;
import java.util.Currency;

// Referenced classes of package com.crashlytics.android.answers:
//            PredefinedEvent, AnswersEventValidator, AnswersAttributes

public class AddToCartEvent extends PredefinedEvent
{

    static final String CURRENCY_ATTRIBUTE = "currency";
    static final String ITEM_ID_ATTRIBUTE = "itemId";
    static final String ITEM_NAME_ATTRIBUTE = "itemName";
    static final String ITEM_PRICE_ATTRIBUTE = "itemPrice";
    static final String ITEM_TYPE_ATTRIBUTE = "itemType";
    static final BigDecimal MICRO_CONSTANT = BigDecimal.valueOf(0xf4240L);
    static final String TYPE = "addToCart";

    public AddToCartEvent()
    {
    }

    String getPredefinedType()
    {
        return "addToCart";
    }

    long priceToMicros(BigDecimal bigdecimal)
    {
        return MICRO_CONSTANT.multiply(bigdecimal).longValue();
    }

    public AddToCartEvent putCurrency(Currency currency)
    {
        if (!validator.isNull(currency, "currency"))
        {
            predefinedAttributes.put("currency", currency.getCurrencyCode());
        }
        return this;
    }

    public AddToCartEvent putItemId(String s)
    {
        predefinedAttributes.put("itemId", s);
        return this;
    }

    public AddToCartEvent putItemName(String s)
    {
        predefinedAttributes.put("itemName", s);
        return this;
    }

    public AddToCartEvent putItemPrice(BigDecimal bigdecimal)
    {
        if (!validator.isNull(bigdecimal, "itemPrice"))
        {
            predefinedAttributes.put("itemPrice", Long.valueOf(priceToMicros(bigdecimal)));
        }
        return this;
    }

    public AddToCartEvent putItemType(String s)
    {
        predefinedAttributes.put("itemType", s);
        return this;
    }

}
