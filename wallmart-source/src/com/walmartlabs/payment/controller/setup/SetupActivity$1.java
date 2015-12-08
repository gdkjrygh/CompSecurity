// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import android.view.View;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.model.GiftCardsModel;
import com.walmartlabs.payment.service.customer.CardResponse;

// Referenced classes of package com.walmartlabs.payment.controller.setup:
//            SetupActivity

class val.fragmentName extends CallbackSameThread
{

    final SetupActivity this$0;
    final String val$fragmentName;

    public void onResultSameThread(Request request, Result result)
    {
        SetupActivity.access$000(SetupActivity.this).setVisibility(8);
        if (result.successful() && result.hasData() && !((CardResponse)result.getData()).hasClientErrorMessage())
        {
            GiftCardsModel.get().setGiftCards(((CardResponse)result.getData()).getGiftCards());
            CreditCardsModel.get().setCreditCards(((CardResponse)result.getData()).getCreditCards());
            if (val$fragmentName == null || val$fragmentName.isEmpty())
            {
                if (CreditCardsModel.get().hasCreditCards())
                {
                    SetupActivity.access$100(SetupActivity.this);
                    return;
                } else
                {
                    SetupActivity.access$200(SetupActivity.this);
                    return;
                }
            } else
            {
                SetupActivity.access$300(SetupActivity.this, val$fragmentName);
                return;
            }
        } else
        {
            ErrorHandlingUtil.handleResponseError(SetupActivity.this, result);
            return;
        }
    }

    ()
    {
        this$0 = final_setupactivity;
        val$fragmentName = String.this;
        super();
    }
}
