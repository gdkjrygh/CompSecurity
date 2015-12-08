// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.ereceipt.service.EReceipt;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter, EReceiptListAdapter, EReceiptsCountEvent

class this._cls0
    implements com.walmartlabs.ereceipt.service.ner
{

    final EReceiptListPresenter this$0;

    public void onDeletedReceipts(int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            EReceiptListPresenter.access$400(EReceiptListPresenter.this).removeItem(k);
        }

    }

    public void onNewReceipts(EReceipt aereceipt[])
    {
        if (EReceiptListPresenter.access$1300(EReceiptListPresenter.this) != null)
        {
            int j = aereceipt.length;
            for (int i = 0; i < j; i++)
            {
                EReceipt ereceipt = aereceipt[i];
                if (!EReceiptListPresenter.access$1300(EReceiptListPresenter.this).uuid.equals(ereceipt.uuid))
                {
                    EReceiptListPresenter.access$400(EReceiptListPresenter.this).addItem(ereceipt);
                }
            }

        } else
        {
            EReceiptListPresenter.access$400(EReceiptListPresenter.this).addItems(aereceipt);
        }
    }

    public void onSyncFinished(Integer integer)
    {
        EReceiptListPresenter.access$1400(EReceiptListPresenter.this);
        EReceiptListPresenter.access$1502(EReceiptListPresenter.this, false);
        MessageBus.getBus().post(new EReceiptsCountEvent(String.valueOf(EReceiptListPresenter.access$400(EReceiptListPresenter.this).getCount()), EReceiptListPresenter.access$200(EReceiptListPresenter.this)));
    }

    yncListener()
    {
        this$0 = EReceiptListPresenter.this;
        super();
    }
}
