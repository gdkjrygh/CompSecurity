// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.common.util.concurrent:
//            Striped

static final class 
    implements Supplier
{

    public volatile Object get()
    {
        return get();
    }

    public Lock get()
    {
        return new ReentrantLock(false);
    }

    ()
    {
    }
}
