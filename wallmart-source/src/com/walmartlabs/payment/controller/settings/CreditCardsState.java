// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;

import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.CreditCardsModel;

class CreditCardsState
{

    private CreditCard mDefault;

    CreditCardsState()
    {
    }

    public CreditCard getDefaultCreditCard()
    {
        if (mDefault == null)
        {
            return CreditCardsModel.get().getDefaultCard();
        } else
        {
            return mDefault;
        }
    }

    public boolean hasChanged()
    {
        return mDefault != null && mDefault != CreditCardsModel.get().getDefaultCard();
    }

    public void setDefaultCreditCard(CreditCard creditcard)
    {
        mDefault = creditcard;
    }
}
