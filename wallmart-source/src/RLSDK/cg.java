// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package RLSDK:
//            bz, y, cb, ce, 
//            ca, aj, cf, cq, 
//            q, ab, ad

public final class cg extends bz
{

    private static final int g[] = {
        7, 5, 4, 3, 1
    };
    private static final int h[] = {
        4, 20, 52, 104, 204
    };
    private static final int i[] = {
        0, 348, 1388, 2948, 3988
    };
    private static final int j[][];
    private static final int k[][];
    private static final int l[][];
    private static final int m;
    private final Vector n = new Vector(11);
    private final int o[] = new int[2];
    private final int p[];

    public cg()
    {
        p = new int[m];
    }

    private ca a(aj aj1, cb cb1, boolean flag, boolean flag1)
        throws y
    {
        int ai1[];
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        int j4;
        int k4;
        int l4;
        int ai[] = b;
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        ai[4] = 0;
        ai[5] = 0;
        ai[6] = 0;
        ai[7] = 0;
        float f;
        float af[];
        float af1[];
        int k1;
        if (flag1)
        {
            b(aj1, cb1.b()[0], ai);
        } else
        {
            a(aj1, cb1.b()[1] + 1, ai);
            int l1 = 0;
            i1 = ai.length - 1;
            while (l1 < i1) 
            {
                j2 = ai[l1];
                ai[l1] = ai[i1];
                ai[i1] = j2;
                l1++;
                i1--;
            }
        }
        f = (float)a(ai) / 17F;
        aj1 = e;
        ai1 = this.f;
        af = c;
        af1 = d;
        k1 = 0;
        while (k1 < ai.length) 
        {
            float f1 = (1.0F * (float)ai[k1]) / f;
            int j2 = (int)(0.5F + f1);
            int i1;
            if (j2 <= 0)
            {
                i1 = 1;
            } else
            {
                i1 = j2;
                if (j2 > 8)
                {
                    i1 = 8;
                }
            }
            j2 = k1 >> 1;
            if ((k1 & 1) == 0)
            {
                aj1[j2] = i1;
                af[j2] = f1 - (float)i1;
            } else
            {
                ai1[j2] = i1;
                af1[j2] = f1 - (float)i1;
            }
            k1++;
        }
        j4 = a(e);
        k4 = a(this.f);
        l4 = (j4 + k4) - 17;
        if ((j4 & 1) == 1)
        {
            flag7 = true;
        } else
        {
            flag7 = false;
        }
        if ((k4 & 1) == 0)
        {
            flag6 = true;
        } else
        {
            flag6 = false;
        }
        flag3 = false;
        flag4 = false;
        if (j4 <= 13) goto _L2; else goto _L1
_L1:
        flag2 = true;
_L6:
        flag5 = false;
        boolean flag8 = false;
        if (k4 > 13)
        {
            flag4 = true;
        } else
        {
            flag4 = flag8;
            if (k4 < 4)
            {
                flag5 = true;
                flag4 = flag8;
            }
        }
        if (l4 == 1)
        {
            if (flag7)
            {
                if (flag6)
                {
                    throw y.a();
                }
                flag2 = true;
            } else
            {
                if (!flag6)
                {
                    throw y.a();
                }
                flag4 = true;
            }
        } else
        if (l4 == -1)
        {
            if (flag7)
            {
                if (flag6)
                {
                    throw y.a();
                }
                flag3 = true;
            } else
            {
                if (!flag6)
                {
                    throw y.a();
                }
                flag5 = true;
            }
        } else
        if (l4 == 0)
        {
            if (!flag7)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!flag6)
            {
                throw y.a();
            }
            if (j4 < k4)
            {
                flag3 = true;
                flag4 = true;
            } else
            {
                flag2 = true;
                flag5 = true;
            }
        } else
        {
            throw y.a();
        }
          goto _L3
_L2:
        flag2 = flag4;
        if (j4 < 4)
        {
            flag3 = true;
            flag2 = flag4;
        }
        continue; /* Loop/switch isn't completed */
        if (!flag6) goto _L3; else goto _L4
_L4:
        throw y.a();
_L3:
        if (flag3)
        {
            if (flag2)
            {
                throw y.a();
            }
            a(e, c);
        }
        if (flag2)
        {
            b(e, c);
        }
        if (flag5)
        {
            if (flag4)
            {
                throw y.a();
            }
            a(this.f, c);
        }
        if (flag4)
        {
            b(this.f, d);
        }
        int k2 = cb1.a();
        int j1;
        int i2;
        int i4;
        if (flag)
        {
            j1 = 0;
        } else
        {
            j1 = 2;
        }
        if (flag1)
        {
            i2 = 0;
        } else
        {
            i2 = 1;
        }
        i4 = (i2 + (k2 * 4 + j1)) - 1;
        j1 = aj1.length;
        i2 = 0;
        k2 = j1 - 1;
        int l2;
        for (j1 = 0; k2 >= 0; j1 = l2)
        {
            l2 = j1;
            if (a(cb1, flag, flag1))
            {
                l2 = j1 + k[i4][k2 * 2] * aj1[k2];
            }
            j1 = aj1[k2];
            k2--;
            i2 = j1 + i2;
        }

