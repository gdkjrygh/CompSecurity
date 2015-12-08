// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ArrayTable

private class rowIndex extends yMap
{

    final int rowIndex;
    final ArrayTable this$0;

    String getKeyRole()
    {
        return "Column";
    }

    Object getValue(int i)
    {
        return at(rowIndex, i);
    }

    Object setValue(int i, Object obj)
    {
        return set(rowIndex, i, obj);
    }

    yMap(int i)
    {
        this$0 = ArrayTable.this;
        super(ArrayTable.access$500(ArrayTable.this), null);
        rowIndex = i;
    }
}
