// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyHomePresenter, PharmacyResponse

class this._cls0 extends AsyncCallbackOnThread
{

    final PharmacyHomePresenter this$0;

    private void handleServerResponse(PharmacyResponse pharmacyresponse)
    {
        if (pharmacyresponse != null && pharmacyresponse.status == 1009)
        {
            PharmacyHomePresenter.access$400(PharmacyHomePresenter.this, false);
            return;
        } else
        {
            PharmacyHomePresenter.access$400(PharmacyHomePresenter.this, true);
            return;
        }
    }

    public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
    {
        handleServerResponse(pharmacyresponse);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
    }

    public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
    {
        handleServerResponse(pharmacyresponse);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((PharmacyResponse)obj);
    }

    (Handler handler)
    {
        this$0 = PharmacyHomePresenter.this;
        super(handler);
    }
}
