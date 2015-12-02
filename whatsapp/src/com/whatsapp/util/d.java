// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.os.Process;

// Referenced classes of package com.whatsapp.util:
//            i

class d
    implements Runnable
{

    final i a;
    final Runnable b;

    d(i i, Runnable runnable)
    {
        a = i;
        b = runnable;
        super();
    }

    public void run()
    {
        Process.setThreadPriority(10);
        b.run();
    }
}
