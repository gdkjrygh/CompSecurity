// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            ak, ad, y, v, 
//            du, do, ds, dq, 
//            aw, au, ar, dt, 
//            u, ae

public final class dr
{

    private final ak a;
    private ae b;

    public dr(ak ak1)
    {
        a = ak1;
    }

    private float a(int i, int j, int k, int l)
    {
        boolean flag = false;
        float f1 = 1.0F;
        float f2 = b(i, j, k, l);
        k = i - (k - i);
        float f;
        if (k < 0)
        {
            f = (float)i / (float)(i - k);
            k = 0;
        } else
        if (k > a.a)
        {
            f = (float)(a.a - i) / (float)(k - i);
            k = a.a;
        } else
        {
            f = 1.0F;
        }
        l = (int)((float)j - f * (float)(l - j));
        if (l < 0)
        {
            f = (float)j / (float)(j - l);
            l = ((flag) ? 1 : 0);
        } else
        if (l > a.b)
        {
            f = (float)(a.b - j) / (float)(l - j);
            l = a.b;
        } else
        {
            f = f1;
        }
        f1 = i;
        return b(i, j, (int)(f * (float)(k - i) + f1), l) + f2;
    }

    private float a(ad ad1, ad ad2)
    {
        float f = a((int)ad1.a(), (int)ad1.b(), (int)ad2.a(), (int)ad2.b());
        float f1 = a((int)ad2.a(), (int)ad2.b(), (int)ad1.a(), (int)ad1.b());
        if (Float.isNaN(f))
        {
            return f1 / 7F;
        }
        if (Float.isNaN(f1))
        {
            return f / 7F;
        } else
        {
            return (f + f1) / 14F;
        }
    }

    private ar a(du du1)
        throws y, v
    {
        float f;
        ds ds1;
        ds ds2;
        ds ds3;
        int i;
        ds1 = du1.b();
        ds2 = du1.c();
        ds3 = du1.a();
        f = (a(((ad) (ds1)), ((ad) (ds2))) + a(((ad) (ds1)), ((ad) (ds3)))) / 2.0F;
        if (f < 1.0F)
        {
            throw y.a();
        }
        i = ((int)(ad.a(ds1, ds2) / f + 0.5F) + (int)(ad.a(ds1, ds3) / f + 0.5F) >> 1) + 7;
        i & 3;
        JVM INSTR tableswitch 0 3: default 116
    //                   0 321
    //                   1 116
    //                   2 330
    //                   3 339;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        int j;
        du1 = RLSDK.do.a(i);
        j = du1.d();
        if (du1.b().length <= 0) goto _L6; else goto _L5
_L5:
        int k;
        int l;
        float f2 = ds2.a();
        float f4 = ds1.a();
        float f6 = ds3.a();
        float f8 = ds2.b();
        float f10 = ds1.b();
        float f11 = ds3.b();
        float f12 = 1.0F - 3F / (float)(j - 7);
        float f13 = ds1.a();
        k = (int)((((f2 - f4) + f6) - ds1.a()) * f12 + f13);
        l = (int)(ds1.b() + f12 * (((f8 - f10) + f11) - ds1.b()));
        j = 4;
_L10:
        if (j > 16) goto _L6; else goto _L7
_L7:
        int l1 = (int)((float)j * f);
        int i1;
        int j1;
        i1 = Math.max(0, k - l1);
        j1 = Math.min(a.a - 1, k + l1);
        if ((float)(j1 - i1) >= 3F * f) goto _L9; else goto _L8
_L8:
        try
        {
            throw y.a();
        }
        // Misplaced declaration of an exception variable
        catch (du du1)
        {
            j <<= 1;
        }
          goto _L10
_L2:
        i++;
          goto _L1
_L3:
        i--;
          goto _L1
_L4:
        throw y.a();
_L9:
        int k1;
        k1 = Math.max(0, l - l1);
        l1 = Math.min(a.b - 1, l1 + l);
        if ((float)(l1 - k1) >= 3F * f)
        {
            break MISSING_BLOCK_LABEL_391;
        }
        throw y.a();
        du1 = (new dq(a, i1, k1, j1 - i1, l1 - k1, f, b)).a();
_L12:
        float f1 = (float)i - 3.5F;
        float f3;
        float f5;
        float f7;
        float f9;
        aw aw1;
        ak ak1;
        if (du1 != null)
        {
            f7 = du1.a();
            f9 = du1.b();
            f3 = f1 - 3F;
            f5 = f3;
        } else
        {
            f7 = (ds2.a() - ds1.a()) + ds3.a();
            f9 = (ds2.b() - ds1.b()) + ds3.b();
            f3 = f1;
            f5 = f1;
        }
        aw1 = aw.a(3.5F, 3.5F, f1, 3.5F, f3, f5, 3.5F, f1, ds1.a(), ds1.b(), ds2.a(), ds2.b(), f7, f9, ds3.a(), ds3.b());
        ak1 = a;
        ak1 = au.a().a(ak1, i, i, aw1);
        if (du1 == null)
        {
            du1 = new ad[3];
            du1[0] = ds3;
            du1[1] = ds1;
            du1[2] = ds2;
        } else
        {
            ad aad[] = new ad[4];
            aad[0] = ds3;
            aad[1] = ds1;
            aad[2] = ds2;
            aad[3] = du1;
            du1 = aad;
        }
        return new ar(ak1, du1);
_L6:
        du1 = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private float b(int i, int j, int k, int l)
    {
        int i1;
        int j1;
        boolean flag;
        int k1;
        int l1;
        int i2;
        byte byte0;
        int j2;
        int k2;
        int l2;
        int i3;
        if (Math.abs(l - j) > Math.abs(k - i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            l1 = l;
            k1 = k;
            i1 = j;
            l = i;
        } else
        {
            k1 = l;
            l = j;
            i1 = i;
            l1 = k;
        }
        l2 = Math.abs(l1 - i1);
        i3 = Math.abs(k1 - l);
        j = -l2;
        if (i1 < l1)
        {
            i2 = 1;
        } else
        {
            i2 = -1;
        }
        if (l < k1)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        k = 0;
        i = i1;
        j1 = j >> 1;
        j = l;
        if (i == l1) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            j2 = j;
        } else
        {
            j2 = i;
        }
        if (flag)
        {
            k2 = i;
        } else
        {
            k2 = j;
        }
        if (k != 1) goto _L4; else goto _L3
_L3:
        if (a.a(j2, k2))
        {
            k++;
        }
_L6:
        if (k == 3)
        {
            k = i - i1;
            j -= l;
            i = k;
            if (i2 < 0)
            {
                i = k + 1;
            }
            return (float)Math.sqrt(i * i + j * j);
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (!a.a(j2, k2))
        {
            k++;
        }
        if (true) goto _L6; else goto _L5
_L5:
        k2 = j1 + i3;
        j2 = j;
        j1 = k2;
        if (k2 > 0)
        {
            if (j == k1)
            {
                break; /* Loop/switch isn't completed */
            }
            j2 = j + byte0;
            j1 = k2 - l2;
        }
        i += i2;
        j = j2;
        break MISSING_BLOCK_LABEL_94;
_L2:
        i = l1 - i1;
        j = k1 - l;
        return (float)Math.sqrt(i * i + j * j);
    }

    public final ar a(Hashtable hashtable)
        throws y, v
    {
        ae ae1;
        if (hashtable == null)
        {
            ae1 = null;
        } else
        {
            ae1 = (ae)hashtable.get(u.h);
        }
        b = ae1;
        return a((new dt(a, b)).a(hashtable));
    }
}
