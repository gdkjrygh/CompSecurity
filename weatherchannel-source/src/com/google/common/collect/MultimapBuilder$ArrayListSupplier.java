// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            MultimapBuilder, CollectPreconditions

private static final class ive
    implements Supplier, Serializable
{

    private final int expectedValuesPerKey;

    public volatile Object get()
    {
        return get();
    }

    public List get()
    {
        return new ArrayList(expectedValuesPerKey);
    }

    A(int i)
    {
        expectedValuesPerKey = CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
    }
}
