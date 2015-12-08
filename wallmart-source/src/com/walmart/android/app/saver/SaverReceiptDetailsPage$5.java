// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPage, SaverReceiptItemListAdapter

class this._cls0
    implements android.widget.tener
{

    final SaverReceiptDetailsPage this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i -= SaverReceiptDetailsPage.access$1000(SaverReceiptDetailsPage.this).getHeaderViewsCount();
        adapterview = (com.walmart.android.service.saver.._cls0)SaverReceiptDetailsPage.access$300(SaverReceiptDetailsPage.this).getItem(i);
        if (adapterview != null)
        {
            SaverReceiptDetailsPage.access$1100(SaverReceiptDetailsPage.this).onItemClicked(SaverReceiptDetailsPage.access$100(SaverReceiptDetailsPage.this), adapterview);
            return;
        } else
        {
            WLog.e(SaverReceiptDetailsPage.access$1200(), (new StringBuilder()).append("Invalid item at position ").append(i).toString());
            return;
        }
    }

    tionCallbacks()
    {
        this$0 = SaverReceiptDetailsPage.this;
        super();
    }
}
