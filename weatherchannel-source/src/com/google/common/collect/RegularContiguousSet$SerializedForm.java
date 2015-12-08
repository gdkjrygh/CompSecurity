// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            RegularContiguousSet, DiscreteDomain, Range

private static final class <init>
    implements Serializable
{

    final DiscreteDomain domain;
    final Range range;

    private Object readResolve()
    {
        return new RegularContiguousSet(range, domain);
    }

    private (Range range1, DiscreteDomain discretedomain)
    {
        range = range1;
        domain = discretedomain;
    }

    domain(Range range1, DiscreteDomain discretedomain, domain domain1)
    {
        this(range1, discretedomain);
    }
}
