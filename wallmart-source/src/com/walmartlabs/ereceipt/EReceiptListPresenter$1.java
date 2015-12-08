// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.view.View;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter, EReceiptScanner

class this._cls0
    implements android.view.Presenter._cls1
{

    final EReceiptListPresenter this$0;

    public void onClick(View view)
    {
        EReceiptListPresenter.access$000(EReceiptListPresenter.this);
        EReceiptListPresenter.access$100(EReceiptListPresenter.this).onScan();
    }

    ()
    {
        this$0 = EReceiptListPresenter.this;
        super();
    }
}
