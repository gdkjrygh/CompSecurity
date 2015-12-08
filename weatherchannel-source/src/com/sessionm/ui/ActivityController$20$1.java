// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.util.Log;
import com.sessionm.b.a;
import com.sessionm.net.Request;
import com.sessionm.net.c;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class val.request
    implements Runnable
{

    final val.request this$1;
    final Request val$request;

    public void run()
    {
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", String.format("Finished make request for url : %s", new Object[] {
                url
            }));
        }
        if (val$request.bd().request(com.sessionm.net.al.request))
        {
            a a = val$request.aZ();
            finishMessageHandling(message, a);
            return;
        } else
        {
            notifyContentAboutError(ntError.MAKE_REQUEST_ERROR, val$request.getURL());
            return;
        }
    }

    l.message()
    {
        this$1 = final_message;
        val$request = Request.this;
        super();
    }

    // Unreferenced inner class com/sessionm/ui/ActivityController$20

/* anonymous class */
    class ActivityController._cls20 extends c
    {

        final ActivityController this$0;
        final a val$message;
        final String val$url;

        public void onReplyReceived(Request request1)
        {
            Activity activity = getActivityContext();
            if (activity == null)
            {
                return;
            } else
            {
                activity.runOnUiThread(request1. new ActivityController._cls20._cls1());
                return;
            }
        }

            
            {
                this$0 = final_activitycontroller;
                url = s;
                message = a.this;
                super();
            }
    }

}
