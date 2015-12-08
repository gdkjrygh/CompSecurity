// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import android.os.Process;

class val.r
    implements Runnable
{

    final val.r this$1;
    final Runnable val$r;

    public void run()
    {
        Process.setThreadPriority(10);
        val$r.run();
    }

    ()
    {
        this$1 = final_;
        val$r = Runnable.this;
        super();
    }
}
