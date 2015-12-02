// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            a, c4

public class bm
{

    private static final String F;
    private Integer A;
    private String B;
    private String C;
    private String D;
    private String E;
    private Boolean a;
    private Long b;
    private Integer c;
    private byte d[];
    private String e;
    private String f;
    private Integer g;
    private String h;
    private String i;
    private String j;
    private Boolean k;
    private String l;
    private Double m;
    private String n;
    private String o;
    private String p;
    private Integer q;
    private String r;
    private Integer s;
    private Byte t;
    private Double u;
    private byte v[];
    private Integer w;
    private Long x;
    private Boolean y;
    private c4 z;

    public bm()
    {
    }

    public bm a(byte byte0)
    {
        t = new Byte(byte0);
        return this;
    }

    public bm a(int i1)
    {
        s = new Integer(i1);
        return this;
    }

    public bm a(long l1)
    {
        x = new Long(l1);
        return this;
    }

    public bm a(Boolean boolean1)
    {
        a = boolean1;
        return this;
    }

    public bm a(Double double1)
    {
        u = double1;
        return this;
    }

    public bm a(Integer integer)
    {
        g = integer;
        return this;
    }

    public bm a(String s1)
    {
        i = s1;
        return this;
    }

    public bm a(boolean flag)
    {
        Object obj;
        if (flag)
        {
            try
            {
                obj = Boolean.TRUE;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            obj = Boolean.FALSE;
        }
        k = ((Boolean) (obj));
        return this;
    }

    public bm a(byte abyte0[])
    {
        v = abyte0;
        return this;
    }

    public c4 a()
    {
        c4 c4_1;
        try
        {
            c4_1 = z;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        if (c4_1 == null)
        {
            return null;
        }
        Object obj = D;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        obj = k;
        UnsupportedOperationException unsupportedoperationexception1;
        if (obj != null)
        {
            try
            {
                if (h != null)
                {
                    z.y = new a(D, k.booleanValue(), h);
                }
            }
            catch (UnsupportedOperationException unsupportedoperationexception2)
            {
                throw unsupportedoperationexception2;
            }
        }
        try
        {
            if (o != null)
            {
                z.G = o;
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception3)
        {
            throw unsupportedoperationexception3;
        }
        try
        {
            if (C != null)
            {
                z.C = C;
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception4)
        {
            throw unsupportedoperationexception4;
        }
        try
        {
            if (l != null)
            {
                z.a(l);
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception5)
        {
            throw unsupportedoperationexception5;
        }
        try
        {
            if (v != null)
            {
                z.a(v);
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception6)
        {
            throw unsupportedoperationexception6;
        }
        try
        {
            if (d != null)
            {
                z.b(d);
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception7)
        {
            throw unsupportedoperationexception7;
        }
        try
        {
            if (s != null)
            {
                z.a(s.intValue());
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception8)
        {
            throw unsupportedoperationexception8;
        }
        try
        {
            if (q != null)
            {
                z.D = q.intValue();
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception9)
        {
            throw unsupportedoperationexception9;
        }
        try
        {
            if (j != null)
            {
                z.s = j;
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception10)
        {
            throw unsupportedoperationexception10;
        }
        try
        {
            if (w != null)
            {
                z.f = w.intValue();
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception11)
        {
            throw unsupportedoperationexception11;
        }
        try
        {
            if (A != null)
            {
                z.n = A.intValue();
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception12)
        {
            throw unsupportedoperationexception12;
        }
        try
        {
            if (b != null)
            {
                z.I = b.longValue();
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception13)
        {
            throw unsupportedoperationexception13;
        }
        try
        {
            if (g != null)
            {
                z.j = g;
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception14)
        {
            throw unsupportedoperationexception14;
        }
        try
        {
            if (t != null)
            {
                z.w = t.byteValue();
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception15)
        {
            throw unsupportedoperationexception15;
        }
        try
        {
            if (x != null)
            {
                z.t = x.longValue();
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception16)
        {
            throw unsupportedoperationexception16;
        }
        try
        {
            if (p != null)
            {
                z.h = p;
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception17)
        {
            throw unsupportedoperationexception17;
        }
        try
        {
            if (c != null)
            {
                z.H = c.intValue();
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception18)
        {
            throw unsupportedoperationexception18;
        }
        try
        {
            if (n != null)
            {
                z.l = n;
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception19)
        {
            throw unsupportedoperationexception19;
        }
        try
        {
            if (r != null)
            {
                z.k = r;
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception20)
        {
            throw unsupportedoperationexception20;
        }
        try
        {
            if (f != null)
            {
                z.e = f;
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception21)
        {
            throw unsupportedoperationexception21;
        }
        try
        {
            if (B != null)
            {
                z.L = B;
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception22)
        {
            throw unsupportedoperationexception22;
        }
        try
        {
            if (e != null)
            {
                z.b = e;
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception23)
        {
            throw unsupportedoperationexception23;
        }
        try
        {
            if (a != null)
            {
                z.r = a.booleanValue();
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception24)
        {
            throw unsupportedoperationexception24;
        }
        try
        {
            if (m != null)
            {
                z.o = m.doubleValue();
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception25)
        {
            throw unsupportedoperationexception25;
        }
        try
        {
            if (u != null)
            {
                z.v = u.doubleValue();
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception26)
        {
            throw unsupportedoperationexception26;
        }
        try
        {
            if (E != null)
            {
                z.p = E;
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception27)
        {
            throw unsupportedoperationexception27;
        }
        try
        {
            if (y != null)
            {
                z.E = y.booleanValue();
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception28)
        {
            throw unsupportedoperationexception28;
        }
        try
        {
            if (i != null)
            {
                z.d = i;
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception29)
        {
            throw unsupportedoperationexception29;
        }
        return z;
        unsupportedoperationexception1;
        throw unsupportedoperationexception1;
        unsupportedoperationexception1;
        throw unsupportedoperationexception1;
    }

    public bm b(int i1)
    {
        c = new Integer(i1);
        return this;
    }

    public bm b(long l1)
    {
        b = new Long(l1);
        return this;
    }

    public bm b(Boolean boolean1)
    {
        y = boolean1;
        return this;
    }

    public bm b(Double double1)
    {
        m = double1;
        return this;
    }

    public bm b(String s1)
    {
        r = s1;
        return this;
    }

    public bm b(byte abyte0[])
    {
        d = abyte0;
        return this;
    }

    public Byte b()
    {
        return t;
    }

    public bm c()
    {
        Object obj = D;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        UnsupportedOperationException unsupportedoperationexception;
        try
        {
            obj = k;
        }
        catch (UnsupportedOperationException unsupportedoperationexception1)
        {
            try
            {
                throw unsupportedoperationexception1;
            }
            // Misplaced declaration of an exception variable
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                throw unsupportedoperationexception;
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (h != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        throw new UnsupportedOperationException(F);
        unsupportedoperationexception;
        throw unsupportedoperationexception;
        z = new c4(new a(D, k.booleanValue(), h));
        return this;
    }

    public bm c(int i1)
    {
        q = new Integer(i1);
        return this;
    }

    public bm c(String s1)
    {
        e = s1;
        return this;
    }

    public bm d(int i1)
    {
        A = new Integer(i1);
        return this;
    }

    public bm d(String s1)
    {
        j = s1;
        return this;
    }

    public bm e(int i1)
    {
        w = new Integer(i1);
        return this;
    }

    public bm e(String s1)
    {
        D = s1;
        return this;
    }

    public bm f(String s1)
    {
        h = s1;
        return this;
    }

    public bm g(String s1)
    {
        o = s1;
        return this;
    }

    public bm h(String s1)
    {
        p = s1;
        return this;
    }

    public bm i(String s1)
    {
        B = s1;
        return this;
    }

    public bm j(String s1)
    {
        l = s1;
        return this;
    }

    public bm k(String s1)
    {
        f = s1;
        return this;
    }

    public bm l(String s1)
    {
        E = s1;
        return this;
    }

    public bm m(String s1)
    {
        n = s1;
        return this;
    }

    static 
    {
        char ac[];
        int i1;
        int j1;
        ac = "qXm\006OrV>\007CmDw\007Cx\021n\007IlTl\001_<S{\023InT>\034HoE\177\033RuPj\034H{\021p\020Q<Xp\026IqXp\022\006qTm\006G{T".toCharArray();
        j1 = ac.length;
        i1 = 0;
_L7:
        char c1;
        if (j1 <= i1)
        {
            F = (new String(ac)).intern();
            return;
        }
        c1 = ac[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 38;
_L8:
        ac[i1] = (char)(byte0 ^ c1);
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 28;
          goto _L8
_L3:
        byte0 = 49;
          goto _L8
_L4:
        byte0 = 30;
          goto _L8
        byte0 = 117;
          goto _L8
    }
}
