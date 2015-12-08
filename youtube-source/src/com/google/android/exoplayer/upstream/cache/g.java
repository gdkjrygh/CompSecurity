// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream.cache;

import android.os.ConditionVariable;
import com.google.android.exoplayer.e.a;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//            a, h, d, c

public final class g
    implements com.google.android.exoplayer.upstream.cache.a
{

    private final File a;
    private final c b;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();
    private long e;

    public g(File file, c c1)
    {
        e = 0L;
        a = file;
        b = c1;
        file = new ConditionVariable();
        (new h(this, file)).start();
        file.block();
    }

    private d a(String s, d d1)
    {
        d1 = c(d1);
        if (d1.d)
        {
            s = (TreeSet)d.get(d1.a);
            com.google.android.exoplayer.e.a.b(s.remove(d1));
            e = e - d1.c;
            b.a(d1);
            d1 = d1.b();
            s.add(d1);
            e = e + d1.c;
            b.a(this, d1);
            return d1;
        } else
        {
            c.put(s, d1);
            return d1;
        }
    }

    static void a(g g1)
    {
        if (!g1.a.exists())
        {
            g1.a.mkdirs();
        }
        File afile[] = g1.a.listFiles();
        if (afile != null)
        {
            int i = 0;
            while (i < afile.length) 
            {
                File file = afile[i];
                if (file.length() == 0L)
                {
                    file.delete();
                } else
                {
                    d d1 = com.google.android.exoplayer.upstream.cache.d.a(file);
                    if (d1 == null)
                    {
                        file.delete();
                    } else
                    {
                        g1.d(d1);
                    }
                }
                i++;
            }
        }
    }

    private d c(d d1)
    {
_L6:
        Object obj;
        TreeSet treeset;
        long l;
        obj = d1.a;
        l = d1.b;
        treeset = (TreeSet)d.get(obj);
        if (treeset != null) goto _L2; else goto _L1
_L1:
        obj = com.google.android.exoplayer.upstream.cache.d.b(((String) (obj)), d1.b);
_L4:
        return ((d) (obj));
_L2:
        d d2;
        d2 = (d)treeset.floor(d1);
        if (d2 == null || d2.b > l || l >= d2.b + d2.c)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = d2;
        if (d2.e.exists()) goto _L4; else goto _L3
_L3:
        c();
        if (true) goto _L6; else goto _L5
_L5:
        d d3 = (d)treeset.ceiling(d1);
        if (d3 == null)
        {
            return com.google.android.exoplayer.upstream.cache.d.b(((String) (obj)), d1.b);
        } else
        {
            return com.google.android.exoplayer.upstream.cache.d.a(((String) (obj)), d1.b, d3.b - d1.b);
        }
    }

    private void c()
    {
        Iterator iterator = d.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Iterator iterator1 = ((TreeSet)((java.util.Map.Entry)iterator.next()).getValue()).iterator();
            boolean flag = true;
            while (iterator1.hasNext()) 
            {
                d d1 = (d)iterator1.next();
                if (!d1.e.exists())
                {
                    iterator1.remove();
                    if (d1.d)
                    {
                        e = e - d1.c;
                    }
                    b.a(d1);
                } else
                {
                    flag = false;
                }
            }
            if (flag)
            {
                iterator.remove();
            }
        } while (true);
    }

    private void d(d d1)
    {
        TreeSet treeset1 = (TreeSet)d.get(d1.a);
        TreeSet treeset = treeset1;
        if (treeset1 == null)
        {
            treeset = new TreeSet();
            d.put(d1.a, treeset);
        }
        treeset.add(d1);
        e = e + d1.c;
        b.a(this, d1);
    }

    public final d a(String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        d d1;
        d1 = com.google.android.exoplayer.upstream.cache.d.a(s, l);
        for (; c.containsKey(s); wait()) { }
        break MISSING_BLOCK_LABEL_32;
        s;
        throw s;
        s = a(s, d1);
        this;
        JVM INSTR monitorexit ;
        return s;
    }

    public final File a(String s, long l, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.exoplayer.e.a.b(c.containsKey(s));
        if (!a.exists())
        {
            c();
            a.mkdirs();
        }
        b.a(this, l1);
        s = com.google.android.exoplayer.upstream.cache.d.a(a, s, l, System.currentTimeMillis());
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final Set a()
    {
        this;
        JVM INSTR monitorenter ;
        HashSet hashset = new HashSet(d.keySet());
        this;
        JVM INSTR monitorexit ;
        return hashset;
        Exception exception;
        exception;
        throw exception;
    }

    public final SortedSet a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (TreeSet)d.get(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = new TreeSet(s);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public final void a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (d1 == c.remove(d1.a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    public final void a(File file)
    {
        this;
        JVM INSTR monitorenter ;
        d d1 = com.google.android.exoplayer.upstream.cache.d.a(file);
        boolean flag;
        if (d1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        com.google.android.exoplayer.e.a.b(c.containsKey(d1.a));
        flag = file.exists();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (file.length() != 0L)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        file.delete();
          goto _L1
        file;
        throw file;
        d(d1);
          goto _L1
    }

    public final long b()
    {
        this;
        JVM INSTR monitorenter ;
        long l = e;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final d b(String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        d d1;
        boolean flag;
        d1 = com.google.android.exoplayer.upstream.cache.d.a(s, l);
        flag = c.containsKey(s);
        if (!flag) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = a(s, d1);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public final void b(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        TreeSet treeset = (TreeSet)d.get(d1.a);
        e = e - d1.c;
        com.google.android.exoplayer.e.a.b(treeset.remove(d1));
        d1.e.delete();
        if (treeset.isEmpty())
        {
            d.remove(d1.a);
        }
        b.a(d1);
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }
}
