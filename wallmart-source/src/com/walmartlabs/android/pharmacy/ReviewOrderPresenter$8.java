// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.android.pharmacy.service.Cart;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PharmacyResponse

class  extends AsyncCallbackOnThread
{

    final ReviewOrderPresenter this$0;

    private void handleServerResponse(PharmacyResponse pharmacyresponse)
    {
        if (isPopped())
        {
            return;
        }
        if (pharmacyresponse != null && pharmacyresponse.data != null && pharmacyresponse.status == 1)
        {
            ReviewOrderPresenter.access$1302(ReviewOrderPresenter.this, (Cart)pharmacyresponse.data);
            ReviewOrderPresenter.access$402(ReviewOrderPresenter.this, ReviewOrderPresenter.access$1300(ReviewOrderPresenter.this).getStoreNumber());
            if (ReviewOrderPresenter.access$1300(ReviewOrderPresenter.this) != null)
            {
                ReviewOrderPresenter.access$1202(ReviewOrderPresenter.this, ReviewOrderPresenter.access$1300(ReviewOrderPresenter.this).getRefill());
                if (ReviewOrderPresenter.access$1200(ReviewOrderPresenter.this) != null)
                {
                    ReviewOrderPresenter.access$2300(ReviewOrderPresenter.this);
                    ReviewOrderPresenter.access$2400(ReviewOrderPresenter.this, 2);
                    return;
                } else
                {
                    ReviewOrderPresenter.access$2500(ReviewOrderPresenter.this, 0);
                    return;
                }
            } else
            {
                ReviewOrderPresenter.access$2600(ReviewOrderPresenter.this, 0);
                return;
            }
        } else
        {
            ReviewOrderPresenter.access$2700(ReviewOrderPresenter.this, 0);
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
        this$0 = ReviewOrderPresenter.this;
        super(handler);
    }
}
