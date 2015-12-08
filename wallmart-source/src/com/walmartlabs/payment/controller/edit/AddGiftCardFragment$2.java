// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.view.View;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.model.GiftCard;
import com.walmartlabs.payment.model.GiftCardsModel;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            AddGiftCardFragment

class this._cls0 extends CallbackSameThread
{

    final AddGiftCardFragment this$0;

    public void onResultSameThread(Request request, Result result)
    {
        if (getView() != null)
        {
            ViewUtil.findViewById(getView(), com.walmartlabs.android.payment.n).setEnabled(true);
        }
        if (result.successful() && result.hasData() && !((GiftCard)result.getData()).hasClientErrorMessage())
        {
            GiftCardsModel.get().updateGiftCard((GiftCard)result.getData());
            if (isVisible())
            {
                ((llbacks)AddGiftCardFragment.access$300(AddGiftCardFragment.this)).onGiftCardCreated();
            }
            return;
        } else
        {
            ErrorHandlingUtil.handleResponseError(getActivity(), result, com.walmartlabs.android.payment.ard_err);
            return;
        }
    }

    llbacks()
    {
        this$0 = AddGiftCardFragment.this;
        super();
    }
}
