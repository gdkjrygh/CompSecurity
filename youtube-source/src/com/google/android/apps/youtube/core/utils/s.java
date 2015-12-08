// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.os.Process;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            r

final class s
    implements Runnable
{

    final Runnable a;
    final r b;

    s(r r1, Runnable runnable)
    {
        b = r1;
        a = runnable;
        super();
    }

    public final void run()
    {
        Process.setThreadPriority(r.a(b));
        a.run();
    }
}
