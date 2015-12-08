// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.os.Process;

public abstract class BackgroundPriorityRunnable
    implements Runnable
{

    public BackgroundPriorityRunnable()
    {
    }

    protected abstract void onRun();

    public final void run()
    {
        Process.setThreadPriority(10);
        onRun();
    }
}
