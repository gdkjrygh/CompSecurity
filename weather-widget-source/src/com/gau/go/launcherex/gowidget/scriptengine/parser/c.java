// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.jiubang.core.a.d;
import com.jiubang.core.a.e;
import com.jiubang.core.a.f;
import com.jiubang.core.a.h;
import com.jiubang.core.a.i;
import com.jiubang.core.a.j;
import com.jiubang.core.a.l;
import com.jiubang.core.a.m;
import com.jiubang.core.a.n;
import com.jiubang.core.a.p;
import com.jiubang.core.a.u;
import com.jiubang.core.a.v;
import com.jiubang.core.a.w;
import java.util.HashMap;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            z, DescriptionBean, a, ad, 
//            p, q, x, y, 
//            ab, d, g, r, 
//            t, b, o, aa

public class c
{

    private z a;
    private Context b;
    private Context c;
    private boolean d;
    private int e;
    private int f;
    private float g;
    private float h;

    public c(Context context, z z1, int k, int i1, boolean flag)
    {
        h = 480F;
        a = z1;
        b = context;
        d = flag;
        h = z1.b().b();
        g = context.getResources().getDisplayMetrics().density;
        if (k < i1)
        {
            e = (int)((h / 480F) * (float)k);
            f = i1;
        } else
        {
            e = (int)((h / 480F) * (float)i1);
            f = k;
        }
        a(context, a.a());
    }

    public c(Context context, z z1, boolean flag)
    {
        this(context, z1, context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels, flag);
    }

    private float a(float f1, float f2, float f3, float f4, float f5)
    {
        return ((f3 - f5) * f1) / (f2 - f4);
    }

    private float a(float f1, int k, float f2)
    {
        if (k == 1)
        {
            return f1;
        } else
        {
            return f1 * f2;
        }
    }

    private int a(float f1, float f2, float f3, int k)
    {
        switch (k)
        {
        default:
            return (int)((f1 / h) * (float)e);

        case 1: // '\001'
            return (int)((f1 / h) * (float)e);

        case 2: // '\002'
            return (int)((f1 / h) * (float)e);

        case 3: // '\003'
            return (int)(((f1 + f3) / h) * (float)e - f2) + 1;

        case 4: // '\004'
            return (int)(((f1 + f3) / h) * (float)e - f2) + 1;

        case 5: // '\005'
            return (int)(((f3 * 0.5F + f1) / h) * (float)e - f2 * 0.5F);
        }
    }

    private int a(float f1, float f2, float f3, int k, float f4, float f5)
    {
        switch (k)
        {
        default:
            return (int)((f1 / 800F) * ((float)f - f5));

        case 1: // '\001'
            return (int)((f1 / 800F) * ((float)f - f5));

        case 2: // '\002'
            return (int)(a((f1 / 800F) * (800F - f4) + f3, 800F, f, f4, f5) - f2) + 1;

        case 3: // '\003'
            return (int)((f1 / 800F) * ((float)f - f5));

        case 4: // '\004'
            return (int)(a((f1 / 800F) * (800F - f4) + f3, 800F, f, f4, f5) - f2) + 1;

        case 5: // '\005'
            return (int)(a(f3 * 0.5F + (f1 / 800F) * (800F - f4), 800F, f, f4, f5) - f2 * 0.5F);
        }
    }

    private int a(float f1, int k, float f2, int i1, float f3, float f4)
    {
        if (k == 1)
        {
            return a(f1, f3, f4, i1, 38F, 0.0F);
        } else
        {
            return (int)(f1 * f2);
        }
    }

    private int a(int k, float f1, int i1, int j1, float f2, float f3, float f4)
    {
        if (i1 == 0)
        {
            return (int)((f1 / f2) * (f3 - f4));
        } else
        {
            return (int)((float)j1 * f1 + (float)k);
        }
    }

