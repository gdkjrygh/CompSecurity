// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile;

import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.ui.activity.root.ProfileImageUploadCallback;

// Referenced classes of package com.contextlogic.wish.ui.fragment.profile:
//            ProfileFragment

class this._cls0
    implements ProfileImageUploadCallback
{

    final ProfileFragment this$0;

    public void onFailure(boolean flag)
    {
        if (!flag)
        {
            ProfileFragment.access$1000(ProfileFragment.this);
        }
    }

    public void onSuccess(WishUser wishuser)
    {
        ProfileFragment.access$400(ProfileFragment.this);
    }

    back()
    {
        this$0 = ProfileFragment.this;
        super();
    }
}
