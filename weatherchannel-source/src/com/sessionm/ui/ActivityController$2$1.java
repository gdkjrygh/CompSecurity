// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.util.Log;
import com.sessionm.net.Request;
import com.sessionm.net.c;
import com.sessionm.net.http.d;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class val.request
    implements Runnable
{

    final val.request this$1;
    final Request val$request;

    public void run()
    {
        if (val$request.aT() == null)
        {
            if (getState() == e.DISMISSED || getState() == e.DISMISSING)
            {
                return;
            }
            if (val$request.aU() != null)
            {
                setActivityContent(val$request.aU().bD());
            }
            loadContentListener.onContentLoaded(val$request.getURL(), ActivityController.access$300(_fld0));
            return;
        }
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", (new StringBuilder()).append("Failed to load activity content, reason: ").append(val$request.aT().getMessage()).toString());
        }
        ActivityController.access$400(_fld0, e.UNPRESENTABLE);
        loadContentListener.onFailure(val$request.aT());
    }

    ContentListener()
    {
        this$1 = final_contentlistener;
        val$request = Request.this;
        super();
    }

    // Unreferenced inner class com/sessionm/ui/ActivityController$2

/* anonymous class */
    class ActivityController._cls2 extends c
    {

        final ActivityController this$0;
        final ActivityController.LoadContentListener val$loadContentListener;

        public void onReplyReceived(Request request1)
        {
            getActivityContext().runOnUiThread(request1. new ActivityController._cls2._cls1());
        }

            
            {
                this$0 = final_activitycontroller;
                loadContentListener = ActivityController.LoadContentListener.this;
                super();
            }
    }

}
