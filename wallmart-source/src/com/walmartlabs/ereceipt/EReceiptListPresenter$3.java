// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.view.View;
import android.widget.AdapterView;
import com.walmartlabs.ereceipt.service.EReceipt;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter, EReceiptListAdapter

class this._cls0
    implements android.widget.ickListener
{

    final EReceiptListPresenter this$0;

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag = false;
        adapterview = (EReceipt)EReceiptListPresenter.access$400(EReceiptListPresenter.this).getItem(i);
        if (adapterview != null)
        {
            EReceiptListPresenter.access$502(EReceiptListPresenter.this, adapterview);
            EReceiptListPresenter.access$600(EReceiptListPresenter.this, 0);
            flag = true;
        }
        return flag;
    }

    r()
    {
        this$0 = EReceiptListPresenter.this;
        super();
    }
}
