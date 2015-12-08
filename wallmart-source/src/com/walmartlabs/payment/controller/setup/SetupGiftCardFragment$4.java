// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import android.content.DialogInterface;
import android.view.View;

// Referenced classes of package com.walmartlabs.payment.controller.setup:
//            SetupGiftCardFragment, SetupGiftCardAdapter, SetupCardData

class this._cls0
    implements android.view.tup.SetupGiftCardFragment._cls4
{

    final SetupGiftCardFragment this$0;

    public void onClick(View view)
    {
        if (SetupGiftCardFragment.access$100(SetupGiftCardFragment.this) != null)
        {
            if (SetupGiftCardFragment.access$100(SetupGiftCardFragment.this).hasEnabledGiftCards() || SetupCardData.getInstance().hasCreditCardPayData())
            {
                nextStep();
                return;
            } else
            {
                (new com.walmart.android.ui.r(getActivity())).setTitle(com.walmartlabs.android.payment.onfirm_title).setMessage(com.walmartlabs.android.payment.onfirm_msg).setNegativeButton(com.walmartlabs.android.payment.o_back, new android.content.DialogInterface.OnClickListener() {

                    final SetupGiftCardFragment._cls4 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.dismiss();
                    }

            
            {
                this$1 = SetupGiftCardFragment._cls4.this;
                super();
            }
                }).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                    final SetupGiftCardFragment._cls4 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        nextStep();
                    }

            
            {
                this$1 = SetupGiftCardFragment._cls4.this;
                super();
            }
                }).show();
                return;
            }
        } else
        {
            nextStep();
            return;
        }
    }

    _cls2.this._cls1()
    {
        this$0 = SetupGiftCardFragment.this;
        super();
    }
}
