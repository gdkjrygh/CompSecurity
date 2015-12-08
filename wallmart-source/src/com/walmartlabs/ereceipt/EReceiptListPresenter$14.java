// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.view.View;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter, EReceiptListAdapter

class this._cls0
    implements android.view.resenter._cls14
{

    final EReceiptListPresenter this$0;

    public void onClick(View view)
    {
        if (EReceiptListPresenter.access$1300(EReceiptListPresenter.this) != null)
        {
            EReceiptListPresenter.access$400(EReceiptListPresenter.this).addItem(EReceiptListPresenter.access$1300(EReceiptListPresenter.this));
        }
        EReceiptListPresenter.access$1302(EReceiptListPresenter.this, null);
        EReceiptListPresenter.access$1600(EReceiptListPresenter.this);
    }

    ()
    {
        this$0 = EReceiptListPresenter.this;
        super();
    }
}
