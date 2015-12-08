// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.aztec.a;
import com.google.zxing.common.b;
import com.google.zxing.common.d;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.c;
import java.util.Arrays;

// Referenced classes of package com.google.zxing.aztec.decoder:
//            a

public final class Decoder
{

    private static final String a[] = {
        "CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", 
        "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
        "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", 
        "CTRL_DL", "CTRL_BS"
    };
    private static final String b[] = {
        "CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", 
        "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", 
        "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", 
        "CTRL_DL", "CTRL_BS"
    };
    private static final String c[] = {
        "CTRL_PS", " ", "\001", "\002", "\003", "\004", "\005", "\006", "\007", "\b", 
        "\t", "\n", "\013", "\f", "\r", "\033", "\034", "\035", "\036", "\037", 
        "@", "\\", "^", "_", "`", "|", "~", "\177", "CTRL_LL", "CTRL_UL", 
        "CTRL_PL", "CTRL_BS"
    };
    private static final String d[] = {
        "", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", 
        "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", 
        "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", 
        "}", "CTRL_UL"
    };
    private static final String e[] = {
        "CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", 
        "8", "9", ",", ".", "CTRL_UL", "CTRL_US"
    };
    private a f;

    public Decoder()
    {
    }

    private static int a(boolean aflag[], int i, int j)
    {
        int k = 0;
        for (int l = i; l < i + j; l++)
        {
            int i1 = k << 1;
            k = i1;
            if (aflag[l])
            {
                k = i1 + 1;
            }
        }

        return k;
    }

