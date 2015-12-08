// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.os.Bundle;
import com.squareup.otto.Bus;
import com.walmart.android.events.CloseFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.payment.controller.mpay.MobilePayController;
import com.walmartlabs.payment.controller.pin.MobilePayPinController;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.service.mpay.MobilePayPreferences;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.fragments:
//            MobilePayFragment

class this._cls1
    implements com.walmartlabs.payment.service.mpay.nfoInterface
{

    final is._cls0 this$1;

    public void onGetUserInfo(boolean flag)
    {
        WLog.d(MobilePayFragment.access$000(), (new StringBuilder()).append("User isSetup = ").append(flag).toString());
        if (flag)
        {
            Bundle bundle = getDynamicArguments();
            if (bundle != null && bundle.getString("transaction_id") != null)
            {
                WLog.d(MobilePayFragment.access$000(), "Transaction id is non-null");
                com.walmartlabs.payment.service.payment.Transaction transaction = MobilePayPreferences.getSavedTransaction(getActivity());
                if (transaction != null)
                {
                    WLog.d(MobilePayFragment.access$000(), "Saved transaction found");
                    MobilePayController.startTransactionConfirmation(_fld0, 7, transaction, bundle.getString("transaction_id"));
                    MobilePayPreferences.clearSavedTransaction(getActivity());
                    return;
                } else
                {
                    WLog.d(MobilePayFragment.access$000(), "Saved transaction not found");
                    MessageBus.getBus().post(new CloseFragmentEvent());
                    return;
                }
            } else
            {
                MobilePayPinController.launchPin(_fld0, 2);
                return;
            }
        } else
        {
            MobilePayController.startValueProposition(_fld0, 4);
            return;
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/fragments/MobilePayFragment$1

/* anonymous class */
    class MobilePayFragment._cls1
        implements com.walmart.android.wmservice.Authentication.AuthCallback
    {

        final MobilePayFragment this$0;

        public void onFailure(int i)
        {
            MobilePayController.startValueProposition(MobilePayFragment.this, 4);
        }

        public void onSuccess()
        {
            MobilePayManager.get().getUserInfo(new MobilePayFragment._cls1._cls1());
        }

            
            {
                this$0 = MobilePayFragment.this;
                super();
            }
    }

}
