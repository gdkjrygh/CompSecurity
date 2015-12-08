// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.d;
import com.google.zxing.pdf417.c;
import java.math.BigInteger;
import java.util.Arrays;

// Referenced classes of package com.google.zxing.pdf417.decoder:
//            e

final class DecodedBitStreamParser
{

    private static final char a[] = {
        ';', '<', '>', '@', '[', '\\', '}', '_', '`', '~', 
        '!', '\r', '\t', ',', ':', '\n', '-', '.', '$', '/', 
        '"', '|', '*', '(', ')', '?', '{', '}', '\''
    };
    private static final char b[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '&', '\r', '\t', ',', ':', '#', '-', '.', '$', '/', 
        '+', '%', '*', '=', '^'
    };
    private static final BigInteger c[];

    private static int a(int i, int ai[], int j, StringBuilder stringbuilder)
    {
label0:
        {
            {
                if (i != 901)
                {
                    break label0;
                }
                boolean flag1 = false;
                long l1 = 0L;
                char ac[] = new char[6];
                int ai1[] = new int[6];
                boolean flag = false;
                i = j + 1;
                int l = ai[j];
                j = ((flag1) ? 1 : 0);
                while (i < ai[0] && !flag) 
                {
                    int i1 = j + 1;
                    ai1[j] = l;
                    l1 = l1 * 900L + (long)l;
                    j = i + 1;
                    l = ai[i];
                    int k;
                    int j1;
                    long l2;
                    if (l == 900 || l == 901 || l == 902 || l == 924 || l == 928 || l == 923 || l == 922)
                    {
                        i = j - 1;
                        flag = true;
                        j = i1;
                    } else
                    if (i1 % 5 == 0 && i1 > 0)
                    {
                        for (i = 0; i < 6;)
                        {
                            ac[5 - i] = (char)(int)(l1 % 256L);
                            i++;
                            l1 >>= 8;
                        }

                        stringbuilder.append(ac);
                        i1 = 0;
                        i = j;
                        j = i1;
                    } else
                    {
                        i = j;
                        j = i1;
                    }
                }
                k = j;
                if (i == ai[0])
                {
                    k = j;
                    if (l < 900)
                    {
                        ai1[j] = l;
                        k = j + 1;
                    }
                }
                for (j = 0; j < k; j++)
                {
                    stringbuilder.append((char)ai1[j]);
                }

                l = i;
            }
            return l;
        }
        l = j;
        if (i != 924)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        i = 0;
        l1 = 0L;
        i1 = 0;
        k = j;
        j = i;
        do
        {
            l = k;
            if (k >= ai[0])
            {
                break MISSING_BLOCK_LABEL_279;
            }
            l = k;
            if (i1 != 0)
            {
                break MISSING_BLOCK_LABEL_279;
            }
            i = k + 1;
            k = ai[k];
            if (k < 900)
            {
                j1 = j + 1;
                l2 = l1 * 900L + (long)k;
                l = i1;
            } else
            if (k == 900 || k == 901 || k == 902 || k == 924 || k == 928 || k == 923 || k == 922)
            {
                i--;
                l = 1;
                l2 = l1;
                j1 = j;
            } else
            {
                l2 = l1;
                l = i1;
                j1 = j;
            }
            l1 = l2;
            i1 = l;
            j = j1;
            k = i;
            if (j1 % 5 == 0)
            {
                l1 = l2;
                i1 = l;
                j = j1;
                k = i;
                if (j1 > 0)
                {
                    ac = new char[6];
                    j = 0;
                    for (l1 = l2; j < 6; l1 >>= 8)
                    {
                        ac[5 - j] = (char)(int)(255L & l1);
                        j++;
                    }

                    stringbuilder.append(ac);
                    j = 0;
                    i1 = l;
                    k = i;
                }
            }
        } while (true);
    }

