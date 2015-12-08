// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import java.util.concurrent.ThreadFactory;

final class e
    implements ThreadFactory
{

    private e()
    {
    }

    e(byte byte0)
    {
        this();
    }

    public final Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setDaemon(true);
        return runnable;
    }
}
