// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            ImmutableMultiset

static class multiset
    implements Serializable
{

    final ImmutableMultiset multiset;

    Object readResolve()
    {
        return multiset.entrySet();
    }

    (ImmutableMultiset immutablemultiset)
    {
        multiset = immutablemultiset;
    }
}
