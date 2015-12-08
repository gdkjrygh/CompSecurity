// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            DenseImmutableTable, ImmutableMap

private final class rowIndex extends tableArrayMap
{

    private final int rowIndex;
    final DenseImmutableTable this$0;

    Object getValue(int i)
    {
        return DenseImmutableTable.access$400(DenseImmutableTable.this)[rowIndex][i];
    }

    boolean isPartialView()
    {
        return true;
    }

    ImmutableMap keyToIndex()
    {
        return DenseImmutableTable.access$300(DenseImmutableTable.this);
    }

    tableArrayMap(int i)
    {
        this$0 = DenseImmutableTable.this;
        super(DenseImmutableTable.access$200(DenseImmutableTable.this)[i]);
        rowIndex = i;
    }
}
