// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.util.Log;

// Referenced classes of package com.sessionm.ui:
//            ActivityController, SessionMViewContainer

class val.content
    implements Runnable
{

    final ActivityController this$0;
    final String val$baseUrl;
    final String val$content;

    public void run()
    {
        if (getState() == ate.DISMISSED)
        {
            return;
        }
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", (new StringBuilder()).append("Start web view loading, url: ").append(val$baseUrl).toString());
        }
        if (Log.isLoggable("SessionM.Activity", 2))
        {
            Log.v("SessionM.Activity", (new StringBuilder()).append("Web view content: ").append(val$content).toString());
        }
        ActivityController.access$400(ActivityController.this, ate.LOADING_WEBVIEW);
        getViewContainer().loadContent(val$baseUrl, val$content);
    }

    ()
    {
        this$0 = final_activitycontroller;
        val$baseUrl = s;
        val$content = String.this;
        super();
    }
}
