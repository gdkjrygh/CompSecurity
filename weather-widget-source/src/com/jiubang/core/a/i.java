// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import java.lang.ref.SoftReference;

// Referenced classes of package com.jiubang.core.a:
//            q, t, h, s

public abstract class i
{

    private h A;
    private float B;
    private volatile boolean C;
    private float D;
    private int E;
    private float F;
    private int G;
    private int H;
    private int I;
    private int J;
    private final ViewConfiguration K;
    protected volatile int a;
    protected volatile int b;
    protected volatile int c;
    protected volatile int d;
    protected volatile int e;
    protected volatile int f;
    protected s g;
    protected boolean h;
    protected Paint i;
    protected Bitmap j;
    protected Rect k;
    protected boolean l;
    protected q m;
    protected t n;
    protected Matrix o;
    protected volatile boolean p;
    protected Bitmap q;
    protected int r;
    protected int s;
    int t;
    int u;
    int v;
    int w;
    SoftReference x;
    private Context y;
    private int z;

    public i(Context context, int i1, int j1, int k1, int l1, Bitmap bitmap, int i2, 
            int j2)
    {
        h = true;
        z = 0;
        w = 255;
        K = ViewConfiguration.get(context);
        a = i1;
        b = j1;
        c = i1;
        d = j1;
        e = k1;
        f = l1;
        j = bitmap;
        k = new Rect(i1, j1, i1 + k1, j1 + l1);
        i = new Paint();
        y = context;
        m = new q();
        o = new Matrix();
        B = 1.0F;
        C = false;
        D = 1.0F;
        F = 1.0F;
        H = 0;
        n = new t();
        r = i2;
        s = j2;
    }

    private boolean c(float f1, int i1)
    {
        boolean flag = true;
        f1 = (float)a + f1;
        if ((float)e + f1 < 0.0F || f1 > (float)i1)
        {
            flag = false;
        }
        return flag;
    }

    private void v()
    {
        n.i();
        m.c();
        m.a(B);
        Matrix matrix = m.a();
        matrix.postTranslate(c, d);
        matrix.postScale(D, F, E, G);
        matrix.postRotate(H, I, J);
    }

    public int a()
    {
        return r;
    }

    public Bitmap a(float f1, int i1)
    {
        if ((t & 0x8000) == 32768)
        {
            b(f1, i1);
        }
        if (x == null)
        {
            return null;
        } else
        {
            return (Bitmap)x.get();
        }
    }

    public void a(float f1)
    {
        B = f1;
    }

    public void a(int i1)
    {
        z = i1;
    }

    public void a(int i1, int j1)
    {
        a = i1;
        b = j1;
        k.left = i1;
        k.top = j1;
        k.right = e + i1;
        k.bottom = f + j1;
    }

    public void a(int i1, int j1, int k1, int l1)
    {
        b(i1, j1, k1, l1);
    }

    public void a(Bitmap bitmap)
    {
        j = bitmap;
    }

    public void a(Canvas canvas, float f1, float f2, float f3, int i1, int j1)
    {
        a(canvas, f1, f2, f3, i1, j1, true);
    }

    public void a(Canvas canvas, float f1, float f2, float f3, int i1, int j1, boolean flag)
    {
        p = flag;
        if (C && c(f3, i1))
        {
            b(canvas, f3, i1, j1);
        }
    }

    protected abstract void a(Canvas canvas, float f1, int i1, int j1);

    public void a(h h1)
    {
        A = h1;
    }

    public void a(s s1)
    {
        g = s1;
    }

    public void a(boolean flag)
    {
        h = flag;
    }

    public boolean a(long l1)
    {
        if (!C)
        {
            C = true;
        }
        a = c;
        b = d;
        v();
        boolean flag = false;
        if (A != null)
        {
            flag = A.b(m, this, l1, n);
        }
        boolean flag1 = flag;
        if (!flag)
        {
            flag1 = flag;
            if (A != null)
            {
                flag1 = flag;
                if (A.c())
                {
                    if (!A.d())
                    {
                        A = null;
                    }
                    flag1 = true;
                }
            }
        }
        return flag1;
    }

    public int b()
    {
        return s;
    }

    public void b(float f1)
    {
        D = f1;
    }

