// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu.wishlistv2;


// Referenced classes of package com.contextlogic.wish.ui.fragment.menu.wishlistv2:
//            WishlistV2MenuFragment

class this._cls0
    implements com.contextlogic.wish.api.service.k
{

    final WishlistV2MenuFragment this$0;

    public void onServiceFailed()
    {
        postDelayed(new Runnable() {

            final WishlistV2MenuFragment._cls4 this$1;

            public void run()
            {
                WishlistV2MenuFragment.access$300(this$0);
            }

            
            {
                this$1 = WishlistV2MenuFragment._cls4.this;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.this._cls1()
    {
        this$0 = WishlistV2MenuFragment.this;
        super();
    }
}
