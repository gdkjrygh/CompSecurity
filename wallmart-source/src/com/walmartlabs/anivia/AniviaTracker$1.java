// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.walmartlabs.anivia:
//            AniviaTracker

class this._cls0
    implements ThreadFactory
{

    final AniviaTracker this$0;

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable, "Anivia worker");
        runnable.setPriority(1);
        return runnable;
    }

    ()
    {
        this$0 = AniviaTracker.this;
        super();
    }
}
