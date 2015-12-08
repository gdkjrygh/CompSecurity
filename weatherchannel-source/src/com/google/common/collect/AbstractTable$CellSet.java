// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            AbstractTable, Maps, Collections2

class this._cls0 extends AbstractSet
{

    final AbstractTable this$0;

    public void clear()
    {
        AbstractTable.this.clear();
    }

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof this._cls0)
        {
            obj = (this._cls0)obj;
            Map map = (Map)Maps.safeGet(rowMap(), ((this._cls0) (obj))._mth0());
            flag = flag1;
            if (map != null)
            {
                flag = flag1;
                if (Collections2.safeContains(map.entrySet(), Maps.immutableEntry(((ins) (obj)).y(), ((y) (obj)).y())))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public Iterator iterator()
    {
        return cellIterator();
    }

    public boolean remove(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ator)
        {
            obj = (ator)obj;
            Map map = (Map)Maps.safeGet(rowMap(), ((ator) (obj)).ator());
            flag = flag1;
            if (map != null)
            {
                flag = flag1;
                if (Collections2.safeRemove(map.entrySet(), Maps.immutableEntry(((e) (obj)).y(), ((y) (obj)).y())))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int size()
    {
        return AbstractTable.this.size();
    }

    ()
    {
        this$0 = AbstractTable.this;
        super();
    }
}
