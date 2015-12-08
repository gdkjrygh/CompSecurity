// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.net.Uri;
import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.wmui.WalmartActivityChooserView;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPresenter

class val.chooserView extends AsyncCallbackOnThread
{

    final SaverReceiptDetailsPresenter this$0;
    final WalmartActivityChooserView val$chooserView;
    final String val$tcNbr;
    final String val$uuid;

    public void onFailureSameThread(Integer integer, Uri uri)
    {
        if (isTop())
        {
            dismissDialog(3);
            SaverReceiptDetailsPresenter.access$1000(SaverReceiptDetailsPresenter.this, 2);
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (Uri)obj1);
    }

    public void onSuccessSameThread(Uri uri)
    {
        if (isTop())
        {
            dismissDialog(3);
            uri = SaverReceiptDetailsPresenter.access$1100(SaverReceiptDetailsPresenter.this);
            if (uri != null && val$uuid.equals(((SaverReceipt) (uri)).uuid) && val$tcNbr.equals(((SaverReceipt) (uri)).tcNumber))
            {
                val$chooserView.showPopup();
            }
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((Uri)obj);
    }

    (WalmartActivityChooserView walmartactivitychooserview)
    {
        this$0 = final_saverreceiptdetailspresenter;
        val$uuid = s;
        val$tcNbr = String.this;
        val$chooserView = walmartactivitychooserview;
        super(final_handler);
    }
}
