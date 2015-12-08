// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.os.Handler;

// Referenced classes of package com.urbanairship.actions:
//            ActionRunner, Action, ActionArguments, ActionCompletionCallback

class nCallback
    implements Runnable
{

    final ActionRunner this$0;
    final Action val$action;
    final ActionArguments val$arguments;
    final ActionCompletionCallback val$completionCallback;
    final Handler val$handler;

    public void run()
    {
        ActionResult actionresult = val$action.run(null, val$arguments);
        ActionRunner.access$000(ActionRunner.this, val$handler, val$completionCallback, actionresult);
    }

    nCallback()
    {
        this$0 = final_actionrunner;
        val$action = action1;
        val$arguments = actionarguments;
        val$handler = handler1;
        val$completionCallback = ActionCompletionCallback.this;
        super();
    }
}
