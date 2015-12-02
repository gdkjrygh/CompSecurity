// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google:
//            dS, fH, gH, cP, 
//            gU, cn, fR, bp, 
//            X

public final class fW
{

    private static final String z[];
    private final fR a[];
    private dS b;
    private final fW c[];
    private final gH d;
    private final cP e[];
    private final cn f[];
    private final fW g[];
    private final gU h[];

    private fW(dS ds, fW afw[], gH gh)
    {
        int i;
        d = gh;
        b = ds;
        c = (fW[])afw.clone();
        g = new fW[ds.k()];
        i = 0;
_L2:
        int k;
        if (i >= ds.k())
        {
            break; /* Loop/switch isn't completed */
        }
        k = ds.b(i);
        if (k < 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (k < c.length)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        throw new fH(this, z[0], null);
        ds;
        throw ds;
        g[i] = c[ds.b(i)];
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        gh.a(f(), this);
        e = new cP[ds.o()];
        int j = 0;
        do
        {
            try
            {
                if (j >= ds.o())
                {
                    break;
                }
                e[j] = new cP(ds.j(j), this, null, j, null);
            }
            // Misplaced declaration of an exception variable
            catch (dS ds)
            {
                throw ds;
            }
            j++;
        } while (true);
        h = new gU[ds.E()];
        j = 0;
        do
        {
            try
            {
                if (j >= ds.E())
                {
                    break;
                }
                h[j] = new gU(ds.l(j), this, null, j, null);
            }
            // Misplaced declaration of an exception variable
            catch (dS ds)
            {
                throw ds;
            }
            j++;
        } while (true);
        f = new cn[ds.t()];
        j = 0;
        do
        {
            try
            {
                if (j >= ds.t())
                {
                    break;
                }
                f[j] = new cn(ds.h(j), this, j, null);
            }
            // Misplaced declaration of an exception variable
            catch (dS ds)
            {
                throw ds;
            }
            j++;
        } while (true);
        a = new fR[ds.p()];
        j = 0;
        do
        {
            try
            {
                if (j >= ds.p())
                {
                    break;
                }
                a[j] = new fR(ds.k(j), this, null, j, true, null);
            }
            // Misplaced declaration of an exception variable
            catch (dS ds)
            {
                throw ds;
            }
            j++;
        } while (true);
        return;
    }

    public static fW a(dS ds, fW afw[])
    {
        fW fw;
        int i;
        fw = new fW(ds, afw, new gH(afw));
        try
        {
            if (afw.length != ds.l())
            {
                throw new fH(fw, z[2], null);
            }
        }
        // Misplaced declaration of an exception variable
        catch (dS ds)
        {
            throw ds;
        }
        i = 0;
_L2:
        int j = ds.l();
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            if (!afw[i].d().equals(ds.g(i)))
            {
                throw new fH(fw, z[1], null);
            }
        }
        // Misplaced declaration of an exception variable
        catch (dS ds)
        {
            throw ds;
        }
        break MISSING_BLOCK_LABEL_97;
        ds;
        throw ds;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        fw.e();
        return fw;
    }

    static gH a(fW fw)
    {
        return fw.d;
    }

