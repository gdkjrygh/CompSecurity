// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;

import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.model.GiftCardsModel;
import java.util.List;

// Referenced classes of package com.walmartlabs.payment.controller.settings:
//            MobilePaySettingsFragment, GiftCardState

class this._cls0 extends CallbackSameThread
{

    final MobilePaySettingsFragment this$0;

    public void onResultSameThread(Request request, Result result)
    {
        MobilePaySettingsFragment.access$300(MobilePaySettingsFragment.this).remove(request);
        if (result.successful())
        {
            GiftCardsModel.get().setGiftCards(true, MobilePaySettingsFragment.access$100(MobilePaySettingsFragment.this).getGiftCards());
            MobilePaySettingsFragment.access$900(MobilePaySettingsFragment.this).setGcDone(true);
            return;
        } else
        {
            ErrorHandlingUtil.handleResponseError(getActivity(), result);
            return;
        }
    }

    neCheck()
    {
        this$0 = MobilePaySettingsFragment.this;
        super();
    }
}
