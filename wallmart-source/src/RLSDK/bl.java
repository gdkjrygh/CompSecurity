// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            bu, y, v, t, 
//            aj, ad, q, ab

public final class bl extends bu
{

    static final int a[][];

    public bl()
    {
    }

    private static int a(aj aj1, int ai[], int i)
        throws y
    {
        a(aj1, i, ai);
        int j = 64;
        int l = -1;
        for (i = 0; i < a.length;)
        {
            int i1 = a(ai, a[i], 179);
            int k = j;
            if (i1 < j)
            {
                l = i;
                k = i1;
            }
            i++;
            j = k;
        }

        if (l >= 0)
        {
            return l;
        } else
        {
            throw y.a();
        }
    }

    public final ab a(int i, aj aj1, Hashtable hashtable)
        throws y, v, t
    {
        int j;
        boolean flag;
        int i1;
        int l2;
        int l3;
        int i4;
        l3 = aj1.b;
        for (j = 0; j < l3 && !aj1.a(j); j++) { }
        i1 = 0;
        hashtable = new int[6];
        flag = false;
        i4 = hashtable.length;
        l2 = j;
_L5:
        if (l2 >= l3) goto _L2; else goto _L1
_L1:
        if (!(aj1.a(l2) ^ flag)) goto _L4; else goto _L3
_L3:
        hashtable[i1] = hashtable[i1] + 1;
        int j1 = i1;
        i1 = j;
        j = j1;
_L14:
        int k1 = j;
        l2++;
        j = i1;
        i1 = k1;
          goto _L5
_L4:
        if (i1 != i4 - 1) goto _L7; else goto _L6
_L6:
        int i3;
        int j2 = 64;
        i3 = -1;
        for (int l1 = 103; l1 <= 105; l1++)
        {
            int j3 = a(((int []) (hashtable)), a[l1], 179);
            if (j3 < j2)
            {
                i3 = l1;
                j2 = j3;
            }
        }

        if (i3 < 0 || !aj1.a(Math.max(0, j - (l2 - j) / 2), j)) goto _L9; else goto _L8
_L8:
        int i2;
        hashtable = new int[3];
        hashtable[0] = j;
        hashtable[1] = l2;
        hashtable[2] = i3;
        i2 = hashtable[2];
        i2;
        JVM INSTR tableswitch 103 105: default 260
    //                   103 372
    //                   104 519
    //                   105 526;
           goto _L10 _L11 _L12 _L13
_L10:
        throw v.a();
_L9:
        i2 = hashtable[0] + hashtable[1] + j;
        for (j = 2; j < i4; j++)
        {
            hashtable[j - 2] = hashtable[j];
        }

        hashtable[i4 - 2] = 0;
        hashtable[i4 - 1] = 0;
        j = i1 - 1;
        i1 = i2;
_L15:
        hashtable[j] = 1;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L14
_L7:
        i2 = i1 + 1;
        i1 = j;
        j = i2;
          goto _L15
_L2:
        throw y.a();
_L11:
        j = 101;
_L55:
        Object obj;
        int ai[];
        int l;
        int k2;
        int k3;
        obj = new StringBuffer(20);
        k3 = hashtable[0];
        k2 = hashtable[1];
        ai = new int[6];
        i1 = 1;
        l3 = 0;
        boolean flag1 = false;
        i3 = 0;
        i4 = 0;
        l2 = 0;
        l = j;
        j = ((flag1) ? 1 : 0);
_L25:
        if (j != 0) goto _L17; else goto _L16
_L16:
        int j4;
        int l4;
        l4 = a(aj1, ai, k2);
        if (l4 != 106)
        {
            i1 = 1;
        }
        j4 = l2;
        i4 = i2;
        if (l4 != 106)
        {
            j4 = l2 + 1;
            i4 = i2 + j4 * l4;
        }
        i2 = 0;
        k3 = k2;
        for (; i2 < ai.length; i2++)
        {
            k3 += ai[i2];
        }

          goto _L18
_L12:
        j = 100;
        continue; /* Loop/switch isn't completed */
_L13:
        j = 99;
        continue; /* Loop/switch isn't completed */
_L18:
        l4;
        JVM INSTR tableswitch 103 105: default 560
    //                   103 682
    //                   104 682
    //                   105 682;
           goto _L19 _L20 _L20 _L20
_L19:
        l;
        JVM INSTR tableswitch 99 101: default 588
    //                   99 1212
    //                   100 968
    //                   101 686;
           goto _L21 _L22 _L23 _L24
_L21:
        l2 = l;
        l = i1;
        i1 = 0;
        i2 = j;
        j = l2;
_L28:
        l2 = j;
        int k4;
        if (l3 != 0)
        {
            if (j == 101)
            {
                l2 = 100;
            } else
            {
                l2 = 101;
            }
        }
        l3 = i1;
        k4 = l2;
        i1 = i3;
        j = i2;
        i3 = l4;
        l4 = k3;
        l2 = j4;
        i2 = i4;
        i4 = i1;
        k3 = k2;
        k2 = l4;
        i1 = l;
        l = k4;
          goto _L25
_L20:
        throw v.a();
_L24:
        if (l4 >= 64) goto _L27; else goto _L26
_L26:
        ((StringBuffer) (obj)).append((char)(l4 + 32));
        i2 = j;
        l2 = 0;
        j = l;
        l = i1;
        i1 = l2;
          goto _L28
_L27:
        if (l4 >= 96) goto _L30; else goto _L29
_L29:
        ((StringBuffer) (obj)).append((char)(l4 - 64));
        i2 = j;
        l2 = 0;
        j = l;
        l = i1;
        i1 = l2;
          goto _L28
_L30:
        if (l4 != 106)
        {
            i1 = 0;
        }
        l4;
        JVM INSTR tableswitch 96 106: default 840
    //                   96 862
    //                   97 862
    //                   98 884
    //                   99 936
    //                   100 910
    //                   101 862
    //                   102 862
    //                   103 840
    //                   104 840
    //                   105 840
    //                   106 962;
           goto _L31 _L32 _L32 _L33 _L34 _L35 _L32 _L32 _L31 _L31 _L31 _L36
_L31:
        l2 = 0;
        i2 = j;
        j = l;
        l = i1;
        i1 = l2;
          goto _L37
_L32:
        i2 = j;
        l2 = 0;
        j = l;
        l = i1;
        i1 = l2;
          goto _L37
_L33:
        l2 = 1;
        k4 = 100;
        i2 = j;
        l = i1;
        j = k4;
        i1 = l2;
          goto _L37
_L35:
        k4 = 100;
        l2 = 0;
        i2 = j;
        l = i1;
        j = k4;
        i1 = l2;
          goto _L37
_L34:
        k4 = 99;
        l2 = 0;
        i2 = j;
        l = i1;
        j = k4;
        i1 = l2;
          goto _L37
_L36:
        j = 1;
        if (true) goto _L31; else goto _L37
_L37:
        if (true) goto _L28; else goto _L38
_L38:
_L23:
        if (l4 >= 96) goto _L40; else goto _L39
_L39:
        ((StringBuffer) (obj)).append((char)(l4 + 32));
        i2 = j;
        l2 = 0;
        j = l;
        l = i1;
        i1 = l2;
          goto _L28
_L40:
        if (l4 != 106)
        {
            i1 = 0;
        }
        i2 = j;
        l4;
        JVM INSTR tableswitch 96 106: default 1084
    //                   96 1106
    //                   97 1106
    //                   98 1128
    //                   99 1180
    //                   100 1106
    //                   101 1154
    //                   102 1106
    //                   103 1088
    //                   104 1088
    //                   105 1088
    //                   106 1206;
           goto _L41 _L42 _L42 _L43 _L44 _L42 _L45 _L42 _L46 _L46 _L46 _L47
_L46:
        break; /* Loop/switch isn't completed */
_L41:
        i2 = j;
_L49:
        l2 = 0;
        j = l;
        l = i1;
        i1 = l2;
          goto _L48
_L42:
        l2 = 0;
        i2 = j;
        j = l;
        l = i1;
        i1 = l2;
          goto _L48
_L43:
        l2 = 1;
        k4 = 101;
        i2 = j;
        l = i1;
        j = k4;
        i1 = l2;
          goto _L48
_L45:
        k4 = 101;
        l2 = 0;
        i2 = j;
        l = i1;
        j = k4;
        i1 = l2;
          goto _L48
_L44:
        k4 = 99;
        l2 = 0;
        i2 = j;
        l = i1;
        j = k4;
        i1 = l2;
          goto _L48
_L47:
        i2 = 1;
        if (true) goto _L49; else goto _L48
_L48:
        if (true) goto _L28; else goto _L50
_L50:
_L22:
        if (l4 >= 100) goto _L52; else goto _L51
_L51:
        if (l4 < 10)
        {
            ((StringBuffer) (obj)).append('0');
        }
        ((StringBuffer) (obj)).append(l4);
        i2 = j;
        l2 = 0;
        j = l;
        l = i1;
        i1 = l2;
          goto _L28
_L52:
        if (l4 != 106)
        {
            i1 = 0;
        }
        switch (l4)
        {
        case 103: // 'g'
        case 104: // 'h'
        case 105: // 'i'
        default:
            l2 = 0;
            i2 = j;
            j = l;
            l = i1;
            i1 = l2;
            break;

        case 102: // 'f'
            l2 = 0;
            i2 = j;
            j = l;
            l = i1;
            i1 = l2;
            break;

        case 101: // 'e'
            k4 = 101;
            l2 = 0;
            i2 = j;
            l = i1;
            j = k4;
            i1 = l2;
            break;

        case 100: // 'd'
            k4 = 100;
            l2 = 0;
            i2 = j;
            l = i1;
            j = k4;
            i1 = l2;
            break;

        case 106: // 'j'
            l2 = 0;
            i2 = 1;
            j = l;
            l = i1;
            i1 = l2;
            break;
        }
        if (true) goto _L28; else goto _L53
_L53:
_L17:
        int k;
        for (k = aj1.b; k2 < k && aj1.a(k2); k2++) { }
        if (!aj1.a(k2, Math.min(k, (k2 - k3) / 2 + k2)))
        {
            throw y.a();
        }
        if ((i2 - l2 * i4) % 103 != i4)
        {
            throw t.a();
        }
        k = ((StringBuffer) (obj)).length();
        if (k > 0 && i1 != 0)
        {
            if (l == 99)
            {
                ((StringBuffer) (obj)).delete(k - 2, k);
            } else
            {
                ((StringBuffer) (obj)).delete(k - 1, k);
            }
        }
        aj1 = ((StringBuffer) (obj)).toString();
        if (aj1.length() == 0)
        {
            throw v.a();
        }
        float f = (float)(hashtable[1] + hashtable[0]) / 2.0F;
        float f1 = (float)(k2 + k3) / 2.0F;
        hashtable = new ad(f, i);
        obj = new ad(f1, i);
        q q1 = q.e;
        return new ab(aj1, null, new ad[] {
            hashtable, obj
        }, q1);
        if (true) goto _L55; else goto _L54
_L54:
    }

