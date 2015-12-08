// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, StatusResponse, RedeemResponse, RedeemRequest, 
//            SaverService

class nit> extends AsyncCallbackOnThread
{

    final onSuccessSameThread this$1;
    final RedeemResponse val$result;

    public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
    {
        WLog.e(SaverManager.access$1200(), (new StringBuilder()).append("Redeem failed. Error: ").append(integer).toString());
        if (callback != null)
        {
            callback.onFailure(integer, val$result);
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (StatusResponse)obj1);
    }

    public void onSuccessSameThread(StatusResponse statusresponse)
    {
        WLog.e(SaverManager.access$1200(), "Redeem success");
        if (callback != null)
        {
            callback.onSuccess(val$result);
        }
        SaverManager.access$800(_fld0).post(new Runnable() {

            final SaverManager._cls20._cls1 this$2;

            public void run()
            {
                setSaverSummary(null, true);
                syncAll(true);
            }

            
            {
                this$2 = SaverManager._cls20._cls1.this;
                super();
            }
        });
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((StatusResponse)obj);
    }

    l.callback(RedeemResponse redeemresponse)
    {
        this$1 = final_callback;
        val$result = redeemresponse;
        super(Handler.this);
    }

    // Unreferenced inner class com/walmart/android/service/saver/SaverManager$20

/* anonymous class */
    class SaverManager._cls20
        implements SaverManager.ResultCallback
    {

        final SaverManager this$0;
        final boolean val$bluebird;
        final AsyncCallback val$callback;
        final boolean val$firstTime;

        public void onResult(Boolean boolean1)
        {
            Object obj = getSaverSummary();
            if (boolean1.booleanValue() && obj != null)
            {
                boolean1 = new RedeemResponse();
                boolean flag;
                if (bluebird)
                {
                    boolean1.redeemedTotalCents = ((ReceiptsSummaryResponse.OverallSavingsSummary) (obj)).bluebirdRedeemableCents;
                } else
                {
                    boolean1.redeemedTotalCents = ((ReceiptsSummaryResponse.OverallSavingsSummary) (obj)).redeemableCents;
                }
                if (!((ReceiptsSummaryResponse.OverallSavingsSummary) (obj)).hasSaverGiftCard)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                boolean1.giftCardCreated = flag;
                obj = new RedeemRequest();
                if (bluebird)
                {
                    obj.method = RedeemRequest.Method.AMEX.name();
                } else
                if (firstTime)
                {
                    obj.method = RedeemRequest.Method.GCActivate.name();
                } else
                {
                    obj.method = RedeemRequest.Method.GCReload.name();
                }
                SaverManager.access$400(SaverManager.this).redeem(((RedeemRequest) (obj)), SaverManager.access$800(SaverManager.this). new SaverManager._cls20._cls1(boolean1));
            } else
            if (callback != null)
            {
                callback.onFailure(Integer.valueOf(0x15f91), null);
                return;
            }
        }

        public volatile void onResult(Object obj)
        {
            onResult((Boolean)obj);
        }

            
            {
                this$0 = final_savermanager;
                bluebird = flag;
                firstTime = flag1;
                callback = AsyncCallback.this;
                super();
            }
    }

}
