// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.mapbar.android.location:
//            q

final class r
    implements ThreadFactory
{

    private final AtomicInteger a = new AtomicInteger(1);

    r()
    {
    }

    public final Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder()).append("CellTaskEx #").append(a.getAndIncrement()).toString());
    }
}
