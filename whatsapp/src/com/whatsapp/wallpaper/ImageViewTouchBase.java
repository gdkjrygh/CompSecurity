// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp.wallpaper:
//            s, g, i, n

public abstract class ImageViewTouchBase extends ImageView
{

    public static boolean e;
    private final float a[];
    private g b;
    protected Matrix c;
    int d;
    public Matrix f;
    protected Matrix g;
    private float h;
    protected Handler i;
    int j;
    private Runnable k;
    protected float l;
    protected final s m;

    public ImageViewTouchBase(Context context)
    {
        super(context);
        c = new Matrix();
        g = new Matrix();
        f = new Matrix();
        a = new float[9];
        m = new s(null);
        j = -1;
        d = -1;
        h = 3F;
        i = new Handler();
        k = null;
        d();
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new Matrix();
        g = new Matrix();
        f = new Matrix();
        a = new float[9];
        m = new s(null);
        j = -1;
        d = -1;
        h = 3F;
        i = new Handler();
        k = null;
        d();
    }

    private void a(Bitmap bitmap, Matrix matrix)
    {
        super.setImageBitmap(bitmap);
        Object obj = getDrawable();
        if (obj != null)
        {
            ((Drawable) (obj)).setDither(true);
            ((Drawable) (obj)).setFilterBitmap(true);
        }
        obj = m.a();
        m.a(bitmap);
        m.a(matrix);
        if (obj != null && obj != bitmap && b != null)
        {
            b.a(((Bitmap) (obj)));
        }
    }

    private void a(s s1, Matrix matrix)
    {
        float f1 = getWidth();
        float f2 = getHeight();
        float f3 = s1.c();
        float f4 = s1.f();
        matrix.reset();
        float f5 = Math.min(Math.min(f1 / f3, h), Math.min(f2 / f4, h));
        matrix.postConcat(s1.e());
        matrix.postScale(f5, f5);
        matrix.postTranslate((f1 - f3 * f5) / 2.0F, (f2 - f4 * f5) / 2.0F);
    }

    private void d()
    {
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    public float a()
    {
        return a(g);
    }

    protected float a(Matrix matrix)
    {
        return a(matrix, 0);
    }

    protected float a(Matrix matrix, int i1)
    {
        matrix.getValues(a);
        return a[i1];
    }

    protected void a(float f1)
    {
        a(f1, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F);
    }

    public void a(float f1, float f2)
    {
        if (f1 != 0.0F || f2 != 0.0F)
        {
            b(f1, f2);
            setImageMatrix(e());
        }
    }

    protected void a(float f1, float f2, float f3)
    {
        float f4 = f1;
        if (f1 > l)
        {
            f4 = l;
        }
        f1 = f4 / a();
        g.postScale(f1, f1, f2, f3);
        setImageMatrix(e());
        a(true, true);
    }

    protected void a(float f1, float f2, float f3, float f4, Runnable runnable)
    {
        f1 = (f1 - a()) / f4;
        float f5 = a();
        long l1 = System.currentTimeMillis();
        i.post(new i(this, f4, l1, f5, f1, f2, f3, runnable));
    }

    protected void a(boolean flag, boolean flag1)
    {
        float f1;
        float f4;
        RectF rectf;
        int i1;
        boolean flag2;
        flag2 = e;
        if (m.a() == null)
        {
            return;
        }
        Matrix matrix = e();
        rectf = new RectF(0.0F, 0.0F, m.a().getWidth(), m.a().getHeight());
        matrix.mapRect(rectf);
        f1 = rectf.height();
        f4 = rectf.width();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        i1 = getHeight();
        if (f1 >= (float)i1) goto _L2; else goto _L1
_L1:
        float f2;
        f2 = ((float)i1 - f1) / 2.0F - rectf.top;
        f1 = f2;
        if (!flag2) goto _L4; else goto _L3
_L3:
        f1 = f2;
_L18:
        if (rectf.top <= 0.0F) goto _L6; else goto _L5
_L5:
        f2 = -rectf.top;
        f1 = f2;
        if (!flag2) goto _L4; else goto _L7
_L7:
        f1 = f2;
_L6:
        if (rectf.bottom >= (float)i1) goto _L4; else goto _L8
_L8:
        int j1;
        for (float f3 = (float)getHeight() - rectf.bottom; !flag; f3 = 0.0F)
        {
            break MISSING_BLOCK_LABEL_292;
        }

        j1 = getWidth();
        if (f4 >= (float)j1) goto _L10; else goto _L9
_L9:
        f4 = ((float)j1 - f4) / 2.0F - rectf.left;
        f1 = f4;
        if (!flag2) goto _L12; else goto _L11
_L11:
        f1 = f4;
_L16:
        if (rectf.left <= 0.0F) goto _L14; else goto _L13
_L13:
        f4 = -rectf.left;
        f1 = f4;
        if (!flag2) goto _L12; else goto _L15
_L15:
        f1 = f4;
_L14:
        if (rectf.right < (float)j1)
        {
            f1 = (float)j1 - rectf.right;
        }
_L12:
        b(f1, f3);
        setImageMatrix(e());
        return;
_L10:
        f1 = 0.0F;
          goto _L16
        f1 = 0.0F;
          goto _L12
_L4:
        f3 = f1;
          goto _L8
_L2:
        f1 = 0.0F;
        if (true) goto _L18; else goto _L17
_L17:
    }

    protected float b()
    {
        if (m.a() == null)
        {
            return 1.0F;
        } else
        {
            return Math.max(1.0F, Math.max((float)m.c() / (float)j, (float)m.f() / (float)d) * 4F);
        }
    }

    protected void b(float f1, float f2)
    {
        g.postTranslate(f1, f2);
    }

    public void c()
    {
        setImageBitmapResetBase(null, true);
    }

    public Matrix e()
    {
        f.set(c);
        f.postConcat(g);
        return f;
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && a() > 1.0F)
        {
            a(1.0F);
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        j = k1 - i1;
        d = l1 - j1;
        Runnable runnable = k;
        if (runnable != null)
        {
            k = null;
            runnable.run();
        }
        if (m.a() != null)
        {
            a(m, c);
            setImageMatrix(e());
        }
    }

    public void setImageBitmap(Bitmap bitmap)
    {
label0:
        {
            if (bitmap == null)
            {
                super.setImageBitmap(bitmap);
                if (!e)
                {
                    break label0;
                }
            }
            setImageBitmapResetBase(bitmap, true);
        }
    }

    public void setImageBitmapResetBase(Bitmap bitmap, boolean flag)
    {
        setImageRotateBitmapResetBase(new s(bitmap), flag);
    }

    public void setImageRotateBitmapResetBase(s s1, boolean flag)
    {
label0:
        {
            if (getWidth() <= 0)
            {
                k = new n(this, s1, flag);
                return;
            }
            if (s1.a() != null)
            {
                a(s1, c);
                a(s1.a(), s1.d());
                if (!e)
                {
                    break label0;
                }
            }
            c.reset();
            super.setImageBitmap(null);
        }
        if (flag)
        {
            g.reset();
        }
        setImageMatrix(e());
        l = b();
    }

    public void setMaxProperScale(float f1)
    {
        h = f1;
    }

    public void setRecycler(g g1)
    {
        b = g1;
    }
}
