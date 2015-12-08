// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            DenseImmutableTable, ImmutableMap

private final class <init> extends leArrayMap
{

    final DenseImmutableTable this$0;

    volatile Object getValue(int i)
    {
        return getValue(i);
    }

    Map getValue(int i)
    {
        return new it>(DenseImmutableTable.this, i);
    }

    boolean isPartialView()
    {
        return false;
    }

    ImmutableMap keyToIndex()
    {
        return DenseImmutableTable.access$600(DenseImmutableTable.this);
    }

    private leArrayMap()
    {
        this$0 = DenseImmutableTable.this;
        super(DenseImmutableTable.access$200(DenseImmutableTable.this).length);
    }

    _cls200(_cls200 _pcls200)
    {
        this();
    }
}
