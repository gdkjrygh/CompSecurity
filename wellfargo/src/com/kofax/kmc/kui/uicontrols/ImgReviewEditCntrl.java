// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.IpLibUtil;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;

public class ImgReviewEditCntrl extends View
    implements android.view.View.OnTouchListener
{

    private static final String b = "ImgReviewEditCntrl";
    private static final float e = 25F;
    private Point A;
    private Point B;
    private Point C;
    private Point D;
    private boolean E;
    private float F;
    private float G;
    private Bitmap H;
    private Point I;
    private Point J;
    private Rect K;
    private int L;
    private int M;
    private Point N;
    private Point O;
    private boolean P;
    private int Q;
    private int R;
    private Line_Style_Solid S;
    private BoundingTetragon T;
    private Image U;
    private boolean V;
    private int W;
    private float Z;
    boolean a;
    private boolean aa;
    private boolean ab;
    private Bitmap c;
    private int d;
    private int f;
    private Point g;
    private Point h;
    private Point i;
    private Point j;
    private int k;
    private int l;
    private int m;
    private String n;
    private Paint o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    public ScaleGestureDetector scaleGestureDetector;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    public ImgReviewEditCntrl(Context context)
    {
        super(context);
        c = null;
        d = 0;
        g = new Point();
        h = new Point();
        k = 35;
        l = 0;
        n = null;
        p = false;
        a = false;
        q = false;
        r = true;
        s = -1;
        F = 0.0F;
        G = 1.0F;
        I = new Point();
        J = new Point();
        N = new Point(0, 0);
        P = false;
        Q = 1234;
        R = 1234;
        V = false;
        aa = false;
        ab = false;
        a(context);
    }

    public ImgReviewEditCntrl(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = null;
        d = 0;
        g = new Point();
        h = new Point();
        k = 35;
        l = 0;
        n = null;
        p = false;
        a = false;
        q = false;
        r = true;
        s = -1;
        F = 0.0F;
        G = 1.0F;
        I = new Point();
        J = new Point();
        N = new Point(0, 0);
        P = false;
        Q = 1234;
        R = 1234;
        V = false;
        aa = false;
        ab = false;
        a(context);
    }

    public ImgReviewEditCntrl(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = null;
        d = 0;
        g = new Point();
        h = new Point();
        k = 35;
        l = 0;
        n = null;
        p = false;
        a = false;
        q = false;
        r = true;
        s = -1;
        F = 0.0F;
        G = 1.0F;
        I = new Point();
        J = new Point();
        N = new Point(0, 0);
        P = false;
        Q = 1234;
        R = 1234;
        V = false;
        aa = false;
        ab = false;
        a(context);
    }

    static float a(ImgReviewEditCntrl imgrevieweditcntrl)
    {
        return imgrevieweditcntrl.G;
    }

    static float a(ImgReviewEditCntrl imgrevieweditcntrl, float f1)
    {
        imgrevieweditcntrl.G = f1;
        return f1;
    }

    private int a(int i1, int j1)
    {
        Point point = b(new Point(i1, j1));
        Point point1 = D;
        Point point2 = C;
        if (a(point, false, point1, point2))
        {
            g.x = point1.x;
            g.y = point1.y;
            h.x = point2.x;
            h.y = point2.y;
            a = false;
            return 1;
        }
        point1 = C;
        point2 = A;
        if (a(point, true, point1, point2))
        {
            g.x = point1.x;
            g.y = point1.y;
            h.x = point2.x;
            h.y = point2.y;
            a = false;
            return 3;
        }
        point1 = D;
        point2 = B;
        if (a(point, true, point1, point2))
        {
            g.x = point1.x;
            g.y = point1.y;
            h.x = point2.x;
            h.y = point2.y;
            a = false;
            return 2;
        }
        point1 = B;
        point2 = A;
        if (a(point, false, point1, point2))
        {
            g.x = point1.x;
            g.y = point1.y;
            h.x = point2.x;
            h.y = point2.y;
            a = false;
            return 4;
        } else
        {
            a = true;
            return 0;
        }
    }

    static int a(ImgReviewEditCntrl imgrevieweditcntrl, int i1)
    {
        imgrevieweditcntrl.l = i1;
        return i1;
    }

    private Bitmap a(Image image)
    {
        P = true;
        image = U.getImageBitmap();
        int i1 = image.getWidth();
        int j1 = image.getHeight();
        Bitmap bitmap = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        int ai[] = new int[i1 * j1];
        image.getPixels(ai, 0, i1, 0, 0, i1, j1);
        bitmap.setPixels(ai, 0, i1, 0, 0, i1, j1);
        return bitmap;
    }

    private Point a(Point point)
    {
        Point point1 = new Point();
        if (F != 0.0F)
        {
            point1.x = (int)((float)point.x * F * ((float)M / t) + x + (float)K.left + (float)J.x);
            point1.y = (int)((float)point.y * F * ((float)L / u) + y + (float)K.top + (float)J.y);
            return point1;
        } else
        {
            point1.x = (int)((float)point.x * ((float)M / t) + x + (float)K.left + (float)J.x);
            point1.y = (int)((float)point.y * ((float)L / u) + y + (float)K.top + (float)J.y);
            return point1;
        }
    }

    static Point a(ImgReviewEditCntrl imgrevieweditcntrl, Point point)
    {
        imgrevieweditcntrl.O = point;
        return point;
    }

    private Rect a(float f1, float f2, float f3, float f4)
    {
        Rect rect = new Rect();
        if (f2 > t)
        {
            float f5 = (int)((f4 / f2) * f1);
            if (f5 > f3)
            {
                f2 = (int)((f2 / f1) * f3);
                f1 = f3;
            } else
            {
                f2 = f4;
                f1 = f5;
            }
        } else
        {
            f5 = (int)((f2 / f1) * f3);
            if (f5 > f4)
            {
                f1 = (int)((f4 / f2) * f1);
                f2 = f4;
            } else
            {
                f2 = f5;
                f1 = f3;
            }
        }
        rect.left = (int)((f3 - f1) / 2.0F);
        rect.right = (int)(f1 + (float)rect.left);
        rect.top = (int)(f4 - f2) / 2;
        rect.bottom = (int)((float)rect.top + f2);
        return rect;
    }

    private void a()
    {
        u = H.getHeight();
        t = H.getWidth();
        Log.i("ImgReviewEditCntrl", (new StringBuilder()).append("image Wd&ht = ").append(t).append(" ").append(u).toString());
        float f1;
        float f2;
        Point point;
        if (W > 0)
        {
            f1 = getHeight();
            f2 = getWidth();
        } else
        {
            f1 = getHeight();
            f2 = getWidth();
        }
        Log.i("InitImage", (new StringBuilder()).append("displayHt ").append(f1).append("  displayWd = ").append(f2).toString());
        point = a(new Point((int)f2, (int)f1), new Point((int)t, (int)u));
        v = point.x;
        w = point.y;
        x = (f2 - (float)point.x) / 2.0F;
        y = (f1 - (float)point.y) / 2.0F;
        z = t / v;
        K = a(t, u, v, w);
        M = K.right - K.left;
        L = K.bottom - K.top;
        l = 0;
        J.x = 0;
        J.y = 0;
        F = 1.0F;
        G = 1.0F;
        q = false;
    }

    private void a(int i1, Point point)
    {
        float f1;
        float f2;
        point = b(point);
        Point point1 = b(j);
        f1 = point.x - point1.x;
        f2 = point.y - point1.y;
        i1;
        JVM INSTR tableswitch 1 4: default 72
    //                   1 73
    //                   2 190
    //                   3 334
    //                   4 451;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        if ((float)g.y + f2 < (float)B.y && (float)g.y + f2 < (float)A.y && (float)g.y + f2 >= 0.0F && (float)h.y + f2 >= 0.0F)
        {
            D.y = (int)((float)g.y + f2);
            C.y = (int)(f2 + (float)h.y);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if ((float)g.x + f1 < (float)A.x && (float)h.x + f1 < (float)C.x && (float)g.x + f1 >= 0.0F && (float)h.x + f1 >= 0.0F)
        {
            D.x = (int)((float)g.x + f1);
            Log.i("Zoom", (new StringBuilder()).append("[pointmove]pointImage.x = ").append(D.x).toString());
            B.x = (int)((float)h.x + f1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if ((float)g.x + f1 > (float)D.x && (float)h.x + f1 > (float)B.x && (float)g.x + f1 <= t && (float)h.x + f1 <= t)
        {
            C.x = (int)((float)g.x + f1);
            A.x = (int)((float)h.x + f1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (g.y + (int)f2 > D.y && h.y + (int)f2 > C.y && (float)(g.y + (int)f2) <= u && (float)(h.y + (int)f2) < u)
        {
            B.y = (int)((float)g.y + f2);
            A.y = (int)(f2 + (float)h.y);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    private void a(Context context)
    {
        setOnTouchListener(this);
        scaleGestureDetector = new ScaleGestureDetector(context, new MyScaleGestureListener());
        c = null;
        o = new Paint();
        D = new Point();
        C = new Point();
        B = new Point();
        A = new Point();
        J.x = 0;
        J.y = 0;
    }

    private void a(Canvas canvas)
    {
        if (Q == 1234)
        {
            Q = 0xff0000ff;
        }
        if (R == 1234)
        {
            R = 0xff0000ff;
        }
        Point point;
        Point point1;
        Point point2;
        Point point3;
        Path path;
        if (S != null)
        {
            if (S.equals(Line_Style_Solid.LINE_STYLE_DOTTED))
            {
                o.setPathEffect(new DashPathEffect(new float[] {
                    10F, 10F
                }, 10F));
            } else
            {
                o.setPathEffect(new DashPathEffect(new float[] {
                    0.0F, 0.0F
                }, 0.0F));
            }
        }
        o.setStrokeWidth(5F);
        o.setColor(Q);
        o.setStyle(android.graphics.Paint.Style.STROKE);
        o.setAntiAlias(true);
        point = a(D);
        point1 = a(C);
        point2 = a(B);
        point3 = a(A);
        path = new Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point1.x, point1.y);
        path.moveTo(point1.x, point1.y);
        path.lineTo(point3.x, point3.y);
        path.moveTo(point3.x, point3.y);
        path.lineTo(point2.x, point2.y);
        path.moveTo(point2.x, point2.y);
        path.lineTo(point.x, point.y);
        path.close();
        canvas.drawPath(path, o);
        o.setStyle(android.graphics.Paint.Style.FILL);
        o.setColor(R);
        canvas.drawCircle(point.x, point.y, 25F, o);
        canvas.drawCircle(point1.x, point1.y, 25F, o);
        canvas.drawCircle(point2.x, point2.y, 25F, o);
        canvas.drawCircle(point3.x, point3.y, 25F, o);
    }

    private boolean a(Point point, Point point1, Point point2, int i1)
    {
label0:
        {
            double d1 = (Math.atan2(point1.y - point.y, point1.x - point.x) * 180D) / 3.1415926535897931D;
            d1 = Math.abs((Math.atan2(point1.y - point2.y, point1.x - point2.x) * 180D) / 3.1415926535897931D) + Math.abs(d1);
            boolean flag;
            if (d1 > 175D || d1 < 2D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (i1 == 2 || i1 == 4)
            {
                if (d1 >= 175D)
                {
                    break label0;
                }
                flag = true;
            }
            return flag;
        }
        return false;
    }

    private boolean a(Point point, boolean flag, Point point1, Point point2)
    {
        float f1;
        float f2;
        float f4;
        f2 = 25F * z;
        f1 = (float)k * z;
        f4 = point2.x - point1.x;
        if (f4 != 0.0F) goto _L2; else goto _L1
_L1:
        if ((float)point.x < (float)point2.x - f2 || (float)point.x > f2 + (float)point2.x) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        float f3 = (float)(point2.y - point1.y) / f4;
        f4 = (float)point1.y - (float)point1.x * f3;
        if (flag)
        {
            f3 = ((float)point.y - f4) / f3;
            if ((float)point.x < f3 - f1 || (float)point.x > f3 + f1 || (float)point.y < (float)point1.y + f1 || (float)point.y > (float)point2.y - f1)
            {
                return false;
            }
        } else
        {
            f3 = f3 * (float)point.x + f4;
            if ((float)point.y >= f3 - f1 && (float)point.y <= f3 + f1)
            {
                Log.i("ImgReviewEditCntrl", "isonline true: horizontal");
                return true;
            } else
            {
                return false;
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    static boolean a(ImgReviewEditCntrl imgrevieweditcntrl, boolean flag)
    {
        imgrevieweditcntrl.r = flag;
        return flag;
    }

    static float b(ImgReviewEditCntrl imgrevieweditcntrl, float f1)
    {
        imgrevieweditcntrl.F = f1;
        return f1;
    }

    static int b(ImgReviewEditCntrl imgrevieweditcntrl)
    {
        return imgrevieweditcntrl.s;
    }

    static int b(ImgReviewEditCntrl imgrevieweditcntrl, int i1)
    {
        imgrevieweditcntrl.s = i1;
        return i1;
    }

    private Point b(Point point)
    {
        Point point1 = new Point();
        if (F != 0.0F)
        {
            point1.x = (int)(((float)point.x - x - (float)K.left - (float)J.x) / (F * ((float)M / t)));
            point1.y = (int)(((float)point.y - y - (float)K.top - (float)J.y) / (F * ((float)L / u)));
            return point1;
        } else
        {
            point1.x = (int)(((float)point.x - x - (float)K.left - (float)J.x) / ((float)M / t));
            point1.y = (int)(((float)point.y - y - (float)K.top - (float)J.y) / ((float)L / u));
            return point1;
        }
    }

    static Point b(ImgReviewEditCntrl imgrevieweditcntrl, Point point)
    {
        return imgrevieweditcntrl.b(point);
    }

    private void b()
    {
        l = 0;
        Log.i("PanOffset", (new StringBuilder()).append("panoffset = ").append(J.x).append(" ").append(J.y).toString());
        Point point = a(new Point(0, 0));
        if (point.x > getWidth() / 2)
        {
            float f1 = (point.x - getWidth() / 2) + 1;
            Point point1 = J;
            point1.x = (int)((float)point1.x - f1);
        }
        if (point.y > getHeight() / 2)
        {
            float f2 = (point.y - getHeight() / 2) + 1;
            point = J;
            point.y = (int)((float)point.y - f2);
        }
        point = a(new Point((int)t, (int)u));
        if (point.x < getWidth() / 2)
        {
            float f3 = point.x - getWidth() / 2 - 1;
            Point point2 = J;
            point2.x = (int)((float)point2.x - f3);
        }
        if (point.y < getHeight() / 2)
        {
            float f4 = point.y - getHeight() / 2 - 1;
            point = J;
            point.y = (int)((float)point.y - f4);
        }
        N.x = J.x;
        N.y = J.y;
        if ((double)F == 1.0D)
        {
            J.x = 0;
            J.y = 0;
            N.x = 0;
            N.y = 0;
        }
        invalidate();
    }

    private boolean b(Point point, Point point1)
    {
        float f1 = (float)k * z;
        if ((float)point.x >= (float)point1.x - f1 && (float)point.x <= (float)point1.x + f1 && (float)point.y >= (float)point1.y - f1 && (float)point.y <= f1 + (float)point1.y)
        {
            a = false;
            return true;
        }
        if (F > 1.0F)
        {
            a = true;
        }
        return false;
    }

    static boolean b(ImgReviewEditCntrl imgrevieweditcntrl, boolean flag)
    {
        imgrevieweditcntrl.q = flag;
        return flag;
    }

    static int c(ImgReviewEditCntrl imgrevieweditcntrl)
    {
        return imgrevieweditcntrl.d;
    }

    static Point c(ImgReviewEditCntrl imgrevieweditcntrl, Point point)
    {
        return imgrevieweditcntrl.a(point);
    }

    private void c()
    {
        if (!IpLibUtil.isIpLicensed())
        {
            ab = false;
            throw new KmcRuntimeException(ErrorInfo.KMC_EV_LICENSING);
        } else
        {
            ab = true;
            return;
        }
    }

    static boolean d(ImgReviewEditCntrl imgrevieweditcntrl)
    {
        return imgrevieweditcntrl.r;
    }

    static Point e(ImgReviewEditCntrl imgrevieweditcntrl)
    {
        return imgrevieweditcntrl.J;
    }

    static int f(ImgReviewEditCntrl imgrevieweditcntrl)
    {
        return imgrevieweditcntrl.l;
    }

    static Point g(ImgReviewEditCntrl imgrevieweditcntrl)
    {
        return imgrevieweditcntrl.O;
    }

    Point a(Point point, Point point1)
    {
        Point point2 = new Point();
        if (point1.y > point1.x)
        {
            point2.y = point.y;
            point2.x = (int)(((float)point.y / (float)point1.y) * (float)point1.x);
            if (point2.x > point.x)
            {
                point2.x = point.x;
                point2.y = (int)(((float)point1.y / (float)point1.x) * (float)point.x);
            }
        } else
        {
            point2.x = point.x;
            point2.y = (int)(((float)point1.y / (float)point1.x) * (float)point.x);
            if (point2.y > point.y)
            {
                point2.y = point.y;
                point2.x = (int)(((float)point.y / (float)point1.y) * (float)point1.x);
                return point2;
            }
        }
        return point2;
    }

    public void clearImage()
    {
        if (H == null)
        {
            throw new NullPointerException("The bitmap is null");
        } else
        {
            H.recycle();
            invalidate();
            return;
        }
    }

    public int getCropCornerColor()
    {
        if (R == -1)
        {
            return 0xff0000ff;
        } else
        {
            return R;
        }
    }

    public int getCropLineColor()
    {
        if (Q == 1234)
        {
            return 0xff0000ff;
        } else
        {
            return Q;
        }
    }

    public BoundingTetragon getCropTetragon()
    {
        if (T == null)
        {
            T = new BoundingTetragon();
        }
        try
        {
            float f1 = (float)D.x / Z;
            float f2 = (float)D.y / Z;
            T.setTopLeft(new Point((int)f1, (int)f2));
            f1 = (float)C.x / Z;
            f2 = (float)C.y / Z;
            T.setTopRight(new Point((int)f1, (int)f2));
            f1 = (float)B.x / Z;
            f2 = (float)B.y / Z;
            T.setBottomLeft(new Point((int)f1, (int)f2));
            f1 = (float)A.x / Z;
            f2 = (float)A.y / Z;
            T.setBottomRight(new Point((int)f1, (int)f2));
        }
        catch (NullPointerException nullpointerexception)
        {
            nullpointerexception.printStackTrace();
        }
        return T;
    }

    public Image getImage()
    {
        return U;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (!isInEditMode() && IpLibUtil.isIpLicensed())
        {
            canvas.getClipBounds(new Rect());
            int i1 = (int)((double)t * 0.074999999999999997D);
            if (!p && E && !V)
            {
                D.set(i1, i1);
                C.set((int)t - i1, i1);
                B.set(i1, (int)u - i1);
                A.set((int)t - i1, (int)u - i1);
            }
            if (H != null && !H.isRecycled())
            {
                canvas.save();
                canvas.scale(1.0F, 1.0F);
                Paint paint = new Paint(2);
                Object obj = a(new Point(0, 0));
                Rect rect = new Rect(0, 0, (int)t, (int)u);
                if (F == 0.0F)
                {
                    F = 1.0F;
                }
                Log.i("ImgReviewEditCntrl", (new StringBuilder()).append("origin = ").append(((Point) (obj)).x).append(" ").append(((Point) (obj)).y).toString());
                int j1 = ((Point) (obj)).x;
                int k1 = ((Point) (obj)).y;
                int l1 = (int)((float)M * F);
                int i2 = ((Point) (obj)).x;
                int j2 = (int)((float)L * F);
                obj = new Rect(j1, k1, l1 + i2, ((Point) (obj)).y + j2);
                canvas.drawBitmap(H, rect, ((Rect) (obj)), paint);
                canvas.restore();
                if (E)
                {
                    a(canvas);
                    return;
                }
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            if (H != null)
            {
                H.recycle();
                H = null;
            }
            H = (Bitmap)parcelable.getParcelable("bitmap");
            F = parcelable.getFloat("currentScale", F);
            Q = parcelable.getInt("linecolor");
            R = parcelable.getInt("cornercolor");
            E = parcelable.getBoolean("isVisibleRectangle");
            p = parcelable.getBoolean("isMoving");
            V = parcelable.getBoolean("isCropTetragonSetbyUser");
            D = new Point(parcelable.getIntArray("p1")[0], parcelable.getIntArray("p1")[1]);
            C = new Point(parcelable.getIntArray("p2")[0], parcelable.getIntArray("p2")[1]);
            B = new Point(parcelable.getIntArray("p3")[0], parcelable.getIntArray("p3")[1]);
            A = new Point(parcelable.getIntArray("p4")[0], parcelable.getIntArray("p4")[1]);
            q = false;
            a = false;
            l = 0;
            if (T != null)
            {
                T = new BoundingTetragon(new Point(parcelable.getIntArray("bt_topleft")[0], parcelable.getIntArray("bt_topleft")[1]), new Point(parcelable.getIntArray("bt_topRt")[0], parcelable.getIntArray("bt_topRt")[1]), new Point(parcelable.getIntArray("bt_bottomleft")[0], parcelable.getIntArray("bt_bottomleft")[1]), new Point(parcelable.getIntArray("bt_bottomrt")[0], parcelable.getIntArray("bt_bottomrt")[1]));
            }
            super.onRestoreInstanceState(parcelable.getParcelable("instanceState"));
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        if (H != null && !H.isRecycled())
        {
            bundle.putParcelable("bitmap", H);
        }
        bundle.putParcelable("displayrect", K);
        bundle.putFloat("currentScale", F);
        bundle.putInt("displayRectWidth", M);
        bundle.putInt("displayRectHt", L);
        bundle.putFloat("imgHt", u);
        bundle.putFloat("imgWd", t);
        bundle.putFloat("displayWidth", v);
        bundle.putFloat("displayHeight", w);
        bundle.putIntArray("p1", new int[] {
            D.x, D.y
        });
        bundle.putIntArray("p2", new int[] {
            C.x, C.y
        });
        bundle.putIntArray("p3", new int[] {
            B.x, B.y
        });
        bundle.putIntArray("p4", new int[] {
            A.x, A.y
        });
        bundle.putInt("linecolor", Q);
        bundle.putInt("cornercolor", R);
        if (T != null)
        {
            bundle.putIntArray("bt_bottomleft", new int[] {
                T.getBottomLeft().x, T.getBottomLeft().y
            });
            bundle.putIntArray("bt_bottomrt", new int[] {
                T.getBottomRight().x, T.getBottomRight().y
            });
            bundle.putIntArray("bt_topleft", new int[] {
                T.getTopLeft().x, T.getTopLeft().y
            });
            bundle.putIntArray("bt_topRt", new int[] {
                T.getTopRight().x, T.getTopRight().y
            });
        }
        bundle.putBoolean("isVisibleRectangle", E);
        bundle.putBoolean("isMoving", p);
        bundle.putBoolean("isCropTetragonSetbyUser", V);
        return bundle;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (H != null)
        {
            W = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            a();
            aa = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i1;
        int k1;
        int l1;
        if (H == null)
        {
            return false;
        }
        p = true;
        scaleGestureDetector.onTouchEvent(motionevent);
        i1 = motionevent.getAction();
        d = motionevent.getPointerCount();
        Log.i("ImgReviewEditCntrl", (new StringBuilder()).append("PINCH COUNT(start) = ").append(motionevent.getPointerCount()).toString());
        if (d > 1)
        {
            q = true;
            a = false;
        }
        k1 = (int)motionevent.getX();
        l1 = (int)motionevent.getY();
        i1;
        JVM INSTR tableswitch 0 2: default 128
    //                   0 134
    //                   1 1749
    //                   2 423;
           goto _L1 _L2 _L3 _L4
_L1:
        invalidate();
        return true;
_L2:
        if (getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        j = new Point(k1, l1);
        i = new Point(k1, l1);
        view = b(i);
        l = 0;
        if (b(view, D))
        {
            l = 1;
            m = 1;
        } else
        if (b(view, C))
        {
            l = 1;
            m = 2;
        } else
        if (b(view, B))
        {
            l = 1;
            m = 3;
        } else
        if (b(view, A))
        {
            l = 1;
            m = 4;
        } else
        {
            int j1 = a(k1, l1);
            f = j1;
            if (j1 != 0)
            {
                l = 2;
            }
            if (l == 0 && q && F > 1.0F)
            {
                l = 3;
                if (N.x == 0)
                {
                    N.x = 0;
                    N.y = 0;
                }
                I.x = i.x - N.x;
                I.y = i.y - N.y;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (q && !r)
        {
            return true;
        }
        new Point();
        i = new Point(k1, l1);
        view = b(new Point(i.x, i.y));
        if (l != 3 && !E)
        {
            return true;
        }
        if (l == 1)
        {
            switch (m)
            {
            case 1: // '\001'
                double d1 = z * 50F;
                double d5 = Math.sqrt((((Point) (view)).x - D.x) * (((Point) (view)).x - D.x) + (((Point) (view)).y - D.y) * (((Point) (view)).y - D.y));
                Log.i("ImgReviewEditCntrl", (new StringBuilder()).append("distance<threshold  ").append(d5).append(" ").append(d1).toString());
                if (d5 >= d1)
                {
                    motionevent = D;
                    D = view;
                    if (!a(B, view, C, m))
                    {
                        D = motionevent;
                    }
                    if ((float)D.x > t || (float)D.y > u || D.x < 0 || D.y < 0)
                    {
                        D = motionevent;
                    }
                    if (D.y > B.y)
                    {
                        D = motionevent;
                    }
                    if (D.x > C.x)
                    {
                        D = motionevent;
                    }
                }
                break;

            case 2: // '\002'
                double d2 = z * 50F;
                double d6 = Math.sqrt((((Point) (view)).x - C.x) * (((Point) (view)).x - C.x) + (((Point) (view)).y - C.y) * (((Point) (view)).y - C.y));
                Log.i("ImgReviewEditCntrl", (new StringBuilder()).append("distance<threshold  ").append(d6).append(" ").append(d2).toString());
                if (d6 >= d2)
                {
                    motionevent = C;
                    C = view;
                    if (!a(A, view, D, m))
                    {
                        C = motionevent;
                    }
                    if ((float)C.x > t || (float)C.y > u || C.x < 0 || C.y < 0)
                    {
                        C = motionevent;
                    }
                    if (C.y > A.y)
                    {
                        C = motionevent;
                    }
                    if (D.x > C.x)
                    {
                        C = motionevent;
                    }
                }
                break;

            case 3: // '\003'
                double d3 = z * 50F;
                double d7 = Math.sqrt((((Point) (view)).x - B.x) * (((Point) (view)).x - B.x) + (((Point) (view)).y - B.y) * (((Point) (view)).y - B.y));
                Log.i("ImgReviewEditCntrl", (new StringBuilder()).append("distance<threshold  ").append(d7).append(" ").append(d3).toString());
                if (d7 >= d3)
                {
                    motionevent = B;
                    B = view;
                    if (!a(D, view, A, m))
                    {
                        B = motionevent;
                    }
                    if ((float)B.x > t || (float)B.y > u || B.x < 0 || B.y < 0)
                    {
                        B = motionevent;
                    }
                    if (B.y < D.y)
                    {
                        B = motionevent;
                    }
                    if (A.x < B.x)
                    {
                        B = motionevent;
                    }
                }
                break;

            case 4: // '\004'
                double d4 = z * 50F;
                double d8 = Math.sqrt((((Point) (view)).x - A.x) * (((Point) (view)).x - A.x) + (((Point) (view)).y - A.y) * (((Point) (view)).y - A.y));
                Log.i("ImgReviewEditCntrl", (new StringBuilder()).append("distance<threshold  ").append(d8).append(" ").append(d4).toString());
                if (d8 >= d4)
                {
                    motionevent = A;
                    A = view;
                    if (!a(C, view, B, m))
                    {
                        A = motionevent;
                    }
                    if ((float)A.x > t || (float)A.y > u || A.x < 0 || A.y < 0)
                    {
                        A = motionevent;
                    }
                    if (A.y < C.y)
                    {
                        A = motionevent;
                    }
                    if (A.x < B.x)
                    {
                        A = motionevent;
                    }
                }
                break;
            }
        } else
        if (l == 2)
        {
            i = new Point(k1, l1);
            a(f, i);
        } else
        if (l == 3)
        {
            J.x = i.x - I.x;
            J.y = i.y - I.y;
            Log.i("PanOrigin", (new StringBuilder()).append("PanOffset ").append(J.x).append(" ").append(J.y).append(" ").append(i.x).append(" ").append(i.y).append(" PanOrn ").append(I.x).append(" ").append(I.y).toString());
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (q)
        {
            r = true;
            Log.i("State", (new StringBuilder()).append("firstPinchThisGesture ").append(r).toString());
            b();
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setCropCornerColor(int i1)
    {
        R = i1;
        invalidate();
    }

    public void setCropLineColor(int i1)
    {
        Q = i1;
        invalidate();
    }

    public void setCropLineStyle(Line_Style_Solid line_style_solid)
    {
        S = line_style_solid;
    }

    public void setCropTetragon(BoundingTetragon boundingtetragon)
    {
        T = boundingtetragon;
        Log.i("ImgReviewEditCntrl", (new StringBuilder()).append("setCropTetragon[scale value = ]").append(Z).toString());
        D.x = (int)((float)T.getTopLeft().x * Z);
        D.y = (int)((float)T.getTopLeft().y * Z);
        C.x = (int)((float)T.getTopRight().x * Z);
        C.y = (int)((float)T.getTopRight().y * Z);
        B.x = (int)((float)T.getBottomLeft().x * Z);
        B.y = (int)((float)T.getBottomLeft().y * Z);
        A.x = (int)((float)T.getBottomRight().x * Z);
        A.y = (int)((float)T.getBottomRight().y * Z);
        V = true;
    }

    public void setImage(Image image)
    {
        c();
        U = image;
        if (image == null)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        Z = U.getImageBitmapScaling().floatValue();
        U.getImageRepresentation();
        if (!U.getImageRepresentation().equals(com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BITMAP) && !U.getImageRepresentation().equals(com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH)) goto _L2; else goto _L1
_L1:
        if (U.getImageBitmapScaling().floatValue() == 1.0F)
        {
            Log.e("ImgReviewEditCntrl", (new StringBuilder()).append("[Bitmap]bm.getHeight() = ").append(U.getImageBitmapHeight()).toString());
            Log.e("ImgReviewEditCntrl", (new StringBuilder()).append("[Bitmap]bm.getWidth() = ").append(U.getImageBitmapWidth()).toString());
            Z = 0.5F;
            float f1 = U.getImageBitmapScaling().floatValue();
            U.getImageBitmapScaling();
            U.setImageBitmapScaling(Z);
            if (android.os.Build.VERSION.SDK_INT < 11 && H != null)
            {
                H.recycle();
                H = null;
            }
            H = U.createScaledBitmap();
            U.setImageBitmapScaling(f1);
        }
        if (H != null)
        {
            a();
            invalidate();
        }
_L4:
        return;
_L2:
        if (!U.getImageRepresentation().equals(com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE)) goto _L4; else goto _L3
_L3:
        float f2;
        try
        {
            f2 = U.getImageBitmapScaling().floatValue();
        }
        // Misplaced declaration of an exception variable
        catch (Image image)
        {
            throw new KmcException(ErrorInfo.KMC_UI_SCALING_FACTOR);
        }
        if (f2 != 1.0F)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        Z = 0.5F;
        U.setImageBitmapScaling(Z);
        if (U.getImageFileRep() != com.kofax.kmc.ken.engines.data.Image.ImageFileRep.FILE_STORED)
        {
            break MISSING_BLOCK_LABEL_435;
        }
        image = U.getImageDPI();
        U.imageReadFromFile(com.kofax.kmc.ken.engines.data.Image.FileIOEngine.FILE_ENG_ANDROID, false);
        if (image == null)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        U.setImageDPI(image.intValue());
_L5:
        if (H != null)
        {
            H.recycle();
            H = null;
        }
        H = a(U);
        if (H != null)
        {
            U.imageClearBitmap();
            Log.i("ImgReviewEditCntrl", "--------------image.imageClearBitmap()");
        }
        if (H != null)
        {
            a();
            invalidate();
        }
        U.setImageBitmapScaling(f2);
        return;
        U.imageReadFromFileBuffer();
          goto _L5
        throw new KmcException(ErrorInfo.KMC_UI_IMAGE_NULL);
    }

    public void setImageFilePath(String s1)
    {
        n = s1;
    }

    public void showCropRectangle(boolean flag)
    {
        E = flag;
    }

    private class MyScaleGestureListener extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
    {

        final ImgReviewEditCntrl a;

        public boolean onScale(ScaleGestureDetector scalegesturedetector)
        {
            float f1 = a.scaleGestureDetector.getScaleFactor();
            ImgReviewEditCntrl.a(a, f1 * ImgReviewEditCntrl.a(a));
            Log.i("Zoom", (new StringBuilder()).append("focus.x= ").append(scalegesturedetector.getFocusX()).append(" focus.y = ").append(scalegesturedetector.getFocusY()).toString());
            scalegesturedetector = new Point((int)scalegesturedetector.getFocusX(), (int)scalegesturedetector.getFocusY());
            if (ImgReviewEditCntrl.b(a) != ImgReviewEditCntrl.c(a))
            {
                ImgReviewEditCntrl.a(a, true);
            }
            if (ImgReviewEditCntrl.d(a))
            {
                ImgReviewEditCntrl.a(a, false);
                ImgReviewEditCntrl.a(a, ImgReviewEditCntrl.b(a, scalegesturedetector));
            }
            if (ImgReviewEditCntrl.a(a) < 1.0F)
            {
                ImgReviewEditCntrl.a(a, 1.0F);
            }
            if (ImgReviewEditCntrl.a(a) > 3F)
            {
                ImgReviewEditCntrl.a(a, 3F);
            }
            if (ImgReviewEditCntrl.a(a) == 1.0F)
            {
                ImgReviewEditCntrl.e(a).x = 0;
                ImgReviewEditCntrl.e(a).y = 0;
                ImgReviewEditCntrl.a(a, 0);
                Log.i("State", (new StringBuilder()).append("state = ").append(ImgReviewEditCntrl.f(a)).toString());
                ImgReviewEditCntrl.b(a, false);
            }
            ImgReviewEditCntrl.b(a, ImgReviewEditCntrl.a(a));
            Point point = ImgReviewEditCntrl.c(a, ImgReviewEditCntrl.g(a));
            scalegesturedetector = new Point(((Point) (scalegesturedetector)).x - point.x, ((Point) (scalegesturedetector)).y - point.y);
            point = ImgReviewEditCntrl.e(a);
            point.x = point.x + ((Point) (scalegesturedetector)).x;
            point = ImgReviewEditCntrl.e(a);
            point.y = point.y + ((Point) (scalegesturedetector)).y;
            ImgReviewEditCntrl.b(a, ImgReviewEditCntrl.c(a));
            Log.i("State", (new StringBuilder()).append("prevnumtouches = ").append(ImgReviewEditCntrl.b(a)).append(" numtouches = ").append(ImgReviewEditCntrl.c(a)).toString());
            a.invalidate();
            return true;
        }

        public MyScaleGestureListener()
        {
            a = ImgReviewEditCntrl.this;
            super();
        }
    }


    private class Line_Style_Solid extends Enum
    {

        public static final Line_Style_Solid LINE_STYLE_DOTTED;
        public static final Line_Style_Solid LINE_STYLE_SOLID;
        private static final Line_Style_Solid a[];

        public static Line_Style_Solid valueOf(String s1)
        {
            return (Line_Style_Solid)Enum.valueOf(com/kofax/kmc/kui/uicontrols/ImgReviewEditCntrl$Line_Style_Solid, s1);
        }

        public static Line_Style_Solid[] values()
        {
            return (Line_Style_Solid[])a.clone();
        }

        static 
        {
            LINE_STYLE_SOLID = new Line_Style_Solid("LINE_STYLE_SOLID", 0);
            LINE_STYLE_DOTTED = new Line_Style_Solid("LINE_STYLE_DOTTED", 1);
            a = (new Line_Style_Solid[] {
                LINE_STYLE_SOLID, LINE_STYLE_DOTTED
            });
        }

        private Line_Style_Solid(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
