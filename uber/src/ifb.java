// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

final class ifb extends ick
{

    static final iez q[] = new iez[0];
    final ick a;
    final boolean b;
    final int c;
    ifa d;
    volatile igg e;
    volatile iiy f;
    volatile ConcurrentLinkedQueue g;
    final idv h = idv.a();
    volatile boolean i;
    boolean j;
    boolean k;
    final Object l = new Object();
    volatile iez m[];
    long n;
    long o;
    int p;

    public ifb(ick ick1, boolean flag, int i1)
    {
        a = ick1;
        b = flag;
        c = i1;
        m = q;
        a(Math.min(i1, igg.c));
    }

    private void a(ica ica1)
    {
        if (ica1 == null)
        {
            return;
        }
        if (ica1 instanceof igi)
        {
            b(((igi)ica1).a());
            return;
        } else
        {
            long l1 = n;
            n = 1L + l1;
            iez iez1 = new iez(this, l1);
            a(iez1);
            ica1.a(iez1);
            f();
            return;
        }
    }

    private void a(iez iez1)
    {
        g().a(iez1);
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        iez aiez1[];
        int i1;
        iez aiez[] = m;
        i1 = aiez.length;
        aiez1 = new iez[i1 + 1];
        System.arraycopy(aiez, 0, aiez1, 0, i1);
        aiez1[i1] = iez1;
        m = aiez1;
        obj;
        JVM INSTR monitorexit ;
        return;
        iez1;
        obj;
        JVM INSTR monitorexit ;
        throw iez1;
    }

