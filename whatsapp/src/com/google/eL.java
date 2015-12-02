// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google:
//            d9, bp, fn, cR, 
//            ga, eP, a3, z

public final class eL
{

    private static final String z[];
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private final byte h[];
    private int i;
    private final InputStream j;
    private int k;

    private eL(InputStream inputstream)
    {
        e = 0x7fffffff;
        b = 64;
        i = 0x4000000;
        h = new byte[4096];
        f = 0;
        a = 0;
        d = 0;
        j = inputstream;
    }

    private eL(byte abyte0[], int i1, int j1)
    {
        e = 0x7fffffff;
        b = 64;
        i = 0x4000000;
        h = abyte0;
        f = i1 + j1;
        a = i1;
        d = -i1;
        j = null;
    }

    public static int a(int i1, InputStream inputstream)
    {
        int i2 = d9.c;
        if ((i1 & 0x80) != 0) goto _L2; else goto _L1
_L1:
        int j1 = i1;
_L4:
        return j1;
_L2:
        j1 = i1 & 0x7f;
        i1 = 7;
_L6:
        int k1;
        int l1;
        l1 = i1;
        k1 = j1;
        if (i1 >= 32)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = inputstream.read();
        if (l1 == -1)
        {
            try
            {
                throw bp.e();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw inputstream;
            }
        }
        k1 = j1 | (l1 & 0x7f) << i1;
        j1 = k1;
        if ((l1 & 0x80) == 0) goto _L4; else goto _L3
_L3:
        l1 = i1 + 7;
        i1 = l1;
        j1 = k1;
        if (i2 == 0) goto _L6; else goto _L5
_L5:
        if (l1 >= 64)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = inputstream.read();
        if (i1 == -1)
        {
            try
            {
                throw bp.e();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw inputstream;
            }
        }
        j1 = k1;
        if ((i1 & 0x80) == 0) goto _L4; else goto _L7
_L7:
        l1 += 7;
        if (i2 == 0) goto _L5; else goto _L8
_L8:
        throw bp.a();
    }

    public static long a(long l1)
    {
        return l1 >>> 1 ^ -(1L & l1);
    }

    public static eL a(InputStream inputstream)
    {
        return new eL(inputstream);
    }

