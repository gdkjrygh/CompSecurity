// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import com.contextlogic.wish.ui.fragment.wallet.WalletFragment;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity

class t
    implements Runnable
{

    final RootActivity this$0;
    final WalletFragment val$fragment;

    public void run()
    {
        setContentFragment(val$fragment, false);
    }

    t()
    {
        this$0 = final_rootactivity;
        val$fragment = WalletFragment.this;
        super();
    }
}
