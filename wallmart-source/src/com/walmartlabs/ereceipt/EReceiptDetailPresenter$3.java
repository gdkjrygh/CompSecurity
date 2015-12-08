// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.ereceipt.service.EReceipt;
import java.util.Locale;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptDetailPresenter

class init> extends AsyncCallbackOnThread
{

    final EReceiptDetailPresenter this$0;

    public void onFailureSameThread(Integer integer, com.walmartlabs.ereceipt.service. )
    {
        if (isPopped())
        {
            return;
        } else
        {
            EReceiptDetailPresenter.access$200(EReceiptDetailPresenter.this, 0);
            return;
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (com.walmartlabs.ereceipt.service.eSameThread)obj1);
    }

    public void onSuccessSameThread(com.walmartlabs.ereceipt.service.eSameThread esamethread)
    {
        if (!isPopped())
        {
            if (esamethread == null)
            {
                EReceiptDetailPresenter.access$300(EReceiptDetailPresenter.this, 0);
                return;
            }
            EReceiptDetailPresenter.access$402(EReceiptDetailPresenter.this, esamethread);
            EReceiptDetailPresenter.access$500(EReceiptDetailPresenter.this);
            EReceiptDetailPresenter.access$000(EReceiptDetailPresenter.this, EReceiptDetailPresenter.access$600(EReceiptDetailPresenter.this, EReceiptDetailPresenter.access$400(EReceiptDetailPresenter.this).image));
            EReceiptDetailPresenter.access$100(EReceiptDetailPresenter.this);
            if (EReceiptDetailPresenter.access$700(EReceiptDetailPresenter.this))
            {
                Bus bus = MessageBus.getBus();
                com.walmartlabs.anivia.e.Receipt receipt = (new com.walmartlabs.anivia.<init>("ereceiptQRScan")).putString("receiptUuid", EReceiptDetailPresenter.access$400(EReceiptDetailPresenter.this).uuid);
                if (EReceiptDetailPresenter.access$400(EReceiptDetailPresenter.this).store != null)
                {
                    esamethread = EReceiptDetailPresenter.access$400(EReceiptDetailPresenter.this).store.;
                } else
                {
                    esamethread = "";
                }
                bus.post(receipt.putString("storeId", esamethread).putInt("numberItems", EReceiptDetailPresenter.access$400(EReceiptDetailPresenter.this).itemsSold).putString("total", String.format(Locale.US, "$%.2f", new Object[] {
                    Float.valueOf(EReceiptDetailPresenter.access$400(EReceiptDetailPresenter.this).getPriceInDollar())
                })));
                return;
            }
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((com.walmartlabs.ereceipt.service.sSameThread)obj);
    }

    Receipt(Handler handler)
    {
        this$0 = EReceiptDetailPresenter.this;
        super(handler);
    }
}
