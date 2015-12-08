// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.content.Context;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.view.GLContentView;
import com.go.gl.view.GLView;
import java.lang.ref.SoftReference;

// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            a

public class e
{

    private static e a;
    private final int A = 6;
    private GLDrawable B[];
    private GLDrawable C;
    private GLDrawable D;
    private GLDrawable E;
    private GLDrawable F;
    private GLDrawable G;
    private final int H = 8;
    private GLDrawable I[];
    private GLDrawable J[];
    private GLDrawable K;
    private GLDrawable L;
    private GLDrawable M;
    private GLDrawable N;
    private GLDrawable O;
    private GLDrawable P;
    private GLDrawable Q;
    private GLDrawable R;
    private GLDrawable S;
    private GLDrawable T;
    private GLDrawable b;
    private GLDrawable c;
    private GLDrawable d;
    private GLDrawable e;
    private GLDrawable f;
    private GLDrawable g;
    private GLDrawable h;
    private GLDrawable i;
    private GLDrawable j;
    private GLDrawable k;
    private GLDrawable l;
    private GLDrawable m;
    private GLDrawable n;
    private GLDrawable o;
    private SoftReference p;
    private SoftReference q;
    private SoftReference r;
    private GLDrawable s;
    private GLDrawable t;
    private GLDrawable u;
    private GLDrawable v;
    private GLDrawable w;
    private GLDrawable x;
    private GLDrawable y;
    private GLDrawable z;

    private e()
    {
        B = new GLDrawable[6];
        I = new GLDrawable[8];
        J = new GLDrawable[8];
    }

    public static e a()
    {
        if (a == null)
        {
            a = new e();
        }
        return a;
    }

    public static void a(GLView glview, GLDrawable gldrawable, int i1, int j1, float f1, float af[], float f2, float f3, 
            float af1[])
    {
        if (gldrawable != null && glview != null)
        {
            if ((glview = glview.getGLRootView()) != null)
            {
                int l1 = 1;
                int k1 = l1;
                if (-1F == af[0])
                {
                    k1 = l1;
                    if (af[1] != -1F)
                    {
                        k1 = 0;
                    }
                }
                float f6 = f1;
                if (f1 == -1F)
                {
                    f6 = 1.0F;
                }
                float f4 = f2;
                if (f2 == -1F)
                {
                    f4 = 0.5F;
                }
                float f5 = f3;
                if (f3 == -1F)
                {
                    f5 = 0.5F;
                }
                f3 = glview.getDepthForProjectScale(f6);
                l1 = gldrawable.getIntrinsicWidth();
                int i2 = gldrawable.getIntrinsicHeight();
                if (af[0] == -1F && af[1] == -1F)
                {
                    f2 = l1;
                    f1 = i2;
                } else
                if (k1 != 0)
                {
                    f2 = ((float)i1 * af[0]) / f6;
                    f1 = (int)((f2 / (float)l1) * (float)i2);
                } else
                {
                    f1 = ((float)j1 * af[1]) / f6;
                    f2 = (f1 / (float)i2) * (float)l1;
                }
                i1 = (int)((float)i1 * f4 - f2 / 2.0F);
                k1 = (int)(f2 + (float)i1);
                j1 = (int)((float)(-j1) * f5 + f1 / 2.0F);
                l1 = (int)((float)j1 - f1);
                gldrawable.setBounds3D(new float[] {
                    (float)i1, (float)j1, f3, (float)i1, (float)l1, f3, (float)k1, (float)j1, f3
                }, 0, 3, 6, false, false);
                if (af1 != null && af1.length > 1)
                {
                    af1[0] = (i1 + k1) / 2;
                    af1[1] = (j1 + l1) / 2;
                    if (af1.length > 2)
                    {
                        af1[2] = f3;
                        return;
                    }
                }
            }
        }
    }

