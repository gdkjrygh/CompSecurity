// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

// Referenced classes of package com.google.common.collect:
//            MultimapBuilder

private static final class comparator
    implements Supplier, Serializable
{

    private final Comparator comparator;

    public volatile Object get()
    {
        return get();
    }

    public SortedSet get()
    {
        return new TreeSet(comparator);
    }

    (Comparator comparator1)
    {
        comparator = (Comparator)Preconditions.checkNotNull(comparator1);
    }
}
