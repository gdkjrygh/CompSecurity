// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            _f, App, lq, sn, 
//            a35, ab0

public class PhotoView extends View
    implements android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, android.view.ScaleGestureDetector.OnScaleGestureListener
{

    private static int A;
    public static Bitmap E;
    private static Paint H;
    private static boolean P;
    private static Paint f;
    private boolean B;
    private _f C;
    private int D;
    private float F;
    private a35 G;
    private ScaleGestureDetector I;
    private sn J;
    private float K;
    private RectF L;
    private Rect M;
    private float N;
    private ab0 O;
    private BitmapDrawable a;
    private float b;
    private boolean c;
    private int d;
    private RectF e;
    private lq g;
    private boolean h;
    private GestureDetectorCompat i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private float n;
    private boolean o;
    private boolean p;
    private Matrix q;
    private float r;
    private RectF s;
    private android.view.View.OnClickListener t;
    private int u;
    private float v[];
    private Matrix w;
    private Matrix x;
    private int y;
    private int z;

    public PhotoView(Context context)
    {
        super(context);
        x = new Matrix();
        w = new Matrix();
        d = -1;
        M = new Rect();
        o = true;
        C = _f.FIT_CENTER;
        e = new RectF();
        s = new RectF();
        L = new RectF();
        v = new float[9];
        e();
    }

    public PhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        x = new Matrix();
        w = new Matrix();
        d = -1;
        M = new Rect();
        o = true;
        C = _f.FIT_CENTER;
        e = new RectF();
        s = new RectF();
        L = new RectF();
        v = new float[9];
        e();
    }

    public PhotoView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        x = new Matrix();
        w = new Matrix();
        d = -1;
        M = new Rect();
        o = true;
        C = _f.FIT_CENTER;
        e = new RectF();
        s = new RectF();
        L = new RectF();
        v = new float[9];
        e();
    }

    static float a(PhotoView photoview)
    {
        return photoview.r;
    }

    static float a(PhotoView photoview, float f1)
    {
        photoview.r = f1;
        return f1;
    }

    private void a(float f1, float f2, float f3, boolean flag)
    {
        f1 = Math.min(Math.max(f1, N), n);
        float f4 = f1 / g();
        x.postRotate(-r, getWidth() / 2, getHeight() / 2);
        x.postScale(f4, f4, f2, f3);
        F = f1;
        x.postRotate(r, getWidth() / 2, getHeight() / 2);
        a(flag);
        invalidate();
    }

    static void a(PhotoView photoview, float f1, float f2, float f3, boolean flag)
    {
        photoview.a(f1, f2, f3, flag);
    }

    static void a(PhotoView photoview, boolean flag)
    {
        photoview.c(flag);
    }

    private void a(boolean flag)
    {
        float f1;
        float f2;
        float f7;
        float f8;
        float f5 = 0.0F;
        int i1 = App.am;
        L.set(e);
        x.mapRect(L);
        float f3;
        float f6;
        if (c)
        {
            f1 = M.left;
        } else
        {
            f1 = 0.0F;
        }
        if (c)
        {
            f2 = M.right;
        } else
        {
            f2 = getWidth();
        }
        f6 = L.left;
        f3 = L.right;
        if (f3 - f6 >= f2 - f1) goto _L2; else goto _L1
_L1:
        f7 = (f2 - f1 - (f3 + f6)) / 2.0F;
        if (i1 == 0) goto _L3; else goto _L2
_L2:
label0:
        {
            if (f6 > f1)
            {
                f1 -= f6;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (f3 < f2)
            {
                f1 = f2 - f3;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            f1 = 0.0F;
        }
_L9:
        float f4;
        if (c)
        {
            f2 = M.top;
        } else
        {
            f2 = 0.0F;
        }
        if (c)
        {
            f4 = M.bottom;
        } else
        {
            f4 = getHeight();
        }
        f7 = L.top;
        f6 = L.bottom;
        if (f6 - f7 >= f4 - f2) goto _L5; else goto _L4
_L4:
        f8 = (f4 - f2 - (f6 + f7)) / 2.0F;
        if (i1 == 0) goto _L6; else goto _L5
_L5:
label1:
        {
            if (f7 > f2)
            {
                f2 -= f7;
                if (i1 == 0)
                {
                    break label1;
                }
            }
            f2 = f5;
            if (f6 < f4)
            {
                f2 = f4 - f6;
                if (i1 != 0)
                {
                    f2 = f5;
                }
            }
        }
_L7:
label2:
        {
            if ((Math.abs(f1) > 20F || Math.abs(f2) > 20F) && !flag)
            {
                g.a(f1, f2);
                if (i1 == 0)
                {
                    break label2;
                }
            }
            x.postTranslate(f1, f2);
            invalidate();
        }
        return;
_L6:
        f2 = f8 + f2;
        if (true) goto _L7; else goto _L3
_L3:
        f1 = f7 + f1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private boolean a(float f1, float f2)
    {
        float f3;
        float f4;
        float f6 = 0.0F;
        int i1 = App.am;
        L.set(e);
        x.mapRect(L);
        float f5;
        float f8;
        float f9;
        if (c)
        {
            f4 = M.left;
        } else
        {
            f4 = 0.0F;
        }
        if (c)
        {
            f5 = M.right;
        } else
        {
            f5 = getWidth();
        }
        f8 = L.left;
        f9 = L.right;
        if (!c) goto _L2; else goto _L1
_L1:
        f3 = Math.max(f4 - L.right, Math.min(f5 - L.left, f1));
        if (i1 == 0) goto _L3; else goto _L2
_L2:
        if (f9 - f8 >= f5 - f4) goto _L5; else goto _L4
_L4:
        f3 = (f5 - f4 - (f9 + f8)) / 2.0F + f4;
        if (i1 == 0) goto _L3; else goto _L5
_L5:
        f4 = Math.max(f5 - f9, Math.min(f4 - f8, f1));
_L7:
label0:
        {
            f5 = f6;
            if (c)
            {
                f5 = M.top;
            }
            float f7;
            if (c)
            {
                f7 = M.bottom;
            } else
            {
                f7 = getHeight();
            }
            f8 = L.top;
            f9 = L.bottom;
            if (c)
            {
                f3 = Math.max(f5 - L.bottom, Math.min(f7 - L.top, f2));
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (f9 - f8 < f7 - f5)
            {
                f3 = (f7 - f5 - (f9 + f8)) / 2.0F + f5;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            f3 = Math.max(f7 - f9, Math.min(f5 - f8, f2));
        }
        x.postTranslate(f4, f3);
        invalidate();
        return f4 == f1 && f3 == f2;
_L3:
        f4 = f3;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static boolean a(PhotoView photoview, float f1, float f2)
    {
        return photoview.a(f1, f2);
    }

    static void b(PhotoView photoview, boolean flag)
    {
        photoview.a(flag);
    }

    private void c(boolean flag)
    {
        if (a != null && h) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1 = a.getIntrinsicWidth();
        int k1 = a.getIntrinsicHeight();
        a.setBounds(0, 0, i1, k1);
        int j1;
        int l1;
        if (Math.abs(r % 180F) == 90F)
        {
            j1 = k1;
        } else
        {
            j1 = i1;
            i1 = k1;
        }
        k1 = getWidth();
        l1 = getHeight();
        if ((j1 < 0 || k1 == j1) && (i1 < 0 || l1 == i1))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (flag || N == 0.0F && a != null && h)
        {
            f();
        }
        if (i1 == 0 && !x.isIdentity())
        {
            break; /* Loop/switch isn't completed */
        }
        q = null;
        if (App.am == 0) goto _L1; else goto _L3
_L3:
        q = x;
        return;
    }

    private void e()
    {
        Context context = getContext();
        if (!P)
        {
            P = true;
            H = new Paint();
            H.setAntiAlias(true);
            H.setStyle(android.graphics.Paint.Style.FILL);
            f = new Paint();
            f.setAntiAlias(true);
            f.setStyle(android.graphics.Paint.Style.STROKE);
        }
        i = new GestureDetectorCompat(context, this, null);
        I = new ScaleGestureDetector(context, this);
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            I.setQuickScaleEnabled(false);
        }
        J = new sn(this);
        G = new a35(this);
        g = new lq(this);
        O = new ab0(this);
    }

    private void f()
    {
        float f2;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        k1 = App.am;
        l1 = a.getIntrinsicWidth();
        i2 = a.getIntrinsicHeight();
        float f3;
        boolean flag;
        if (c)
        {
            j1 = A;
        } else
        {
            j1 = getWidth();
        }
        if (c)
        {
            i1 = A;
        } else
        {
            i1 = getHeight();
        }
        if ((l1 < 0 || j1 == l1) && (i2 < 0 || i1 == i2))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = 0.0F;
        if (!flag || c) goto _L2; else goto _L1
_L1:
        x.reset();
        N = 1.0F;
        F = 1.0F;
        if (k1 == 0) goto _L3; else goto _L2
_L2:
label0:
        {
            e.set(0.0F, 0.0F, l1, i2);
            if (c)
            {
                s.set(M);
                if (k1 == 0)
                {
                    break label0;
                }
            }
            s.set(0.0F, 0.0F, j1, i1);
        }
label1:
        {
            x.setTranslate(j1 / 2 - l1 / 2, i1 / 2 - i2 / 2);
            if (z != 0)
            {
                i1 = z;
            }
            float f1;
            if (Math.abs(r % 180F) == 90F)
            {
                f1 = Math.min((float)j1 / (float)i2, (float)i1 / (float)l1);
            } else
            {
                f1 = Math.min((float)j1 / (float)l1, (float)i1 / (float)i2);
            }
            N = f1;
            N = Math.min(N, 3F);
            if (C == _f.CENTER_CROP)
            {
                if (Math.abs(r % 180F) == 90F)
                {
                    f1 = Math.max((float)j1 / (float)i2, (float)i1 / (float)l1);
                } else
                {
                    f1 = Math.max((float)j1 / (float)l1, (float)i1 / (float)i2);
                }
                if (k1 == 0)
                {
                    break label1;
                }
            }
            if (C == _f.FIT_WIDTH)
            {
                if (Math.abs(r % 180F) == 90F)
                {
                    f1 = (float)j1 / (float)i2;
                } else
                {
                    f1 = (float)j1 / (float)l1;
                }
                if (k1 == 0)
                {
                    break label1;
                }
            }
            if (C == _f.FIT_HEIGHT)
            {
                if (Math.abs(r % 180F) == 90F)
                {
                    f1 = (float)i1 / (float)l1;
                } else
                {
                    f1 = (float)i1 / (float)i2;
                }
                if (k1 == 0)
                {
                    break label1;
                }
            }
            f1 = N;
        }
label2:
        {
            f2 = f1;
            if (Math.abs(r % 180F) == 90F)
            {
                f2 = (float)j1 / (float)i2;
                f3 = (float)i1 / (float)l1;
                if (Math.abs(f2 / f3 - 1.0F) < K)
                {
                    b = Math.max(f2, f3);
                    f1 = b;
                }
                f2 = f1;
                if (k1 == 0)
                {
                    break label2;
                }
                f2 = f1;
            }
            f1 = (float)j1 / (float)l1;
            f3 = (float)i1 / (float)i2;
            if (Math.abs(f1 / f3 - 1.0F) < K)
            {
                b = Math.max(f1, f3);
                f2 = b;
            }
        }
        if (F == 0.0F)
        {
            F = Math.min(f2, 3F);
        }
        if (!j || !p) goto _L5; else goto _L4
_L4:
        y = j1;
        u = i1;
        b = Math.min(b, 3F);
        x.preScale(F, F, l1 / 2, i2 / 2);
_L3:
        n = Math.max(N * 8F, 8F);
        x.postRotate(r, getWidth() / 2, getHeight() / 2);
        w.set(x);
        return;
_L5:
        if (p)
        {
            if (y == j1)
            {
                continue; /* Loop/switch isn't completed */
            }
            F = Math.min(f2, 3F);
            if (k1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        if (j)
        {
            if (u == i1)
            {
                continue; /* Loop/switch isn't completed */
            }
            F = Math.min(f2, 3F);
            if (k1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        F = Math.min(f2, 3F);
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void a()
    {
        a(-90F, true);
    }

    public void a(float f1, boolean flag)
    {
label0:
        {
            if (flag)
            {
                O.a(f1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            r = r + f1;
            x.postRotate(f1, getWidth() / 2, getHeight() / 2);
            invalidate();
        }
    }

    public void a(Bitmap bitmap)
    {
        boolean flag;
        if (a != null)
        {
            if (bitmap == a.getBitmap())
            {
                return;
            }
            if (bitmap != null && (a.getIntrinsicWidth() != bitmap.getWidth() || a.getIntrinsicHeight() != bitmap.getHeight()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            N = 0.0F;
            a = null;
        } else
        {
            flag = false;
        }
        if (a == null && bitmap != null)
        {
            a = new BitmapDrawable(getResources(), bitmap);
        }
        if (flag)
        {
            y = 0;
            u = 0;
        }
        c(flag);
        invalidate();
    }

    public void b()
    {
        x.set(w);
        x.getValues(v);
        F = v[0];
        invalidate();
    }

    public void b(boolean flag)
    {
        l = flag;
        if (!l)
        {
            b();
        }
    }

    public boolean b(float f1, float f2)
    {
        boolean flag1 = true;
        if (l) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (a35.a(G))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b != 0.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (g() == N)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (g() <= b)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void c()
    {
        a(90F, true);
    }

    public boolean c(float f1, float f2)
    {
        boolean flag1 = true;
        if (l) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (a35.a(G))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b != 0.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (g() == N)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (g() <= b)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void d()
    {
        i = null;
        I = null;
        a = null;
        if (J != null)
        {
            J.a();
        }
        J = null;
        if (G != null)
        {
            G.a();
        }
        G = null;
        if (g != null)
        {
            g.a();
        }
        g = null;
        if (O != null)
        {
            O.a();
        }
        O = null;
        setOnClickListener(null);
        t = null;
    }

    protected float g()
    {
        return F;
    }

    protected float h()
    {
        return N;
    }

    public boolean onDoubleTap(MotionEvent motionevent)
    {
label0:
        {
label1:
            {
                if (!o || !l)
                {
                    break label0;
                }
                if (m)
                {
                    break label1;
                }
                float f2 = g();
                float f1;
                if (f2 == N)
                {
                    f1 = 2.5F;
                } else
                {
                    f1 = N;
                }
                f1 = Math.max(N, f1);
                f1 = Math.min(n, f1);
                if (f1 == N)
                {
                    J.a(f2, f1, getWidth() / 2, getHeight() / 2);
                    if (App.am == 0)
                    {
                        break label1;
                    }
                }
                J.a(f2, f1, motionevent.getX(), motionevent.getY());
            }
            m = false;
        }
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onDown(MotionEvent motionevent)
    {
        if (l)
        {
            G.a();
            g.a();
        }
        return true;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (a != null)
        {
            int i1 = canvas.getSaveCount();
            canvas.save();
            if (q != null)
            {
                canvas.concat(q);
            }
            a.draw(canvas);
            canvas.restoreToCount(i1);
            if (B)
            {
                Bitmap bitmap = E;
                int j1 = (getWidth() - bitmap.getWidth()) / 2;
                int l1 = (getHeight() - bitmap.getHeight()) / 2;
                canvas.drawBitmap(bitmap, j1, l1, null);
            }
            L.set(a.getBounds());
            if (Math.abs(r % 180F) == 90F)
            {
                float f1 = L.right;
                L.right = L.bottom;
                L.bottom = f1;
            }
            if (q != null)
            {
                q.mapRect(L);
            }
            if (c)
            {
                int k1 = canvas.getSaveCount();
                canvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), H);
                canvas.save();
                canvas.clipRect(M);
                if (q != null)
                {
                    canvas.concat(q);
                }
                a.draw(canvas);
                canvas.restoreToCount(k1);
                canvas.drawRect(M, f);
            }
        }
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (l)
        {
            G.a(f1, f2);
        }
        return true;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        h = true;
        i1 = getWidth();
        j1 = getHeight();
        if (c)
        {
            D = Math.min(A, Math.min(i1, j1));
            i1 = (i1 - D) / 2;
            j1 = (j1 - D) / 2;
            k1 = D;
            l1 = D;
            M.set(i1, j1, k1 + i1, l1 + j1);
        }
        c(flag);
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    protected void onMeasure(int i1, int j1)
    {
label0:
        {
            if (d != -1)
            {
                super.onMeasure(i1, android.view.View.MeasureSpec.makeMeasureSpec(d, 0x80000000));
                setMeasuredDimension(getMeasuredWidth(), d);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            super.onMeasure(i1, j1);
        }
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        if (l)
        {
            k = false;
            a(g() * scalegesturedetector.getScaleFactor(), scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY(), false);
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        if (l)
        {
            J.a();
            k = true;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        if (l && k)
        {
            m = true;
            b();
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (l)
        {
            a(-f1, -f2);
        }
        return true;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        if (t != null && !k)
        {
            t.onClick(this);
        }
        k = false;
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (I != null && i != null)
        {
            I.onTouchEvent(motionevent);
            i.onTouchEvent(motionevent);
            switch (motionevent.getAction())
            {
            case 2: // '\002'
            default:
                return true;

            case 1: // '\001'
            case 3: // '\003'
                break;
            }
            if (!a35.a(G))
            {
                a(false);
                return true;
            }
        }
        return true;
    }

    public void setHeightForInitialScaleCalculation(int i1)
    {
        z = i1;
    }

    public void setInitialFitTolerance(float f1)
    {
        K = f1;
    }

    public void setIsVideo(boolean flag)
    {
        B = flag;
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        t = onclicklistener;
    }

    public void setRotation(float f1, boolean flag)
    {
        r = 0.0F;
        a(f1, flag);
    }
}
