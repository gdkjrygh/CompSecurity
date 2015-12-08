// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.main:
//            WalmartStartActivity

class nit> extends AsyncCallbackOnThread
{

    final WalmartStartActivity this$0;

    public void onFailureSameThread(Integer integer, Integer integer1)
    {
        WLog.e(WalmartStartActivity.access$000(), "Failed to clear cache!");
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (Integer)obj1);
    }

    public void onSuccessSameThread(Integer integer)
    {
        WLog.e(WalmartStartActivity.access$000(), "Cleared cache successfully.");
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((Integer)obj);
    }

    _cls9(Handler handler)
    {
        this$0 = WalmartStartActivity.this;
        super(handler);
    }
}
