// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.apps;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.apps:
//            AppListFragment

class this._cls0
    implements com.contextlogic.wish.api.service.SuccessCallback
{

    final AppListFragment this$0;

    public void onServiceSucceeded(final ArrayList apps)
    {
        postDelayed(new Runnable() {

            final AppListFragment._cls2 this$1;
            final ArrayList val$apps;

            public void run()
            {
                AppListFragment.access$100(this$0, apps);
            }

            
            {
                this$1 = AppListFragment._cls2.this;
                apps = arraylist;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.val.apps()
    {
        this$0 = AppListFragment.this;
        super();
    }
}
