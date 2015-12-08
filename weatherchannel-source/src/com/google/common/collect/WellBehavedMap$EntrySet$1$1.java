// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractMapEntry, WellBehavedMap, TransformedIterator

class val.key extends AbstractMapEntry
{

    final val.key this$2;
    final Object val$key;

    public Object getKey()
    {
        return val$key;
    }

    public Object getValue()
    {
        return get(val$key);
    }

    public Object setValue(Object obj)
    {
        return put(val$key, obj);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$key = Object.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/WellBehavedMap$EntrySet$1

/* anonymous class */
    class WellBehavedMap.EntrySet._cls1 extends TransformedIterator
    {

        final WellBehavedMap.EntrySet this$1;

        volatile Object transform(Object obj)
        {
            return transform(obj);
        }

        java.util.Map.Entry transform(Object obj)
        {
            return ((WellBehavedMap.EntrySet._cls1._cls1) (obj)). new WellBehavedMap.EntrySet._cls1._cls1();
        }

            
            {
                this$1 = WellBehavedMap.EntrySet.this;
                super(iterator);
            }
    }

}
