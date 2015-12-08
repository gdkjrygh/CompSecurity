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

class val.message extends c
{

    final ActivityController this$0;
    final a val$message;
    final String val$url;

    public void onReplyReceived(final Request request)
    {
        Activity activity = getActivityContext();
        if (activity == null)
        {
            return;
        } else
        {
            activity.runOnUiThread(new Runnable() {

                final ActivityController._cls20 this$1;
                final Request val$request;

                public void run()
                {
                    if (Log.isLoggable("SessionM.Activity", 3))
                    {
                        Log.d("SessionM.Activity", String.format("Finished make request for url : %s", new Object[] {
                            url
                        }));
                    }
                    if (request.bd().equals(com.sessionm.net.Request.State.gI))
                    {
                        a a = request.aZ();
                        finishMessageHandling(message, a);
                        return;
                    } else
                    {
                        notifyContentAboutError(ActivityController.ContentError.MAKE_REQUEST_ERROR, request.getURL());
                        return;
                    }
                }

            
            {
                this$1 = ActivityController._cls20.this;
                request = request1;
                super();
            }
            });
            return;
        }
    }

    _cls1.val.request()
    {
        this$0 = final_activitycontroller;
        val$url = s;
        val$message = a.this;
        super();
    }
}
