// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.wallet;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.wallet:
//            WalletFragment

class val.noMoreItems
    implements Runnable
{

    final val.noMoreItems this$1;
    final ArrayList val$items;
    final boolean val$noMoreItems;

    public void run()
    {
        WalletFragment.access$400(_fld0, val$items, val$noMoreItems);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$items = arraylist;
        val$noMoreItems = Z.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/wallet/WalletFragment$5

/* anonymous class */
    class WalletFragment._cls5
        implements com.contextlogic.wish.api.service.GetWalletItemsService.SuccessCallback
    {

        final WalletFragment this$0;

        public void onServiceSucceeded(final ArrayList items, boolean flag)
        {
            WalletFragment.access$302(WalletFragment.this, true);
            postDelayed(flag. new WalletFragment._cls5._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = WalletFragment.this;
                super();
            }
    }

}
