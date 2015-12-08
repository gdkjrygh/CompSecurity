// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.b;
import com.google.zxing.common.d;
import com.google.zxing.g;
import com.google.zxing.pdf417.decoder.a.a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.zxing.pdf417.decoder:
//            DecodedBitStreamParser, c, h, a, 
//            f, g, d, b, 
//            i

public final class j
{

    private static final a a = new a();

    private static d a(int k, int ai[], int ai1[], int ai2[], int ai3[][])
    {
        int ai4[];
        int l;
        ai4 = new int[ai2.length];
        l = 100;
_L6:
        int i1 = l - 1;
        if (l <= 0) goto _L2; else goto _L1
_L1:
        for (l = 0; l < ai4.length; l++)
        {
            ai[ai2[l]] = ai3[l][ai4[l]];
        }

        ChecksumException checksumexception;
        if (ai.length == 0)
        {
            throw FormatException.getFormatInstance();
        }
        l = 1 << k + 1;
        if (ai1 == null) goto _L4; else goto _L3
_L3:
        if (ai1.length > l / 2 + 3) goto _L5; else goto _L4
_L5:
        throw ChecksumException.getChecksumInstance();
_L8:
        int j1;
        j1 = a.a(ai, l, ai1);
        if (ai.length < 4)
        {
            throw FormatException.getFormatInstance();
        }
        int k1 = ai[0];
        if (k1 > ai.length)
        {
            throw FormatException.getFormatInstance();
        }
        if (k1 != 0)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        if (l >= ai.length)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        ai[0] = ai.length - l;
        d d1;
        d1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.a(ai, String.valueOf(k));
        d1.a(Integer.valueOf(j1));
        d1.b(Integer.valueOf(ai1.length));
        return d1;
        try
        {
            throw FormatException.getFormatInstance();
        }
        // Misplaced declaration of an exception variable
        catch (ChecksumException checksumexception)
        {
            if (ai4.length == 0)
            {
                throw ChecksumException.getChecksumInstance();
            }
        }
        l = 0;
_L7:
label0:
        {
            if (l >= ai4.length)
            {
                break MISSING_BLOCK_LABEL_278;
            }
            if (ai4[l] >= ai3[l].length - 1)
            {
                break label0;
            }
            ai4[l] = ai4[l] + 1;
            l = i1;
        }
          goto _L6
        ai4[l] = 0;
        if (l == ai4.length - 1)
        {
            throw ChecksumException.getChecksumInstance();
        }
        l++;
          goto _L7
        l = i1;
          goto _L6
_L2:
        throw ChecksumException.getChecksumInstance();
_L4:
        if (l >= 0 && l <= 512) goto _L8; else goto _L5
    }

