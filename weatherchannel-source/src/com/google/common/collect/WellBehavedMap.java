// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingMap, TransformedIterator, AbstractMapEntry

final class WellBehavedMap extends ForwardingMap
{
    private final class EntrySet extends Maps.EntrySet
    {

        final WellBehavedMap this$0;

        public Iterator iterator()
        {
            return new TransformedIterator(keySet().iterator()) {

                final EntrySet this$1;

                volatile Object transform(Object obj)
                {
                    return transform(obj);
                }

                java.util.Map.Entry transform(Object obj)
                {
                    return ((_cls1) (obj)). new AbstractMapEntry() {

                        final EntrySet._cls1 this$2;
                        final Object val$key;

                        public Object getKey()
                        {
                            return key;
                        }

                        public Object getValue()
                        {
                            return get(key);
                        }

                        public Object setValue(Object obj)
                        {
                            return put(key, obj);
                        }

            
            {
                this$2 = final__pcls1;
                key = Object.this;
                super();
            }
                    };
                }

            
            {
                this$1 = EntrySet.this;
                super(iterator);
            }
            };
        }

        Map map()
        {
            return WellBehavedMap.this;
        }

        private EntrySet()
        {
            this$0 = WellBehavedMap.this;
            super();
        }

    }


    private final Map _flddelegate;
    private Set entrySet;

    private WellBehavedMap(Map map)
    {
        _flddelegate = map;
    }

    static WellBehavedMap wrap(Map map)
    {
        return new WellBehavedMap(map);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Map _mthdelegate()
    {
        return _flddelegate;
    }

    public Set entrySet()
    {
        Set set = entrySet;
        if (set != null)
        {
            return set;
        } else
        {
            EntrySet entryset = new EntrySet();
            entrySet = entryset;
            return entryset;
        }
    }
}
