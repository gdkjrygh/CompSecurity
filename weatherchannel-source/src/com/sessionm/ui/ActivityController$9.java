// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            ActivityController, SessionMViewContainer

class 
    implements Runnable
{

    final ActivityController this$0;
    final SessionMViewContainer val$view;

    public void run()
    {
        if (val$view == ActivityController.access$1000(ActivityController.this))
        {
            dismissBrowser();
            return;
        } else
        {
            dismiss();
            return;
        }
    }

    ()
    {
        this$0 = final_activitycontroller;
        val$view = SessionMViewContainer.this;
        super();
    }
}
