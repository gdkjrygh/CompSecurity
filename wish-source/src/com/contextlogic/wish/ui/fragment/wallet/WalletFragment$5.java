// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.wallet;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.wallet:
//            WalletFragment

class this._cls0
    implements com.contextlogic.wish.api.service.vice.SuccessCallback
{

    final WalletFragment this$0;

    public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems)
    {
        WalletFragment.access$302(WalletFragment.this, true);
        postDelayed(new Runnable() {

            final WalletFragment._cls5 this$1;
            final ArrayList val$items;
            final boolean val$noMoreItems;

            public void run()
            {
                WalletFragment.access$400(this$0, items, noMoreItems);
            }

            
            {
                this$1 = WalletFragment._cls5.this;
                items = arraylist;
                noMoreItems = flag;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.val.noMoreItems()
    {
        this$0 = WalletFragment.this;
        super();
    }
}
