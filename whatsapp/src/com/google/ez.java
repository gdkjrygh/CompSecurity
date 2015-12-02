// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Map;

// Referenced classes of package com.google:
//            eK, dk, bR, fR, 
//            ds, fz, ap, d9, 
//            cP, ae, P, cR, 
//            eJ, eh

public final class ez extends eK
{

    private static final String z[];
    private dk a;
    private final cP b;
    private bR c;

    private ez(cP cp)
    {
        b = cp;
        a = dk.g();
        c = bR.d();
    }

    ez(cP cp, ae ae)
    {
        this(cp);
    }

    private void a(fR fr)
    {
        try
        {
            if (fr.j() != b)
            {
                throw new IllegalArgumentException(z[2]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (fR fr)
        {
            throw fr;
        }
    }

    private void c()
    {
        try
        {
            if (a.e())
            {
                a = a.h();
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    public P a()
    {
        return b();
    }

    public cR a()
    {
        return a();
    }

    public ds a()
    {
        try
        {
            if (!d())
            {
                throw b(new ds(b, a, c, null));
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return b();
    }

    public eJ a()
    {
        return d();
    }

    public eK a()
    {
        return d();
    }

    public eK a(P p)
    {
        return a(p);
    }

    public eK a(bR br)
    {
        return a(br);
    }

    public eh a(P p)
    {
        return a(p);
    }

    public eh a(bR br)
    {
        return b(br);
    }

    public eh a(fR fr)
    {
        return b(fr);
    }

    public eh a(fR fr, Object obj)
    {
        return a(fr, obj);
    }

    public ez a(P p)
    {
        if (p instanceof ds)
        {
            p = (ds)p;
            try
            {
                if (ds.a(p) != b)
                {
                    throw new IllegalArgumentException(z[0]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (P p)
            {
                throw p;
            }
            c();
            a.a(ds.b(p));
            a(ds.c(p));
            return this;
        } else
        {
            return (ez)super.a(p);
        }
    }

    public ez a(bR br)
    {
        c = bR.b(c).a(br).c();
        return this;
    }

    public ez a(fR fr, Object obj)
    {
        a(fr);
        c();
        a.a(fr, obj);
        return this;
    }

    public Object a(fR fr)
    {
label0:
        {
            a(fr);
            Object obj1 = a.c(fr);
            Object obj = obj1;
            if (obj1 != null)
            {
                break label0;
            }
            try
            {
                obj = fr.h();
                obj1 = ap.MESSAGE;
            }
            // Misplaced declaration of an exception variable
            catch (fR fr)
            {
                throw fr;
            }
            if (obj == obj1)
            {
                obj = ds.a(fr.q());
                if (d9.c == 0)
                {
                    break label0;
                }
            }
            obj = fr.g();
        }
        return obj;
    }

    public Map a()
    {
        return a.a();
    }

    public P b()
    {
        return e();
    }

    public cP b()
    {
        return b;
    }

    public cR b()
    {
        return b();
    }

    public ds b()
    {
        a.f();
        return new ds(b, a, c, null);
    }

    public eh b(fR fr, Object obj)
    {
        return b(fr, obj);
    }

    public ez b(bR br)
    {
        c = br;
        return this;
    }

    public ez b(fR fr)
    {
        try
        {
            a(fr);
            if (fr.h() != ap.MESSAGE)
            {
                throw new IllegalArgumentException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (fR fr)
        {
            throw fr;
        }
        return new ez(fr.q());
    }

    public ez b(fR fr, Object obj)
    {
        a(fr);
        c();
        a.c(fr, obj);
        return this;
    }

    public boolean b(fR fr)
    {
        a(fr);
        return a.a(fr);
    }

    public P c()
    {
        return a();
    }

    public bR c()
    {
        return c;
    }

    public cR c()
    {
        return e();
    }

    public Object clone()
    {
        return d();
    }

    public ez d()
    {
        ez ez1 = new ez(b);
        ez1.a.a(a);
        ez1.a(c);
        return ez1;
    }

    public boolean d()
    {
        return ds.a(b, a);
    }

    public ds e()
    {
        return ds.a(b);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = ";W\032p[\020@\007z\026\033W\033d_1WA7]7\\HxP:KHz[$U\r7S3A\033vY3AHxXvF\000r\036%S\005r\036\"K\030r\020".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "8W\037UK?^\frL\020]\032QW3^\f7W%\022\007yR/\022\036vR?VHqQ$\022\016~[:V\0337I?F\0007S3A\033vY3\022\034nN3\034".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_195;
_L1:
        byte0 = 62;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 86;
          goto _L7
_L3:
        byte0 = 50;
          goto _L7
_L4:
        byte0 = 104;
          goto _L7
        byte0 = 23;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            ac = "\020[\r{Z\022W\033tL?B\034xLvV\007rMv\\\007c\036;S\034tVv_\rdM7U\r7J/B\r9".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 240
    //                   0 261
    //                   1 267
    //                   2 273
    //                   3 279;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_279;
_L8:
        byte1 = 62;
_L14:
        obj1[i] = (char)(byte1 ^ c1);
        i++;
          goto _L13
_L9:
        byte1 = 86;
          goto _L14
_L10:
        byte1 = 50;
          goto _L14
_L11:
        byte1 = 104;
          goto _L14
        byte1 = 23;
          goto _L14
_L21:
        byte byte1;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, (new String(ac)).intern()
            });
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 345
    //                   1 351
    //                   2 357
    //                   3 363;
           goto _L15 _L16 _L17 _L18 _L19
_L16:
        break; /* Loop/switch isn't completed */
_L19:
        break MISSING_BLOCK_LABEL_363;
_L15:
        byte byte2 = 62;
_L22:
        ac[i] = (char)(byte2 ^ c1);
        i++;
        if (true) goto _L21; else goto _L20
_L20:
        byte2 = 86;
          goto _L22
_L17:
        byte2 = 50;
          goto _L22
_L18:
        byte2 = 104;
          goto _L22
        byte2 = 23;
          goto _L22
    }
}
