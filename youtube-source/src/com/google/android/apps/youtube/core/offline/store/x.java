// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            z, y

final class x
{

    private static final Object a = new Object();
    private final ConcurrentHashMap b = new ConcurrentHashMap();
    private final ConcurrentHashMap c = new ConcurrentHashMap();
    private final ConcurrentHashMap d = new ConcurrentHashMap();
    private final HashMap e = new HashMap();
    private final HashMap f = new HashMap();

    x()
    {
    }

    final z a(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        return (z)b.get(s);
    }

    final List a()
    {
        LinkedList linkedlist = new LinkedList();
        for (Iterator iterator = b.values().iterator(); iterator.hasNext(); linkedlist.add(((z)iterator.next()).f())) { }
        return linkedlist;
    }

    final List a(List list)
    {
        LinkedList linkedlist = new LinkedList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (String)list.next();
            obj = (z)b.get(obj);
            if (obj != null)
            {
                obj = ((z) (obj)).e();
                if (obj != null)
                {
                    linkedlist.add(obj);
                }
            }
        } while (true);
        return linkedlist;
    }

    final void a(Playlist playlist)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(playlist);
        c.put(playlist.id, new y(playlist, (byte)0));
    }

    final void a(Video video)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(video);
        b.put(video.id, new z(this, video, (byte)0));
    }

    final void a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.e.c.a(f, s, s1);
        com.google.android.apps.youtube.common.e.c.a(e, s1, s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    final void b()
    {
        b.clear();
        c.clear();
        d.clear();
    }

    final void b(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        b.remove(s);
        d.remove(s);
    }

    final y c(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        return (y)c.get(s);
    }

    final Collection c()
    {
        return b.values();
    }

    final void d(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        c.remove(s);
        obj = (Set)f.remove(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        String s1;
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); com.google.android.apps.youtube.common.e.c.b(e, s1, s))
        {
            s1 = (String)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_76;
        s;
        throw s;
        this;
        JVM INSTR monitorexit ;
    }

    final void e(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        d.put(s, a);
        s = (z)b.get(s);
        if (s != null)
        {
            s.d();
        }
    }

    final boolean f(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        return d.containsKey(s);
    }

    final Set g(String s)
    {
        return com.google.android.apps.youtube.common.e.c.a(f, s);
    }

    final Set h(String s)
    {
        return com.google.android.apps.youtube.common.e.c.a(e, s);
    }

}
