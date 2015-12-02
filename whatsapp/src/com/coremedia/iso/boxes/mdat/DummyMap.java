// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.mdat;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DummyMap
    implements Map
{

    static final boolean $assertionsDisabled;
    HashSet keys;
    Object value;

    public DummyMap(Object obj)
    {
        keys = new HashSet();
        value = obj;
    }

    public void addKeys(Object aobj[])
    {
        Collections.addAll(keys, aobj);
    }

    public void clear()
    {
        keys.clear();
    }

    public Comparator comparator()
    {
        return null;
    }

    public boolean containsKey(Object obj)
    {
        return keys.contains(obj);
    }

    public boolean containsValue(Object obj)
    {
        return value == obj;
    }

    public Set entrySet()
    {
        throw new UnsupportedOperationException();
    }

    public Object get(Object obj)
    {
        if (keys.contains(obj))
        {
            return value;
        } else
        {
            return null;
        }
    }

    public boolean isEmpty()
    {
        return keys.isEmpty();
    }

    public Set keySet()
    {
        return keys;
    }

    public Object put(Object obj, Object obj1)
    {
        if (!$assertionsDisabled && value != obj1)
        {
            throw new AssertionError();
        } else
        {
            keys.add(obj);
            return value;
        }
    }

    public void putAll(Map map)
    {
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Object obj = (Object)iterator.next();
            if (!$assertionsDisabled && map.get(obj) != value)
            {
                throw new AssertionError();
            }
            keys.add(obj);
        } while (true);
    }

    public Object remove(Object obj)
    {
        Object obj1 = get(obj);
        keys.remove(obj);
        return obj1;
    }

    public int size()
    {
        return keys.size();
    }

    public Collection values()
    {
        throw new UnsupportedOperationException();
    }

    static 
    {
        boolean flag;
        if (!com/coremedia/iso/boxes/mdat/DummyMap.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
