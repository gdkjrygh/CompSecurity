// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google:
//            d8, e, dk, fp, 
//            bt, fR, cP, ap, 
//            ds, eK, c, eL, 
//            fz, z

public abstract class d2 extends d8
    implements e
{

    private static final String z[];
    private final dk e;

    protected d2()
    {
        e = dk.g();
    }

    protected d2(fp fp1)
    {
        super(fp1);
        e = fp.a(fp1);
    }

    static dk a(d2 d2_1)
    {
        return d2_1.e;
    }

    private void a(bt bt1)
    {
        try
        {
            if (bt1.b().j() != b())
            {
                throw new IllegalArgumentException((new StringBuilder()).append(z[1]).append(bt1.b().j().c()).append(z[3]).append(b().c()).append(z[2]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (bt bt1)
        {
            throw bt1;
        }
    }

    private void a(fR fr)
    {
        try
        {
            if (fr.j() != b())
            {
                throw new IllegalArgumentException(z[0]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (fR fr)
        {
            throw fr;
        }
    }

    protected int a()
    {
        return e.d();
    }

    public int a(fR fr)
    {
label0:
        {
            int i;
            try
            {
                if (!fr.n())
                {
                    break label0;
                }
                a(fr);
                i = e.b(fr);
            }
            // Misplaced declaration of an exception variable
            catch (fR fr)
            {
                throw fr;
            }
            return i;
        }
        return super.a(fr);
    }

    public final Object a(bt bt1, int i)
    {
        a(bt1);
        fR fr = bt1.b();
        return bt.b(bt1, e.a(fr, i));
    }

    public Object a(fR fr)
    {
label0:
        {
label1:
            {
                if (!fr.n())
                {
                    break label0;
                }
                a(fr);
                Object obj1 = e.c(fr);
                Object obj = obj1;
                if (obj1 == null)
                {
                    try
                    {
                        if (fr.h() != ap.MESSAGE)
                        {
                            break label1;
                        }
                        obj = ds.a(fr.q());
                    }
                    // Misplaced declaration of an exception variable
                    catch (fR fr)
                    {
                        throw fr;
                    }
                }
                return obj;
            }
            return fr.g();
        }
        return super.a(fr);
    }

    public Object a(fR fr, int i)
    {
label0:
        {
            try
            {
                if (!fr.n())
                {
                    break label0;
                }
                a(fr);
                fr = ((fR) (e.a(fr, i)));
            }
            // Misplaced declaration of an exception variable
            catch (fR fr)
            {
                throw fr;
            }
            return fr;
        }
        return super.a(fr, i);
    }

    public Map a()
    {
        Map map = d8.a(this);
        map.putAll(f());
        return Collections.unmodifiableMap(map);
    }

    protected boolean a(eL el, fz fz, z z1, int i)
    {
        return eK.a(el, fz, z1, b(), null, e, i);
    }

    protected c b()
    {
        return new c(this, false, null);
    }

    public final Object b(bt bt1)
    {
        Object obj;
label0:
        {
            fR fr;
label1:
            {
                a(bt1);
                fr = bt1.b();
                obj = e.c(fr);
                if (obj != null)
                {
                    break label0;
                }
                try
                {
                    if (!fr.e())
                    {
                        break label1;
                    }
                    bt1 = Collections.emptyList();
                }
                // Misplaced declaration of an exception variable
                catch (bt bt1)
                {
                    throw bt1;
                }
                return bt1;
            }
label2:
            {
                try
                {
                    if (fr.h() != ap.MESSAGE)
                    {
                        break label2;
                    }
                    bt1 = bt1.a();
                }
                // Misplaced declaration of an exception variable
                catch (bt bt1)
                {
                    throw bt1;
                }
                return bt1;
            }
            return bt.a(bt1, fr.g());
        }
        return bt.a(bt1, obj);
    }

    public boolean b(fR fr)
    {
label0:
        {
            boolean flag;
            try
            {
                if (!fr.n())
                {
                    break label0;
                }
                a(fr);
                flag = e.a(fr);
            }
            // Misplaced declaration of an exception variable
            catch (fR fr)
            {
                throw fr;
            }
            return flag;
        }
        return super.b(fr);
    }

    public final int c(bt bt1)
    {
        a(bt1);
        bt1 = bt1.b();
        return e.b(bt1);
    }

    protected boolean c()
    {
        return e.b();
    }

    protected c d()
    {
        return new c(this, true, null);
    }

    protected void d()
    {
        e.f();
    }

    public boolean d()
    {
        boolean flag;
        try
        {
            flag = super.d();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        if (c())
        {
            return true;
        }
        return false;
    }

    public final boolean d(bt bt1)
    {
        a(bt1);
        return e.a(bt1.b());
    }

    protected int e()
    {
        return e.i();
    }

    protected Map f()
    {
        return e.a();
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "\00196ms\0035 be. 'neg4<ddg><u7*1'b\177g=6rd&76!c> 6/".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\002('dy49<o7.#sgx5p'xg\"pq".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_236;
_L1:
        byte0 = 23;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 71;
          goto _L7
_L3:
        byte0 = 80;
          goto _L7
_L4:
        byte0 = 83;
          goto _L7
        byte0 = 1;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "e~".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 284
    //                   0 307
    //                   1 314
    //                   2 321
    //                   3 328;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_328;
_L8:
        byte1 = 23;
_L14:
        obj1[i] = (char)(byte1 ^ c1);
        i++;
          goto _L13
_L9:
        byte1 = 71;
          goto _L14
_L10:
        byte1 = 80;
          goto _L14
_L11:
        byte1 = 83;
          goto _L14
        byte1 = 1;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            ac = "ep$i~$8sex\"#sox3p>`c$8slr4#2frg$*qrgr".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 376
    //                   0 399
    //                   1 406
    //                   2 413
    //                   3 420;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_420;
_L15:
        byte2 = 23;
_L21:
        obj2[i] = (char)(byte2 ^ c1);
        i++;
          goto _L20
_L16:
        byte2 = 71;
          goto _L21
_L17:
        byte2 = 80;
          goto _L21
_L18:
        byte2 = 83;
          goto _L21
        byte2 = 1;
          goto _L21
_L28:
        byte byte2;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, (new String(ac)).intern()
            });
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 468
    //                   0 491
    //                   1 498
    //                   2 505
    //                   3 512;
           goto _L22 _L23 _L24 _L25 _L26
_L23:
        break; /* Loop/switch isn't completed */
_L26:
        break MISSING_BLOCK_LABEL_512;
_L22:
        byte byte3 = 23;
_L29:
        ac[i] = (char)(byte3 ^ c1);
        i++;
        if (true) goto _L28; else goto _L27
_L27:
        byte3 = 71;
          goto _L29
_L24:
        byte3 = 80;
          goto _L29
_L25:
        byte3 = 83;
          goto _L29
        byte3 = 1;
          goto _L29
    }
}
