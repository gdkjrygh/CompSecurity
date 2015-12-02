// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.google:
//            ga, e1, dt, d9, 
//            bR, eL, bp, eP, 
//            A, cR, z

public final class fz
    implements ga
{

    private static final String z[];
    private Map a;
    private e1 b;
    private int c;

    private fz()
    {
    }

    private e1 a(int i)
    {
        e1 e1_1 = b;
        if (e1_1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        IllegalArgumentException illegalargumentexception;
        try
        {
            if (i == c)
            {
                return b;
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        break MISSING_BLOCK_LABEL_28;
        illegalargumentexception;
        throw illegalargumentexception;
        b(c, b.b());
        if (i == 0)
        {
            return null;
        }
        dt dt1 = (dt)a.get(Integer.valueOf(i));
        try
        {
            c = i;
            b = dt.a();
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        if (dt1 == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        b.a(dt1);
        return b;
    }

    static fz a()
    {
        return g();
    }

    private void f()
    {
        a = Collections.emptyMap();
        c = 0;
        b = null;
    }

    private static fz g()
    {
        fz fz1 = new fz();
        fz1.f();
        return fz1;
    }

    public cR a()
    {
        return c();
    }

    public fz a(int i, int j)
    {
        if (i == 0)
        {
            try
            {
                throw new IllegalArgumentException(z[1]);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            a(i).a(j);
            return this;
        }
    }

    public fz a(int i, dt dt1)
    {
        if (i == 0)
        {
            try
            {
                throw new IllegalArgumentException(z[2]);
            }
            // Misplaced declaration of an exception variable
            catch (dt dt1)
            {
                throw dt1;
            }
        }
        boolean flag;
        try
        {
            flag = b(i);
        }
        // Misplaced declaration of an exception variable
        catch (dt dt1)
        {
            try
            {
                throw dt1;
            }
            // Misplaced declaration of an exception variable
            catch (dt dt1)
            {
                throw dt1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        a(i).a(dt1);
        if (d9.c == 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        b(i, dt1);
        return this;
        return this;
    }

    public fz a(bR br)
    {
        int i = d9.c;
        if (br != bR.d())
        {
            br = bR.a(br).entrySet().iterator();
            do
            {
                if (!br.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)br.next();
                a(((Integer)entry.getKey()).intValue(), (dt)entry.getValue());
            } while (i == 0);
        }
        return this;
    }

    public fz a(eL el)
    {
        int i = d9.c;
        do
        {
            int j = el.f();
            if (j == 0)
            {
                break;
            }
            boolean flag;
            try
            {
                flag = a(j, el);
            }
            // Misplaced declaration of an exception variable
            catch (eL el)
            {
                try
                {
                    throw el;
                }
                // Misplaced declaration of an exception variable
                catch (eL el)
                {
                    throw el;
                }
            }
        } while ((flag || i != 0) && i == 0);
        return this;
    }

    public fz a(eL el, z z1)
    {
        return a(el);
    }

    public fz a(byte abyte0[])
    {
        try
        {
            abyte0 = eL.a(abyte0);
            a(((eL) (abyte0)));
            abyte0.c(0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(z[4], abyte0);
        }
        return this;
    }

    public ga a(eL el, z z1)
    {
        return a(el, z1);
    }

    public ga a(byte abyte0[])
    {
        return a(abyte0);
    }

    public boolean a(int i, eL el)
    {
        int j;
        j = eP.a(i);
        try
        {
            i = eP.b(i);
        }
        // Misplaced declaration of an exception variable
        catch (eL el)
        {
            throw el;
        }
        i;
        JVM INSTR tableswitch 0 5: default 52
    //                   0 56
    //                   1 75
    //                   2 91
    //                   3 107
    //                   4 137
    //                   5 139;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        throw bp.i();
_L2:
        a(j).a(el.i());
        return true;
_L3:
        a(j).b(el.k());
        return true;
_L4:
        a(j).a(el.x());
        return true;
_L5:
        fz fz1 = bR.a();
        el.a(j, fz1, A.a());
        a(j).a(fz1.c());
        return true;
_L6:
        return false;
_L7:
        a(j).a(el.r());
        return true;
    }

    public bR b()
    {
        return c();
    }

    public cR b()
    {
        return b();
    }

    public fz b(int i, dt dt1)
    {
        if (i == 0)
        {
            try
            {
                throw new IllegalArgumentException(z[0]);
            }
            // Misplaced declaration of an exception variable
            catch (dt dt1)
            {
                throw dt1;
            }
        }
        e1 e1_1 = b;
        if (e1_1 != null)
        {
            try
            {
                if (c == i)
                {
                    b = null;
                    c = 0;
                }
            }
            // Misplaced declaration of an exception variable
            catch (dt dt1)
            {
                throw dt1;
            }
        }
        try
        {
            if (a.isEmpty())
            {
                a = new TreeMap();
            }
        }
        // Misplaced declaration of an exception variable
        catch (dt dt1)
        {
            throw dt1;
        }
        a.put(Integer.valueOf(i), dt1);
        return this;
        dt1;
        throw dt1;
    }

    public boolean b(int i)
    {
        if (i == 0)
        {
            try
            {
                throw new IllegalArgumentException(z[3]);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        int j;
        try
        {
            j = c;
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            try
            {
                throw illegalargumentexception1;
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
        }
        if (i == j)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (!a.containsKey(Integer.valueOf(i)))
        {
            return false;
        }
        return true;
    }

    public bR c()
    {
        bR br;
label0:
        {
            a(0);
            if (a.isEmpty())
            {
                br = bR.d();
                if (d9.c == 0)
                {
                    break label0;
                }
            }
            br = new bR(Collections.unmodifiableMap(a), null);
        }
        a = null;
        return br;
    }

    public cR c()
    {
        return d();
    }

    public Object clone()
    {
        return e();
    }

    public bR d()
    {
        return bR.d();
    }

    public boolean d()
    {
        return true;
    }

    public fz e()
    {
        a(0);
        return bR.a().a(new bR(a, null));
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "mo\020Ih^yBH'C*\003\006>Vf\013BhQc\007J,\027d\027K*RxL".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "mo\020Ih^yBH'C*\003\006>Vf\013BhQc\007J,\027d\027K*RxL".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 228
    //                   0 251
    //                   1 258
    //                   2 265
    //                   3 272;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_272;
_L1:
        byte0 = 72;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 55;
          goto _L7
_L3:
        byte0 = 10;
          goto _L7
_L4:
        byte0 = 98;
          goto _L7
        byte0 = 38;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "mo\020Ih^yBH'C*\003\006>Vf\013BhQc\007J,\027d\027K*RxL".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 320
    //                   0 343
    //                   1 350
    //                   2 357
    //                   3 364;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_364;
_L8:
        byte1 = 72;
_L14:
        obj1[i] = (char)(byte1 ^ c1);
        i++;
          goto _L13
_L9:
        byte1 = 55;
          goto _L14
_L10:
        byte1 = 10;
          goto _L14
_L11:
        byte1 = 98;
          goto _L14
        byte1 = 38;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "mo\020Ih^yBH'C*\003\006>Vf\013BhQc\007J,\027d\027K*RxL".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 435
    //                   1 442
    //                   2 449
    //                   3 456;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_456;
_L15:
        byte2 = 72;
_L21:
        obj2[i] = (char)(byte2 ^ c1);
        i++;
          goto _L20
_L16:
        byte2 = 55;
          goto _L21
_L17:
        byte2 = 10;
          goto _L21
_L18:
        byte2 = 98;
          goto _L21
        byte2 = 38;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            ac = "eo\003B!YmB@:XgBGhUs\026ChVx\020G1\027~\nT-@*\003Hh~E'^+Rz\026O'Y*JU X\177\016BhYo\024C:\027b\003V8RdK\b".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c1 = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 504
    //                   0 527
    //                   1 534
    //                   2 541
    //                   3 548;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_548;
_L22:
        byte3 = 72;
_L28:
        obj3[i] = (char)(byte3 ^ c1);
        i++;
          goto _L27
_L23:
        byte3 = 55;
          goto _L28
_L24:
        byte3 = 10;
          goto _L28
_L25:
        byte3 = 98;
          goto _L28
        byte3 = 38;
          goto _L28
_L35:
        byte byte3;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, (new String(ac)).intern()
            });
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 596
    //                   0 620
    //                   1 627
    //                   2 634
    //                   3 641;
           goto _L29 _L30 _L31 _L32 _L33
_L30:
        break; /* Loop/switch isn't completed */
_L33:
        break MISSING_BLOCK_LABEL_641;
_L29:
        byte byte4 = 72;
_L36:
        ac[i] = (char)(byte4 ^ c1);
        i++;
        if (true) goto _L35; else goto _L34
_L34:
        byte4 = 55;
          goto _L36
_L31:
        byte4 = 10;
          goto _L36
_L32:
        byte4 = 98;
          goto _L36
        byte4 = 38;
          goto _L36
    }
}
