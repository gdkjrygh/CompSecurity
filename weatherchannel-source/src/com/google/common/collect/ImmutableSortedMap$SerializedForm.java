// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMap

private static class comparator extends comparator
{

    private static final long serialVersionUID = 0L;
    private final Comparator comparator;

    Object readResolve()
    {
        return createMap(new createMap(comparator));
    }

    A(ImmutableSortedMap immutablesortedmap)
    {
        super(immutablesortedmap);
        comparator = immutablesortedmap.comparator();
    }
}
