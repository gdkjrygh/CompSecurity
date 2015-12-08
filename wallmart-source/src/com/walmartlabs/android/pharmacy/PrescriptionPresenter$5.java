// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PrescriptionPresenter, PharmacyResponse

class val.prescription extends AsyncCallbackOnThread
{

    final PrescriptionPresenter this$0;
    final com.walmartlabs.android.pharmacy.service.on val$prescription;

    private void handleServerResponse(PharmacyResponse pharmacyresponse)
    {
        PrescriptionPresenter.access$1700(PrescriptionPresenter.this, 1);
        if (pharmacyresponse != null && pharmacyresponse.status == 1)
        {
            PrescriptionPresenter.access$100(PrescriptionPresenter.this, val$prescription);
            return;
        } else
        {
            PrescriptionPresenter.access$1800(PrescriptionPresenter.this, 0);
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

    escription(com.walmartlabs.android.pharmacy.service.on on)
    {
        this$0 = final_prescriptionpresenter;
        val$prescription = on;
        super(Handler.this);
    }
}
