// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import com.whatsapp.DialogToastActivity;

// Referenced classes of package com.whatsapp.wallpaper:
//            m, ImageViewTouchBase

class p
{

    private RectF a;
    private float b;
    private final Paint c = new Paint();
    private final Paint d = new Paint();
    private boolean e;
    Rect f;
    private int g;
    boolean h;
    RectF i;
    Matrix j;
    private boolean k;
    private final Paint l = new Paint();
    private m m;
    View n;

    public p(View view)
    {
        m = m.None;
        e = false;
        k = false;
        n = view;
    }

    private void a()
    {
    }

    private Rect e()
    {
        RectF rectf = new RectF(i.left, i.top, i.right, i.bottom);
        j.mapRect(rectf);
        return new Rect(Math.round(rectf.left), Math.round(rectf.top), Math.round(rectf.right), Math.round(rectf.bottom));
    }

    void a(float f1, float f2)
    {
        Rect rect = new Rect(f);
        i.offset(f1, f2);
        i.offset(Math.max(0.0F, a.left - i.left), Math.max(0.0F, a.top - i.top));
        i.offset(Math.min(0.0F, a.right - i.right), Math.min(0.0F, a.bottom - i.bottom));
        f = e();
        rect.union(f);
        rect.inset(-10, -10);
        n.invalidate(rect);
    }

