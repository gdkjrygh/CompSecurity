// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.model.GiftCard;
import com.walmartlabs.payment.model.GiftCardsModel;
import com.walmartlabs.ui.LoadingContainerView;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            EditGiftCardFragment

class this._cls0 extends CallbackSameThread
{

    final EditGiftCardFragment this$0;

    public void onResultSameThread(Request request, Result result)
    {
        EditGiftCardFragment.access$100(EditGiftCardFragment.this).setContentState();
        if (result.getStatusCode() == 204)
        {
            GiftCardsModel.get().deleteGiftCard(EditGiftCardFragment.access$200(EditGiftCardFragment.this).id);
            ((llbacks)EditGiftCardFragment.access$300(EditGiftCardFragment.this)).onGiftCardDeleted();
            return;
        } else
        {
            ErrorHandlingUtil.handleResponseError(getActivity(), result, com.walmartlabs.android.payment._card_err);
            return;
        }
    }

    llbacks()
    {
        this$0 = EditGiftCardFragment.this;
        super();
    }
}
