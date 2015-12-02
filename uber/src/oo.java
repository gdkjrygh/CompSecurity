// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

final class oo
    implements akg, Runnable
{

    CountDownLatch a;
    private final List b = new Vector();
    private final AtomicReference c = new AtomicReference();
    private oj d;

    public oo(oj oj1)
    {
        a = new CountDownLatch(1);
        d = oj1;
        kx.a();
        if (oe.b())
        {
            ajb.a(this);
            return;
        } else
        {
            run();
            return;
        }
    }

    private static akg a(String s, Context context, boolean flag)
    {
        return aly.a(s, context, flag);
    }

    private void a(akg akg1)
    {
        c.set(akg1);
    }

    private boolean a()
    {
        try
        {
            a.await();
        }
        catch (InterruptedException interruptedexception)
        {
            of.d("Interrupted during GADSignals creation.", interruptedexception);
            return false;
        }
        return true;
    }

    private static Context b(Context context)
    {
        Context context1;
        if (((Boolean)abn.k.c()).booleanValue())
        {
            if ((context1 = context.getApplicationContext()) != null)
            {
                return context1;
            }
        }
        return context;
    }

    private void b()
    {
        if (b.isEmpty())
        {
            return;
        }
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object aobj[] = (Object[])iterator.next();
            if (aobj.length == 1)
            {
                ((akg)c.get()).a((MotionEvent)aobj[0]);
            } else
            if (aobj.length == 3)
            {
                ((akg)c.get()).a(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
            }
        } while (true);
        b.clear();
    }

    public final String a(Context context)
    {
        if (a())
        {
            akg akg1 = (akg)c.get();
            if (akg1 != null)
            {
                b();
                return akg1.a(b(context));
            }
        }
        return "";
    }

    public final String a(Context context, String s)
    {
        if (a())
        {
            akg akg1 = (akg)c.get();
            if (akg1 != null)
            {
                b();
                return akg1.a(b(context), s);
            }
        }
        return "";
    }

    public final void a(int i, int j, int k)
    {
        akg akg1 = (akg)c.get();
        if (akg1 != null)
        {
            b();
            akg1.a(i, j, k);
            return;
        } else
        {
            b.add(((Object) (new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
            })));
            return;
        }
    }

    public final void a(MotionEvent motionevent)
    {
        akg akg1 = (akg)c.get();
        if (akg1 != null)
        {
            b();
            akg1.a(motionevent);
            return;
        } else
        {
            b.add(((Object) (new Object[] {
                motionevent
            })));
            return;
        }
    }

    public final void run()
    {
        Exception exception;
        boolean flag;
        if (((Boolean)abn.s.c()).booleanValue() && !d.d.e)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        a(a(d.d.b, b(d.b), flag));
        a.countDown();
        d = null;
        return;
        exception;
        a.countDown();
        d = null;
        throw exception;
    }
}
