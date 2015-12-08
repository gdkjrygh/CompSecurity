// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.SharedPreferencesUtil;

// Referenced classes of package com.walmart.android.app.ereceipt:
//            EReceiptRegisterInputPresenter

class this._cls0 extends OnSingleClickListener
{

    final EReceiptRegisterInputPresenter this$0;

    public void onSingleClick(View view)
    {
        if (!EReceiptRegisterInputPresenter.access$300(EReceiptRegisterInputPresenter.this))
        {
            clearSingleClickFlag();
        } else
        {
            view = PhoneNumberUtils.stripSeparators(EReceiptRegisterInputPresenter.access$400(EReceiptRegisterInputPresenter.this).getText().toString());
            EReceiptRegisterInputPresenter.access$500(EReceiptRegisterInputPresenter.this, view);
            MessageBus.getBus().post((new com.walmartlabs.anivia.esenter("registerAction")).ng("action", "register"));
            if (!TextUtils.isEmpty(SharedPreferencesUtil.getEReceiptPhoneNumber(EReceiptRegisterInputPresenter.access$200(EReceiptRegisterInputPresenter.this))))
            {
                MessageBus.getBus().post(new com.walmartlabs.anivia.esenter("requestResendCode"));
                return;
            }
        }
    }

    (Presenter presenter)
    {
        this$0 = EReceiptRegisterInputPresenter.this;
        super(presenter);
    }
}
