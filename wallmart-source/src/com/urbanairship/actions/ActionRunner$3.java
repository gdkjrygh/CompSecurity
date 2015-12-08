// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;


// Referenced classes of package com.urbanairship.actions:
//            ActionRunner, ActionCompletionCallback, ActionResult

class val.result
    implements Runnable
{

    final ActionRunner this$0;
    final ActionCompletionCallback val$callback;
    final ActionResult val$result;

    public void run()
    {
        val$callback.onFinish(val$result);
    }

    nCallback()
    {
        this$0 = final_actionrunner;
        val$callback = actioncompletioncallback;
        val$result = ActionResult.this;
        super();
    }
}
