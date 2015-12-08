// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile;

import com.contextlogic.wish.api.data.WishUser;

// Referenced classes of package com.contextlogic.wish.ui.fragment.profile:
//            ProfileFragment

class this._cls0
    implements com.contextlogic.wish.api.service.uccessCallback
{

    final ProfileFragment this$0;

    public void onServiceSucceeded(final WishUser user)
    {
        postDelayed(new Runnable() {

            final ProfileFragment._cls15 this$1;
            final WishUser val$user;

            public void run()
            {
                ProfileFragment.access$1700(this$0, user);
            }

            
            {
                this$1 = ProfileFragment._cls15.this;
                user = wishuser;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.val.user()
    {
        this$0 = ProfileFragment.this;
        super();
    }
}