    private boolean[] a(boolean aflag[])
    {
        byte byte0 = 8;
        com.google.zxing.common.reedsolomon.a a1;
        int ai[];
        int i;
        int l;
        int k1;
        if (f.a() <= 2)
        {
            byte0 = 6;
            a1 = com.google.zxing.common.reedsolomon.a.c;
        } else
        if (f.a() <= 8)
        {
            a1 = com.google.zxing.common.reedsolomon.a.g;
        } else
        if (f.a() <= 22)
        {
            byte0 = 10;
            a1 = com.google.zxing.common.reedsolomon.a.b;
        } else
        {
            byte0 = 12;
            a1 = com.google.zxing.common.reedsolomon.a.a;
        }
        k1 = f.b();
        l = aflag.length / byte0;
        i = aflag.length;
        ai = new int[l];
        i %= byte0;
        for (int j = 0; j < l;)
        {
            ai[j] = a(aflag, i, byte0);
            j++;
            i += byte0;
        }

        int k;
        int l1;
        try
        {
            (new c(a1)).a(ai, l - k1);
        }
        // Misplaced declaration of an exception variable
        catch (boolean aflag[])
        {
            throw FormatException.getFormatInstance();
        }
        l1 = (1 << byte0) - 1;
        i = 0;
        int i1;
        for (k = 0; i < k1; k = i1)
        {
label0:
            {
                int i2 = ai[i];
                if (i2 == 0 || i2 == l1)
                {
                    throw FormatException.getFormatInstance();
                }
                if (i2 != 1)
                {
                    i1 = k;
                    if (i2 != l1 - 1)
                    {
                        break label0;
                    }
                }
                i1 = k + 1;
            }
            i++;
        }

        aflag = new boolean[k1 * byte0 - k];
        i = 0;
        k = 0;
        while (k < k1) 
        {
            int j2 = ai[k];
            if (j2 == 1 || j2 == l1 - 1)
            {
                boolean flag;
                if (j2 > 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Arrays.fill(aflag, i, (i + byte0) - 1, flag);
                i = (byte0 - 1) + i;
            } else
            {
                int j1 = byte0 - 1;
                while (j1 >= 0) 
                {
                    boolean flag1;
                    if ((1 << j1 & j2) != 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    aflag[i] = flag1;
                    j1--;
                    i++;
                }
            }
            k++;
        }
        return aflag;
    }

    public final d a(a a1)
    {
        Object obj1;
        boolean aflag1[];
        StringBuilder stringbuilder;
        int i;
        int i3;
        f = a1;
        a1 = a1.d();
        boolean flag = f.c();
        int j4 = f.a();
        int ai[];
        boolean aflag[];
        int j;
        if (flag)
        {
            i = j4 * 4 + 11;
        } else
        {
            i = j4 * 4 + 14;
        }
        ai = new int[i];
        if (flag)
        {
            j = 88;
        } else
        {
            j = 112;
        }
        aflag = new boolean[(j + j4 * 16) * j4];
        if (flag)
        {
            for (j = 0; j < ai.length; j++)
            {
                ai[j] = j;
            }

        } else
        {
            int k = (i / 2 - 1) / 15;
            int k1 = i / 2;
            int k2 = (i + 1 + k * 2) / 2;
            for (int l = 0; l < k1; l++)
            {
                int j3 = l / 15 + l;
                ai[k1 - l - 1] = k2 - j3 - 1;
                ai[k1 + l] = j3 + k2 + 1;
            }

        }
        int l1 = 0;
        for (int i1 = 0; i1 < j4; i1++)
        {
            int l2;
            int k4;
            int l4;
            if (flag)
            {
                l2 = (j4 - i1) * 4 + 9;
            } else
            {
                l2 = (j4 - i1) * 4 + 12;
            }
            k4 = i1 * 2;
            l4 = i - 1 - k4;
            for (int k3 = 0; k3 < l2; k3++)
            {
                int i5 = k3 * 2;
                for (int i4 = 0; i4 < 2; i4++)
                {
                    aflag[l1 + i5 + i4] = a1.a(ai[k4 + i4], ai[k4 + k3]);
                    aflag[l2 * 2 + l1 + i5 + i4] = a1.a(ai[k4 + k3], ai[l4 - i4]);
                    aflag[l2 * 4 + l1 + i5 + i4] = a1.a(ai[l4 - i4], ai[l4 - k3]);
                    aflag[l2 * 6 + l1 + i5 + i4] = a1.a(ai[l4 - k3], ai[k4 + i4]);
                }

            }

            l1 = l2 * 8 + l1;
        }

        aflag1 = a(aflag);
        i3 = aflag1.length;
        obj1 = Table.UPPER;
        a1 = Table.UPPER;
        stringbuilder = new StringBuilder(20);
        i = 0;
_L19:
        int j2;
        if (i >= i3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a1 == Table.BINARY)
        {
            if (i3 - i < 5)
            {
                break; /* Loop/switch isn't completed */
            }
            int i2 = a(aflag1, i, 5);
            int l3 = i + 5;
            int j1 = i2;
            i = l3;
            if (i2 == 0)
            {
                if (i3 - l3 < 11)
                {
                    break; /* Loop/switch isn't completed */
                }
                j1 = a(aflag1, l3, 11) + 31;
                i = l3 + 11;
            }
            i2 = 0;
            do
            {
label0:
                {
                    if (i2 < j1)
                    {
                        if (i3 - i >= 8)
                        {
                            break label0;
                        }
                        i = i3;
                    }
                    a1 = ((a) (obj1));
                    continue; /* Loop/switch isn't completed */
                }
                stringbuilder.append((char)a(aflag1, i, 8));
                i2++;
                i += 8;
            } while (true);
        }
        byte byte0;
        if (a1 == Table.DIGIT)
        {
            byte0 = 4;
        } else
        {
            byte0 = 5;
        }
        if (i3 - i < byte0)
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = a(aflag1, i, byte0);
        i += byte0;
        com.google.zxing.aztec.decoder.a.a[a1.ordinal()];
        JVM INSTR tableswitch 1 5: default 716
    //                   1 733
    //                   2 831
    //                   3 841
    //                   4 851
    //                   5 861;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalStateException("Bad table");
_L2:
        Object obj = a[j2];
_L16:
        if (!((String) (obj)).startsWith("CTRL_")) goto _L8; else goto _L7
_L7:
        ((String) (obj)).charAt(5);
        JVM INSTR lookupswitch 5: default 804
    //                   66: 899
    //                   68: 892
    //                   76: 871
    //                   77: 885
    //                   80: 878;
           goto _L9 _L10 _L11 _L12 _L13 _L14
_L9:
        a1 = Table.UPPER;
_L17:
        Object obj2;
        obj2 = a1;
        if (((String) (obj)).charAt(6) == 'L')
        {
            obj = a1;
            obj1 = a1;
            a1 = ((a) (obj));
            continue; /* Loop/switch isn't completed */
        }
          goto _L15
_L3:
        obj = b[j2];
          goto _L16
_L4:
        obj = c[j2];
          goto _L16
_L5:
        obj = d[j2];
          goto _L16
_L6:
        obj = e[j2];
          goto _L16
_L12:
        a1 = Table.LOWER;
          goto _L17
_L14:
        a1 = Table.PUNCT;
          goto _L17
_L13:
        a1 = Table.MIXED;
          goto _L17
_L11:
        a1 = Table.DIGIT;
          goto _L17
_L10:
        a1 = Table.BINARY;
          goto _L17
_L8:
        stringbuilder.append(((String) (obj)));
        obj2 = obj1;
_L15:
        a1 = ((a) (obj2));
        if (true) goto _L19; else goto _L18
_L18:
        return new d(null, stringbuilder.toString(), null, null);
    }


    private class Table extends Enum
    {

        private static final Table $VALUES[];
        public static final Table BINARY;
        public static final Table DIGIT;
        public static final Table LOWER;
        public static final Table MIXED;
        public static final Table PUNCT;
        public static final Table UPPER;

        public static Table valueOf(String s)
        {
            return (Table)Enum.valueOf(com/google/zxing/aztec/decoder/Decoder$Table, s);
        }

        public static Table[] values()
        {
            return (Table[])$VALUES.clone();
        }

        static 
        {
            UPPER = new Table("UPPER", 0);
            LOWER = new Table("LOWER", 1);
            MIXED = new Table("MIXED", 2);
            DIGIT = new Table("DIGIT", 3);
            PUNCT = new Table("PUNCT", 4);
            BINARY = new Table("BINARY", 5);
            $VALUES = (new Table[] {
                UPPER, LOWER, MIXED, DIGIT, PUNCT, BINARY
            });
        }

        private Table(String s, int i)
        {
            super(s, i);
        }
    }

}
