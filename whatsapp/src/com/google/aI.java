// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;

// Referenced classes of package com.google:
//            a3, aN, d9, eL, 
//            dY, aQ, w

class aI extends a3
{

    private static final String z[];
    protected final byte c[];
    private int d;

    aI(byte abyte0[])
    {
        d = 0;
        c = abyte0;
    }

    protected int a()
    {
        return 0;
    }

    protected int a(int j, int k, int l)
    {
        k = a() + k;
        return aN.a(j, c, k, k + l);
    }

    public InputStream a()
    {
        return new ByteArrayInputStream(c, a(), c());
    }

    boolean a(aI ai, int j, int k)
    {
        boolean flag1 = true;
        int i1 = d9.c;
        try
        {
            if (k > ai.c())
            {
                throw new IllegalArgumentException((new StringBuilder()).append(z[1]).append(k).append(c()).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aI ai)
        {
            throw ai;
        }
        try
        {
            if (j + k > ai.c())
            {
                throw new IllegalArgumentException((new StringBuilder()).append(z[2]).append(j).append(z[4]).append(k).append(z[3]).append(ai.c()).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (aI ai)
        {
            throw ai;
        }
        byte abyte0[] = c;
        byte abyte1[] = ai.c;
        int j1 = a();
        int l = a();
        j = ai.a() + j;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (l < j1 + k)
                {
                    if (abyte0[l] == abyte1[j])
                    {
                        break label0;
                    }
                    flag = false;
                }
                return flag;
            }
            l++;
            j++;
            if (i1 != 0)
            {
                return true;
            }
        } while (true);
    }

    public byte b(int j)
    {
        return c[j];
    }

    protected int b(int j, int k, int l)
    {
        int k1 = d9.c;
        byte abyte0[] = c;
        int j1 = a() + k;
        k = j1;
        int i1;
        do
        {
            i1 = j;
            if (k >= j1 + l)
            {
                break;
            }
            i1 = j * 31 + abyte0[k];
            k++;
            j = i1;
        } while (k1 == 0);
        return i1;
    }

    public String b(String s)
    {
        return new String(c, a(), c(), s);
    }

    protected void b(byte abyte0[], int j, int k, int l)
    {
        System.arraycopy(c, j, abyte0, k, l);
    }

    public int c()
    {
        return c.length;
    }

    public eL d()
    {
        return eL.a(c, a(), c());
    }

    public w e()
    {
        return new dY(this, null);
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (obj == this)
            {
                return true;
            }
            boolean flag;
            try
            {
                flag = obj instanceof a3;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (!flag)
            {
                return false;
            }
            int j;
            int k;
            try
            {
                j = c();
                k = ((a3)obj).c();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (j != k)
            {
                return false;
            }
            try
            {
                j = c();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (j == 0)
            {
                return true;
            }
            try
            {
                if (!(obj instanceof aI))
                {
                    break label0;
                }
                flag = a((aI)obj, 0, c());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return flag;
        }
label1:
        {
            boolean flag1;
            try
            {
                if (!(obj instanceof aQ))
                {
                    break label1;
                }
                flag1 = obj.equals(this);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return flag1;
        }
        throw new IllegalArgumentException((new StringBuilder()).append(z[0]).append(obj.getClass()).toString());
    }

    protected int g()
    {
        return d;
    }

    public int hashCode()
    {
        int k = d;
        int j = k;
        if (k == 0)
        {
            j = c();
            int l = b(j, 0, j);
            j = l;
            if (l == 0)
            {
                j = 1;
            }
            d = j;
        }
        return j;
    }

    public boolean i()
    {
        int j = a();
        return aN.d(c, j, c() + j);
    }

    public Iterator iterator()
    {
        return e();
    }

    static 
    {
        Object obj;
        int j;
        int k;
        obj = "\024'\002xr|(\024/3(?\001=33 Q\032j(#\",a5(\026xq9#\037xp.#\020,v8yQ\036|)(\025x".toCharArray();
        k = obj.length;
        j = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        char ac[];
        char c1;
        if (k <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\020#\037?g4f\0057||*\020*t9|Q".toCharArray();
            k = obj1.length;
            j = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 228
    //                   0 251
    //                   1 258
    //                   2 265
    //                   3 272;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_272;
_L1:
        byte0 = 19;
_L7:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L6
_L2:
        byte0 = 92;
          goto _L7
_L3:
        byte0 = 70;
          goto _L7
_L4:
        byte0 = 113;
          goto _L7
        byte0 = 88;
          goto _L7
_L13:
        byte byte0;
        if (k <= j)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "\016'\037x|: Q=}8f\036>332\031=aff".toCharArray();
            k = obj2.length;
            j = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 320
    //                   0 343
    //                   1 350
    //                   2 357
    //                   3 364;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_364;
_L8:
        byte1 = 19;
_L14:
        obj1[j] = (char)(byte1 ^ c1);
        j++;
          goto _L13
_L9:
        byte1 = 92;
          goto _L14
_L10:
        byte1 = 70;
          goto _L14
_L11:
        byte1 = 113;
          goto _L14
        byte1 = 88;
          goto _L14
_L20:
        byte byte1;
        if (k <= j)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "pf".toCharArray();
            k = obj3.length;
            j = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 435
    //                   1 442
    //                   2 449
    //                   3 456;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_456;
_L15:
        byte2 = 19;
_L21:
        obj2[j] = (char)(byte2 ^ c1);
        j++;
          goto _L20
_L16:
        byte2 = 92;
          goto _L21
_L17:
        byte2 = 70;
          goto _L21
_L18:
        byte2 = 113;
          goto _L21
        byte2 = 88;
          goto _L21
_L27:
        byte byte2;
        if (k <= j)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            ac = "pf".toCharArray();
            k = ac.length;
            j = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c1 = obj3[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 504
    //                   0 527
    //                   1 534
    //                   2 541
    //                   3 548;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_548;
_L22:
        byte3 = 19;
_L28:
        obj3[j] = (char)(byte3 ^ c1);
        j++;
          goto _L27
_L23:
        byte3 = 92;
          goto _L28
_L24:
        byte3 = 70;
          goto _L28
_L25:
        byte3 = 113;
          goto _L28
        byte3 = 88;
          goto _L28
_L35:
        byte byte3;
        if (k <= j)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, (new String(ac)).intern()
            });
            return;
        }
        c1 = ac[j];
        j % 5;
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
        byte byte4 = 19;
_L36:
        ac[j] = (char)(byte4 ^ c1);
        j++;
        if (true) goto _L35; else goto _L34
_L34:
        byte4 = 92;
          goto _L36
_L31:
        byte4 = 70;
          goto _L36
_L32:
        byte4 = 113;
          goto _L36
        byte4 = 88;
          goto _L36
    }
}
