// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package org:
//            W, Q

public class t
{

    private static final String z[];
    private final long a;
    private List b;
    private Long c;
    private boolean d;
    private final Q e;
    private Long f;

    public t(Q q, long l, List list, boolean flag)
    {
        if (q == null)
        {
            throw new IllegalArgumentException(z[8]);
        }
        try
        {
            a = l;
            e = q;
            b = list;
        }
        // Misplaced declaration of an exception variable
        catch (Q q)
        {
            throw q;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        b();
    }

    public t(Q q, long l, boolean flag)
    {
        this(q, l, null, flag);
    }

    public Long a()
    {
        return c;
    }

    public void b()
    {
        int i;
        i = W.f;
        boolean flag;
        try
        {
            flag = d;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        W w;
        W w1;
        W w2;
        long l;
        long l1;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        try
        {
            d = true;
            if (b == null)
            {
                b = new ArrayList();
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        w = e.d();
        l3 = w.e();
        w1 = e.a();
        l4 = w1.e();
        w2 = e.b();
        l5 = w2.e();
        l = w.g();
        if (l != 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        l = w2.g();
        if (l == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        c = Long.valueOf(l5 - a);
        b.add(z[1]);
        if (i == 0) goto _L1; else goto _L3
_L3:
        b.add(z[4]);
        if (i == 0) goto _L1; else goto _L4
_L4:
        l = w1.g();
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        l = w2.g();
        if (l != 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        b.add(z[5]);
        l = a;
        if (l3 > l)
        {
            IllegalArgumentException illegalargumentexception2;
            try
            {
                b.add(z[3]);
            }
            catch (IllegalArgumentException illegalargumentexception3)
            {
                throw illegalargumentexception3;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_260;
            }
        }
        f = Long.valueOf(a - l3);
        l = w1.g();
        if (l == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        IllegalArgumentException illegalargumentexception4;
        try
        {
            c = Long.valueOf(l4 - l3);
        }
        catch (IllegalArgumentException illegalargumentexception5)
        {
            try
            {
                throw illegalargumentexception5;
            }
            catch (IllegalArgumentException illegalargumentexception6)
            {
                throw illegalargumentexception6;
            }
        }
        if (i == 0) goto _L1; else goto _L5
_L5:
        if (w2.g() == 0L) goto _L1; else goto _L6
_L6:
        c = Long.valueOf(l5 - a);
        if (i == 0) goto _L1; else goto _L7
_L7:
label0:
        {
            l2 = a - l3;
            if (l5 < l4)
            {
                try
                {
                    b.add(z[2]);
                }
                catch (IllegalArgumentException illegalargumentexception7)
                {
                    throw illegalargumentexception7;
                }
                l = l2;
                if (i == 0)
                {
                    break label0;
                }
            }
            l6 = l5 - l4;
            l1 = l2;
            if (l6 <= l2)
            {
                l1 = l2 - l6;
                l = l1;
                if (i == 0)
                {
                    break label0;
                }
            }
            l = l1;
            if (l6 - l1 == 1L)
            {
                l = l1;
                if (l1 == 0L)
                {
                    break label0;
                }
                b.add(z[7]);
                l1 = 0L;
                l = l1;
                if (i == 0)
                {
                    break label0;
                }
                l = l1;
            }
            try
            {
                b.add(z[6]);
            }
            catch (IllegalArgumentException illegalargumentexception8)
            {
                throw illegalargumentexception8;
            }
        }
        try
        {
            f = Long.valueOf(l);
            if (l3 > a)
            {
                b.add(z[0]);
            }
        }
        catch (IllegalArgumentException illegalargumentexception9)
        {
            throw illegalargumentexception9;
        }
        c = Long.valueOf(((l4 - l3) + (l5 - a)) / 2L);
        return;
        illegalargumentexception2;
        throw illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
        illegalargumentexception4;
        throw illegalargumentexception4;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "\033I|:\006d\033A'\0359og8\021~\005.\021\021-O\\6\002\nRc0".toCharArray();
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
            obj1 = "\033I|:\006d\033t0\0061\033a'\0359\033z<\031;\033#xT=Z`;\033*\033m:\031.Nz0T:^b4\r".toCharArray();
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
        byte0 = 116;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 94;
          goto _L7
_L3:
        byte0 = 59;
          goto _L7
_L4:
        byte0 = 14;
          goto _L7
        byte0 = 85;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "\033I|:\006d\033v8\035*og8\021~\007.'\027(og8\021".toCharArray();
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
        byte1 = 116;
_L14:
        obj1[i] = (char)(byte1 ^ c1);
        i++;
          goto _L13
_L9:
        byte1 = 94;
          goto _L14
_L10:
        byte1 = 59;
          goto _L14
_L11:
        byte1 = 14;
          goto _L14
        byte1 = 85;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "\033I|:\006d\033A'\0359og8\021~\005.\021\021-O\\6\002\nRc0".toCharArray();
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
        byte2 = 116;
_L21:
        obj2[i] = (char)(byte2 ^ c1);
        i++;
          goto _L20
_L16:
        byte2 = 94;
          goto _L21
_L17:
        byte2 = 59;
          goto _L21
_L18:
        byte2 = 14;
          goto _L21
        byte2 = 85;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "\033I|:\006d\033t0\0061\033a'\0359\033z<\031;\033#xT=Z`;\033*\033m:\031.Nz0T:^b4\rqTh3\007;O".toCharArray();
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
        byte3 = 116;
_L28:
        obj3[i] = (char)(byte3 ^ c1);
        i++;
          goto _L27
_L23:
        byte3 = 94;
          goto _L28
_L24:
        byte3 = 59;
          goto _L28
_L25:
        byte3 = 14;
          goto _L28
        byte3 = 85;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "\tZ|;\0350\\4u\016;Iau\006=M@!\004\nRc0T1I.-\0317O@!\004\nRc0".toCharArray();
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
        byte4 = 116;
_L35:
        obj4[i] = (char)(byte4 ^ c1);
        i++;
          goto _L34
_L30:
        byte4 = 94;
          goto _L35
_L31:
        byte4 = 59;
          goto _L35
_L32:
        byte4 = 14;
          goto _L35
        byte4 = 85;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "\tZ|;\0350\\4u\004,Tm0\007-R`2T*Rc0T`\033z:\000?W.;\021*La'\037~Og8\021".toCharArray();
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
        byte5 = 116;
_L42:
        obj5[i] = (char)(byte5 ^ c1);
        i++;
          goto _L41
_L37:
        byte5 = 94;
          goto _L42
_L38:
        byte5 = 59;
          goto _L42
_L39:
        byte5 = 14;
          goto _L42
        byte5 = 85;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "\027Uh:N~K|:\027;H}<\0329\033z<\031;\0330u\0001Oo9T0^z\"\033,P.!\0353^.7\r~\n.8\007~\0260u\025-H{8\021~Ak'\033~_k9\025'".toCharArray();
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
        byte6 = 116;
_L49:
        obj6[i] = (char)(byte6 ^ c1);
        i++;
          goto _L48
_L44:
        byte6 = 94;
          goto _L49
_L45:
        byte6 = 59;
          goto _L49
_L46:
        byte6 = 14;
          goto _L49
        byte6 = 85;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            ac = "3^}&\0259^.6\0250Ua!T<^.;\0012W".toCharArray();
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
        byte7 = 116;
_L56:
        obj7[i] = (char)(byte7 ^ c1);
        i++;
          goto _L55
_L51:
        byte7 = 94;
          goto _L56
_L52:
        byte7 = 59;
          goto _L56
_L53:
        byte7 = 14;
          goto _L56
        byte7 = 85;
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
        byte byte8 = 116;
_L64:
        ac[i] = (char)(byte8 ^ c1);
        i++;
        if (true) goto _L63; else goto _L62
_L62:
        byte8 = 94;
          goto _L64
_L59:
        byte8 = 59;
          goto _L64
_L60:
        byte8 = 14;
          goto _L64
        byte8 = 85;
          goto _L64
    }
}
