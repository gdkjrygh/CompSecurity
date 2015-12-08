// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

final class this._cls0 extends AbstractSet
{

    final MapMakerInternalMap this$0;

    public void clear()
    {
        MapMakerInternalMap.this.clear();
    }

    public boolean contains(Object obj)
    {
        return containsKey(obj);
    }

    public boolean isEmpty()
    {
        return MapMakerInternalMap.this.isEmpty();
    }

    public Iterator iterator()
    {
        return new ator(MapMakerInternalMap.this);
    }

    public boolean remove(Object obj)
    {
        return MapMakerInternalMap.this.remove(obj) != null;
    }

    public int size()
    {
        return MapMakerInternalMap.this.size();
    }

    ator()
    {
        this$0 = MapMakerInternalMap.this;
        super();
    }
}
