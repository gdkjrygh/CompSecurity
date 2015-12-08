// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import com.sessionm.b.a;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class val.message
    implements com.sessionm.core.l.message
{

    final ActivityController this$0;
    final a val$message;

    public void onOptInFailed()
    {
        a a1 = a.aJ();
        a1.put("error", "There was an error opting back in.");
        finishMessageHandling(val$message, a1);
    }

    public void onOptInSucceeded()
    {
        finishMessageHandling(val$message, null);
    }

    ()
    {
        this$0 = final_activitycontroller;
        val$message = a.this;
        super();
    }
}