    private Bitmap a(Resources resources, String s, String s1)
    {
        Object obj = null;
        Bitmap bitmap = obj;
        if (s != null)
        {
            int k = resources.getIdentifier(s, "drawable", s1);
            bitmap = obj;
            if (k != 0)
            {
                s = new android.graphics.BitmapFactory.Options();
                s.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(resources, k, s);
                if (((android.graphics.BitmapFactory.Options) (s)).outMimeType.equalsIgnoreCase("image/jpeg") || ((android.graphics.BitmapFactory.Options) (s)).outMimeType.equalsIgnoreCase("image/bmp"))
                {
                    s = new android.graphics.BitmapFactory.Options();
                    s.inPreferredConfig = android.graphics.Bitmap.Config.ALPHA_8;
                } else
                {
                    s = new android.graphics.BitmapFactory.Options();
                    s.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                }
                try
                {
                    bitmap = BitmapFactory.decodeResource(resources, k, s);
                }
                // Misplaced declaration of an exception variable
                catch (Resources resources)
                {
                    resources.printStackTrace();
                    System.gc();
                    return null;
                }
            }
        }
        return bitmap;
    }

    private Bitmap a(Resources resources, String s, String s1, int k, int i1)
    {
label0:
        {
            Object obj2 = null;
            Object obj1 = null;
            Object obj = obj2;
            if (s == null)
            {
                break label0;
            }
            int j1 = resources.getIdentifier(s, "drawable", s1);
            obj = obj2;
            if (j1 == 0)
            {
                break label0;
            }
            s = new android.graphics.BitmapFactory.Options();
            s.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(resources, j1, s);
            if (((android.graphics.BitmapFactory.Options) (s)).outMimeType.equalsIgnoreCase("image/jpeg") || ((android.graphics.BitmapFactory.Options) (s)).outMimeType.equalsIgnoreCase("image/bmp"))
            {
                s = new android.graphics.BitmapFactory.Options();
                s.inPreferredConfig = android.graphics.Bitmap.Config.ALPHA_8;
            } else
            {
                s = new android.graphics.BitmapFactory.Options();
                s.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
            }
            try
            {
                resources = BitmapFactory.decodeResource(resources, j1, s);
            }
            // Misplaced declaration of an exception variable
            catch (Resources resources)
            {
                resources.printStackTrace();
                System.gc();
                resources = obj1;
            }
            obj = resources;
            if (resources == null)
            {
                break label0;
            }
            if (resources.getWidth() == k)
            {
                obj = resources;
                if (resources.getHeight() == i1)
                {
                    break label0;
                }
            }
            try
            {
                obj = Bitmap.createScaledBitmap(resources, k, i1, true);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                System.gc();
                return resources;
            }
        }
        return ((Bitmap) (obj));
    }

    private f a(a a1)
    {
        return new e(1, a1.a(), a1.b(), a1.h(), 2, a1.f(), a1.g(), a1.c(), a1.d());
    }

    private f a(ad ad1, float f1, float f2, float f3, float f4, float f5, float f6)
    {
        int k = ad1.q();
        int i1 = b(ad1.i(), ad1.m(), f3, k, f1, f5);
        int j1 = b(ad1.j(), ad1.n(), f3, k, f1, f5);
        return new d(1, 2, i1, a(ad1.k(), ad1.o(), f4, k, f2, f6), j1, a(ad1.l(), ad1.p(), f4, k, f2, f6), ad1.h(), 2, ad1.f(), ad1.g(), 0.0F, 0.0F, ad1.a(), ad1.b(), ad1.c(), ad1.d());
    }

    private f a(com.gau.go.launcherex.gowidget.scriptengine.parser.p p1, int k, int i1, HashMap hashmap)
    {
        n n1 = new n(1, p1.f(), p1.g(), p1.h(), 2, p1.c(), p1.d());
        Resources resources = c.getResources();
        int k1 = p1.a();
        int j1 = 0;
        while (j1 < k1) 
        {
            q q1 = p1.a(j1);
            if (q1 != null && q1.a != null && q1.a.length() > 0)
            {
                Bitmap bitmap = (Bitmap)hashmap.get(q1.a);
                if (bitmap == null)
                {
                    if (k > 0 && i1 > 0)
                    {
                        bitmap = a(resources, q1.a, a.a(), k, i1);
                    } else
                    {
                        bitmap = a(resources, q1.a, a.a());
                    }
                    if (bitmap != null)
                    {
                        n1.a(bitmap, q1.b, q1.c, q1.d);
                    }
                } else
                {
                    n1.a(bitmap, q1.b, q1.c, q1.d);
                }
            }
            j1++;
        }
        return n1;
    }

