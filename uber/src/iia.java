// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicReference;

public final class iia
{

    static final ihx a = new ihx() {

    };
    private static final iia b = new iia();
    private final AtomicReference c = new AtomicReference();
    private final AtomicReference d = new AtomicReference();
    private final AtomicReference e = new AtomicReference();

    iia()
    {
    }

    public static iia a()
    {
        return b;
    }

    private static Object a(Class class1)
    {
        String s = class1.getSimpleName();
        String s1 = System.getProperty((new StringBuilder("rxjava.plugin.")).append(s).append(".implementation").toString());
        if (s1 != null)
        {
            try
            {
                class1 = ((Class) (Class.forName(s1).asSubclass(class1).newInstance()));
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException((new StringBuilder()).append(s).append(" implementation is not an instance of ").append(s).append(": ").append(s1).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException((new StringBuilder()).append(s).append(" implementation class not found: ").append(s1).toString(), class1);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException((new StringBuilder()).append(s).append(" implementation not able to be instantiated: ").append(s1).toString(), class1);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException((new StringBuilder()).append(s).append(" implementation not able to be accessed: ").append(s1).toString(), class1);
            }
            return class1;
        } else
        {
            return null;
        }
    }

    public final void a(iib iib1)
    {
        if (!e.compareAndSet(null, iib1))
        {
            throw new IllegalStateException((new StringBuilder("Another strategy was already registered: ")).append(e.get()).toString());
        } else
        {
            return;
        }
    }

    public final ihx b()
    {
        if (c.get() == null)
        {
            Object obj = a(ihx);
            if (obj == null)
            {
                c.compareAndSet(null, a);
            } else
            {
                c.compareAndSet(null, (ihx)obj);
            }
        }
        return (ihx)c.get();
    }

    public final ihy c()
    {
        if (d.get() == null)
        {
            Object obj = a(ihy);
            if (obj == null)
            {
                d.compareAndSet(null, ihz.a());
            } else
            {
                d.compareAndSet(null, (ihy)obj);
            }
        }
        return (ihy)d.get();
    }

    public final iib d()
    {
        if (e.get() == null)
        {
            Object obj = a(iib);
            if (obj == null)
            {
                e.compareAndSet(null, iib.d());
            } else
            {
                e.compareAndSet(null, (iib)obj);
            }
        }
        return (iib)e.get();
    }

}