    private static int a(int ai[], int i, c c1)
    {
        if (i + 2 > ai[0])
        {
            throw FormatException.getFormatInstance();
        }
        int ai1[] = new int[2];
        for (int j = 0; j < 2;)
        {
            ai1[j] = ai[i];
            j++;
            i++;
        }

        c1.a(Integer.parseInt(a(ai1, 2)));
        StringBuilder stringbuilder = new StringBuilder();
        int k = a(ai, i, stringbuilder);
        c1.a(stringbuilder.toString());
        if (ai[k] == 923)
        {
            i = k + 1;
            int ai2[] = new int[ai[0] - i];
            k = 0;
            for (boolean flag = false; i < ai[0] && !flag;)
            {
                int l = i + 1;
                i = ai[i];
                if (i < 900)
                {
                    ai2[k] = i;
                    k++;
                    i = l;
                } else
                {
                    switch (i)
                    {
                    default:
                        throw FormatException.getFormatInstance();

                    case 922: 
                        c1.a(true);
                        break;
                    }
                    i = l + 1;
                    flag = true;
                }
            }

            c1.a(Arrays.copyOf(ai2, k));
        } else
        {
            i = k;
            if (ai[k] == 922)
            {
                c1.a(true);
                return k + 1;
            }
        }
        return i;
    }

