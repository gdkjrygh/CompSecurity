// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;

import a.a.a.a;
import a.a.a.d;
import a.a.a.e;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package a.a.a.a:
//            a, d, b

class c
    implements android.os.Handler.Callback, Runnable
{

    private static ExecutorService a = Executors.newCachedThreadPool();
    private static int k[];
    private final BlockingQueue b = new LinkedBlockingQueue();
    private volatile boolean c;
    private volatile int d;
    private volatile a.a.a.a.d e;
    private volatile a.a.a.a.d f;
    private volatile int g;
    private int h;
    private int i;
    private Handler j;

    c()
    {
        d = 50;
        g = 50;
    }

    private void a(a.a.a.a.a a1)
    {
        a1.d();
        a.a.a.a.d d1 = e;
        if (d1 != null)
        {
            d1.a(a1);
        }
        if (f != null)
        {
            if (j == null)
            {
                j = new Handler(Looper.getMainLooper(), this);
            }
            a1 = j.obtainMessage(1, a1);
            j.sendMessage(a1);
        }
        this;
        JVM INSTR monitorenter ;
        i = i + 1;
        if (i == h)
        {
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private void a(a.a.a.a.a a1, a.a.a.a.a a2)
    {
        ArrayList arraylist;
        int l;
        arraylist = new ArrayList();
        arraylist.add(a1);
        arraylist.add(a2);
        a1 = a1.b();
        a1.beginTransaction();
        l = 0;
_L8:
        int i1 = arraylist.size();
        if (l < i1) goto _L2; else goto _L1
_L1:
        l = 0;
_L5:
        a1.endTransaction();
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        a.a.a.e.b("Revered merged transaction because one of the operations failed. Executing operations one by one instead...");
        a1 = arraylist.iterator();
_L6:
        if (a1.hasNext()) goto _L4; else goto _L3
_L3:
        return;
_L2:
        a.a.a.a.a a3;
        a3 = (a.a.a.a.a)arraylist.get(l);
        c(a3);
        if (!a3.c())
        {
            break MISSING_BLOCK_LABEL_109;
        }
        l = 1;
          goto _L5
        if (l != arraylist.size() - 1)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        a2 = (a.a.a.a.a)b.peek();
        if (l >= d || !a3.a(a2))
        {
            break MISSING_BLOCK_LABEL_198;
        }
        a3 = (a.a.a.a.a)b.remove();
        if (a3 == a2)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        throw new d("Internal error: peeked op did not match removed op");
        a2;
        a1.endTransaction();
        throw a2;
        arraylist.add(a3);
        break MISSING_BLOCK_LABEL_271;
        a1.setTransactionSuccessful();
        break MISSING_BLOCK_LABEL_271;
_L4:
        a2 = (a.a.a.a.a)a1.next();
        a2.e();
        b(a2);
          goto _L6
        l = arraylist.size();
        a1 = arraylist.iterator();
        while (a1.hasNext()) 
        {
            a2 = (a.a.a.a.a)a1.next();
            a2.i = l;
            a(a2);
        }
          goto _L3
        l++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static int[] a()
    {
        int ai[] = k;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[a.a.a.a.b.values().length];
        try
        {
            ai[b.u.ordinal()] = 21;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        try
        {
            ai[b.j.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            ai[b.n.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        try
        {
            ai[b.m.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            ai[b.l.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            ai[b.k.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            ai[a.a.a.a.b.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            ai[b.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            ai[b.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            ai[a.a.a.a.b.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            ai[b.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            ai[a.a.a.a.b.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            ai[b.s.ordinal()] = 19;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            ai[b.t.ordinal()] = 20;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[b.q.ordinal()] = 17;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[b.r.ordinal()] = 18;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[b.v.ordinal()] = 22;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[b.p.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[b.o.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[b.g.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[b.i.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[b.h.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        k = ai;
        return ai;
    }

    private void b(a.a.a.a.a a1)
    {
        c(a1);
        a(a1);
    }

    private void c(a.a.a.a.a a1)
    {
        a1.e = System.currentTimeMillis();
        a()[a1.a.ordinal()];
        JVM INSTR tableswitch 1 22: default 493
    //                   1 210
    //                   2 225
    //                   3 242
    //                   4 259
    //                   5 274
    //                   6 291
    //                   7 308
    //                   8 322
    //                   9 339
    //                   10 162
    //                   11 176
    //                   12 193
    //                   13 406
    //                   14 420
    //                   15 356
    //                   16 364
    //                   17 372
    //                   18 389
    //                   19 430
    //                   20 448
    //                   21 462
    //                   22 479;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23
_L23:
        break MISSING_BLOCK_LABEL_479;
_L1:
        Throwable throwable;
        throw new d((new StringBuilder("Unsupported operation: ")).append(a1.a).toString());
_L24:
        a1.f = System.currentTimeMillis();
        return;
_L11:
        try
        {
            a1.b.delete(a1.c);
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            a1.g = throwable;
        }
          goto _L24
_L12:
        a1.b.deleteInTx((Iterable)a1.c);
          goto _L24
_L13:
        a1.b.deleteInTx((Object[])a1.c);
          goto _L24
_L2:
        a1.b.insert(a1.c);
          goto _L24
_L3:
        a1.b.insertInTx((Iterable)a1.c);
          goto _L24
_L4:
        a1.b.insertInTx((Object[])a1.c);
          goto _L24
_L5:
        a1.b.insertOrReplace(a1.c);
          goto _L24
_L6:
        a1.b.insertOrReplaceInTx((Iterable)a1.c);
          goto _L24
_L7:
        a1.b.insertOrReplaceInTx((Object[])a1.c);
          goto _L24
_L8:
        a1.b.update(a1.c);
          goto _L24
_L9:
        a1.b.updateInTx((Iterable)a1.c);
          goto _L24
_L10:
        a1.b.updateInTx((Object[])a1.c);
          goto _L24
_L16:
        d(a1);
          goto _L24
_L17:
        e(a1);
          goto _L24
_L18:
        a1.h = ((a.a.a.d.e)a1.c).c();
          goto _L24
_L19:
        a1.h = ((a.a.a.d.e)a1.c).d();
          goto _L24
_L14:
        a1.b.deleteByKey(a1.c);
          goto _L24
_L15:
        a1.b.deleteAll();
          goto _L24
_L20:
        a1.h = a1.b.load(a1.c);
          goto _L24
_L21:
        a1.h = a1.b.loadAll();
          goto _L24
_L22:
        a1.h = Long.valueOf(a1.b.count());
          goto _L24
        a1.b.refresh(a1.c);
          goto _L24
    }

    private void d(a.a.a.a.a a1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = a1.b();
        sqlitedatabase.beginTransaction();
        ((Runnable)a1.c).run();
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        a1;
        sqlitedatabase.endTransaction();
        throw a1;
    }

    private void e(a.a.a.a.a a1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = a1.b();
        sqlitedatabase.beginTransaction();
        a1.h = ((Callable)a1.c).call();
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        a1;
        sqlitedatabase.endTransaction();
        throw a1;
    }

    public boolean handleMessage(Message message)
    {
        a.a.a.a.d d1 = f;
        if (d1 != null)
        {
            d1.a((a.a.a.a.a)message.obj);
        }
        return false;
    }

    public void run()
    {
_L3:
        Object obj = (a.a.a.a.a)b.poll(1L, TimeUnit.SECONDS);
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        obj = (a.a.a.a.a)b.poll();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        c = false;
        this;
        JVM INSTR monitorexit ;
        c = false;
        return;
        this;
        JVM INSTR monitorexit ;
_L2:
        a.a.a.a.a a1;
        if (!((a.a.a.a.a) (obj)).a())
        {
            break MISSING_BLOCK_LABEL_167;
        }
        a1 = (a.a.a.a.a)b.poll(g, TimeUnit.MILLISECONDS);
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (!((a.a.a.a.a) (obj)).a(a1))
        {
            break MISSING_BLOCK_LABEL_154;
        }
        a(((a.a.a.a.a) (obj)), a1);
          goto _L3
_L5:
        a.a.a.e.a((new StringBuilder(String.valueOf(Thread.currentThread().getName()))).append(" was interruppted").toString(), ((Throwable) (obj)));
        c = false;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            c = false;
        }
        if (true) goto _L5; else goto _L4
_L4:
        throw obj;
        b(((a.a.a.a.a) (obj)));
        b(a1);
          goto _L3
        b(((a.a.a.a.a) (obj)));
          goto _L3
    }

}
