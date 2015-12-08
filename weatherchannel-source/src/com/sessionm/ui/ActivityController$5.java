// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.util.Log;
import com.sessionm.core.Session;

// Referenced classes of package com.sessionm.ui:
//            ActivityController, SessionMActivity

class val.notifyActivityListener
    implements Runnable
{

    final ActivityController this$0;
    final boolean val$notifyActivityListener;

    public void run()
    {
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", String.format("Dismiss called with current state: %s", new Object[] {
                ActivityController.access$500(ActivityController.this)
            }));
        }
        if (ate.DISMISSED != ActivityController.access$500(ActivityController.this))
        {
            if (ActivityController.access$500(ActivityController.this) == ate.UNPRESENTABLE)
            {
                if (val$notifyActivityListener)
                {
                    ActivityController.access$000(ActivityController.this).au();
                }
                ActivityController.access$400(ActivityController.this, ate.DISMISSED);
                ActivityController.access$000(ActivityController.this).b(ActivityController.this);
                if (isFullScreenActivity())
                {
                    ((SessionMActivity)getActivityContext()).finish(false);
                    return;
                }
            }
            ActivityController.access$400(ActivityController.this, ate.DISMISSING);
            if (isBrowserDisplayed())
            {
                dismissBrowser();
                notifyActivityPaused();
            }
            notifyActivityPaused();
            if (isFullScreenActivity())
            {
                ((SessionMActivity)getActivityContext()).finish(false);
            }
            removeView(ActivityController.access$600(ActivityController.this));
            ActivityController.access$602(ActivityController.this, null);
            if (Log.isLoggable("SessionM.Activity", 3))
            {
                Log.d("SessionM.Activity", "Destroyed view container.");
            }
            ActivityController.access$000(ActivityController.this).b(ActivityController.this);
            boolean flag;
            if (val$notifyActivityListener && getState() == ate.DISMISSING)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ActivityController.access$400(ActivityController.this, ate.DISMISSED);
            if (Log.isLoggable("SessionM", 4))
            {
                Log.i("SessionM", String.format("Dismissed activity, fullScreen: %b url: %s", new Object[] {
                    Boolean.valueOf(isFullScreenActivity()), ActivityController.access$100(ActivityController.this)
                }));
            }
            if (flag)
            {
                ActivityController.access$000(ActivityController.this).au();
                return;
            }
        }
    }

    ate()
    {
        this$0 = final_activitycontroller;
        val$notifyActivityListener = Z.this;
        super();
    }
}
