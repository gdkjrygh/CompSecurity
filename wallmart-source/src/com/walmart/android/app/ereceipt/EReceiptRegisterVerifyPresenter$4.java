// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.app.account.AccountListener;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.TextUtils;
import com.walmartlabs.ereceipt.service.WalletStatus;

// Referenced classes of package com.walmart.android.app.ereceipt:
//            EReceiptRegisterVerifyPresenter

class this._cls0 extends AsyncCallbackOnThread
{

    final EReceiptRegisterVerifyPresenter this$0;

    public void onFailureSameThread(Integer integer, WalletStatus walletstatus)
    {
        EReceiptRegisterVerifyPresenter.access$500(EReceiptRegisterVerifyPresenter.this, 2);
        if (integer.intValue() >= 0x15f90)
        {
            if (integer.intValue() == 0x15f92)
            {
                EReceiptRegisterVerifyPresenter.access$600(EReceiptRegisterVerifyPresenter.this, 3);
                return;
            } else
            {
                EReceiptRegisterVerifyPresenter.access$700(EReceiptRegisterVerifyPresenter.this, 4);
                return;
            }
        }
        if (walletstatus != null && walletstatus.retriesRemaining <= 0)
        {
            integer = new Bundle();
            integer.putInt("waitWindowMinutes", walletstatus.waitWindowMinutes);
            EReceiptRegisterVerifyPresenter.access$800(EReceiptRegisterVerifyPresenter.this, 1, integer);
            integer = (new com.walmartlabs.anivia.esenter("pageView")).g("name", "Error").g("section", "Saver").g("subCategory", "Error").g("errorMessage", EReceiptRegisterVerifyPresenter.access$200(EReceiptRegisterVerifyPresenter.this).getString(0x7f0900e5, new Object[] {
                Integer.valueOf(walletstatus.waitWindowMinutes)
            }));
            MessageBus.getBus().post(integer);
            return;
        } else
        {
            EReceiptRegisterVerifyPresenter.access$900(EReceiptRegisterVerifyPresenter.this, 0);
            integer = (new com.walmartlabs.anivia.esenter("pageView")).g("name", "Error").g("section", "Saver").g("subCategory", "Error").g("errorMessage", TextUtils.truncate("Oops! The code you entered is not valid. Please check the text message we sent you and enter the code again now", 60));
            MessageBus.getBus().post(integer);
            return;
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (WalletStatus)obj1);
    }

    public void onSuccessSameThread(WalletStatus walletstatus)
    {
        EReceiptRegisterVerifyPresenter.access$1000(EReceiptRegisterVerifyPresenter.this, 2);
        if (EReceiptRegisterVerifyPresenter.access$1100(EReceiptRegisterVerifyPresenter.this) != null)
        {
            EReceiptRegisterVerifyPresenter.access$1100(EReceiptRegisterVerifyPresenter.this).onLoginCompleted(false, false, false);
        }
        walletstatus = new com.walmartlabs.anivia.mpleted("phoneNumberAdd");
        MessageBus.getBus().post(walletstatus);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((WalletStatus)obj);
    }

    (Handler handler)
    {
        this$0 = EReceiptRegisterVerifyPresenter.this;
        super(handler);
    }
}
