// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;


// Referenced classes of package com.walmartlabs.payment.controller.settings:
//            MobilePaySettingsFragment, GiftCardAdapter, GiftCardState

class this._cls0
    implements stener
{

    final MobilePaySettingsFragment this$0;

    public void onSwitched(int i, boolean flag)
    {
        GiftCardState giftcardstate = MobilePaySettingsFragment.access$100(MobilePaySettingsFragment.this);
        com.walmartlabs.payment.model.GiftCard giftcard = MobilePaySettingsFragment.access$700(MobilePaySettingsFragment.this).getItem(i);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        giftcardstate.optOut(giftcard, flag);
        MobilePaySettingsFragment.access$800(MobilePaySettingsFragment.this);
    }

    stener()
    {
        this$0 = MobilePaySettingsFragment.this;
        super();
    }
}
