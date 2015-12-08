// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import android.content.DialogInterface;
import android.view.View;

// Referenced classes of package com.walmartlabs.payment.controller.setup:
//            SetupGiftCardFragment, SetupGiftCardAdapter, SetupCardData

class this._cls1
    implements android.content.tener
{

    final Step this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        nextStep();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/payment/controller/setup/SetupGiftCardFragment$4

/* anonymous class */
    class SetupGiftCardFragment._cls4
        implements android.view.View.OnClickListener
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
                    (new com.walmart.android.ui.CustomAlertDialog.Builder(getActivity())).setTitle(com.walmartlabs.android.payment.R.string.mpay_setup_gc_confirm_title).setMessage(com.walmartlabs.android.payment.R.string.mpay_setup_gc_confirm_msg).setNegativeButton(com.walmartlabs.android.payment.R.string.mpay_setup_gc_go_back, new SetupGiftCardFragment._cls4._cls2()).setPositiveButton(0x104000a, new SetupGiftCardFragment._cls4._cls1()).show();
                    return;
                }
            } else
            {
                nextStep();
                return;
            }
        }

            
            {
                this$0 = SetupGiftCardFragment.this;
                super();
            }

        // Unreferenced inner class com/walmartlabs/payment/controller/setup/SetupGiftCardFragment$4$2

/* anonymous class */
        class SetupGiftCardFragment._cls4._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            final SetupGiftCardFragment._cls4 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

                    
                    {
                        this$1 = SetupGiftCardFragment._cls4.this;
                        super();
                    }
        }

    }

}
