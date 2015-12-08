// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.b;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package a.a.a.b:
//            a

public class c
    implements a
{

    private final HashMap a = new HashMap();
    private final ReentrantLock b = new ReentrantLock();

    public c()
    {
    }

    public Object a(Object obj)
    {
        b.lock();
        obj = (Reference)a.get(obj);
        b.unlock();
        if (obj != null)
        {
            return ((Reference) (obj)).get();
        } else
        {
            return null;
        }
        obj;
        b.unlock();
        throw obj;
    }

    public void a()
    {
        b.lock();
        a.clear();
        b.unlock();
        return;
        Exception exception;
        exception;
        b.unlock();
        throw exception;
    }

    public void a(int i)
    {
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
        Object obj = (Object)iterable.next();
        a.remove(obj);
          goto _L1
        iterable;
        b.unlock();
        throw iterable;
    }

    public void a(Object obj, Object obj1)
    {
        b.lock();
        a.put(obj, new WeakReference(obj1));
        b.unlock();
        return;
        obj;
        b.unlock();
        throw obj;
    }

    public Object b(Object obj)
    {
        obj = (Reference)a.get(obj);
        if (obj != null)
        {
            return ((Reference) (obj)).get();
        } else
        {
            return null;
        }
    }

    public void b()
    {
        b.lock();
    }

    public void b(Object obj, Object obj1)
    {
        a.put(obj, new WeakReference(obj1));
    }

    public void c()
    {
        b.unlock();
    }

    public void c(Object obj)
    {
        b.lock();
        a.remove(obj);
        b.unlock();
        return;
        obj;
        b.unlock();
        throw obj;
    }

    public boolean c(Object obj, Object obj1)
    {
        b.lock();
        if (a(obj) != obj1 || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c(obj);
        b.unlock();
        return true;
        b.unlock();
        return false;
        obj;
        b.unlock();
        throw obj;
    }
}
