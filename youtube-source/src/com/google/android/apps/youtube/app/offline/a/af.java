// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            ag, f

final class af
{

    final f a;
    private final HashMap b;
    private final HashMap c;

    private af(f f1)
    {
        a = f1;
        super();
        b = new HashMap();
        c = new HashMap();
    }

    af(f f1, byte byte0)
    {
        this(f1);
    }

    static ag a(af af1, Playlist playlist, Collection collection)
    {
        return af1.a(playlist, collection);
    }

    static ag a(af af1, String s)
    {
        return af1.a(s);
    }

    private ag a(Playlist playlist, Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        com.google.android.apps.youtube.common.fromguava.c.a(playlist);
        s = playlist.id;
        if (b.containsKey(s)) goto _L2; else goto _L1
_L1:
        playlist = new ag(a, this, playlist, (byte)0);
        if (collection == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        for (collection = collection.iterator(); collection.hasNext(); ag.a(playlist, (String)collection.next())) { }
        break MISSING_BLOCK_LABEL_79;
        playlist;
        throw playlist;
        b.put(s, playlist);
_L4:
        this;
        JVM INSTR monitorexit ;
        return playlist;
_L2:
        playlist = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private ag a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        s = (ag)b.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        ag ag1;
        for (Iterator iterator = b.values().iterator(); iterator.hasNext(); a.a(ag.a(ag1)))
        {
            ag1 = (ag)iterator.next();
        }

        break MISSING_BLOCK_LABEL_53;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    static void a(af af1)
    {
        af1.a();
    }

    static void a(af af1, String s, String s1)
    {
        af1.a(s, s1);
    }

    private void a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        HashSet hashset1 = (HashSet)c.get(s);
        HashSet hashset;
        hashset = hashset1;
        if (hashset1 != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        hashset = new HashSet();
        c.put(s, hashset);
        hashset.add(s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    static void b(af af1, String s)
    {
        af1.b(s);
    }

    static void b(af af1, String s, String s1)
    {
        af1.b(s, s1);
    }

    private void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        b.remove(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private void b(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        HashSet hashset = (HashSet)c.get(s);
        if (hashset == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        hashset.remove(s1);
        if (hashset.isEmpty())
        {
            c.remove(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    static List c(af af1, String s)
    {
        return af1.c(s);
    }

    private List c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        LinkedList linkedlist;
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        linkedlist = new LinkedList();
        s = (HashSet)c.get(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        s = s.iterator();
_L2:
        ag ag1;
        do
        {
            if (!s.hasNext())
            {
                break MISSING_BLOCK_LABEL_77;
            }
            ag1 = a((String)s.next());
        } while (ag1 == null);
        linkedlist.add(ag1);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
        this;
        JVM INSTR monitorexit ;
        return linkedlist;
    }
}
