// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.apps;


// Referenced classes of package com.contextlogic.wish.ui.fragment.apps:
//            AppListFragment

class this._cls0
    implements com.contextlogic.wish.api.service.Callback
{

    final AppListFragment this$0;

    public void onServiceFailed()
    {
        postDelayed(new Runnable() {

            final AppListFragment._cls3 this$1;

            public void run()
            {
                AppListFragment.access$200(this$0);
            }

            
            {
                this$1 = AppListFragment._cls3.this;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.this._cls1()
    {
        this$0 = AppListFragment.this;
        super();
    }
}
