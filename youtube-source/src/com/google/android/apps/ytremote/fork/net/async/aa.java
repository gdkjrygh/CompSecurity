// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            x, z

final class aa
    implements Thread.UncaughtExceptionHandler
{

    final z a;

    aa(z z)
    {
        a = z;
        super();
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        if (throwable instanceof VirtualMachineError)
        {
            x.b().log(Level.SEVERE, (new StringBuilder("Logging and re-throwing uncaught VirtualMachineError in ")).append(thread).toString(), throwable);
            throw (VirtualMachineError)throwable;
        } else
        {
            x.b().log(Level.SEVERE, (new StringBuilder("Uncaught exception in ")).append(thread).toString(), throwable);
            return;
        }
    }
}
