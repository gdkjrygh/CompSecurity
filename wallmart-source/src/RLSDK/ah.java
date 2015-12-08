// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            v, bc, af, az, 
//            bb, ak, ap

public final class ah
{

    private static final int a[] = {
        0, 104, 240, 408, 608
    };
    private static final int b[] = {
        0, 128, 288, 480, 704, 960, 1248, 1568, 1920, 2304, 
        2720, 3168, 3648, 4160, 4704, 5280, 5888, 6528, 7200, 7904, 
        8640, 9408, 10208, 11040, 11904, 12800, 13728, 14688, 15680, 16704, 
        17760, 18848, 19968
    };
    private static final int c[] = {
        0, 17, 40, 51, 76
    };
    private static final int d[] = {
        0, 21, 48, 60, 88, 120, 156, 196, 240, 230, 
        272, 316, 364, 416, 470, 528, 588, 652, 720, 790, 
        864, 940, 1020, 920, 992, 1066, 1144, 1224, 1306, 1392, 
        1480, 1570, 1664
    };
    private static final String e[] = {
        "CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", 
        "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
        "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", 
        "CTRL_DL", "CTRL_BS"
    };
    private static final String f[] = {
        "CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", 
        "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", 
        "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", 
        "CTRL_DL", "CTRL_BS"
    };
    private static final String g[] = {
        "CTRL_PS", " ", "\001", "\002", "\003", "\004", "\005", "\006", "\007", "\b", 
        "\t", "\n", "\013", "\f", "\r", "\033", "\034", "\035", "\036", "\037", 
        "@", "\\", "^", "_", "`", "|", "~", "\177", "CTRL_LL", "CTRL_UL", 
        "CTRL_PL", "CTRL_BS"
    };
    private static final String h[] = {
        "", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", 
        "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", 
        "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", 
        "}", "CTRL_UL"
    };
    private static final String i[] = {
        "CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", 
        "8", "9", ",", ".", "CTRL_UL", "CTRL_US"
    };
    private int j;
    private int k;
    private af l;
    private int m;

    public ah()
    {
    }

    private static int a(boolean aflag[], int i1, int j1)
    {
        int k1 = 0;
        for (int l1 = i1; l1 < i1 + j1; l1++)
        {
            int i2 = k1 << 1;
            k1 = i2;
            if (aflag[l1])
            {
                k1 = i2 + 1;
            }
        }

        return k1;
    }

    private boolean[] a(boolean aflag[])
        throws v
    {
        az az1;
        int ai[];
        int i1;
        int j1;
        int j3;
        if (l.a() <= 2)
        {
            k = 6;
            az1 = az.c;
        } else
        if (l.a() <= 8)
        {
            k = 8;
            az1 = az.g;
        } else
        if (l.a() <= 22)
        {
            k = 10;
            az1 = az.b;
        } else
        {
            k = 12;
            az1 = az.a;
        }
        j3 = l.b();
        if (l.c())
        {
            i1 = a[l.a()] - j * k;
            j1 = c[l.a()] - j3;
        } else
        {
            i1 = b[l.a()] - j * k;
            j1 = d[l.a()] - j3;
        }
        ai = new int[j];
        for (int l1 = 0; l1 < j; l1++)
        {
            int j2 = 1;
            int l2 = 1;
            for (; j2 <= k; j2++)
            {
                if (aflag[((k * l1 + k) - j2) + i1])
                {
                    ai[l1] = ai[l1] + l2;
                }
                l2 <<= 1;
            }

        }

        int i2;
        try
        {
            (new bb(az1)).a(ai, j1);
        }
        // Misplaced declaration of an exception variable
        catch (boolean aflag[])
        {
            throw v.a();
        }
        m = 0;
        aflag = new boolean[k * j3];
        i2 = 0;
        i1 = 0;
        for (; i2 < j3; i2++)
        {
            int k1 = k;
            int k2 = 0;
            int i3 = 1 << k1 - 1;
            k1 = 0;
            boolean flag = false;
            while (k2 < k) 
            {
                boolean flag1;
                if ((ai[i2] & i3) == i3)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (k1 == k - 1)
                {
                    if (flag1 == flag)
                    {
                        throw v.a();
                    }
                    i1++;
                    m = m + 1;
                    flag = false;
                    k1 = 0;
                } else
                {
                    if (flag == flag1)
                    {
                        k1++;
                    } else
                    {
                        flag = flag1;
                        k1 = 1;
                    }
                    aflag[(k * i2 + k2) - i1] = flag1;
                }
                i3 >>>= 1;
                k2++;
            }
        }

        return aflag;
    }

