// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import android.view.View;
import android.widget.Spinner;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.service.PickupTime;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PharmacyResponse, PickupTimesSpinnerAdapter

class  extends AsyncCallbackOnThread
{

    final ReviewOrderPresenter this$0;

    private void handleServerResponse(PharmacyResponse pharmacyresponse)
    {
        if (isAllLoaded())
        {
            ReviewOrderPresenter.access$2800(ReviewOrderPresenter.this, 4);
        }
        if (isPopped())
        {
            return;
        }
        if (pharmacyresponse != null && pharmacyresponse.data != null && pharmacyresponse.status == 1)
        {
            pharmacyresponse = (PickupTime)pharmacyresponse.data;
            if (((PickupTime) (pharmacyresponse)).day != null && ((PickupTime) (pharmacyresponse)).day.length > 0)
            {
                ReviewOrderPresenter.access$2902(ReviewOrderPresenter.this, ReviewOrderPresenter.access$3000(ReviewOrderPresenter.this));
                ReviewOrderPresenter.access$3002(ReviewOrderPresenter.this, ((PickupTime) (pharmacyresponse)).day);
                ReviewOrderPresenter.access$102(ReviewOrderPresenter.this, ReviewOrderPresenter.access$000(ReviewOrderPresenter.this));
                ReviewOrderPresenter.access$002(ReviewOrderPresenter.this, 0);
                ReviewOrderPresenter.access$3100(ReviewOrderPresenter.this).setSelection(ReviewOrderPresenter.access$000(ReviewOrderPresenter.this));
                ReviewOrderPresenter.access$3200(ReviewOrderPresenter.this).setItems(((PickupTime) (pharmacyresponse)).day);
                pharmacyresponse = null;
                if (ReviewOrderPresenter.access$3200(ReviewOrderPresenter.this).getCount() > 0)
                {
                    pharmacyresponse = (er.PickupItem)ReviewOrderPresenter.access$3200(ReviewOrderPresenter.this).getItem(0);
                }
                if (pharmacyresponse != null)
                {
                    ReviewOrderPresenter.access$200(ReviewOrderPresenter.this, pharmacyresponse.getDate(), pharmacyresponse.getTime());
                    ViewUtil.findViewById(ReviewOrderPresenter.access$600(ReviewOrderPresenter.this), this._fld0).setVisibility(0);
                    ReviewOrderPresenter.access$2400(ReviewOrderPresenter.this, 4);
                    return;
                } else
                {
                    ReviewOrderPresenter.access$3300(ReviewOrderPresenter.this, 0);
                    return;
                }
            } else
            {
                ReviewOrderPresenter.access$3400(ReviewOrderPresenter.this, 0);
                return;
            }
        } else
        {
            ReviewOrderPresenter.access$3500(ReviewOrderPresenter.this, 0);
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

    er.PickupItem(Handler handler)
    {
        this$0 = ReviewOrderPresenter.this;
        super(handler);
    }
}
