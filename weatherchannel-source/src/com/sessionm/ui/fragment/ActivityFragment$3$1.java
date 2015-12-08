// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui.fragment;

import android.app.Activity;
import com.sessionm.ui.LoaderView;

// Referenced classes of package com.sessionm.ui.fragment:
//            ActivityFragment, FragmentActivityController

class this._cls1
    implements Runnable
{

    final ILED this$1;

    public void run()
    {
        ActivityFragment.access$200(_fld0).setLoaderViewStatus(com.sessionm.ui.Status.FAILED);
    }

    oller()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/sessionm/ui/fragment/ActivityFragment$3

/* anonymous class */
    class ActivityFragment._cls3
        implements com.sessionm.ui.ActivityController.PrepareListener
    {

        final ActivityFragment this$0;
        final FragmentActivityController val$activityController;

        public void onFailure(Throwable throwable)
        {
            activityController.getActivityContext().runOnUiThread(new ActivityFragment._cls3._cls1());
        }

        public void onPrepared()
        {
            ActivityFragment.access$100(ActivityFragment.this);
        }

            
            {
                this$0 = final_activityfragment;
                activityController = FragmentActivityController.this;
                super();
            }
    }

}
