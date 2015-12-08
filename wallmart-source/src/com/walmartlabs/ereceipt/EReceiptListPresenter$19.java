// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;


// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter, EReceiptListAdapter

class this._cls0
    implements eleteHandler
{

    final EReceiptListPresenter this$0;

    public void deleteReceipt(String s, boolean flag)
    {
        EReceiptListPresenter.access$502(EReceiptListPresenter.this, EReceiptListPresenter.access$400(EReceiptListPresenter.this).getItem(s));
        EReceiptListPresenter.access$1000(EReceiptListPresenter.this);
    }

    eleteHandler()
    {
        this$0 = EReceiptListPresenter.this;
        super();
    }
}
