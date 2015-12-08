// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.google.common.util.concurrent:
//            Striped

static final class val.permits
    implements Supplier
{

    final int val$permits;

    public volatile Object get()
    {
        return get();
    }

    public Semaphore get()
    {
        return new ddedSemaphore(val$permits);
    }

    ddedSemaphore(int i)
    {
        val$permits = i;
        super();
    }
}
