// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PharmacyResponse

class val.phoneNumber extends AsyncCallbackOnThread
{

    final ReviewOrderPresenter this$0;
    final String val$phoneNumber;
    final int val$preferredType;

    private void handleServerResponse(PharmacyResponse pharmacyresponse)
    {
        ReviewOrderPresenter.access$4900(ReviewOrderPresenter.this, 4);
        if (pharmacyresponse != null && pharmacyresponse.status == 1)
        {
            ReviewOrderPresenter.access$4100(ReviewOrderPresenter.this).setPhoneNumber(val$preferredType, val$phoneNumber);
            ReviewOrderPresenter.access$4202(ReviewOrderPresenter.this, val$preferredType);
            updatePhoneNumber(val$phoneNumber);
            return;
        } else
        {
            ReviewOrderPresenter.access$5000(ReviewOrderPresenter.this, 6);
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

    cation(String s)
    {
        this$0 = final_revieworderpresenter;
        val$preferredType = I.this;
        val$phoneNumber = s;
        super(final_handler);
    }
}
