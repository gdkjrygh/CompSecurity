// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Sets

private static class eredCollection extends eredCollection
    implements Set
{

    public boolean equals(Object obj)
    {
        return Sets.equalsImpl(this, obj);
    }

    public int hashCode()
    {
        return Sets.hashCodeImpl(this);
    }

    eredCollection(Set set, Predicate predicate)
    {
        super(set, predicate);
    }
}
