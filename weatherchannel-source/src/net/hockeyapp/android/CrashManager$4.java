// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import java.lang.ref.WeakReference;

// Referenced classes of package net.hockeyapp.android:
//            CrashManager, CrashManagerListener

static final class val.listener extends Thread
{

    final CrashManagerListener val$listener;
    final WeakReference val$weakContext;

    public void run()
    {
        CrashManager.submitStackTraces(val$weakContext, val$listener);
        boolean _tmp = CrashManager.access$202(false);
    }

    tener(WeakReference weakreference, CrashManagerListener crashmanagerlistener)
    {
        val$weakContext = weakreference;
        val$listener = crashmanagerlistener;
        super();
    }
}
