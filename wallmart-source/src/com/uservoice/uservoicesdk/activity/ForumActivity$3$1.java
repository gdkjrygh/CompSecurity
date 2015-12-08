// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            ForumActivity

class this._cls1
    implements Runnable
{

    final odelAdapter this$1;

    public void run()
    {
        if (ForumActivity.access$000(_fld0) != null)
        {
            getModelAdapter().reload();
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/uservoice/uservoicesdk/activity/ForumActivity$3

/* anonymous class */
    class ForumActivity._cls3
        implements Runnable
    {

        final ForumActivity this$0;

        public void run()
        {
            ForumActivity.access$100(ForumActivity.this);
            Session.getInstance().setSignInListener(new ForumActivity._cls3._cls1());
        }

            
            {
                this$0 = ForumActivity.this;
                super();
            }
    }

}
