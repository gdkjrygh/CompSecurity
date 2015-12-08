// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.b:
//            s, j, m

public class i extends s
    implements Map
{

    m a;

    public i()
    {
    }

    private m b()
    {
        if (a == null)
        {
            a = new j(this);
        }
        return a;
    }

    public Set entrySet()
    {
        return b().d();
    }

    public Set keySet()
    {
        return b().e();
    }

    public void putAll(Map map)
    {
        a(h + map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Collection values()
    {
        return b().f();
    }
}