    public static d a(b b1, g g1, g g2, g g3, g g4, int k, int l)
    {
        Object obj;
        c c1;
        int i1;
        c1 = new c(b1, g1, g2, g3, g4);
        g2 = null;
        i1 = 0;
        obj = null;
        g4 = null;
_L8:
        if (i1 >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (g1 != null)
        {
            g4 = a(b1, c1, g1, true, k, l);
        }
        int ai[];
        Object obj1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        boolean flag;
        boolean flag1;
        if (g3 != null)
        {
            obj = a(b1, c1, g3, false, k, l);
        } else
        {
            obj = g2;
        }
        if (g4 != null || obj != null) goto _L2; else goto _L1
_L1:
        g2 = null;
_L5:
        if (g2 == null)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        break MISSING_BLOCK_LABEL_240;
_L2:
        if (g4 != null && g4.d() != null) goto _L4; else goto _L3
_L3:
        if (obj == null)
        {
            g2 = null;
        } else
        {
            g2 = ((h) (obj)).d();
        }
_L6:
        if (g2 == null)
        {
            g2 = null;
        } else
        {
            g2 = new f(g2, com.google.zxing.pdf417.decoder.c.a(a(((h) (g4))), a(((h) (obj)))));
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (obj == null || ((h) (obj)).d() == null)
        {
            if (g4 == null)
            {
                g2 = null;
            } else
            {
                g2 = g4.d();
            }
        } else
        {
            g2 = g4.d();
            obj1 = ((h) (obj)).d();
            if (g2.() != ((com.google.zxing.pdf417.decoder.a) (obj1)).() && g2.b() != ((com.google.zxing.pdf417.decoder.a) (obj1)).b() && g2.c() != ((com.google.zxing.pdf417.decoder.a) (obj1)).c())
            {
                g2 = null;
            }
        }
          goto _L6
label0:
        {
            if (i1 != 0 || g2.e() == null || g2.e().c() >= c1.c() && g2.e().d() <= c1.d())
            {
                break label0;
            }
            c1 = g2.e();
            i1++;
            obj1 = obj;
            obj = g2;
            g2 = ((g) (obj1));
        }
        if (true) goto _L8; else goto _L7
        g2.a(c1);
        g1 = g2;
_L20:
        i3 = g1.b() + 1;
        g1.a(0, g4);
        g1.a(i3, ((com.google.zxing.pdf417.decoder.g) (obj)));
        if (g4 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = 1;
        k1 = l;
        l1 = k;
_L17:
        if (i1 > i3) goto _L10; else goto _L9
_L9:
        if (flag)
        {
            j1 = i1;
        } else
        {
            j1 = i3 - i1;
        }
        k = l1;
        i2 = k1;
        if (g1.a(j1) != null) goto _L12; else goto _L11
_L11:
        if (j1 == 0 || j1 == i3)
        {
            if (j1 == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            g2 = new h(c1, flag1);
        } else
        {
            g2 = new com.google.zxing.pdf417.decoder.g(c1);
        }
        g1.a(j1, g2);
        j2 = c1.c();
        l = -1;
        k = l1;
        i2 = k1;
        if (j2 > c1.d()) goto _L12; else goto _L13
_L13:
        if (flag)
        {
            k = 1;
        } else
        {
            k = -1;
        }
        g3 = null;
        if (a(((f) (g1)), j1 - k))
        {
            g3 = g1.a(j1 - k).c(j2);
        }
        if (g3 != null)
        {
            if (flag)
            {
                k = g3.e();
            } else
            {
                k = g3.d();
            }
        } else
        {
            g3 = g1.a(j1).a(j2);
            if (g3 != null)
            {
                if (flag)
                {
                    k = g3.d();
                } else
                {
                    k = g3.e();
                }
            } else
            {
label1:
                {
                    if (a(((f) (g1)), j1 - k))
                    {
                        g3 = g1.a(j1 - k).a(j2);
                    }
                    if (g3 == null)
                    {
                        break label1;
                    }
                    if (flag)
                    {
                        k = g3.e();
                    } else
                    {
                        k = g3.d();
                    }
                }
            }
        }
_L14:
label2:
        {
            if (k >= 0)
            {
                i2 = k;
                if (k <= c1.b())
                {
                    break label2;
                }
            }
            if (l == -1)
            {
                break MISSING_BLOCK_LABEL_1444;
            }
            i2 = l;
        }
        g3 = a(b1, c1.a(), c1.b(), flag, i2, j2, l1, k1);
        if (g3 == null)
        {
            break MISSING_BLOCK_LABEL_1444;
        }
        g2.a(j2, g3);
        l1 = Math.min(l1, g3.c());
        k1 = Math.max(k1, g3.c());
        k = i2;
_L18:
        j2++;
        l = k;
        break MISSING_BLOCK_LABEL_439;
        i2 = 0;
        k2 = j1;
_L16:
        if (!a(((f) (g1)), k2 - k))
        {
            break MISSING_BLOCK_LABEL_886;
        }
        l2 = k2 - k;
        g3 = g1.a(l2).b();
        j3 = g3.length;
        k2 = 0;
_L15:
label3:
        {
            if (k2 >= j3)
            {
                break MISSING_BLOCK_LABEL_873;
            }
            g4 = g3[k2];
            if (g4 == null)
            {
                break label3;
            }
            if (flag)
            {
                k2 = g4.e();
            } else
            {
                k2 = g4.d();
            }
            k = k2 + k * i2 * (g4.e() - g4.d());
        }
          goto _L14
        k2++;
          goto _L15
        i2++;
        k2 = l2;
          goto _L16
        if (flag)
        {
            k = g1.e().a();
        } else
        {
            k = g1.e().b();
        }
          goto _L14
_L12:
        i1++;
        l1 = k;
        k1 = i2;
          goto _L17
_L10:
        b1 = (com.google.zxing.pdf417.decoder.b[][])Array.newInstance(com/google/zxing/pdf417/decoder/b, new int[] {
            g1.c(), g1.b() + 2
        });
        for (k = 0; k < b1.length; k++)
        {
            for (l = 0; l < b1[k].length; l++)
            {
                b1[k][l] = new com.google.zxing.pdf417.decoder.b();
            }

        }

        l = -1;
        g2 = g1.a();
        j1 = g2.length;
        for (k = 0; k < j1;)
        {
            g3 = g2[k];
            i1 = l + 1;
            if (g3 != null)
            {
                g3 = g3.b();
                k1 = g3.length;
                for (l = 0; l < k1; l++)
                {
                    g4 = g3[l];
                    if (g4 != null && g4.h() != -1)
                    {
                        b1[g4.h()][i1].a(g4.g());
                    }
                }

            }
            k++;
            l = i1;
        }

        g2 = b1[0][1].a();
        k = g1.b() * g1.c() - (2 << g1.d());
        if (g2.length == 0)
        {
            if (k <= 0 || k > 928)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            b1[0][1].a(k);
        } else
        if (g2[0] != k)
        {
            b1[0][1].a(k);
        }
        g2 = new ArrayList();
        g3 = new int[g1.c() * g1.b()];
        g4 = new ArrayList();
        obj = new ArrayList();
        for (k = 0; k < g1.c(); k++)
        {
            l = 0;
            while (l < g1.b()) 
            {
                ai = b1[k][l + 1].a();
                i1 = g1.b() * k + l;
                if (ai.length == 0)
                {
                    g2.add(Integer.valueOf(i1));
                } else
                if (ai.length == 1)
                {
                    g3[i1] = ai[0];
                } else
                {
                    ((List) (obj)).add(Integer.valueOf(i1));
                    g4.add(ai);
                }
                l++;
            }
        }

        b1 = new int[g4.size()][];
        for (k = 0; k < b1.length; k++)
        {
            b1[k] = (int[])g4.get(k);
        }

        return a(g1.d(), ((int []) (g3)), com.google.zxing.pdf417.a.a(g2), com.google.zxing.pdf417.a.a(((Collection) (obj))), ((int [][]) (b1)));
        k = l;
          goto _L18
_L7:
        g1 = ((g) (obj));
        obj = g2;
        if (true) goto _L20; else goto _L19
_L19:
    }

    private static c a(h h1)
    {
        if (h1 == null)
        {
            return null;
        }
        int ai[] = h1.c();
        int j1 = ai.length;
        int k1 = -1;
        for (int k = 0; k < j1; k++)
        {
            k1 = Math.max(k1, ai[k]);
        }

        int i2 = ai.length;
        int l1 = 0;
        int l = 0;
        do
        {
            j1 = l;
            if (l1 >= i2)
            {
                break;
            }
            int j2 = ai[l1];
            l += k1 - j2;
            j1 = l;
            if (j2 > 0)
            {
                break;
            }
            l1++;
        } while (true);
        com.google.zxing.pdf417.decoder.d ad[] = h1.b();
        l = 0;
        for (l1 = j1; l1 > 0 && ad[l] == null; l++)
        {
            l1--;
        }

        l = ai.length;
        j1 = 0;
        i2 = l - 1;
        do
        {
            l = j1;
            if (i2 < 0)
            {
                break;
            }
            j1 += k1 - ai[i2];
            l = j1;
            if (ai[i2] > 0)
            {
                break;
            }
            i2--;
        } while (true);
        j1 = ad.length;
        k1 = j1 - 1;
        j1 = l;
        for (int i1 = k1; j1 > 0 && ad[i1] == null; i1--)
        {
            j1--;
        }

        return h1.a().a(l1, j1, h1.e());
    }

    private static com.google.zxing.pdf417.decoder.d a(b b1, int k, int l, boolean flag, int i1, int j1, int k1, int l1)
    {
        int ai[];
        int i2;
        int j2;
        int k2;
        boolean flag1;
        if (flag)
        {
            i2 = -1;
        } else
        {
            i2 = 1;
        }
        j2 = 0;
        k2 = i2;
        flag1 = flag;
        i2 = i1;
_L7:
        if (j2 >= 2) goto _L2; else goto _L1
_L1:
        if ((!flag1 || i2 < k) && (flag1 || i2 >= l) || flag1 != b1.a(i2, j1)) goto _L4; else goto _L3
_L3:
        if (Math.abs(i1 - i2) <= 2) goto _L6; else goto _L5
_L5:
        ai = new int[8];
        k2 = 0;
        if (flag)
        {
            i2 = 1;
        } else
        {
            i2 = -1;
        }
        j2 = i1;
        flag1 = flag;
        while ((flag && j2 < l || !flag && j2 >= k) && k2 < ai.length) 
        {
            if (b1.a(j2, j1) == flag1)
            {
                ai[k2] = ai[k2] + 1;
                j2 += i2;
            } else
            {
                if (!flag1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                k2++;
            }
        }
        break MISSING_BLOCK_LABEL_240;
_L6:
        i2 += k2;
          goto _L1
_L4:
        k2 = -k2;
        if (!flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j2++;
          goto _L7
_L2:
        i1 = i2;
          goto _L5
        b1 = ai;
        if (k2 != ai.length)
        {
            if ((flag && j2 == l || !flag && j2 == k) && k2 == ai.length - 1)
            {
                b1 = ai;
            } else
            {
                b1 = null;
            }
        }
        if (b1 == null)
        {
            return null;
        }
        l = com.google.zxing.pdf417.a.a(b1);
        if (flag)
        {
            k = i1 + l;
        } else
        {
            for (k = 0; k < b1.length >> 1; k++)
            {
                j1 = b1[k];
                b1[k] = b1[b1.length - 1 - k];
                b1[b1.length - 1 - k] = j1;
            }

            k = i1;
            i1 -= l;
        }
        if (k1 - 2 <= l && l <= l1 + 2)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (l == 0)
        {
            return null;
        }
        l = com.google.zxing.pdf417.decoder.i.a(b1);
        j1 = com.google.zxing.pdf417.a.a(l);
        if (j1 == -1)
        {
            return null;
        }
        b1 = a(l);
        return new com.google.zxing.pdf417.decoder.d(i1, k, ((((b1[0] - b1[2]) + b1[4]) - b1[6]) + 9) % 9, j1);
          goto _L1
    }

    private static h a(b b1, c c1, g g1, boolean flag, int k, int l)
    {
        h h1 = new h(c1, flag);
        for (int j1 = 0; j1 < 2; j1++)
        {
            int i1;
            int k1;
            int l1;
            if (j1 == 0)
            {
                k1 = 1;
            } else
            {
                k1 = -1;
            }
            i1 = (int)g1.a();
            l1 = (int)g1.b();
            while (l1 <= c1.d() && l1 >= c1.c()) 
            {
                com.google.zxing.pdf417.decoder.d d1 = a(b1, 0, b1.d(), flag, i1, l1, k, l);
                if (d1 != null)
                {
                    h1.a(l1, d1);
                    if (flag)
                    {
                        i1 = d1.d();
                    } else
                    {
                        i1 = d1.e();
                    }
                }
                l1 += k1;
            }
        }

        return h1;
    }

    private static boolean a(f f1, int k)
    {
        return k >= 0 && k <= f1.b() + 1;
    }

    private static int[] a(int k)
    {
        int ai[] = new int[8];
        int i1 = 0;
        int l = ai.length - 1;
        do
        {
            int k1 = l;
            int j1 = i1;
            if ((k & 1) != i1)
            {
                j1 = k & 1;
                k1 = l - 1;
                if (k1 < 0)
                {
                    break;
                }
            }
            ai[k1] = ai[k1] + 1;
            k >>= 1;
            l = k1;
            i1 = j1;
        } while (true);
        return ai;
    }

}
