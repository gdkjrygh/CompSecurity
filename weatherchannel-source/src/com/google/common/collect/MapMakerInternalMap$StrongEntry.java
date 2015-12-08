// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static class next
    implements ry
{

    final int hash;
    final Object key;
    final ry next;
    volatile ce valueReference;

    public long getExpirationTime()
    {
        throw new UnsupportedOperationException();
    }

    public int getHash()
    {
        return hash;
    }

    public Object getKey()
    {
        return key;
    }

    public ry getNext()
    {
        return next;
    }

    public ry getNextEvictable()
    {
        throw new UnsupportedOperationException();
    }

    public ry getNextExpirable()
    {
        throw new UnsupportedOperationException();
    }

    public ry getPreviousEvictable()
    {
        throw new UnsupportedOperationException();
    }

    public ry getPreviousExpirable()
    {
        throw new UnsupportedOperationException();
    }

    public ce getValueReference()
    {
        return valueReference;
    }

    public void setExpirationTime(long l)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextEvictable(ry ry)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextExpirable(ry ry)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousEvictable(ry ry)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousExpirable(ry ry)
    {
        throw new UnsupportedOperationException();
    }

    public void setValueReference(ce ce)
    {
        ce ce1 = valueReference;
        valueReference = ce;
        ce1.clear(ce);
    }

    ry(Object obj, int i, ry ry)
    {
        valueReference = MapMakerInternalMap.unset();
        key = obj;
        hash = i;
        next = ry;
    }
}
