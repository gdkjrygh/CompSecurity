// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.saver.SaverReceipt;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPage, SaverReceiptItemListAdapter

class  extends AsyncCallbackOnThread
{

    final SaverReceiptDetailsPage this$0;

    public void onFailureSameThread(Integer integer, com.walmart.android.service.saver.ad ad)
    {
        onSuccessSameThread(ad);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (com.walmart.android.service.saver.ad)obj1);
    }

    public void onSuccessSameThread(com.walmart.android.service.saver.ad ad)
    {
        if (!SaverReceiptDetailsPage.access$000(SaverReceiptDetailsPage.this))
        {
            if (ad != null && ad.processedDetails != null)
            {
                SaverReceiptDetailsPage.access$100(SaverReceiptDetailsPage.this).totalTaxBack = ad.processedDetails.getItBackTaxComponentCents.intValue();
                SaverReceiptDetailsPage.access$100(SaverReceiptDetailsPage.this).totalBack = ad.processedDetails.totalGetItBackCents.intValue();
                SaverReceiptDetailsPage.access$100(SaverReceiptDetailsPage.this).hasDetails = true;
            }
            SaverReceiptDetailsPage.access$300(SaverReceiptDetailsPage.this).setShowSaverInfo(SaverReceiptDetailsPage.access$200(SaverReceiptDetailsPage.this));
            SaverReceiptDetailsPage.access$400(SaverReceiptDetailsPage.this, false);
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((com.walmart.android.service.saver.ad)obj);
    }

    ayload(Handler handler)
    {
        this$0 = SaverReceiptDetailsPage.this;
        super(handler);
    }
}
