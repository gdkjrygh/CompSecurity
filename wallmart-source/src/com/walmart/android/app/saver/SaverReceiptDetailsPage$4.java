// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import java.util.List;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPage, SaverReceiptItemListAdapter

class val.onlyUpdateItems
    implements com.walmart.android.service.saver.k
{

    final SaverReceiptDetailsPage this$0;
    final boolean val$onlyUpdateItems;

    public volatile void onResult(Object obj)
    {
        onResult((List)obj);
    }

    public void onResult(List list)
    {
        if (!SaverReceiptDetailsPage.access$000(SaverReceiptDetailsPage.this))
        {
            if (!val$onlyUpdateItems)
            {
                SaverReceiptDetailsPage.access$800(SaverReceiptDetailsPage.this, list);
            }
            SaverReceiptDetailsPage.access$300(SaverReceiptDetailsPage.this).setItems(list);
            if (!val$onlyUpdateItems)
            {
                SaverReceiptDetailsPage.access$900(SaverReceiptDetailsPage.this);
            }
        }
    }

    r()
    {
        this$0 = final_saverreceiptdetailspage;
        val$onlyUpdateItems = Z.this;
        super();
    }
}
