// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            Task, Continuation

static final class ct
    implements Runnable
{

    final Continuation val$continuation;
    final Task val$task;
    final kCompletionSource val$tcs;

    public void run()
    {
        Task task1 = (Task)val$continuation.then(val$task);
        if (task1 == null)
        {
            try
            {
                val$tcs.setResult(null);
                return;
            }
            catch (Exception exception)
            {
                val$tcs.setError(exception);
            }
            break MISSING_BLOCK_LABEL_53;
        }
        task1.continueWith(new Continuation() {

            final Task._cls10 this$0;

            public volatile Object then(Task task2)
                throws Exception
            {
                return then(task2);
            }

            public Void then(Task task2)
            {
                if (task2.isCancelled())
                {
                    tcs.setCancelled();
                } else
                if (task2.isFaulted())
                {
                    tcs.setError(task2.getError());
                } else
                {
                    tcs.setResult(task2.getResult());
                }
                return null;
            }

            
            {
                this$0 = Task._cls10.this;
                super();
            }
        });
        return;
    }

    rce(Continuation continuation1, Task task1, kCompletionSource kcompletionsource)
    {
        val$continuation = continuation1;
        val$task = task1;
        val$tcs = kcompletionsource;
        super();
    }
}
