// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;

import android.app.Dialog;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.model.GiftCardsModel;
import com.walmartlabs.payment.service.payment.UserCardsResponse;
import java.util.List;

// Referenced classes of package com.walmartlabs.payment.controller.settings:
//            MobilePaySettingsFragment

class this._cls0 extends CallbackSameThread
{

    final MobilePaySettingsFragment this$0;

    public void onResultSameThread(Request request, Result result)
    {
        MobilePaySettingsFragment.access$300(MobilePaySettingsFragment.this).remove(request);
        if (result.successful() && result.hasData() && !((UserCardsResponse)result.getData()).hasClientErrorMessage())
        {
            CreditCardsModel.get().setCreditCards(((UserCardsResponse)result.getData()).getCreditCards());
            GiftCardsModel.get().setGiftCards(true, ((UserCardsResponse)result.getData()).getGiftCards());
        } else
        if (result.hasError() && result.getError().())
        {
            DialogFactory.createAlertDialog(getString(com.walmartlabs.android.payment.), getString(com.walmartlabs.android.payment.ge), getActivity()).show();
        } else
        {
            DialogFactory.createAlertDialog(getString(com.walmartlabs.android.payment.e), getActivity()).show();
        }
        MobilePaySettingsFragment.access$400(MobilePaySettingsFragment.this);
        MobilePaySettingsFragment.access$500(MobilePaySettingsFragment.this);
    }

    ()
    {
        this$0 = MobilePaySettingsFragment.this;
        super();
    }
}
