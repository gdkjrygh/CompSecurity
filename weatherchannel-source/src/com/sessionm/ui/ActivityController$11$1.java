// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import com.sessionm.b.a;
import com.sessionm.core.Session;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class this._cls1
    implements Runnable
{

    final .DISMISSED this$1;

    public void run()
    {
        if (getState() == .DISMISSED)
        {
            return;
        } else
        {
            finishMessageHandling(message, null);
            replaceDisplayContainer(controller);
            ActivityController.access$000(_fld0).b(_fld0);
            ActivityController.access$400(_fld0, .DISMISSED);
            return;
        }
    }

    l.url()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/sessionm/ui/ActivityController$11

/* anonymous class */
    class ActivityController._cls11
        implements ActivityController.PrepareListener
    {

        final ActivityController this$0;
        final ActivityController val$controller;
        final a val$message;
        final String val$url;

        public void onFailure(Throwable throwable)
        {
            if (getState() == ActivityController.State.DISMISSED)
            {
                return;
            } else
            {
                notifyContentAboutError(ActivityController.ContentError.WEBVIEW_LOAD_ERROR, url);
                finishMessageHandling(message, null);
                return;
            }
        }

        public void onPrepared()
        {
            getActivityContext().runOnUiThread(new ActivityController._cls11._cls1());
        }

            
            {
                this$0 = final_activitycontroller;
                message = a;
                controller = activitycontroller1;
                url = String.this;
                super();
            }
    }

}
