// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.collect.ImmutableMap;

// Referenced classes of package com.google.common.reflect:
//            ImmutableTypeToInstanceMap, TypeToken

public static final class <init>
{

    private final com.google.common.collect.mapBuilder mapBuilder;

    public ImmutableTypeToInstanceMap build()
    {
        return new ImmutableTypeToInstanceMap(mapBuilder.mapBuilder(), null);
    }

    public mapBuilder put(TypeToken typetoken, Object obj)
    {
        mapBuilder.mapBuilder(typetoken.rejectTypeVariables(), obj);
        return this;
    }

    public mapBuilder put(Class class1, Object obj)
    {
        mapBuilder.mapBuilder(TypeToken.of(class1), obj);
        return this;
    }

    private ()
    {
        mapBuilder = ImmutableMap.builder();
    }

    mapBuilder(mapBuilder mapbuilder)
    {
        this();
    }
}