    private f a(x x1, int k, int i1, float f1, float f2)
    {
        float f3 = x1.a();
        float f4 = x1.b();
        int j1 = x1.k();
        f1 = x1.i();
        if (j1 == 0)
        {
            f1 = (f1 / h) * (float)e;
        } else
        {
            f1 *= k;
        }
        k = x1.l();
        f2 = x1.j();
        if (k == 0)
        {
            f2 = (f2 / 800F) * (float)(f + 0);
        } else
        {
            f2 *= i1;
        }
        k = x1.h();
        i1 = x1.f();
        j1 = x1.g();
        return new u(1, f3, f4, x1.k(), f1, x1.l(), f2, k, 2, i1, j1, x1.c(), x1.d());
    }

    private f a(y y1, int k, int i1, float f1, float f2, float f3, float f4)
    {
        float f5 = a(y1.a(), y1.o(), 1.0F);
        float f6 = a(y1.b(), y1.p(), 1.0F);
        float f7 = a(y1.i(), y1.q(), 1.0F);
        float f8 = a(y1.j(), y1.r(), 1.0F);
        int j1 = y1.s();
        int k1 = y1.m();
        f1 = y1.k();
        if (k1 == 0)
        {
            f1 = a(f1, k, f3, j1);
        } else
        {
            f1 *= k;
        }
        k = y1.n();
        f2 = y1.l();
        if (k == 0)
        {
            f2 = a(f2, i1, f4, j1, 38F, 0.0F);
        } else
        {
            f2 *= i1;
        }
        return new v(1, f5, f6, f7, f8, y1.m(), f1, y1.n(), f2, y1.h(), 2, y1.f(), y1.g(), y1.c(), y1.d());
    }

