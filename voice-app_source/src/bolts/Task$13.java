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
        try
        {
            Object obj = val$continuation.then(val$task);
            val$tcs.setResult(obj);
            return;
        }
        catch (CancellationException cancellationexception)
        {
            val$tcs.setCancelled();
            return;
        }
        catch (Exception exception)
        {
            val$tcs.setError(exception);
        }
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
