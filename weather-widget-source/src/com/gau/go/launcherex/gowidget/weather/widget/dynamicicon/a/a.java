// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.gau.go.launcherex.gowidget.scriptengine.parser.ab;
import com.gau.go.launcherex.gowidget.scriptengine.parser.ad;
import com.gau.go.launcherex.gowidget.scriptengine.parser.b;
import com.gau.go.launcherex.gowidget.scriptengine.parser.g;
import com.gau.go.launcherex.gowidget.scriptengine.parser.o;
import com.gau.go.launcherex.gowidget.scriptengine.parser.p;
import com.gau.go.launcherex.gowidget.scriptengine.parser.q;
import com.gau.go.launcherex.gowidget.scriptengine.parser.r;
import com.gau.go.launcherex.gowidget.scriptengine.parser.t;
import com.gau.go.launcherex.gowidget.scriptengine.parser.x;
import com.gau.go.launcherex.gowidget.scriptengine.parser.y;
import com.gau.go.launcherex.gowidget.scriptengine.parser.z;
import com.jiubang.core.a.d;
import com.jiubang.core.a.e;
import com.jiubang.core.a.f;
import com.jiubang.core.a.h;
import com.jiubang.core.a.i;
import com.jiubang.core.a.j;
import com.jiubang.core.a.l;
import com.jiubang.core.a.m;
import com.jiubang.core.a.n;
import com.jiubang.core.a.u;
import com.jiubang.core.a.v;
import java.util.HashMap;

public class a
{

    private z a;
    private Context b;
    private Context c;
    private String d;
    private int e;
    private int f;
    private float g;
    private float h;

    public a(z z1, Context context, String s, int k, int i1)
    {
        a = z1;
        b = context;
        d = s;
        h = 200F;
        g = context.getResources().getDisplayMetrics().density;
        f = k;
        e = i1;
        a(context, s);
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
            return (int)((f1 / h) * (float)f);

        case 1: // '\001'
            return (int)((f1 / h) * (float)f);

        case 2: // '\002'
            return (int)((f1 / h) * (float)f);

        case 3: // '\003'
            return (int)(((f1 + f3) / h) * (float)f - f2) + 1;

        case 4: // '\004'
            return (int)(((f1 + f3) / h) * (float)f - f2) + 1;

        case 5: // '\005'
            return (int)(((f3 * 0.5F + f1) / h) * (float)f - f2 * 0.5F);
        }
    }

    private int a(float f1, float f2, float f3, int k, float f4, float f5)
    {
        switch (k)
        {
        default:
            return (int)((f1 / 200F) * ((float)e - f5));

        case 1: // '\001'
            return (int)((f1 / 200F) * ((float)e - f5));

        case 2: // '\002'
            return (int)(a((f1 / 200F) * (200F - f4) + f3, 200F, e, f4, f5) - f2) + 1;

        case 3: // '\003'
            return (int)((f1 / 200F) * ((float)e - f5));

        case 4: // '\004'
            return (int)(a((f1 / 200F) * (200F - f4) + f3, 200F, e, f4, f5) - f2) + 1;

        case 5: // '\005'
            return (int)(a(f3 * 0.5F + (f1 / 200F) * (200F - f4), 200F, e, f4, f5) - f2 * 0.5F);
        }
    }

    private int a(float f1, int k, float f2, int i1, float f3, float f4)
    {
        if (k == 1)
        {
            return a(f1, f3, f4, i1, 0.0F, 0.0F);
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
                s.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
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
            s.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
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

    private f a(com.gau.go.launcherex.gowidget.scriptengine.parser.a a1)
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

    private f a(p p1, int k, int i1, HashMap hashmap)
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
                        bitmap = a(resources, q1.a, d, k, i1);
                    } else
                    {
                        bitmap = a(resources, q1.a, d);
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
            f1 = (f1 / h) * (float)f;
        } else
        {
            f1 *= k;
        }
        k = x1.l();
        f2 = x1.j();
        if (k == 0)
        {
            f2 = (f2 / 200F) * (float)e;
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
            f2 = a(f2, i1, f4, j1, 0.0F, 0.0F);
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
        obj = a((com.gau.go.launcherex.gowidget.scriptengine.parser.a)obj);
        continue; /* Loop/switch isn't completed */
_L9:
        obj = a((x)obj, k, i1, f3, f4);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = a((y)obj, k, i1, f1, f2, f3, f4);
        continue; /* Loop/switch isn't completed */
_L8:
        obj = a((ad)obj, k, i1, f, e, f3, f4);
        continue; /* Loop/switch isn't completed */
_L11:
        obj = a((ab)obj, k, i1, j1, k1, f1, f2, hashmap, f3, f4);
        continue; /* Loop/switch isn't completed */
_L10:
        obj = a((p)obj, k, i1, hashmap);
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
        k2 = a(((g) (obj)).b(), j1, f2, 1, 0.0F, 0.0F);
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
                    j1 = (int)((f2 / h) * (float)f);
                    k1 = (int)((f1 / 200F) * (float)e);
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
                resources = new com.jiubang.core.a.p(b, i2, k2, j1, k1, s, f, e);
                resources.a(r1.b());
                resources.e(r1.d());
                j1 = r1.k();
                resources.f(a(i2, r1.g(), j1, resources.c(), h, f, 0.0F));
                j1 = r1.l();
                resources.g(a(k2, r1.h(), j1, resources.d(), 200F, e, 0.0F));
                resources.b(r1.c());
                j1 = r1.i();
                resources.c(a(i2, r1.e(), j1, resources.c(), h, f, 0.0F));
                j1 = r1.j();
                resources.d(a(k2, r1.f(), j1, resources.d(), 200F, e, 0.0F));
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
                        j1 = (int)((f1 / h) * (float)f);
                        k1 = (int)((f2 / 200F) * (float)e);
                    }
                    l1 = t1.v();
                    k = b(t1.q(), t1.t(), k, l1, j1, f1);
                    i1 = a(t1.r(), t1.u(), i1, l1, k1, f2);
                    resources = new l(b, k, i1, j1, k1, resources, f, e);
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
        Object obj;
        Object obj1;
        HashMap hashmap;
        Resources resources;
        Object obj2;
        Object obj3;
        String s1;
        int k;
        int i1;
        hashmap = new HashMap();
        resources = c.getResources();
        obj2 = a.e();
        obj3 = a.g();
        k = 1;
        i1 = 1;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_416;
        }
        s1 = ((b) (obj2)).a();
        obj1 = (Bitmap)hashmap.get(s1);
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        if (s1 == null) goto _L4; else goto _L3
_L3:
        obj = a(resources, s1, s);
        if (obj == null) goto _L4; else goto _L5
