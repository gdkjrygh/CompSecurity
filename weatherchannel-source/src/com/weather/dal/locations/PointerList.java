// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.Iterator;

// Referenced classes of package com.weather.dal.locations:
//            PointerId, Pointer

public class PointerList
    implements Iterable, Serializable
{

    private static final long serialVersionUID = 0x1710234e3724cc1L;
    private final EnumMap map;

    PointerList()
    {
        map = new EnumMap(com/weather/dal/locations/PointerId);
        PointerId apointerid[] = PointerId.values();
        int j = apointerid.length;
        for (int i = 0; i < j; i++)
        {
            PointerId pointerid = apointerid[i];
            map.put(pointerid, new Pointer(pointerid));
        }

    }

    PointerList(PointerList pointerlist)
    {
        map = new EnumMap(com/weather/dal/locations/PointerId);
        PointerId apointerid[] = PointerId.values();
        int j = apointerid.length;
        for (int i = 0; i < j; i++)
        {
            PointerId pointerid = apointerid[i];
            Pointer pointer = new Pointer(pointerlist.get(pointerid));
            map.put(pointerid, pointer);
        }

    }

    void clear(PointerId pointerid)
    {
        map.put(pointerid, new Pointer(pointerid));
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (PointerList)obj;
        if (map != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((PointerList) (obj)).map == null) goto _L1; else goto _L3
_L3:
        return false;
        if (map.equals(((PointerList) (obj)).map)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Pointer get(PointerId pointerid)
    {
        return (Pointer)map.get(pointerid);
    }

    public int getValue(PointerId pointerid)
    {
        return ((Pointer)map.get(pointerid)).get();
    }

    public int hashCode()
    {
        int i;
        if (map == null)
        {
            i = 0;
        } else
        {
            i = map.hashCode();
        }
        return i + 31;
    }

    public Iterator iterator()
    {
    /* block-local class not found */
    class PointerListIterator {}

        return new PointerListIterator(null);
    }

    void set(PointerId pointerid, Pointer pointer)
    {
        map.put(pointerid, pointer);
    }

    void setValue(PointerId pointerid, int i)
    {
        map.put(pointerid, new Pointer(pointerid, i));
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(35);
        String s = "";
        for (Iterator iterator1 = iterator(); iterator1.hasNext();)
        {
            Pointer pointer = (Pointer)iterator1.next();
            stringbuilder.append(s).append(pointer.getId().toString().charAt(0)).append(':').append(pointer.get());
            s = ", ";
        }

        return stringbuilder.toString();
    }

}
