// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import com.google.c.a.b;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.c.b:
//            e, l, af

public final class v
{

    static final com.google.c.a.b.a a;

    static af a(af af)
    {
        return new af(af) {

            final af a;

            public boolean hasNext()
            {
                return a.hasNext();
            }

            public Object next()
            {
                return ((java.util.Map.Entry)a.next()).getValue();
            }

            
            {
                a = af1;
                super();
            }
        };
    }

    static String a(Map map)
    {
        StringBuilder stringbuilder = e.a(map.size()).append('{');
        a.a(stringbuilder, map);
        return stringbuilder.append('}').toString();
    }

    public static java.util.Map.Entry a(Object obj, Object obj1)
    {
        return new l(obj, obj1);
    }

    static boolean a(Map map, Object obj)
    {
        if (map == obj)
        {
            return true;
        }
        if (obj instanceof Map)
        {
            obj = (Map)obj;
            return map.entrySet().equals(((Map) (obj)).entrySet());
        } else
        {
            return false;
        }
    }

    static 
    {
        a = e.a.c("=");
    }
}