    static 
    {
        int ai[] = {
            2, 1, 2, 2, 2, 2
        };
        int ai1[] = {
            1, 2, 1, 2, 2, 3
        };
        int ai2[] = {
            2, 2, 1, 3, 1, 2
        };
        int ai3[] = {
            1, 1, 3, 2, 2, 2
        };
        int ai4[] = {
            1, 2, 3, 1, 2, 2
        };
        int ai5[] = {
            1, 2, 3, 2, 2, 1
        };
        int ai6[] = {
            2, 2, 1, 1, 3, 2
        };
        int ai7[] = {
            3, 1, 1, 2, 2, 2
        };
        int ai8[] = {
            3, 2, 2, 1, 1, 2
        };
        int ai9[] = {
            2, 1, 2, 1, 2, 3
        };
        int ai10[] = {
            2, 1, 2, 3, 2, 1
        };
        int ai11[] = {
            2, 3, 2, 1, 2, 1
        };
        int ai12[] = {
            1, 3, 1, 1, 2, 3
        };
        int ai13[] = {
            1, 3, 1, 3, 2, 1
        };
        int ai14[] = {
            1, 1, 2, 3, 1, 3
        };
        int ai15[] = {
            1, 3, 2, 3, 1, 1
        };
        int ai16[] = {
            2, 3, 1, 1, 1, 3
        };
        int ai17[] = {
            2, 3, 1, 3, 1, 1
        };
        int ai18[] = {
            1, 1, 2, 1, 3, 3
        };
        int ai19[] = {
            1, 1, 2, 3, 3, 1
        };
        int ai20[] = {
            1, 3, 2, 1, 3, 1
        };
        int ai21[] = {
            1, 1, 3, 3, 2, 1
        };
        int ai22[] = {
            1, 3, 3, 1, 2, 1
        };
        int ai23[] = {
            2, 1, 3, 1, 1, 3
        };
        int ai24[] = {
            2, 1, 3, 3, 1, 1
        };
        int ai25[] = {
            3, 1, 1, 1, 2, 3
        };
        int ai26[] = {
            3, 1, 2, 1, 1, 3
        };
        int ai27[] = {
            3, 1, 4, 1, 1, 1
        };
        int ai28[] = {
            2, 2, 1, 4, 1, 1
        };
        int ai29[] = {
            4, 3, 1, 1, 1, 1
        };
        int ai30[] = {
            1, 1, 1, 4, 2, 2
        };
        int ai31[] = {
            1, 4, 1, 2, 2, 1
        };
        int ai32[] = {
            1, 4, 2, 1, 1, 2
        };
        int ai33[] = {
            2, 4, 1, 2, 1, 1
        };
        int ai34[] = {
            2, 4, 1, 1, 1, 2
        };
        int ai35[] = {
            1, 3, 4, 1, 1, 1
        };
        int ai36[] = {
            1, 2, 1, 2, 4, 1
        };
        int ai37[] = {
            1, 2, 4, 1, 1, 2
        };
        int ai38[] = {
            1, 2, 4, 2, 1, 1
        };
        int ai39[] = {
            4, 1, 1, 2, 1, 2
        };
        int ai40[] = {
            2, 1, 2, 1, 4, 1
        };
        int ai41[] = {
            1, 1, 1, 1, 4, 3
        };
        int ai42[] = {
            1, 1, 1, 3, 4, 1
        };
        int ai43[] = {
            1, 1, 4, 3, 1, 1
        };
        int ai44[] = {
            3, 1, 1, 1, 4, 1
        };
        int ai45[] = {
            2, 1, 1, 4, 1, 2
        };
        a = (new int[][] {
            ai, new int[] {
                2, 2, 2, 1, 2, 2
            }, new int[] {
                2, 2, 2, 2, 2, 1
            }, ai1, new int[] {
                1, 2, 1, 3, 2, 2
            }, new int[] {
                1, 3, 1, 2, 2, 2
            }, new int[] {
                1, 2, 2, 2, 1, 3
            }, new int[] {
                1, 2, 2, 3, 1, 2
            }, new int[] {
                1, 3, 2, 2, 1, 2
            }, new int[] {
                2, 2, 1, 2, 1, 3
            }, 
            ai2, new int[] {
                2, 3, 1, 2, 1, 2
            }, new int[] {
                1, 1, 2, 2, 3, 2
            }, new int[] {
                1, 2, 2, 1, 3, 2
            }, new int[] {
                1, 2, 2, 2, 3, 1
            }, ai3, ai4, ai5, new int[] {
                2, 2, 3, 2, 1, 1
            }, ai6, 
            new int[] {
                2, 2, 1, 2, 3, 1
            }, new int[] {
                2, 1, 3, 2, 1, 2
            }, new int[] {
                2, 2, 3, 1, 1, 2
            }, new int[] {
                3, 1, 2, 1, 3, 1
            }, ai7, new int[] {
                3, 2, 1, 1, 2, 2
            }, new int[] {
                3, 2, 1, 2, 2, 1
            }, new int[] {
                3, 1, 2, 2, 1, 2
            }, ai8, new int[] {
                3, 2, 2, 2, 1, 1
            }, 
            ai9, ai10, ai11, new int[] {
                1, 1, 1, 3, 2, 3
            }, ai12, ai13, ai14, new int[] {
                1, 3, 2, 1, 1, 3
            }, ai15, new int[] {
                2, 1, 1, 3, 1, 3
            }, 
            ai16, ai17, ai18, ai19, ai20, new int[] {
                1, 1, 3, 1, 2, 3
            }, ai21, ai22, new int[] {
                3, 1, 3, 1, 2, 1
            }, new int[] {
                2, 1, 1, 3, 3, 1
            }, 
            new int[] {
                2, 3, 1, 1, 3, 1
            }, ai23, ai24, new int[] {
                2, 1, 3, 1, 3, 1
            }, ai25, new int[] {
                3, 1, 1, 3, 2, 1
            }, new int[] {
                3, 3, 1, 1, 2, 1
            }, ai26, new int[] {
                3, 1, 2, 3, 1, 1
            }, new int[] {
                3, 3, 2, 1, 1, 1
            }, 
            ai27, ai28, ai29, new int[] {
                1, 1, 1, 2, 2, 4
            }, ai30, new int[] {
                1, 2, 1, 1, 2, 4
            }, new int[] {
                1, 2, 1, 4, 2, 1
            }, new int[] {
                1, 4, 1, 1, 2, 2
            }, ai31, new int[] {
                1, 1, 2, 2, 1, 4
            }, 
            new int[] {
                1, 1, 2, 4, 1, 2
            }, new int[] {
                1, 2, 2, 1, 1, 4
            }, new int[] {
                1, 2, 2, 4, 1, 1
            }, ai32, new int[] {
                1, 4, 2, 2, 1, 1
            }, ai33, new int[] {
                2, 2, 1, 1, 1, 4
            }, new int[] {
                4, 1, 3, 1, 1, 1
            }, ai34, ai35, 
            new int[] {
                1, 1, 1, 2, 4, 2
            }, new int[] {
                1, 2, 1, 1, 4, 2
            }, ai36, new int[] {
                1, 1, 4, 2, 1, 2
            }, ai37, ai38, ai39, new int[] {
                4, 2, 1, 1, 1, 2
            }, new int[] {
                4, 2, 1, 2, 1, 1
            }, ai40, 
            new int[] {
                2, 1, 4, 1, 2, 1
            }, new int[] {
                4, 1, 2, 1, 2, 1
            }, ai41, ai42, new int[] {
                1, 3, 1, 1, 4, 1
            }, new int[] {
                1, 1, 4, 1, 1, 3
            }, ai43, new int[] {
                4, 1, 1, 1, 1, 3
            }, new int[] {
                4, 1, 1, 3, 1, 1
            }, new int[] {
                1, 1, 3, 1, 4, 1
            }, 
            new int[] {
                1, 1, 4, 1, 3, 1
            }, ai44, new int[] {
                4, 1, 1, 1, 3, 1
            }, ai45, new int[] {
                2, 1, 1, 2, 1, 4
            }, new int[] {
                2, 1, 1, 2, 3, 2
            }, new int[] {
                2, 3, 3, 1, 1, 1, 2
            }
        });
    }
}
