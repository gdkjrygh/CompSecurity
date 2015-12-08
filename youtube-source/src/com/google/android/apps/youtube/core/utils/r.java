// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            s

public final class r
    implements ThreadFactory
{

    private final int a;
    private final ThreadFactory b = Executors.defaultThreadFactory();

    public r(int i)
    {
        a = i;
    }

    static int a(r r1)
    {
        return r1.a;
    }

    public final Thread newThread(Runnable runnable)
    {
        return b.newThread(new s(this, runnable));
    }
}
