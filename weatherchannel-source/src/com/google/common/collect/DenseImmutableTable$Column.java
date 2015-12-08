// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            DenseImmutableTable, ImmutableMap

private final class columnIndex extends leArrayMap
{

    private final int columnIndex;
    final DenseImmutableTable this$0;

    Object getValue(int i)
    {
        return DenseImmutableTable.access$400(DenseImmutableTable.this)[i][columnIndex];
    }

    boolean isPartialView()
    {
        return true;
    }

    ImmutableMap keyToIndex()
    {
        return DenseImmutableTable.access$600(DenseImmutableTable.this);
    }

    leArrayMap(int i)
    {
        this$0 = DenseImmutableTable.this;
        super(DenseImmutableTable.access$500(DenseImmutableTable.this)[i]);
        columnIndex = i;
    }
}
