// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.lang.reflect.Method;

// Referenced classes of package com.google:
//            c5, d8, fR, eh, 
//            ee

class p
    implements c5
{

    private static final String z[];
    protected final Method a;
    protected final Method b;
    protected final Method c;
    protected final Class d;
    protected final Method e;
    protected final Method f;
    protected final Method g;

    p(fR fr, String s, Class class1, Class class2)
    {
        f = d8.b(class1, (new StringBuilder()).append(z[7]).append(s).toString(), new Class[0]);
        b = d8.b(class2, (new StringBuilder()).append(z[8]).append(s).toString(), new Class[0]);
        d = f.getReturnType();
        g = d8.b(class2, (new StringBuilder()).append(z[5]).append(s).toString(), new Class[] {
            d
        });
        a = d8.b(class1, (new StringBuilder()).append(z[9]).append(s).toString(), new Class[0]);
        e = d8.b(class2, (new StringBuilder()).append(z[4]).append(s).toString(), new Class[0]);
        c = d8.b(class2, (new StringBuilder()).append(z[6]).append(s).toString(), new Class[0]);
    }

    public int a(d8 d8_1)
    {
        throw new UnsupportedOperationException(z[1]);
    }

    public eh a()
    {
        throw new UnsupportedOperationException(z[2]);
    }

    public Object a(d8 d8_1, int i)
    {
        throw new UnsupportedOperationException(z[3]);
    }

    public Object a(ee ee)
    {
        return d8.b(b, ee, new Object[0]);
    }

    public void a(ee ee, Object obj)
    {
        d8.b(g, ee, new Object[] {
            obj
        });
    }

    public void b(ee ee, Object obj)
    {
        throw new UnsupportedOperationException(z[0]);
    }

    public boolean b(d8 d8_1)
    {
        return ((Boolean)d8.b(a, d8_1, new Object[0])).booleanValue();
    }

    public boolean b(ee ee)
    {
        return ((Boolean)d8.b(e, ee, new Object[0])).booleanValue();
    }

    public Object c(d8 d8_1)
    {
        return d8.b(f, d8_1, new Object[0]);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "&q%1\0217p \027\021#S(\006\030#=hC\027&y-\006\020gz/C\025gf(\r\0232y \021T!|$\017\020i".toCharArray();
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
        Object obj8;
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = " p51\0217p \027\021#S(\006\030#F(\031\021o<a\000\025+y$\007T({a\002T4|/\004\001+t3C\022.p-\007Z".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 440
    //                   0 463
    //                   1 470
    //                   2 477
    //                   3 484;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_484;
_L1:
        byte0 = 116;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 71;
          goto _L7
_L3:
        byte0 = 21;
          goto _L7
_L4:
        byte0 = 65;
          goto _L7
        byte0 = 99;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = ")p6!\001.y%\006\006\001z3%\035\"y%K]gv \017\030\"qa\f\032gta\r\033)8\f\006\0074t&\006T3l1\006Z".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 532
    //                   0 555
    //                   1 562
    //                   2 569
    //                   3 576;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_576;
_L8:
        byte1 = 116;
_L14:
        obj1[i] = (char)(byte1 ^ c1);
        i++;
          goto _L13
_L9:
        byte1 = 71;
          goto _L14
_L10:
        byte1 = 21;
          goto _L14
_L11:
        byte1 = 65;
          goto _L14
        byte1 = 99;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = " p51\0217p \027\021#S(\006\030#=hC\027&y-\006\020gz/C\025gf(\r\0232y \021T!|$\017\020i".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 624
    //                   0 647
    //                   1 654
    //                   2 661
    //                   3 668;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_668;
_L15:
        byte2 = 116;
_L21:
        obj2[i] = (char)(byte2 ^ c1);
        i++;
          goto _L20
_L16:
        byte2 = 71;
          goto _L21
_L17:
        byte2 = 21;
          goto _L21
_L18:
        byte2 = 65;
          goto _L21
        byte2 = 99;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "/t2".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c1 = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 716
    //                   0 739
    //                   1 746
    //                   2 753
    //                   3 760;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_760;
_L22:
        byte3 = 116;
_L28:
        obj3[i] = (char)(byte3 ^ c1);
        i++;
          goto _L27
_L23:
        byte3 = 71;
          goto _L28
_L24:
        byte3 = 21;
          goto _L28
_L25:
        byte3 = 65;
          goto _L28
        byte3 = 99;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "4p5".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c1 = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 808
    //                   0 832
    //                   1 839
    //                   2 846
    //                   3 853;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_853;
_L29:
        byte4 = 116;
_L35:
        obj4[i] = (char)(byte4 ^ c1);
        i++;
          goto _L34
_L30:
        byte4 = 71;
          goto _L35
_L31:
        byte4 = 21;
          goto _L35
_L32:
        byte4 = 65;
          goto _L35
        byte4 = 99;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "$y$\002\006".toCharArray();
            j = obj6.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c1 = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 900
    //                   0 924
    //                   1 931
    //                   2 938
    //                   3 945;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_945;
_L36:
        byte5 = 116;
_L42:
        obj5[i] = (char)(byte5 ^ c1);
        i++;
          goto _L41
_L37:
        byte5 = 71;
          goto _L42
_L38:
        byte5 = 21;
          goto _L42
_L39:
        byte5 = 65;
          goto _L42
        byte5 = 99;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = " p5".toCharArray();
            j = obj7.length;
            i = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c1 = obj6[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 992
    //                   0 1016
    //                   1 1023
    //                   2 1030
    //                   3 1037;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1037;
_L43:
        byte6 = 116;
_L49:
        obj6[i] = (char)(byte6 ^ c1);
        i++;
          goto _L48
_L44:
        byte6 = 71;
          goto _L49
_L45:
        byte6 = 21;
          goto _L49
_L46:
        byte6 = 65;
          goto _L49
        byte6 = 99;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = " p5".toCharArray();
            j = obj8.length;
            i = 0;
            break MISSING_BLOCK_LABEL_287;
        }
        c1 = obj7[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1084
    //                   0 1108
    //                   1 1115
    //                   2 1122
    //                   3 1129;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1129;
_L50:
        byte7 = 116;
_L56:
        obj7[i] = (char)(byte7 ^ c1);
        i++;
          goto _L55
_L51:
        byte7 = 71;
          goto _L56
_L52:
        byte7 = 21;
          goto _L56
_L53:
        byte7 = 65;
          goto _L56
        byte7 = 99;
          goto _L56
_L62:
        byte byte7;
        if (j <= i)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            ac = "/t2".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_323;
        }
        c1 = obj8[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1176
    //                   0 1200
    //                   1 1207
    //                   2 1214
    //                   3 1221;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_1221;
_L57:
        byte8 = 116;
_L63:
        obj8[i] = (char)(byte8 ^ c1);
        i++;
          goto _L62
_L58:
        byte8 = 71;
          goto _L63
_L59:
        byte8 = 21;
          goto _L63
_L60:
        byte8 = 65;
          goto _L63
        byte8 = 99;
          goto _L63
_L70:
        byte byte8;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (new String(ac)).intern()
            });
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1268
    //                   0 1292
    //                   1 1299
    //                   2 1306
    //                   3 1313;
           goto _L64 _L65 _L66 _L67 _L68
_L65:
        break; /* Loop/switch isn't completed */
_L68:
        break MISSING_BLOCK_LABEL_1313;
_L64:
        byte byte9 = 116;
_L71:
        ac[i] = (char)(byte9 ^ c1);
        i++;
        if (true) goto _L70; else goto _L69
_L69:
        byte9 = 71;
          goto _L71
_L66:
        byte9 = 21;
          goto _L71
_L67:
        byte9 = 65;
          goto _L71
        byte9 = 99;
          goto _L71
    }
}
