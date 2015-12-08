// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c;

import android.os.Message;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.jiubang.core.c:
//            a, f, g

class d extends FutureTask
{

    final a a;

    d(a a1, Callable callable)
    {
        a = a1;
        super(callable);
    }

    protected void done()
    {
        Object obj = null;
        Object obj2 = get();
        obj = obj2;
_L2:
        com.jiubang.core.c.a.d().obtainMessage(1, new f(a, new Object[] {
            obj
        })).sendToTarget();
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        Log.w("WeatherAsyncTask", interruptedexception);
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1;
        throw new RuntimeException("An error occured while executing doInBackground()", ((ExecutionException) (obj1)).getCause());
        obj1;
        com.jiubang.core.c.a.d().obtainMessage(3, new f(a, (Object[])null)).sendToTarget();
        return;
        obj1;
        throw new RuntimeException("An error occured while executing doInBackground()", ((Throwable) (obj1)));
    }
}
