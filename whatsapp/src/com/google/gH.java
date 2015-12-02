// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google:
//            b2, fH, fW, fc, 
//            ca, c7, dI, fR, 
//            cP, gm, gU, cn

final class gH
{

    static final boolean a;
    private static final String z[];
    private final Set b;
    private final Map c;
    private final Map d;
    private final Map e;

    gH(fW afw[])
    {
        d = new HashMap();
        c = new HashMap();
        e = new HashMap();
        b = new HashSet();
        int i = 0;
        do
        {
            try
            {
                if (i >= afw.length)
                {
                    break;
                }
                b.add(afw[i]);
                a(afw[i]);
            }
            // Misplaced declaration of an exception variable
            catch (fW afw[])
            {
                throw afw;
            }
            i++;
        } while (true);
        afw = b.iterator();
_L1:
        fW fw;
        if (!afw.hasNext())
        {
            break MISSING_BLOCK_LABEL_145;
        }
        fw = (fW)afw.next();
        a(fw.f(), fw);
          goto _L1
        fH fh;
        fh;
        if (a) goto _L1; else goto _L2
_L2:
        throw new AssertionError();
        afw;
        throw afw;
    }

    static Map a(gH gh)
    {
        return gh.c;
    }

    private void a(fW fw)
    {
        fw = fw.b().iterator();
        do
        {
            if (!fw.hasNext())
            {
                break;
            }
            fW fw1 = (fW)fw.next();
            if (b.add(fw1))
            {
                a(fw1);
            }
        } while (true);
    }

    static Map b(gH gh)
    {
        return gh.e;
    }