        k2 = 0;
        for (int i3 = ai1.length - 1; i3 >= 0;)
        {
            int k3 = k2;
            if (a(cb1, flag, flag1))
            {
                k3 = k2 + k[i4][i3 * 2 + 1] * ai1[i3];
            }
            i3--;
            k2 = k3;
        }

        if ((i2 & 1) != 0 || i2 > 13 || i2 < 4)
        {
            throw y.a();
        }
        i2 = (13 - i2) / 2;
        int l3 = g[i2];
        int j3 = ce.a(aj1, l3, true);
        l3 = ce.a(ai1, 9 - l3, false);
        i4 = h[i2];
        return new ca(i[i2] + (j3 * i4 + l3), j1 + k2);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private cb a(aj aj1, int i1, boolean flag)
    {
        int j1;
        int k1;
        int l1;
        if (flag)
        {
            for (j1 = o[0] - 1; j1 >= 0 && !aj1.a(j1); j1--) { }
            j1++;
            l1 = o[0] - j1;
            k1 = o[1];
        } else
        {
            int j2 = o[0];
            for (j1 = o[1] + 1; aj1.a(j1) && j1 < aj1.b; j1++) { }
            l1 = o[1];
            k1 = j1;
            l1 = j1 - l1;
            j1 = j2;
        }
        aj1 = a;
        for (int i2 = aj1.length - 1; i2 > 0; i2--)
        {
            aj1[i2] = aj1[i2 - 1];
        }

        aj1[0] = l1;
        try
        {
            l1 = a(((int []) (aj1)), j);
        }
        // Misplaced declaration of an exception variable
        catch (aj aj1)
        {
            return null;
        }
        return new cb(l1, new int[] {
            j1, k1
        }, j1, k1, i1);
    }