    public void b(float f1, int i1)
    {
        if ((u & 0x8000) != 0 && x != null && x.get() != null) goto _L2; else goto _L1
_L1:
        Context context;
        boolean flag;
        int k1;
        int l1;
        int i2;
        context = l();
        l1 = c();
        i2 = d();
        k1 = v;
        if (k1 != 0 || k())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l1 > 0 && i2 > 0 && l1 * i2 * 4 <= K.getScaledMaximumDrawingCacheSize()) goto _L4; else goto _L3
_L3:
        o();
_L2:
        return;
_L4:
        int j1;
        Bitmap bitmap;
        Object obj;
        if (x == null)
        {
            bitmap = null;
        } else
        {
            bitmap = (Bitmap)x.get();
        }
        if (bitmap != null && bitmap.getWidth() == l1 && bitmap.getHeight() == i2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = android.graphics.Bitmap.Config.ARGB_8888;
        if (flag)
        {
            obj = android.graphics.Bitmap.Config.ARGB_8888;
        }
        if (bitmap != null)
        {
            bitmap.recycle();
        }
        try
        {
            bitmap = Bitmap.createBitmap(l1, i2, ((android.graphics.Bitmap.Config) (obj)));
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
            x = null;
            return;
        }
        if (bitmap == null || context == null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        bitmap.setDensity(context.getResources().getDisplayMetrics().densityDpi);
        x = new SoftReference(bitmap);
        if (k1 != 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
_L6:
        if (bitmap != null)
        {
            obj = new Canvas(bitmap);
            if (j1 != 0)
            {
                bitmap.eraseColor(k1);
            }
            j1 = ((Canvas) (obj)).save();
            u = u | 0x20;
            u = u | 0x8000;
            a(((Canvas) (obj)), 0.0F, 0.0F, f1, i1, 255);
            ((Canvas) (obj)).restoreToCount(j1);
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        j1 = 1;
          goto _L6
        if (true) goto _L2; else goto _L7
_L7:
    }

    public void b(int i1)
    {
        i.setFlags(i1);
    }

    protected final void b(int i1, int j1, int k1, int l1)
    {
        a = i1;
        b = j1;
        e = k1 - i1;
        f = l1 - j1;
        k.left = i1;
        k.top = j1;
        k.right = k1;
        k.bottom = l1;
    }

    public void b(Bitmap bitmap)
    {
        q = bitmap;
    }

    public final void b(Canvas canvas, float f1, int i1, int j1)
    {
        if (z != 0)
        {
            int k1 = i.getColor();
            int l1 = i.getAlpha();
            i.setColor(z);
            i.setAlpha(j1);
            canvas.drawRect(0.0F, 0.0F, e, f, i);
            i.setColor(k1);
            i.setAlpha(l1);
        }
        a(canvas, f1, i1, j1);
    }

    public int c()
    {
        return e;
    }

    public void c(int i1)
    {
        E = i1;
    }

    public int d()
    {
        return f;
    }

    public void d(int i1)
    {
        G = i1;
    }

    public void e(int i1)
    {
        H = i1;
    }

    public boolean e()
    {
        return h;
    }

    public void f()
    {
        if (!l)
        {
            l = true;
            g();
        }
    }

    public void f(int i1)
    {
        I = i1;
    }

    protected void g()
    {
    }

    public void g(int i1)
    {
        J = i1;
    }

    public int h()
    {
        return a;
    }

    public int i()
    {
        return b;
    }

    public abstract void j();

    boolean k()
    {
        return false;
    }

    public Context l()
    {
        return y;
    }

    public int m()
    {
        return w;
    }

    public boolean n()
    {
        return (t & 0x8000) == 32768;
    }

    public void o()
    {
        if (x != null)
        {
            Bitmap bitmap = (Bitmap)x.get();
            if (bitmap != null)
            {
                bitmap.recycle();
            }
            x = null;
        }
    }

    public void p()
    {
        if ((u & 0x20) == 32)
        {
            u = u & 0xffff7fdf;
        }
    }

    public Bitmap q()
    {
        return j;
    }

    public void r()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void s()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public Bitmap t()
    {
        return q;
    }

    public abstract boolean u();
}