    public final ap a(af af1)
        throws v
    {
        boolean aflag[];
        StringBuffer stringbuffer;
        int k1;
        int i2;
        int k2;
        int i3;
        int i4;
        int k4;
        int k5;
        l = af1;
        af1 = af1.d();
        if (!l.c())
        {
            ak ak1 = l.d();
            int i1 = ((ak1.a - 1) / 2 / 16) * 2 + 1;
            af1 = new ak(ak1.a - i1, ak1.b - i1);
            int l1 = 0;
            for (int j1 = 0; j1 < ak1.a;)
            {
                int j2 = l1;
                if ((ak1.a / 2 - j1) % 16 != 0)
                {
                    int l2 = 0;
                    for (j2 = 0; j2 < ak1.b;)
                    {
                        int j3 = l2;
                        if ((ak1.a / 2 - j2) % 16 != 0)
                        {
                            if (ak1.a(j1, j2))
                            {
                                af1.b(l1, l2);
                            }
                            j3 = l2 + 1;
                        }
                        j2++;
                        l2 = j3;
                    }

                    j2 = l1 + 1;
                }
                j1++;
                l1 = j2;
            }

        }
        if (l.c())
        {
            if (l.a() > a.length)
            {
                throw v.a();
            }
            aflag = new boolean[a[l.a()]];
            j = c[l.a()];
        } else
        {
            if (l.a() > b.length)
            {
                throw v.a();
            }
            aflag = new boolean[b[l.a()]];
            j = d[l.a()];
        }
        i2 = l.a();
        k1 = ((ak) (af1)).b;
        k2 = 0;
        i3 = 0;
        while (i2 != 0) 
        {
            int j4 = 0;
            for (int k3 = 0; k3 < k1 * 2 - 4; k3++)
            {
                aflag[k2 + k3] = af1.a(i3 + j4, k3 / 2 + i3);
                aflag[((k1 * 2 + k2) - 4) + k3] = af1.a(k3 / 2 + i3, (i3 + k1) - 1 - j4);
                j4 = (j4 + 1) % 2;
            }

            j4 = 0;
            for (int l3 = k1 * 2 + 1; l3 > 5; l3--)
            {
                aflag[((k1 * 4 + k2) - 8) + (k1 * 2 - l3) + 1] = af1.a((i3 + k1) - 1 - j4, (l3 / 2 + i3) - 1);
                aflag[((k1 * 6 + k2) - 12) + (k1 * 2 - l3) + 1] = af1.a((l3 / 2 + i3) - 1, i3 + j4);
                j4 = (j4 + 1) % 2;
            }

            i3 += 2;
            k2 += k1 * 8 - 16;
            i2--;
            k1 -= 4;
        }
        aflag = a(aflag);
        k5 = k * l.b() - m;
        if (k5 > aflag.length)
        {
            throw v.a();
        }
        k4 = 0;
        stringbuffer = new StringBuffer(20);
        k2 = 0;
        i2 = 0;
        i4 = 0;
        i3 = 0;
        k1 = 0;
_L7:
        if (k2 != 0) goto _L2; else goto _L1
_L1:
        int l4;
        if (i2 != 0)
        {
            i4 = k4;
            k4 = 1;
        } else
        {
            k4 = i4;
            i4 = k1;
        }
        k1;
        JVM INSTR tableswitch 5 5: default 672
    //                   5 774;
           goto _L3 _L4
_L3:
        l4 = 5;
        if (k1 == 3)
        {
            l4 = 4;
        }
        if (k5 - i3 >= l4) goto _L6; else goto _L5
_L5:
        boolean flag = true;
        k2 = i3;
        l4 = i2;
        i2 = ((flag) ? 1 : 0);
        i3 = k1;
        k1 = k2;
        k2 = l4;
_L8:
        int j5;
        if (k4 != 0)
        {
            l4 = 0;
            k2 = i2;
            i2 = i4;
            boolean flag1 = false;
            k4 = i4;
            i3 = k1;
            k1 = i2;
            i2 = l4;
            i4 = ((flag1) ? 1 : 0);
        } else
        {
            int i5 = i2;
            boolean flag3 = k4;
            k4 = i4;
            i2 = k2;
            k2 = i3;
            i3 = k1;
            k1 = k2;
            i4 = ((flag3) ? 1 : 0);
            k2 = i5;
        }
          goto _L7
_L4:
        if (k5 - i3 < 8)
        {
            boolean flag2 = true;
            l4 = k1;
            k1 = i3;
            k2 = i2;
            i3 = l4;
            i2 = ((flag2) ? 1 : 0);
        } else
        {
            stringbuffer.append((char)a(aflag, i3, 8));
            l4 = k2;
            k2 = i2;
            i2 = k1;
            k1 = i3 + 8;
            i3 = i2;
            i2 = l4;
        }
          goto _L8
_L6:
        j5 = a(aflag, i3, l4);
        l4 += i3;
        k1;
        JVM INSTR tableswitch 0 4: default 908
    //                   0 1029
    //                   1 1039
    //                   2 1049
    //                   3 1069
    //                   4 1059;
           goto _L9 _L10 _L11 _L12 _L13 _L14
_L9:
        af1 = "";
_L26:
        if (!af1.startsWith("CTRL_")) goto _L16; else goto _L15
_L15:
        i3 = af1.charAt(5);
        k1 = 0;
        i3;
        JVM INSTR lookupswitch 6: default 992
    //                   66: 1109
    //                   68: 1103
    //                   76: 1085
    //                   77: 1097
    //                   80: 1091
    //                   85: 1079;
           goto _L17 _L18 _L19 _L20 _L21 _L22 _L23
_L17:
        i3 = k1;
        if (af1.charAt(6) != 'S') goto _L25; else goto _L24
_L24:
        j5 = 1;
        i3 = k1;
        k1 = l4;
        i2 = k2;
        k2 = j5;
          goto _L8
_L10:
        af1 = e[j5];
          goto _L26
_L11:
        af1 = f[j5];
          goto _L26
_L12:
        af1 = g[j5];
          goto _L26
_L14:
        af1 = h[j5];
          goto _L26
_L13:
        af1 = i[j5];
          goto _L26
_L23:
        k1 = 0;
          goto _L17
_L20:
        k1 = 1;
          goto _L17
_L22:
        k1 = 4;
          goto _L17
_L21:
        k1 = 2;
          goto _L17
_L19:
        k1 = 3;
          goto _L17
_L18:
        k1 = 5;
          goto _L17
_L16:
        stringbuffer.append(af1);
        i3 = k1;
_L25:
        k1 = l4;
        l4 = k2;
        k2 = i2;
        i2 = l4;
          goto _L8
_L2:
        return new ap(null, stringbuffer.toString(), null, null);
    }

}