    private boolean a(GLDrawable gldrawable)
    {
        return gldrawable != null && !gldrawable.isBitmapRecycled() && gldrawable.getBitmap() != null;
    }

    private boolean a(SoftReference softreference)
    {
        return softreference != null && softreference.get() != null && !((GLDrawable)softreference.get()).isBitmapRecycled() && ((GLDrawable)softreference.get()).getBitmap() != null;
    }

    public GLDrawable A(Context context)
    {
        if (a(R)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_full_cloud2", context);
        if (drawable != null)
        {
            try
            {
                R = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (R == null)
        {
            R = L(context);
        }
_L4:
        return R;
_L2:
        R.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable B(Context context)
    {
        if (a(i)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_cloud1", context);
        if (drawable != null)
        {
            try
            {
                i = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (i == null)
        {
            i = L(context);
        }
_L4:
        return i;
_L2:
        i.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable C(Context context)
    {
        if (a(j)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_full_cloud2", context);
        if (drawable != null)
        {
            try
            {
                j = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (j == null)
        {
            j = L(context);
        }
_L4:
        return j;
_L2:
        j.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable D(Context context)
    {
        if (!a(t))
        {
            android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_snow", context);
            if (drawable != null)
            {
                t = GLDrawable.getDrawable(drawable);
            }
            if (t == null)
            {
                t = L(context);
            }
        } else
        {
            t.duplicate();
        }
        return t;
    }

    public GLDrawable E(Context context)
    {
        if (!a(u))
        {
            android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_snow", context);
            if (drawable != null)
            {
                u = GLDrawable.getDrawable(drawable);
            }
            if (u == null)
            {
                u = L(context);
            }
        } else
        {
            u.duplicate();
        }
        return u;
    }

    public GLDrawable F(Context context)
    {
        if (!a(v))
        {
            android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_snow", context);
            if (drawable != null)
            {
                v = GLDrawable.getDrawable(drawable);
            }
            if (v == null)
            {
                v = L(context);
            }
        } else
        {
            v.duplicate();
        }
        return v;
    }

    public GLDrawable G(Context context)
    {
        if (!a(w))
        {
            android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_rain", context);
            if (drawable != null)
            {
                w = GLDrawable.getDrawable(drawable);
            }
            if (w == null)
            {
                w = L(context);
            }
        } else
        {
            w.duplicate();
        }
        return w;
    }

    public GLDrawable H(Context context)
    {
        if (!a(x))
        {
            android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_rain", context);
            if (drawable != null)
            {
                x = GLDrawable.getDrawable(drawable);
            }
            if (x == null)
            {
                x = L(context);
            }
        } else
        {
            x.duplicate();
        }
        return x;
    }

    public GLDrawable I(Context context)
    {
        if (!a(y))
        {
            android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_rain", context);
            if (drawable != null)
            {
                y = GLDrawable.getDrawable(drawable);
            }
            if (y == null)
            {
                y = L(context);
            }
        } else
        {
            y.duplicate();
        }
        return y;
    }

    public GLDrawable J(Context context)
    {
        if (a(z)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_water", context);
        if (drawable != null)
        {
            try
            {
                z = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (z == null)
        {
            z = L(context);
        }
_L4:
        return z;
_L2:
        z.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable[] K(Context context)
    {
        int i1 = 0;
        if (B == null)
        {
            B = new GLDrawable[6];
        }
        while (i1 < 6) 
        {
            if (!a(B[i1]))
            {
                android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a((new String[] {
                    "panel_weather_thunder1", "panel_weather_thunder2", "panel_weather_thunder3", "panel_weather_thunder4", "panel_weather_thunder5", "panel_weather_thunder6"
                })[i1], context);
                if (drawable != null)
                {
                    B[i1] = GLDrawable.getDrawable(drawable);
                }
                if (B[i1] == null)
                {
                    B[i1] = L(context);
                }
            } else
            {
                B[i1].duplicate();
            }
            i1++;
        }
        return B;
    }

    public GLDrawable L(Context context)
    {
        if (!a(S))
        {
            S = GLDrawable.getDrawable(context.getResources(), 0x7f02063d);
        } else
        {
            S.duplicate();
        }
        return S;
    }

    public GLDrawable M(Context context)
    {
        if (!a(T))
        {
            android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_n_a", context);
            if (drawable != null)
            {
                T = GLDrawable.getDrawable(drawable);
            }
            if (T == null)
            {
                T = L(context);
            }
        } else
        {
            T.duplicate();
        }
        return T;
    }

    public GLDrawable a(Context context)
    {
        if (a(K)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_to_left", context);
        if (drawable != null)
        {
            try
            {
                K = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (K == null)
        {
            K = L(context);
        }
_L4:
        return K;
_L2:
        K.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable b(Context context)
    {
        if (a(L)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_to_right", context);
        if (drawable != null)
        {
            try
            {
                L = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (L == null)
        {
            L = L(context);
        }
_L4:
        return L;
_L2:
        L.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b()
    {
        if (b != null)
        {
            b.clear();
            b = null;
        }
        if (g != null)
        {
            g.clear();
            g = null;
        }
        if (c != null)
        {
            c.clear();
            c = null;
        }
        if (O != null)
        {
            O.clear();
            O = null;
        }
        if (d != null)
        {
            d.clear();
            d = null;
        }
        if (e != null)
        {
            e.clear();
            e = null;
        }
        if (f != null)
        {
            f.clear();
            f = null;
        }
        if (h != null)
        {
            h.clear();
            h = null;
        }
        if (i != null)
        {
            i.clear();
            i = null;
        }
        if (j != null)
        {
            j.clear();
            j = null;
        }
        if (k != null)
        {
            k.clear();
            k = null;
        }
        if (l != null)
        {
            l.clear();
            l = null;
        }
        if (m != null)
        {
            m.clear();
            m = null;
        }
        if (n != null)
        {
            n.clear();
            n = null;
        }
        if (o != null)
        {
            o.clear();
            o = null;
        }
        if (p != null)
        {
            GLDrawable gldrawable = (GLDrawable)p.get();
            if (gldrawable != null)
            {
                gldrawable.clear();
            }
            p.clear();
            p = null;
        }
        if (q != null)
        {
            GLDrawable gldrawable1 = (GLDrawable)q.get();
            if (gldrawable1 != null)
            {
                gldrawable1.clear();
            }
            q.clear();
            q = null;
        }
        if (r != null)
        {
            GLDrawable gldrawable2 = (GLDrawable)r.get();
            if (gldrawable2 != null)
            {
                gldrawable2.clear();
            }
            r.clear();
            r = null;
        }
        if (s != null)
        {
            s.clear();
            s = null;
        }
        if (t != null)
        {
            t.clear();
            t = null;
        }
        if (u != null)
        {
            u.clear();
            u = null;
        }
        if (v != null)
        {
            v.clear();
            v = null;
        }
        if (w != null)
        {
            w.clear();
            w = null;
        }
        if (x != null)
        {
            x.clear();
            x = null;
        }
        if (y != null)
        {
            y.clear();
            y = null;
        }
        if (z != null)
        {
            z.clear();
            z = null;
        }
        if (C != null)
        {
            C.clear();
            C = null;
        }
        if (D != null)
        {
            D.clear();
            D = null;
        }
        if (B != null)
        {
            for (int i1 = 0; i1 < 6; i1++)
            {
                if (B[i1] != null)
                {
                    B[i1].clear();
                    B[i1] = null;
                }
            }

            B = null;
        }
        if (E != null)
        {
            E.clear();
            E = null;
        }
        if (F != null)
        {
            F.clear();
            F = null;
        }
        if (G != null)
        {
            G.clear();
            G = null;
        }
        for (int j1 = 0; j1 < 8; j1++)
        {
            if (J != null)
            {
                if (J[j1] != null)
                {
                    J[j1].clear();
                    J[j1] = null;
                }
                J = null;
            }
            if (I == null)
            {
                continue;
            }
            if (I[j1] != null)
            {
                I[j1].clear();
                I[j1] = null;
            }
            I = null;
        }

        if (M != null)
        {
            M.clear();
            M = null;
        }
        if (K != null)
        {
            K.clear();
            K = null;
        }
        if (L != null)
        {
            L.clear();
            L = null;
        }
        if (S != null)
        {
            S.clear();
            S = null;
        }
        if (T != null)
        {
            T.clear();
            T = null;
        }
    }

    public GLDrawable c(Context context)
    {
        if (a(M)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_to_fore", context);
        if (drawable != null)
        {
            try
            {
                M = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (M == null)
        {
            M = L(context);
        }
_L4:
        return M;
_L2:
        M.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable d(Context context)
    {
        if (a(N)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_from_fore", context);
        if (drawable != null)
        {
            try
            {
                N = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (N == null)
        {
            N = L(context);
        }
_L4:
        return N;
_L2:
        N.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable[] e(Context context)
    {
        if (I == null)
        {
            I = new GLDrawable[8];
        }
        int i1 = 0;
        while (i1 < 8) 
        {
            if (!a(I[i1]))
            {
                try
                {
                    I[i1] = GLDrawable.getDrawable(context.getResources(), (new int[] {
                        0x7f0202d6, 0x7f0202d0, 0x7f0202c2, 0x7f0202c6, 0x7f0202ce, 0x7f0202c8, 0x7f0202cc, 0x7f0202d4
                    })[i1]);
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    outofmemoryerror.printStackTrace();
                }
            } else
            {
                I[i1].duplicate();
            }
            i1++;
        }
        return I;
    }

    public GLDrawable[] f(Context context)
    {
        if (J == null)
        {
            J = new GLDrawable[8];
        }
        int i1 = 0;
        while (i1 < 8) 
        {
            if (!a(J[i1]))
            {
                try
                {
                    J[i1] = GLDrawable.getDrawable(context.getResources(), (new int[] {
                        0x7f0202d7, 0x7f0202d1, 0x7f0202c3, 0x7f0202c7, 0x7f0202cf, 0x7f0202c9, 0x7f0202cd, 0x7f0202d5
                    })[i1]);
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    outofmemoryerror.printStackTrace();
                }
            } else
            {
                J[i1].duplicate();
            }
            i1++;
        }
        return J;
    }

    public GLDrawable g(Context context)
    {
        if (a(s)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_rainy_wall", context);
        if (drawable != null)
        {
            try
            {
                s = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (s == null)
        {
            s = L(context);
        }
_L4:
        return s;
_L2:
        s.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable h(Context context)
    {
        if (a(p))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        try
        {
            context = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_fog_c1", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        p = new SoftReference(GLDrawable.getDrawable(context));
        context = (GLDrawable)p.get();
        return context;
        ((GLDrawable)p.get()).duplicate();
        return (GLDrawable)p.get();
    }

    public GLDrawable i(Context context)
    {
        if (a(q))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        try
        {
            context = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_fog_c2", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        q = new SoftReference(GLDrawable.getDrawable(context));
        context = (GLDrawable)q.get();
        return context;
        ((GLDrawable)q.get()).duplicate();
        return (GLDrawable)q.get();
    }

    public GLDrawable j(Context context)
    {
        if (a(r))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        try
        {
            context = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_fog_c2", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        r = new SoftReference(GLDrawable.getDrawable(context));
        context = (GLDrawable)r.get();
        return context;
        ((GLDrawable)r.get()).duplicate();
        return (GLDrawable)r.get();
    }

    public GLDrawable k(Context context)
    {
        if (a(l)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_night_sky", context);
        if (drawable != null)
        {
            try
            {
                l = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (l == null)
        {
            l = L(context);
        }
_L4:
        return l;
_L2:
        l.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable l(Context context)
    {
        if (a(m)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_full_start", context);
        if (drawable != null)
        {
            try
            {
                m = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (m == null)
        {
            m = L(context);
        }
_L4:
        return m;
_L2:
        m.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable m(Context context)
    {
        if (a(n)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_full_start", context);
        if (drawable != null)
        {
            try
            {
                n = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (n == null)
        {
            n = L(context);
        }
_L4:
        return n;
_L2:
        n.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable n(Context context)
    {
        if (a(o)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_full_start", context);
        if (drawable != null)
        {
            try
            {
                o = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (o == null)
        {
            o = L(context);
        }
_L4:
        return o;
_L2:
        o.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable o(Context context)
    {
        if (a(c)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_light1", context);
        if (drawable != null)
        {
            try
            {
                c = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (c == null)
        {
            c = L(context);
        }
_L4:
        return c;
_L2:
        c.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable p(Context context)
    {
        if (a(d)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_light2", context);
        if (drawable != null)
        {
            try
            {
                d = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (d == null)
        {
            d = L(context);
        }
_L4:
        return d;
_L2:
        d.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable q(Context context)
    {
        if (a(e)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_light3", context);
        if (drawable != null)
        {
            try
            {
                e = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (e == null)
        {
            e = L(context);
        }
_L4:
        return e;
_L2:
        e.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable r(Context context)
    {
        if (a(f)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_light4", context);
        if (drawable != null)
        {
            try
            {
                f = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (f == null)
        {
            f = L(context);
        }
_L4:
        return f;
_L2:
        f.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable s(Context context)
    {
        if (a(b)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_sun", context);
        if (drawable != null)
        {
            try
            {
                b = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (b == null)
        {
            b = L(context);
        }
_L4:
        return b;
_L2:
        b.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable t(Context context)
    {
        if (a(k)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_wall", context);
        if (drawable != null)
        {
            try
            {
                k = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (k == null)
        {
            k = L(context);
        }
_L4:
        return k;
_L2:
        k.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable u(Context context)
    {
        if (a(g)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_full_moon", context);
        if (drawable != null)
        {
            try
            {
                g = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (g == null)
        {
            g = L(context);
        }
_L4:
        return g;
_L2:
        g.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable v(Context context)
    {
        if (a(D)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_rain_cloud", context);
        if (drawable != null)
        {
            try
            {
                D = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (D == null)
        {
            D = L(context);
        }
_L4:
        return D;
_L2:
        D.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable w(Context context)
    {
        if (a(O)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_full_cloud0", context);
        if (drawable != null)
        {
            try
            {
                O = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (O == null)
        {
            O = L(context);
        }
_L4:
        return O;
_L2:
        O.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable x(Context context)
    {
        if (a(h)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_full_cloud0", context);
        if (drawable != null)
        {
            try
            {
                h = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (h == null)
        {
            h = L(context);
        }
_L4:
        return h;
_L2:
        h.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable y(Context context)
    {
        if (a(P)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_full_cloud0", context);
        if (drawable != null)
        {
            try
            {
                P = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (P == null)
        {
            P = L(context);
        }
_L4:
        return P;
_L2:
        P.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GLDrawable z(Context context)
    {
        if (a(Q)) goto _L2; else goto _L1
_L1:
        android.graphics.drawable.Drawable drawable = com.gtp.nextlauncher.widget.nextpanel.a.a().a("panel_weather_cloud1", context);
        if (drawable != null)
        {
            try
            {
                Q = GLDrawable.getDrawable(drawable);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
        }
        if (Q == null)
        {
            Q = L(context);
        }
_L4:
        return Q;
_L2:
        Q.duplicate();
        if (true) goto _L4; else goto _L3
_L3:
    }
}
