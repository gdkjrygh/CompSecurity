// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;
import com.google.zxing.f;
import com.google.zxing.g;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            k

public final class c extends k
{

    static final int a[];
    private static final char b[] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".toCharArray();
    private static final int c;
    private final boolean d;
    private final boolean e;
    private final StringBuilder f;
    private final int g[];

    public c()
    {
        this(false);
    }

    public c(boolean flag)
    {
        this(flag, false);
    }

    private c(boolean flag, boolean flag1)
    {
        d = flag;
        e = false;
        f = new StringBuilder(20);
        g = new int[9];
    }

    private static int a(int ai[])
    {
        int i4 = ai.length;
        int j = 0;
        do
        {
            int i = 0x7fffffff;
            int k2 = ai.length;
            for (int l = 0; l < k2;)
            {
                int l1 = ai[l];
                int j1 = i;
                if (l1 < i)
                {
                    j1 = i;
                    if (l1 > j)
                    {
                        j1 = l1;
                    }
                }
                l++;
                i = j1;
            }

            int i2 = 0;
            j = 0;
            int k1 = 0;
            int i1;
            int l2;
            for (i1 = 0; i2 < i4; i1 = l2)
            {
                int j4 = ai[i2];
                int l3 = j;
                int j3 = k1;
                l2 = i1;
                if (j4 > i)
                {
                    l3 = j | 1 << i4 - 1 - i2;
                    l2 = i1 + 1;
                    j3 = k1 + j4;
                }
                i2++;
                j = l3;
                k1 = j3;
            }

            if (i1 == 3)
            {
                int j2 = i1;
                i1 = 0;
                do
                {
                    int i3;
label0:
                    {
                        i3 = j;
                        if (i1 < i4)
                        {
                            i3 = j;
                            if (j2 > 0)
                            {
                                int k3 = ai[i1];
                                i3 = j2;
                                if (k3 <= i)
                                {
                                    break label0;
                                }
                                i3 = j2 - 1;
                                if (k3 << 1 < k1)
                                {
                                    break label0;
                                }
                                i3 = -1;
                            }
                        }
                        return i3;
                    }
                    i1++;
                    j2 = i3;
                } while (true);
            }
            if (i1 <= 3)
            {
                return -1;
            }
            j = i;
        } while (true);
    }

