// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;

import android.content.DialogInterface;
import android.view.View;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.view.OnSingleClickListener;

// Referenced classes of package com.walmartlabs.payment.controller.settings:
//            MobilePaySettingsFragment, GiftCardState

class this._cls1
    implements android.content.r
{

    final this._cls1 this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/payment/controller/settings/MobilePaySettingsFragment$2

/* anonymous class */
    class MobilePaySettingsFragment._cls2 extends OnSingleClickListener
    {

        final MobilePaySettingsFragment this$0;

        public void onSingleClick(View view)
        {
            if (!CreditCardsModel.get().hasCreditCards() && MobilePaySettingsFragment.access$100(MobilePaySettingsFragment.this).getTotalBalance() <= 0.0F)
            {
                (new com.walmart.android.ui.CustomAlertDialog.Builder(getActivity())).setTitle(com.walmartlabs.android.payment.R.string.mpay_setup_gc_confirm_title).setMessage(com.walmartlabs.android.payment.R.string.mpay_setup_gc_confirm_msg).setNegativeButton(com.walmartlabs.android.payment.R.string.mpay_setup_gc_go_back, new MobilePaySettingsFragment._cls2._cls2()).setPositiveButton(0x104000a, new MobilePaySettingsFragment._cls2._cls1()).show();
                return;
            } else
            {
                MobilePaySettingsFragment.access$200(MobilePaySettingsFragment.this);
                return;
            }
        }

            
            {
                this$0 = MobilePaySettingsFragment.this;
                super();
            }

        // Unreferenced inner class com/walmartlabs/payment/controller/settings/MobilePaySettingsFragment$2$1

/* anonymous class */
        class MobilePaySettingsFragment._cls2._cls1
            implements android.content.DialogInterface.OnClickListener
        {

            final MobilePaySettingsFragment._cls2 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                MobilePaySettingsFragment.access$200(this$0);
            }

                    
                    {
                        this$1 = MobilePaySettingsFragment._cls2.this;
                        super();
                    }
        }

    }

}
