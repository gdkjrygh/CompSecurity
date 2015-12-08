// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.b;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.jiubang.playsdk.b:
//            a

public class c
    implements ThreadFactory
{

    public c()
    {
    }

    public a a(Runnable runnable)
    {
        return new a(runnable);
    }

    public Thread newThread(Runnable runnable)
    {
        return a(runnable);
    }
}
