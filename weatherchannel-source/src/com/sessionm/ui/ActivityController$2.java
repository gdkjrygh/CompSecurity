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

class adContentListener extends c
{

    final ActivityController this$0;
    final adContentListener val$loadContentListener;

    public void onReplyReceived(final Request request)
    {
        getActivityContext().runOnUiThread(new Runnable() {

            final ActivityController._cls2 this$1;
            final Request val$request;

            public void run()
            {
                if (request.aT() == null)
                {
                    if (getState() == ActivityController.State.DISMISSED || getState() == ActivityController.State.DISMISSING)
                    {
                        return;
                    }
                    if (request.aU() != null)
                    {
                        setActivityContent(request.aU().bD());
                    }
                    loadContentListener.onContentLoaded(request.getURL(), ActivityController.access$300(this$0));
                    return;
                }
                if (Log.isLoggable("SessionM.Activity", 3))
                {
                    Log.d("SessionM.Activity", (new StringBuilder()).append("Failed to load activity content, reason: ").append(request.aT().getMessage()).toString());
                }
                ActivityController.access$400(this$0, ActivityController.State.UNPRESENTABLE);
                loadContentListener.onFailure(request.aT());
            }

            
            {
                this$1 = ActivityController._cls2.this;
                request = request1;
                super();
            }
        });
    }

    adContentListener()
    {
        this$0 = final_activitycontroller;
        val$loadContentListener = adContentListener.this;
        super();
    }
}
