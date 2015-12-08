// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import com.sessionm.b.a;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class val.message
    implements Runnable
{

    final ActivityController this$0;
    final a val$message;

    public void run()
    {
        synchronized (ActivityController.access$000(ActivityController.this))
        {
            ActivityController.access$1700(ActivityController.this, val$message);
        }
        return;
        exception;
        session;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ()
    {
        this$0 = final_activitycontroller;
        val$message = a.this;
        super();
    }
}
