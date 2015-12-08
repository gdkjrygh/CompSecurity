// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.io.PrintStream;

// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            ac

final class y extends ac
{

    y()
    {
        super((byte)0);
    }

    protected final void a(Throwable throwable)
    {
        System.err.println("Critical EventDispatcher causing System.exit(1)");
        System.exit(1);
    }
}