    private h a(ab ab1, int k, int i1, int j1, int k1, float f1, float f2, 
            HashMap hashmap, float f3, float f4)
    {
        h h1;
        int l1;
        int i2;
        h1 = new h(1);
        i2 = ab1.a();
        l1 = 0;
_L14:
        if (l1 >= i2) goto _L2; else goto _L1
_L1:
        Object obj = ab1.b(l1);
        if (obj == null) goto _L4; else goto _L3
_L3:
        ((com.gau.go.launcherex.gowidget.scriptengine.parser.d) (obj)).e();
        JVM INSTR tableswitch 1 6: default 84
    //                   1 142
    //                   2 108
    //                   3 166
    //                   4 122
    //                   5 228
    //                   6 198;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L5:
        obj = null;
_L12:
        if (obj != null)
        {
            h1.a(((f) (obj)));
        }
_L4:
        l1++;
        continue; /* Loop/switch isn't completed */
_L7:
        obj = a((a)obj);
        continue; /* Loop/switch isn't completed */
_L9:
        obj = a((x)obj, k, i1, f3, f4);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = a((y)obj, k, i1, f1, f2, f3, f4);
        continue; /* Loop/switch isn't completed */
_L8:
        obj = a((ad)obj, k, i1, e, f, f3, f4);
        continue; /* Loop/switch isn't completed */
_L11:
        obj = a((ab)obj, k, i1, j1, k1, f1, f2, hashmap, f3, f4);
        continue; /* Loop/switch isn't completed */
_L10:
        obj = a((com.gau.go.launcherex.gowidget.scriptengine.parser.p)obj, k, i1, hashmap);
        if (true) goto _L12; else goto _L2
_L2:
        return h1;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private h a(ab ab1, i k, int i1, float f1, int j1, float f2)
    {
        h h1;
        int i2;
        int k3;
        h1 = new h(1);
        k3 = ab1.a();
        i2 = 0;
_L10:
        if (i2 >= k3) goto _L2; else goto _L1
_L1:
        Object obj = ab1.b(i2);
        if (obj == null || ((com.gau.go.launcherex.gowidget.scriptengine.parser.d) (obj)).e() != 7) goto _L4; else goto _L3
_L3:
        j j2;
        int k1;
        int l1;
        int k2;
        int l2;
        int i3;
        int j3;
        int l3;
        int i4;
        obj = (g)obj;
        j2 = new j(1, ((g) (obj)).f(), ((g) (obj)).g(), ((g) (obj)).h(), 2, ((g) (obj)).c(), ((g) (obj)).d());
        l3 = k.q().getWidth();
        i4 = k.q().getHeight();
        l1 = k.h();
        l2 = k.i();
        i3 = l1 + k.c();
        j3 = l2 + k.d();
        k1 = a(((g) (obj)).a(), i1, f1, 1);
        k2 = a(((g) (obj)).b(), j1, f2, 1, 38F, 0.0F);
        ((g) (obj)).i();
        JVM INSTR tableswitch 1 4: default 216
    //                   1 261
    //                   2 303
    //                   3 345
    //                   4 379;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        if (k1 > l1)
        {
            k1 = l1;
            l1 = k2;
        } else
        {
            if (k1 >= l1 - l3)
            {
                break MISSING_BLOCK_LABEL_440;
            }
            k1 = l1 - l3;
            l1 = k2;
        }
_L11:
        j2.a(k1, l1, ((g) (obj)).i());
        h1.a(j2);
_L4:
        i2++;
          goto _L10
_L6:
        if (k1 > l1)
        {
            k1 = l1;
            l1 = k2;
        } else
        {
            if (k1 >= l1 - l3)
            {
                break MISSING_BLOCK_LABEL_440;
            }
            k1 = l1 - l3;
            l1 = k2;
        }
        break MISSING_BLOCK_LABEL_231;
_L7:
        if (k1 < i3)
        {
            k1 = i3;
            l1 = k2;
        } else
        {
            if (k1 <= i3 + l3)
            {
                break MISSING_BLOCK_LABEL_440;
            }
            k1 = i3 + l3;
            l1 = k2;
        }
        break MISSING_BLOCK_LABEL_231;
_L8:
        if (k2 > l2)
        {
            l1 = l2;
        } else
        {
            if (k2 >= l2 - i4)
            {
                break MISSING_BLOCK_LABEL_440;
            }
            l1 = l2 - i4;
        }
        break MISSING_BLOCK_LABEL_231;
_L9:
        if (k2 < j3)
        {
            l1 = j3;
        } else
        {
            if (k2 <= j3 + i4)
            {
                break MISSING_BLOCK_LABEL_440;
            }
            l1 = j3 + i4;
        }
        break MISSING_BLOCK_LABEL_231;
_L2:
        return h1;
        l1 = k2;
          goto _L11
    }

    private i a(r r1, Resources resources, String s, int k, int i1, HashMap hashmap)
    {
label0:
        {
            Object obj1 = null;
            Object obj = obj1;
            if (r1 == null)
            {
                break label0;
            }
            String s1 = r1.s();
            int l1 = r1.o();
            int j2 = r1.p();
            float f3 = 0.0F;
            float f4 = 0.0F;
            int j1 = l1;
            int k1 = j2;
            float f2 = f3;
            float f1 = f4;
            if (l1 > 0)
            {
                j1 = l1;
                k1 = j2;
                f2 = f3;
                f1 = f4;
                if (j2 > 0)
                {
                    f2 = l1;
                    f1 = j2;
                    j1 = (int)((f2 / h) * (float)e);
                    k1 = (int)((f1 / 800F) * (float)f);
                }
            }
            obj = obj1;
            if (s1 == null)
            {
                break label0;
            }
            obj = (Bitmap)hashmap.get(s1);
            if (obj == null)
            {
                int i2;
                int k2;
                if (j1 > 0 && k1 > 0)
                {
                    resources = a(resources, s1, s, j1, k1);
                } else
                {
                    resources = a(resources, s1, s);
                }
                s = resources;
                if (resources != null)
                {
                    hashmap.put(s1, resources);
                    s = resources;
                }
            } else
            {
                s = ((String) (obj));
            }
            if (s == null)
            {
                obj = obj1;
                if (r1.o() == 0)
                {
                    break label0;
                }
                obj = obj1;
                if (r1.p() == 0)
                {
                    break label0;
                }
            }
            obj = obj1;
            if (s != null)
            {
                if (j1 <= 0 || k1 <= 0)
                {
                    j1 = s.getWidth();
                    k1 = s.getHeight();
                    f2 = ((float)j1 / g) * 1.5F;
                    f1 = ((float)k1 / g) * 1.5F;
                }
                k2 = r1.v();
                i2 = b(r1.q(), r1.t(), k, k2, j1, f2);
                k2 = a(r1.r(), r1.u(), i1, k2, k1, f1);
                resources = new p(b, i2, k2, j1, k1, s, e, f);
                resources.a(r1.b());
                resources.e(r1.d());
                j1 = r1.k();
                resources.f(a(i2, r1.g(), j1, resources.c(), h, e, 0.0F));
                j1 = r1.l();
                resources.g(a(k2, r1.h(), j1, resources.d(), 800F, f, 0.0F));
                resources.b(r1.c());
                j1 = r1.i();
                resources.c(a(i2, r1.e(), j1, resources.c(), h, e, 0.0F));
                j1 = r1.j();
                resources.d(a(k2, r1.f(), j1, resources.d(), 800F, f, 0.0F));
                resources.b(r1.a());
                r1 = a(r1.n(), resources.c(), resources.d(), k, i1, i2, k2, hashmap, f2, f1);
                obj = resources;
                if (r1 != null)
                {
                    resources.a(r1);
                    obj = resources;
                }
            }
        }
        return ((i) (obj));
    }

    private i a(t t1, Resources resources, String s, int k, int i1, HashMap hashmap)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (t1 != null)
        {
            String s1 = t1.s();
            obj = obj1;
            if (s1 != null)
            {
                obj = (Bitmap)hashmap.get(s1);
                if (obj == null)
                {
                    s = a(resources, s1, s);
                    resources = s;
                    if (s != null)
                    {
                        hashmap.put(s1, s);
                        resources = s;
                    }
                } else
                {
                    resources = ((Resources) (obj));
                }
                obj = obj1;
                if (resources != null)
                {
                    int j1 = t1.o();
                    int k1 = t1.p();
                    float f1;
                    float f2;
                    int l1;
                    if (j1 <= 0 || k1 <= 0)
                    {
                        j1 = resources.getWidth();
                        k1 = resources.getHeight();
                        f1 = ((float)j1 / g) * 1.5F;
                        f2 = ((float)k1 / g) * 1.5F;
                    } else
                    {
                        f1 = j1;
                        f2 = k1;
                        j1 = (int)((f1 / h) * (float)e);
                        k1 = (int)((f2 / 800F) * (float)f);
                    }
                    l1 = t1.v();
                    k = b(t1.q(), t1.t(), k, l1, j1, f1);
                    i1 = a(t1.r(), t1.u(), i1, l1, k1, f2);
                    resources = new l(b, k, i1, j1, k1, resources, e, f);
                    s = t1.n();
                    t1 = new h(1);
                    s = (ab)s.b(0);
                    obj = resources;
                    if (s != null)
                    {
                        s = a(((ab) (s)), ((i) (resources)), j1, f1, k1, f2);
                        obj = resources;
                        if (s != null)
                        {
                            t1.a(s);
                            resources.a(t1);
                            obj = resources;
                        }
                    }
                }
            }
        }
        return ((i) (obj));
    }

