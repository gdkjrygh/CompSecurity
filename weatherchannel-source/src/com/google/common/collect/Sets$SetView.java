// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Sets, ImmutableSet

public static abstract class <init> extends AbstractSet
{

    public Set copyInto(Set set)
    {
        set.addAll(this);
        return set;
    }

    public ImmutableSet immutableCopy()
    {
        return ImmutableSet.copyOf(this);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
