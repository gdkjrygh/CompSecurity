// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            StandardTable, Collections2, Maps

class Map extends Map
{
    class EntrySet extends StandardTable.TableSet
    {

        final StandardTable.RowMap this$1;

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                flag = flag1;
                if (((java.util.Map.Entry) (obj)).getKey() != null)
                {
                    flag = flag1;
                    if (((java.util.Map.Entry) (obj)).getValue() instanceof Map)
                    {
                        flag = flag1;
                        if (Collections2.safeContains(backingMap.entrySet(), obj))
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public Iterator iterator()
        {
            return Maps.asMapEntryIterator(backingMap.keySet(), new Function() {

                final EntrySet this$2;

                public volatile Object apply(Object obj)
                {
                    return apply(obj);
                }

                public Map apply(Object obj)
                {
                    return row(obj);
                }

            
            {
                this$2 = EntrySet.this;
                super();
            }
            });
        }

        public boolean remove(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                flag = flag1;
                if (((java.util.Map.Entry) (obj)).getKey() != null)
                {
                    flag = flag1;
                    if (((java.util.Map.Entry) (obj)).getValue() instanceof Map)
                    {
                        flag = flag1;
                        if (backingMap.entrySet().remove(obj))
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public int size()
        {
            return backingMap.size();
        }

        EntrySet()
        {
            this$1 = StandardTable.RowMap.this;
            super(this$0, null);
        }
    }


    final StandardTable this$0;

    public boolean containsKey(Object obj)
    {
        return containsRow(obj);
    }

    protected Set createEntrySet()
    {
        return new EntrySet();
    }

    public volatile Object get(Object obj)
    {
        return get(obj);
    }

    public Map get(Object obj)
    {
        if (containsRow(obj))
        {
            return row(obj);
        } else
        {
            return null;
        }
    }

    public volatile Object remove(Object obj)
    {
        return remove(obj);
    }

    public Map remove(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            return (Map)backingMap.remove(obj);
        }
    }

    this._cls0()
    {
        this$0 = StandardTable.this;
        super();
    }
}
