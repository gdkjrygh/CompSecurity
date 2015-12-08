// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            ForumActivity

class this._cls0
    implements Runnable
{

    final ForumActivity this$0;

    public void run()
    {
        ForumActivity.access$100(ForumActivity.this);
        Session.getInstance().setSignInListener(new Runnable() {

            final ForumActivity._cls3 this$1;

            public void run()
            {
                if (ForumActivity.access$000(this$0) != null)
                {
                    getModelAdapter().reload();
                }
            }

            
            {
                this$1 = ForumActivity._cls3.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = ForumActivity.this;
        super();
    }
}