    private void a(Context context, String s)
    {
        c = context;
        if (s.equals(context.getPackageName()))
        {
            break MISSING_BLOCK_LABEL_26;
        }
        c = context.createPackageContext(s, 3);
        return;
        context;
        context.printStackTrace();
        return;
    }

    private int b(float f1, int k, float f2, int i1, float f3, float f4)
    {
        if (k == 1)
        {
            return a(f1, f3, f4, i1);
        } else
        {
            return (int)(f1 * f2);
        }
    }

    public m a(String s)
    {
        Object obj2;
        Object obj5;
        HashMap hashmap;
        Resources resources;
        Object obj6;
        Object obj7;
        String s1;
        int k;
        int i1;
        hashmap = new HashMap();
        resources = c.getResources();
        obj6 = a.e();
        obj7 = a.g();
        Object obj = null;
        obj5 = null;
        k = 1;
        i1 = 1;
        if (obj6 == null)
        {
            break MISSING_BLOCK_LABEL_1091;
        }
        s1 = ((b) (obj6)).a();
        obj2 = (Bitmap)hashmap.get(s1);
        if (obj2 == null)
        {
            obj2 = obj;
            if (s1 != null)
            {
                Bitmap bitmap = a(resources, s1, s);
                obj2 = obj;
                if (bitmap != null)
                {
                    hashmap.put(s1, bitmap);
                    obj2 = bitmap;
                }
            }
        }
        if (!d || ((b) (obj6)).g()) goto _L2; else goto _L1
_L1:
        Object obj1 = obj5;
_L24:
        Object obj4;
        int j1;
        k = ((b) (obj6)).b();
        int l1;
        if (obj2 != null)
        {
            int k1 = ((Bitmap) (obj2)).getWidth();
            i1 = ((Bitmap) (obj2)).getHeight();
            Object obj3 = obj2;
            obj2 = obj1;
            j1 = k;
            obj1 = obj3;
            k = k1;
        } else
        {
            int i2 = ((b) (obj6)).c();
            i1 = ((b) (obj6)).d();
            j1 = k;
            obj4 = obj1;
            obj1 = obj2;
            k = i2;
            obj2 = obj4;
        }
_L47:
        if (obj7 == null) goto _L4; else goto _L3
_L3:
        obj5 = ((o) (obj7)).a();
        obj4 = (Bitmap)hashmap.get(obj5);
        if (obj4 != null) goto _L6; else goto _L5
_L5:
        if (obj5 == null) goto _L4; else goto _L7
_L7:
        obj4 = a(resources, ((String) (obj5)), s);
        if (obj4 == null) goto _L4; else goto _L8
_L8:
        hashmap.put(obj5, obj4);
_L6:
        obj7 = new m(b, 0, 0, k, i1, ((Bitmap) (obj1)), ((Bitmap) (obj4)), e, f);
        ((m) (obj7)).b(((Bitmap) (obj2)));
        ((m) (obj7)).a(j1);
        if (obj6 != null)
        {
            ((m) (obj7)).b(((b) (obj6)).e());
            ((m) (obj7)).b(((b) (obj6)).h());
        }
        obj6 = a.c();
        obj1 = null;
        if (obj6 == null) goto _L10; else goto _L9
_L9:
        obj5 = null;
        obj1 = null;
        s1 = ((aa) (obj6)).a();
        obj2 = obj1;
        if ((Bitmap)hashmap.get(s1) == null)
        {
            obj2 = obj1;
            if (s1 != null)
            {
                obj2 = a(resources, s1, s);
            }
        }
        obj4 = new w(b, 0, 0, e, f, ((Bitmap) (obj2)), e, f);
        ((w) (obj4)).b(((aa) (obj6)).e());
        if (!d || ((aa) (obj6)).g()) goto _L12; else goto _L11
_L11:
        obj1 = obj5;
_L37:
        ((w) (obj4)).b(((Bitmap) (obj1)));
        obj1 = obj4;
_L10:
        if (obj1 != null)
        {
            ((m) (obj7)).a(((i) (obj1)));
        }
        l1 = a.i();
        obj1 = null;
        j1 = 0;
_L20:
        if (j1 >= l1) goto _L14; else goto _L13
_L13:
        obj4 = a.b(j1);
        obj2 = obj1;
        if (obj4 == null) goto _L16; else goto _L15
_L15:
        ((t) (obj4)).m();
        JVM INSTR tableswitch 0 1: default 504
    //                   0 1000
    //                   1 978;
           goto _L17 _L18 _L19
_L17:
        obj2 = obj1;
        if (obj1 != null)
        {
            ((m) (obj7)).a(((i) (obj1)));
            obj2 = obj1;
        }
_L16:
        j1++;
        obj1 = obj2;
          goto _L20
_L2:
        if (!d || !((b) (obj6)).g()) goto _L22; else goto _L21
_L21:
        obj5 = (new StringBuilder()).append(s1).append("blur").toString();
        obj4 = (Bitmap)hashmap.get(obj5);
        obj1 = obj4;
        if (obj4 != null) goto _L24; else goto _L23
_L23:
        if (obj5 == null || obj2 == null) goto _L26; else goto _L25
_L25:
        obj1 = com.go.weatherex.home.a.c.a(b, ((Bitmap) (obj2)), 15);
        if (obj1 == null) goto _L26; else goto _L27
_L27:
        try
        {
            hashmap.put(obj5, obj1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj4) { }
          goto _L24
_L22:
        obj1 = obj5;
        if (d) goto _L24; else goto _L28
_L28:
        obj1 = obj5;
        if (!((b) (obj6)).f()) goto _L24; else goto _L29
_L29:
        s1 = (new StringBuilder()).append(s1).append("blur").toString();
        obj1 = (Bitmap)hashmap.get(s1);
        if (obj1 != null) goto _L24; else goto _L30
_L30:
        obj1 = obj5;
        if (s1 == null) goto _L24; else goto _L31
_L31:
        obj1 = obj5;
        if (obj2 == null) goto _L24; else goto _L32
_L32:
        obj4 = com.go.weatherex.home.a.c.a(b, ((Bitmap) (obj2)), 15);
        obj1 = obj5;
        if (obj4 == null) goto _L24; else goto _L33
_L33:
        hashmap.put(s1, obj4);
        obj1 = obj4;
          goto _L24
_L12:
        if (!d || !((aa) (obj6)).g()) goto _L35; else goto _L34
_L34:
        obj6 = (new StringBuilder()).append(s1).append("blur").toString();
        obj5 = (Bitmap)hashmap.get(obj6);
        obj1 = obj5;
        if (obj5 != null) goto _L37; else goto _L36
_L36:
        if (obj6 == null || obj2 == null) goto _L39; else goto _L38
_L38:
        obj1 = com.go.weatherex.home.a.c.a(b, ((Bitmap) (obj2)), 15);
        if (obj1 == null) goto _L39; else goto _L40
_L40:
        try
        {
            hashmap.put(obj6, obj1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
          goto _L37
_L35:
        obj1 = obj5;
        if (d) goto _L37; else goto _L41
_L41:
        obj1 = obj5;
        if (!((aa) (obj6)).f()) goto _L37; else goto _L42
_L42:
        obj6 = (new StringBuilder()).append(s1).append("blur").toString();
        obj1 = (Bitmap)hashmap.get(obj6);
        if (obj1 != null) goto _L37; else goto _L43
_L43:
        obj1 = obj5;
        if (obj6 == null) goto _L37; else goto _L44
_L44:
        obj1 = obj5;
        if (obj2 == null) goto _L37; else goto _L45
_L45:
        obj2 = com.go.weatherex.home.a.c.a(b, ((Bitmap) (obj2)), 15);
        obj1 = obj5;
        if (obj2 == null) goto _L37; else goto _L46
_L46:
        hashmap.put(obj6, obj2);
        obj1 = obj2;
          goto _L37
_L19:
        obj1 = a((r)obj4, resources, s, k, i1, hashmap);
          goto _L17
_L18:
        obj1 = a(((t) (obj4)), resources, s, k, i1, hashmap);
          goto _L17
_L14:
        hashmap.clear();
        return ((m) (obj7));
        obj1;
        obj1 = obj5;
          goto _L37
        obj1;
        obj1 = obj2;
          goto _L37
        obj1;
        obj1 = null;
          goto _L37
        obj1;
        obj1 = obj5;
          goto _L24
        obj1;
        obj1 = obj4;
          goto _L24
        obj1;
        obj1 = null;
          goto _L24
_L39:
        obj1 = null;
          goto _L37
_L4:
        obj4 = null;
          goto _L6
_L26:
        obj1 = null;
          goto _L24
        j1 = 0;
        obj2 = null;
        obj1 = null;
          goto _L47
    }
}
