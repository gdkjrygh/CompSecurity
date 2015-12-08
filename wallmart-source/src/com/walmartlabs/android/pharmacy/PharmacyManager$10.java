// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyManager, PharmacyResponse

class nit> extends AsyncCallbackOnThread
{

    final PharmacyManager this$0;
    final AsyncCallbackOnThread val$callback;

    public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
    {
        PharmacyManager.access$100(PharmacyManager.this, val$callback, integer, pharmacyresponse);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
    }

    public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
    {
        val$callback.onSuccess(pharmacyresponse);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((PharmacyResponse)obj);
    }

    _cls9(AsyncCallbackOnThread asynccallbackonthread)
    {
        this$0 = final_pharmacymanager;
        val$callback = asynccallbackonthread;
        super(Handler.this);
    }
}
