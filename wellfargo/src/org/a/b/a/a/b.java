// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.b.a.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package org.a.b.a.a:
//            g

public class b
    implements Iterable
{

    private final List a = new LinkedList();
    private final Map b = new HashMap();

    public b()
    {
    }

    public g a(String s)
    {
        if (s == null)
        {
            return null;
        }
        s = s.toLowerCase(Locale.US);
        s = (List)b.get(s);
        if (s != null && !s.isEmpty())
        {
            return (g)s.get(0);
        } else
        {
            return null;
        }
    }

    public void a(g g1)
    {
        if (g1 == null)
        {
            return;
        }
        String s = g1.a().toLowerCase(Locale.US);
        List list = (List)b.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new LinkedList();
            b.put(s, obj);
        }
        ((List) (obj)).add(g1);
        a.add(g1);
    }

    public Iterator iterator()
    {
        return Collections.unmodifiableList(a).iterator();
    }

    public String toString()
    {
        return a.toString();
    }
}
