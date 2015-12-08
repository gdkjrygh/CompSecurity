// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import android.text.TextUtils;

// Referenced classes of package com.walmart.android.service.item:
//            ItemDataConverter

private static class productImageUrl extends productImageUrl
{

    public ( )
    {
        int i;
        i = 0;
        super();
        if (.. != null)
        {
            mPriceModifierCents = Math.round(.mPriceModifierCents.mPriceModifierCents.mPriceModifierCents * 100F);
            if (.mPriceModifierCents.mPriceModifierCents.mPriceModifierCents != null)
            {
                mCurrencyAmountCents = Math.round(Float.parseFloat(.mCurrencyAmountCents.mCurrencyAmountCents.mCurrencyAmountCents.nt) * 100F);
            }
            isAvailable = .isAvailable.isAvailable.isAvailable;
        }
        itemId = .itemId.itemId;
        itemName = .itemName.itemName;
        float f;
        String s;
        int j;
        boolean flag;
        if (.itemName.itemName != null)
        {
            f = .itemName.itemName.;
        } else
        {
            f = 0.0F;
        }
        customerRating = f;
        if (.customerRating.customerRating != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isVariant = flag;
        ranking = .ex;
        quantity = .quantity;
        if (.quantity.quantity != null)
        {
            s = .quantity.quantity.quantity;
        } else
        {
            s = null;
        }
        offerId = s;
        if (.offerId.offerId == null) goto _L2; else goto _L1
_L1:
         = .offerId.offerId;
        j = .length;
_L7:
        if (i >= j) goto _L2; else goto _L3
_L3:
        s = [i];
        if (TextUtils.isEmpty(((offerId) (s)).offerId.offerId)) goto _L5; else goto _L4
_L4:
        productImageUrl = ((productImageUrl) (s)).productImageUrl.productImageUrl;
_L2:
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
