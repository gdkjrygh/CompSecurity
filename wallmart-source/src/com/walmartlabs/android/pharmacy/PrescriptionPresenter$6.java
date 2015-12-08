// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.android.pharmacy.service.Prescriptions;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PrescriptionPresenter, PharmacyResponse, RefillsListAdapter

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
        if (pharmacyresponse != null && pharmacyresponse.data != null)
        {
            PrescriptionPresenter.access$000(PrescriptionPresenter.this).setItems(((Prescriptions)pharmacyresponse.data).prescriptions);
            if (!PrescriptionPresenter.access$2000())
            {
                int j = 0;
                pharmacyresponse = ((Prescriptions)pharmacyresponse.data).prescriptions;
                if (pharmacyresponse != null)
                {
                    int l = pharmacyresponse.length;
                    for (int i = 0; i < l;)
                    {
                        int k = j;
                        if (((com.walmartlabs.android.pharmacy.service.on) (pharmacyresponse[i])).rxOnlineRefillable)
                        {
                            k = j + 1;
                        }
                        i++;
                        j = k;
                    }

                    MessageBus.getBus().post((new com.walmartlabs.anivia.r("pharmPrescriptionsCountInMyRxs")).putInt("totalCount", pharmacyresponse.length).putInt("countRefillable", j).putInt("countNotRefillable", pharmacyresponse.length - j));
                    boolean _tmp = PrescriptionPresenter.access$2002(true);
                }
            }
        }
        PrescriptionPresenter.access$2200(PrescriptionPresenter.this, PrescriptionPresenter.access$2100(PrescriptionPresenter.this), true);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((PharmacyResponse)obj);
    }

    escription(Handler handler)
    {
        this$0 = PrescriptionPresenter.this;
        super(handler);
    }
}
