// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu.wishlistv2;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.menu.wishlistv2:
//            WishlistV2MenuFragment

class this._cls0
    implements com.contextlogic.wish.api.service.ccessCallback
{

    final WishlistV2MenuFragment this$0;

    public void onServiceSucceeded(final ArrayList items, final boolean noMoreItems, final int nextOffset)
    {
        WishlistV2MenuFragment.access$102(WishlistV2MenuFragment.this, true);
        postDelayed(new Runnable() {

            final WishlistV2MenuFragment._cls3 this$1;
            final ArrayList val$items;
            final int val$nextOffset;
            final boolean val$noMoreItems;

            public void run()
            {
                WishlistV2MenuFragment.access$200(this$0, items, noMoreItems, nextOffset);
            }

            
            {
                this$1 = WishlistV2MenuFragment._cls3.this;
                items = arraylist;
                noMoreItems = flag;
                nextOffset = i;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.val.nextOffset()
    {
        this$0 = WishlistV2MenuFragment.this;
        super();
    }
}
