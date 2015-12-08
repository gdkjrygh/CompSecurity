// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPage

class  extends AsyncCallbackOnThread
{

    final SaverReceiptDetailsPage this$0;

    public void onFailureSameThread(Integer integer, Boolean boolean1)
    {
        WLog.w(SaverReceiptDetailsPage.access$1200(), (new StringBuilder()).append("Failed to lookup store items, error: ").append(integer).toString());
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (Boolean)obj1);
    }

    public void onSuccessSameThread(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            SaverReceiptDetailsPage.access$400(SaverReceiptDetailsPage.this, true);
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((Boolean)obj);
    }

    (Handler handler)
    {
        this$0 = SaverReceiptDetailsPage.this;
        super(handler);
    }
}
