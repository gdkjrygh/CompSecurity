// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import com.gau.go.a.a.a;
import com.gau.go.a.e.g;
import com.gau.go.a.f.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.gau.go.a:
//            e, p

class o
    implements Runnable
{

    final e a;

    o(e e1)
    {
        a = e1;
        super();
    }

    public void run()
    {
        if (d.d(e.b(a)) != -1 && e.i(a).size() > 0)
        {
            e.j(a).a();
            HashMap hashmap = new HashMap();
            HashMap hashmap1 = new HashMap();
            hashmap1.putAll(e.i(a));
            Iterator iterator1 = hashmap1.keySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                a a1 = (a)hashmap1.get((String)iterator1.next());
                if (a1 != null)
                {
                    Long long1 = Long.valueOf(a1.c());
                    if (long1.longValue() != 0L)
                    {
                        if (hashmap.containsKey(long1))
                        {
                            ((ArrayList)hashmap.get(long1)).add((new StringBuilder()).append("").append(a1.e()).toString());
                        } else
                        {
                            ArrayList arraylist = new ArrayList();
                            arraylist.add((new StringBuilder()).append("").append(a1.e()).toString());
                            hashmap.put(long1, arraylist);
                        }
                    }
                }
            } while (true);
            if (!hashmap.isEmpty())
            {
                Iterator iterator = hashmap.keySet().iterator();
                int i = 0;
                while (iterator.hasNext()) 
                {
                    Object obj = (Long)iterator.next();
                    if (((ArrayList)hashmap.get(obj)).size() > 0)
                    {
                        StringBuffer stringbuffer = new StringBuffer();
                        String s;
                        for (Iterator iterator2 = ((ArrayList)hashmap.get(obj)).iterator(); iterator2.hasNext(); stringbuffer.append((new StringBuilder()).append(s).append(",").toString()))
                        {
                            s = (String)iterator2.next();
                        }

                        stringbuffer.deleteCharAt(stringbuffer.length() - 1);
                        obj = new g(e.b(a), ((Long) (obj)), stringbuffer.toString(), i);
                        ((g) (obj)).a(new p(this));
                        i++;
                        e.j(a).a(((com.gau.go.a.e.f) (obj)));
                    }
                }
            }
        }
    }
}
