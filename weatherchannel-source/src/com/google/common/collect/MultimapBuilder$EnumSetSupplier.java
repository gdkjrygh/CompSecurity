// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.EnumSet;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            MultimapBuilder

private static final class clazz
    implements Supplier, Serializable
{

    private final Class clazz;

    public volatile Object get()
    {
        return get();
    }

    public Set get()
    {
        return EnumSet.noneOf(clazz);
    }

    (Class class1)
    {
        clazz = (Class)Preconditions.checkNotNull(class1);
    }
}
