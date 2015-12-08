// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, ImmutableMap

private static class map
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final ImmutableMap map;

    Object readResolve()
    {
        return map.entrySet();
    }

    (ImmutableMap immutablemap)
    {
        map = immutablemap;
    }
}
