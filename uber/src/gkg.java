// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class gkg
    implements Map
{

    private final Map a;

    private gkg(Map map)
    {
        a = map;
    }

    gkg(Map map, byte byte0)
    {
        this(map);
    }

    public static gkg a(Object obj, Object obj1)
    {
        return (new gkh()).a(obj, obj1).a();
    }

    public static gkg a(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return (new gkh()).a(obj, obj1).a(obj2, obj3).a();
    }

    public static gkg a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return (new gkh()).a(obj, obj1).a(obj2, obj3).a(obj4, obj5).a();
    }

    public static gkg a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return (new gkh()).a(obj, obj1).a(obj2, obj3).a(obj4, obj5).a(obj6, obj7).a();
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj)
    {
        return a.containsKey(obj);
    }

    public final boolean containsValue(Object obj)
    {
        return a.containsValue(obj);
    }

    public final Set entrySet()
    {
        return new LinkedHashSet(a.entrySet());
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (gkg)obj;
            if (a == null ? ((gkg) (obj)).a != null : !a.equals(((gkg) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final Object get(Object obj)
    {
        return a.get(obj);
    }

    public final int hashCode()
    {
        if (a != null)
        {
            return a.hashCode();
        } else
        {
            return 0;
        }
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final Set keySet()
    {
        return new LinkedHashSet(a.keySet());
    }

    public final Object put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map)
    {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final int size()
    {
        return a.size();
    }

    public final Collection values()
    {
        return new LinkedList(a.values());
    }
}