    private cf a(aj aj1, Vector vector, int i1)
        throws y
    {
        cb cb1;
        int j1;
        int l1;
        int i2;
        int j2;
        int k2;
        boolean flag2;
        int j3;
        boolean flag5;
        if (vector.size() % 2 == 0)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        j2 = 1;
        j1 = -1;
_L17:
        int l2;
        int i3;
        cb1 = a;
        cb1[0] = 0;
        cb1[1] = 0;
        cb1[2] = 0;
        cb1[3] = 0;
        j3 = aj1.b;
        if (j1 >= 0)
        {
            l1 = j1;
        } else
        if (vector.isEmpty())
        {
            l1 = 0;
        } else
        {
            l1 = ((cf)vector.lastElement()).d().b()[1];
        }
        if (vector.size() % 2 != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        i2 = 0;
        do
        {
            k2 = i2;
            if (l1 >= j3)
            {
                break;
            }
            if (!aj1.a(l1))
            {
                i2 = 1;
            } else
            {
                i2 = 0;
            }
            k2 = i2;
            if (!i2)
            {
                break;
            }
            l1++;
        } while (true);
        i2 = l1;
        i3 = 0;
        l2 = k2;
        k2 = i2;
_L5:
        if (k2 >= j3) goto _L2; else goto _L1
_L1:
        if ((aj1.a(k2) ^ l2) == 0) goto _L4; else goto _L3
_L3:
        cb1[i3] = cb1[i3] + 1;
        i2 = l2;
        l2 = l1;
_L12:
        k2++;
        l1 = l2;
        l2 = i2;
          goto _L5
_L4:
        if (i3 != 3) goto _L7; else goto _L6
_L6:
        if (flag2)
        {
            c(cb1);
        }
        if (!b(cb1)) goto _L9; else goto _L8
_L8:
        o[0] = l1;
        o[1] = k2;
        cb1 = a(aj1, i1, flag5);
        if (cb1 != null) goto _L11; else goto _L10
_L9:
        if (flag2)
        {
            c(cb1);
        }
        i2 = l1 + (cb1[0] + cb1[1]);
        cb1[0] = cb1[2];
        cb1[1] = cb1[3];
        cb1[2] = 0;
        cb1[3] = 0;
        l1 = i3 - 1;
_L13:
        cb1[l1] = 1;
        if (l2 == 0)
        {
            boolean flag3 = true;
            l2 = i2;
            i3 = l1;
            i2 = ((flag3) ? 1 : 0);
        } else
        {
            boolean flag4 = false;
            l2 = i2;
            i3 = l1;
            i2 = ((flag4) ? 1 : 0);
        }
          goto _L12
_L7:
        i3++;
        i2 = l1;
        l1 = i3;
          goto _L13
_L2:
        throw y.a();
_L10:
        boolean flag;
        j1 = o[0];
        boolean flag6;
        for (flag6 = aj1.a(j1); j1 < aj1.b && aj1.a(j1) == flag6; j1++) { }
        if (!flag6)
        {
            flag6 = true;
        } else
        {
            flag6 = false;
        }
        for (; j1 < aj1.b && aj1.a(j1) == flag6; j1++) { }
        flag = j2;
_L15:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_739;
        }
        j2 = vector.size() + 1;
        if (j2 > p.length)
        {
            throw y.a();
        }
        break; /* Loop/switch isn't completed */
_L11:
        flag = false;
        if (true) goto _L15; else goto _L14
_L14:
        for (i1 = 0; i1 < vector.size(); i1++)
        {
            p[i1] = ((cf)vector.elementAt(i1)).d().a();
        }

        p[j2 - 1] = cb1.a();
label0:
        for (i1 = 0; i1 < l.length; i1++)
        {
            vector = l[i1];
            if (vector.length < j2)
            {
                continue;
            }
            boolean flag1 = true;
            int k1 = 0;
            do
            {
label1:
                {
                    flag = flag1;
                    if (k1 < j2)
                    {
                        if (p[k1] == vector[k1])
                        {
                            break label1;
                        }
                        flag = false;
                    }
                    if (!flag)
                    {
                        continue label0;
                    }
                    boolean flag7;
                    if (j2 == vector.length)
                    {
                        flag7 = true;
                    } else
                    {
                        flag7 = false;
                    }
                    vector = a(aj1, cb1, flag5, true);
                    try
                    {
                        aj1 = a(aj1, cb1, flag5, false);
                    }
                    // Misplaced declaration of an exception variable
                    catch (aj aj1)
                    {
                        if (flag7)
                        {
                            aj1 = null;
                        } else
                        {
                            throw aj1;
                        }
                    }
                    return new cf(vector, aj1, cb1, flag7);
                }
                k1++;
            } while (true);
        }

        throw y.a();
        j2 = ((flag) ? 1 : 0);
        if (true) goto _L17; else goto _L16
_L16:
    }

    private static boolean a(cb cb1, boolean flag, boolean flag1)
    {
        return cb1.a() != 0 || !flag || !flag1;
    }

    private static void c(int ai[])
    {
        int j1 = ai.length;
        for (int i1 = 0; i1 < j1 / 2; i1++)
        {
            int k1 = ai[i1];
            ai[i1] = ai[j1 - i1 - 1];
            ai[j1 - i1 - 1] = k1;
        }

    }

    public final ab a(int i1, aj aj1, Hashtable hashtable)
        throws y
    {
        a();
        do
        {
            do
            {
                hashtable = a(aj1, n, i1);
                n.addElement(hashtable);
            } while (!hashtable.a());
            cf cf2 = (cf)n.elementAt(0);
            ca ca1 = cf2.b();
            int j1 = cf2.c().b();
            int l2 = 1;
            int i2 = 2;
            for (; l2 < n.size(); l2++)
            {
                cf cf3 = (cf)n.elementAt(l2);
                int k3 = j1 + cf3.b().b();
                int i4 = i2 + 1;
                i2 = i4;
                j1 = k3;
                if (cf3.c() != null)
                {
                    j1 = k3 + cf3.c().b();
                    i2 = i4 + 1;
                }
            }

            if (j1 % 211 + (i2 - 4) * 211 == ca1.a())
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 != 0)
            {
                aj1 = n;
                hashtable = n;
                i1 = (hashtable.size() << 1) - 1;
                if (((cf)hashtable.lastElement()).c() == null)
                {
                    i1--;
                }
                aj1 = new aj(i1 * 12);
                int j2 = ((cf)hashtable.elementAt(0)).c().a();
                i1 = 0;
                for (j1 = 11; j1 >= 0; j1--)
                {
                    if ((1 << j1 & j2) != 0)
                    {
                        aj1.b(i1);
                    }
                    i1++;
                }

                break;
            }
            if (hashtable.e())
            {
                throw y.a();
            }
        } while (true);
        for (int k2 = 1; k2 < hashtable.size();)
        {
            cf cf1 = (cf)hashtable.elementAt(k2);
            int i3 = cf1.b().a();
            for (int k1 = 11; k1 >= 0; k1--)
            {
                if ((1 << k1 & i3) != 0)
                {
                    aj1.b(i1);
                }
                i1++;
            }

            int l1;
            if (cf1.c() != null)
            {
                int l3 = cf1.c().a();
                int j3 = 11;
                do
                {
                    l1 = i1;
                    if (j3 < 0)
                    {
                        break;
                    }
                    if ((1 << j3 & l3) != 0)
                    {
                        aj1.b(i1);
                    }
                    i1++;
                    j3--;
                } while (true);
            } else
            {
                l1 = i1;
            }
            k2++;
            i1 = l1;
        }