    private static int a(int ai[], int i, StringBuilder stringbuilder)
    {
        int ai1[];
        int ai2[];
        int k;
        ai1 = new int[ai[0] - i << 1];
        ai2 = new int[ai[0] - i << 1];
        k = 0;
_L13:
        Mode mode;
        int j;
        for (boolean flag1 = false; i < ai[0] && !flag1;)
        {
            int l = i + 1;
            i = ai[i];
            if (i < 900)
            {
                ai1[k] = i / 30;
                ai1[k + 1] = i % 30;
                k += 2;
                i = l;
            } else
            {
                switch (i)
                {
                default:
                    i = l;
                    break;

                case 900: 
                    ai1[k] = 900;
                    k++;
                    i = l;
                    break;

                case 901: 
                    i = l - 1;
                    flag1 = true;
                    break;

                case 902: 
                    i = l - 1;
                    flag1 = true;
                    break;

                case 928: 
                    i = l - 1;
                    flag1 = true;
                    break;

                case 923: 
                    i = l - 1;
                    flag1 = true;
                    break;

                case 922: 
                    i = l - 1;
                    flag1 = true;
                    break;

                case 913: 
                    ai1[k] = 913;
                    i = l + 1;
                    ai2[k] = ai[l];
                    k++;
                    break;

                case 924: 
                    i = l - 1;
                    flag1 = true;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
        }

        ai = Mode.ALPHA;
        mode = Mode.ALPHA;
        j = 0;
_L10:
        if (j >= k) goto _L2; else goto _L1
_L1:
        boolean flag;
        int i1;
        i1 = ai1[j];
        flag = false;
        e.a[ai.ordinal()];
        JVM INSTR tableswitch 1 6: default 364
    //                   1 394
    //                   2 556
    //                   3 721
    //                   4 904
    //                   5 1004
    //                   6 1070;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        char c1;
        Object obj;
        obj = mode;
        c1 = flag;
_L11:
        if (c1 != 0)
        {
            stringbuilder.append(c1);
        }
        j++;
        mode = ((Mode) (obj));
          goto _L10
_L4:
        if (i1 < 26)
        {
            c1 = (char)(i1 + 65);
            obj = mode;
        } else
        if (i1 == 26)
        {
            c1 = ' ';
            obj = mode;
        } else
        if (i1 == 27)
        {
            ai = Mode.LOWER;
            c1 = flag;
            obj = mode;
        } else
        if (i1 == 28)
        {
            ai = Mode.MIXED;
            c1 = flag;
            obj = mode;
        } else
        if (i1 == 29)
        {
            mode = Mode.PUNCT_SHIFT;
            c1 = flag;
            obj = ai;
            ai = mode;
        } else
        if (i1 == 913)
        {
            stringbuilder.append((char)ai2[j]);
            c1 = flag;
            obj = mode;
        } else
        {
            c1 = flag;
            obj = mode;
            if (i1 == 900)
            {
                ai = Mode.ALPHA;
                c1 = flag;
                obj = mode;
            }
        }
          goto _L11
_L5:
        if (i1 < 26)
        {
            c1 = (char)(i1 + 97);
            obj = mode;
        } else
        if (i1 == 26)
        {
            c1 = ' ';
            obj = mode;
        } else
        if (i1 == 27)
        {
            mode = Mode.ALPHA_SHIFT;
            c1 = flag;
            obj = ai;
            ai = mode;
        } else
        if (i1 == 28)
        {
            ai = Mode.MIXED;
            c1 = flag;
            obj = mode;
        } else
        if (i1 == 29)
        {
            mode = Mode.PUNCT_SHIFT;
            c1 = flag;
            obj = ai;
            ai = mode;
        } else
        if (i1 == 913)
        {
            stringbuilder.append((char)ai2[j]);
            c1 = flag;
            obj = mode;
        } else
        {
            c1 = flag;
            obj = mode;
            if (i1 == 900)
            {
                ai = Mode.ALPHA;
                c1 = flag;
                obj = mode;
            }
        }
          goto _L11
_L6:
        if (i1 < 25)
        {
            c1 = b[i1];
            obj = mode;
        } else
        if (i1 == 25)
        {
            ai = Mode.PUNCT;
            c1 = flag;
            obj = mode;
        } else
        if (i1 == 26)
        {
            c1 = ' ';
            obj = mode;
        } else
        if (i1 == 27)
        {
            ai = Mode.LOWER;
            c1 = flag;
            obj = mode;
        } else
        if (i1 == 28)
        {
            ai = Mode.ALPHA;
            c1 = flag;
            obj = mode;
        } else
        if (i1 == 29)
        {
            mode = Mode.PUNCT_SHIFT;
            c1 = flag;
            obj = ai;
            ai = mode;
        } else
        if (i1 == 913)
        {
            stringbuilder.append((char)ai2[j]);
            c1 = flag;
            obj = mode;
        } else
        {
            c1 = flag;
            obj = mode;
            if (i1 == 900)
            {
                ai = Mode.ALPHA;
                c1 = flag;
                obj = mode;
            }
        }
          goto _L11
_L7:
        if (i1 < 29)
        {
            c1 = a[i1];
            obj = mode;
        } else
        if (i1 == 29)
        {
            ai = Mode.ALPHA;
            c1 = flag;
            obj = mode;
        } else
        if (i1 == 913)
        {
            stringbuilder.append((char)ai2[j]);
            c1 = flag;
            obj = mode;
        } else
        {
            c1 = flag;
            obj = mode;
            if (i1 == 900)
            {
                ai = Mode.ALPHA;
                c1 = flag;
                obj = mode;
            }
        }
          goto _L11
_L8:
        if (i1 < 26)
        {
            c1 = (char)(i1 + 65);
            ai = mode;
            obj = mode;
        } else
        if (i1 == 26)
        {
            c1 = ' ';
            ai = mode;
            obj = mode;
        } else
        {
            if (i1 != 900)
            {
                break MISSING_BLOCK_LABEL_1171;
            }
            ai = Mode.ALPHA;
            c1 = flag;
            obj = mode;
        }
          goto _L11
_L9:
        if (i1 < 29)
        {
            c1 = a[i1];
            ai = mode;
            obj = mode;
        } else
        if (i1 == 29)
        {
            ai = Mode.ALPHA;
            c1 = flag;
            obj = mode;
        } else
        if (i1 == 913)
        {
            stringbuilder.append((char)ai2[j]);
            ai = mode;
            c1 = flag;
            obj = mode;
        } else
        {
            if (i1 != 900)
            {
                break MISSING_BLOCK_LABEL_1171;
            }
            ai = Mode.ALPHA;
            c1 = flag;
            obj = mode;
        }
          goto _L11
_L2:
        return i;
        ai = mode;
        c1 = flag;
        obj = mode;
          goto _L11
        if (true) goto _L13; else goto _L12
_L12:
    }

    static d a(int ai[], String s)
    {
        c c1;
        StringBuilder stringbuilder;
        int i;
        int j;
        stringbuilder = new StringBuilder(ai.length * 2);
        j = 2;
        i = ai[1];
        c1 = new c();
_L9:
        if (j >= ai[0])
        {
            break MISSING_BLOCK_LABEL_231;
        }
        i;
        JVM INSTR lookupswitch 8: default 112
    //                   900: 145
    //                   901: 157
    //                   902: 171
    //                   913: 183
    //                   922: 223
    //                   923: 223
    //                   924: 197
    //                   928: 211;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L6 _L7 _L8
_L1:
        i = a(ai, j - 1, stringbuilder);
_L10:
        if (i < ai.length)
        {
            j = i + 1;
            i = ai[i];
        } else
        {
            throw FormatException.getFormatInstance();
        }
        if (true) goto _L9; else goto _L2
_L2:
        i = a(ai, j, stringbuilder);
          goto _L10
_L3:
        i = a(i, ai, j, stringbuilder);
          goto _L10
_L4:
        i = b(ai, j, stringbuilder);
          goto _L10
_L5:
        i = a(i, ai, j, stringbuilder);
          goto _L10
_L7:
        i = a(i, ai, j, stringbuilder);
          goto _L10
_L8:
        i = a(ai, j, c1);
          goto _L10
_L6:
        throw FormatException.getFormatInstance();
        if (stringbuilder.length() == 0)
        {
            throw FormatException.getFormatInstance();
        } else
        {
            ai = new d(null, stringbuilder.toString(), null, s);
            ai.a(c1);
            return ai;
        }
    }

    private static String a(int ai[], int i)
    {
        BigInteger biginteger = BigInteger.ZERO;
        for (int j = 0; j < i; j++)
        {
            biginteger = biginteger.add(c[i - j - 1].multiply(BigInteger.valueOf(ai[j])));
        }

        ai = biginteger.toString();
        if (ai.charAt(0) != '1')
        {
            throw FormatException.getFormatInstance();
        } else
        {
            return ai.substring(1);
        }
    }

    private static int b(int ai[], int i, StringBuilder stringbuilder)
    {
        int ai1[] = new int[15];
        boolean flag1 = false;
        int j = 0;
        int l = i;
        do
        {
            if (l >= ai[0] || flag1)
            {
                break;
            }
            i = l + 1;
            l = ai[l];
            boolean flag = flag1;
            if (i == ai[0])
            {
                flag = true;
            }
            int k;
            if (l < 900)
            {
                ai1[j] = l;
                k = j + 1;
            } else
            if (l == 900 || l == 901 || l == 924 || l == 928 || l == 923 || l == 922)
            {
                i--;
                flag = true;
                k = j;
            } else
            {
                k = j;
            }
            if (k % 15 != 0 && l != 902)
            {
                flag1 = flag;
                j = k;
                l = i;
                if (!flag)
                {
                    continue;
                }
            }
            stringbuilder.append(a(ai1, k));
            j = 0;
            flag1 = flag;
            l = i;
        } while (true);
        return l;
    }

    static 
    {
        BigInteger abiginteger[] = new BigInteger[16];
        c = abiginteger;
        abiginteger[0] = BigInteger.ONE;
        BigInteger biginteger = BigInteger.valueOf(900L);
        c[1] = biginteger;
        for (int i = 2; i < c.length; i++)
        {
            c[i] = c[i - 1].multiply(biginteger);
        }

    }

    private class Mode extends Enum
    {

        private static final Mode $VALUES[];
        public static final Mode ALPHA;
        public static final Mode ALPHA_SHIFT;
        public static final Mode LOWER;
        public static final Mode MIXED;
        public static final Mode PUNCT;
        public static final Mode PUNCT_SHIFT;

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(com/google/zxing/pdf417/decoder/DecodedBitStreamParser$Mode, s);
        }

        public static Mode[] values()
        {
            return (Mode[])$VALUES.clone();
        }

        static 
        {
            ALPHA = new Mode("ALPHA", 0);
            LOWER = new Mode("LOWER", 1);
            MIXED = new Mode("MIXED", 2);
            PUNCT = new Mode("PUNCT", 3);
            ALPHA_SHIFT = new Mode("ALPHA_SHIFT", 4);
            PUNCT_SHIFT = new Mode("PUNCT_SHIFT", 5);
            $VALUES = (new Mode[] {
                ALPHA, LOWER, MIXED, PUNCT, ALPHA_SHIFT, PUNCT_SHIFT
            });
        }

        private Mode(String s, int i)
        {
            super(s, i);
        }
    }

}
