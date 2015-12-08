// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import com.walmartlabs.ereceipt.service.EReceipt;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import java.util.List;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptDetailPresenter, EReceiptItemListAdapter

class this._cls1
    implements com.walmartlabs.ereceipt.service.ck
{

    final is._cls0 this$1;

    public volatile void onResult(Object obj)
    {
        onResult((List)obj);
    }

    public void onResult(List list)
    {
        if (!isPopped())
        {
            EReceiptDetailPresenter.access$1102(_fld0, list);
            EReceiptDetailPresenter.access$1000(_fld0);
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/ereceipt/EReceiptDetailPresenter$4

/* anonymous class */
    class EReceiptDetailPresenter._cls4
        implements com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback
    {

        final EReceiptDetailPresenter this$0;

        public void onResult(EReceipt ereceipt)
        {
            EReceiptDetailPresenter.access$402(EReceiptDetailPresenter.this, ereceipt);
            long l = ereceipt.rowId;
            EReceiptManager.get().getReceiptItems(l, new EReceiptDetailPresenter._cls4._cls1());
            EReceiptManager.get().getReceiptTax(l, new EReceiptDetailPresenter._cls4._cls2());
            EReceiptManager.get().getReceiptTender(l, new EReceiptDetailPresenter._cls4._cls3());
        }

        public volatile void onResult(Object obj)
        {
            onResult((EReceipt)obj);
        }

            
            {
                this$0 = EReceiptDetailPresenter.this;
                super();
            }

        // Unreferenced inner class com/walmartlabs/ereceipt/EReceiptDetailPresenter$4$1

/* anonymous class */
        class EReceiptDetailPresenter._cls4._cls1
            implements com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback
        {

            final EReceiptDetailPresenter._cls4 this$1;

            public volatile void onResult(Object obj)
            {
                onResult((List)obj);
            }

            public void onResult(List list)
            {
                if (!isPopped())
                {
                    EReceiptDetailPresenter.access$800(this$0).setItems((com.walmartlabs.ereceipt.service.EReceipt.Item[])list.toArray(new com.walmartlabs.ereceipt.service.EReceipt.Item[list.size()]));
                }
            }

                    
                    {
                        this$1 = EReceiptDetailPresenter._cls4.this;
                        super();
                    }
        }


        // Unreferenced inner class com/walmartlabs/ereceipt/EReceiptDetailPresenter$4$2

/* anonymous class */
        class EReceiptDetailPresenter._cls4._cls2
            implements com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback
        {

            final EReceiptDetailPresenter._cls4 this$1;

            public volatile void onResult(Object obj)
            {
                onResult((List)obj);
            }

            public void onResult(List list)
            {
                if (!isPopped())
                {
                    EReceiptDetailPresenter.access$902(this$0, list);
                    EReceiptDetailPresenter.access$1000(this$0);
                }
            }

                    
                    {
                        this$1 = EReceiptDetailPresenter._cls4.this;
                        super();
                    }
        }

    }

}
