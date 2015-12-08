// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.b;

import a.a.a.c.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package a.a.a.b:
//            a

public class b
    implements a
{

    private final c a = new c();
    private final ReentrantLock b = new ReentrantLock();

    public b()
    {
    }

    public Object a(long l)
    {
        b.lock();
        Reference reference = (Reference)a.a(l);
        b.unlock();
        Exception exception;
        if (reference != null)
        {
            return reference.get();
        } else
        {
            return null;
        }
        exception;
        b.unlock();
        throw exception;
    }

    public Object a(Long long1)
    {
        return a(long1.longValue());
    }

    public volatile Object a(Object obj)
    {
        return a((Long)obj);
    }

    public void a()
    {
        b.lock();
        a.a();
        b.unlock();
        return;
        Exception exception;
        exception;
        b.unlock();
        throw exception;
    }

    public void a(int i)
    {
        a.b(i);
    }

    public void a(long l, Object obj)
    {
        b.lock();
        a.a(l, new WeakReference(obj));
        b.unlock();
        return;
        obj;
        b.unlock();
        throw obj;
    }

    public void a(Iterable iterable)
    {
        b.lock();
        iterable = iterable.iterator();
_L1:
        boolean flag = iterable.hasNext();
        if (!flag)
        {
            b.unlock();
            return;
        }
        Long long1 = (Long)iterable.next();
        a.b(long1.longValue());
          goto _L1
        iterable;
        b.unlock();
        throw iterable;
    }

    public void a(Long long1, Object obj)
    {
        a(long1.longValue(), obj);
    }

    public volatile void a(Object obj, Object obj1)
    {
        a((Long)obj, (Object)obj1);
    }

    public Object b(long l)
    {
        Reference reference = (Reference)a.a(l);
        if (reference != null)
        {
            return reference.get();
        } else
        {
            return null;
        }
    }

    public Object b(Long long1)
    {
        return b(long1.longValue());
    }

    public volatile Object b(Object obj)
    {
        return b((Long)obj);
    }

    public void b()
    {
        b.lock();
    }

    public void b(long l, Object obj)
    {
        a.a(l, new WeakReference(obj));
    }

    public void b(Long long1, Object obj)
    {
        b(long1.longValue(), obj);
    }

    public volatile void b(Object obj, Object obj1)
    {
        b((Long)obj, (Object)obj1);
    }

    public void c()
    {
        b.unlock();
    }

    public void c(Long long1)
    {
        b.lock();
        a.b(long1.longValue());
        b.unlock();
        return;
        long1;
        b.unlock();
        throw long1;
    }

    public volatile void c(Object obj)
    {
        c((Long)obj);
    }

    public boolean c(Long long1, Object obj)
    {
        b.lock();
        if (a(long1) != obj || obj == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c(long1);
        b.unlock();
        return true;
        b.unlock();
        return false;
        long1;
        b.unlock();
        throw long1;
    }

    public volatile boolean c(Object obj, Object obj1)
    {
        return c((Long)obj, (Object)obj1);
    }
}
