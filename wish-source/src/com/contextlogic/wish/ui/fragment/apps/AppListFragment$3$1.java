// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.apps;


// Referenced classes of package com.contextlogic.wish.ui.fragment.apps:
//            AppListFragment

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        AppListFragment.access$200(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/apps/AppListFragment$3

/* anonymous class */
    class AppListFragment._cls3
        implements com.contextlogic.wish.api.service.ApiService.FailureCallback
    {

        final AppListFragment this$0;

        public void onServiceFailed()
        {
            postDelayed(new AppListFragment._cls3._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = AppListFragment.this;
                super();
            }
    }

}
