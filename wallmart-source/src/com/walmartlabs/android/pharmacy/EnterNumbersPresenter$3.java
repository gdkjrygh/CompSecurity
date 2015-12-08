// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import com.walmartlabs.android.pharmacy.service.Cart;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            EnterNumbersPresenter, ReviewOrderPresenter

class this._cls0
    implements dRefillToCartCallback
{

    final EnterNumbersPresenter this$0;

    public void onCancel()
    {
    }

    public void onCoolDown()
    {
        EnterNumbersPresenter.access$400(EnterNumbersPresenter.this);
    }

    public void onRefillAdded(Cart cart)
    {
        cart = new ReviewOrderPresenter(mActivity, cart, EnterNumbersPresenter.access$200(EnterNumbersPresenter.this));
        EnterNumbersPresenter.access$300(EnterNumbersPresenter.this, cart);
    }

    dRefillToCartCallback()
    {
        this$0 = EnterNumbersPresenter.this;
        super();
    }
}
