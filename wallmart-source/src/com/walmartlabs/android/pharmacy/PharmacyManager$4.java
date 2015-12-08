// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyManager, PharmacyResponse, PharmacySession

class init> extends AsyncCallbackOnThread
{

    final PharmacyManager this$0;
    final AsyncCallbackOnThread val$callback;

    private void handleServiceResponse(PharmacyResponse pharmacyresponse)
    {
        if (pharmacyresponse == null || pharmacyresponse.status != 1)
        {
            endSession();
            MessageBus.getBus().post(new com.walmartlabs.anivia.Builder("wrongDob"));
        } else
        if (!getSession().hasActiveCustomerSession())
        {
            MessageBus.getBus().post(new com.walmartlabs.anivia.Builder("successDob"));
            return;
        }
    }

    public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
    {
        handleServiceResponse(pharmacyresponse);
        PharmacyManager.access$100(PharmacyManager.this, val$callback, integer, pharmacyresponse);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
    }

    public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
    {
        handleServiceResponse(pharmacyresponse);
        val$callback.onSuccess(pharmacyresponse);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((PharmacyResponse)obj);
    }

    (AsyncCallbackOnThread asynccallbackonthread)
    {
        this$0 = final_pharmacymanager;
        val$callback = asynccallbackonthread;
        super(Handler.this);
    }
}
