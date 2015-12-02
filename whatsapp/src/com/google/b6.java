// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.text.DecimalFormat;
import java.text.NumberFormat;

// Referenced classes of package com.google:
//            bA, fG

final class b6
{

    private static final NumberFormat a;
    private static final String b[];
    private static final NumberFormat c;
    private static final String z[];

    private static int a(int i, byte abyte0[])
    {
        boolean flag = true;
        int j = i - 1;
        byte byte0;
        try
        {
            byte0 = abyte0[j / 6];
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        i = ((flag) ? 1 : 0);
        if ((1 << 5 - j % 6 & byte0) == 0)
        {
            i = 0;
        }
        return i;
    }

    private static int a(byte abyte0[], byte abyte1[])
    {
        int j = 0;
        int l = bA.a;
        try
        {
            if (abyte1.length == 0)
            {
                throw new IllegalArgumentException();
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        int i = 0;
        int k;
        do
        {
            k = i;
            if (j >= abyte1.length)
            {
                break;
            }
            k = i + (a(abyte1[j], abyte0) << abyte1.length - j - 1);
            j++;
            i = k;
        } while (l == 0);
        return k;
    }

    static fG a(byte abyte0[], int i)
    {
        StringBuilder stringbuilder;
        int j;
        j = bA.a;
        stringbuilder = new StringBuilder(144);
        i;
        JVM INSTR tableswitch 2 5: default 48
    //                   2 66
    //                   3 66
    //                   4 273
    //                   5 290;
           goto _L1 _L2 _L2 _L3 _L4
_L1:
        return new fG(abyte0, stringbuilder.toString(), null, String.valueOf(i));
_L2:
        if (i != 2) goto _L6; else goto _L5
_L5:
        String s;
        int k = e(abyte0);
        s = (new DecimalFormat(z[1].substring(0, d(abyte0)))).format(k);
        if (j == 0) goto _L7; else goto _L6
_L6:
        s = a(abyte0);
_L7:
        String s1;
        String s2;
        s1 = c.format(c(abyte0));
        s2 = c.format(b(abyte0));
        boolean flag;
        stringbuilder.append(a(abyte0, 10, 84));
        flag = stringbuilder.toString().startsWith(z[0]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        stringbuilder.insert(9, (new StringBuilder()).append(s).append('\035').append(s1).append('\035').append(s2).append('\035').toString());
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        stringbuilder.insert(0, (new StringBuilder()).append(s).append('\035').append(s1).append('\035').append(s2).append('\035').toString());
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        try
        {
            stringbuilder.append(a(abyte0, 1, 93));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        stringbuilder.append(a(abyte0, 1, 77));
        if (true) goto _L1; else goto _L8
_L8:
        abyte0;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        throw abyte0;
    }

    private static String a(byte abyte0[])
    {
        return String.valueOf(new char[] {
            b[0].charAt(a(abyte0, new byte[] {
                39, 40, 41, 42, 31, 32
            })), b[0].charAt(a(abyte0, new byte[] {
                33, 34, 35, 36, 25, 26
            })), b[0].charAt(a(abyte0, new byte[] {
                27, 28, 29, 30, 19, 20
            })), b[0].charAt(a(abyte0, new byte[] {
                21, 22, 23, 24, 13, 14
            })), b[0].charAt(a(abyte0, new byte[] {
                15, 16, 17, 18, 7, 8
            })), b[0].charAt(a(abyte0, new byte[] {
                9, 10, 11, 12, 1, 2
            }))
        });
    }

    private static String a(byte abyte0[], int i, int j)
    {
        StringBuilder stringbuilder;
        int k;
        int i1;
        int j1;
        int k1;
        int j4;
        j4 = bA.a;
        stringbuilder = new StringBuilder();
        j1 = -1;
        k = 0;
        i1 = 0;
        k1 = i;
_L15:
        if (k1 >= i + j) goto _L2; else goto _L1
_L1:
        char c1;
        int l;
        int l1;
        int i2;
        int j2;
        byte byte0;
        int k2;
        byte byte1;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        c1 = b[k].charAt(abyte0[k1]);
        k2 = i1;
        l2 = k;
        byte1 = j1;
        i3 = k1;
        j3 = k;
        k3 = k;
        l3 = k;
        i2 = i1;
        l1 = k;
        byte0 = j1;
        i4 = i1;
        j2 = k;
        l = k1;
        c1;
        JVM INSTR tableswitch 65520 65531: default 164
    //                   65520 312
    //                   65521 312
    //                   65522 312
    //                   65523 312
    //                   65524 312
    //                   65525 338
    //                   65526 360
    //                   65527 271
    //                   65528 290
    //                   65529 522
    //                   65530 180
    //                   65531 390;
           goto _L3 _L4 _L4 _L4 _L4 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        i3 = k1;
        byte1 = j1;
        l2 = k;
        k2 = i1;
_L10:
        try
        {
            stringbuilder.append(c1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        i1 = l2;
        k = k2;
        j2 = i3;
        l = byte1;
_L16:
        if (l == 0)
        {
            i1 = k;
        }
        k1 = j2 + 1;
        if (j4 == 0) goto _L12; else goto _L2
_L2:
        do
        {
            if (stringbuilder.length() <= 0)
            {
                break;
            }
            try
            {
                if (stringbuilder.charAt(stringbuilder.length() - 1) != '\uFFFC')
                {
                    break;
                }
                stringbuilder.setLength(stringbuilder.length() - 1);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        } while (j4 == 0);
        return stringbuilder.toString();
_L7:
        k = 0;
        l = -1;
        j1 = i1;
        j2 = k1;
        if (j4 == 0)
        {
            break MISSING_BLOCK_LABEL_594;
        }
_L8:
        k = 1;
        j3 = 1;
        l = -1;
        j1 = i1;
        j2 = k1;
        if (j4 == 0)
        {
            break MISSING_BLOCK_LABEL_594;
        }
_L4:
        j1 = j3;
        k3 = c1 - 65520;
        l = 1;
        k = k3;
        j2 = k1;
        if (j4 == 0)
        {
            break MISSING_BLOCK_LABEL_594;
        }
_L5:
        j1 = k3;
        k = 0;
        l3 = 0;
        l = 2;
        j2 = k1;
        if (j4 == 0)
        {
            break MISSING_BLOCK_LABEL_594;
        }
_L6:
        i2 = l3;
        k = 0;
        l1 = 0;
        byte0 = 3;
        j1 = i2;
        l = byte0;
        j2 = k1;
        if (j4 == 0)
        {
            break MISSING_BLOCK_LABEL_594;
        }
_L11:
        l = k1 + 1;
        k = abyte0[l];
        i1 = l + 1;
        l = abyte0[i1];
        i1++;
        j1 = abyte0[i1];
        i1++;
        k1 = abyte0[i1];
        i1++;
        j2 = abyte0[i1];
        stringbuilder.append(a.format((k << 24) + (l << 18) + (j1 << 12) + (k1 << 6) + j2));
        j1 = i2;
        k = l1;
        l = byte0;
        j2 = i1;
        if (j4 == 0)
        {
            break MISSING_BLOCK_LABEL_594;
        }
        l = i1;
        j2 = l1;
        i4 = i2;
_L9:
        k = i4;
        if (j4 == 0) goto _L14; else goto _L13
_L13:
        byte1 = -1;
        k2 = k;
        l2 = j2;
        i3 = l;
          goto _L10
_L12:
        j1 = l - 1;
        l = i1;
        i1 = k;
        k = l;
          goto _L15
_L14:
        i1 = j2;
        j1 = -1;
        j2 = l;
        l = j1;
          goto _L16
        i1 = k;
        k = j1;
          goto _L16
    }

    private static int b(byte abyte0[])
    {
        return a(abyte0, new byte[] {
            55, 56, 57, 58, 59, 60, 49, 50, 51, 52
        });
    }

    private static int c(byte abyte0[])
    {
        return a(abyte0, new byte[] {
            53, 54, 43, 44, 45, 46, 47, 48, 37, 38
        });
    }

    private static int d(byte abyte0[])
    {
        return a(abyte0, new byte[] {
            39, 40, 41, 42, 31, 32
        });
    }

    private static int e(byte abyte0[])
    {
        return a(abyte0, new byte[] {
            33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 
            19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 
            17, 18, 7, 8, 9, 10, 11, 12, 1, 2
        });
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int i;
        as = new String[4];
        obj = "~m\016\177L\024Y";
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
                obj = "\025t\000QL\025t\000QL";
                i = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\025t\0";
                i = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\025t\000QL\025t\000Q";
                i = 3;
                as1 = as;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                a = new DecimalFormat(z[3]);
                c = new DecimalFormat(z[2]);
                as = new String[6];
                i = 0;
                as1 = as;
                obj = "/\005r\"8`\002w)5o\017|,2j\024a3/q\021f6$|\036\uFFCA}a;\uFFBF\020\uFF9D^\006`\025G[\rm\032JP\bj\037QM\027w\004TJ\022|\t[\uFF8D\uFFD7\uFFB7\uFFC4\uFF99";
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i] = ((String) (obj));
                obj = "E%R\002\030@\"W\t\025O/\\\f\022J4A\023\017Q1F\026\004\\>\uFFCA}a;\uFFBFK\uFF9D\001[;\013]A\033{k=!{\033\020MR\n~p@\000\uFFD9\uFFB1\uFFC6\uFF9D\uFF8C\uFFD7\uFFB7\uFFC4\uFF96";
                i = 1;
                as1 = as;
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i] = ((String) (obj));
                obj = "\345\205\362\242\270\340\202\367\251\265\357\217\374\254\262\352\224\341\263\257\361\221\346\266\244\374\236\uFFCA}a;\237\354\274\242\372\356\234\320\316\226\361\211\333\300\230\372\260\340\376\246\300\265\347\373\255\315\uFFC7A\uFF85\uFFD6\uFFB0\uFFC8";
                byte0 = 5;
                i = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i] = ((String) (obj));
                obj = "\305\245\322\202\230\300\242\327\211\225\317\257\334\214\222\312\264\301\223\217\321\261\306\226\204\334\276\uFFCA}a;\uFFBF\313\235\201\333\273\221\311\327\212\364\204\326\304\236\373\272\352\360\250\312\277\361\355\267\327\244\uFF96\\\uFFD7\uFFBD\uFFC4\uFF99";
                byte0 = 6;
                i = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i] = ((String) (obj));
                obj = "%E2bx B7iu/O<lr*T!so1Q&vd<^\uFFCA\uFF9D\uFF80>\uFFBF,|b:\333\220\303\337\201\341\226\306\325\210\352\206\364\352\262\334\251\373\347\271\331\256\uFF96\\\uFFD7\uFFB7\uFFC9\uFF99";
                byte0 = 7;
                i = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "%E2bx B7iu/O<lr*T!so1Q&vd<^+}a;[\020@^\006`\025G[\rm\032JP\bj\037QM\027w\004TJ\022|\t[G\031y\016^";
                byte0 = 8;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 248
    //                   0 271
    //                   1 278
    //                   2 285
    //                   3 292;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_292;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 124;
_L8:
        obj[j] = (char)(byte1 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 37;
          goto _L8
_L3:
        byte1 = 68;
          goto _L8
_L4:
        byte1 = 48;
          goto _L8
        byte1 = 97;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        b = as;
    }
}
