// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.os.Bundle;
import android.os.Handler;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.fragment.profile.ProfileFragment;
import com.contextlogic.wish.user.LoggedInUser;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity, ProfileImageUploadCallback

class 
    implements Runnable
{

    final Menus this$1;
    final ProfileFragment val$fragment;

    public void run()
    {
        setContentFragment(val$fragment, true);
        closeMenus();
    }

    ()
    {
        this$1 = final_;
        val$fragment = ProfileFragment.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/activity/root/RootActivity$24

/* anonymous class */
    class RootActivity._cls24
        implements ProfileImageUploadCallback
    {

        final RootActivity this$0;

        public void onFailure(boolean flag)
        {
            if (!flag)
            {
                RootActivity.access$400(RootActivity.this);
            }
        }

        public void onSuccess(WishUser wishuser)
        {
            ProfileFragment profilefragment = new ProfileFragment();
            profilefragment.setForceRefresh(true);
            Bundle bundle = new Bundle();
            LoggedInUser.getInstance().refreshProfile();
            bundle.putString("ArgUser", RuntimeStateStore.getInstance().storeState(wishuser, null));
            profilefragment.setArguments(bundle);
            RootActivity.access$300(RootActivity.this).post(profilefragment. new RootActivity._cls24._cls1());
        }

            
            {
                this$0 = RootActivity.this;
                super();
            }
    }

}
