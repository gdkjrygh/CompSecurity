// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Supplier;

// Referenced classes of package com.google.common.cache:
//            LongAddables, LongAdder, LongAddable

static final class 
    implements Supplier
{

    public LongAddable get()
    {
        return new LongAdder();
    }

    public volatile Object get()
    {
        return get();
    }

    ()
    {
    }
}
