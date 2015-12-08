// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ArrayTable

private class columnIndex extends p
{

    final int columnIndex;
    final ArrayTable this$0;

    String getKeyRole()
    {
        return "Row";
    }

    Object getValue(int i)
    {
        return at(i, columnIndex);
    }

    Object setValue(int i, Object obj)
    {
        return set(i, columnIndex, obj);
    }

    p(int i)
    {
        this$0 = ArrayTable.this;
        super(ArrayTable.access$200(ArrayTable.this), null);
        columnIndex = i;
    }
}
