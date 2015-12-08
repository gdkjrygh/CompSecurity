// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            e, aq

final class k
    implements Runnable
{

    final RemoteControl.State a;
    final e b;

    k(e e1, RemoteControl.State state)
    {
        b = e1;
        a = state;
        super();
    }

    public final void run()
    {
        e e1 = b;
        e1;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.b(b).iterator(); iterator.hasNext(); ((aq)iterator.next()).a(a)) { }
        break MISSING_BLOCK_LABEL_55;
        Exception exception;
        exception;
        throw exception;
        e1;
        JVM INSTR monitorexit ;
    }
}
