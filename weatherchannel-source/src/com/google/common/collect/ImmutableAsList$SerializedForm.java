// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            ImmutableAsList, ImmutableCollection

static class collection
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final ImmutableCollection collection;

    Object readResolve()
    {
        return collection.asList();
    }

    (ImmutableCollection immutablecollection)
    {
        collection = immutablecollection;
    }
}
