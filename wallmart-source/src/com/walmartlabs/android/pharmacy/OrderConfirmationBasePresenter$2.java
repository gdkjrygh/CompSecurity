// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;


// Referenced classes of package com.walmartlabs.android.pharmacy:
//            OrderConfirmationBasePresenter

class this._cls0
    implements ntCallback
{

    final OrderConfirmationBasePresenter this$0;

    public void onResult(ntResult ntresult)
    {
        OrderConfirmationBasePresenter orderconfirmationbasepresenter = OrderConfirmationBasePresenter.this;
        boolean flag;
        if (ntresult == ntResult.YES)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        orderconfirmationbasepresenter.populateAccountSections(true, flag);
    }

    ntResult()
    {
        this$0 = OrderConfirmationBasePresenter.this;
        super();
    }
}
