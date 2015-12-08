// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            Continuation, Task, CancellationToken

class ct
    implements Continuation
{

    final Task this$0;
    final Continuation val$continuation;
    final CancellationToken val$ct;

    public Task then(Task task)
    {
        if (val$ct != null && val$ct.isCancellationRequested())
        {
            return Task.cancelled();
        }
        if (task.isFaulted())
        {
            return Task.forError(task.getError());
        }
        if (task.isCancelled())
        {
            return Task.cancelled();
        } else
        {
            return task.continueWithTask(val$continuation);
        }
    }

    public volatile Object then(Task task)
        throws Exception
    {
        return then(task);
    }

    tion()
    {
        this$0 = final_task;
        val$ct = cancellationtoken;
        val$continuation = Continuation.this;
        super();
    }
}
