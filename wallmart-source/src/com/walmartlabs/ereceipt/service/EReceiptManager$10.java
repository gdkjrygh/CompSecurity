// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager

class nit> extends AsyncCallbackOnThread
{

    final EReceiptManager this$0;

    public void onFailureSameThread(Integer integer, Boolean boolean1)
    {
        WLog.w(EReceiptManager.access$600(), "Could not update phone configuration");
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (Boolean)obj1);
    }

    public void onSuccessSameThread(Boolean boolean1)
    {
        WLog.d(EReceiptManager.access$600(), "updatePhoneConfiguration");
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((Boolean)obj);
    }

    _cls9(Handler handler)
    {
        this$0 = EReceiptManager.this;
        super(handler);
    }
}
