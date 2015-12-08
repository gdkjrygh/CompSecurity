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

public final class d extends k
{

    private static final char a[] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    private static final int b[];
    private static final int c;
    private final StringBuilder d = new StringBuilder(20);
    private final int e[] = new int[6];

    public d()
    {
    }

    private static int a(int ai[])
    {
        int k2 = ai.length;
        int j = ai.length;
        int i = 0;
        int j1;
        int k1;
        for (j1 = 0; i < j; j1 = k1 + j1)
        {
            k1 = ai[i];
            i++;
        }

        int l1 = 0;
        i = 0;
        do
        {
            int i2;
label0:
            {
                int l = i;
                if (l1 < k2)
                {
                    l = ((ai[l1] << 8) * 9) / j1;
                    i2 = l >> 8;
                    if ((l & 0xff) > 127)
                    {
                        i2++;
                    }
                    if (i2 > 0 && i2 <= 4)
                    {
                        break label0;
                    }
                    l = -1;
                }
                return l;
            }
            int i1;
            if ((l1 & 1) == 0)
            {
                int j2 = 0;
                do
                {
                    i1 = i;
                    if (j2 >= i2)
                    {
                        break;
                    }
                    j2++;
                    i = i << 1 | 1;
                } while (true);
            } else
            {
                i1 = i << i2;
            }
            l1++;
            i = i1;
        } while (true);
    }

