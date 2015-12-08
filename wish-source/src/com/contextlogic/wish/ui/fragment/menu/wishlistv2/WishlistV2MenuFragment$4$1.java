// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu.wishlistv2;


// Referenced classes of package com.contextlogic.wish.ui.fragment.menu.wishlistv2:
//            WishlistV2MenuFragment

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        WishlistV2MenuFragment.access$300(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/menu/wishlistv2/WishlistV2MenuFragment$4

/* anonymous class */
    class WishlistV2MenuFragment._cls4
        implements com.contextlogic.wish.api.service.ApiService.FailureCallback
    {

        final WishlistV2MenuFragment this$0;

        public void onServiceFailed()
        {
            postDelayed(new WishlistV2MenuFragment._cls4._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = WishlistV2MenuFragment.this;
                super();
            }
    }

}
