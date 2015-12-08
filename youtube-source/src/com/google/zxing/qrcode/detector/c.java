// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.a.a;
import com.google.zxing.common.b;
import com.google.zxing.common.f;
import com.google.zxing.common.h;
import com.google.zxing.common.j;
import com.google.zxing.g;
import com.google.zxing.qrcode.decoder.p;
import java.util.Map;

// Referenced classes of package com.google.zxing.qrcode.detector:
//            f, d, b, FinderPatternFinder

public final class c
{

    private final b a;
    private com.google.zxing.h b;

    public c(b b1)
    {
        a = b1;
    }

    private float a(int i, int k, int l, int i1)
    {
        boolean flag = false;
        float f2 = b(i, k, l, i1);
        l = i - (l - i);
        float f1;
        float f3;
        if (l < 0)
        {
            f1 = (float)i / (float)(i - l);
            l = 0;
        } else
        if (l >= a.d())
        {
            f1 = (float)(a.d() - 1 - i) / (float)(l - i);
            l = a.d() - 1;
        } else
        {
            f1 = 1.0F;
        }
        i1 = (int)((float)k - f1 * (float)(i1 - k));
        if (i1 < 0)
        {
            f1 = (float)k / (float)(k - i1);
            i1 = ((flag) ? 1 : 0);
        } else
        if (i1 >= a.e())
        {
            f1 = (float)(a.e() - 1 - k) / (float)(i1 - k);
            i1 = a.e() - 1;
        } else
        {
            f1 = 1.0F;
        }
        f3 = i;
        return (b(i, k, (int)(f1 * (float)(l - i) + f3), i1) + f2) - 1.0F;
    }

    private float a(g g1, g g2)
    {
        float f1 = a((int)g1.a(), (int)g1.b(), (int)g2.a(), (int)g2.b());
        float f2 = a((int)g2.a(), (int)g2.b(), (int)g1.a(), (int)g1.b());
        if (Float.isNaN(f1))
        {
            return f2 / 7F;
        }
        if (Float.isNaN(f2))
        {
            return f1 / 7F;
        } else
        {
            return (f1 + f2) / 14F;
        }
    }

