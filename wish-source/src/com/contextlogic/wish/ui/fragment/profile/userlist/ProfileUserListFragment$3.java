// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile.userlist;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.profile.userlist:
//            ProfileUserListFragment

class this._cls0
    implements com.contextlogic.wish.api.service.cessCallback
{

    final ProfileUserListFragment this$0;

    public void onServiceSucceeded(ArrayList arraylist, boolean flag)
    {
        ProfileUserListFragment.access$200(ProfileUserListFragment.this, arraylist, flag);
    }

    ()
    {
        this$0 = ProfileUserListFragment.this;
        super();
    }
}
