// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import android.util.Log;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PharmacyResponse

class  extends AsyncCallbackOnThread
{

    final ReviewOrderPresenter this$0;

    private void handleServerResponse(PharmacyResponse pharmacyresponse)
    {
        ReviewOrderPresenter.access$2000(ReviewOrderPresenter.this, 4);
        if (isPopped())
        {
            return;
        }
        if (pharmacyresponse == null || pharmacyresponse.status != 1)
        {
            String s = ReviewOrderPresenter.access$2100();
            StringBuilder stringbuilder = (new StringBuilder()).append("Failed to delete refill: ");
            int i;
            if (pharmacyresponse != null)
            {
                i = pharmacyresponse.status;
            } else
            {
                i = 0;
            }
            Log.w(s, stringbuilder.append(i).toString());
        }
        ReviewOrderPresenter.access$2200(ReviewOrderPresenter.this);
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
        this$0 = ReviewOrderPresenter.this;
        super(handler);
    }
}
