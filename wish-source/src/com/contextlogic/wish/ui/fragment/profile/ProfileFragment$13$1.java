// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile;

import com.contextlogic.wish.api.data.WishUser;

// Referenced classes of package com.contextlogic.wish.ui.fragment.profile:
//            ProfileFragment

class val.user
    implements Runnable
{

    final val.user this$1;
    final WishUser val$user;

    public void run()
    {
        ProfileFragment.access$1700(_fld0, val$user);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$user = WishUser.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/profile/ProfileFragment$13

/* anonymous class */
    class ProfileFragment._cls13
        implements com.contextlogic.wish.api.service.GetProfileService.SuccessCallback
    {

        final ProfileFragment this$0;

        public void onServiceSucceeded(WishUser wishuser)
        {
            postDelayed(wishuser. new ProfileFragment._cls13._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
    }

}
