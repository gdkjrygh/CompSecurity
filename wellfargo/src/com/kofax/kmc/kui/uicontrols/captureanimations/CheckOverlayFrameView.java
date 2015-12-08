// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.kofax.kmc.ken.engines.data.CheckDetectionResult;
import com.kofax.kmc.ken.engines.data.HorizontalGuidance;
import com.kofax.kmc.ken.engines.data.VerticalGuidance;
import com.kofax.kmc.ken.engines.data.ZoomGuidance;
import com.kofax.kmc.kut.utilities.RectUtil;

public class CheckOverlayFrameView extends View
{

    private static final a a = new a();
    private static final double b = 6D;
    private static final double c = 2.75D;
    private static final double d = 2.1818181818181817D;
    private static final double e = 0.20000000000000001D;
    private static final double f = 0.12D;
    private static final double g = 0.3125D;
    private static final double h = 2.7999999999999998D;
    private static final int i = 5;
    private static final int j = 5;
    private static final int k = 75;
    private static final int l = 12;
    private final Rect A = new Rect();
    private final Rect B = new Rect();
    private final Rect C = new Rect();
    private final Rect D = new Rect();
    private final Rect E = new Rect();
    private CheckDetectionResult F;
    private boolean G;
    private final Handler H = new Handler(Looper.getMainLooper());
    private int I;
    private int J;
    private boolean K;
    private int L;
    private double M;
    private Bitmap N;
    private Bitmap O;
    private Bitmap P;
    private Bitmap Q[];
    private Bitmap R[];
    private Paint S;
    private Paint T;
    private Paint U;
    private Paint V;
    private Paint W;
    private Context Z;
    private final Object m = new Object();
    private int n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final Rect t = new Rect();
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private final Rect z = new Rect();

    public CheckOverlayFrameView(Context context)
    {
        super(context);
        o = false;
        u = 6;
        G = true;
        L = 5;
        M = 2.1818181818181817D;
        S = new Paint();
        T = new Paint(1);
        U = new Paint();
        V = new Paint(1);
        W = new Paint(1);
        Z = context;
        S.setStyle(android.graphics.Paint.Style.FILL);
        S.setColor(Color.argb(210, 21, 21, 21));
        T.setStyle(android.graphics.Paint.Style.STROKE);
        T.setColor(0xff00ff00);
        T.setStrokeWidth(12F);
        V.setStyle(android.graphics.Paint.Style.STROKE);
        V.setColor(0xff00ff00);
        V.setStrokeWidth(4F);
        W.setStyle(android.graphics.Paint.Style.FILL);
        W.setColor(0xff00ff00);
        W.setAlpha(60);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setWillNotDraw(false);
        H.post(new _cls1());
    }

