// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            MultimapBuilder, CollectPreconditions

private static final class expectedValuesPerKey
    implements Supplier, Serializable
{

    private final int expectedValuesPerKey;

    public volatile Object get()
    {
        return get();
    }

    public Set get()
    {
        return new LinkedHashSet(expectedValuesPerKey);
    }

    (int i)
    {
        expectedValuesPerKey = CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
    }
}
