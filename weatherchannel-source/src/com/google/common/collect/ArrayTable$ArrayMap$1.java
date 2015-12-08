// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            ArrayTable, AbstractIndexedListIterator, AbstractMapEntry

class this._cls0 extends this._cls0
{

    final this._cls0 this$0;

    public Iterator iterator()
    {
        return new AbstractIndexedListIterator(size()) {

            final ArrayTable.ArrayMap._cls1 this$1;

            protected volatile Object get(int i)
            {
                return get(i);
            }

            protected java.util.Map.Entry get(int i)
            {
                return i. new AbstractMapEntry() {

                    final _cls1 this$2;
                    final int val$index;

                    public Object getKey()
                    {
                        return ArrayTable.ArrayMap.this.getKey(index);
                    }

                    public Object getValue()
                    {
                        return ArrayTable.ArrayMap.this.getValue(index);
                    }

                    public Object setValue(Object obj)
                    {
                        return ArrayTable.ArrayMap.this.setValue(index, obj);
                    }

            
            {
                this$2 = final__pcls1;
                index = I.this;
                super();
            }
                };
            }

            
            {
                this$1 = ArrayTable.ArrayMap._cls1.this;
                super(i);
            }
        };
    }

    Map map()
    {
        return this._cls0.this;
    }

    rator()
    {
        this$0 = this._cls0.this;
        super();
    }
}