    public static eL a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public static eL a(byte abyte0[], int i1, int j1)
    {
        abyte0 = new eL(abyte0, i1, j1);
        try
        {
            abyte0.b(j1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException(abyte0);
        }
        return abyte0;
    }

    private boolean a(boolean flag)
    {
        boolean flag1;
        flag1 = false;
        try
        {
            if (a < f)
            {
                throw new IllegalStateException(z[4]);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        int i1;
        int j1;
        int k1;
        i1 = d;
        j1 = f;
        k1 = e;
        if (i1 + j1 == k1)
        {
            if (flag)
            {
                try
                {
                    throw bp.e();
                }
                catch (IllegalArgumentException illegalargumentexception1)
                {
                    throw illegalargumentexception1;
                }
            }
            break MISSING_BLOCK_LABEL_263;
        }
        break MISSING_BLOCK_LABEL_70;
        IllegalArgumentException illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
        InputStream inputstream;
        try
        {
            d = d + f;
            a = 0;
            inputstream = j;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw inputstream;
        }
        if (inputstream == null)
        {
            i1 = -1;
        } else
        {
            i1 = j.read(h);
        }
        try
        {
            f = i1;
            i1 = f;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            try
            {
                throw inputstream;
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw inputstream;
            }
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        if (f >= -1)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        throw new IllegalStateException((new StringBuilder()).append(z[2]).append(f).append(z[3]).toString());
        i1 = f;
        if (i1 != -1)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        try
        {
            f = 0;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw inputstream;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        throw bp.e();
        inputstream;
        throw inputstream;
        h();
        i1 = d + f + k;
        j1 = i;
        if (i1 > j1 || i1 < 0)
        {
            try
            {
                throw bp.f();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw inputstream;
            }
        }
        break MISSING_BLOCK_LABEL_260;
        inputstream;
        throw inputstream;
        flag1 = true;
        return flag1;
    }

    public static int f(int i1)
    {
        return i1 >>> 1 ^ -(i1 & 1);
    }

    private void h()
    {
        f = f + k;
        int i1 = d + f;
        int j1;
        try
        {
            j1 = e;
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
        if (i1 <= j1)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        k = i1 - e;
        f = f - k;
        if (d9.c == 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        k = 0;
        return;
    }

    public int a()
    {
        return l();
    }

    public cR a(fn fn1, z z1)
    {
        int i1 = l();
        try
        {
            if (c >= b)
            {
                throw bp.d();
            }
        }
        // Misplaced declaration of an exception variable
        catch (fn fn1)
        {
            throw fn1;
        }
        i1 = b(i1);
        c = c + 1;
        fn1 = (cR)fn1.a(this, z1);
        c(0);
        c = c - 1;
        a(i1);
        return fn1;
    }

    public void a(int i1)
    {
        e = i1;
        h();
    }

    public void a(int i1, ga ga1, z z1)
    {
        try
        {
            if (c >= b)
            {
                throw bp.d();
            }
        }
        // Misplaced declaration of an exception variable
        catch (ga ga1)
        {
            throw ga1;
        }
        c = c + 1;
        ga1.a(this, z1);
        c(eP.a(i1, 4));
        c = c - 1;
    }

    public void a(ga ga1, z z1)
    {
        int i1 = l();
        try
        {
            if (c >= b)
            {
                throw bp.d();
            }
        }
        // Misplaced declaration of an exception variable
        catch (ga ga1)
        {
            throw ga1;
        }
        i1 = b(i1);
        c = c + 1;
        ga1.a(this, z1);
        c(0);
        c = c - 1;
        a(i1);
    }

    public int b(int i1)
    {
        if (i1 < 0)
        {
            try
            {
                throw bp.b();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        i1 = d + a + i1;
        int j1 = e;
        if (i1 > j1)
        {
            try
            {
                throw bp.e();
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        } else
        {
            e = i1;
            h();
            return j1;
        }
    }

    public long b()
    {
        return u();
    }

    public int c()
    {
        return l();
    }

    public void c(int i1)
    {
        try
        {
            if (g != i1)
            {
                throw bp.c();
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    public void d()
    {
        do
        {
            int i1 = f();
            if (i1 == 0)
            {
                break;
            }
            boolean flag;
            try
            {
                flag = d(i1);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } while (flag);
    }

    public boolean d(int i1)
    {
        int j1;
        try
        {
            j1 = eP.b(i1);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        j1;
        JVM INSTR tableswitch 0 5: default 44
    //                   0 48
    //                   1 58
    //                   2 65
    //                   3 75
    //                   4 93
    //                   5 95;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        throw bp.i();
_L2:
        c();
        return true;
_L3:
        u();
        return true;
_L4:
        e(l());
        return true;
_L5:
        d();
        c(eP.a(eP.a(i1), 4));
        return true;
_L6:
        return false;
_L7:
        n();
        return true;
    }

    public byte e()
    {
        byte abyte0[];
        int i1;
        try
        {
            if (a == f)
            {
                a(true);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        abyte0 = h;
        i1 = a;
        a = i1 + 1;
        return abyte0[i1];
    }

    public void e(int i1)
    {
label0:
        {
label1:
            {
                int l1 = d9.c;
                if (i1 < 0)
                {
                    try
                    {
                        throw bp.b();
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        throw illegalargumentexception;
                    }
                }
                try
                {
                    if (d + a + i1 > e)
                    {
                        e(e - d - a);
                        throw bp.e();
                    }
                }
                catch (IllegalArgumentException illegalargumentexception1)
                {
                    throw illegalargumentexception1;
                }
                int j1;
                int k1;
                try
                {
                    if (i1 > f - a)
                    {
                        break label1;
                    }
                    a = a + i1;
                }
                catch (IllegalArgumentException illegalargumentexception2)
                {
                    throw illegalargumentexception2;
                }
                if (l1 == 0)
                {
                    break label0;
                }
            }
            j1 = f - a;
            a = f;
            a(true);
            do
            {
                k1 = j1;
                if (i1 - j1 <= f)
                {
                    break;
                }
                k1 = j1 + f;
                a = f;
                a(true);
                j1 = k1;
            } while (l1 == 0);
            a = i1 - k1;
        }
    }

    public int f()
    {
label0:
        {
            try
            {
                if (!v())
                {
                    break label0;
                }
                g = 0;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return 0;
        }
        try
        {
            g = l();
            if (eP.a(g) == 0)
            {
                throw bp.h();
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        return g;
    }

    public boolean g()
    {
        int i1;
        try
        {
            i1 = l();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return i1 != 0;
    }

    public byte[] g(int i1)
    {
        int k2 = d9.c;
        if (i1 < 0)
        {
            try
            {
                throw bp.b();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        try
        {
            if (d + a + i1 > e)
            {
                e(e - d - a);
                throw bp.e();
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (i1 <= f - a)
        {
            byte abyte0[] = new byte[i1];
            System.arraycopy(h, a, abyte0, 0, i1);
            a = a + i1;
            return abyte0;
        }
        if (i1 < 4096)
        {
            byte abyte1[] = new byte[i1];
            int j1 = f - a;
            System.arraycopy(h, a, abyte1, 0, j1);
            a = f;
            a(true);
            int l1;
            do
            {
                l1 = j1;
                if (i1 - j1 <= f)
                {
                    break;
                }
                System.arraycopy(h, 0, abyte1, j1, f);
                l1 = j1 + f;
                a = f;
                a(true);
                j1 = l1;
            } while (k2 == 0);
            System.arraycopy(h, 0, abyte1, l1, i1 - l1);
            a = i1 - l1;
            return abyte1;
        }
        int l2 = a;
        int i3 = f;
        d = d + f;
        a = 0;
        f = 0;
        Object obj = new ArrayList();
        int k1 = i1 - (i3 - l2);
        do
        {
            int i2;
label0:
            {
                if (k1 > 0)
                {
                    byte abyte2[] = new byte[Math.min(k1, 4096)];
                    i2 = 0;
                    do
                    {
                        if (i2 >= abyte2.length)
                        {
                            break;
                        }
                        InputStream inputstream;
                        int j2;
                        try
                        {
                            inputstream = j;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            throw obj;
                        }
                        if (inputstream == null)
                        {
                            j2 = -1;
                        } else
                        {
                            j2 = j.read(abyte2, i2, abyte2.length - i2);
                        }
                        if (j2 == -1)
                        {
                            try
                            {
                                throw bp.e();
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj)
                            {
                                throw obj;
                            }
                        }
                        d = d + j2;
                        i2 += j2;
                    } while (k2 == 0);
                    i2 = abyte2.length;
                    ((List) (obj)).add(abyte2);
                    if (k2 == 0)
                    {
                        break label0;
                    }
                }
                byte abyte3[] = new byte[i1];
                i1 = i3 - l2;
                System.arraycopy(h, l2, abyte3, 0, i1);
                obj = ((List) (obj)).iterator();
                do
                {
label1:
                    {
                        if (((Iterator) (obj)).hasNext())
                        {
                            byte abyte4[] = (byte[])((Iterator) (obj)).next();
                            System.arraycopy(abyte4, 0, abyte3, i1, abyte4.length);
                            k1 = abyte4.length;
                            if (k2 == 0)
                            {
                                break label1;
                            }
                        }
                        return abyte3;
                    }
                    i1 = k1 + i1;
                } while (true);
            }
            k1 -= i2;
        } while (true);
    }

    public long i()
    {
        return t();
    }

    public long j()
    {
        return a(t());
    }

    public long k()
    {
        return u();
    }

    public int l()
    {
        int i1;
        int l1;
        l1 = d9.c;
        i1 = e();
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        int j1;
        int k1;
        i1 &= 0x7f;
        k1 = e();
        j1 = i1;
        if (k1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = i1 | k1 << 7;
        i1 = j1;
        if (l1 == 0) goto _L1; else goto _L3
_L3:
        i1 = j1 | (k1 & 0x7f) << 7;
        k1 = e();
        j1 = i1;
        if (k1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = i1 | k1 << 14;
        i1 = j1;
        if (l1 == 0) goto _L1; else goto _L4
_L4:
        j1 |= (k1 & 0x7f) << 14;
        k1 = e();
        i1 = j1;
        if (k1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 |= k1 << 21;
        i1 = j1;
        if (l1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = j1;
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L5
_L5:
        j1 = e();
        k1 = i1 | (k1 & 0x7f) << 21 | j1 << 28;
        i1 = k1;
        if (j1 >= 0) goto _L1; else goto _L6
_L6:
        j1 = 0;
_L9:
        if (j1 >= 5)
        {
            break; /* Loop/switch isn't completed */
        }
        byte byte0;
        try
        {
            byte0 = e();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        i1 = k1;
        if (byte0 >= 0) goto _L1; else goto _L7
_L7:
        j1++;
        if (l1 == 0) goto _L9; else goto _L8
_L8:
        throw bp.a();
    }

    public double m()
    {
        return Double.longBitsToDouble(u());
    }

    public int n()
    {
        return e() & 0xff | (e() & 0xff) << 8 | (e() & 0xff) << 16 | (e() & 0xff) << 24;
    }

    public String o()
    {
        int i1 = l();
        int j1;
        int k1;
        try
        {
            j1 = f;
            k1 = a;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (i1 <= j1 - k1 && i1 > 0)
        {
            String s1 = new String(h, a, i1, z[1]);
            a = i1 + a;
            return s1;
        } else
        {
            return new String(g(i1), z[0]);
        }
    }

    public int p()
    {
        int i1;
        try
        {
            i1 = e;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (i1 == 0x7fffffff)
        {
            return -1;
        } else
        {
            int j1 = d;
            int k1 = a;
            return e - (j1 + k1);
        }
    }

    public float q()
    {
        return Float.intBitsToFloat(n());
    }

    public int r()
    {
        return n();
    }

    public long s()
    {
        return t();
    }

    public long t()
    {
        int j1 = d9.c;
        int i1 = 0;
        long l1 = 0L;
        do
        {
            if (i1 >= 64)
            {
                break;
            }
            byte byte0 = e();
            l1 |= (long)(byte0 & 0x7f) << i1;
            if ((byte0 & 0x80) == 0)
            {
                return l1;
            }
            i1 += 7;
        } while (j1 == 0);
        throw bp.a();
    }

    public long u()
    {
        int i1 = e();
        int j1 = e();
        int k1 = e();
        int l1 = e();
        int i2 = e();
        int j2 = e();
        int k2 = e();
        int l2 = e();
        long l3 = i1;
        return ((long)j1 & 255L) << 8 | l3 & 255L | ((long)k1 & 255L) << 16 | ((long)l1 & 255L) << 24 | ((long)i2 & 255L) << 32 | ((long)j2 & 255L) << 40 | ((long)k2 & 255L) << 48 | ((long)l2 & 255L) << 56;
    }

    public boolean v()
    {
        int i1;
        int j1;
        try
        {
            i1 = a;
            j1 = f;
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
        if (i1 != j1)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        if (!a(false))
        {
            return true;
        }
        return false;
    }

    public int w()
    {
        return l();
    }

    public a3 x()
    {
        int i1 = l();
        if (i1 == 0)
        {
            a3 a3_1;
            try
            {
                a3_1 = a3.b;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return a3_1;
        }
        int j1;
        int k1;
        try
        {
            j1 = f;
            k1 = a;
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (i1 <= j1 - k1 && i1 > 0)
        {
            a3 a3_2 = a3.a(h, a, i1);
            a = i1 + a;
            return a3_2;
        } else
        {
            return a3.a(g(i1));
        }
    }

    public int y()
    {
        return n();
    }

    public int z()
    {
        return f(l());
    }

    static 
    {
        Object obj;
        int i1;
        int j1;
        obj = "bVy%.".toCharArray();
        j1 = obj.length;
        i1 = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        char ac[];
        char c1;
        if (j1 <= i1)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "bVy%.".toCharArray();
            j1 = obj1.length;
            i1 = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 228
    //                   0 251
    //                   1 258
    //                   2 264
    //                   3 271;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_271;
_L1:
        byte0 = 22;
_L7:
        obj[i1] = (char)(byte0 ^ c1);
        i1++;
          goto _L6
_L2:
        byte0 = 55;
          goto _L7
_L3:
        byte0 = 2;
          goto _L7
_L4:
        byte0 = 63;
          goto _L7
        byte0 = 8;
          goto _L7
_L13:
        byte byte0;
        if (j1 <= i1)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "~lO}bdvMmwZ!MmwS*]qbRYb!6EgK}dYg[(\177Yt^d\177S\"MmeBnK26".toCharArray();
            j1 = obj2.length;
            i1 = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 320
    //                   0 343
    //                   1 350
    //                   2 356
    //                   3 363;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_363;
_L8:
        byte1 = 22;
_L14:
        obj1[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L13
_L9:
        byte1 = 55;
          goto _L14
_L10:
        byte1 = 2;
          goto _L14
_L11:
        byte1 = 63;
          goto _L14
        byte1 = 8;
          goto _L14
_L20:
        byte byte1;
        if (j1 <= i1)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "=VWm6~lO}bdvMmwZ\"Vef[gRmxCcKayY\"V{6UwXoo\031".toCharArray();
            j1 = obj3.length;
            i1 = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 435
    //                   1 442
    //                   2 448
    //                   3 455;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_455;
_L15:
        byte2 = 22;
_L21:
        obj2[i1] = (char)(byte2 ^ c1);
        i1++;
          goto _L20
_L16:
        byte2 = 55;
          goto _L21
_L17:
        byte2 = 2;
          goto _L21
_L18:
        byte2 = 63;
          goto _L21
        byte2 = 8;
          goto _L21
_L27:
        byte byte2;
        if (j1 <= i1)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            ac = "EgYaz[@JnpRp\027!6TcSdsS\"H`sY\"]}pQgM(aVqQ/b\027gRxbN,".toCharArray();
            j1 = ac.length;
            i1 = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c1 = obj3[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 504
    //                   0 527
    //                   1 534
    //                   2 540
    //                   3 547;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_547;
_L22:
        byte3 = 22;
_L28:
        obj3[i1] = (char)(byte3 ^ c1);
        i1++;
          goto _L27
_L23:
        byte3 = 55;
          goto _L28
_L24:
        byte3 = 2;
          goto _L28
_L25:
        byte3 = 63;
          goto _L28
        byte3 = 8;
          goto _L28
_L35:
        byte byte3;
        if (j1 <= i1)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, (new String(ac)).intern()
            });
            return;
        }
        c1 = ac[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 596
    //                   0 620
    //                   1 627
    //                   2 633
    //                   3 640;
           goto _L29 _L30 _L31 _L32 _L33
_L30:
        break; /* Loop/switch isn't completed */
_L33:
        break MISSING_BLOCK_LABEL_640;
_L29:
        byte byte4 = 22;
_L36:
        ac[i1] = (char)(byte4 ^ c1);
        i1++;
        if (true) goto _L35; else goto _L34
_L34:
        byte4 = 55;
          goto _L36
_L31:
        byte4 = 2;
          goto _L36
_L32:
        byte4 = 63;
          goto _L36
        byte4 = 8;
          goto _L36
    }
}
