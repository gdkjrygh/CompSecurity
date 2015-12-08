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

class this._cls0 extends OnSingleClickListener
{

    final MobilePaySettingsFragment this$0;

    public void onSingleClick(View view)
    {
        if (!CreditCardsModel.get().hasCreditCards() && MobilePaySettingsFragment.access$100(MobilePaySettingsFragment.this).getTotalBalance() <= 0.0F)
        {
            (new com.walmart.android.ui.nit>(getActivity())).tTitle(com.walmartlabs.android.payment.rm_title).tMessage(com.walmartlabs.android.payment.rm_msg).tNegativeButton(com.walmartlabs.android.payment.ck, new android.content.DialogInterface.OnClickListener() {

                final MobilePaySettingsFragment._cls2 this$1;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.dismiss();
                }

            
            {
                this$1 = MobilePaySettingsFragment._cls2.this;
                super();
            }
            }).tPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final MobilePaySettingsFragment._cls2 this$1;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    MobilePaySettingsFragment.access$200(this$0);
                }

            
            {
                this$1 = MobilePaySettingsFragment._cls2.this;
                super();
            }
            }).ow();
            return;
        } else
        {
            MobilePaySettingsFragment.access$200(MobilePaySettingsFragment.this);
            return;
        }
    }

    _cls2.this._cls1()
    {
        this$0 = MobilePaySettingsFragment.this;
        super();
    }
}
