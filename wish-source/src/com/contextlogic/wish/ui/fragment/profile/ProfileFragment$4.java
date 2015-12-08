// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile;


// Referenced classes of package com.contextlogic.wish.ui.fragment.profile:
//            ProfileFragment

class this._cls0
    implements android.support.v4.widget..OnRefreshListener
{

    final ProfileFragment this$0;

    public void onRefresh()
    {
        trackEvent(com.contextlogic.wish.analytics.e.Refresh, com.contextlogic.wish.analytics.e.Scroll);
        ProfileFragment.access$400(ProfileFragment.this);
    }

    er()
    {
        this$0 = ProfileFragment.this;
        super();
    }
}