    void a(int i1, float f1, float f2)
    {
label0:
        {
            boolean flag = ImageViewTouchBase.e;
            float f3;
            float f4;
            RectF rectf;
            if ((i1 & 6) == 0)
            {
                f3 = 0.0F;
            } else
            {
                f3 = f1;
            }
            if ((i1 & 0x18) == 0)
            {
                f2 = 0.0F;
            }
            f4 = f3;
            f1 = f2;
            if (!e)
            {
                break label0;
            }
            if (f3 != 0.0F)
            {
                f2 = f3 / b;
                f4 = f3;
                f1 = f2;
                if (!flag)
                {
                    break label0;
                }
            }
            f4 = f3;
            f1 = f2;
            if (f2 != 0.0F)
            {
                f4 = b * f2;
                f1 = f2;
            }
        }
label1:
        {
            rectf = new RectF(i);
            f2 = f1;
            if (!e)
            {
                break label1;
            }
            if ((i1 & 0x12) != 18)
            {
                f2 = f1;
                if ((i1 & 0xc) != 12)
                {
                    break label1;
                }
            }
            f2 = -f1;
        }
label2:
        {
            if ((i1 & 2) != 0)
            {
                rectf.left = rectf.left + f4;
                if (e && (i1 & 0x10) == 0 && (i1 & 8) == 0)
                {
                    rectf.top = rectf.top + f2 / 2.0F;
                    rectf.bottom = rectf.bottom - (f2 - f2 / 2.0F);
                }
            }
            if ((i1 & 4) != 0)
            {
                rectf.right = rectf.right + f4;
                if (e && (i1 & 0x10) == 0 && (i1 & 8) == 0)
                {
                    rectf.top = rectf.top - (f2 - f2 / 2.0F);
                    rectf.bottom = rectf.bottom + f2 / 2.0F;
                }
            }
            if ((i1 & 8) != 0)
            {
                rectf.top = rectf.top + f2;
                if (e && (i1 & 2) == 0 && (i1 & 4) == 0)
                {
                    rectf.left = rectf.left + f4 / 2.0F;
                    rectf.right = rectf.right - (f4 - f4 / 2.0F);
                }
            }
            if ((i1 & 0x10) != 0)
            {
                rectf.bottom = rectf.bottom + f2;
                if (e && (i1 & 2) == 0 && (i1 & 4) == 0)
                {
                    rectf.left = rectf.left - (f4 - f4 / 2.0F);
                    f1 = rectf.right;
                    rectf.right = f4 / 2.0F + f1;
                }
            }
            f2 = Math.max(25F, g);
            if (rectf.width() >= f2)
            {
                break label2;
            }
            if ((i1 & 2) != 0)
            {
                rectf.left = rectf.right - f2;
                if (!flag)
                {
                    break label2;
                }
            }
            if ((i1 & 4) != 0)
            {
                rectf.right = rectf.left + f2;
                if (!flag)
                {
                    break label2;
                }
            }
            rectf.inset(-(f2 - rectf.width()) / 2.0F, 0.0F);
        }
label3:
        {
            f1 = f2;
            if (e)
            {
                f1 = f2 / b;
            }
            if (rectf.height() >= f1)
            {
                break label3;
            }
            if ((i1 & 8) != 0)
            {
                rectf.top = rectf.bottom - f1;
                if (!flag)
                {
                    break label3;
                }
            }
            if ((i1 & 0x10) != 0)
            {
                rectf.bottom = rectf.top + f1;
                if (!flag)
                {
                    break label3;
                }
            }
            rectf.inset(0.0F, -(f1 - rectf.height()) / 2.0F);
        }
label4:
        {
            if (rectf.width() > a.width())
            {
                rectf.right = rectf.left + a.width();
                if (e)
                {
                    rectf.bottom = rectf.top + a.width() / b;
                }
            }
            if (rectf.height() > a.height())
            {
                rectf.bottom = rectf.top + a.height();
                if (e)
                {
                    rectf.right = rectf.left + a.height() * b;
                }
            }
            if (rectf.left < a.left)
            {
                rectf.offset(a.left - rectf.left, 0.0F);
                if (!flag)
                {
                    break label4;
                }
            }
            if (rectf.right > a.right)
            {
                rectf.offset(-(rectf.right - a.right), 0.0F);
            }
        }
label5:
        {
            if (rectf.top < a.top)
            {
                rectf.offset(0.0F, a.top - rectf.top);
                if (!flag)
                {
                    break label5;
                }
            }
            if (rectf.bottom > a.bottom)
            {
                rectf.offset(0.0F, -(rectf.bottom - a.bottom));
            }
        }
        i.set(rectf);
        f = e();
        n.invalidate();
        if (DialogToastActivity.g != 0)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            ImageViewTouchBase.e = flag;
        }
    }

    protected void a(Canvas canvas)
    {
label0:
        {
            boolean flag = ImageViewTouchBase.e;
            Path path = new Path();
            float f1 = n.getResources().getDisplayMetrics().density;
            d.setStrokeWidth(0.5F + f1);
            Rect rect1 = new Rect();
            n.getDrawingRect(rect1);
            if (k)
            {
                float f2 = f.width();
                float f3 = f.height();
                float f4 = f.left;
                float f5 = f2 / 2.0F;
                float f6 = f.top;
                path.addCircle(f4 + f5, f3 / 2.0F + f6, f2 / 2.0F, android.graphics.Path.Direction.CW);
                d.setColor(0xffef04d6);
                if (!flag)
                {
                    break label0;
                }
                DialogToastActivity.g++;
            }
            path.addRect(new RectF(f), android.graphics.Path.Direction.CW);
            d.setColor(0x66ffffff);
            Rect rect = new Rect();
            rect.set(rect1);
            rect.right = f.left;
            Paint paint;
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            int k2;
            int l2;
            if (b())
            {
                paint = c;
            } else
            {
                paint = l;
            }
            canvas.drawRect(rect, paint);
            rect.set(rect1);
            rect.right = f.right;
            rect.left = f.left;
            rect.bottom = f.top;
            if (b())
            {
                paint = c;
            } else
            {
                paint = l;
            }
            canvas.drawRect(rect, paint);
            rect.set(rect1);
            rect.right = f.right;
            rect.left = f.left;
            rect.top = f.bottom;
            if (b())
            {
                paint = c;
            } else
            {
                paint = l;
            }
            canvas.drawRect(rect, paint);
            rect.set(rect1);
            rect.left = f.right;
            if (b())
            {
                paint = c;
            } else
            {
                paint = l;
            }
            canvas.drawRect(rect, paint);
            l1 = Math.round(f1);
            i1 = f.left + l1;
            j1 = f.right - l1;
            k1 = f.top + l1;
            l1 = f.bottom - l1;
            canvas.drawLine(i1, f.top + (f.bottom - f.top) / 3, j1, f.top + (f.bottom - f.top) / 3, d);
            canvas.drawLine(i1, f.bottom - (f.bottom - f.top) / 3, j1, f.bottom - (f.bottom - f.top) / 3, d);
            canvas.drawLine(f.left + (f.right - f.left) / 3, k1, f.left + (f.right - f.left) / 3, l1, d);
            canvas.drawLine(f.right - (f.right - f.left) / 3, k1, f.right - (f.right - f.left) / 3, l1, d);
        }
        canvas.drawPath(path, d);
        l1 = Math.round(2.0F * f1);
        i1 = f.left + l1;
        j1 = f.right - l1;
        k1 = f.top + l1;
        l1 = f.bottom - l1;
        i2 = Math.min((int)(24F * f1), f.width() / 4);
        j2 = Math.min((int)(24F * f1), f.height() / 4);
        k2 = f.left + (f.right - f.left) / 2;
        l2 = f.top + (f.bottom - f.top) / 2;
        d.setStrokeWidth(2.0F * f1);
        d.setColor(-1);
        d.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        canvas.drawLine(k2 - i2 / 2, k1, i2 / 2 + k2, k1, d);
        canvas.drawLine(k2 - i2 / 2, l1, i2 / 2 + k2, l1, d);
        canvas.drawLine(i1, l2 - j2 / 2, i1, j2 / 2 + l2, d);
        canvas.drawLine(j1, l2 - j2 / 2, j1, j2 / 2 + l2, d);
        canvas.drawLine(i1, k1, i1 + i2, k1, d);
        canvas.drawLine(i1, k1, i1, k1 + j2, d);
        canvas.drawLine(j1, k1, j1 - i2, k1, d);
        canvas.drawLine(j1, k1, j1, k1 + j2, d);
        canvas.drawLine(j1, l1, j1 - i2, l1, d);
        canvas.drawLine(j1, l1, j1, l1 - j2, d);
        canvas.drawLine(i1, l1, i1 + i2, l1, d);
        canvas.drawLine(i1, l1, i1, l1 - j2, d);
    }

    public void a(Matrix matrix, Rect rect, RectF rectf, boolean flag, boolean flag1, boolean flag2, int i1)
    {
        boolean flag4 = true;
        if (flag)
        {
            flag1 = true;
        }
        j = new Matrix(matrix);
        i = rectf;
        a = new RectF(rect);
        boolean flag3 = flag4;
        if (!flag1)
        {
            if (flag2)
            {
                flag3 = flag4;
            } else
            {
                flag3 = false;
            }
        }
        e = flag3;
        k = flag;
        g = i1;
        b = i.width() / i.height();
        f = e();
        c.setARGB(125, 50, 50, 50);
        l.setARGB(125, 50, 50, 50);
        d.setStyle(android.graphics.Paint.Style.STROKE);
        d.setAntiAlias(false);
        m = m.None;
        a();
    }

    public void a(m m1)
    {
        if (m1 != m)
        {
            m = m1;
            n.invalidate();
        }
    }

    public void a(boolean flag)
    {
        h = flag;
    }

    public int b(float f1, float f2)
    {
        float f3;
        Rect rect;
        boolean flag2;
        boolean flag3;
        flag2 = false;
        flag3 = ImageViewTouchBase.e;
        rect = e();
        f3 = n.getResources().getDisplayMetrics().density * 20F;
        if (!k) goto _L2; else goto _L1
_L1:
        int i1;
label0:
        {
            float f4 = f1 - (float)rect.centerX();
            float f5 = f2 - (float)rect.centerY();
            int j1 = (int)Math.sqrt(f4 * f4 + f5 * f5);
            int k1 = f.width() / 2;
            if ((float)Math.abs(j1 - k1) <= f3)
            {
                if (Math.abs(f5) > Math.abs(f4))
                {
                    if (f5 < 0.0F)
                    {
                        i1 = 8;
                        if (!flag3)
                        {
                            break label0;
                        }
                    }
                    i1 = 16;
                    if (!flag3)
                    {
                        break label0;
                    }
                }
                if (f4 < 0.0F)
                {
                    i1 = 2;
                    if (!flag3)
                    {
                        break label0;
                    }
                }
                i1 = 4;
                if (!flag3)
                {
                    break label0;
                }
            }
            boolean flag;
            boolean flag1;
            if (j1 >= k1 || flag3)
            {
                i1 = 1;
            } else
            {
                i1 = 32;
            }
        }
        j1 = i1;
        if (!flag3) goto _L4; else goto _L3
_L3:
        if (f2 >= (float)rect.top - f3 && f2 < (float)rect.bottom + f3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = flag2;
        if (f1 >= (float)rect.left - f3)
        {
            flag = flag2;
            if (f1 < (float)rect.right + f3)
            {
                flag = true;
            }
        }
        j1 = i1;
        if (Math.abs((float)rect.left - f1) < f3)
        {
            j1 = i1;
            if (flag1)
            {
                j1 = i1 | 2;
            }
        }
        i1 = j1;
        if (Math.abs((float)rect.right - f1) < f3)
        {
            i1 = j1;
            if (flag1)
            {
                i1 = j1 | 4;
            }
        }
        j1 = i1;
        if (Math.abs((float)rect.top - f2) < f3)
        {
            j1 = i1;
            if (flag)
            {
                j1 = i1 | 8;
            }
        }
        i1 = j1;
        if (Math.abs((float)rect.bottom - f2) < f3)
        {
            i1 = j1;
            if (flag)
            {
                i1 = j1 | 0x10;
            }
        }
        j1 = i1;
        if (i1 == 1)
        {
            j1 = i1;
            if (rect.contains((int)f1, (int)f2))
            {
                j1 = 32;
            }
        }
_L4:
        return j1;
_L2:
        i1 = 1;
        if (true) goto _L3; else goto _L5
_L5:
    }

    void b(int i1, float f1, float f2)
    {
        Object obj;
        boolean flag;
        flag = ImageViewTouchBase.e;
        obj = e();
        if (i1 != 1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (i1 != 32)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new RectF(((Rect) (obj)));
        ((RectF) (obj)).offset(f1, f2);
        Matrix matrix = new Matrix();
        if (j.invert(matrix))
        {
            matrix.mapRect(((RectF) (obj)));
        }
        a(((RectF) (obj)).left - i.left, ((RectF) (obj)).top - i.top);
        if (!flag) goto _L1; else goto _L3
_L3:
        float af[];
        af = new float[2];
        af[0] = f1;
        af[1] = f2;
        obj = new Matrix();
        if (j.invert(((Matrix) (obj))))
        {
            ((Matrix) (obj)).mapVectors(af);
        }
        f1 = af[0];
        f2 = af[1];
        if ((i1 & 8) == 0)
        {
            break MISSING_BLOCK_LABEL_833;
        }
        af = new float[2];
        af;
        af[0] = 0.0F;
        af[1] = 1.0F;
        ((Matrix) (obj)).mapVectors(af);
        if (af[0] <= 0.0F || af[1] != 0.0F) goto _L5; else goto _L4
_L4:
        int j1;
        int l1;
        j1 = 3;
        l1 = j1;
        if (!flag) goto _L7; else goto _L6
_L6:
        l1 = j1;
_L15:
        j1 = l1;
        if (af[0] != 0.0F) goto _L9; else goto _L8
_L8:
        j1 = l1;
        if (af[1] >= 0.0F) goto _L9; else goto _L10
_L10:
        j1 = l1 | 0x10;
        l1 = j1;
        if (!flag) goto _L7; else goto _L9
_L9:
        l1 = j1;
        if (af[0] >= 0.0F) goto _L12; else goto _L11
_L11:
        l1 = j1;
        if (af[1] != 0.0F) goto _L12; else goto _L13
_L13:
        j1 |= 4;
        l1 = j1;
        if (!flag) goto _L7; else goto _L14
_L14:
        l1 = j1;
_L12:
        l1 |= 8;
_L7:
        int k1;
label0:
        {
            k1 = l1;
            if ((i1 & 0x10) == 0)
            {
                break label0;
            }
            float af1[] = new float[2];
            af1;
            af1[0] = 0.0F;
            af1[1] = -1F;
            ((Matrix) (obj)).mapVectors(af1);
            k1 = l1;
            if (af1[0] > 0.0F)
            {
                k1 = l1;
                if (af1[1] == 0.0F)
                {
                    l1 |= 2;
                    k1 = l1;
                    if (!flag)
                    {
                        break label0;
                    }
                    k1 = l1;
                }
            }
            l1 = k1;
            if (af1[0] == 0.0F)
            {
                l1 = k1;
                if (af1[1] > 0.0F)
                {
                    l1 = k1 | 8;
                    k1 = l1;
                    if (!flag)
                    {
                        break label0;
                    }
                }
            }
            k1 = l1;
            if (af1[0] < 0.0F)
            {
                k1 = l1;
                if (af1[1] == 0.0F)
                {
                    l1 |= 4;
                    k1 = l1;
                    if (!flag)
                    {
                        break label0;
                    }
                    k1 = l1;
                }
            }
            k1 |= 0x10;
        }
label1:
        {
            l1 = k1;
            if ((i1 & 4) == 0)
            {
                break label1;
            }
            float af2[] = new float[2];
            af2;
            af2[0] = 1.0F;
            af2[1] = 0.0F;
            ((Matrix) (obj)).mapVectors(af2);
            l1 = k1;
            if (af2[0] == 0.0F)
            {
                l1 = k1;
                if (af2[1] < 0.0F)
                {
                    k1 |= 8;
                    l1 = k1;
                    if (!flag)
                    {
                        break label1;
                    }
                    l1 = k1;
                }
            }
            k1 = l1;
            if (af2[0] < 0.0F)
            {
                k1 = l1;
                if (af2[1] == 0.0F)
                {
                    k1 = l1 | 2;
                    l1 = k1;
                    if (!flag)
                    {
                        break label1;
                    }
                }
            }
            l1 = k1;
            if (af2[0] == 0.0F)
            {
                l1 = k1;
                if (af2[1] > 0.0F)
                {
                    k1 |= 0x10;
                    l1 = k1;
                    if (!flag)
                    {
                        break label1;
                    }
                    l1 = k1;
                }
            }
            l1 |= 4;
        }
label2:
        {
            k1 = l1;
            if ((i1 & 2) == 0)
            {
                break label2;
            }
            float af3[] = new float[2];
            af3;
            af3[0] = -1F;
            af3[1] = 0.0F;
            ((Matrix) (obj)).mapVectors(af3);
            i1 = l1;
            if (af3[0] == 0.0F)
            {
                i1 = l1;
                if (af3[1] < 0.0F)
                {
                    i1 = l1 | 8;
                    k1 = i1;
                    if (!flag)
                    {
                        break label2;
                    }
                }
            }
            k1 = i1;
            if (af3[0] > 0.0F)
            {
                k1 = i1;
                if (af3[1] == 0.0F)
                {
                    i1 |= 4;
                    k1 = i1;
                    if (!flag)
                    {
                        break label2;
                    }
                    k1 = i1;
                }
            }
            i1 = k1;
            if (af3[0] == 0.0F)
            {
                i1 = k1;
                if (af3[1] > 0.0F)
                {
                    i1 = k1 | 0x10;
                    k1 = i1;
                    if (!flag)
                    {
                        break label2;
                    }
                }
            }
            k1 = i1 | 2;
        }
        a(k1, f1, f2);
        return;
_L5:
        l1 = 1;
          goto _L15
        l1 = 1;
          goto _L7
    }

    public boolean b()
    {
        return h;
    }

    public Rect c()
    {
        return new Rect((int)i.left, (int)i.top, (int)i.right, (int)i.bottom);
    }

    public void d()
    {
        f = e();
    }
}
