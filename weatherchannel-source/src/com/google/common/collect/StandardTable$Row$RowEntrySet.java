// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            StandardTable, Iterators, ForwardingMapEntry

private final class <init> extends <init>
{

    final p this$1;

    public Iterator iterator()
    {
        Map map1 = p();
        if (map1 == null)
        {
            return Iterators.emptyModifiableIterator();
        } else
        {
            return new Iterator() {

                final StandardTable.Row.RowEntrySet this$2;
                final Iterator val$iterator;

                public boolean hasNext()
                {
                    return iterator.hasNext();
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    return ((java.util.Map.Entry)iterator.next()). new ForwardingMapEntry() {

                        final _cls1 this$3;
                        final java.util.Map.Entry val$entry;

                        protected volatile Object _mthdelegate()
                        {
                            return _mthdelegate();
                        }

                        protected java.util.Map.Entry _mthdelegate()
                        {
                            return entry;
                        }

                        public boolean equals(Object obj)
                        {
                            return standardEquals(obj);
                        }

                        public Object setValue(Object obj)
                        {
                            return super.setValue(Preconditions.checkNotNull(obj));
                        }

            
            {
                this$3 = final__pcls1;
                entry = java.util.Map.Entry.this;
                super();
            }
                    };
                }

                public void remove()
                {
                    iterator.remove();
                    maintainEmptyInvariant();
                }

            
            {
                this$2 = StandardTable.Row.RowEntrySet.this;
                iterator = iterator1;
                super();
            }
            };
        }
    }

    Map map()
    {
        return this._cls1.this;
    }

    public int size()
    {
        Map map1 = p();
        if (map1 == null)
        {
            return 0;
        } else
        {
            return map1.size();
        }
    }

    private _cls1.val.iterator()
    {
        this$1 = this._cls1.this;
        super();
    }

    this._cls1(this._cls1 _pcls1_1)
    {
        this();
    }
}
