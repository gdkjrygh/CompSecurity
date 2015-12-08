// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.primitives.Ints;

// Referenced classes of package com.google.common.collect:
//            Ordering, Multisets

static final class ry extends Ordering
{

    public int compare(ry ry, ry ry1)
    {
        return Ints.compare(ry1.getCount(), ry.getCount());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((ry)obj, (ry)obj1);
    }

    ry()
    {
    }
}
