// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;

import android.app.Dialog;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.CreditCardsModel;
import java.util.List;

// Referenced classes of package com.walmartlabs.payment.controller.settings:
//            MobilePaySettingsFragment

class this._cls0 extends CallbackSameThread
{

    final MobilePaySettingsFragment this$0;

    public void onResultSameThread(Request request, Result result)
    {
        MobilePaySettingsFragment.access$300(MobilePaySettingsFragment.this).remove(request);
        if (result.successful() && result.hasData() && !((CreditCard)result.getData()).hasClientErrorMessage())
        {
            CreditCardsModel.get().updateCreditCard((CreditCard)result.getData());
            MobilePaySettingsFragment.access$900(MobilePaySettingsFragment.this).setCcDone(true);
            return;
        }
        if (result.hasData() && ((CreditCard)result.getData()).hasClientErrorMessage())
        {
            ErrorHandlingUtil.handleResponseError(getActivity(), result);
            return;
        }
        if (result.hasError() && result.getError().())
        {
            DialogFactory.createAlertDialog(getString(com.walmartlabs.android.payment.), getString(com.walmartlabs.android.payment.ge), getActivity()).show();
            return;
        } else
        {
            DialogFactory.createAlertDialog(getString(com.walmartlabs.android.payment.e), getActivity()).show();
            return;
        }
    }

    neCheck()
    {
        this$0 = MobilePaySettingsFragment.this;
        super();
    }
}
