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
//            ProfileImageUploadCallback, RootActivity

class this._cls0
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
        final ProfileFragment fragment = new ProfileFragment();
        fragment.setForceRefresh(true);
        Bundle bundle = new Bundle();
        LoggedInUser.getInstance().refreshProfile();
        bundle.putString("ArgUser", RuntimeStateStore.getInstance().storeState(wishuser, null));
        fragment.setArguments(bundle);
        RootActivity.access$300(RootActivity.this).post(new Runnable() {

            final RootActivity._cls24 this$1;
            final ProfileFragment val$fragment;

            public void run()
            {
                setContentFragment(fragment, true);
                closeMenus();
            }

            
            {
                this$1 = RootActivity._cls24.this;
                fragment = profilefragment;
                super();
            }
        });
    }

    _cls1.val.fragment()
    {
        this$0 = RootActivity.this;
        super();
    }
}
