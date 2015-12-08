// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//            Continuation, CancellationToken, Task

class 
    implements Continuation
{

    final sult this$0;

    public volatile Object then(Task task)
        throws Exception
    {
        return then(task);
    }

    public Void then(Task task)
    {
        if (ct != null && ct.isCancellationRequested())
        {
            tcs.setCancelled();
            return null;
        }
        if (task.isCancelled())
        {
            tcs.setCancelled();
            return null;
        }
        if (task.isFaulted())
        {
            tcs.setError(task.getError());
            return null;
        } else
        {
            tcs.setResult(task.getResult());
            return null;
        }
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }

    // Unreferenced inner class bolts/Task$14

/* anonymous class */
    static final class Task._cls14
        implements Runnable
    {

        final Continuation val$continuation;
        final CancellationToken val$ct;
        final Task val$task;
        final Task.TaskCompletionSource val$tcs;

        public void run()
        {
            if (ct != null && ct.isCancellationRequested())
            {
                tcs.setCancelled();
                return;
            }
            Object obj = (Task)continuation.then(task);
            if (obj == null)
            {
                try
                {
                    tcs.setResult(null);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    tcs.setCancelled();
                    return;
                }
                catch (Exception exception)
                {
                    tcs.setError(exception);
                }
                break MISSING_BLOCK_LABEL_87;
            }
            ((Task) (obj)).continueWith(new Task._cls14._cls1());
            return;
        }

            
            {
                ct = cancellationtoken;
                tcs = taskcompletionsource;
                continuation = continuation1;
                task = task1;
                super();
            }
    }

}
