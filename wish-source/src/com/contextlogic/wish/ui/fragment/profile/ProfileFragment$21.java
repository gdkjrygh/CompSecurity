// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile;

import com.contextlogic.wish.ui.fragment.profile.wishes.ProfileWishesFragment;

// Referenced classes of package com.contextlogic.wish.ui.fragment.profile:
//            ProfileFragment

class this._cls0
    implements Runnable
{

    final ProfileFragment this$0;

    public void run()
    {
        ProfileFragment.access$300(ProfileFragment.this).refresh();
    }

    sFragment()
    {
        this$0 = ProfileFragment.this;
        super();
    }
}
