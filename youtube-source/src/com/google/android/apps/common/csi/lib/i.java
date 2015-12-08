// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.csi.lib;

import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

// Referenced classes of package com.google.android.apps.common.csi.lib:
//            j, AndroidCsiException, h

public final class i
{

    private final long a;
    private final LinkedList b = new LinkedList();
    private final j c;
    private String d;
    private LinkedHashMap e;
    private boolean f;

    public i(String s, j j1)
    {
        e = new LinkedHashMap();
        f = false;
        d = s;
        c = j1;
        a = j1.a();
    }

    private static Map a(String s, Map map, StringBuilder stringbuilder, StringBuilder stringbuilder1)
    {
        LinkedHashMap linkedhashmap = null;
        if (stringbuilder.length() > 0)
        {
            LinkedHashMap linkedhashmap1 = new LinkedHashMap();
            if (s != null)
            {
                linkedhashmap1.put("action", s);
            }
            if (map != null && !map.isEmpty())
            {
                linkedhashmap1.putAll(map);
            }
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
            linkedhashmap1.put("it", stringbuilder.toString());
            linkedhashmap = linkedhashmap1;
            if (stringbuilder1.length() > 0)
            {
                stringbuilder1.deleteCharAt(stringbuilder1.length() - 1);
                linkedhashmap1.put("irt", stringbuilder1.toString());
                linkedhashmap = linkedhashmap1;
            }
        }
        return linkedhashmap;
    }

    public static transient Map a(i ai[])
    {
        Object obj1 = null;
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder();
        int k = 0;
        boolean flag = false;
        Object obj = null;
        while (k < ai.length) 
        {
            Object obj2 = ai[k].b();
            if (obj2 == null)
            {
                throw new AndroidCsiException("The report items get from ticker is null.");
            }
            if (k == 0)
            {
                obj1 = (String)((Map) (obj2)).get("action");
                obj = Collections.unmodifiableMap(ai[k].e);
                if (((Map) (obj2)).containsKey("irt"))
                {
                    flag = true;
                    stringbuilder1.append((String)((Map) (obj2)).get("irt")).append(",");
                }
                stringbuilder.append((String)((Map) (obj2)).get("it")).append(",");
            } else
            {
                Map map = Collections.unmodifiableMap(ai[k].e);
                if (!((Map) (obj2)).containsKey("action") && obj != null || ((Map) (obj2)).containsKey("action") && !((String)((Map) (obj2)).get("action")).equals(obj))
                {
                    throw new AndroidCsiException("Can not get merged report items for the tickers with different action names.");
                }
                if (map == null && obj1 != null || map != null && !map.equals(obj1))
                {
                    throw new AndroidCsiException("Can not get merged report items for the tickers with different customized parameter-value pairs.");
                }
                if (((Map) (obj2)).containsKey("irt") != flag)
                {
                    throw new AndroidCsiException("Can not get merged report items for the tickers with different latency variables.");
                }
                stringbuilder.append((String)((Map) (obj2)).get("it")).append(",");
                if (flag)
                {
                    stringbuilder1.append((String)((Map) (obj2)).get("irt")).append(",");
                }
                obj2 = obj;
                obj = obj1;
                obj1 = obj2;
            }
            k++;
            obj2 = obj1;
            obj1 = obj;
            obj = obj2;
        }
        return a(((String) (obj)), ((Map) (obj1)), stringbuilder, stringbuilder1);
    }

    private Map b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder();
        Iterator iterator = b.iterator();
        do
        {
            if (iterator.hasNext())
            {
                h h1 = (h)iterator.next();
                String s = h1.b();
                h h2 = h1.c();
                Long long1 = h1.a();
                long l;
                long l1;
                if (h2 == null && h1.d() != null)
                {
                    l1 = h1.d().longValue();
                    l = h1.d().longValue();
                } else
                {
                    if (h2 == null || long1.longValue() <= 0L)
                    {
                        continue;
                    }
                    l1 = long1.longValue() - h2.a().longValue();
                    l = long1.longValue() - a;
                }
                stringbuilder.append(s).append('.').append(l1).append(',');
                if (f)
                {
                    stringbuilder1.append(l).append(',');
                }
                continue;
            }
            return a(d, e, stringbuilder, stringbuilder1);
        } while (true);
    }

    public final String a()
    {
        return d;
    }

    public final void a(String s)
    {
        d = s;
    }

    public final void a(String s, String s1)
    {
        e.put(s, s1);
    }

    public final transient boolean a(h h1, long l, String as[])
    {
        int k = 0;
        if (h1 == null)
        {
            Log.e("Ticker", (new StringBuilder("In action: ")).append(d).append(", label item shouldn't be null").toString());
            return false;
        }
        if (a > l)
        {
            Log.e("Ticker", (new StringBuilder("In action: ")).append(d).append(", ticks can't be marked in the past").toString());
            return false;
        }
        for (int i1 = as.length; k < i1; k++)
        {
            h h2 = new h(l, as[k], h1);
            b.add(h2);
        }

        return true;
    }
}
