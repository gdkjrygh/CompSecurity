// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            ActivityController

class val.description
    implements Runnable
{

    final ActivityController this$0;
    final String val$description;

    public void run()
    {
        ActivityController.access$1100(ActivityController.this).onFailure(new Throwable(val$description));
        ActivityController.access$1102(ActivityController.this, null);
    }

    dWebViewListener()
    {
        this$0 = final_activitycontroller;
        val$description = String.this;
        super();
    }
}
