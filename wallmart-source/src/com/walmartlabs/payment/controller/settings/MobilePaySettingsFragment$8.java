// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;

import android.content.DialogInterface;
import com.walmartlabs.payment.model.CreditCard;

// Referenced classes of package com.walmartlabs.payment.controller.settings:
//            MobilePaySettingsFragment, CreditCardsState

class editCardAdapter
    implements android.content.ner
{

    final MobilePaySettingsFragment this$0;
    final editCardAdapter val$mAdapter;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        MobilePaySettingsFragment.access$1100(MobilePaySettingsFragment.this).setDefaultCreditCard((CreditCard)val$mAdapter.getItem(i));
        MobilePaySettingsFragment.access$400(MobilePaySettingsFragment.this);
    }

    editCardAdapter()
    {
        this$0 = final_mobilepaysettingsfragment;
        val$mAdapter = editCardAdapter.this;
        super();
    }
}
