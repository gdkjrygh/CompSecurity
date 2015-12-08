// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import android.app.Activity;
import android.os.Handler;
import android.widget.EditText;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.ui.FloatLabel;

// Referenced classes of package com.walmart.android.app.ereceipt:
//            EReceiptRegisterInputPresenter, EReceiptRegisterVerifyPresenter

class val.phoneNumber extends AsyncCallbackOnThread
{

    final EReceiptRegisterInputPresenter this$0;
    final String val$phoneNumber;

    public void onFailureSameThread(Integer integer, Boolean boolean1)
    {
        clearSingleClickFlag();
        EReceiptRegisterInputPresenter.access$600(EReceiptRegisterInputPresenter.this, 1);
        if (integer.intValue() >= 0x15f90)
        {
            if (integer.intValue() == 0x15f92)
            {
                EReceiptRegisterInputPresenter.access$700(EReceiptRegisterInputPresenter.this, 2);
                return;
            } else
            {
                EReceiptRegisterInputPresenter.access$800(EReceiptRegisterInputPresenter.this, 3);
                return;
            }
        } else
        {
            EReceiptRegisterInputPresenter.access$900();
            EReceiptRegisterInputPresenter.access$1000(EReceiptRegisterInputPresenter.this).setError(0x7f0900df);
            EReceiptRegisterInputPresenter.access$400(EReceiptRegisterInputPresenter.this).setBackgroundResource(EReceiptRegisterInputPresenter.access$1100(EReceiptRegisterInputPresenter.this));
            EReceiptRegisterInputPresenter.access$400(EReceiptRegisterInputPresenter.this).requestFocus();
            return;
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (Boolean)obj1);
    }

    public void onSuccessSameThread(Boolean boolean1)
    {
        EReceiptRegisterInputPresenter.access$900();
        EReceiptRegisterInputPresenter.access$1200(EReceiptRegisterInputPresenter.this, 1);
        SharedPreferencesUtil.setEReceiptPhoneNumber(EReceiptRegisterInputPresenter.access$200(EReceiptRegisterInputPresenter.this), val$phoneNumber);
        if (EReceiptRegisterInputPresenter.access$1300(EReceiptRegisterInputPresenter.this))
        {
            boolean1 = new EReceiptRegisterVerifyPresenter(EReceiptRegisterInputPresenter.access$200(EReceiptRegisterInputPresenter.this), val$phoneNumber, false);
            boolean1.setAccountListener(EReceiptRegisterInputPresenter.access$100(EReceiptRegisterInputPresenter.this));
            EReceiptRegisterInputPresenter.access$1400(EReceiptRegisterInputPresenter.this, boolean1);
            EReceiptRegisterInputPresenter.access$1500(EReceiptRegisterInputPresenter.this);
            return;
        } else
        {
            EReceiptRegisterInputPresenter.access$200(EReceiptRegisterInputPresenter.this).onBackPressed();
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((Boolean)obj);
    }

    (String s)
    {
        this$0 = final_ereceiptregisterinputpresenter;
        val$phoneNumber = s;
        super(Handler.this);
    }
}
