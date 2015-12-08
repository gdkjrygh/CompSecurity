// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.apps;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.apps:
//            AppListFragment

class val.apps
    implements Runnable
{

    final val.apps this$1;
    final ArrayList val$apps;

    public void run()
    {
        AppListFragment.access$100(_fld0, val$apps);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$apps = ArrayList.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/apps/AppListFragment$2

/* anonymous class */
    class AppListFragment._cls2
        implements com.contextlogic.wish.api.service.GetAppListService.SuccessCallback
    {

        final AppListFragment this$0;

        public void onServiceSucceeded(ArrayList arraylist)
        {
            postDelayed(arraylist. new AppListFragment._cls2._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = AppListFragment.this;
                super();
            }
    }

}
