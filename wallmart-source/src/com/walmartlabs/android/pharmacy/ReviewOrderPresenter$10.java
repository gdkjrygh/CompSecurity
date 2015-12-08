// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.android.pharmacy.service.Cart;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PharmacyResponse

class this._cls0 extends AsyncCallbackOnThread
{

    final ReviewOrderPresenter this$0;

    private void handleServerResponse(PharmacyResponse pharmacyresponse)
    {
        ReviewOrderPresenter.access$3600(ReviewOrderPresenter.this, 1);
        if (!isPopped())
        {
            if (pharmacyresponse != null && pharmacyresponse.data != null)
            {
                switch (pharmacyresponse.status)
                {
                default:
                    ReviewOrderPresenter.access$3900(ReviewOrderPresenter.this, 0);
                    return;

                case 1: // '\001'
                    ReviewOrderPresenter.access$1302(ReviewOrderPresenter.this, (Cart)pharmacyresponse.data);
                    break;
                }
                pharmacyresponse = ReviewOrderPresenter.access$1300(ReviewOrderPresenter.this).getRefill();
                if (pharmacyresponse != null && pharmacyresponse.s())
                {
                    if (pharmacyresponse.Status() == 1069)
                    {
                        ReviewOrderPresenter.access$3700(ReviewOrderPresenter.this, 8);
                        restorePreviousPickupDetails();
                        return;
                    } else
                    {
                        ReviewOrderPresenter.access$3800(ReviewOrderPresenter.this, 0);
                        return;
                    }
                }
            } else
            {
                ReviewOrderPresenter.access$4000(ReviewOrderPresenter.this, 0);
                return;
            }
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
