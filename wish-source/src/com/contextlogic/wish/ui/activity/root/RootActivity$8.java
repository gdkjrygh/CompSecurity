// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import com.contextlogic.wish.ui.fragment.notifications.NotificationsFragment;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity

class cationsFragment
    implements Runnable
{

    final RootActivity this$0;
    final NotificationsFragment val$fragment;

    public void run()
    {
        setContentFragment(val$fragment, false);
    }

    cationsFragment()
    {
        this$0 = final_rootactivity;
        val$fragment = NotificationsFragment.this;
        super();
    }
}
