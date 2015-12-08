// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import org.apache.commons.lang3.text.WordUtils;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceipt

public static class 
{

    private static final SpannableString EMPTY_STRING = new SpannableString("");
    public boolean coupon;
    public String lineNumber;
    public String name;
    public String nameOnReceipt;
    public String normalizedUpc;
    public int originalOrder;
    public int price;
    public String productId;
    public String productImageUrl;
    public float quantity;
    public String rawText;
    public boolean storeItemLookup;
    public int unitPrice;
    public int unitQuantity;
    public String unitType;
    public String upc;
    public String verticalPixel;

    public Spanned getDisplayName()
    {
        String s;
        Object obj;
        if (TextUtils.isEmpty(name) || name.equals(nameOnReceipt))
        {
            s = nameOnReceipt;
        } else
        if (name.matches("^[^a-z]*$"))
        {
            s = WordUtils.capitalizeFully(name);
        } else
        {
            s = name;
        }
        obj = EMPTY_STRING;
        if (!TextUtils.isEmpty(s))
        {
            obj = Html.fromHtml(s);
        }
        return ((Spanned) (obj));
    }

    public int getPrice()
    {
        return price;
    }

    public float getPriceInDollar()
    {
        return (float)getPrice() * 0.01F;
    }

    public int getUnitPrice()
    {
        return unitPrice;
    }

    public float getUnitPriceInDollar()
    {
        return (float)getUnitPrice() * 0.01F;
    }

    public boolean hasProductId()
    {
        return !TextUtils.isEmpty(productId);
    }

    public boolean hasProductImageUrl()
    {
        return !TextUtils.isEmpty(productImageUrl);
    }


    public ()
    {
    }
}
