// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity

class edFragment
    implements Runnable
{

    final RootActivity this$0;
    final ProductFeedFragment val$fragment;

    public void run()
    {
        setContentFragment(val$fragment, false);
    }

    edFragment()
    {
        this$0 = final_rootactivity;
        val$fragment = ProductFeedFragment.this;
        super();
    }
}
