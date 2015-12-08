// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.os.HandlerThread;
import android.os.Process;

// Referenced classes of package com.google.android.exoplayer:
//            j

final class k extends HandlerThread
{

    final j a;

    k(j j, String s)
    {
        a = j;
        super(s);
    }

    public final void run()
    {
        Process.setThreadPriority(-16);
        super.run();
    }
}