    private void a(dS ds)
    {
        boolean flag = false;
        b = ds;
        int i = 0;
        do
        {
            try
            {
                if (i >= e.length)
                {
                    break;
                }
                cP.a(e[i], ds.j(i));
            }
            // Misplaced declaration of an exception variable
            catch (dS ds)
            {
                throw ds;
            }
            i++;
        } while (true);
        i = 0;
        do
        {
            try
            {
                if (i >= h.length)
                {
                    break;
                }
                gU.a(h[i], ds.l(i));
            }
            // Misplaced declaration of an exception variable
            catch (dS ds)
            {
                throw ds;
            }
            i++;
        } while (true);
        i = 0;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            try
            {
                if (i >= f.length)
                {
                    break;
                }
                cn.a(f[i], ds.h(i));
            }
            // Misplaced declaration of an exception variable
            catch (dS ds)
            {
                throw ds;
            }
            i++;
        } while (true);
        do
        {
            try
            {
                if (j >= a.length)
                {
                    break;
                }
                fR.a(a[j], ds.k(j));
            }
            // Misplaced declaration of an exception variable
            catch (dS ds)
            {
                throw ds;
            }
            j++;
        } while (true);
    }

    public static void a(String as[], fW afw[], X x)
    {
        Object obj = new StringBuilder();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            ((StringBuilder) (obj)).append(as[i]);
        }

        try
        {
            as = ((StringBuilder) (obj)).toString().getBytes(z[3]);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            throw new RuntimeException(z[4], as);
        }
        try
        {
            obj = dS.a(as);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            throw new IllegalArgumentException(z[7], as);
        }
        try
        {
            afw = a(((dS) (obj)), afw);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            throw new IllegalArgumentException((new StringBuilder()).append(z[5]).append(((dS) (obj)).z()).append(z[8]).toString(), as);
        }
        x = x.a(afw);
        if (x != null)
        {
            try
            {
                as = dS.a(as, x);
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                throw new IllegalArgumentException(z[6], as);
            }
            afw.a(((dS) (as)));
        }
    }

    private void e()
    {
        boolean flag = false;
        Object aobj[] = e;
        int l = aobj.length;
        for (int i = 0; i < l; i++)
        {
            cP.a(aobj[i]);
        }

        aobj = f;
        l = aobj.length;
        for (int j = 0; j < l; j++)
        {
            cn.a(aobj[j]);
        }

        aobj = a;
        l = aobj.length;
        for (int k = ((flag) ? 1 : 0); k < l; k++)
        {
            fR.b(aobj[k]);
        }

    }

    public dS a()
    {
        return b;
    }

    public List b()
    {
        return Collections.unmodifiableList(Arrays.asList(g));
    }

    public List c()
    {
        return Collections.unmodifiableList(Arrays.asList(e));
    }

    public String d()
    {
        return b.z();
    }

    public String f()
    {
        return b.r();
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "m\0335JvM\021c[oF\031*H:@\0203Nt@\020-Hc\004\034-O\177\\[".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "`\0203Nt@\020-HsA\006c[{W\006&O:P\032cmsH\020\007NiG\007*[nK\007mIoM\031'mhK\030k\002:@\032-\fn\004\030\"_yLU7CuW\020cGsW\001&O:M\033c_rAU\005BvA1&XyV\0343_uV%1DnK[".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 396
    //                   0 419
    //                   1 426
    //                   2 433
    //                   3 440;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_440;
_L1:
        byte0 = 26;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 36;
          goto _L7
_L3:
        byte0 = 117;
          goto _L7
_L4:
        byte0 = 67;
          goto _L7
        byte0 = 43;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "`\0203Nt@\020-HsA\006c[{W\006&O:P\032cmsH\020\007NiG\007*[nK\007mIoM\031'mhK\030k\002:@\032-\fn\004\030\"_yLU7CuW\020cGsW\001&O:M\033c_rAU\005BvA1&XyV\0343_uV%1DnK[".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 488
    //                   0 511
    //                   1 518
    //                   2 525
    //                   3 532;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_532;
_L8:
        byte1 = 26;
_L14:
        obj1[i] = (char)(byte1 ^ c1);
        i++;
          goto _L13
_L9:
        byte1 = 36;
          goto _L14
_L10:
        byte1 = 117;
          goto _L14
_L11:
        byte1 = 67;
          goto _L14
        byte1 = 43;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "m&\f\006\"\034@z\006+".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 580
    //                   0 603
    //                   1 610
    //                   2 617
    //                   3 624;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_624;
_L15:
        byte2 = 26;
_L21:
        obj2[i] = (char)(byte2 ^ c1);
        i++;
          goto _L20
_L16:
        byte2 = 36;
          goto _L21
_L17:
        byte2 = 117;
          goto _L21
_L18:
        byte2 = 67;
          goto _L21
        byte2 = 43;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "w\001\"E~E\007'\013\177J\026,OsJ\022cbIkX{\023/\035Xr\013tK\001cXoT\005,YnA\021cIc\004?\025f4".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c1 = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 672
    //                   0 695
    //                   1 702
    //                   2 709
    //                   3 716;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_716;
_L22:
        byte3 = 26;
_L28:
        obj3[i] = (char)(byte3 ^ c1);
        i++;
          goto _L27
_L23:
        byte3 = 36;
          goto _L28
_L24:
        byte3 = 117;
          goto _L28
_L25:
        byte3 = 67;
          goto _L28
        byte3 = 43;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "m\0335JvM\021cNwF\020'O\177@U'NiG\007*[nK\007cMuVUa".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c1 = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 764
    //                   0 788
    //                   1 795
    //                   2 802
    //                   3 809;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_809;
_L29:
        byte4 = 26;
_L35:
        obj4[i] = (char)(byte4 ^ c1);
        i++;
          goto _L34
_L30:
        byte4 = 36;
          goto _L35
_L31:
        byte4 = 117;
          goto _L35
_L32:
        byte4 = 67;
          goto _L35
        byte4 = 43;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "b\024*G\177@U7D:T\0241X\177\004\0051DnK\026,G:F\000%M\177VU'NiG\007*[nK\007cMuVU$NtA\007\"_\177@U D~A[".toCharArray();
            j = obj6.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c1 = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 856
    //                   0 880
    //                   1 887
    //                   2 894
    //                   3 901;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_901;
_L36:
        byte5 = 26;
_L42:
        obj5[i] = (char)(byte5 ^ c1);
        i++;
          goto _L41
_L37:
        byte5 = 36;
          goto _L42
_L38:
        byte5 = 117;
          goto _L42
_L39:
        byte5 = 67;
          goto _L42
        byte5 = 43;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "b\024*G\177@U7D:T\0241X\177\004\0051DnK\026,G:F\000%M\177VU'NiG\007*[nK\007cMuVU$NtA\007\"_\177@U D~A[".toCharArray();
            j = obj7.length;
            i = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c1 = obj6[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 948
    //                   0 972
    //                   1 979
    //                   2 986
    //                   3 993;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_993;
_L43:
        byte6 = 26;
_L49:
        obj6[i] = (char)(byte6 ^ c1);
        i++;
          goto _L48
_L44:
        byte6 = 36;
          goto _L49
_L45:
        byte6 = 117;
          goto _L49
_L46:
        byte6 = 67;
          goto _L49
        byte6 = 43;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            ac = "\006[".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_287;
        }
        c1 = obj7[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1040
    //                   0 1064
    //                   1 1071
    //                   2 1078
    //                   3 1085;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1085;
_L50:
        byte7 = 26;
_L56:
        obj7[i] = (char)(byte7 ^ c1);
        i++;
          goto _L55
_L51:
        byte7 = 36;
          goto _L56
_L52:
        byte7 = 117;
          goto _L56
_L53:
        byte7 = 67;
          goto _L56
        byte7 = 43;
          goto _L56
_L63:
        byte byte7;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, (new String(ac)).intern()
            });
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1132
    //                   0 1156
    //                   1 1163
    //                   2 1170
    //                   3 1177;
           goto _L57 _L58 _L59 _L60 _L61
_L58:
        break; /* Loop/switch isn't completed */
_L61:
        break MISSING_BLOCK_LABEL_1177;
_L57:
        byte byte8 = 26;
_L64:
        ac[i] = (char)(byte8 ^ c1);
        i++;
        if (true) goto _L63; else goto _L62
_L62:
        byte8 = 36;
          goto _L64
_L59:
        byte8 = 117;
          goto _L64
_L60:
        byte8 = 67;
          goto _L64
        byte8 = 43;
          goto _L64
    }
}
