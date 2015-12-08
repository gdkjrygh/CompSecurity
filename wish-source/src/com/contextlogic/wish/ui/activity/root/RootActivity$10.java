// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import com.contextlogic.wish.ui.fragment.login.email.EmailChangePasswordFragment;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity

class gePasswordFragment
    implements Runnable
{

    final RootActivity this$0;
    final EmailChangePasswordFragment val$fragment;

    public void run()
    {
        setContentFragment(val$fragment, false);
        closeMenus();
    }

    gePasswordFragment()
    {
        this$0 = final_rootactivity;
        val$fragment = EmailChangePasswordFragment.this;
        super();
    }
}
