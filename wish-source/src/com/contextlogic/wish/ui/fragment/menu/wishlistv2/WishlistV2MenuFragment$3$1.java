// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu.wishlistv2;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.menu.wishlistv2:
//            WishlistV2MenuFragment

class val.nextOffset
    implements Runnable
{

    final val.nextOffset this$1;
    final ArrayList val$items;
    final int val$nextOffset;
    final boolean val$noMoreItems;

    public void run()
    {
        WishlistV2MenuFragment.access$200(_fld0, val$items, val$noMoreItems, val$nextOffset);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$items = arraylist;
        val$noMoreItems = flag;
        val$nextOffset = I.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/menu/wishlistv2/WishlistV2MenuFragment$3

/* anonymous class */
    class WishlistV2MenuFragment._cls3
        implements com.contextlogic.wish.api.service.GetWishlistFeedService.SuccessCallback
    {

        final WishlistV2MenuFragment this$0;

        public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, int i)
        {
            WishlistV2MenuFragment.access$102(WishlistV2MenuFragment.this, true);
            postDelayed(i. new WishlistV2MenuFragment._cls3._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = WishlistV2MenuFragment.this;
                super();
            }
    }

}