    private void a(iez iez1, Object obj, long l1)
    {
        boolean flag = false;
        a.a(obj);
_L9:
        if (l1 == 0x7fffffffffffffffL)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        d.a(1);
        iez1.b(1L);
        this;
        JVM INSTR monitorenter ;
        if (k) goto _L2; else goto _L1
_L1:
        j = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        if (b) goto _L4; else goto _L3
_L3:
        icw.a(((Throwable) (obj)));
        iez1.b();
        iez1.a(((Throwable) (obj)));
        return;
        iez1;
        flag = true;
_L7:
        if (flag) goto _L6; else goto _L5
_L5:
        this;
        JVM INSTR monitorenter ;
        j = false;
        this;
        JVM INSTR monitorexit ;
_L6:
        throw iez1;
_L4:
        e().offer(obj);
        continue; /* Loop/switch isn't completed */
        iez1;
        if (true) goto _L7; else goto _L2
_L2:
        k = false;
        this;
        JVM INSTR monitorexit ;
        j();
        return;
        iez1;
        this;
        JVM INSTR monitorexit ;
        throw iez1;
        iez1;
        this;
        JVM INSTR monitorexit ;
        throw iez1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void a(Object obj, long l1)
    {
        boolean flag = false;
        a.a(obj);
_L9:
        if (l1 == 0x7fffffffffffffffL)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        d.a(1);
        i();
        this;
        JVM INSTR monitorenter ;
        if (k) goto _L2; else goto _L1
_L1:
        j = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        if (b) goto _L4; else goto _L3
_L3:
        icw.a(((Throwable) (obj)));
        b();
        a(((Throwable) (obj)));
        return;
        obj;
        flag = true;
_L7:
        if (flag) goto _L6; else goto _L5
_L5:
        this;
        JVM INSTR monitorenter ;
        j = false;
        this;
        JVM INSTR monitorexit ;
_L6:
        throw obj;
_L4:
        e().offer(obj);
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L7; else goto _L2
_L2:
        k = false;
        this;
        JVM INSTR monitorexit ;
        j();
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void b(iez iez1)
    {
        int i1;
        i1 = 0;
        igg igg1 = iez1.d;
        if (igg1 != null)
        {
            igg1.e();
        }
        f.b(iez1);
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        iez aiez[];
        int j1;
        aiez = m;
        j1 = aiez.length;
_L6:
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        if (!iez1.equals(aiez[i1])) goto _L4; else goto _L3
_L3:
        if (i1 >= 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        if (j1 != 1)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        m = q;
        obj;
        JVM INSTR monitorexit ;
        return;
        iez1;
        obj;
        JVM INSTR monitorexit ;
        throw iez1;
        iez1 = new iez[j1 - 1];
        System.arraycopy(aiez, 0, iez1, 0, i1);
        System.arraycopy(aiez, i1 + 1, iez1, i1, j1 - i1 - 1);
        m = iez1;
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        i1 = -1;
        if (true) goto _L3; else goto _L4
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void b(iez iez1, Object obj)
    {
        igg igg1;
        igg igg2 = iez1.d;
        igg1 = igg2;
        if (igg2 == null)
        {
            igg1 = igg.a();
            iez1.a(igg1);
            iez1.d = igg1;
        }
        igg1.a(idv.a(obj));
        f();
_L2:
        return;
        obj;
        iez1.b();
        iez1.a(((Throwable) (obj)));
        return;
        obj;
        if (!iez1.c())
        {
            iez1.b();
            iez1.a(((Throwable) (obj)));
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void b(Object obj)
    {
        if (d.get() == 0L)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        this;
        JVM INSTR monitorenter ;
        long l1 = d.get();
        if (j || l1 == 0L) goto _L2; else goto _L1
_L1:
        j = true;
        boolean flag = true;
_L3:
        this;
        JVM INSTR monitorexit ;
_L4:
        if (flag)
        {
            a(obj, l1);
            return;
        } else
        {
            c(obj);
            return;
        }
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        flag = false;
          goto _L3
        l1 = 0L;
        flag = false;
          goto _L4
    }

    private void c(Object obj)
    {
        igg igg1;
        igg igg2 = e;
        igg1 = igg2;
        if (igg2 == null)
        {
            igg1 = igg.a();
            a(igg1);
            e = igg1;
        }
        igg1.a(idv.a(obj));
        f();
_L2:
        return;
        obj;
        b();
        a(((Throwable) (obj)));
        return;
        obj;
        if (!c())
        {
            b();
            a(((Throwable) (obj)));
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private iiy g()
    {
        iiy iiy1;
        iiy iiy2;
        iiy1 = f;
        iiy2 = iiy1;
        if (iiy1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        iiy1 = f;
        if (iiy1 != null) goto _L4; else goto _L3
_L3:
        iiy1 = new iiy();
        f = iiy1;
        boolean flag = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        iiy2 = iiy1;
        if (flag)
        {
            a(iiy1);
            iiy2 = iiy1;
        }
_L2:
        return iiy2;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void h()
    {
        ArrayList arraylist = new ArrayList(g);
        if (arraylist.size() == 1)
        {
            a.a((Throwable)arraylist.get(0));
            return;
        } else
        {
            a.a(new icr(arraylist, (byte)0));
            return;
        }
    }

    private void i()
    {
        a(1L);
    }

    private void j()
    {
        int i1;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        i1 = ((flag1) ? 1 : 0);
        ick ick1 = a;
_L50:
        i1 = ((flag1) ? 1 : 0);
        if (k())
        {
            return;
        }
        i1 = ((flag1) ? 1 : 0);
        Object obj2 = e;
        i1 = ((flag1) ? 1 : 0);
        long l3 = d.get();
        Object obj;
        Object obj1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        boolean flag;
        int l2;
        int i3;
        int j3;
        long l4;
        iez iez1;
        igg igg1;
        boolean flag3;
        if (l3 == 0x7fffffffffffffffL)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = 0;
        k1 = 0;
        l4 = l3;
          goto _L1
_L7:
        obj1 = obj;
        if (l3 <= 0L) goto _L3; else goto _L2
_L2:
        i1 = ((flag1) ? 1 : 0);
        obj = ((igg) (obj2)).h();
        i1 = ((flag1) ? 1 : 0);
        if (k()) goto _L5; else goto _L4
_L4:
        obj1 = obj;
        if (obj == null) goto _L3; else goto _L6
_L6:
        i1 = ((flag1) ? 1 : 0);
        obj1 = idv.d(obj);
        i1 = ((flag1) ? 1 : 0);
        ick1.a(obj1);
_L10:
        l3--;
        k1++;
        l1++;
          goto _L7
        obj1;
        i1 = ((flag1) ? 1 : 0);
        if (b)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        i1 = ((flag1) ? 1 : 0);
        icw.a(((Throwable) (obj1)));
        k1 = 1;
        i1 = k1;
        b();
        i1 = k1;
        ick1.a(((Throwable) (obj1)));
        return;
        obj;
        if (i1 != 0) goto _L9; else goto _L8
_L8:
        this;
        JVM INSTR monitorenter ;
        j = false;
        this;
        JVM INSTR monitorexit ;
_L9:
        throw obj;
        i1 = ((flag1) ? 1 : 0);
        e().offer(obj1);
          goto _L10
_L53:
        i1 = ((flag1) ? 1 : 0);
        flag3 = i;
        i1 = ((flag1) ? 1 : 0);
        obj = e;
        i1 = ((flag1) ? 1 : 0);
        obj2 = m;
        i1 = ((flag1) ? 1 : 0);
        j3 = obj2.length;
        if (!flag3) goto _L12; else goto _L11
_L11:
        if (obj == null) goto _L14; else goto _L13
_L13:
        i1 = ((flag1) ? 1 : 0);
        if (!((igg) (obj)).g()) goto _L12; else goto _L14
_L14:
        if (j3 != 0) goto _L12; else goto _L15
_L15:
        i1 = ((flag1) ? 1 : 0);
        obj1 = g;
        if (obj1 == null) goto _L17; else goto _L16
_L16:
        i1 = ((flag1) ? 1 : 0);
        if (!((Queue) (obj1)).isEmpty()) goto _L18; else goto _L17
_L17:
        i1 = ((flag1) ? 1 : 0);
        ick1.a();
_L21:
        if (obj == null) goto _L5; else goto _L19
_L19:
        i1 = ((flag1) ? 1 : 0);
        ((igg) (obj)).e();
        return;
_L56:
        i1 = ((flag1) ? 1 : 0);
        l3 = d.a(k1);
          goto _L20
_L18:
        i1 = ((flag1) ? 1 : 0);
        h();
          goto _L21
_L12:
        if (j3 <= 0) goto _L23; else goto _L22
_L22:
        i1 = ((flag1) ? 1 : 0);
        l3 = o;
        i1 = ((flag1) ? 1 : 0);
        i2 = p;
        if (j3 <= i2) goto _L25; else goto _L24
_L24:
        i1 = ((flag1) ? 1 : 0);
        l1 = i2;
        if (((iez) (obj2[i2])).b == l3) goto _L26; else goto _L25
_L60:
        if (i2 >= j3) goto _L28; else goto _L27
_L27:
        i1 = ((flag1) ? 1 : 0);
        if (((iez) (obj2[l1])).b == l3) goto _L28; else goto _L29
_L28:
        i1 = ((flag1) ? 1 : 0);
        p = l1;
        i1 = ((flag1) ? 1 : 0);
        o = ((iez) (obj2[l1])).b;
          goto _L26
_L61:
        k2 = k1;
        i1 = l1;
        if (i3 >= j3) goto _L31; else goto _L30
_L30:
        i1 = ((flag1) ? 1 : 0);
        if (k()) goto _L5; else goto _L32
_L32:
        iez1 = obj2[l2];
        obj1 = null;
        l4 = l3;
          goto _L33
_L39:
        obj = obj1;
        if (l3 <= 0L) goto _L35; else goto _L34
_L34:
        i1 = ((flag1) ? 1 : 0);
        if (k()) goto _L5; else goto _L36
_L36:
        i1 = ((flag1) ? 1 : 0);
        igg1 = iez1.d;
        obj = obj1;
        if (igg1 == null) goto _L35; else goto _L37
_L37:
        i1 = ((flag1) ? 1 : 0);
        obj1 = igg1.h();
        obj = obj1;
        if (obj1 == null) goto _L35; else goto _L38
_L38:
        i1 = ((flag1) ? 1 : 0);
        obj = idv.d(obj1);
        i1 = ((flag1) ? 1 : 0);
        ick1.a(obj);
        i2++;
        l3--;
          goto _L39
        obj;
        k1 = 1;
        i1 = k1;
        icw.a(((Throwable) (obj)));
        ick1.a(((Throwable) (obj)));
        i1 = k1;
        b();
        return;
        obj;
        i1 = k1;
        b();
        i1 = k1;
        throw obj;
_L35:
        if (i2 <= 0) goto _L41; else goto _L40
_L40:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_1141;
        }
        i1 = ((flag1) ? 1 : 0);
        l3 = d.a(i2);
_L64:
        i1 = ((flag1) ? 1 : 0);
        iez1.b(i2);
          goto _L41
_L62:
        i1 = ((flag1) ? 1 : 0);
        flag3 = iez1.c;
        i1 = ((flag1) ? 1 : 0);
        obj = iez1.d;
        i2 = k1;
        j2 = l1;
        if (!flag3) goto _L43; else goto _L42
_L42:
        if (obj == null) goto _L45; else goto _L44
_L44:
        i1 = ((flag1) ? 1 : 0);
        i2 = k1;
        j2 = l1;
        if (!((igg) (obj)).g()) goto _L43; else goto _L45
_L45:
        i1 = ((flag1) ? 1 : 0);
        b(iez1);
        i1 = ((flag1) ? 1 : 0);
        if (k()) goto _L5; else goto _L46
_L46:
        j2 = l1 + 1;
        i2 = 1;
          goto _L43
_L31:
        k1 = i1;
        i1 = ((flag1) ? 1 : 0);
        p = l2;
        i1 = ((flag1) ? 1 : 0);
        o = ((iez) (obj2[l2])).b;
_L51:
        if (k1 <= 0) goto _L48; else goto _L47
_L47:
        i1 = ((flag1) ? 1 : 0);
        a(k1);
_L48:
        if (k2 != 0) goto _L50; else goto _L49
_L49:
        i1 = ((flag1) ? 1 : 0);
        this;
        JVM INSTR monitorenter ;
        i1 = ((flag2) ? 1 : 0);
        if (k)
        {
            break MISSING_BLOCK_LABEL_887;
        }
        k1 = 1;
        i1 = k1;
        j = false;
        i1 = k1;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        i1 = ((flag2) ? 1 : 0);
        k = false;
        i1 = ((flag2) ? 1 : 0);
        this;
        JVM INSTR monitorexit ;
          goto _L50
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L23:
        k2 = 0;
          goto _L51
_L5:
        return;
_L1:
        if (obj2 == null) goto _L53; else goto _L52
_L52:
        l4 = l3;
_L59:
        k1 = 0;
        obj = null;
        l1 = i1;
        l3 = l4;
          goto _L7
_L3:
        if (k1 <= 0) goto _L20; else goto _L54
_L54:
        if (!flag) goto _L56; else goto _L55
_L55:
        l3 = 0x7fffffffffffffffL;
_L20:
        k1 = l1;
        l4 = l3;
        if (l3 == 0L) goto _L53; else goto _L57
_L57:
        i1 = l1;
        l4 = l3;
        if (obj1 != null) goto _L59; else goto _L58
_L58:
        k1 = l1;
        l4 = l3;
          goto _L53
_L25:
        l1 = i2;
        if (j3 <= i2)
        {
            l1 = 0;
        }
        i2 = 0;
          goto _L60
_L29:
        i1 = l1 + 1;
        l1 = i1;
        if (i1 == j3)
        {
            l1 = 0;
        }
        i2++;
          goto _L60
_L26:
        i3 = 0;
        l2 = l1;
        l1 = k1;
        k1 = 0;
        l3 = l4;
          goto _L61
_L33:
        i2 = 0;
        l3 = l4;
          goto _L39
_L41:
        if (l3 == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        l4 = l3;
        if (obj != null) goto _L33; else goto _L62
_L43:
        k2 = i2;
        i1 = j2;
        if (l3 == 0L) goto _L31; else goto _L63
_L63:
        k1 = l2 + 1;
        int j1 = k1;
        if (k1 == j3)
        {
            j1 = 0;
        }
        i3++;
        k1 = i2;
        l1 = j2;
        l2 = j1;
          goto _L61
        l3 = 0x7fffffffffffffffL;
          goto _L64
    }

    private boolean k()
    {
        if (a.c())
        {
            return true;
        }
        ConcurrentLinkedQueue concurrentlinkedqueue = g;
        if (b || concurrentlinkedqueue == null || concurrentlinkedqueue.isEmpty())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        h();
        b();
        return true;
        Exception exception;
        exception;
        b();
        throw exception;
        return false;
    }

    public final void a()
    {
        i = true;
        f();
    }

    final void a(iez iez1, Object obj)
    {
        if (d.get() == 0L)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        this;
        JVM INSTR monitorenter ;
        long l1 = d.get();
        if (j || l1 == 0L) goto _L2; else goto _L1
_L1:
        j = true;
        boolean flag = true;
_L3:
        this;
        JVM INSTR monitorexit ;
_L4:
        if (flag)
        {
            a(iez1, obj, l1);
            return;
        } else
        {
            b(iez1, obj);
            return;
        }
        iez1;
        this;
        JVM INSTR monitorexit ;
        throw iez1;
_L2:
        flag = false;
          goto _L3
        l1 = 0L;
        flag = false;
          goto _L4
    }

    public final volatile void a(Object obj)
    {
        a((ica)obj);
    }

    public final void a(Throwable throwable)
    {
        e().offer(throwable);
        i = true;
        f();
    }

    final Queue e()
    {
        Object obj;
        obj = g;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        this;
        JVM INSTR monitorenter ;
        ConcurrentLinkedQueue concurrentlinkedqueue = g;
        obj = concurrentlinkedqueue;
        if (concurrentlinkedqueue != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = new ConcurrentLinkedQueue();
        g = ((ConcurrentLinkedQueue) (obj));
        this;
        JVM INSTR monitorexit ;
        return ((Queue) (obj));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        return ((Queue) (obj));
    }

    final void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (!j)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        k = true;
        this;
        JVM INSTR monitorexit ;
        return;
        j = true;
        this;
        JVM INSTR monitorexit ;
        j();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
