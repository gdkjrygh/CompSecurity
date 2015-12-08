// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            Wall

class k
    implements ThreadFactory
{

    final Wall a;

    k(Wall wall)
    {
        a = wall;
        super();
    }

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setPriority(1);
        return runnable;
    }
}
