// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import java.util.Iterator;

// Referenced classes of package com.google.common.util.concurrent:
//            Futures, ListenableFuture

class this._cls0
    implements Runnable
{

    final mbiner this$0;

    public void run()
    {
        if (Cancelled())
        {
            for (Iterator iterator = tures.iterator(); iterator.hasNext(); ((ListenableFuture)iterator.next()).cancel(sInterrupted())) { }
        }
        tures = null;
        lues = null;
        mbiner = null;
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
