// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//            Task, CancellationToken, Continuation

static final class ct
    implements Runnable
{

    final Continuation val$continuation;
    final CancellationToken val$ct;
    final Task val$task;
    final kCompletionSource val$tcs;

    public void run()
    {
        if (val$ct != null && val$ct.isCancellationRequested())
        {
            val$tcs.setCancelled();
            return;
        }
        Object obj = (Task)val$continuation.then(val$task);
        if (obj == null)
        {
            try
            {
                val$tcs.setResult(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                val$tcs.setCancelled();
                return;
            }
            catch (Exception exception)
            {
                val$tcs.setError(exception);
            }
            break MISSING_BLOCK_LABEL_87;
        }
        ((Task) (obj)).continueWith(new Continuation() {

            final Task._cls14 this$0;

            public volatile Object then(Task task1)
                throws Exception
            {
                return then(task1);
            }

            public Void then(Task task1)
            {
                if (ct != null && ct.isCancellationRequested())
                {
                    tcs.setCancelled();
                    return null;
                }
                if (task1.isCancelled())
                {
                    tcs.setCancelled();
                    return null;
                }
                if (task1.isFaulted())
                {
                    tcs.setError(task1.getError());
                    return null;
                } else
                {
                    tcs.setResult(task1.getResult());
                    return null;
                }
            }

            
            {
                this$0 = Task._cls14.this;
                super();
            }
        });
        return;
    }

    tion(CancellationToken cancellationtoken, kCompletionSource kcompletionsource, Continuation continuation1, Task task1)
    {
        val$ct = cancellationtoken;
        val$tcs = kcompletionsource;
        val$continuation = continuation1;
        val$task = task1;
        super();
    }
}
