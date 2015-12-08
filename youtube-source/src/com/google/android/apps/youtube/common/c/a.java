// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.c;

import android.os.Looper;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.google.android.apps.youtube.common.c:
//            e, i, h, j, 
//            c, g, k, f, 
//            b, d

public final class a
{

    public static final Object a = new Object();
    private static final Map b = new HashMap();
    private final Executor c;
    private b d;
    private final Map e;
    private final Map f;
    private final ReadWriteLock g;

    private a(Executor executor)
    {
        c = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        e = new HashMap();
        f = new HashMap();
        g = new ReentrantReadWriteLock();
    }

    public a(Executor executor, b b1)
    {
        this(executor);
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
    }

    private e a(Object obj, Class class1, Object obj1, d d1)
    {
        obj1 = new e(obj, class1, obj1, d1);
        g.writeLock().lock();
        com.google.android.apps.youtube.common.e.c.a(e, class1, obj1);
        com.google.android.apps.youtube.common.e.c.a(f, new i(obj), obj1);
        g.writeLock().unlock();
        b(class1, new h(((e) (obj1))));
        return ((e) (obj1));
        obj;
        g.writeLock().unlock();
        throw obj;
    }

    public static Object a()
    {
        return new Object();
    }

    private Set a(Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b.containsKey(class1)) goto _L2; else goto _L1
_L1:
        Method amethod[];
        int i1;
        amethod = class1.getDeclaredMethods();
        i1 = amethod.length;
        int l = 0;
_L7:
        if (l >= i1) goto _L2; else goto _L3
_L3:
        Method method = amethod[l];
        if (!method.isAnnotationPresent(com/google/android/apps/youtube/common/c/j)) goto _L5; else goto _L4
_L4:
        Class class2;
        boolean flag;
        if (method.getParameterTypes().length == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "Event handler methods can only take a single event argument.");
        class2 = method.getParameterTypes()[0];
        com.google.android.apps.youtube.common.e.c.a(b, class1, new com.google.android.apps.youtube.common.c.c(class2, method, (byte)0));
          goto _L5
_L2:
        class1 = com.google.android.apps.youtube.common.e.c.a(b, class1);
        this;
        JVM INSTR monitorexit ;
        return class1;
        class1;
        throw class1;
_L5:
        l++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static ReadWriteLock a(a a1)
    {
        return a1.g;
    }

    private void a(Collection collection)
    {
        Object obj;
        obj = new HashMap();
        g.writeLock().lock();
        collection = collection.iterator();
_L4:
        e e1;
        Class class1;
        Object obj1;
        boolean flag;
        if (!collection.hasNext())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        e1 = (e)collection.next();
        class1 = e1.b();
        flag = com.google.android.apps.youtube.common.e.c.b(e, class1, e1);
        obj1 = e1.a();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        com.google.android.apps.youtube.common.e.c.b(f, new i(obj1), e1);
_L2:
        if (!flag) goto _L4; else goto _L3
_L3:
        if (e.containsKey(class1)) goto _L4; else goto _L5
_L5:
        ((Map) (obj)).put(class1, new g());
          goto _L4
        collection;
        g.writeLock().unlock();
        throw collection;
        g.writeLock().unlock();
        for (collection = ((Map) (obj)).entrySet().iterator(); collection.hasNext(); b(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue()))
        {
            obj = (java.util.Map.Entry)collection.next();
        }

        return;
    }

    static Map b(a a1)
    {
        return a1.e;
    }

    public final e a(Object obj, Class class1, d d1)
    {
        return a(obj, class1, a, d1);
    }

    public final void a(k k1)
    {
        if (d != null)
        {
            k1.a(d.b());
        }
        b(a, k1);
    }

    public final void a(Object obj)
    {
        a(obj, obj.getClass(), a);
    }

    public final void a(Object obj, Class class1, Object obj1)
    {
        boolean flag;
        flag = true;
        com.google.android.apps.youtube.common.fromguava.c.a(class1.isAssignableFrom(obj.getClass()), "clazz must be a superclass of target");
        g.writeLock().lock();
        Object obj2 = a(class1);
        if (((Set) (obj2)).isEmpty())
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, String.format("Class %s does not contain any methods annotated with @Subscribe", new Object[] {
            class1.getSimpleName()
        }));
        for (class1 = ((Set) (obj2)).iterator(); class1.hasNext(); a(obj, com.google.android.apps.youtube.common.c.c.a(((com.google.android.apps.youtube.common.c.c) (obj2))), obj1, ((d) (new f(obj, com.google.android.apps.youtube.common.c.c.b(((com.google.android.apps.youtube.common.c.c) (obj2))))))))
        {
            obj2 = (com.google.android.apps.youtube.common.c.c)class1.next();
        }

        break MISSING_BLOCK_LABEL_147;
        obj;
        g.writeLock().unlock();
        throw obj;
        g.writeLock().unlock();
        return;
    }

    public final void a(Object obj, Object obj1)
    {
        a(obj, obj.getClass(), obj1);
    }

    public final transient void a(e ae[])
    {
        a(((Collection) (Arrays.asList(ae))));
    }

    public final void b(Object obj)
    {
        g.writeLock().lock();
        a(Collections.unmodifiableSet(new HashSet(com.google.android.apps.youtube.common.e.c.a(f, new i(obj)))));
        g.writeLock().unlock();
        return;
        obj;
        g.writeLock().unlock();
        throw obj;
    }

    public final void b(Object obj, Object obj1)
    {
        obj = new com.google.android.apps.youtube.common.c.b(this, obj1, obj);
        boolean flag;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ((Runnable) (obj)).run();
            return;
        } else
        {
            c.execute(((Runnable) (obj)));
            return;
        }
    }

    public final void c(Object obj)
    {
        b(a, obj);
    }

}
