// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.d;

import a.a.a.a;
import android.os.Process;
import android.util.SparseArray;
import java.lang.ref.WeakReference;

// Referenced classes of package a.a.a.d:
//            a

abstract class b
{

    final String a;
    final a b;
    final String c[];
    final SparseArray d = new SparseArray();

    b(a a1, String s, String as[])
    {
        b = a1;
        a = s;
        c = as;
    }

    a.a.a.d.a a()
    {
        int i = Process.myTid();
        SparseArray sparsearray = d;
        sparsearray;
        JVM INSTR monitorenter ;
        Object obj = (WeakReference)d.get(i);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = (a.a.a.d.a)((WeakReference) (obj)).get();
_L5:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        c();
        obj = b();
        d.put(i, new WeakReference(obj));
_L3:
        sparsearray;
        JVM INSTR monitorexit ;
        return ((a.a.a.d.a) (obj));
        System.arraycopy(c, 0, ((a.a.a.d.a) (obj)).d, 0, c.length);
          goto _L3
        obj;
        sparsearray;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    a.a.a.d.a a(a.a.a.d.a a1)
    {
        if (Thread.currentThread() == a1.e)
        {
            System.arraycopy(c, 0, a1.d, 0, c.length);
            return a1;
        } else
        {
            return a();
        }
    }

    protected abstract a.a.a.d.a b();

    void c()
    {
        SparseArray sparsearray = d;
        sparsearray;
        JVM INSTR monitorenter ;
        int i = d.size() - 1;
_L2:
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        sparsearray;
        JVM INSTR monitorexit ;
        return;
        if (((WeakReference)d.valueAt(i)).get() == null)
        {
            d.remove(d.keyAt(i));
        }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
        i--;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
