// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// Referenced classes of package bolts:
//            Continuation, Task, CancellationToken, Capture

class ect
    implements Continuation
{

    final Task this$0;
    final Continuation val$continuation;
    final CancellationToken val$ct;
    final Executor val$executor;
    final Callable val$predicate;
    final Capture val$predicateContinuation;

    public Task then(Task task)
        throws Exception
    {
        if (val$ct != null && val$ct.isCancellationRequested())
        {
            return Task.cancelled();
        }
        if (((Boolean)val$predicate.call()).booleanValue())
        {
            return Task.forResult(null).onSuccessTask(val$continuation, val$executor).onSuccessTask((Continuation)val$predicateContinuation.get(), val$executor);
        } else
        {
            return Task.forResult(null);
        }
    }

    public volatile Object then(Task task)
        throws Exception
    {
        return then(task);
    }

    ()
    {
        this$0 = final_task;
        val$ct = cancellationtoken;
        val$predicate = callable;
        val$continuation = continuation1;
        val$executor = executor1;
        val$predicateContinuation = Capture.this;
        super();
    }
}
