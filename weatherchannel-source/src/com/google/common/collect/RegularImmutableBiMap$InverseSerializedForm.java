// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            RegularImmutableBiMap, ImmutableBiMap

private static class forward
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private final ImmutableBiMap forward;

    Object readResolve()
    {
        return forward.inverse();
    }

    (ImmutableBiMap immutablebimap)
    {
        forward = immutablebimap;
    }
}
