// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.controller.settings.GiftCardState;
import com.walmartlabs.payment.controller.setup.SetupCallbacks;
import com.walmartlabs.payment.controller.setup.SetupCardData;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.service.payment.CreateUserRequest;
import com.walmartlabs.payment.service.payment.SetGiftCardsRequest;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            TermsConditionsFragment

class this._cls1 extends CallbackSameThread
{

    final ctivity this$1;

    public void onResultSameThread(Request request, Result result)
    {
        TermsConditionsFragment.access$000(_fld0).setVisibility(8);
        if (result.successful() && result.hasData())
        {
            TermsConditionsFragment.access$100(_fld0).onTermsConditionsAccepted();
            return;
        } else
        {
            ErrorHandlingUtil.handleResponseError(getActivity(), result);
            return;
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/payment/controller/mpay/TermsConditionsFragment$2

/* anonymous class */
    class TermsConditionsFragment._cls2
        implements android.view.View.OnClickListener
    {

        final TermsConditionsFragment this$0;

        public void onClick(View view)
        {
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("mobilePayTC")).putString("name", "agree"));
            view = new CreateUserRequest();
            view.giftCards = SetGiftCardsRequest.makeRequestData(SetupCardData.getInstance().getGiftCardState().getGiftCards());
            if (((CreateUserRequest) (view)).giftCards == null)
            {
                view.giftCards = new com.walmartlabs.payment.service.payment.SetGiftCardsRequest.GiftCardData[0];
            }
            TermsConditionsFragment.access$000(TermsConditionsFragment.this).setVisibility(0);
            MobilePayManager.get().createUser(view, new TermsConditionsFragment._cls2._cls1());
        }

            
            {
                this$0 = TermsConditionsFragment.this;
                super();
            }
    }

}
