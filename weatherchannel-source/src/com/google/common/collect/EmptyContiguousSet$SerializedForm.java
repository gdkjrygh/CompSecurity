// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            EmptyContiguousSet, DiscreteDomain

private static final class <init>
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final DiscreteDomain domain;

    private Object readResolve()
    {
        return new EmptyContiguousSet(domain);
    }

    private A(DiscreteDomain discretedomain)
    {
        domain = discretedomain;
    }

    domain(DiscreteDomain discretedomain, domain domain1)
    {
        this(discretedomain);
    }
}
