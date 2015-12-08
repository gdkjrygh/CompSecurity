// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.google.common.base:
//            Function, Functions, Preconditions

private static class map
    implements Function, Serializable
{

    private static final long serialVersionUID = 0L;
    final Map map;

    public Object apply(Object obj)
    {
        Object obj1 = map.get(obj);
        boolean flag;
        if (obj1 != null || map.containsKey(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Key '%s' not present in map", new Object[] {
            obj
        });
        return obj1;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof map)
        {
            obj = (map)obj;
            return map.equals(((map) (obj)).map);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return map.hashCode();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(map));
        return (new StringBuilder(s.length() + 8)).append("forMap(").append(s).append(")").toString();
    }

    (Map map1)
    {
        map = (Map)Preconditions.checkNotNull(map1);
    }
}
