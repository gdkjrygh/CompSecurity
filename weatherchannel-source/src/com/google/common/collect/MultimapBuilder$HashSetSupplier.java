// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            MultimapBuilder, CollectPreconditions

private static final class ative
    implements Supplier, Serializable
{

    private final int expectedValuesPerKey;

    public volatile Object get()
    {
        return get();
    }

    public Set get()
    {
        return new HashSet(expectedValuesPerKey);
    }

    (int i)
    {
        expectedValuesPerKey = CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
    }
}
