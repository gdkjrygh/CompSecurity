// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class day extends ThreadPoolExecutor
{

    public day()
    {
        super(0, 0x7fffffff, 60L, TimeUnit.SECONDS, new SynchronousQueue());
    }
}