        aj1 = cq.a(aj1).a();
        ad aad[] = ((cf)hashtable.elementAt(0)).d().c();
        ad aad1[] = ((cf)hashtable.lastElement()).d().c();
        hashtable = aad[0];
        ad ad1 = aad[1];
        ad ad2 = aad1[0];
        ad ad3 = aad1[1];
        q q1 = q.m;
        return new ab(aj1, null, new ad[] {
            hashtable, ad1, ad2, ad3
        }, q1);
    }

    public final void a()
    {
        n.setSize(0);
    }

    static 
    {
        Object obj = {
            3, 6, 4, 1
        };
        j = (new int[][] {
            new int[] {
                1, 8, 4, 1
            }, obj, new int[] {
                3, 4, 6, 1
            }, new int[] {
                3, 2, 8, 1
            }, new int[] {
                2, 6, 5, 1
            }, new int[] {
                2, 2, 9, 1
            }
        });
        obj = (new int[] {
            20, 60, 180, 118, 143, 7, 21, 63
        });
        int ai[] = {
            189, 145, 13, 39, 117, 140, 209, 205
        };
        int ai1[] = {
            62, 186, 136, 197, 169, 85, 44, 132
        };
        int ai2[] = {
            185, 133, 188, 142, 4, 12, 36, 108
        };
        int ai3[] = {
            113, 128, 173, 97, 80, 29, 87, 50
        };
        int ai4[] = {
            150, 28, 84, 41, 123, 158, 52, 156
        };
        int ai5[] = {
            109, 116, 137, 200, 178, 112, 125, 164
        };
        int ai6[] = {
            6, 18, 54, 162, 64, 192, 154, 40
        };
        k = (new int[][] {
            new int[] {
                1, 3, 9, 27, 81, 32, 96, 77
            }, obj, ai, new int[] {
                193, 157, 49, 147, 19, 57, 171, 91
            }, ai1, ai2, ai3, ai4, new int[] {
                46, 138, 203, 187, 139, 206, 196, 166
            }, new int[] {
                76, 17, 51, 153, 37, 111, 122, 155
            }, new int[] {
                43, 129, 176, 106, 107, 110, 119, 146
            }, new int[] {
                16, 48, 144, 10, 30, 90, 59, 177
            }, ai5, new int[] {
                70, 210, 208, 202, 184, 130, 179, 115
            }, new int[] {
                134, 191, 151, 31, 93, 68, 204, 190
            }, new int[] {
                148, 22, 66, 198, 172, 94, 71, 2
            }, ai6, new int[] {
                120, 149, 25, 75, 14, 42, 126, 167
            }, new int[] {
                79, 26, 78, 23, 69, 207, 199, 175
            }, new int[] {
                103, 98, 83, 38, 114, 131, 182, 124
            }, new int[] {
                161, 61, 183, 127, 170, 88, 53, 159
            }, new int[] {
                55, 165, 73, 8, 24, 72, 5, 15
            }, new int[] {
                45, 135, 194, 160, 58, 174, 100, 89
            }
        });
        obj = new int[10][];
        obj[0] = (new int[] {
            0, 0
        });
        obj[1] = (new int[] {
            0, 1, 1
        });
        obj[2] = (new int[] {
            0, 2, 1, 3
        });
        obj[3] = (new int[] {
            0, 4, 1, 3, 2
        });
        obj[4] = (new int[] {
            0, 4, 1, 3, 3, 5
        });
        obj[5] = (new int[] {
            0, 4, 1, 3, 4, 5, 5
        });
        obj[6] = (new int[] {
            0, 0, 1, 1, 2, 2, 3, 3
        });
        obj[7] = (new int[] {
            0, 0, 1, 1, 2, 2, 3, 4, 4
        });
        obj[8] = (new int[] {
            0, 0, 1, 1, 2, 2, 3, 4, 5, 5
        });
        obj[9] = (new int[] {
            0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 
            5
        });
        l = ((int [][]) (obj));
        m = obj[obj.length - 1].length;
    }
}
