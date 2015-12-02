// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google:
//            d8, e2, an, bp, 
//            d9, bR, eL, dq, 
//            dM, dA, dv, fO, 
//            fz, ee, fn, ev, 
//            el, fa, cR, f8, 
//            b7, a3, aH, cc, 
//            z, dE, cP, bh, 
//            eh, b4, P, ga

public final class d7 extends d8
    implements e2
{

    private static final d7 g;
    public static fn i = new an();
    public static final int j = 4;
    public static final int m = 3;
    public static final int o = 5;
    private static final long serialVersionUID = 0L;
    public static final int t = 6;
    public static final int v = 2;
    public static final int w = 1;
    public static final int x = 7;
    private Object e;
    private final bR f;
    private int h;
    private dv k;
    private List l;
    private List n;
    private int p;
    private List q;
    private byte r;
    private List s;
    private List u;

    private d7(eL el1, z z1)
    {
        fz fz1;
        int j1;
        int i2;
        int l2;
        l2 = d9.c;
        super();
        r = -1;
        h = -1;
        a();
        j1 = 0;
        fz1 = bR.a();
        i2 = 0;
_L37:
        int k1 = j1;
        if (i2 != 0) goto _L2; else goto _L1
_L1:
        int i1;
        int l1;
        l1 = j1;
        i1 = j1;
        k1 = j1;
        int i3 = el1.f();
        int j2;
        int k2;
        j2 = j1;
        k2 = i2;
        i3;
        JVM INSTR lookupswitch 8: default 144
    //                   0: 928
    //                   10: 1308
    //                   18: 1301
    //                   26: 1290
    //                   34: 1279
    //                   42: 1268
    //                   50: 1257
    //                   58: 676;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        l1 = i2;
_L36:
        i1 = j1;
        k1 = j1;
        boolean flag = a(el1, fz1, z1, i3);
        i1 = l1;
        k1 = j1;
        if (flag) goto _L13; else goto _L12
_L12:
        i1 = 1;
        j2 = 1;
        k1 = j1;
        if (l2 == 0) goto _L13; else goto _L14
_L14:
        i1 = j1;
        k1 = j1;
        p = p | 1;
        i1 = j1;
        k1 = j1;
        e = el1.x();
        i1 = j2;
        k1 = j1;
        if (l2 == 0) goto _L13; else goto _L15
_L15:
        i2 = j1;
        if ((j1 & 2) == 2) goto _L17; else goto _L16
_L16:
        l1 = j1;
        i1 = j1;
        k1 = j1;
        s = new ArrayList();
        i2 = j1 | 2;
_L17:
        i1 = i2;
        k1 = i2;
        s.add(el1.a(dq.r, z1));
        i1 = j2;
        k1 = i2;
        if (l2 == 0) goto _L13; else goto _L18
_L18:
        j1 = i2;
        if ((i2 & 8) == 8) goto _L20; else goto _L19
_L19:
        l1 = i2;
        i1 = i2;
        k1 = i2;
        u = new ArrayList();
        j1 = i2 | 8;
_L20:
        i1 = j1;
        k1 = j1;
        u.add(el1.a(i, z1));
        i1 = j2;
        k1 = j1;
        if (l2 == 0) goto _L13; else goto _L21
_L21:
        i2 = j1;
_L41:
        j1 = i2;
        if ((i2 & 0x10) == 16) goto _L23; else goto _L22
_L22:
        l1 = i2;
        i1 = i2;
        k1 = i2;
        n = new ArrayList();
        j1 = i2 | 0x10;
_L23:
        i1 = j1;
        k1 = j1;
        n.add(el1.a(dM.i, z1));
        i1 = j2;
        k1 = j1;
        if (l2 == 0) goto _L13; else goto _L24
_L24:
        i2 = j1;
_L40:
        j1 = i2;
        if ((i2 & 0x20) == 32) goto _L26; else goto _L25
_L25:
        l1 = i2;
        i1 = i2;
        k1 = i2;
        q = new ArrayList();
        j1 = i2 | 0x20;
_L26:
        i1 = j1;
        k1 = j1;
        q.add(el1.a(dA.m, z1));
        i1 = j2;
        k1 = j1;
        if (l2 == 0) goto _L13; else goto _L27
_L27:
        i2 = j1;
_L39:
        j1 = i2;
        if ((i2 & 4) == 4) goto _L29; else goto _L28
_L28:
        l1 = i2;
        i1 = i2;
        k1 = i2;
        l = new ArrayList();
        j1 = i2 | 4;
_L29:
        l1 = j1;
        i1 = j1;
        k1 = j1;
        l.add(el1.a(dq.r, z1));
        i1 = j2;
        k1 = j1;
        if (l2 == 0) goto _L13; else goto _L30
_L30:
        k2 = j2;
        j2 = j1;
_L11:
        l1 = j2;
        i1 = j2;
        k1 = j2;
        if ((p & 2) != 2) goto _L32; else goto _L31
_L31:
        l1 = j2;
        i1 = j2;
        k1 = j2;
        fO fo = k.i();
_L38:
        i1 = j2;
        k1 = j2;
        k = (dv)el1.a(dv.f, z1);
        if (fo == null) goto _L34; else goto _L33
_L33:
        i1 = j2;
        k1 = j2;
        fo.a(k);
        i1 = j2;
        k1 = j2;
        k = fo.g();
_L34:
        l1 = j2;
        i1 = j2;
        k1 = j2;
        p = p | 2;
        i1 = k2;
        k1 = j2;
_L13:
        if (l2 == 0) goto _L35; else goto _L2
_L2:
        if ((k1 & 2) == 2)
        {
            try
            {
                s = Collections.unmodifiableList(s);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((k1 & 8) == 8)
        {
            try
            {
                u = Collections.unmodifiableList(u);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((k1 & 0x10) == 16)
        {
            try
            {
                n = Collections.unmodifiableList(n);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((k1 & 0x20) == 32)
        {
            try
            {
                q = Collections.unmodifiableList(q);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((k1 & 4) == 4)
        {
            try
            {
                l = Collections.unmodifiableList(l);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        f = fz1.c();
        d();
        return;
_L4:
        i1 = 1;
        l1 = 1;
        k1 = j1;
        if (l2 == 0) goto _L13; else goto _L36
        el1;
        l1 = j1;
        i1 = j1;
        k1 = j1;
        throw el1;
        el1;
        i1 = l1;
        throw el1.a(this);
        el1;
        if ((i1 & 2) == 2)
        {
            try
            {
                s = Collections.unmodifiableList(s);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 8) == 8)
        {
            try
            {
                u = Collections.unmodifiableList(u);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 0x10) == 16)
        {
            try
            {
                n = Collections.unmodifiableList(n);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 0x20) == 32)
        {
            try
            {
                q = Collections.unmodifiableList(q);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        if ((i1 & 4) == 4)
        {
            try
            {
                l = Collections.unmodifiableList(l);
            }
            // Misplaced declaration of an exception variable
            catch (eL el1)
            {
                throw el1;
            }
        }
        f = fz1.c();
        d();
        throw el1;
        el1;
        i1 = j1;
        k1 = j1;
        throw el1;
        el1;
        l1 = j1;
        i1 = j1;
        k1 = j1;
        throw el1;
        el1;
        i1 = k1;
        throw (new bp(el1.getMessage())).a(this);
        el1;
        l1 = i2;
        i1 = i2;
        k1 = i2;
        throw el1;
        el1;
        l1 = j1;
        i1 = j1;
        k1 = j1;
        throw el1;
        el1;
        l1 = j1;
        i1 = j1;
        k1 = j1;
        throw el1;
        el1;
        l1 = j1;
        i1 = j1;
        k1 = j1;
        throw el1;
        el1;
        l1 = j2;
        i1 = j2;
        k1 = j2;
        throw el1;
_L35:
        j1 = k1;
        i2 = i1;
          goto _L37
_L32:
        fo = null;
          goto _L38
_L10:
        j2 = i2;
        i2 = j1;
          goto _L39
_L9:
        j2 = i2;
        i2 = j1;
          goto _L40
_L8:
        j2 = i2;
        i2 = j1;
          goto _L41
_L7:
        j2 = i2;
        i2 = j1;
          goto _L18
_L6:
        j2 = i2;
          goto _L15
_L5:
        j2 = i2;
          goto _L14
    }

    d7(eL el1, z z1, dE de)
    {
        this(el1, z1);
    }

    private d7(ee ee1)
    {
        super(ee1);
        r = -1;
        h = -1;
        f = ee1.c();
    }

    d7(ee ee1, dE de)
    {
        this(ee1);
    }

    private d7(boolean flag)
    {
        r = -1;
        h = -1;
        f = bR.d();
    }

    static int a(d7 d7_1, int i1)
    {
        d7_1.p = i1;
        return i1;
    }

    public static d7 a(a3 a3_1)
    {
        return (d7)i.a(a3_1);
    }

    public static d7 a(a3 a3_1, z z1)
    {
        return (d7)i.b(a3_1, z1);
    }

    public static d7 a(eL el1)
    {
        return (d7)i.a(el1);
    }

    public static d7 a(eL el1, z z1)
    {
        return (d7)i.b(el1, z1);
    }

    public static d7 a(InputStream inputstream)
    {
        return (d7)i.b(inputstream);
    }

    public static d7 a(InputStream inputstream, z z1)
    {
        return (d7)i.a(inputstream, z1);
    }

    public static d7 a(byte abyte0[])
    {
        return (d7)i.a(abyte0);
    }

    public static d7 a(byte abyte0[], z z1)
    {
        return (d7)i.a(abyte0, z1);
    }

    static dv a(d7 d7_1, dv dv1)
    {
        d7_1.k = dv1;
        return dv1;
    }

    static Object a(d7 d7_1)
    {
        return d7_1.e;
    }

    static Object a(d7 d7_1, Object obj)
    {
        d7_1.e = obj;
        return obj;
    }

    static List a(d7 d7_1, List list)
    {
        d7_1.q = list;
        return list;
    }

    private void a()
    {
        e = "";
        s = Collections.emptyList();
        l = Collections.emptyList();
        u = Collections.emptyList();
        n = Collections.emptyList();
        q = Collections.emptyList();
        k = dv.m();
    }

    public static d7 b(InputStream inputstream)
    {
        return (d7)i.a(inputstream);
    }

    public static d7 b(InputStream inputstream, z z1)
    {
        return (d7)i.b(inputstream, z1);
    }

    static List b(d7 d7_1)
    {
        return d7_1.u;
    }

    static List b(d7 d7_1, List list)
    {
        d7_1.u = list;
        return list;
    }

    static List c(d7 d7_1)
    {
        return d7_1.l;
    }

    static List c(d7 d7_1, List list)
    {
        d7_1.s = list;
        return list;
    }

    static List d(d7 d7_1)
    {
        return d7_1.n;
    }

    static List d(d7 d7_1, List list)
    {
        d7_1.l = list;
        return list;
    }

    public static ev e(d7 d7_1)
    {
        return y().a(d7_1);
    }

    static List e(d7 d7_1, List list)
    {
        d7_1.n = list;
        return list;
    }

    static List f(d7 d7_1)
    {
        return d7_1.q;
    }

    static List g(d7 d7_1)
    {
        return d7_1.s;
    }

    public static final cP n()
    {
        return el.q();
    }

    public static d7 o()
    {
        return g;
    }

    public static ev y()
    {
        return ev.y();
    }

    public dv A()
    {
        return k;
    }

    public ev B()
    {
        return y();
    }

    public bh C()
    {
        return k;
    }

    public d7 a(int i1)
    {
        return (d7)u.get(i1);
    }

    public eh a()
    {
        return B();
    }

    protected eh a(b4 b4)
    {
        return a(b4);
    }

    protected ev a(b4 b4)
    {
        return new ev(b4, null);
    }

    public void a(fa fa1)
    {
        boolean flag = false;
        int k1 = d9.c;
        b();
        if ((p & 1) == 1)
        {
            fa1.d(1, d());
        }
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < s.size())
                {
                    fa1.d(2, (cR)s.get(i1));
                    if (k1 == 0)
                    {
                        break label0;
                    }
                }
                i1 = 0;
                do
                {
label1:
                    {
                        if (i1 < u.size())
                        {
                            fa1.d(3, (cR)u.get(i1));
                            if (k1 == 0)
                            {
                                break label1;
                            }
                        }
                        i1 = 0;
                        do
                        {
label2:
                            {
                                if (i1 < n.size())
                                {
                                    fa1.d(4, (cR)n.get(i1));
                                    if (k1 == 0)
                                    {
                                        break label2;
                                    }
                                }
                                i1 = 0;
                                do
                                {
label3:
                                    {
                                        int j1 = ((flag) ? 1 : 0);
                                        if (i1 < q.size())
                                        {
                                            fa1.d(5, (cR)q.get(i1));
                                            if (k1 == 0)
                                            {
                                                break label3;
                                            }
                                            j1 = ((flag) ? 1 : 0);
                                        }
                                        do
                                        {
                                            if (j1 >= l.size())
                                            {
                                                break;
                                            }
                                            fa1.d(6, (cR)l.get(j1));
                                            j1++;
                                        } while (k1 == 0);
                                        if ((p & 2) == 2)
                                        {
                                            fa1.d(7, k);
                                        }
                                        c().a(fa1);
                                        return;
                                    }
                                    i1++;
                                } while (true);
                            }
                            i1++;
                        } while (true);
                    }
                    i1++;
                } while (true);
            }
            i1++;
        } while (true);
    }

    public int b()
    {
        boolean flag = false;
        int i2 = d9.c;
        int i1 = h;
        if (i1 != -1)
        {
            return i1;
        }
        int k1;
        if ((p & 1) == 1)
        {
            i1 = fa.c(1, d()) + 0;
        } else
        {
            i1 = 0;
        }
        k1 = 0;
        do
        {
label0:
            {
                int j1 = i1;
                if (k1 < s.size())
                {
                    i1 += fa.c(2, (cR)s.get(k1));
                    if (i2 == 0)
                    {
                        break label0;
                    }
                    j1 = i1;
                }
                k1 = 0;
                do
                {
label1:
                    {
                        i1 = j1;
                        if (k1 < u.size())
                        {
                            i1 = j1 + fa.c(3, (cR)u.get(k1));
                            if (i2 == 0)
                            {
                                break label1;
                            }
                        }
                        k1 = 0;
                        do
                        {
label2:
                            {
                                j1 = i1;
                                if (k1 < n.size())
                                {
                                    i1 += fa.c(4, (cR)n.get(k1));
                                    if (i2 == 0)
                                    {
                                        break label2;
                                    }
                                    j1 = i1;
                                }
                                int l1 = 0;
                                do
                                {
label3:
                                    {
                                        k1 = ((flag) ? 1 : 0);
                                        i1 = j1;
                                        if (l1 < q.size())
                                        {
                                            i1 = j1 + fa.c(5, (cR)q.get(l1));
                                            if (i2 == 0)
                                            {
                                                break label3;
                                            }
                                            k1 = ((flag) ? 1 : 0);
                                        }
                                        do
                                        {
                                            j1 = i1;
                                            if (k1 >= l.size())
                                            {
                                                break;
                                            }
                                            j1 = i1 + fa.c(6, (cR)l.get(k1));
                                            k1++;
                                            i1 = j1;
                                        } while (i2 == 0);
                                        i1 = j1;
                                        if ((p & 2) == 2)
                                        {
                                            i1 = j1 + fa.c(7, k);
                                        }
                                        i1 = c().b() + i1;
                                        h = i1;
                                        return i1;
                                    }
                                    l1++;
                                    j1 = i1;
                                } while (true);
                            }
                            k1++;
                        } while (true);
                    }
                    k1++;
                    j1 = i1;
                } while (true);
            }
            k1++;
        } while (true);
    }

    public P b()
    {
        return t();
    }

    public f8 b(int i1)
    {
        return (f8)l.get(i1);
    }

    public fn b()
    {
        return i;
    }

    public int c()
    {
        return n.size();
    }

    public b7 c(int i1)
    {
        return (b7)q.get(i1);
    }

    public final bR c()
    {
        return f;
    }

    public cR c()
    {
        return t();
    }

    public eh c()
    {
        return e();
    }

    public ga c()
    {
        return e();
    }

    public a3 d()
    {
        Object obj = e;
        if (obj instanceof String)
        {
            obj = a3.a((String)obj);
            e = obj;
            return ((a3) (obj));
        } else
        {
            return (a3)obj;
        }
    }

    public dA d(int i1)
    {
        return (dA)q.get(i1);
    }

    public ga d()
    {
        return B();
    }

    public final boolean d()
    {
        boolean flag = true;
        int j1 = d9.c;
        int i1 = r;
        if (i1 != -1)
        {
            if (i1 != 1)
            {
                flag = false;
            }
            return flag;
        }
        i1 = 0;
        do
        {
            if (i1 >= q())
            {
                break;
            }
            if (!e(i1).d())
            {
                r = 0;
                return false;
            }
            i1++;
        } while (j1 == 0);
        i1 = 0;
        do
        {
            if (i1 >= j())
            {
                break;
            }
            if (!h(i1).d())
            {
                r = 0;
                return false;
            }
            i1++;
        } while (j1 == 0);
        i1 = 0;
        do
        {
            if (i1 >= h())
            {
                break;
            }
            if (!a(i1).d())
            {
                r = 0;
                return false;
            }
            i1++;
        } while (j1 == 0);
        i1 = 0;
        do
        {
            if (i1 >= c())
            {
                break;
            }
            if (!f(i1).d())
            {
                r = 0;
                return false;
            }
            i1++;
        } while (j1 == 0);
        if (p() && !A().d())
        {
            r = 0;
            return false;
        } else
        {
            r = 1;
            return true;
        }
    }

    protected aH e()
    {
        return el.t().a(com/google/d7, com/google/ev);
    }

    public dq e(int i1)
    {
        return (dq)s.get(i1);
    }

    public ev e()
    {
        return e(this);
    }

    public dM f(int i1)
    {
        return (dM)n.get(i1);
    }

    public List f()
    {
        return s;
    }

    public cc g(int i1)
    {
        return (cc)n.get(i1);
    }

    public List g()
    {
        return l;
    }

    public int h()
    {
        return u.size();
    }

    public dq h(int i1)
    {
        return (dq)l.get(i1);
    }

    public e2 i(int i1)
    {
        return (e2)u.get(i1);
    }

    public List i()
    {
        return n;
    }

    public int j()
    {
        return l.size();
    }

    public f8 j(int i1)
    {
        return (f8)s.get(i1);
    }

    public List k()
    {
        return s;
    }

    public boolean l()
    {
        return (p & 1) == 1;
    }

    public List m()
    {
        return l;
    }

    public boolean p()
    {
        return (p & 2) == 2;
    }

    public int q()
    {
        return s.size();
    }

    public List r()
    {
        return u;
    }

    public String s()
    {
        Object obj = e;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s1 = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            e = s1;
        }
        return s1;
    }

    public d7 t()
    {
        return g;
    }

    public List u()
    {
        return u;
    }

    public int v()
    {
        return q.size();
    }

    public List w()
    {
        return n;
    }

    protected Object writeReplace()
    {
        return super.writeReplace();
    }

    public List x()
    {
        return q;
    }

    public List z()
    {
        return q;
    }

    static 
    {
        g = new d7(true);
        g.a();
    }
}
