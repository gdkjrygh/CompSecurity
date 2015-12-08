// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.android.pharmacy.data.TransferRxData;
import com.walmartlabs.android.pharmacy.service.PickupTime;
import java.text.SimpleDateFormat;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            TransferRxPrescriptionInfoPresenter, PharmacyResponse, PharmacyUtils, PharmacyManager, 
//            OrderConfirmationTransferPresenter

class val.transferCallback extends AsyncCallbackOnThread
{

    final onSuccessSameThread this$1;
    final AsyncCallbackOnThread val$transferCallback;

    public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
    {
        TransferRxPrescriptionInfoPresenter.access$1400(_fld0, 1);
        TransferRxPrescriptionInfoPresenter.access$1500(_fld0, 2);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
    }

    public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
    {
        if (pharmacyresponse.status == 1)
        {
            if (pharmacyresponse.data != null && TransferRxPrescriptionInfoPresenter.access$1600(_fld0, ((PickupTime)pharmacyresponse.data).day) && TransferRxPrescriptionInfoPresenter.access$1600(_fld0, ((PickupTime)pharmacyresponse.data).day[0].eSameThread))
            {
                long l = PharmacyUtils.pickupDateToMillisecondsSinceEpoch(((PickupTime)pharmacyresponse.data).day[0]., ((PickupTime)pharmacyresponse.data).day[0].[0]);
                if (l > 0L)
                {
                    TransferRxPrescriptionInfoPresenter.access$800(_fld0).pickupDate = PharmacyUtils.sPickupDateFormat.format(Long.valueOf(l));
                    TransferRxPrescriptionInfoPresenter.access$800(_fld0).pickupTime = PharmacyUtils.sPickupTimeFormat.format(Long.valueOf(l));
                    PharmacyManager.get().transferRxExternal(TransferRxPrescriptionInfoPresenter.access$800(_fld0), val$transferCallback);
                    return;
                } else
                {
                    TransferRxPrescriptionInfoPresenter.access$1700(_fld0, 1);
                    TransferRxPrescriptionInfoPresenter.access$1800(_fld0, 2);
                    return;
                }
            } else
            {
                TransferRxPrescriptionInfoPresenter.access$1900(_fld0, 1);
                TransferRxPrescriptionInfoPresenter.access$2000(_fld0, 2);
                return;
            }
        } else
        {
            TransferRxPrescriptionInfoPresenter.access$2100(_fld0, 1);
            TransferRxPrescriptionInfoPresenter.access$2200(_fld0, 2);
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((PharmacyResponse)obj);
    }

    is._cls0(AsyncCallbackOnThread asynccallbackonthread)
    {
        this$1 = final__pcls0;
        val$transferCallback = asynccallbackonthread;
        super(Handler.this);
    }

    // Unreferenced inner class com/walmartlabs/android/pharmacy/TransferRxPrescriptionInfoPresenter$2

/* anonymous class */
    class TransferRxPrescriptionInfoPresenter._cls2
        implements android.view.View.OnClickListener
    {

        final TransferRxPrescriptionInfoPresenter this$0;

        public void onClick(View view)
        {
            if (TransferRxPrescriptionInfoPresenter.access$400(TransferRxPrescriptionInfoPresenter.this))
            {
                TransferRxPrescriptionInfoPresenter.access$500(TransferRxPrescriptionInfoPresenter.this);
                view = new TransferRxPrescriptionInfoPresenter._cls2._cls1(new Handler());
                view = (new Handler()). new TransferRxPrescriptionInfoPresenter._cls2._cls2(view);
                PharmacyManager.get().getPickupTimes(TransferRxPrescriptionInfoPresenter.access$800(TransferRxPrescriptionInfoPresenter.this).pickupStore, view);
                TransferRxPrescriptionInfoPresenter.access$2300(TransferRxPrescriptionInfoPresenter.this, 1);
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmacyTransferPlaceOrder")).putString("pharmTransferOriginalChain", TransferRxPrescriptionInfoPresenter.access$800(TransferRxPrescriptionInfoPresenter.this).rxInfo[0].pharmacyName));
            }
        }

            
            {
                this$0 = TransferRxPrescriptionInfoPresenter.this;
                super();
            }

        // Unreferenced inner class com/walmartlabs/android/pharmacy/TransferRxPrescriptionInfoPresenter$2$1

/* anonymous class */
        class TransferRxPrescriptionInfoPresenter._cls2._cls1 extends AsyncCallbackOnThread
        {

            final TransferRxPrescriptionInfoPresenter._cls2 this$1;

            private void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                TransferRxPrescriptionInfoPresenter.access$600(this$0, 1);
                if (pharmacyresponse != null)
                {
                    switch (pharmacyresponse.status)
                    {
                    default:
                        TransferRxPrescriptionInfoPresenter.access$1200(this$0, 2);
                        return;

                    case 1: // '\001'
                        pharmacyresponse = new OrderConfirmationTransferPresenter(TransferRxPrescriptionInfoPresenter.access$700(this$0), TransferRxPrescriptionInfoPresenter.access$800(this$0));
                        getPresenterStack().popToRoot();
                        TransferRxPrescriptionInfoPresenter.access$900(this$0, pharmacyresponse);
                        MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmacyTransferOrderConfirmation"));
                        return;

                    case 1008: 
                        TransferRxPrescriptionInfoPresenter.access$1000(this$0);
                        break;
                    }
                    TransferRxPrescriptionInfoPresenter.access$1100(this$0, 3);
                    return;
                } else
                {
                    TransferRxPrescriptionInfoPresenter.access$1300(this$0, 2);
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

                    
                    {
                        this$1 = TransferRxPrescriptionInfoPresenter._cls2.this;
                        super(handler);
                    }
        }

    }

}
