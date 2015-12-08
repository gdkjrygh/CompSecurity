// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.android.pharmacy.service.Cart;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PharmacyResponse, PharmacyManager, PharmacySession, 
//            OrderConfirmationRefillPresenter

class  extends AsyncCallbackOnThread
{

    final ReviewOrderPresenter this$0;

    private void handleServerResponse(PharmacyResponse pharmacyresponse)
    {
        ReviewOrderPresenter.access$1100(ReviewOrderPresenter.this, 2);
        if (!isPopped()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        flag = false;
        if (pharmacyresponse == null)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        pharmacyresponse.status;
        JVM INSTR lookupswitch 2: default 56
    //                   1: 71
    //                   1066: 159;
           goto _L3 _L4 _L5
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        flag = true;
_L7:
        if (flag)
        {
            ReviewOrderPresenter.access$1900(ReviewOrderPresenter.this, 3);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (pharmacyresponse.data != null)
        {
            PharmacyManager.get().getSession().addPlacedOrder(ReviewOrderPresenter.access$1200(ReviewOrderPresenter.this)._fld0, ReviewOrderPresenter.access$1200(ReviewOrderPresenter.this).);
            pharmacyresponse = new OrderConfirmationRefillPresenter(ReviewOrderPresenter.access$700(ReviewOrderPresenter.this), ReviewOrderPresenter.access$1300(ReviewOrderPresenter.this), ReviewOrderPresenter.access$1400(ReviewOrderPresenter.this), ReviewOrderPresenter.access$1500(ReviewOrderPresenter.this));
            ReviewOrderPresenter.access$1600(ReviewOrderPresenter.this, pharmacyresponse);
        } else
        {
            flag = true;
        }
          goto _L7
_L5:
        if (pharmacyresponse.data != null && ((Cart)pharmacyresponse.data).day != null)
        {
            ReviewOrderPresenter.access$1702(ReviewOrderPresenter.this, ((Cart)pharmacyresponse.data).day);
        }
        ReviewOrderPresenter.access$1800(ReviewOrderPresenter.this, 9);
          goto _L7
        flag = true;
          goto _L7
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

    Presenter(Handler handler)
    {
        this$0 = ReviewOrderPresenter.this;
        super(handler);
    }
}
