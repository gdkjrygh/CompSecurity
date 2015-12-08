// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity

class val.fromAppLink
    implements Runnable
{

    final RootActivity this$0;
    final BaseContentFragment val$fragment;
    final boolean val$fromAppLink;

    public void run()
    {
        setContentFragment(val$fragment, val$fromAppLink);
    }

    ent()
    {
        this$0 = final_rootactivity;
        val$fragment = basecontentfragment;
        val$fromAppLink = Z.this;
        super();
    }
}