    public final f a(int i, a a1, Map map)
    {
        Object obj;
        int ai[];
        int j;
        int i1;
        int j1;
        int k1;
        int i2;
        int j2;
        ai = g;
        Arrays.fill(ai, 0);
        obj = f;
        ((StringBuilder) (obj)).setLength(0);
        i2 = a1.a();
        j = a1.c(0);
        k1 = 0;
        j1 = 0;
        j2 = ai.length;
        i1 = j;
_L5:
        if (i1 >= i2) goto _L2; else goto _L1
_L1:
        if ((a1.a(i1) ^ j1) == 0) goto _L4; else goto _L3
_L3:
        int l;
        ai[k1] = ai[k1] + 1;
        l = j1;
        j1 = j;
_L11:
        i1++;
        j = j1;
        j1 = l;
          goto _L5
_L4:
        if (k1 != j2 - 1) goto _L7; else goto _L6
_L6:
        if (a(ai) != c || !a1.a(Math.max(0, j - (i1 - j >> 1)), j, false)) goto _L9; else goto _L8
_L8:
        map = new int[2];
        map[0] = j;
        map[1] = i1;
        j = a1.c(map[1]);
        k1 = a1.a();
_L25:
        char c1;
        a(a1, j, ai);
        i1 = a(ai);
        boolean flag;
        if (i1 < 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
label0:
        {
            l = 0;
            do
            {
                if (l >= a.length)
                {
                    break;
                }
                if (a[l] == i1)
                {
                    c1 = b[l];
                    ((StringBuilder) (obj)).append(c1);
                    j1 = ai.length;
                    l = 0;
                    i1 = j;
                    for (; l < j1; l++)
                    {
                        i1 += ai[l];
                    }

                    break label0;
                }
                l++;
            } while (true);
            throw NotFoundException.getNotFoundInstance();
        }
        j1 = a1.c(i1);
          goto _L10
_L9:
        l = j + (ai[0] + ai[1]);
        System.arraycopy(ai, 2, ai, 0, j2 - 2);
        ai[j2 - 2] = 0;
        ai[j2 - 1] = 0;
        j = k1 - 1;
_L12:
        ai[j] = 1;
        if (j1 == 0)
        {
            flag = true;
            j1 = l;
            k1 = j;
            l = ((flag) ? 1 : 0);
        } else
        {
            flag = false;
            j1 = l;
            k1 = j;
            l = ((flag) ? 1 : 0);
        }
          goto _L11
_L7:
        k1++;
        l = j;
        j = k1;
          goto _L12
_L2:
        throw NotFoundException.getNotFoundInstance();
_L10:
        if (c1 != '*') goto _L14; else goto _L13
_L13:
        ((StringBuilder) (obj)).setLength(((StringBuilder) (obj)).length() - 1);
        i1 = 0;
        int l1 = ai.length;
        for (l = 0; l < l1; l++)
        {
            i1 += ai[l];
        }

        if (j1 != k1 && j1 - j - i1 >> 1 < i1)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (d)
        {
            k1 = ((StringBuilder) (obj)).length() - 1;
            i1 = 0;
            for (l = 0; l < k1; l++)
            {
                i1 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(f.charAt(l));
            }

            if (((StringBuilder) (obj)).charAt(k1) != b[i1 % 43])
            {
                throw ChecksumException.getChecksumInstance();
            }
            ((StringBuilder) (obj)).setLength(k1);
        }
        if (((StringBuilder) (obj)).length() == 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (!e) goto _L16; else goto _L15
_L15:
        i1 = ((CharSequence) (obj)).length();
        a1 = new StringBuilder(i1);
        l = 0;
_L22:
        char c2;
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_923;
        }
        c2 = ((CharSequence) (obj)).charAt(l);
        if (c2 != '+' && c2 != '$' && c2 != '%' && c2 != '/')
        {
            break MISSING_BLOCK_LABEL_913;
        }
        k1 = ((CharSequence) (obj)).charAt(l + 1);
        c1 = '\0';
        c2;
        JVM INSTR lookupswitch 4: default 736
    //                   36: 787
    //                   37: 816
    //                   43: 758
    //                   47: 870;
           goto _L17 _L18 _L19 _L20 _L21
_L17:
        a1.append(c1);
        l++;
_L23:
        l++;
          goto _L22
_L20:
        if (k1 >= 'A' && k1 <= 'Z')
        {
            c1 = (char)(k1 + 32);
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L17
_L18:
        if (k1 >= 'A' && k1 <= 'Z')
        {
            c1 = (char)(k1 - 64);
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L17
_L19:
        if (k1 >= 'A' && k1 <= 'E')
        {
            c1 = (char)(k1 - 38);
        } else
        if (k1 >= 'F' && k1 <= 'W')
        {
            c1 = (char)(k1 - 11);
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L17
_L21:
        if (k1 >= 'A' && k1 <= 'O')
        {
            c1 = (char)(k1 - 32);
        } else
        if (k1 == 'Z')
        {
            c1 = ':';
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L17
        a1.append(c2);
          goto _L23
        a1 = a1.toString();
_L24:
        float f1 = (float)(map[1] + map[0]) / 2.0F;
        float f2 = (float)(j1 + j) / 2.0F;
        map = new g(f1, i);
        obj = new g(f2, i);
        BarcodeFormat barcodeformat = BarcodeFormat.CODE_39;
        return new f(a1, null, new g[] {
            map, obj
        }, barcodeformat);
_L16:
        a1 = ((StringBuilder) (obj)).toString();
        if (true) goto _L24; else goto _L14
_L14:
        j = j1;
          goto _L25
    }

    static 
    {
        int ai[] = new int[44];
        int[] _tmp = ai;
        ai[0] = 52;
        ai[1] = 289;
        ai[2] = 97;
        ai[3] = 352;
        ai[4] = 49;
        ai[5] = 304;
        ai[6] = 112;
        ai[7] = 37;
        ai[8] = 292;
        ai[9] = 100;
        ai[10] = 265;
        ai[11] = 73;
        ai[12] = 328;
        ai[13] = 25;
        ai[14] = 280;
        ai[15] = 88;
        ai[16] = 13;
        ai[17] = 268;
        ai[18] = 76;
        ai[19] = 28;
        ai[20] = 259;
        ai[21] = 67;
        ai[22] = 322;
        ai[23] = 19;
        ai[24] = 274;
        ai[25] = 82;
        ai[26] = 7;
        ai[27] = 262;
        ai[28] = 70;
        ai[29] = 22;
        ai[30] = 385;
        ai[31] = 193;
        ai[32] = 448;
        ai[33] = 145;
        ai[34] = 400;
        ai[35] = 208;
        ai[36] = 133;
        ai[37] = 388;
        ai[38] = 196;
        ai[39] = 148;
        ai[40] = 168;
        ai[41] = 162;
        ai[42] = 138;
        ai[43] = 42;
        a = ai;
        c = ai[39];
    }
}
