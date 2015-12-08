// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import android.util.Log;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.android.pharmacy.service.Cart;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PrescriptionPresenter, PharmacyResponse, PharmacyManager, ReviewOrderPresenter

class val.prescription extends AsyncCallbackOnThread
{

    final PrescriptionPresenter this$0;
    final com.walmartlabs.android.pharmacy.service.on val$prescription;

    public void handleServerResponse(PharmacyResponse pharmacyresponse)
    {
        PrescriptionPresenter.access$700(PrescriptionPresenter.this, 1);
        if (isPopped())
        {
            return;
        }
        if (pharmacyresponse != null)
        {
            int i;
            switch (pharmacyresponse.status)
            {
            default:
                Log.w(PrescriptionPresenter.access$800(), (new StringBuilder()).append("Unknown error code received: ").append(pharmacyresponse.status).append(" with message: ").append(pharmacyresponse.message).toString());
                PharmacyManager.get().deleteRefillFromCartSilent(val$prescription.rxNumber, val$prescription.storeNumber);
                PrescriptionPresenter.access$1500(PrescriptionPresenter.this, 0);
                return;

            case 1008: 
                Log.w(PrescriptionPresenter.access$800(), "Invalid RX / Store. Should not happen in this context");
                PrescriptionPresenter.access$900(PrescriptionPresenter.this, 0);
                return;

            case 1071: 
                PrescriptionPresenter.access$1000(PrescriptionPresenter.this, val$prescription);
                return;

            case 1073: 
            case 1074: 
                PrescriptionPresenter.access$1000(PrescriptionPresenter.this, val$prescription);
                return;

            case 1072: 
                PrescriptionPresenter.access$1100(PrescriptionPresenter.this, 3);
                return;

            case 1: // '\001'
                i = ((Cart)pharmacyresponse.data).getStatus(val$prescription.rxNumber, val$prescription.storeNumber);
                break;
            }
            if (i == 0)
            {
                if (((Cart)pharmacyresponse.data).canBeRefilled(val$prescription.rxNumber, val$prescription.storeNumber))
                {
                    pharmacyresponse = new ReviewOrderPresenter(PrescriptionPresenter.access$400(PrescriptionPresenter.this), (Cart)pharmacyresponse.data, val$prescription, null);
                    PrescriptionPresenter.access$1200(PrescriptionPresenter.this, pharmacyresponse);
                    return;
                } else
                {
                    PharmacyManager.get().deleteRefillFromCartSilent(val$prescription.rxNumber, val$prescription.storeNumber);
                    PrescriptionPresenter.access$1300(PrescriptionPresenter.this, 3);
                    return;
                }
            } else
            {
                Log.w(PrescriptionPresenter.access$800(), (new StringBuilder()).append("Unexpected cart status: ").append(i).toString());
                PharmacyManager.get().deleteRefillFromCartSilent(val$prescription.rxNumber, val$prescription.storeNumber);
                PrescriptionPresenter.access$1400(PrescriptionPresenter.this, 0);
                return;
            }
        } else
        {
            PrescriptionPresenter.access$1600(PrescriptionPresenter.this, 0);
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
