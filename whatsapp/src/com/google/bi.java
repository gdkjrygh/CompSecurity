// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.Serializable;

// Referenced classes of package com.google:
//            co

public class bi
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private static final String z[];
    private int a;
    private String b;
    private boolean c;
    private co d;
    private String e;
    private boolean f;
    private boolean g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private String n;

    public bi()
    {
        a = 0;
        h = 0L;
        n = "";
        i = false;
        b = "";
        e = "";
        d = co.FROM_NUMBER_WITH_PLUS_SIGN;
    }

    public bi a(int i1)
    {
        f = true;
        a = i1;
        return this;
    }

    public bi a(long l1)
    {
        k = true;
        h = l1;
        return this;
    }

    public bi a(co co1)
    {
        if (co1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (co co1)
            {
                throw co1;
            }
        } else
        {
            m = true;
            d = co1;
            return this;
        }
    }

    public bi a(String s1)
    {
        if (s1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        } else
        {
            l = true;
            b = s1;
            return this;
        }
    }

    public bi a(boolean flag)
    {
        c = true;
        i = flag;
        return this;
    }

    public boolean a()
    {
        return f;
    }

    public boolean a(bi bi1)
    {
        boolean flag1 = true;
        if (bi1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (this == bi1) goto _L4; else goto _L3
_L3:
        int i1;
        int j1;
        i1 = a;
        j1 = bi1.a;
        if (i1 != j1)
        {
            break; /* Loop/switch isn't completed */
        }
        long l1;
        long l2;
        l1 = h;
        l2 = bi1.h;
        if (l1 != l2)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = n.equals(bi1.n);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag2;
        flag = i;
        flag2 = bi1.i;
        if (flag != flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = b.equals(bi1.b);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        co co1;
        co co2;
        co1 = d;
        co2 = bi1.d;
        if (co1 != co2)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = e.equals(bi1.e);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag3;
        boolean flag4;
        try
        {
            flag3 = o();
            flag4 = bi1.o();
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        flag = flag1;
        if (flag3 == flag4) goto _L4; else goto _L5
_L5:
        return false;
        bi1;
        try
        {
            throw bi1;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1) { }
        try
        {
            throw bi1;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1) { }
        try
        {
            throw bi1;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1) { }
        try
        {
            throw bi1;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1) { }
        try
        {
            throw bi1;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1) { }
        try
        {
            throw bi1;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1) { }
        throw bi1;
    }

    public bi b()
    {
        g = false;
        e = "";
        return this;
    }

    public bi b(bi bi1)
    {
        try
        {
            if (bi1.a())
            {
                a(bi1.m());
            }
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        try
        {
            if (bi1.t())
            {
                a(bi1.p());
            }
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        try
        {
            if (bi1.e())
            {
                c(bi1.v());
            }
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        try
        {
            if (bi1.l())
            {
                a(bi1.r());
            }
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        try
        {
            if (bi1.i())
            {
                a(bi1.q());
            }
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        try
        {
            if (bi1.g())
            {
                a(bi1.j());
            }
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        try
        {
            if (bi1.o())
            {
                b(bi1.k());
            }
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        return this;
    }

    public bi b(String s1)
    {
        if (s1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        } else
        {
            g = true;
            e = s1;
            return this;
        }
    }

    public bi c()
    {
        l = false;
        b = "";
        return this;
    }

    public bi c(String s1)
    {
        if (s1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        } else
        {
            j = true;
            n = s1;
            return this;
        }
    }

    public bi d()
    {
        k = false;
        h = 0L;
        return this;
    }

    public boolean e()
    {
        return j;
    }

    public boolean equals(Object obj)
    {
        boolean flag;
        try
        {
            flag = obj instanceof bi;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        if (a((bi)obj))
        {
            return true;
        }
        return false;
    }

    public bi f()
    {
        j = false;
        n = "";
        return this;
    }

    public boolean g()
    {
        return m;
    }

    public bi h()
    {
        f = false;
        a = 0;
        return this;
    }

    public int hashCode()
    {
        char c2 = '\u04CF';
        int i1 = m();
        int j1 = Long.valueOf(p()).hashCode();
        int k1 = v().hashCode();
        char c1;
        int l1;
        int i2;
        int j2;
        boolean flag;
        try
        {
            flag = r();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        if (flag)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        l1 = q().hashCode();
        i2 = j().hashCode();
        j2 = k().hashCode();
        try
        {
            flag = o();
        }
        catch (NullPointerException nullpointerexception1)
        {
            throw nullpointerexception1;
        }
        if (!flag)
        {
            c2 = '\u04D5';
        }
        return ((((c1 + (((i1 + 2173) * 53 + j1) * 53 + k1) * 53) * 53 + l1) * 53 + i2) * 53 + j2) * 53 + c2;
    }

    public boolean i()
    {
        return l;
    }

    public co j()
    {
        return d;
    }

    public String k()
    {
        return e;
    }

    public boolean l()
    {
        return c;
    }

    public int m()
    {
        return a;
    }

    public bi n()
    {
        c = false;
        i = false;
        return this;
    }

    public boolean o()
    {
        return g;
    }

    public long p()
    {
        return h;
    }

    public String q()
    {
        return b;
    }

    public boolean r()
    {
        return i;
    }

    public bi s()
    {
        m = false;
        d = co.FROM_NUMBER_WITH_PLUS_SIGN;
        return this;
    }

    public boolean t()
    {
        return k;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag;
        stringbuilder.append(z[5]).append(a);
        stringbuilder.append(z[3]).append(h);
        flag = l();
        NullPointerException nullpointerexception;
        if (flag)
        {
            try
            {
                if (r())
                {
                    stringbuilder.append(z[0]);
                }
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
        }
        try
        {
            if (e())
            {
                stringbuilder.append(z[4]).append(n);
            }
        }
        catch (NullPointerException nullpointerexception2)
        {
            throw nullpointerexception2;
        }
        try
        {
            if (g())
            {
                stringbuilder.append(z[1]).append(d);
            }
        }
        catch (NullPointerException nullpointerexception3)
        {
            throw nullpointerexception3;
        }
        try
        {
            if (o())
            {
                stringbuilder.append(z[2]).append(e);
            }
        }
        catch (NullPointerException nullpointerexception4)
        {
            throw nullpointerexception4;
        }
        return stringbuilder.toString();
        nullpointerexception;
        throw nullpointerexception;
    }

    public final bi u()
    {
        h();
        d();
        f();
        n();
        c();
        s();
        b();
        return this;
    }

    public String v()
    {
        return n;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[6];
        obj = ".\033@\032Lg9B[rk%JA\bz%P\036";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = ".\024J\016Fz%\\[ka3@[{a\"W\030M4w";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = ".\007W\036Nk%W\036L.\023J\026M}#L\030\bM6W\tAk%\0058Gj2\037[";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = ".\031D\017Aa9D\027\b@\"H\031M|m\005";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = ".\022]\017M`$L\024F4w";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "M8P\025\\|.\0058Gj2\037[";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 40;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 14;
          goto _L9
_L5:
        byte1 = 87;
          goto _L9
_L6:
        byte1 = 37;
          goto _L9
        byte1 = 123;
          goto _L9
    }
}
