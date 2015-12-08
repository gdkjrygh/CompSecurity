// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.tour.listediting;

import android.os.Bundle;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.profile.ProfileFragment;
import com.contextlogic.wish.user.LoggedInUser;

// Referenced classes of package com.contextlogic.wish.ui.fragment.tour.listediting:
//            ListEditingTourFragment

class this._cls0
    implements Runnable
{

    final ListEditingTourFragment this$0;

    public void run()
    {
        RootActivity rootactivity = (RootActivity)getActivity();
        ProfileFragment profilefragment = new ProfileFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ArgUser", RuntimeStateStore.getInstance().storeState(LoggedInUser.getInstance().getCurrentUser(), null));
        profilefragment.setArguments(bundle);
        rootactivity.setContentFragment(profilefragment, false);
        rootactivity.closeMenus();
    }

    ()
    {
        this$0 = ListEditingTourFragment.this;
        super();
    }
}
