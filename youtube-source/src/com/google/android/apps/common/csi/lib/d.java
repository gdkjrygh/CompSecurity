// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.csi.lib;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.apps.common.csi.lib:
//            c, e, AndroidCsiException, i, 
//            Sender

public final class d
    implements c
{

    private Sender a;
    private ExecutorService b;
    private LinkedHashMap c;
    private BlockingQueue d;
    private String e;
    private String f;
    private String g;
    private int h;
    private int i;
    private int j;
    private int k;

    public d(String s, String s1, String s2, Sender sender, int l, int i1, int j1)
    {
        c = new LinkedHashMap();
        i = 1;
        e = s;
        f = s1;
        g = s2;
        a = sender;
        h = l;
        j = i1;
        k = j1;
        a("v", g);
        a("s", f);
        d = new ArrayBlockingQueue(h);
        b = Executors.newSingleThreadExecutor();
        b.execute(new e(this));
    }

    private Map a(List list)
    {
        LinkedHashMap linkedhashmap;
        linkedhashmap = new LinkedHashMap();
        LinkedHashMap linkedhashmap1 = new LinkedHashMap();
        for (list = list.iterator(); list.hasNext();)
        {
            i l = (i)list.next();
            String s = l.a();
            if (linkedhashmap1.containsKey(s))
            {
                ((List)linkedhashmap1.get(s)).add(l);
            } else
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(l);
                linkedhashmap1.put(s, arraylist);
            }
        }

        list = linkedhashmap1.entrySet().iterator();
_L2:
        List list1;
        java.util.Map.Entry entry;
        LinkedHashMap linkedhashmap2;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)list.next();
        list1 = (List)entry.getValue();
        linkedhashmap2 = new LinkedHashMap(c);
        Map map = com.google.android.apps.common.csi.lib.i.a((i[])list1.toArray(new i[0]));
        linkedhashmap2.putAll(map);
        linkedhashmap.put(entry.getKey(), linkedhashmap2);
        continue; /* Loop/switch isn't completed */
        AndroidCsiException androidcsiexception;
        androidcsiexception;
        Log.w("ReporterDefault", (new StringBuilder("failed to merge tickers:")).append(list1).toString(), androidcsiexception);
        if (true) goto _L2; else goto _L1
_L1:
        return linkedhashmap;
    }

    private boolean a(Map map)
    {
        int l;
        boolean flag;
        l = j;
        flag = false;
_L2:
        if (flag || l <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Thread.sleep(k);
        a.a(e, map);
        flag = true;
_L3:
        l--;
        if (true) goto _L2; else goto _L1
        Object obj;
        obj;
        Log.w("ReporterDefault", (new StringBuilder("#")).append(l).append(" failed to send report").toString(), ((Throwable) (obj)));
        flag = false;
          goto _L3
        obj;
        Log.w("ReporterDefault", "interrupted in sendReport()", ((Throwable) (obj)));
        Thread.currentThread().interrupt();
          goto _L3
_L1:
        return flag;
    }

    final void a()
    {
_L4:
        ArrayList arraylist;
        int i1;
        i1 = i;
        arraylist = new ArrayList();
        int l = 0;
_L2:
        Object obj;
        obj = arraylist;
        if (l >= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist.add(d.take());
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        Log.w("ReporterDefault", "reporter interrupted", ((Throwable) (obj)));
        Thread.currentThread().interrupt();
        obj = null;
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = a(((List) (obj))).values().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            a((Map)((Iterator) (obj)).next());
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void a(int l)
    {
        int i1 = l;
        if (l <= 0)
        {
            Log.w("ReporterDefault", (new StringBuilder("too small batch size :")).append(l).append(", changed to 1").toString());
            i1 = 1;
        }
        if (i1 > h)
        {
            Log.w("ReporterDefault", (new StringBuilder("batch size :")).append(i1).append(" bigger than buffer size, change to buffer limit").toString());
        }
        i = i1;
    }

    public final void a(String s, String s1)
    {
        c.put(s, s1);
    }

    public final boolean a(i l)
    {
        return d.offer(l);
    }
}
