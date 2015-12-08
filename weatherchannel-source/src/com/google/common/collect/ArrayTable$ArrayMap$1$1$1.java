// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            AbstractMapEntry, ArrayTable, AbstractIndexedListIterator

class val.index extends AbstractMapEntry
{

    final val.index this$2;
    final int val$index;

    public Object getKey()
    {
        return (val$index);
    }

    public Object getValue()
    {
        return ue(val$index);
    }

    public Object setValue(Object obj)
    {
        return ue(val$index, obj);
    }

    ._cls0()
    {
        this$2 = final__pcls0;
        val$index = I.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/ArrayTable$ArrayMap$1

/* anonymous class */
    class ArrayTable.ArrayMap._cls1 extends Maps.EntrySet
    {

        final ArrayTable.ArrayMap this$0;

        public Iterator iterator()
        {
            return new ArrayTable.ArrayMap._cls1._cls1(size());
        }

        Map map()
        {
            return ArrayTable.ArrayMap.this;
        }

            
            {
                this$0 = ArrayTable.ArrayMap.this;
                super();
            }
    }


    // Unreferenced inner class com/google/common/collect/ArrayTable$ArrayMap$1$1

/* anonymous class */
    class ArrayTable.ArrayMap._cls1._cls1 extends AbstractIndexedListIterator
    {

        final ArrayTable.ArrayMap._cls1 this$1;

        protected volatile Object get(int i)
        {
            return get(i);
        }

        protected java.util.Map.Entry get(int i)
        {
            return i. new ArrayTable.ArrayMap._cls1._cls1._cls1();
        }

            
            {
                this$1 = ArrayTable.ArrayMap._cls1.this;
                super(i);
            }
    }

}