_L5:
        hashmap.put(s1, obj);
_L2:
        int j1;
        k = ((b) (obj2)).b();
        int l1;
        if (obj != null)
        {
            int k1 = ((Bitmap) (obj)).getWidth();
            i1 = ((Bitmap) (obj)).getHeight();
            j1 = k;
            k = k1;
        } else
        {
            int i2 = ((b) (obj2)).c();
            i1 = ((b) (obj2)).d();
            j1 = k;
            k = i2;
        }
_L19:
        if (obj3 == null) goto _L7; else goto _L6
_L6:
        obj3 = ((o) (obj3)).a();
        obj1 = (Bitmap)hashmap.get(obj3);
        if (obj1 != null) goto _L9; else goto _L8
_L8:
        if (obj3 == null) goto _L7; else goto _L10
_L10:
        obj1 = a(resources, ((String) (obj3)), s);
        if (obj1 == null) goto _L7; else goto _L11
_L11:
        hashmap.put(obj3, obj1);
_L9:
        obj3 = new m(b, 0, 0, k, i1, ((Bitmap) (obj)), ((Bitmap) (obj1)), f, e);
        ((m) (obj3)).a(j1);
        if (obj2 != null)
        {
            ((m) (obj3)).b(((b) (obj2)).h());
        }
        l1 = a.i();
        obj = null;
        j1 = 0;
_L17:
        if (j1 >= l1)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        obj2 = a.b(j1);
        obj1 = obj;
        if (obj2 == null) goto _L13; else goto _L12
_L12:
        ((t) (obj2)).m();
        JVM INSTR tableswitch 0 1: default 304
    //                   0 379
    //                   1 357;
           goto _L14 _L15 _L16
_L14:
        break; /* Loop/switch isn't completed */
_L15:
        break MISSING_BLOCK_LABEL_379;
_L18:
        obj1 = obj;
        if (obj != null)
        {
            ((m) (obj3)).a(((i) (obj)));
            obj1 = obj;
        }
_L13:
        j1++;
        obj = obj1;
          goto _L17
_L16:
        obj = a((r)obj2, resources, s, k, i1, hashmap);
          goto _L18
        obj = a(((t) (obj2)), resources, s, k, i1, hashmap);
          goto _L18
        hashmap.clear();
        return ((m) (obj3));
_L7:
        obj1 = null;
        if (true) goto _L9; else goto _L4
_L4:
        obj = null;
          goto _L2
        j1 = -1;
        obj = null;
          goto _L19
    }
}