    static void c(fc fc1)
    {
        String s = fc1.b();
        if (s.length() == 0)
        {
            throw new fH(fc1, z[4], null);
        }
        boolean flag = true;
        int i = 0;
        while (i < s.length()) 
        {
            char c1 = s.charAt(i);
            boolean flag1 = flag;
            if (c1 >= '\200')
            {
                flag1 = false;
            }
            flag = flag1;
            if (Character.isLetter(c1))
            {
                continue;
            }
            flag = flag1;
            if (c1 != '_')
            {
                if (Character.isDigit(c1) && i > 0)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            i++;
        }
        if (!flag)
        {
            throw new fH(fc1, (new StringBuilder()).append('"').append(s).append(z[5]).toString(), null);
        } else
        {
            return;
        }
    }

    fc a(String s)
    {
        return a(s, ca.ALL_SYMBOLS);
    }

    fc a(String s, ca ca1)
    {
        fc fc2 = (fc)d.get(s);
        if (fc2 == null) goto _L2; else goto _L1
_L1:
        fc fc1 = fc2;
        if (ca1 == ca.ALL_SYMBOLS) goto _L4; else goto _L3
_L3:
        if (ca1 != ca.TYPES_ONLY) goto _L6; else goto _L5
_L5:
        fc1 = fc2;
        if (b(fc2)) goto _L4; else goto _L6
_L6:
        if (ca1 != ca.AGGREGATES_ONLY || !d(fc2)) goto _L2; else goto _L7
_L7:
        fc1 = fc2;
_L4:
        return fc1;
_L2:
        Iterator iterator = b.iterator();
_L11:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_171;
            }
            fc2 = (fc)fW.a((fW)iterator.next()).d.get(s);
        } while (fc2 == null);
        fc1 = fc2;
        if (ca1 == ca.ALL_SYMBOLS) goto _L4; else goto _L8
_L8:
        if (ca1 != ca.TYPES_ONLY)
        {
            break; /* Loop/switch isn't completed */
        }
        fc1 = fc2;
        if (b(fc2)) goto _L4; else goto _L9
_L9:
        if (ca1 != ca.AGGREGATES_ONLY || !d(fc2)) goto _L11; else goto _L10
_L10:
        return fc2;
        return null;
    }

    fc a(String s, fc fc1, ca ca1)
    {
        if (!s.startsWith(".")) goto _L2; else goto _L1
_L1:
        ca1 = a(s.substring(1), ca1);
_L4:
        String s1;
        StringBuilder stringbuilder;
        int i;
        int j;
        if (ca1 == null)
        {
            throw new fH(fc1, (new StringBuilder()).append('"').append(s).append(z[9]).toString(), null);
        } else
        {
            return ca1;
        }
_L2:
        i = s.indexOf('.');
        if (i == -1)
        {
            s1 = s;
        } else
        {
            s1 = s.substring(0, i);
        }
        stringbuilder = new StringBuilder(fc1.c());
_L5:
        j = stringbuilder.lastIndexOf(".");
        if (j == -1)
        {
            ca1 = a(s, ca1);
        } else
        {
label0:
            {
                stringbuilder.setLength(j + 1);
                stringbuilder.append(s1);
                fc fc2 = a(stringbuilder.toString(), ca.AGGREGATES_ONLY);
                if (fc2 == null)
                {
                    break label0;
                }
                if (i != -1)
                {
                    stringbuilder.setLength(j + 1);
                    stringbuilder.append(s);
                    ca1 = a(stringbuilder.toString(), ca1);
                } else
                {
                    ca1 = fc2;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        stringbuilder.setLength(j);
          goto _L5
    }

    void a(dI di)
    {
        c7 c7_1 = new c7(di.a(), di.getNumber());
        di = (dI)e.put(c7_1, di);
        if (di != null)
        {
            e.put(c7_1, di);
        }
    }

    void a(fR fr)
    {
        c7 c7_1 = new c7(fr.j(), fr.c());
        fR fr1 = (fR)c.put(c7_1, fr);
        if (fr1 != null)
        {
            c.put(c7_1, fr1);
            throw new fH(fr, (new StringBuilder()).append(z[0]).append(fr.c()).append(z[1]).append(fr.j().c()).append(z[3]).append(fr1.b()).append(z[2]).toString(), null);
        } else
        {
            return;
        }
    }

    void a(fc fc1)
    {
        c(fc1);
        String s = fc1.c();
        int i = s.lastIndexOf('.');
        fc fc2 = (fc)d.put(s, fc1);
        if (fc2 != null)
        {
            d.put(s, fc2);
            if (fc1.a() == fc2.a())
            {
                if (i == -1)
                {
                    throw new fH(fc1, (new StringBuilder()).append('"').append(s).append(z[13]).toString(), null);
                } else
                {
                    throw new fH(fc1, (new StringBuilder()).append('"').append(s.substring(i + 1)).append(z[10]).append(s.substring(0, i)).append(z[14]).toString(), null);
                }
            } else
            {
                throw new fH(fc1, (new StringBuilder()).append('"').append(s).append(z[12]).append(fc2.a().d()).append(z[11]).toString(), null);
            }
        } else
        {
            return;
        }
    }

    void a(String s, fW fw)
    {
        int i = s.lastIndexOf('.');
        String s1;
        fc fc1;
        if (i == -1)
        {
            s1 = s;
        } else
        {
            a(s.substring(0, i), fw);
            s1 = s.substring(i + 1);
        }
        fc1 = (fc)d.put(s, new gm(s1, s, fw));
        if (fc1 != null)
        {
            d.put(s, fc1);
            if (!(fc1 instanceof gm))
            {
                throw new fH(fw, (new StringBuilder()).append('"').append(s1).append(z[7]).append(z[8]).append(fc1.a().d()).append(z[6]).toString(), null);
            }
        }
    }

    boolean b(fc fc1)
    {
        return (fc1 instanceof cP) || (fc1 instanceof gU);
    }

    boolean d(fc fc1)
    {
        return (fc1 instanceof cP) || (fc1 instanceof gU) || (fc1 instanceof gm) || (fc1 instanceof cn);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        boolean flag;
        flag = false;
        obj = "BV\002y$$Q\022x\"aMG".toCharArray();
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
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "l^\0245!hM\002t$}\037\005p%j\037\022f%`\037\016{`&".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_48;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 668
    //                   0 691
    //                   1 697
    //                   2 704
    //                   3 711;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_711;
_L1:
        byte0 = 64;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 4;
          goto _L7
_L3:
        byte0 = 63;
          goto _L7
_L4:
        byte0 = 103;
          goto _L7
        byte0 = 21;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "&\021".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_80;
        }
        c1 = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 760
    //                   0 783
    //                   1 789
    //                   2 796
    //                   3 803;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_803;
_L8:
        byte1 = 64;
_L14:
        obj1[i] = (char)(byte1 ^ c1);
        i++;
          goto _L13
_L9:
        byte1 = 4;
          goto _L14
_L10:
        byte1 = 63;
          goto _L14
_L11:
        byte1 = 103;
          goto _L14
        byte1 = 21;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "&\037\005l`bV\002y$$\035".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_112;
        }
        c1 = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 852
    //                   0 875
    //                   1 881
    //                   2 888
    //                   3 895;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_895;
_L15:
        byte2 = 64;
_L21:
        obj2[i] = (char)(byte2 ^ c1);
        i++;
          goto _L20
_L16:
        byte2 = 4;
          goto _L21
_L17:
        byte2 = 63;
          goto _L21
_L18:
        byte2 = 103;
          goto _L21
        byte2 = 21;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "IV\024f)jXG{!iZI".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_146;
        }
        c1 = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 944
    //                   0 967
    //                   1 973
    //                   2 980
    //                   3 987;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_987;
_L22:
        byte3 = 64;
_L28:
        obj3[i] = (char)(byte3 ^ c1);
        i++;
          goto _L27
_L23:
        byte3 = 4;
          goto _L28
_L24:
        byte3 = 63;
          goto _L28
_L25:
        byte3 = 103;
          goto _L28
        byte3 = 21;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "&\037\016f`jP\0235!$I\006y)`\037\016q%jK\016s)aMI".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_182;
        }
        c1 = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1036
    //                   0 1060
    //                   1 1066
    //                   2 1073
    //                   3 1080;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_1080;
