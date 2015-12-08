// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.database.Cursor;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptListPresenter, SaverReceiptFilteredListAdapter

class val.searchQuery
    implements com.walmartlabs.ereceipt.service.ck
{

    final SaverReceiptListPresenter this$0;
    final String val$searchQuery;

    public void onResult(Cursor cursor)
    {
        if (val$searchQuery.equals(SaverReceiptListPresenter.access$800(SaverReceiptListPresenter.this)))
        {
            SaverReceiptListPresenter.access$600(SaverReceiptListPresenter.this).setData(val$searchQuery, cursor);
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((Cursor)obj);
    }

    ter()
    {
        this$0 = final_saverreceiptlistpresenter;
        val$searchQuery = String.this;
        super();
    }
}
