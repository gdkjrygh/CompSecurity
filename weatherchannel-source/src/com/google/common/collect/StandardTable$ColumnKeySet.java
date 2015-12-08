// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            StandardTable, Iterators

private class <init> extends <init>
{

    final StandardTable this$0;

    public boolean contains(Object obj)
    {
        return containsColumn(obj);
    }

    public Iterator iterator()
    {
        return createColumnKeyIterator();
    }

    public boolean remove(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        boolean flag = false;
        Iterator iterator1 = backingMap.values().iterator();
        do
        {
            flag1 = flag;
            if (!iterator1.hasNext())
            {
                continue;
            }
            Map map = (Map)iterator1.next();
            if (map.keySet().remove(obj))
            {
                boolean flag2 = true;
                flag = flag2;
                if (map.isEmpty())
                {
                    iterator1.remove();
                    flag = flag2;
                }
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean removeAll(Collection collection)
    {
        Preconditions.checkNotNull(collection);
        boolean flag = false;
        Iterator iterator1 = backingMap.values().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Map map = (Map)iterator1.next();
            if (Iterators.removeAll(map.keySet().iterator(), collection))
            {
                boolean flag1 = true;
                flag = flag1;
                if (map.isEmpty())
                {
                    iterator1.remove();
                    flag = flag1;
                }
            }
        } while (true);
        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        Preconditions.checkNotNull(collection);
        boolean flag = false;
        Iterator iterator1 = backingMap.values().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Map map = (Map)iterator1.next();
            if (map.keySet().retainAll(collection))
            {
                boolean flag1 = true;
                flag = flag1;
                if (map.isEmpty())
                {
                    iterator1.remove();
                    flag = flag1;
                }
            }
        } while (true);
        return flag;
    }

    public int size()
    {
        return Iterators.size(iterator());
    }

    private ()
    {
        this$0 = StandardTable.this;
        super(StandardTable.this, null);
    }

    t>(t> t>)
    {
        this();
    }
}
