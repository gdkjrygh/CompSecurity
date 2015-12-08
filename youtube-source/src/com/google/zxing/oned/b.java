// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;
import com.google.zxing.f;
import com.google.zxing.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            k

public final class b extends k
{

    static final int a[][];

    public b()
    {
    }

    private static int a(a a1, int ai[], int i)
    {
        a(a1, i, ai);
        int j = 64;
        int i1 = -1;
        for (i = 0; i < a.length;)
        {
            int j1 = a(ai, a[i], 179);
            int l = j;
            if (j1 < j)
            {
                i1 = i;
                l = j1;
            }
            i++;
            j = l;
        }

        if (i1 >= 0)
        {
            return i1;
        } else
        {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public final f a(int i, a a1, Map map)
    {
        boolean flag;
        int j1;
        int k1;
        int k3;
        boolean flag1;
        int i5;
        int l1;
        int k4;
        if (map != null && map.containsKey(DecodeHintType.ASSUME_GS1))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        k4 = a1.a();
        j1 = a1.c(0);
        k1 = 0;
        map = new int[6];
        flag = false;
        i5 = map.length;
        k3 = j1;
        if (k3 >= k4) goto _L2; else goto _L1
_L1:
        if (!(a1.a(k3) ^ flag)) goto _L4; else goto _L3
_L3:
        map[k1] = map[k1] + 1;
        l1 = k1;
        k1 = j1;
        j1 = l1;
_L13:
        l1 = j1;
        k3++;
        j1 = k1;
        k1 = l1;
        break MISSING_BLOCK_LABEL_51;
_L4:
        if (k1 != i5 - 1) goto _L6; else goto _L5
_L5:
        int l3;
        int i3 = 64;
        l3 = -1;
        for (int i2 = 103; i2 <= 105; i2++)
        {
            int i4 = a(((int []) (map)), a[i2], 179);
            if (i4 < i3)
            {
                l3 = i2;
                i3 = i4;
            }
        }

        if (l3 < 0 || !a1.a(Math.max(0, j1 - (k3 - j1) / 2), j1, false)) goto _L8; else goto _L7
_L7:
        int ai[];
        int j3;
        ai = new int[3];
        ai[0] = j1;
        ai[1] = k3;
        ai[2] = l3;
        j3 = ai[2];
        j3;
        JVM INSTR tableswitch 103 105: default 272
    //                   103 366
    //                   104 546
    //                   105 553;
           goto _L9 _L10 _L11 _L12
_L9:
        throw FormatException.getFormatInstance();
_L8:
        int j2 = map[0] + map[1] + j1;
        System.arraycopy(map, 2, map, 0, i5 - 2);
        map[i5 - 2] = 0;
        map[i5 - 1] = 0;
        j1 = k1 - 1;
        k1 = j2;
_L14:
        map[j1] = 1;
        int k2;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (true) goto _L13; else goto _L6
_L6:
        k2 = k1 + 1;
        k1 = j1;
        j1 = k2;
          goto _L14
_L2:
        throw NotFoundException.getNotFoundInstance();
_L10:
        int j = 101;
_L68:
        Object obj;
        int ai1[];
        int l2;
        int j4;
        int l4;
        map = new StringBuilder(20);
        obj = new ArrayList(20);
        j4 = ai[0];
        l2 = ai[1];
        ai1 = new int[6];
        k1 = 1;
        l4 = 0;
        k3 = 0;
        l3 = 0;
        boolean flag2 = false;
        i5 = 0;
        j1 = j;
        j = ((flag2) ? 1 : 0);
_L24:
        if (j != 0) goto _L16; else goto _L15
_L15:
        int j5;
        int i6;
        boolean flag3;
        flag3 = false;
        i6 = a(a1, ai1, l2);
        ((List) (obj)).add(Byte.valueOf((byte)i6));
        if (i6 != 106)
        {
            k1 = 1;
        }
        j5 = k3;
        i5 = j3;
        if (i6 != 106)
        {
            j5 = k3 + 1;
            i5 = j3 + j5 * i6;
        }
        k3 = ai1.length;
        j3 = 0;
        j4 = l2;
        for (; j3 < k3; j3++)
        {
            j4 += ai1[j3];
        }

          goto _L17
_L11:
        j = 100;
        continue; /* Loop/switch isn't completed */
_L12:
        j = 99;
        continue; /* Loop/switch isn't completed */
_L17:
        i6;
        JVM INSTR tableswitch 103 105: default 588
    //                   103 711
    //                   104 711
    //                   105 711;
           goto _L18 _L19 _L19 _L19
_L18:
        j1;
        JVM INSTR tableswitch 99 101: default 616
    //                   99 1312
    //                   100 1032
    //                   101 715;
           goto _L20 _L21 _L22 _L23
_L20:
        k3 = k1;
_L65:
        int k5 = j1;
        j1 = j;
        j3 = ((flag3) ? 1 : 0);
        k1 = k3;
        j = k5;
_L27:
        k3 = j;
        int l5;
        if (l4 != 0)
        {
            if (j == 101)
            {
                k3 = 100;
            } else
            {
                k3 = 101;
            }
        }
        l4 = j3;
        l5 = j4;
        j4 = l3;
        l3 = i6;
        i6 = k3;
        j = j1;
        k3 = j5;
        j3 = i5;
        i5 = j4;
        j1 = i6;
        j4 = l2;
        l2 = l5;
          goto _L24
_L19:
        throw FormatException.getFormatInstance();
_L23:
        if (i6 >= 64) goto _L26; else goto _L25
_L25:
        map.append((char)(i6 + 32));
        j3 = j1;
        j1 = j;
        j = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L27
_L26:
        if (i6 >= 96) goto _L29; else goto _L28
_L28:
        map.append((char)(i6 - 64));
        j3 = j1;
        j1 = j;
        j = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L27
_L29:
        if (i6 != 106)
        {
            k1 = 0;
        }
        j3 = j;
        i6;
        JVM INSTR tableswitch 96 106: default 864
    //                   96 951
    //                   97 951
    //                   98 970
    //                   99 1007
    //                   100 988
    //                   101 951
    //                   102 883
    //                   103 868
    //                   104 868
    //                   105 868
    //                   106 1026;
           goto _L30 _L31 _L31 _L32 _L33 _L34 _L31 _L35 _L36 _L36 _L36 _L37
_L36:
        break; /* Loop/switch isn't completed */
_L30:
        j3 = j;
_L41:
        j = j1;
        j1 = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L38
_L35:
        j3 = j;
        if (!flag1) goto _L40; else goto _L39
_L39:
        if (map.length() == 0)
        {
            map.append("]C1");
            j3 = j1;
            j1 = j;
            j = j3;
            j3 = ((flag3) ? 1 : 0);
        } else
        {
            map.append('\035');
            j3 = j1;
            j1 = j;
            j = j3;
            j3 = ((flag3) ? 1 : 0);
        }
          goto _L38
_L31:
        j3 = j1;
        j1 = j;
        j = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L38
_L32:
        j3 = 1;
        k3 = 100;
        j1 = j;
        j = k3;
          goto _L38
_L34:
        j3 = 100;
        j1 = j;
        j = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L38
_L33:
        j3 = 99;
        j1 = j;
        j = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L38
_L37:
        j3 = 1;
_L40:
        if (true) goto _L41; else goto _L38
_L38:
        if (true) goto _L27; else goto _L42
_L42:
_L22:
        if (i6 >= 96) goto _L44; else goto _L43
_L43:
        map.append((char)(i6 + 32));
        j3 = j1;
        j1 = j;
        j = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L27
_L44:
        if (i6 != 106)
        {
            k1 = 0;
        }
        j3 = j;
        i6;
        JVM INSTR tableswitch 96 106: default 1144
    //                   96 1231
    //                   97 1231
    //                   98 1250
    //                   99 1287
    //                   100 1231
    //                   101 1268
    //                   102 1163
    //                   103 1148
    //                   104 1148
    //                   105 1148
    //                   106 1306;
           goto _L45 _L46 _L46 _L47 _L48 _L46 _L49 _L50 _L51 _L51 _L51 _L52
_L51:
        break; /* Loop/switch isn't completed */
_L45:
        j3 = j;
_L56:
        j = j1;
        j1 = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L53
_L50:
        j3 = j;
        if (!flag1) goto _L55; else goto _L54
_L54:
        if (map.length() == 0)
        {
            map.append("]C1");
            j3 = j1;
            j1 = j;
            j = j3;
            j3 = ((flag3) ? 1 : 0);
        } else
        {
            map.append('\035');
            j3 = j1;
            j1 = j;
            j = j3;
            j3 = ((flag3) ? 1 : 0);
        }
          goto _L53
_L46:
        j3 = j1;
        j1 = j;
        j = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L53
_L47:
        j3 = 1;
        k3 = 101;
        j1 = j;
        j = k3;
          goto _L53
_L49:
        j3 = 101;
        j1 = j;
        j = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L53
_L48:
        j3 = 99;
        j1 = j;
        j = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L53
_L52:
        j3 = 1;
_L55:
        if (true) goto _L56; else goto _L53
_L53:
        if (true) goto _L27; else goto _L57
_L57:
_L21:
        if (i6 >= 100) goto _L59; else goto _L58
_L58:
        if (i6 < 10)
        {
            map.append('0');
        }
        map.append(i6);
        j3 = j1;
        j1 = j;
        j = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L27
_L59:
        if (i6 != 106)
        {
            k1 = 0;
        }
        i6;
        JVM INSTR tableswitch 100 106: default 1412
    //                   100 1419
    //                   101 1506
    //                   102 1438
    //                   103 1412
    //                   104 1412
    //                   105 1412
    //                   106 1525;
           goto _L60 _L61 _L62 _L63 _L60 _L60 _L60 _L64
_L60:
        k3 = k1;
          goto _L65
_L61:
        j3 = 100;
        j1 = j;
        j = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L27
_L63:
        k3 = k1;
        if (!flag1) goto _L65; else goto _L66
_L66:
        if (map.length() == 0)
        {
            map.append("]C1");
            j3 = j1;
            j1 = j;
            j = j3;
            j3 = ((flag3) ? 1 : 0);
        } else
        {
            map.append('\035');
            j3 = j1;
            j1 = j;
            j = j3;
            j3 = ((flag3) ? 1 : 0);
        }
          goto _L27
_L62:
        j3 = 101;
        j1 = j;
        j = j3;
        j3 = ((flag3) ? 1 : 0);
          goto _L27
_L64:
        j = j1;
        j1 = 1;
        j3 = ((flag3) ? 1 : 0);
          goto _L27
_L16:
        int l = a1.d(l2);
        if (!a1.a(l, Math.min(a1.a(), (l - j4) / 2 + l), false))
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if ((j3 - k3 * i5) % 103 != i5)
        {
            throw ChecksumException.getChecksumInstance();
        }
        l2 = map.length();
        if (l2 == 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        float f1;
        float f2;
        if (l2 > 0 && k1 != 0)
        {
            if (j1 == 99)
            {
                map.delete(l2 - 2, l2);
            } else
            {
                map.delete(l2 - 1, l2);
            }
        }
        f1 = (float)(ai[1] + ai[0]) / 2.0F;
        f2 = (float)(l + j4) / 2.0F;
        j1 = ((List) (obj)).size();
        a1 = new byte[j1];
        for (int i1 = 0; i1 < j1; i1++)
        {
            a1[i1] = ((Byte)((List) (obj)).get(i1)).byteValue();
        }

        map = map.toString();
        obj = new g(f1, i);
        g g1 = new g(f2, i);
        BarcodeFormat barcodeformat = BarcodeFormat.CODE_128;
        return new f(map, a1, new g[] {
            obj, g1
        }, barcodeformat);
        if (true) goto _L68; else goto _L67
_L67:
    }

    static 
    {
        int ai[] = {
            2, 2, 2, 2, 2, 1
        };
        int ai1[] = {
            1, 2, 1, 2, 2, 3
        };
        int ai2[] = {
            1, 2, 1, 3, 2, 2
        };
        int ai3[] = {
            1, 2, 2, 2, 1, 3
        };
        int ai4[] = {
            1, 2, 2, 3, 1, 2
        };
        int ai5[] = {
            1, 3, 2, 2, 1, 2
        };
        int ai6[] = {
            2, 2, 1, 2, 1, 3
        };
        int ai7[] = {
            2, 3, 1, 2, 1, 2
        };
        int ai8[] = {
            1, 1, 2, 2, 3, 2
        };
        int ai9[] = {
            1, 2, 2, 1, 3, 2
        };
        int ai10[] = {
            1, 2, 2, 2, 3, 1
        };
        int ai11[] = {
            1, 1, 3, 2, 2, 2
        };
        int ai12[] = {
            2, 2, 1, 1, 3, 2
        };
        int ai13[] = {
            2, 2, 1, 2, 3, 1
        };
        int ai14[] = {
            2, 1, 3, 2, 1, 2
        };
        int ai15[] = {
            2, 2, 3, 1, 1, 2
        };
        int ai16[] = {
            3, 1, 1, 2, 2, 2
        };
        int ai17[] = {
            3, 2, 1, 1, 2, 2
        };
        int ai18[] = {
            3, 2, 2, 1, 1, 2
        };
        int ai19[] = {
            3, 2, 2, 2, 1, 1
        };
        int ai20[] = {
            2, 1, 2, 1, 2, 3
        };
        int ai21[] = {
            2, 1, 2, 3, 2, 1
        };
        int ai22[] = {
            2, 3, 2, 1, 2, 1
        };
        int ai23[] = {
            1, 3, 1, 1, 2, 3
        };
        int ai24[] = {
            1, 3, 1, 3, 2, 1
        };
        int ai25[] = {
            1, 1, 2, 3, 1, 3
        };
        int ai26[] = {
            1, 3, 2, 1, 1, 3
        };
        int ai27[] = {
            1, 3, 2, 3, 1, 1
        };
        int ai28[] = {
            2, 1, 1, 3, 1, 3
        };
        int ai29[] = {
            2, 3, 1, 3, 1, 1
        };
        int ai30[] = {
            1, 1, 2, 1, 3, 3
        };
        int ai31[] = {
            1, 1, 2, 3, 3, 1
        };
        int ai32[] = {
            1, 3, 2, 1, 3, 1
        };
        int ai33[] = {
            1, 1, 3, 1, 2, 3
        };
        int ai34[] = {
            1, 1, 3, 3, 2, 1
        };
        int ai35[] = {
            1, 3, 3, 1, 2, 1
        };
        int ai36[] = {
            3, 1, 3, 1, 2, 1
        };
        int ai37[] = {
            2, 1, 1, 3, 3, 1
        };
        int ai38[] = {
            2, 1, 3, 1, 1, 3
        };
        int ai39[] = {
            2, 1, 3, 3, 1, 1
        };
        int ai40[] = {
            2, 1, 3, 1, 3, 1
        };
        int ai41[] = {
            3, 1, 1, 1, 2, 3
        };
        int ai42[] = {
            3, 1, 1, 3, 2, 1
        };
        int ai43[] = {
            3, 1, 2, 3, 1, 1
        };
        int ai44[] = {
            3, 3, 2, 1, 1, 1
        };
        int ai45[] = {
            3, 1, 4, 1, 1, 1
        };
        int ai46[] = {
            2, 2, 1, 4, 1, 1
        };
        int ai47[] = {
            4, 3, 1, 1, 1, 1
        };
        int ai48[] = {
            1, 1, 1, 4, 2, 2
        };
        int ai49[] = {
            1, 2, 1, 1, 2, 4
        };
        int ai50[] = {
            1, 2, 1, 4, 2, 1
        };
        int ai51[] = {
            1, 4, 1, 2, 2, 1
        };
        int ai52[] = {
            1, 1, 2, 2, 1, 4
        };
        int ai53[] = {
            1, 1, 2, 4, 1, 2
        };
        int ai54[] = {
            1, 2, 2, 1, 1, 4
        };
        int ai55[] = {
            1, 2, 2, 4, 1, 1
        };
        int ai56[] = {
            1, 4, 2, 1, 1, 2
        };
        int ai57[] = {
            2, 4, 1, 2, 1, 1
        };
        int ai58[] = {
            4, 1, 3, 1, 1, 1
        };
        int ai59[] = {
            2, 4, 1, 1, 1, 2
        };
        int ai60[] = {
            1, 1, 1, 2, 4, 2
        };
        int ai61[] = {
            1, 2, 1, 1, 4, 2
        };
        int ai62[] = {
            1, 2, 1, 2, 4, 1
        };
        int ai63[] = {
            1, 2, 4, 1, 1, 2
        };
        int ai64[] = {
            1, 2, 4, 2, 1, 1
        };
        int ai65[] = {
            4, 1, 1, 2, 1, 2
        };
        int ai66[] = {
            4, 2, 1, 1, 1, 2
        };
        int ai67[] = {
            2, 1, 2, 1, 4, 1
        };
        int ai68[] = {
            2, 1, 4, 1, 2, 1
        };
        int ai69[] = {
            1, 1, 1, 3, 4, 1
        };
        int ai70[] = {
            1, 3, 1, 1, 4, 1
        };
        int ai71[] = {
            1, 1, 4, 1, 1, 3
        };
        int ai72[] = {
            4, 1, 1, 1, 1, 3
        };
        int ai73[] = {
            4, 1, 1, 3, 1, 1
        };
        int ai74[] = {
            1, 1, 3, 1, 4, 1
        };
        int ai75[] = {
            3, 1, 1, 1, 4, 1
        };
        int ai76[] = {
            2, 1, 1, 2, 1, 4
        };
        int ai77[] = {
            2, 1, 1, 2, 3, 2
        };
        int ai78[] = {
            2, 3, 3, 1, 1, 1, 2
        };
        a = (new int[][] {
            new int[] {
                2, 1, 2, 2, 2, 2
            }, new int[] {
                2, 2, 2, 1, 2, 2
            }, ai, ai1, ai2, new int[] {
                1, 3, 1, 2, 2, 2
            }, ai3, ai4, ai5, ai6, new int[] {
                2, 2, 1, 3, 1, 2
            }, ai7, ai8, ai9, ai10, ai11, new int[] {
                1, 2, 3, 1, 2, 2
            }, new int[] {
                1, 2, 3, 2, 2, 1
            }, new int[] {
                2, 2, 3, 2, 1, 1
            }, ai12, ai13, ai14, ai15, new int[] {
                3, 1, 2, 1, 3, 1
            }, ai16, ai17, new int[] {
                3, 2, 1, 2, 2, 1
            }, new int[] {
                3, 1, 2, 2, 1, 2
            }, ai18, ai19, ai20, ai21, ai22, new int[] {
                1, 1, 1, 3, 2, 3
            }, ai23, ai24, ai25, ai26, ai27, ai28, new int[] {
                2, 3, 1, 1, 1, 3
            }, ai29, ai30, ai31, ai32, ai33, ai34, ai35, ai36, ai37, new int[] {
                2, 3, 1, 1, 3, 1
            }, ai38, ai39, ai40, ai41, ai42, new int[] {
                3, 3, 1, 1, 2, 1
            }, new int[] {
                3, 1, 2, 1, 1, 3
            }, ai43, ai44, ai45, ai46, ai47, new int[] {
                1, 1, 1, 2, 2, 4
            }, ai48, ai49, ai50, new int[] {
                1, 4, 1, 1, 2, 2
            }, ai51, ai52, ai53, ai54, ai55, ai56, new int[] {
                1, 4, 2, 2, 1, 1
            }, ai57, new int[] {
                2, 2, 1, 1, 1, 4
            }, ai58, ai59, new int[] {
                1, 3, 4, 1, 1, 1
            }, ai60, ai61, ai62, new int[] {
                1, 1, 4, 2, 1, 2
            }, ai63, ai64, ai65, ai66, new int[] {
                4, 2, 1, 2, 1, 1
            }, ai67, ai68, new int[] {
                4, 1, 2, 1, 2, 1
            }, new int[] {
                1, 1, 1, 1, 4, 3
            }, ai69, ai70, ai71, new int[] {
                1, 1, 4, 3, 1, 1
            }, ai72, ai73, ai74, new int[] {
                1, 1, 4, 1, 3, 1
            }, ai75, new int[] {
                4, 1, 1, 1, 3, 1
            }, new int[] {
                2, 1, 1, 4, 1, 2
            }, ai76, ai77, ai78
        });
    }
}
