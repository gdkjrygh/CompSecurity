// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Arrays;

// Referenced classes of package com.google:
//            cY, o, fA, ep, 
//            a6, gd, gg, fG, 
//            gh, d6

public final class D
{

    private static final String b[];
    private static final String c[];
    private static final String d[];
    public static boolean e;
    private static final String f[];
    private static final String g[];
    private static final String z[];
    private ep a;

    public D()
    {
    }

    private static int a(int i, boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 88;
        } else
        {
            byte0 = 112;
        }
        return (byte0 + i * 16) * i;
    }

    private static int a(boolean aflag[], int i, int j)
    {
        boolean flag = e;
        int l = 0;
        int i1 = i;
        int k;
        do
        {
            k = l;
            if (i1 >= i + j)
            {
                break;
            }
            l <<= 1;
            k = l;
            if (aflag[i1])
            {
                k = l | 1;
            }
            i1++;
            l = k;
        } while (!flag);
        return k;
    }

    private static cY a(char c1)
    {
        switch (c1)
        {
        default:
            return cY.UPPER;

        case 76: // 'L'
            cY cy;
            try
            {
                cy = cY.LOWER;
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            return cy;

        case 80: // 'P'
            return cY.PUNCT;

        case 77: // 'M'
            return cY.MIXED;

        case 68: // 'D'
            return cY.DIGIT;

        case 66: // 'B'
            return cY.BINARY;
        }
    }

    private static String a(cY cy, int i)
    {
        int j;
        try
        {
            j = o.a[cy.ordinal()];
        }
        // Misplaced declaration of an exception variable
        catch (cY cy)
        {
            throw cy;
        }
        j;
        JVM INSTR tableswitch 1 5: default 44
    //                   1 57
    //                   2 68
    //                   3 74
    //                   4 80
    //                   5 86;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalStateException(z[1]);
_L2:
        cy = b[i];
        return cy;
_L3:
        return d[i];
_L4:
        return f[i];
_L5:
        return c[i];
_L6:
        return g[i];
    }

    private static String a(boolean aflag[])
    {
        cY cy;
        cY cy1;
        StringBuilder stringbuilder;
        int i;
        int l;
        boolean flag;
        flag = e;
        l = aflag.length;
        cy = cY.UPPER;
        cy1 = cY.UPPER;
        stringbuilder = new StringBuilder(20);
        i = 0;
_L18:
        if (i >= l) goto _L2; else goto _L1
_L1:
        cY cy2;
        cY cy3;
        int j;
        int i1;
        int k1;
        try
        {
            cy2 = cY.BINARY;
        }
        // Misplaced declaration of an exception variable
        catch (boolean aflag[])
        {
            try
            {
                throw aflag;
            }
            // Misplaced declaration of an exception variable
            catch (boolean aflag[])
            {
                throw aflag;
            }
        }
        if (cy1 != cy2) goto _L4; else goto _L3
_L3:
        if (l - i < 5 && !flag) goto _L2; else goto _L5
_L5:
        j = a(aflag, i, 5);
        k1 = i + 5;
        i1 = j;
        i = k1;
        if (j != 0) goto _L7; else goto _L6
_L6:
        if (l - k1 < 11 && !flag) goto _L2; else goto _L8
_L8:
        i1 = a(aflag, k1, 11) + 31;
        i = k1 + 11;
_L7:
        int l1 = 0;
        int k;
        do
        {
            k = i;
            if (l1 >= i1)
            {
                break;
            }
            k = i;
            if (l - i < 8)
            {
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_368;
                }
                k = l;
            }
            stringbuilder.append((char)a(aflag, k, 8));
            k += 8;
            l1++;
            i = k;
        } while (!flag);
        i = k;
_L19:
        if (!flag) goto _L10; else goto _L9
_L9:
        cy1 = cy;
_L4:
        String s;
        byte byte0;
        int j1;
        try
        {
            cy2 = cY.DIGIT;
        }
        // Misplaced declaration of an exception variable
        catch (boolean aflag[])
        {
            throw aflag;
        }
        if (cy1 == cy2)
        {
            byte0 = 4;
        } else
        {
            byte0 = 5;
        }
        if (l - i < byte0 && !flag) goto _L2; else goto _L11
_L11:
        j1 = a(aflag, i, byte0);
        i += byte0;
        s = a(cy1, j1);
        if (!s.startsWith(z[0])) goto _L13; else goto _L12
_L12:
        cy1 = a(s.charAt(5));
        cy2 = cy1;
        cy3 = cy;
        if (s.charAt(6) != 'L') goto _L15; else goto _L14
_L14:
        if (!flag) goto _L17; else goto _L16
_L16:
        cy = cy1;
_L13:
        stringbuilder.append(s);
        cy3 = cy;
        cy2 = cy;
_L15:
        cy1 = cy2;
        cy = cy3;
        if (!flag) goto _L18; else goto _L2
_L2:
        return stringbuilder.toString();
_L17:
        cy3 = cy1;
        cy2 = cy1;
          goto _L15
_L10:
        cy1 = cy;
          goto _L18
        i = l;
          goto _L19
    }

    private boolean[] b(boolean aflag[])
    {
        int ai[];
        int i;
        int j;
        int k;
        int l1;
        int i2;
        boolean flag1;
        a6 a6_1;
        int l;
label0:
        {
            flag1 = e;
            if (a.b() <= 2)
            {
                i = 6;
                a6_1 = a6.f;
                if (!flag1)
                {
                    break label0;
                }
            }
            try
            {
                i = a.b();
            }
            // Misplaced declaration of an exception variable
            catch (boolean aflag[])
            {
                throw aflag;
            }
            if (i <= 8)
            {
                i = 8;
                a6_1 = a6.c;
                if (!flag1)
                {
                    break label0;
                }
            }
            try
            {
                i = a.b();
            }
            // Misplaced declaration of an exception variable
            catch (boolean aflag[])
            {
                throw aflag;
            }
            if (i <= 22)
            {
                i = 10;
                a6_1 = a6.j;
                if (!flag1)
                {
                    break label0;
                }
            }
            i = 12;
            a6_1 = a6.l;
        }
        l1 = a.a();
        l = aflag.length / i;
        if (l < l1)
        {
            try
            {
                throw gd.a();
            }
            // Misplaced declaration of an exception variable
            catch (boolean aflag[])
            {
                throw aflag;
            }
        }
        j = aflag.length % i;
        ai = new int[l];
        k = 0;
        do
        {
            if (k >= l)
            {
                break;
            }
            ai[k] = a(aflag, j, i);
            k++;
            j += i;
        } while (!flag1);
        try
        {
            (new gg(a6_1)).a(ai, l - l1);
        }
        // Misplaced declaration of an exception variable
        catch (boolean aflag[])
        {
            throw gd.a();
        }
        i2 = (1 << i) - 1;
        j = 0;
        l = 0;
label1:
        do
        {
label2:
            {
                k = j;
                if (l >= l1)
                {
                    break label1;
                }
                int j1 = ai[l];
                if (j1 == 0 || j1 == i2)
                {
                    try
                    {
                        throw gd.a();
                    }
                    // Misplaced declaration of an exception variable
                    catch (boolean aflag[])
                    {
                        throw aflag;
                    }
                }
                if (j1 != 1)
                {
                    k = j;
                    if (j1 != i2 - 1)
                    {
                        break label2;
                    }
                }
                k = j + 1;
            }
            l++;
            j = k;
        } while (!flag1);
        aflag = new boolean[l1 * i - k];
        j = 0;
        k = 0;
_L8:
        if (k >= l1) goto _L2; else goto _L1
_L1:
        int j2 = ai[k];
        if (j2 != 1 && j2 != i2 - 1) goto _L4; else goto _L3
_L3:
        int i1;
        int k1;
        boolean flag;
        if (j2 > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Arrays.fill(aflag, j, (j + i) - 1, flag);
        i1 = (i - 1) + j;
        j = i1;
        if (!flag1) goto _L6; else goto _L5
_L5:
        j = i1;
_L4:
        i1 = i - 1;
_L9:
        if (i1 >= 0)
        {
            k1 = j + 1;
            if ((1 << i1 & j2) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aflag[j] = flag;
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_459;
            }
            j = k1;
        }
_L6:
        if (!flag1) goto _L7; else goto _L2
_L2:
        return aflag;
_L7:
        k++;
          goto _L8
        i1--;
        j = k1;
          goto _L9
    }

    public fG a(ep ep1)
    {
        boolean flag = e;
        a = ep1;
        ep1 = a(b(a(ep1.b())));
        int i;
        try
        {
            ep1 = new fG(null, ep1, null, null);
            i = gh.a;
        }
        // Misplaced declaration of an exception variable
        catch (ep ep1)
        {
            try
            {
                throw ep1;
            }
            // Misplaced declaration of an exception variable
            catch (ep ep1)
            {
                throw ep1;
            }
        }
        if (i != 0)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            e = flag;
        }
        return ep1;
    }

    boolean[] a(d6 d6_1)
    {
        int k;
        int l;
        int i1;
        int k1;
        int i2;
label0:
        {
            boolean flag = e;
            boolean flag1 = a.c();
            i2 = a.b();
            int ai[];
            boolean aflag[];
            int i;
            int l1;
            int j2;
            int k2;
            int l2;
            if (flag1)
            {
                i = i2 * 4 + 11;
            } else
            {
                i = i2 * 4 + 14;
            }
            ai = new int[i];
            aflag = new boolean[a(i2, flag1)];
            if (flag1)
            {
                int j = 0;
                do
                {
                    if (j >= ai.length)
                    {
                        break;
                    }
                    ai[j] = j;
                    j++;
                    if (!flag)
                    {
                        continue;
                    }
                    gh.a++;
                    break;
                } while (true);
                if (!flag)
                {
                    break label0;
                }
            }
            k = (i / 2 - 1) / 15;
            l = i / 2;
            i1 = (i + 1 + k * 2) / 2;
            k = 0;
            do
            {
                if (k >= l)
                {
                    break;
                }
                int j1 = k / 15 + k;
                ai[l - k - 1] = i1 - j1 - 1;
                ai[l + k] = j1 + i1 + 1;
                k++;
            } while (!flag);
        }
        l = 0;
        k = 0;
_L4:
        if (k >= i2) goto _L2; else goto _L1
_L1:
        if (flag1)
        {
            i1 = (i2 - k) * 4 + 9;
        } else
        {
            i1 = (i2 - k) * 4 + 12;
        }
        j2 = k * 2;
        k2 = i - 1 - j2;
        k1 = 0;
_L5:
        if (k1 < i1)
        {
            l2 = k1 * 2;
            l1 = 0;
            do
            {
                if (l1 >= 2)
                {
                    break;
                }
                aflag[l + l2 + l1] = d6_1.b(ai[j2 + l1], ai[j2 + k1]);
                aflag[i1 * 2 + l + l2 + l1] = d6_1.b(ai[j2 + k1], ai[k2 - l1]);
                aflag[i1 * 4 + l + l2 + l1] = d6_1.b(ai[k2 - l1], ai[k2 - k1]);
                aflag[i1 * 6 + l + l2 + l1] = d6_1.b(ai[k2 - k1], ai[j2 + l1]);
                l1++;
            } while (!flag);
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_455;
            }
        }
        if (!flag) goto _L3; else goto _L2