    private int a()
    {
        return ((WindowManager)Z.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    static Handler a(CheckOverlayFrameView checkoverlayframeview)
    {
        return checkoverlayframeview.H;
    }

    private void a(int i1)
    {
        int j1;
        int l1;
        int i2;
label0:
        {
            double d1 = ((double)t.width() / (double)i1) * (double)getResources().getDisplayMetrics().densityDpi;
            int k1 = (int)Math.round(0.12D * d1);
            i1 = (int)Math.round(0.3125D * d1);
            j1 = (int)Math.round(0.20000000000000001D * d1);
            int j3 = (int)Math.round(2.7999999999999998D * d1);
            int j2 = s - k1;
            int k2 = j1 + p;
            int l2 = j2 - i1;
            int i3 = k2 + j3;
            int k3 = a();
            i1 = 0;
            String s1 = Build.MANUFACTURER;
            String s2 = Build.MODEL;
            k1 = i1;
            if (s1.equals("samsung"))
            {
                k1 = i1;
                if (s2.equals("GT-P7510"))
                {
                    k1 = 1;
                }
            }
            if (k1 == 0 || k3 != 2)
            {
                i2 = i3;
                l1 = k2;
                j1 = l2;
                i1 = j2;
                if (k1 != 0)
                {
                    break label0;
                }
                i2 = i3;
                l1 = k2;
                j1 = l2;
                i1 = j2;
                if (k3 != 3)
                {
                    break label0;
                }
            }
            j1 = q + (int)Math.round(0.12D * d1);
            i1 = j1 + (int)Math.round(0.3125D * d1);
            i2 = r - (int)Math.round(d1 * 0.20000000000000001D);
            l1 = i2 - j3;
        }
        D.set(l1, j1, i2, i1);
    }

    private void a(Canvas canvas)
    {
        if (G)
        {
            canvas.drawRect(D, W);
        }
    }

    private void a(Canvas canvas, CheckDetectionResult checkdetectionresult)
    {
        if (checkdetectionresult == null && G)
        {
            canvas.drawRect(D, V);
        }
    }

    private void b()
    {
        if (I <= 0 || J <= 0)
        {
            return;
        } else
        {
            c();
            d();
            e();
            a(n);
            (new Handler(Looper.getMainLooper())).post(new _cls2());
            return;
        }
    }

    private void b(Canvas canvas)
    {
        canvas.drawRect(A, S);
        canvas.drawRect(z, S);
        canvas.drawRect(C, S);
        canvas.drawRect(B, S);
    }

    private void b(Canvas canvas, CheckDetectionResult checkdetectionresult)
    {
        boolean flag = false;
        int i1 = 0;
        if (checkdetectionresult != null)
        {
            Object obj = checkdetectionresult.getZoomGuidance();
            if (obj == ZoomGuidance.ZOOM_IN)
            {
                checkdetectionresult = Q;
                if (!G)
                {
                    i1 = 1;
                }
                canvas.drawBitmap(checkdetectionresult[i1], null, E, null);
                return;
            }
            if (obj == ZoomGuidance.ZOOM_OUT)
            {
                checkdetectionresult = R;
                int j1;
                if (G)
                {
                    j1 = ((flag) ? 1 : 0);
                } else
                {
                    j1 = 1;
                }
                canvas.drawBitmap(checkdetectionresult[j1], null, E, null);
                return;
            }
            obj = checkdetectionresult.getHorizontalMovementGuidance();
            if (obj == HorizontalGuidance.HORIZONTAL_MOVE_RIGHT && G || obj == HorizontalGuidance.HORIZONTAL_MOVE_OK)
            {
                canvas.drawLine(v, w, v, y, T);
            }
            if (obj == HorizontalGuidance.HORIZONTAL_MOVE_LEFT && G || obj == HorizontalGuidance.HORIZONTAL_MOVE_OK)
            {
                canvas.drawLine(x, w, x, y, T);
            }
            checkdetectionresult = checkdetectionresult.getVerticalMovementGuidance();
            if (checkdetectionresult == VerticalGuidance.VERTICAL_MOVE_DOWN && G || checkdetectionresult == VerticalGuidance.VERTICAL_MOVE_OK)
            {
                canvas.drawLine(v, w, x, w, T);
            }
            if (checkdetectionresult == VerticalGuidance.VERTICAL_MOVE_UP && G || checkdetectionresult == VerticalGuidance.VERTICAL_MOVE_OK)
            {
                canvas.drawLine(v, y, x, y, T);
                return;
            }
        }
    }

    private void c()
    {
        double d2 = M;
        double d1 = d2;
        if (d2 < 1.0D)
        {
            d1 = 1.0D / d2;
        }
        Rect rect = new Rect(0, 0, I, J);
        Point point = new Point((int)Math.round((double)I / 2D), (int)Math.round((double)J / 2D));
        int i1 = L;
        RectUtil.fit(rect, t, point, i1, d1);
        p = t.left;
        q = t.top;
        r = t.right;
        s = t.bottom;
        v = p - 5;
        w = q - 5;
        x = r + 5;
        y = s + 5;
    }

    private void c(Canvas canvas)
    {
        canvas.drawLine(v, w - u, v, w + 75, T);
        canvas.drawLine(v - u, w, v + 75, w, T);
        canvas.drawLine(x, w - u, x, w + 75, T);
        canvas.drawLine(x - 75, w, x + u, w, T);
        canvas.drawLine(v, y - 75, v, y + u, T);
        canvas.drawLine(v - u, y, v + 75, y, T);
        canvas.drawLine(x, y - 75, x, y + u, T);
        canvas.drawLine(x - 75, y, x + u, y, T);
    }

    private void d()
    {
        A.set(0, q, p, s);
        z.set(0, 0, I, q);
        C.set(r, q, I, s);
        B.set(0, s, I, J);
    }

    private void e()
    {
        int l1 = p;
        int i2 = (int)Math.round((double)t.width() / 2D);
        int j1 = q;
        int k1 = (int)Math.round((double)t.height() / 2D);
        int i1 = (I * 15) / 100;
        l1 = (l1 + i2) - (int)Math.round((double)i1 / 2D);
        j1 = (j1 + k1) - (int)Math.round((double)i1 / 2D);
        E.set(l1, j1, l1 + i1, i1 + j1);
    }

    public Bitmap getCheckOuterOverlay()
    {
        return P;
    }

    public Bitmap getCheckOverlayImage()
    {
        return N;
    }

    public int getCheckOverlayImageHeight()
    {
        return t.height();
    }

    public int getCheckOverlayImageWidth()
    {
        return t.width();
    }

    public Bitmap getCheckSampleImage()
    {
        return O;
    }

    public int getPaddingPercent()
    {
        return L;
    }

    public Bitmap[] getZoomInImages()
    {
        return Q;
    }

    public Bitmap[] getZoomOutImages()
    {
        return R;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        F = null;
    }

    protected void onDraw(Canvas canvas)
    {
        a a1 = null;
        Object obj = m;
        obj;
        JVM INSTR monitorenter ;
        canvas.save();
        if (K)
        {
            canvas.translate(J, 0.0F);
            canvas.rotate(90F);
        }
        boolean flag;
        if ((System.currentTimeMillis() / 1000L) % 2L == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        G = flag;
        b(canvas);
        c(canvas);
        if (!o || O == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        canvas.drawBitmap(O, null, t, U);
        a(canvas);
        if (G)
        {
            a1 = a;
        }
        b(canvas, a1);
_L2:
        canvas.restore();
        obj;
        JVM INSTR monitorexit ;
        return;
        b(canvas, F);
        a(n);
        a(canvas, F);
        if (true) goto _L2; else goto _L1
_L1:
        canvas;
        obj;
        JVM INSTR monitorexit ;
        throw canvas;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        I = i1;
        J = j1;
        n = getResources().getDisplayMetrics().widthPixels;
        if (J > I)
        {
            i1 = I;
            I = J;
            J = i1;
            n = getResources().getDisplayMetrics().heightPixels;
            K = true;
        } else
        {
            K = false;
        }
        b();
    }

    public void setCheckOuterOverlay(Bitmap bitmap)
    {
        P = bitmap;
    }

    public void setCheckOverlayImage(Bitmap bitmap)
    {
        N = bitmap;
    }

    public void setCheckSampleImage(Bitmap bitmap)
    {
        O = bitmap;
    }

    public void setGuidance(CheckDetectionResult checkdetectionresult)
    {
        synchronized (m)
        {
            F = checkdetectionresult;
        }
        return;
        checkdetectionresult;
        obj;
        JVM INSTR monitorexit ;
        throw checkdetectionresult;
    }

    public void setInstructionOverlay(boolean flag)
    {
        o = flag;
    }

    public void setOuterOverlayFrameColor(int i1)
    {
        S.setColor(i1);
    }

    public void setOverlayAspectRatio(double d1)
    {
        double d2 = d1;
        if (d1 < 1.0D)
        {
            d2 = 1.0D / d1;
        }
        M = d2;
        b();
    }

    public void setPaddingPercent(int i1)
    {
        L = i1;
        b();
    }

    public void setZoomInImages(Bitmap abitmap[])
    {
        Q = abitmap;
    }

    public void setZoomOutImages(Bitmap abitmap[])
    {
        R = abitmap;
    }


    private class _cls1
        implements Runnable
    {

        final CheckOverlayFrameView a;

        public void run()
        {
            a.invalidate();
            CheckOverlayFrameView.a(a).post(this);
        }

        _cls1()
        {
            a = CheckOverlayFrameView.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final CheckOverlayFrameView a;

        public void run()
        {
            a.invalidate();
        }

        _cls2()
        {
            a = CheckOverlayFrameView.this;
            super();
        }
    }


    private class a extends CheckDetectionResult
    {

        public HorizontalGuidance getHorizontalMovementGuidance()
        {
            return HorizontalGuidance.HORIZONTAL_MOVE_OK;
        }

        public TurnGuidance getTurnGuidance()
        {
            return TurnGuidance.TURN_OK;
        }

        public VerticalGuidance getVerticalMovementGuidance()
        {
            return VerticalGuidance.VERTICAL_MOVE_OK;
        }

        public ZoomGuidance getZoomGuidance()
        {
            return ZoomGuidance.ZOOM_OK;
        }

        protected a()
        {
            super(null, null, null, CheckSide.FRONT);
        }
    }

}
