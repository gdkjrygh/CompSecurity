// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google:
//            c5, d9, d8, dn, 
//            fR, eh, ee

class Y
    implements c5
{

    private static final String z[];
    protected final Method a;
    protected final Method b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;
    protected final Class h;
    protected final Method i;
    protected final Method j;

    Y(fR fr, String s, Class class1, Class class2)
    {
        int k = d9.c;
        super();
        d = d8.b(class1, (new StringBuilder()).append(z[1]).append(s).append(z[11]).toString(), new Class[0]);
        g = d8.b(class2, (new StringBuilder()).append(z[7]).append(s).append(z[9]).toString(), new Class[0]);
        e = d8.b(class1, (new StringBuilder()).append(z[5]).append(s).toString(), new Class[] {
            Integer.TYPE
        });
        b = d8.b(class2, (new StringBuilder()).append(z[12]).append(s).toString(), new Class[] {
            Integer.TYPE
        });
        h = e.getReturnType();
        f = d8.b(class2, (new StringBuilder()).append(z[13]).append(s).toString(), new Class[] {
            Integer.TYPE, h
        });
        i = d8.b(class2, (new StringBuilder()).append(z[10]).append(s).toString(), new Class[] {
            h
        });
        j = d8.b(class1, (new StringBuilder()).append(z[6]).append(s).append(z[8]).toString(), new Class[0]);
        c = d8.b(class2, (new StringBuilder()).append(z[2]).append(s).append(z[3]).toString(), new Class[0]);
        a = d8.b(class2, (new StringBuilder()).append(z[4]).append(s).toString(), new Class[0]);
        if (dn.a != 0)
        {
            d9.c = k + 1;
        }
    }

    public int a(d8 d8_1)
    {
        return ((Integer)d8.b(j, d8_1, new Object[0])).intValue();
    }

    public eh a()
    {
        throw new UnsupportedOperationException(z[15]);
    }

    public Object a(d8 d8_1, int k)
    {
        return d8.b(e, d8_1, new Object[] {
            Integer.valueOf(k)
        });
    }

    public Object a(ee ee)
    {
        return d8.b(g, ee, new Object[0]);
    }

    public void a(ee ee)
    {
        d8.b(a, ee, new Object[0]);
    }

    public void a(ee ee, Object obj)
    {
        int k = d9.c;
        a(ee);
        obj = ((List)obj).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            b(ee, ((Iterator) (obj)).next());
        } while (k == 0);
    }

    public void b(ee ee, Object obj)
    {
        d8.b(i, ee, new Object[] {
            obj
        });
    }

    public boolean b(d8 d8_1)
    {
        throw new UnsupportedOperationException(z[0]);
    }

    public boolean b(ee ee)
    {
        throw new UnsupportedOperationException(z[14]);
    }

    public Object c(d8 d8_1)
    {
        return d8.b(d, d8_1, new Object[0]);
    }

    static 
    {
        Object obj;
        int k;
        int l;
        obj = "\t\020\"h\024\004\0355\006TA\0220B\021\004\025qA\023A\020q\\\030\021\0240Z\030\005Q7G\030\r\025\177".toCharArray();
        l = obj.length;
        k = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        char ac[];
        char c1;
        if (l <= k)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\006\024%".toCharArray();
            l = obj1.length;
            k = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 692
    //                   0 715
    //                   1 722
    //                   2 729
    //                   3 736;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_736;
_L1:
        byte0 = 125;
_L7:
        obj[k] = (char)(byte0 ^ c1);
        k++;
          goto _L6
_L2:
        byte0 = 97;
          goto _L7
_L3:
        byte0 = 113;
          goto _L7
_L4:
        byte0 = 81;
          goto _L7
        byte0 = 46;
          goto _L7
_L13:
        byte byte0;
        if (l <= k)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "\006\024%".toCharArray();
            l = obj2.length;
            k = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 784
    //                   0 807
    //                   1 814
    //                   2 821
    //                   3 828;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_828;
_L8:
        byte1 = 125;
_L14:
        obj1[k] = (char)(byte1 ^ c1);
        k++;
          goto _L13
_L9:
        byte1 = 97;
          goto _L14
_L10:
        byte1 = 113;
          goto _L14
_L11:
        byte1 = 81;
          goto _L14
        byte1 = 46;
          goto _L14
_L20:
        byte byte1;
        if (l <= k)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "\"\036$@\t".toCharArray();
            l = obj3.length;
            k = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 876
    //                   0 899
    //                   1 906
    //                   2 913
    //                   3 920;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_920;
_L15:
        byte2 = 125;
_L21:
        obj2[k] = (char)(byte2 ^ c1);
        k++;
          goto _L20
_L16:
        byte2 = 97;
          goto _L21
_L17:
        byte2 = 113;
          goto _L21
_L18:
        byte2 = 81;
          goto _L21
        byte2 = 46;
          goto _L21
_L27:
        byte byte2;
        if (l <= k)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "\002\0354O\017".toCharArray();
            l = obj4.length;
            k = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c1 = obj3[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 968
    //                   0 991
    //                   1 998
    //                   2 1005
    //                   3 1012;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_1012;
_L22:
        byte3 = 125;
_L28:
        obj3[k] = (char)(byte3 ^ c1);
        k++;
          goto _L27
_L23:
        byte3 = 97;
          goto _L28
_L24:
        byte3 = 113;
          goto _L28
_L25:
        byte3 = 81;
          goto _L28
        byte3 = 46;
          goto _L28
_L34:
        byte byte3;
        if (l <= k)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "\006\024%".toCharArray();
            l = obj5.length;
            k = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c1 = obj4[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1060
    //                   0 1084
    //                   1 1091
    //                   2 1098
    //                   3 1105;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_1105;
_L29:
        byte4 = 125;
_L35:
        obj4[k] = (char)(byte4 ^ c1);
        k++;
          goto _L34
_L30:
        byte4 = 97;
          goto _L35
_L31:
        byte4 = 113;
          goto _L35
_L32:
        byte4 = 81;
          goto _L35
        byte4 = 46;
          goto _L35
_L41:
        byte byte4;
        if (l <= k)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "\006\024%".toCharArray();
            l = obj6.length;
            k = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c1 = obj5[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1152
    //                   0 1176
    //                   1 1183
    //                   2 1190
    //                   3 1197;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_1197;
_L36:
        byte5 = 125;
_L42:
        obj5[k] = (char)(byte5 ^ c1);
        k++;
          goto _L41
_L37:
        byte5 = 97;
          goto _L42
_L38:
        byte5 = 113;
          goto _L42
_L39:
        byte5 = 81;
          goto _L42
        byte5 = 46;
          goto _L42
_L48:
        byte byte5;
        if (l <= k)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "\006\024%".toCharArray();
            l = obj7.length;
            k = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c1 = obj6[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1244
    //                   0 1268
    //                   1 1275
    //                   2 1282
    //                   3 1289;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1289;
_L43:
        byte6 = 125;
_L49:
        obj6[k] = (char)(byte6 ^ c1);
        k++;
          goto _L48
_L44:
        byte6 = 97;
          goto _L49
_L45:
        byte6 = 113;
          goto _L49
_L46:
        byte6 = 81;
          goto _L49
        byte6 = 46;
          goto _L49
_L55:
        byte byte6;
        if (l <= k)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = "\"\036$@\t".toCharArray();
            l = obj8.length;
            k = 0;
            break MISSING_BLOCK_LABEL_287;
        }
        c1 = obj7[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1336
    //                   0 1360
    //                   1 1367
    //                   2 1374
    //                   3 1381;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1381;
_L50:
        byte7 = 125;
_L56:
        obj7[k] = (char)(byte7 ^ c1);
        k++;
          goto _L55
_L51:
        byte7 = 97;
          goto _L56
_L52:
        byte7 = 113;
          goto _L56
_L53:
        byte7 = 81;
          goto _L56
        byte7 = 46;
          goto _L56
_L62:
        byte byte7;
        if (l <= k)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            obj9 = "-\030\"Z".toCharArray();
            l = obj9.length;
            k = 0;
            break MISSING_BLOCK_LABEL_323;
        }
        c1 = obj8[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1428
    //                   0 1452
    //                   1 1459
    //                   2 1466
    //                   3 1473;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_1473;
_L57:
        byte8 = 125;
_L63:
        obj8[k] = (char)(byte8 ^ c1);
        k++;
          goto _L62
_L58:
        byte8 = 97;
          goto _L63
_L59:
        byte8 = 113;
          goto _L63
_L60:
        byte8 = 81;
          goto _L63
        byte8 = 46;
          goto _L63
_L69:
        byte byte8;
        if (l <= k)
        {
            obj9 = (new String(((char []) (obj9)))).intern();
            obj10 = "\000\0255".toCharArray();
            l = obj10.length;
            k = 0;
            break MISSING_BLOCK_LABEL_359;
        }
        c1 = obj9[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1520
    //                   0 1544
    //                   1 1551
    //                   2 1558
    //                   3 1565;
           goto _L64 _L65 _L66 _L67 _L68
_L68:
        break MISSING_BLOCK_LABEL_1565;
_L64:
        byte9 = 125;
_L70:
        obj9[k] = (char)(byte9 ^ c1);
        k++;
          goto _L69
_L65:
        byte9 = 97;
          goto _L70
_L66:
        byte9 = 113;
          goto _L70
_L67:
        byte9 = 81;
          goto _L70
        byte9 = 46;
          goto _L70
_L76:
        byte byte9;
        if (l <= k)
        {
            obj10 = (new String(((char []) (obj10)))).intern();
            obj11 = "-\030\"Z".toCharArray();
            l = obj11.length;
            k = 0;
            break MISSING_BLOCK_LABEL_395;
        }
        c1 = obj10[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1612
    //                   0 1636
    //                   1 1643
    //                   2 1650
    //                   3 1657;
           goto _L71 _L72 _L73 _L74 _L75
_L75:
        break MISSING_BLOCK_LABEL_1657;
_L71:
        byte10 = 125;
_L77:
        obj10[k] = (char)(byte10 ^ c1);
        k++;
          goto _L76
_L72:
        byte10 = 97;
          goto _L77
_L73:
        byte10 = 113;
          goto _L77
_L74:
        byte10 = 81;
          goto _L77
        byte10 = 46;
          goto _L77
_L83:
        byte byte10;
        if (l <= k)
        {
            obj11 = (new String(((char []) (obj11)))).intern();
            obj12 = "\006\024%".toCharArray();
            l = obj12.length;
            k = 0;
            break MISSING_BLOCK_LABEL_431;
        }
        c1 = obj11[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1704
    //                   0 1728
    //                   1 1735
    //                   2 1742
    //                   3 1749;
           goto _L78 _L79 _L80 _L81 _L82
_L82:
        break MISSING_BLOCK_LABEL_1749;
_L78:
        byte11 = 125;
_L84:
        obj11[k] = (char)(byte11 ^ c1);
        k++;
          goto _L83
_L79:
        byte11 = 97;
          goto _L84
_L80:
        byte11 = 113;
          goto _L84
_L81:
        byte11 = 81;
          goto _L84
        byte11 = 46;
          goto _L84
_L90:
        byte byte11;
        if (l <= k)
        {
            obj12 = (new String(((char []) (obj12)))).intern();
            obj13 = "\022\024%".toCharArray();
            l = obj13.length;
            k = 0;
            break MISSING_BLOCK_LABEL_467;
        }
        c1 = obj12[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1796
    //                   0 1820
    //                   1 1827
    //                   2 1834
    //                   3 1841;
           goto _L85 _L86 _L87 _L88 _L89
_L89:
        break MISSING_BLOCK_LABEL_1841;
_L85:
        byte12 = 125;
_L91:
        obj12[k] = (char)(byte12 ^ c1);
        k++;
          goto _L90
_L86:
        byte12 = 97;
          goto _L91
_L87:
        byte12 = 113;
          goto _L91
_L88:
        byte12 = 81;
          goto _L91
        byte12 = 46;
          goto _L91
_L97:
        byte byte12;
        if (l <= k)
        {
            obj13 = (new String(((char []) (obj13)))).intern();
            obj14 = "\t\020\"h\024\004\0355\006TA\0220B\021\004\025qA\023A\020q\\\030\021\0240Z\030\005Q7G\030\r\025\177".toCharArray();
            l = obj14.length;
            k = 0;
            break MISSING_BLOCK_LABEL_503;
        }
        c1 = obj13[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1888
    //                   0 1912
    //                   1 1919
    //                   2 1926
    //                   3 1933;
           goto _L92 _L93 _L94 _L95 _L96
_L96:
        break MISSING_BLOCK_LABEL_1933;
_L92:
        byte13 = 125;
_L98:
        obj13[k] = (char)(byte13 ^ c1);
        k++;
          goto _L97
_L93:
        byte13 = 97;
          goto _L98
_L94:
        byte13 = 113;
          goto _L98
_L95:
        byte13 = 81;
          goto _L98
        byte13 = 46;
          goto _L98
_L104:
        byte byte13;
        if (l <= k)
        {
            obj14 = (new String(((char []) (obj14)))).intern();
            ac = "\017\024&l\b\b\0355K\017'\036#h\024\004\0355\006TA\0220B\021\004\025qA\023A\020q@\022\017\\\034K\016\022\0206K]\025\b!KS".toCharArray();
            l = ac.length;
            k = 0;
            break MISSING_BLOCK_LABEL_539;
        }
        c1 = obj14[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1980
    //                   0 2004
    //                   1 2011
    //                   2 2018
    //                   3 2025;
           goto _L99 _L100 _L101 _L102 _L103
_L103:
        break MISSING_BLOCK_LABEL_2025;
_L99:
        byte14 = 125;
_L105:
        obj14[k] = (char)(byte14 ^ c1);
        k++;
          goto _L104
_L100:
        byte14 = 97;
          goto _L105
_L101:
        byte14 = 113;
          goto _L105
_L102:
        byte14 = 81;
          goto _L105
        byte14 = 46;
          goto _L105
_L112:
        byte byte14;
        if (l <= k)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
                obj10, obj11, obj12, obj13, obj14, (new String(ac)).intern()
            });
            return;
        }
        c1 = ac[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 2072
    //                   0 2096
    //                   1 2103
    //                   2 2110
    //                   3 2117;
           goto _L106 _L107 _L108 _L109 _L110
_L107:
        break; /* Loop/switch isn't completed */
_L110:
        break MISSING_BLOCK_LABEL_2117;
_L106:
        byte byte15 = 125;
_L113:
        ac[k] = (char)(byte15 ^ c1);
        k++;
        if (true) goto _L112; else goto _L111
_L111:
        byte15 = 97;
          goto _L113
_L108:
        byte15 = 113;
          goto _L113
_L109:
        byte15 = 81;
          goto _L113
        byte15 = 46;
          goto _L113
    }
}
