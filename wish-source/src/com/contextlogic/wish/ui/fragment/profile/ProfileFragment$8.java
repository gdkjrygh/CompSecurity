// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile;

import android.view.View;
import com.contextlogic.wish.api.service.LogService;

// Referenced classes of package com.contextlogic.wish.ui.fragment.profile:
//            ProfileFragment

class this._cls0
    implements android.view.er
{

    final ProfileFragment this$0;

    public void onClick(View view)
    {
        (new LogService()).requestService("1385", null, null, null);
        trackClick(com.contextlogic.wish.analytics.e.ProfileFollowersSelected);
        ProfileFragment.access$800(ProfileFragment.this, true);
    }

    A()
    {
        this$0 = ProfileFragment.this;
        super();
    }
}