    private static void a(CharSequence charsequence, int i, int j)
    {
        int l = 1;
        int j1 = i - 1;
        int i1 = 0;
        do
        {
            int k1 = l;
            if (j1 < 0)
            {
                break;
            }
            int i2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charsequence.charAt(j1));
            int l1 = k1 + 1;
            l = l1;
            if (l1 > j)
            {
                l = 1;
            }
            j1--;
            i1 = i2 * k1 + i1;
        } while (true);
        if (charsequence.charAt(i) != a[i1 % 47])
        {
            throw ChecksumException.getChecksumInstance();
        } else
        {
            return;
        }
    }

    public final f a(int i, a a1, Map map)
    {
        int j;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        l1 = a1.a();
        j = a1.c(0);
        Arrays.fill(e, 0);
        map = e;
        j1 = 0;
        i2 = map.length;
        k1 = 0;
        i1 = j;
_L5:
        if (i1 >= l1) goto _L2; else goto _L1
_L1:
        if ((a1.a(i1) ^ j1) == 0) goto _L4; else goto _L3
_L3:
        int l;
        map[k1] = map[k1] + 1;
        l = j1;
        j1 = j;
_L10:
        i1++;
        j = j1;
        j1 = l;
          goto _L5
_L4:
        if (k1 != i2 - 1) goto _L7; else goto _L6
_L6:
        if (a(((int []) (map))) != c) goto _L9; else goto _L8
_L8:
        StringBuilder stringbuilder;
        int ai[];
        map = new int[2];
        map[0] = j;
        map[1] = i1;
        j = a1.c(map[1]);
        j1 = a1.a();
        ai = e;
        Arrays.fill(ai, 0);
        stringbuilder = d;
        stringbuilder.setLength(0);
_L13:
        char c1;
        l = j;
        a(a1, l, ai);
        i1 = a(ai);
        boolean flag;
        if (i1 < 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
label0:
        {
            j = 0;
            do
            {
                if (j >= b.length)
                {
                    break;
                }
                if (b[j] == i1)
                {
                    c1 = a[j];
                    stringbuilder.append(c1);
                    k1 = ai.length;
                    j = 0;
                    i1 = l;
                    for (; j < k1; j++)
                    {
                        i1 += ai[j];
                    }

                    break label0;
                }
                j++;
            } while (true);
            throw NotFoundException.getNotFoundInstance();
        }
        i1 = a1.c(i1);
        j = i1;
        continue; /* Loop/switch isn't completed */
_L9:
        l = j + (map[0] + map[1]);
        System.arraycopy(map, 2, map, 0, i2 - 2);
        map[i2 - 2] = 0;
        map[i2 - 1] = 0;
        j = k1 - 1;
_L11:
        map[j] = 1;
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
          goto _L10
_L7:
        k1++;
        l = j;
        j = k1;
          goto _L11
_L2:
        throw NotFoundException.getNotFoundInstance();
        if (c1 != '*') goto _L13; else goto _L12
_L12:
        stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        if (i1 == j1 || !a1.a(i1))
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (stringbuilder.length() < 2)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        j = stringbuilder.length();
        a(((CharSequence) (stringbuilder)), j - 2, 20);
        a(((CharSequence) (stringbuilder)), j - 1, 15);
        stringbuilder.setLength(stringbuilder.length() - 2);
        j1 = stringbuilder.length();
        a1 = new StringBuilder(j1);
        j = 0;
_L19:
        char c2;
        if (j >= j1)
        {
            break MISSING_BLOCK_LABEL_803;
        }
        c2 = stringbuilder.charAt(j);
        if (c2 < 'a' || c2 > 'd')
        {
            break MISSING_BLOCK_LABEL_793;
        }
        if (j >= j1 - 1)
        {
            throw FormatException.getFormatInstance();
        }
        k1 = stringbuilder.charAt(j + 1);
        c1 = '\0';
        c2;
        JVM INSTR tableswitch 97 100: default 616
    //                   97 667
    //                   98 696
    //                   99 750
    //                   100 638;
           goto _L14 _L15 _L16 _L17 _L18
_L14:
        a1.append(c1);
        j++;
_L20:
        j++;
          goto _L19
_L18:
        if (k1 >= 'A' && k1 <= 'Z')
        {
            c1 = (char)(k1 + 32);
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L14
_L15:
        if (k1 >= 'A' && k1 <= 'Z')
        {
            c1 = (char)(k1 - 64);
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L14
_L16:
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
          goto _L14
_L17:
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
          goto _L14
        a1.append(c2);
          goto _L20
        a1 = a1.toString();
        float f1 = (float)(map[1] + map[0]) / 2.0F;
        float f2 = (float)(i1 + l) / 2.0F;
        map = new g(f1, i);
        g g1 = new g(f2, i);
        BarcodeFormat barcodeformat = BarcodeFormat.CODE_93;
        return new f(a1, null, new g[] {
            map, g1
        }, barcodeformat);
          goto _L10
    }

    static 
    {
        int ai[] = new int[48];
        int[] _tmp = ai;
        ai[0] = 276;
        ai[1] = 328;
        ai[2] = 324;
        ai[3] = 322;
        ai[4] = 296;
        ai[5] = 292;
        ai[6] = 290;
        ai[7] = 336;
        ai[8] = 274;
        ai[9] = 266;
        ai[10] = 424;
        ai[11] = 420;
        ai[12] = 418;
        ai[13] = 404;
        ai[14] = 402;
        ai[15] = 394;
        ai[16] = 360;
        ai[17] = 356;
        ai[18] = 354;
        ai[19] = 308;
        ai[20] = 282;
        ai[21] = 344;
        ai[22] = 332;
        ai[23] = 326;
        ai[24] = 300;
        ai[25] = 278;
        ai[26] = 436;
        ai[27] = 434;
        ai[28] = 428;
        ai[29] = 422;
        ai[30] = 406;
        ai[31] = 410;
        ai[32] = 364;
        ai[33] = 358;
        ai[34] = 310;
        ai[35] = 314;
        ai[36] = 302;
        ai[37] = 468;
        ai[38] = 466;
        ai[39] = 458;
        ai[40] = 366;
        ai[41] = 374;
        ai[42] = 430;
        ai[43] = 294;
        ai[44] = 474;
        ai[45] = 470;
        ai[46] = 306;
        ai[47] = 350;
        b = ai;
        c = ai[47];
    }
}