_L2:
        return aflag;
_L3:
        l = i1 * 8 + l;
        k++;
          goto _L4
        k1++;
          goto _L5
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int i;
        as = new String[2];
        obj = "JW {9";
        byte0 = -1;
        as1 = as;
        i = 0;
_L10:
        int j;
        int k;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L7:
        if (k <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c1;
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "Kb\026\027\022ha\036R";
                i = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                as = new String[32];
                i = 0;
                as1 = as;
                obj = "JW {9YP";
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i] = ((String) (obj));
                as[1] = " ";
                as[2] = "A";
                as[3] = "B";
                as[4] = "C";
                as[5] = "D";
                as[6] = "E";
                as[7] = "F";
                as[8] = "G";
                as[9] = "H";
                as[10] = "I";
                as[11] = "J";
                as[12] = "K";
                as[13] = "L";
                as[14] = "M";
                as[15] = "N";
                as[16] = "O";
                as[17] = "P";
                as[18] = "Q";
                as[19] = "R";
                as[20] = "S";
                as[21] = "T";
                as[22] = "U";
                as[23] = "V";
                as[24] = "W";
                as[25] = "X";
                as[26] = "Y";
                as[27] = "Z";
                i = 28;
                as1 = as;
                obj = "JW {9EO";
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 29;
                as1 = as;
                obj = "JW {9DO";
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "JW {9MO";
                byte0 = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "JW {9KP";
                byte0 = 5;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i] = ((String) (obj));
                b = as;
                as = new String[32];
                obj = "JW {9YP";
                byte0 = 6;
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i] = ((String) (obj));
                as[1] = " ";
                as[2] = "a";
                as[3] = "b";
                as[4] = "c";
                as[5] = "d";
                as[6] = "e";
                as[7] = "f";
                as[8] = "g";
                as[9] = "h";
                as[10] = "i";
                as[11] = "j";
                as[12] = "k";
                as[13] = "l";
                as[14] = "m";
                as[15] = "n";
                as[16] = "o";
                as[17] = "p";
                as[18] = "q";
                as[19] = "r";
                as[20] = "s";
                as[21] = "t";
                as[22] = "u";
                as[23] = "v";
                as[24] = "w";
                as[25] = "x";
                as[26] = "y";
                as[27] = "z";
                i = 28;
                obj = "JW {9\\P";
                byte0 = 7;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "JW {9DO";
                byte0 = 8;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 30;
                as1 = as;
                obj = "JW {9MO";
                byte0 = 9;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "JW {9KP";
                byte0 = 10;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i] = ((String) (obj));
                d = as;
                as = new String[32];
                obj = "JW {9YP";
                byte0 = 11;
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i] = ((String) (obj));
                as[1] = " ";
                as[2] = "\001";
                as[3] = "\002";
                as[4] = "\003";
                as[5] = "\004";
                as[6] = "\005";
                as[7] = "\006";
                as[8] = "\007";
                as[9] = "\b";
                as[10] = "\t";
                as[11] = "\n";
                as[12] = "\013";
                as[13] = "\f";
                as[14] = "\r";
                as[15] = "\033";
                as[16] = "\034";
                as[17] = "\035";
                as[18] = "\036";
                as[19] = "\037";
                as[20] = "@";
                as[21] = "\\";
                as[22] = "^";
                as[23] = "_";
                as[24] = "`";
                as[25] = "|";
                as[26] = "~";
                as[27] = "\177";
                i = 28;
                obj = "JW {9EO";
                byte0 = 12;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "JW {9\\O";
                byte0 = 13;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "JW {9YO";
                byte0 = 14;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "JW {9KP";
                byte0 = 15;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[i] = ((String) (obj));
                f = as;
                as = new String[32];
                as[0] = "";
                as[1] = "\r";
                obj = "\004\t";
                byte0 = 16;
                as1 = as;
                i = 2;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[i] = ((String) (obj));
                obj = "'#";
                byte0 = 17;
                i = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "%#";
                byte0 = 18;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "3#";
                byte0 = 19;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 19: // '\023'
                as1[i] = ((String) (obj));
                as[6] = "!";
                as[7] = "\"";
                as[8] = "#";
                as[9] = "$";
                as[10] = "%";
                as[11] = "&";
                as[12] = "'";
                as[13] = "(";
                as[14] = ")";
                as[15] = "*";
                as[16] = "+";
                as[17] = ",";
                as[18] = "-";
                as[19] = ".";
                as[20] = "/";
                as[21] = ":";
                as[22] = ";";
                as[23] = "<";
                as[24] = "=";
                as[25] = ">";
                as[26] = "?";
                as[27] = "[";
                as[28] = "]";
                as[29] = "{";
                as[30] = "}";
                i = 31;
                obj = "JW {9\\O";
                byte0 = 20;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 20: // '\024'
                as1[i] = ((String) (obj));
                c = as;
                as = new String[16];
                obj = "JW {9YP";
                byte0 = 21;
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 21: // '\025'
                as1[i] = ((String) (obj));
                as[1] = " ";
                as[2] = "0";
                as[3] = "1";
                as[4] = "2";
                as[5] = "3";
                as[6] = "4";
                as[7] = "5";
                as[8] = "6";
                as[9] = "7";
                as[10] = "8";
                as[11] = "9";
                as[12] = ",";
                as[13] = ".";
                i = 14;
                obj = "JW {9\\O";
                byte0 = 22;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "JW {9\\P";
                byte0 = 23;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 23: // '\027'
                as1[i] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 244
    //                   0 267
    //                   1 274
    //                   2 280
    //                   3 287;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_287;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 102;
_L8:
        obj[j] = (char)(byte1 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 9;
          goto _L8
_L3:
        byte1 = 3;
          goto _L8
_L4:
        byte1 = 114;
          goto _L8
        byte1 = 55;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        g = as;
    }
}
