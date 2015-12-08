// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            HashBasedTable, Maps

private static class expectedSize
    implements Supplier, Serializable
{

    private static final long serialVersionUID = 0L;
    final int expectedSize;

    public volatile Object get()
    {
        return get();
    }

    public Map get()
    {
        return Maps.newHashMapWithExpectedSize(expectedSize);
    }

    (int i)
    {
        expectedSize = i;
    }
}