_L29:
        byte4 = 64;
_L35:
        obj4[i] = (char)(byte4 ^ c1);
        i++;
          goto _L34
_L30:
        byte4 = 4;
          goto _L35
_L31:
        byte4 = 63;
          goto _L35
_L32:
        byte4 = 103;
          goto _L35
        byte4 = 21;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "&\021".toCharArray();
            j = obj6.length;
            i = 0;
            break MISSING_BLOCK_LABEL_218;
        }
        c1 = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1128
    //                   0 1152
    //                   1 1158
    //                   2 1165
    //                   3 1172;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_1172;
_L36:
        byte5 = 64;
_L42:
        obj5[i] = (char)(byte5 ^ c1);
        i++;
          goto _L41
_L37:
        byte5 = 4;
          goto _L42
_L38:
        byte5 = 63;
          goto _L42
_L39:
        byte5 = 103;
          goto _L42
        byte5 = 21;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "&\037\016f`eS\025p!`FGq%bV\tp$$\027\006f`wP\np4lV\tr`kK\017p2$K\017t.$^G".toCharArray();
            j = obj7.length;
            i = 0;
            break MISSING_BLOCK_LABEL_254;
        }
        c1 = obj6[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1220
    //                   0 1244
    //                   1 1250
    //                   2 1257
    //                   3 1264;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1264;
_L43:
        byte6 = 64;
_L49:
        obj6[i] = (char)(byte6 ^ c1);
        i++;
          goto _L48
_L44:
        byte6 = 4;
          goto _L49
_L45:
        byte6 = 63;
          goto _L49
_L46:
        byte6 = 103;
          goto _L49
        byte6 = 21;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = "t^\004~!cZN5)j\037\001|,a\037E".toCharArray();
            j = obj8.length;
            i = 0;
            break MISSING_BLOCK_LABEL_290;
        }
        c1 = obj7[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1312
    //                   0 1336
    //                   1 1342
    //                   2 1349
    //                   3 1356;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1356;
_L50:
        byte7 = 64;
_L56:
        obj7[i] = (char)(byte7 ^ c1);
        i++;
          goto _L55
_L51:
        byte7 = 4;
          goto _L56
_L52:
        byte7 = 63;
          goto _L56
_L53:
        byte7 = 103;
          goto _L56
        byte7 = 21;
          goto _L56
_L62:
        byte byte7;
        if (j <= i)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            obj9 = "&\037\016f`jP\0235$aY\016{%`\021".toCharArray();
            j = obj9.length;
            i = 0;
            break MISSING_BLOCK_LABEL_326;
        }
        c1 = obj8[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1404
    //                   0 1428
    //                   1 1434
    //                   2 1441
    //                   3 1448;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_1448;
_L57:
        byte8 = 64;
_L63:
        obj8[i] = (char)(byte8 ^ c1);
        i++;
          goto _L62
_L58:
        byte8 = 4;
          goto _L63
_L59:
        byte8 = 63;
          goto _L63
_L60:
        byte8 = 103;
          goto _L63
        byte8 = 21;
          goto _L63
_L69:
        byte byte8;
        if (j <= i)
        {
            obj9 = (new String(((char []) (obj9)))).intern();
            obj10 = "&\037\016f`eS\025p!`FGq%bV\tp$$V\t5b".toCharArray();
            j = obj10.length;
            i = 0;
            break MISSING_BLOCK_LABEL_362;
        }
        c1 = obj9[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1496
    //                   0 1520
    //                   1 1526
    //                   2 1533
    //                   3 1540;
           goto _L64 _L65 _L66 _L67 _L68
_L68:
        break MISSING_BLOCK_LABEL_1540;
_L64:
        byte9 = 64;
_L70:
        obj9[i] = (char)(byte9 ^ c1);
        i++;
          goto _L69
_L65:
        byte9 = 4;
          goto _L70
_L66:
        byte9 = 63;
          goto _L70
_L67:
        byte9 = 103;
          goto _L70
        byte9 = 21;
          goto _L70
_L76:
        byte byte9;
        if (j <= i)
        {
            obj10 = (new String(((char []) (obj10)))).intern();
            obj11 = "&\021".toCharArray();
            j = obj11.length;
            i = 0;
            break MISSING_BLOCK_LABEL_398;
        }
        c1 = obj10[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1588
    //                   0 1612
    //                   1 1618
    //                   2 1625
    //                   3 1632;
           goto _L71 _L72 _L73 _L74 _L75
_L75:
        break MISSING_BLOCK_LABEL_1632;
_L71:
        byte10 = 64;
_L77:
        obj10[i] = (char)(byte10 ^ c1);
        i++;
          goto _L76
_L72:
        byte10 = 4;
          goto _L77
_L73:
        byte10 = 63;
          goto _L77
_L74:
        byte10 = 103;
          goto _L77
        byte10 = 21;
          goto _L77
_L83:
        byte byte10;
        if (j <= i)
        {
            obj11 = (new String(((char []) (obj11)))).intern();
            obj12 = "&\037\016f`eS\025p!`FGq%bV\tp$$V\t5&mS\0025b".toCharArray();
            j = obj12.length;
            i = 0;
            break MISSING_BLOCK_LABEL_434;
        }
        c1 = obj11[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1680
    //                   0 1704
    //                   1 1710
    //                   2 1717
    //                   3 1724;
           goto _L78 _L79 _L80 _L81 _L82
_L82:
        break MISSING_BLOCK_LABEL_1724;
_L78:
        byte11 = 64;
_L84:
        obj11[i] = (char)(byte11 ^ c1);
        i++;
          goto _L83
_L79:
        byte11 = 4;
          goto _L84
_L80:
        byte11 = 63;
          goto _L84
_L81:
        byte11 = 103;
          goto _L84
        byte11 = 21;
          goto _L84
_L90:
        byte byte11;
        if (j <= i)
        {
            obj12 = (new String(((char []) (obj12)))).intern();
            obj13 = "&\037\016f`eS\025p!`FGq%bV\tp$*".toCharArray();
            j = obj13.length;
            i = 0;
            break MISSING_BLOCK_LABEL_470;
        }
        c1 = obj12[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1772
    //                   0 1796
    //                   1 1802
    //                   2 1809
    //                   3 1816;
           goto _L85 _L86 _L87 _L88 _L89
_L89:
        break MISSING_BLOCK_LABEL_1816;
_L85:
        byte12 = 64;
_L91:
        obj12[i] = (char)(byte12 ^ c1);
        i++;
          goto _L90
_L86:
        byte12 = 4;
          goto _L91
_L87:
        byte12 = 63;
          goto _L91
_L88:
        byte12 = 103;
          goto _L91
        byte12 = 21;
          goto _L91
_L97:
        byte byte12;
        if (j <= i)
        {
            obj13 = (new String(((char []) (obj13)))).intern();
            ac = "&\021".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_506;
        }
        c1 = obj13[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1864
    //                   0 1888
    //                   1 1894
    //                   2 1901
    //                   3 1908;
           goto _L92 _L93 _L94 _L95 _L96
_L96:
        break MISSING_BLOCK_LABEL_1908;
_L92:
        byte13 = 64;
_L98:
        obj13[i] = (char)(byte13 ^ c1);
        i++;
          goto _L97
_L93:
        byte13 = 4;
          goto _L98
_L94:
        byte13 = 63;
          goto _L98
_L95:
        byte13 = 103;
          goto _L98
        byte13 = 21;
          goto _L98
_L105:
        byte byte13;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
                obj10, obj11, obj12, obj13, (new String(ac)).intern()
            });
            if (!com/google/b2.desiredAssertionStatus())
            {
                flag = true;
            }
            a = flag;
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1956
    //                   0 1980
    //                   1 1986
    //                   2 1993
    //                   3 2000;
           goto _L99 _L100 _L101 _L102 _L103
_L100:
        break; /* Loop/switch isn't completed */
_L103:
        break MISSING_BLOCK_LABEL_2000;
_L99:
        byte byte14 = 64;
_L106:
        ac[i] = (char)(byte14 ^ c1);
        i++;
        if (true) goto _L105; else goto _L104
_L104:
        byte14 = 4;
          goto _L106
_L101:
        byte14 = 63;
          goto _L106
_L102:
        byte14 = 103;
          goto _L106
        byte14 = 21;
          goto _L106
    }
}
