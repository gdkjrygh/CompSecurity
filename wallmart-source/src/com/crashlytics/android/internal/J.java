// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.crashlytics.android.internal:
//            U, Y, ab, K, 
//            D, r, N, V, 
//            H, aK, av

final class J
    implements U
{

    private final ScheduledExecutorService a;
    private final K b;
    private final av c;
    private ScheduledFuture d;
    private int e;
    private N f;

    public J(ScheduledExecutorService scheduledexecutorservice, K k, av av)
    {
        e = -1;
        a = scheduledexecutorservice;
        b = k;
        c = av;
    }

    private void a(int i, int j)
    {
        try
        {
            Y y = new Y(b, this);
            ab.c((new StringBuilder("Scheduling time based file roll over every ")).append(j).append(" seconds").toString());
            d = a.scheduleAtFixedRate(y, i, j, TimeUnit.SECONDS);
            return;
        }
        catch (RejectedExecutionException rejectedexecutionexception)
        {
            ab.d("Crashlytics failed to schedule time based analytics file roll over");
        }
    }

    public final void a()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        ab.c("skipping analytics files send because we don't yet know the target endpoint");
_L6:
        return;
_L2:
        Object obj;
        int i;
        ab.c("Sending all analytics files");
        obj = b.b();
        i = 0;
_L4:
        int k;
        int l;
        k = i;
        l = i;
        if (((List) (obj)).size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = i;
        boolean flag = f.a(r.a(D.a().getContext(), false), ((List) (obj)));
        int j;
        j = i;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        k = i;
        j = ((List) (obj)).size();
        i = j + i;
        b.a(((List) (obj)));
        j = i;
        k = j;
        Locale locale = Locale.US;
        k = j;
        i = ((List) (obj)).size();
        if (flag)
        {
            obj = "succeeded";
        } else
        {
            obj = "did not succeed";
        }
        k = j;
        ab.c(String.format(locale, "attempt to send batch of %d analytics files %s", new Object[] {
            Integer.valueOf(i), obj
        }));
        l = j;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = j;
        obj = b.b();
        i = j;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        i = k;
_L7:
        ab.d((new StringBuilder("Crashlytics failed to send batch of analytics files to server: ")).append(exception.getMessage()).toString());
        l = i;
        if (l != 0) goto _L6; else goto _L5
_L5:
        b.d();
        return;
        exception;
          goto _L7
    }

    public final void a(V v)
    {
        boolean flag1 = true;
        ab.c(v.toString());
        boolean flag;
        try
        {
            b.a(v);
        }
        // Misplaced declaration of an exception variable
        catch (V v)
        {
            ab.d("Crashlytics failed to write session event.");
        }
        if (e != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d != null)
        {
            flag1 = false;
        }
        if (flag && flag1)
        {
            a(e, e);
        }
    }

    public final void a(aK ak, String s)
    {
        f = new H(s, ak.a, c);
        b.a(ak);
        e = ak.b;
        a(0, e);
    }

    public final void b()
    {
        b.c();
    }

    public final void c()
    {
        if (d != null)
        {
            ab.c("Cancelling time-based rollover because no events are currently being generated.");
            d.cancel(false);
            d = null;
        }
    }

    public final void d()
    {
        try
        {
            b.a();
            return;
        }
        catch (IOException ioexception)
        {
            ab.d("Crashlytics failed to roll analytics file over.");
        }
    }
}
