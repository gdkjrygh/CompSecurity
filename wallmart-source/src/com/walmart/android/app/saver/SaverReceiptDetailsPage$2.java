// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import java.util.List;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPage

class this._cls0
    implements com.walmartlabs.ereceipt.service.back
{

    final SaverReceiptDetailsPage this$0;

    public volatile void onResult(Object obj)
    {
        onResult((List)obj);
    }

    public void onResult(List list)
    {
        if (!SaverReceiptDetailsPage.access$000(SaverReceiptDetailsPage.this))
        {
            SaverReceiptDetailsPage.access$502(SaverReceiptDetailsPage.this, list);
            SaverReceiptDetailsPage.access$600(SaverReceiptDetailsPage.this);
        }
    }

    allback()
    {
        this$0 = SaverReceiptDetailsPage.this;
        super();
    }
}
