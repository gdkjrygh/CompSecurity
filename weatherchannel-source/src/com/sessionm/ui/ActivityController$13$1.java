// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.view.animation.Animation;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class this._cls1
    implements Runnable
{

    final eBrowserView this$1;

    public void run()
    {
        if (ActivityController.access$500(_fld0) == .DISMISSED)
        {
            return;
        } else
        {
            removeBrowserView();
            return;
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/sessionm/ui/ActivityController$13

/* anonymous class */
    class ActivityController._cls13
        implements android.view.animation.Animation.AnimationListener
    {

        final ActivityController this$0;

        public void onAnimationEnd(Animation animation)
        {
            getActivityContext().runOnUiThread(new ActivityController._cls13._cls1());
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

            
            {
                this$0 = ActivityController.this;
                super();
            }
    }

}
