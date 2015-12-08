// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.util.Log;
import java.util.Locale;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class this._cls1
    implements areListener
{

    final layView this$1;

    public void onFailure(Throwable throwable)
    {
        dismiss();
    }

    public void onPrepared()
    {
        displayView();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/sessionm/ui/ActivityController$4

/* anonymous class */
    class ActivityController._cls4
        implements Runnable
    {

        final ActivityController this$0;

        public void run()
        {
            if (Log.isLoggable("SessionM.Activity", 3))
            {
                Log.d("SessionM.Activity", String.format(Locale.US, "Present activity, fullScreen: %b, URL: %s ", new Object[] {
                    Boolean.valueOf(isFullScreenActivity()), ActivityController.access$100(ActivityController.this)
                }));
            }
            prepare(new ActivityController._cls4._cls1());
        }

            
            {
                this$0 = ActivityController.this;
                super();
            }
    }

}
