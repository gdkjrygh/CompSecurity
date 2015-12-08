// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.contextlogic.wish.util:
//            StateSerializer

class this._cls0
    implements ThreadFactory
{

    final StateSerializer this$0;

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setPriority(1);
        return runnable;
    }

    ()
    {
        this$0 = StateSerializer.this;
        super();
    }
}