    private f a(com.google.zxing.qrcode.detector.f f1)
    {
        float f2;
        d d1;
        d d2;
        d d3;
        int i;
        d1 = f1.b();
        d2 = f1.c();
        d3 = f1.a();
        f2 = (a(((g) (d1)), ((g) (d2))) + a(((g) (d1)), ((g) (d3)))) / 2.0F;
        if (f2 < 1.0F)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        i = ((int)(g.a(d1, d2) / f2 + 0.5F) + (int)(g.a(d1, d3) / f2 + 0.5F) >> 1) + 7;
        i & 3;
        JVM INSTR tableswitch 0 3: default 116
    //                   0 321
    //                   1 116
    //                   2 330
    //                   3 339;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        int k;
        f1 = p.a(i);
        k = f1.d();
        if (f1.b().length <= 0) goto _L6; else goto _L5
_L5:
        int l;
        int i1;
        float f4 = d2.a();
        float f6 = d1.a();
        float f8 = d3.a();
        float f10 = d2.b();
        float f12 = d1.b();
        float f13 = d3.b();
        float f14 = 1.0F - 3F / (float)(k - 7);
        float f15 = d1.a();
        l = (int)((((f4 - f6) + f8) - d1.a()) * f14 + f15);
        i1 = (int)(d1.b() + f14 * (((f10 - f12) + f13) - d1.b()));
        k = 4;
_L10:
        if (k > 16) goto _L6; else goto _L7
_L7:
        int j2 = (int)((float)k * f2);
        int k1;
        int l1;
        k1 = Math.max(0, l - j2);
        l1 = Math.min(a.d() - 1, l + j2);
        if ((float)(l1 - k1) >= 3F * f2) goto _L9; else goto _L8
_L8:
        try
        {
            throw NotFoundException.getNotFoundInstance();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.zxing.qrcode.detector.f f1)
        {
            k <<= 1;
        }
          goto _L10
_L2:
        i++;
          goto _L1
_L3:
        i--;
          goto _L1
_L4:
        throw NotFoundException.getNotFoundInstance();
_L9:
        int i2;
        i2 = Math.max(0, i1 - j2);
        j2 = Math.min(a.e() - 1, j2 + i1);
        if ((float)(j2 - i2) >= 3F * f2)
        {
            break MISSING_BLOCK_LABEL_391;
        }
        throw NotFoundException.getNotFoundInstance();
        f1 = (new com.google.zxing.qrcode.detector.b(a, k1, i2, l1 - k1, j2 - i2, f2, b)).a();
_L12:
        float f3 = (float)i - 3.5F;
        float f5;
        float f7;
        float f9;
        float f11;
        j j1;
        b b1;
        if (f1 != null)
        {
            f9 = f1.a();
            f11 = f1.b();
            f5 = f3 - 3F;
            f7 = f5;
        } else
        {
            f9 = (d2.a() - d1.a()) + d3.a();
            f11 = (d2.b() - d1.b()) + d3.b();
            f5 = f3;
            f7 = f3;
        }
        j1 = j.a(3.5F, 3.5F, f3, 3.5F, f5, f7, 3.5F, f3, d1.a(), d1.b(), d2.a(), d2.b(), f9, f11, d3.a(), d3.b());
        b1 = a;
        b1 = h.a().a(b1, i, i, j1);
        if (f1 == null)
        {
            f1 = new g[3];
            f1[0] = d3;
            f1[1] = d1;
            f1[2] = d2;
        } else
        {
            g ag[] = new g[4];
            ag[0] = d3;
            ag[1] = d1;
            ag[2] = d2;
            ag[3] = f1;
            f1 = ag;
        }
        return new f(b1, f1);
_L6:
        f1 = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private float b(int i, int k, int l, int i1)
    {
        int j1;
        int k1;
        boolean flag;
        int l1;
        int i2;
        int j2;
        byte byte0;
        int i3;
        int j3;
        if (Math.abs(i1 - k) > Math.abs(l - i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i2 = i1;
            l1 = l;
            j1 = k;
            i1 = i;
        } else
        {
            l1 = i1;
            i1 = k;
            j1 = i;
            i2 = l;
        }
        i3 = Math.abs(i2 - j1);
        j3 = Math.abs(l1 - i1);
        i = -i3;
        if (j1 < i2)
        {
            j2 = 1;
        } else
        {
            j2 = -1;
        }
        if (i1 < l1)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        l = 0;
        k = j1;
        k1 = i >> 1;
        i = i1;
        for (; k != i2 + j2; k += j2)
        {
            int k2;
            int l2;
            boolean flag1;
            if (flag)
            {
                k2 = i;
            } else
            {
                k2 = k;
            }
            if (flag)
            {
                l2 = k;
            } else
            {
                l2 = i;
            }
            if (l == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1 == a.a(k2, l2))
            {
                if (l == 2)
                {
                    return com.google.zxing.common.a.a.a(k, i, j1, i1);
                }
                l++;
            }
            k1 += j3;
            if (k1 <= 0)
            {
                continue;
            }
            if (i == l1)
            {
                break;
            }
            i += byte0;
            k1 -= i3;
        }

        if (l == 2)
        {
            return com.google.zxing.common.a.a.a(i2 + j2, l1, j1, i1);
        } else
        {
            return (0.0F / 0.0F);
        }
    }

    public final f a(Map map)
    {
        com.google.zxing.h h1;
        if (map == null)
        {
            h1 = null;
        } else
        {
            h1 = (com.google.zxing.h)map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        }
        b = h1;
        return a((new FinderPatternFinder(a, b)).a(map));
    }
}
