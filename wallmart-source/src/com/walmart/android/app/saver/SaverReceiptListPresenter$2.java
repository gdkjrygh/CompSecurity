// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.walmart.android.service.saver.SaverContractUtil;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptListPresenter, SaverReceiptListAdapter

class this._cls0 extends OnItemSingleClickListener
{

    final SaverReceiptListPresenter this$0;

    public void onItemSingleClick(AdapterView adapterview, View view, int i, long l)
    {
        i -= SaverReceiptListPresenter.access$100(SaverReceiptListPresenter.this).getHeaderViewsCount();
        adapterview = (Cursor)SaverReceiptListPresenter.access$200(SaverReceiptListPresenter.this).getItem(i);
        if (adapterview != null)
        {
            adapterview = SaverContractUtil.populateSaverReceipt(adapterview, (SaverReceipt)EReceiptsContractUtil.populateEReceipt(adapterview, new SaverReceipt()));
            if (adapterview.needsConfirmation() && SaverReceiptListPresenter.access$200(SaverReceiptListPresenter.this).hasSaverData())
            {
                SaverReceiptListPresenter.access$300(SaverReceiptListPresenter.this, adapterview);
                return;
            } else
            {
                SaverReceiptListPresenter.access$400(SaverReceiptListPresenter.this).launchDetails(SaverReceiptListPresenter.this, ((SaverReceipt) (adapterview)).tcNumber);
                return;
            }
        } else
        {
            WLog.e(SaverReceiptListPresenter.access$500(), (new StringBuilder()).append("Invalid eReceipt at position ").append(i).toString());
            return;
        }
    }

    tionCallbacks(Presenter presenter)
    {
        this$0 = SaverReceiptListPresenter.this;
        super(presenter);
    }
}
