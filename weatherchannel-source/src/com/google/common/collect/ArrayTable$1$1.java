// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ArrayTable, ImmutableList, AbstractIndexedListIterator

class ize extends Cell
{

    final int columnIndex;
    final int rowIndex;
    final columnIndex this$1;
    final int val$index;

    public Object getColumnKey()
    {
        return ArrayTable.access$000(_fld0).get(columnIndex);
    }

    public Object getRowKey()
    {
        return ArrayTable.access$100(_fld0).get(rowIndex);
    }

    public Object getValue()
    {
        return at(rowIndex, columnIndex);
    }

    ListIterator()
    {
        this$1 = final_listiterator;
        val$index = I.this;
        super();
        rowIndex = val$index / ArrayTable.access$000(_fld0).size();
        columnIndex = val$index % ArrayTable.access$000(_fld0).size();
    }

    // Unreferenced inner class com/google/common/collect/ArrayTable$1

/* anonymous class */
    class ArrayTable._cls1 extends AbstractIndexedListIterator
    {

        final ArrayTable this$0;

        protected Table.Cell get(int i)
        {
            return i. new ArrayTable._cls1._cls1();
        }

        protected volatile Object get(int i)
        {
            return get(i);
        }

            
            {
                this$0 = ArrayTable.this;
                super(i);
            }
    }

}
