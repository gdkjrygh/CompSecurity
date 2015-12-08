// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.android.pharmacy.service.RefillHistory;
import com.walmartlabs.android.pharmacy.ui.HistoryListWrapperAdapter;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PrescriptionPresenter, PharmacyResponse

class this._cls0 extends AsyncCallbackOnThread
{

    final PrescriptionPresenter this$0;

    public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
    {
        if (isPopped())
        {
            return;
        } else
        {
            PrescriptionPresenter.access$1900(PrescriptionPresenter.this);
            return;
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
    }

    public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
    {
        if (isPopped())
        {
            return;
        }
        if (pharmacyresponse != null && pharmacyresponse.data != null && ((RefillHistory)pharmacyresponse.data).refills != null)
        {
            PrescriptionPresenter.access$300(PrescriptionPresenter.this).setItems(((RefillHistory)pharmacyresponse.data).refills);
            if (!PrescriptionPresenter.access$2300())
            {
                pharmacyresponse = ((RefillHistory)pharmacyresponse.data).refills;
                if (pharmacyresponse != null)
                {
                    MessageBus.getBus().post((new com.walmartlabs.anivia.r("pharmCountOrderHistory")).putInt("countRxOrderHistory", pharmacyresponse.length));
                    boolean _tmp = PrescriptionPresenter.access$2302(true);
                }
            }
        }
        PrescriptionPresenter.access$2200(PrescriptionPresenter.this, PrescriptionPresenter.access$2400(PrescriptionPresenter.this), true);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((PharmacyResponse)obj);
    }

    pter(Handler handler)
    {
        this$0 = PrescriptionPresenter.this;
        super(handler);
    }
}
