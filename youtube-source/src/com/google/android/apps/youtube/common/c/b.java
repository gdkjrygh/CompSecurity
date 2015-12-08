// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.c;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

// Referenced classes of package com.google.android.apps.youtube.common.c:
//            a, e, d

final class b
    implements Runnable
{

    final Object a;
    final Object b;
    final a c;

    b(a a1, Object obj, Object obj1)
    {
        c = a1;
        a = obj;
        b = obj1;
        super();
    }

    public final void run()
    {
        com.google.android.apps.youtube.common.c.a.a(c).readLock().lock();
        Object obj = com.google.android.apps.youtube.common.e.c.a(new ArrayList(com.google.android.apps.youtube.common.e.c.a(com.google.android.apps.youtube.common.c.a.b(c), a.getClass())));
        com.google.android.apps.youtube.common.c.a.a(c).readLock().unlock();
_L1:
        if (obj != null && !((List) (obj)).isEmpty())
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                e e1 = (e)((Iterator) (obj)).next();
                int i = e1.d();
                Object obj1;
                if (i == b.hashCode() || i == a.a.hashCode())
                {
                    if (e1.a() != null)
                    {
                        e1.c().a(a);
                    } else
                    {
                        c.a(new e[] {
                            e1
                        });
                    }
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_217;
        obj1;
        L.a("exception ", ((Throwable) (obj1)));
        obj1 = null;
        com.google.android.apps.youtube.common.c.a.a(c).readLock().unlock();
          goto _L1
        obj1;
        com.google.android.apps.youtube.common.c.a.a(c).readLock().unlock();
        throw obj1;
    }
}
