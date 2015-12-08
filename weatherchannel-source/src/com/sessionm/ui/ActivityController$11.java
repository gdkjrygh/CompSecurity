// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import com.sessionm.b.a;
import com.sessionm.core.Session;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class val.url
    implements pareListener
{

    final ActivityController this$0;
    final ActivityController val$controller;
    final a val$message;
    final String val$url;

    public void onFailure(Throwable throwable)
    {
        if (getState() == te.DISMISSED)
        {
            return;
        } else
        {
            notifyContentAboutError(tentError.WEBVIEW_LOAD_ERROR, val$url);
            finishMessageHandling(val$message, null);
            return;
        }
    }

    public void onPrepared()
    {
        getActivityContext().runOnUiThread(new Runnable() {

            final ActivityController._cls11 this$1;

            public void run()
            {
                if (getState() == ActivityController.State.DISMISSED)
                {
                    return;
                } else
                {
                    finishMessageHandling(message, null);
                    replaceDisplayContainer(controller);
                    ActivityController.access$000(this$0).b(this$0);
                    ActivityController.access$400(this$0, ActivityController.State.DISMISSED);
                    return;
                }
            }

            
            {
                this$1 = ActivityController._cls11.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = final_activitycontroller;
        val$message = a;
        val$controller = activitycontroller1;
        val$url = String.this;
        super();
    }
}
