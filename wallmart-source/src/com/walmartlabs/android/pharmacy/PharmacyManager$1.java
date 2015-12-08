// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyManager, PharmacyResponse

class init> extends AsyncCallbackOnThread
{

    final PharmacyManager this$0;

    public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
    {
        WLog.d(PharmacyManager.access$000(), (new StringBuilder()).append("failed to log out: ").append(integer).toString());
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
    }

    public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
    {
        WLog.d(PharmacyManager.access$000(), "successfully logged out");
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((PharmacyResponse)obj);
    }

    (Handler handler)
    {
        this$0 = PharmacyManager.this;
        super(handler);
    }
}
